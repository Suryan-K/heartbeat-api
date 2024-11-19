
package com.tanjer.heartbeat.wsgenfile.test.consumption.consumeservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.consumption.consumeservice package. 
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

    private final static QName _ConsumeServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeService", "ConsumeServiceRequest");
    private final static QName _ConsumeServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeService", "ConsumeServiceRequestType");
    private final static QName _ConsumeServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeService", "ConsumeServiceResponse");
    private final static QName _ConsumeServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeService", "ConsumeServiceResponseType");
    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeService", "PRODUCT");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/ConsumeService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.consumption.consumeservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConsumeServiceResponse }
     * 
     */
    public ConsumeServiceResponse createConsumeServiceResponse() {
        return new ConsumeServiceResponse();
    }

    /**
     * Create an instance of {@link ConsumeServiceRequest }
     * 
     */
    public ConsumeServiceRequest createConsumeServiceRequest() {
        return new ConsumeServiceRequest();
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
     * Create an instance of {@link ConsumeServiceResponse.PRODUCTLIST }
     * 
     */
    public ConsumeServiceResponse.PRODUCTLIST createConsumeServiceResponsePRODUCTLIST() {
        return new ConsumeServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link ConsumeServiceRequest.PRODUCTLIST }
     * 
     */
    public ConsumeServiceRequest.PRODUCTLIST createConsumeServiceRequestPRODUCTLIST() {
        return new ConsumeServiceRequest.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeService", name = "ConsumeServiceRequest")
    public JAXBElement<ConsumeServiceRequest> createConsumeServiceRequest(ConsumeServiceRequest value) {
        return new JAXBElement<ConsumeServiceRequest>(_ConsumeServiceRequest_QNAME, ConsumeServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeService", name = "ConsumeServiceRequestType")
    public JAXBElement<ConsumeServiceRequest> createConsumeServiceRequestType(ConsumeServiceRequest value) {
        return new JAXBElement<ConsumeServiceRequest>(_ConsumeServiceRequestType_QNAME, ConsumeServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeService", name = "ConsumeServiceResponse")
    public JAXBElement<ConsumeServiceResponse> createConsumeServiceResponse(ConsumeServiceResponse value) {
        return new JAXBElement<ConsumeServiceResponse>(_ConsumeServiceResponse_QNAME, ConsumeServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConsumeServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConsumeServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeService", name = "ConsumeServiceResponseType")
    public JAXBElement<ConsumeServiceResponse> createConsumeServiceResponseType(ConsumeServiceResponse value) {
        return new JAXBElement<ConsumeServiceResponse>(_ConsumeServiceResponseType_QNAME, ConsumeServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeService", name = "PRODUCT")
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
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/ConsumeService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
