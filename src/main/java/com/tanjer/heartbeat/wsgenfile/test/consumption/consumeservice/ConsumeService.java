package com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice;

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
 * 2024-11-18T12:47:46.660+05:30
 * Generated source version: 3.5.9
 *
 */
@WebService(targetNamespace = "http://dtts.sfda.gov.sa/ConsumeService", name = "ConsumeService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface ConsumeService {

    @WebMethod
    @Action(input = "https://tandttest.sfda.gov.sa/ws/ConsumeService/ConsumeService/notifyConsumeRequest", output = "https://tandttest.sfda.gov.sa/ws/ConsumeService/ConsumeService/notifyConsumeResponse", fault = {@FaultAction(className = ServiceError.class, value = "https://tandttest.sfda.gov.sa/ws/ConsumeService/ConsumeService/notifyConsume/Fault/ServiceError")})
    @WebResult(name = "ConsumeServiceResponse", targetNamespace = "http://dtts.sfda.gov.sa/ConsumeService", partName = "ConsumeServiceResponse")
    public ConsumeServiceResponse notifyConsume(

        @WebParam(partName = "ConsumeServiceRequest", name = "ConsumeServiceRequest", targetNamespace = "http://dtts.sfda.gov.sa/ConsumeService")
        ConsumeServiceRequest consumeServiceRequest
    ) throws ServiceError;
}
