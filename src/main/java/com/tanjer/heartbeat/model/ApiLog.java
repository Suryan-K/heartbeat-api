package com.tanjer.heartbeat.model;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiLog {
    
    private Long id;
    private String apiName;
    private String requestJson;
    private LocalDateTime requestTime;
    private String status;
    private String responseJson;
    private int httpStatus;
    private LocalDateTime responseTime;
}
