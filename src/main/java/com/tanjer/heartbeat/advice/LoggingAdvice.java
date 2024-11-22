package com.tanjer.heartbeat.advice;

import java.time.LocalDateTime;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tanjer.heartbeat.mapper.ApiLogMapper;
import com.tanjer.heartbeat.model.ApiLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggingAdvice {

    Logger log = LoggerFactory.getLogger(LoggingAdvice.class);
    
    @Autowired
    private ApiLogMapper apiLogMapper;

    // Define a pointcut expression to match all methods in the service package
    @Pointcut("execution(* com.tanjer.heartbeat.controller.*.*(..))")
    public void serviceMethods() {
        // Empty method, just to hold the pointcut expression
    }

    // @Around advice applies to the pointcut
    @Around("serviceMethods()")  
    public Object applicationLogger(ProceedingJoinPoint pjp) throws Throwable {
    	ObjectMapper mapper = new ObjectMapper();
    	log.info("service method called");

        // Extract method details
        String methodName = pjp.getSignature().getName();
        String className = pjp.getTarget().getClass().toString();
        Object[] args = pjp.getArgs();
        String requestJson = mapper.writeValueAsString(args);

        // Proceed with method execution
        Object result = null;

        try {
            // Proceed with method execution
            result = pjp.proceed();
            log.info("Service method after calling proceed");

            // Log the result only if it is not null
            if (result != null) {
                log.info("Method returned: " + mapper.writeValueAsString(result));
            } else {
                log.info("Method returned null");
            }

            // Capture HTTP status after method execution
            int httpStatus = getHttpStatus(result);

            // Create ApiLog and populate its fields
            ApiLog apiLog = new ApiLog();
            apiLog.setApiName(className + " : " + methodName);
            apiLog.setRequestJson(requestJson);
            apiLog.setResponseJson(result != null ? mapper.writeValueAsString(result) : null);
            apiLog.setHttpStatus(httpStatus);
            apiLog.setRequestTime(LocalDateTime.now());
            apiLog.setResponseTime(LocalDateTime.now());

            // Save the log entry (assuming you have a service or mapper to do this)
            apiLogMapper.insertApiLog(apiLog);

        } catch (Throwable ex) {
            // Log exception if an error occurs during method execution
            log.error("Exception occurred in method: " + className + " : " + methodName, ex);

            // Optionally, capture the exception details in the log
            ApiLog apiLog = new ApiLog();
            apiLog.setApiName(className + " : " + methodName);
            apiLog.setRequestJson(requestJson);
            apiLog.setResponseJson("Exception: " + ex.getMessage());
            apiLog.setHttpStatus(500);  // Indicating failure
            apiLog.setRequestTime(LocalDateTime.now());
            apiLog.setResponseTime(LocalDateTime.now());

            // Save the error log to the database
            apiLogMapper.insertApiLog(apiLog);

            // Rethrow the exception after logging it
            throw ex;
        }

        return result;
    }
    
    private int getHttpStatus(Object result) {
        // If result is a ResponseEntity, get status from it
        if (result instanceof ResponseEntity) {
            return ((ResponseEntity<?>) result).getStatusCodeValue();
        }

        // If result is not a ResponseEntity, try other methods (e.g., HttpServletResponse)
        // Add more logic here based on how HTTP status is returned
        return 200;  // Default to 200 OK if status can't be determined
    }
}
