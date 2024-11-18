
package com.tanjer.heartbeat.wsgenfile.pharmacy.acceptDispatch;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.pharmacy.acceptDispatch package. 
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

    private final static QName _AcceptDispatchServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptDispatchService", "AcceptDispatchServiceRequest");
    private final static QName _AcceptDispatchServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptDispatchService", "AcceptDispatchServiceRequestType");
    private final static QName _AcceptDispatchServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptDispatchService", "AcceptDispatchServiceResponse");
    private final static QName _AcceptDispatchServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptDispatchService", "AcceptDispatchServiceResponseType");
    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptDispatchService", "PRODUCT");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/AcceptDispatchService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.pharmacy.acceptDispatch
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AcceptDispatchServiceResponse }
     * 
     */
    public AcceptDispatchServiceResponse createAcceptDispatchServiceResponse() {
        return new AcceptDispatchServiceResponse();
    }

    /**
     * Create an instance of {@link AcceptDispatchServiceRequest }
     * 
     */
    public AcceptDispatchServiceRequest createAcceptDispatchServiceRequest() {
        return new AcceptDispatchServiceRequest();
    }

    /**
     * Create an instance of {@link ProductResponse }
     * 
     */
    public ProductResponse createProductResponse() {
        return new ProductResponse();
    }

    /**
     * Create an instance of {@link FaultBean }
     * 
     */
    public FaultBean createFaultBean() {
        return new FaultBean();
    }

    /**
     * Create an instance of {@link AcceptDispatchServiceResponse.PRODUCTLIST }
     * 
     */
    public AcceptDispatchServiceResponse.PRODUCTLIST createAcceptDispatchServiceResponsePRODUCTLIST() {
        return new AcceptDispatchServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptDispatchService", name = "AcceptDispatchServiceRequest")
    public JAXBElement<AcceptDispatchServiceRequest> createAcceptDispatchServiceRequest(AcceptDispatchServiceRequest value) {
        return new JAXBElement<AcceptDispatchServiceRequest>(_AcceptDispatchServiceRequest_QNAME, AcceptDispatchServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptDispatchService", name = "AcceptDispatchServiceRequestType")
    public JAXBElement<AcceptDispatchServiceRequest> createAcceptDispatchServiceRequestType(AcceptDispatchServiceRequest value) {
        return new JAXBElement<AcceptDispatchServiceRequest>(_AcceptDispatchServiceRequestType_QNAME, AcceptDispatchServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptDispatchService", name = "AcceptDispatchServiceResponse")
    public JAXBElement<AcceptDispatchServiceResponse> createAcceptDispatchServiceResponse(AcceptDispatchServiceResponse value) {
        return new JAXBElement<AcceptDispatchServiceResponse>(_AcceptDispatchServiceResponse_QNAME, AcceptDispatchServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AcceptDispatchServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptDispatchService", name = "AcceptDispatchServiceResponseType")
    public JAXBElement<AcceptDispatchServiceResponse> createAcceptDispatchServiceResponseType(AcceptDispatchServiceResponse value) {
        return new JAXBElement<AcceptDispatchServiceResponse>(_AcceptDispatchServiceResponseType_QNAME, AcceptDispatchServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ProductResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptDispatchService", name = "PRODUCT")
    public JAXBElement<ProductResponse> createPRODUCT(ProductResponse value) {
        return new JAXBElement<ProductResponse>(_PRODUCT_QNAME, ProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/AcceptDispatchService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
