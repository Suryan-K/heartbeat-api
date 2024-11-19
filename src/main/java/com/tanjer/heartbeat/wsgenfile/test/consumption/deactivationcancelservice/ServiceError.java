
package com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.5.9
 * 2024-11-19T12:25:51.956+05:30
 * Generated source version: 3.5.9
 */

@WebFault(name = "ServiceError", targetNamespace = "http://dtts.sfda.gov.sa/DeactivationCancelService")
public class ServiceError extends Exception {

    private com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.FaultBean faultInfo;

    public ServiceError() {
        super();
    }

    public ServiceError(String message) {
        super(message);
    }

    public ServiceError(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public ServiceError(String message, com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.FaultBean serviceError) {
        super(message);
        this.faultInfo = serviceError;
    }

    public ServiceError(String message, com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.FaultBean serviceError, java.lang.Throwable cause) {
        super(message, cause);
        this.faultInfo = serviceError;
    }

    public com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationcancelservice.FaultBean getFaultInfo() {
        return this.faultInfo;
    }
}
