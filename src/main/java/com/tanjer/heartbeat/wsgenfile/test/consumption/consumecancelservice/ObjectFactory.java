
package com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice package. 
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

    private final static QName _ConsumeCancelServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeCancelService", "ConsumeCancelServiceRequest");
    private final static QName _ConsumeCancelServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeCancelService", "ConsumeCancelServiceRequestType");
    private final static QName _ConsumeCancelServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeCancelService", "ConsumeCancelServiceResponse");
    private final static QName _ConsumeCancelServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeCancelService", "ConsumeCancelServiceResponseType");
    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeCancelService", "PRODUCT");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeCancelService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.test.consumption.consumecancelservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumeCancelServiceResponse }
     * 
     */
    public ConsumeCancelServiceResponse createConsumeCancelServiceResponse() {
        return new ConsumeCancelServiceResponse();
    }

    /**
     * Create an instance of {@link ConsumeCancelServiceRequest }
     * 
     */
    public ConsumeCancelServiceRequest createConsumeCancelServiceRequest() {
        return new ConsumeCancelServiceRequest();
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
     * Create an instance of {@link ConsumeCancelServiceResponse.PRODUCTLIST }
     * 
     */
    public ConsumeCancelServiceResponse.PRODUCTLIST createConsumeCancelServiceResponsePRODUCTLIST() {
        return new ConsumeCancelServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link ConsumeCancelServiceRequest.PRODUCTLIST }
     * 
     */
    public ConsumeCancelServiceRequest.PRODUCTLIST createConsumeCancelServiceRequestPRODUCTLIST() {
        return new ConsumeCancelServiceRequest.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", name = "ConsumeCancelServiceRequest")
    public JAXBElement<ConsumeCancelServiceRequest> createConsumeCancelServiceRequest(ConsumeCancelServiceRequest value) {
        return new JAXBElement<ConsumeCancelServiceRequest>(_ConsumeCancelServiceRequest_QNAME, ConsumeCancelServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", name = "ConsumeCancelServiceRequestType")
    public JAXBElement<ConsumeCancelServiceRequest> createConsumeCancelServiceRequestType(ConsumeCancelServiceRequest value) {
        return new JAXBElement<ConsumeCancelServiceRequest>(_ConsumeCancelServiceRequestType_QNAME, ConsumeCancelServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", name = "ConsumeCancelServiceResponse")
    public JAXBElement<ConsumeCancelServiceResponse> createConsumeCancelServiceResponse(ConsumeCancelServiceResponse value) {
        return new JAXBElement<ConsumeCancelServiceResponse>(_ConsumeCancelServiceResponse_QNAME, ConsumeCancelServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeCancelServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", name = "ConsumeCancelServiceResponseType")
    public JAXBElement<ConsumeCancelServiceResponse> createConsumeCancelServiceResponseType(ConsumeCancelServiceResponse value) {
        return new JAXBElement<ConsumeCancelServiceResponse>(_ConsumeCancelServiceResponseType_QNAME, ConsumeCancelServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", name = "PRODUCT")
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
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeCancelService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
