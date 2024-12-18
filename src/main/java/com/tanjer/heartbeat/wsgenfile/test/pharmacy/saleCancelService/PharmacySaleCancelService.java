package com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService;

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
 * 2024-11-19T11:21:08.850+05:30
 * Generated source version: 3.5.9
 *
 */
@WebService(targetNamespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", name = "PharmacySaleCancelService")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface PharmacySaleCancelService {

    @WebMethod
    @Action(input = "https://tandttest.sfda.gov.sa/ws/PharmacySaleCancelService/PharmacySaleCancelService/notifyPharmacySaleCancelRequest", output = "https://tandttest.sfda.gov.sa/ws/PharmacySaleCancelService/PharmacySaleCancelService/notifyPharmacySaleCancelResponse", fault = {@FaultAction(className = ServiceError.class, value = "https://tandttest.sfda.gov.sa/ws/PharmacySaleCancelService/PharmacySaleCancelService/notifyPharmacySaleCancel/Fault/ServiceError")})
    @WebResult(name = "PharmacySaleCancelServiceResponse", targetNamespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", partName = "PharmacySaleCancelServiceResponse")
    public PharmacySaleCancelServiceResponse notifyPharmacySaleCancel(

        @WebParam(partName = "PharmacySaleCancelServiceRequest", name = "PharmacySaleCancelServiceRequest", targetNamespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService")
        PharmacySaleCancelServiceRequest pharmacySaleCancelServiceRequest
    ) throws ServiceError;
}
