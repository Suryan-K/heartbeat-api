
package com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationService package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DeactivationServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationService", "DeactivationServiceRequest");
    private final static QName _DeactivationServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationService", "DeactivationServiceRequestType");
    private final static QName _DeactivationServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationService", "DeactivationServiceResponse");
    private final static QName _DeactivationServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationService", "DeactivationServiceResponseType");
    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationService", "PRODUCT");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeactivationServiceResponse }
     * 
     */
    public DeactivationServiceResponse createDeactivationServiceResponse() {
        return new DeactivationServiceResponse();
    }

    /**
     * Create an instance of {@link DeactivationServiceRequest }
     * 
     */
    public DeactivationServiceRequest createDeactivationServiceRequest() {
        return new DeactivationServiceRequest();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link Product }
     * 
     */
    public Product createProduct() {
        return new Product();
    }

    /**
     * Create an instance of {@link ProductResponse }
     * 
     */
    public ProductResponse createProductResponse() {
        return new ProductResponse();
    }

    /**
     * Create an instance of {@link DeactivationServiceResponse.PRODUCTLIST }
     * 
     */
    public DeactivationServiceResponse.PRODUCTLIST createDeactivationServiceResponsePRODUCTLIST() {
        return new DeactivationServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link DeactivationServiceRequest.PRODUCTLIST }
     * 
     */
    public DeactivationServiceRequest.PRODUCTLIST createDeactivationServiceRequestPRODUCTLIST() {
        return new DeactivationServiceRequest.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationService", name = "DeactivationServiceRequest")
    public JAXBElement<DeactivationServiceRequest> createDeactivationServiceRequest(DeactivationServiceRequest value) {
        return new JAXBElement<DeactivationServiceRequest>(_DeactivationServiceRequest_QNAME, DeactivationServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationService", name = "DeactivationServiceRequestType")
    public JAXBElement<DeactivationServiceRequest> createDeactivationServiceRequestType(DeactivationServiceRequest value) {
        return new JAXBElement<DeactivationServiceRequest>(_DeactivationServiceRequestType_QNAME, DeactivationServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationService", name = "DeactivationServiceResponse")
    public JAXBElement<DeactivationServiceResponse> createDeactivationServiceResponse(DeactivationServiceResponse value) {
        return new JAXBElement<DeactivationServiceResponse>(_DeactivationServiceResponse_QNAME, DeactivationServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationService", name = "DeactivationServiceResponseType")
    public JAXBElement<DeactivationServiceResponse> createDeactivationServiceResponseType(DeactivationServiceResponse value) {
        return new JAXBElement<DeactivationServiceResponse>(_DeactivationServiceResponseType_QNAME, DeactivationServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationService", name = "PRODUCT")
    public JAXBElement<Object> createPRODUCT(Object value) {
        return new JAXBElement<Object>(_PRODUCT_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
