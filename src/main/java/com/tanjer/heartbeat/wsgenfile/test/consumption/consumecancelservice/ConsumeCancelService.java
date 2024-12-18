package com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;

/**
 * This class was generated by Apache CXF 3.5.9
 * 2024-11-19T14:39:12.713+05:30
 * Generated source version: 3.5.9
 *
 */
@WebService(targetNamespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", name = "ConsumeCancelService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ConsumeCancelService {

    @WebMethod
    @Action(input = "https://tandttest.sfda.gov.sa/ws/ConsumeCancelService/ConsumeCancelService/notifyConsumeCancelRequest", output = "https://tandttest.sfda.gov.sa/ws/ConsumeCancelService/ConsumeCancelService/notifyConsumeCancelResponse", fault = {@FaultAction(className = ServiceError.class, value = "https://tandttest.sfda.gov.sa/ws/ConsumeCancelService/ConsumeCancelService/notifyConsumeCancel/Fault/ServiceError")})
    @WebResult(name = "ConsumeCancelServiceResponse", targetNamespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", partName = "ConsumeCancelServiceResponse")
    public ConsumeCancelServiceResponse notifyConsumeCancel(

        @WebParam(partName = "ConsumeCancelServiceRequest", name = "ConsumeCancelServiceRequest", targetNamespace = "http://dtts.sfda.gov.sa/ConsumeCancelService")
        ConsumeCancelServiceRequest consumeCancelServiceRequest
    ) throws ServiceError;
}
