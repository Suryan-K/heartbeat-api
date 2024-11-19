
package com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.pharmacy.acceptService package. 
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

    private final static QName _AcceptServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptService", "AcceptServiceRequest");
    private final static QName _AcceptServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptService", "AcceptServiceRequestType");
    private final static QName _AcceptServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptService", "AcceptServiceResponse");
    private final static QName _AcceptServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptService", "AcceptServiceResponseType");
    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptService", "PRODUCT");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.pharmacy.acceptService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcceptServiceResponse }
     * 
     */
    public AcceptServiceResponse createAcceptServiceResponse() {
        return new AcceptServiceResponse();
    }

    /**
     * Create an instance of {@link AcceptServiceRequest }
     * 
     */
    public AcceptServiceRequest createAcceptServiceRequest() {
        return new AcceptServiceRequest();
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
     * Create an instance of {@link AcceptServiceResponse.PRODUCTLIST }
     * 
     */
    public AcceptServiceResponse.PRODUCTLIST createAcceptServiceResponsePRODUCTLIST() {
        return new AcceptServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link AcceptServiceRequest.PRODUCTLIST }
     * 
     */
    public AcceptServiceRequest.PRODUCTLIST createAcceptServiceRequestPRODUCTLIST() {
        return new AcceptServiceRequest.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptService", name = "AcceptServiceRequest")
    public JAXBElement<AcceptServiceRequest> createAcceptServiceRequest(AcceptServiceRequest value) {
        return new JAXBElement<AcceptServiceRequest>(_AcceptServiceRequest_QNAME, AcceptServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptService", name = "AcceptServiceRequestType")
    public JAXBElement<AcceptServiceRequest> createAcceptServiceRequestType(AcceptServiceRequest value) {
        return new JAXBElement<AcceptServiceRequest>(_AcceptServiceRequestType_QNAME, AcceptServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptService", name = "AcceptServiceResponse")
    public JAXBElement<AcceptServiceResponse> createAcceptServiceResponse(AcceptServiceResponse value) {
        return new JAXBElement<AcceptServiceResponse>(_AcceptServiceResponse_QNAME, AcceptServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptService", name = "AcceptServiceResponseType")
    public JAXBElement<AcceptServiceResponse> createAcceptServiceResponseType(AcceptServiceResponse value) {
        return new JAXBElement<AcceptServiceResponse>(_AcceptServiceResponseType_QNAME, AcceptServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptService", name = "PRODUCT")
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
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
