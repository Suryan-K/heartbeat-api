
package com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationCancelService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationCancelService package. 
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

    private final static QName _DeactivationCancelServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "DeactivationCancelServiceRequest");
    private final static QName _DeactivationCancelServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "DeactivationCancelServiceRequestType");
    private final static QName _DeactivationCancelServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "DeactivationCancelServiceResponse");
    private final static QName _DeactivationCancelServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "DeactivationCancelServiceResponseType");
    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "PRODUCT");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/DeactivationCancelService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationCancelService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeactivationCancelServiceResponse }
     * 
     */
    public DeactivationCancelServiceResponse createDeactivationCancelServiceResponse() {
        return new DeactivationCancelServiceResponse();
    }

    /**
     * Create an instance of {@link DeactivationCancelServiceRequest }
     * 
     */
    public DeactivationCancelServiceRequest createDeactivationCancelServiceRequest() {
        return new DeactivationCancelServiceRequest();
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
     * Create an instance of {@link DeactivationCancelServiceResponse.PRODUCTLIST }
     * 
     */
    public DeactivationCancelServiceResponse.PRODUCTLIST createDeactivationCancelServiceResponsePRODUCTLIST() {
        return new DeactivationCancelServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link DeactivationCancelServiceRequest.PRODUCTLIST }
     * 
     */
    public DeactivationCancelServiceRequest.PRODUCTLIST createDeactivationCancelServiceRequestPRODUCTLIST() {
        return new DeactivationCancelServiceRequest.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationCancelService", name = "DeactivationCancelServiceRequest")
    public JAXBElement<DeactivationCancelServiceRequest> createDeactivationCancelServiceRequest(DeactivationCancelServiceRequest value) {
        return new JAXBElement<DeactivationCancelServiceRequest>(_DeactivationCancelServiceRequest_QNAME, DeactivationCancelServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationCancelService", name = "DeactivationCancelServiceRequestType")
    public JAXBElement<DeactivationCancelServiceRequest> createDeactivationCancelServiceRequestType(DeactivationCancelServiceRequest value) {
        return new JAXBElement<DeactivationCancelServiceRequest>(_DeactivationCancelServiceRequestType_QNAME, DeactivationCancelServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationCancelService", name = "DeactivationCancelServiceResponse")
    public JAXBElement<DeactivationCancelServiceResponse> createDeactivationCancelServiceResponse(DeactivationCancelServiceResponse value) {
        return new JAXBElement<DeactivationCancelServiceResponse>(_DeactivationCancelServiceResponse_QNAME, DeactivationCancelServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DeactivationCancelServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationCancelService", name = "DeactivationCancelServiceResponseType")
    public JAXBElement<DeactivationCancelServiceResponse> createDeactivationCancelServiceResponseType(DeactivationCancelServiceResponse value) {
        return new JAXBElement<DeactivationCancelServiceResponse>(_DeactivationCancelServiceResponseType_QNAME, DeactivationCancelServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationCancelService", name = "PRODUCT")
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
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/DeactivationCancelService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
