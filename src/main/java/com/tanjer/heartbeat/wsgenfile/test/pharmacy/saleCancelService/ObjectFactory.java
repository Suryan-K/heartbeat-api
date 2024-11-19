
package com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService package. 
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

    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleCancelService", "PRODUCT");
    private final static QName _PharmacySaleCancelServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleCancelService", "PharmacySaleCancelServiceRequest");
    private final static QName _PharmacySaleCancelServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleCancelService", "PharmacySaleCancelServiceRequestType");
    private final static QName _PharmacySaleCancelServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleCancelService", "PharmacySaleCancelServiceResponse");
    private final static QName _PharmacySaleCancelServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleCancelService", "PharmacySaleCancelServiceResponseType");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleCancelService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PharmacySaleCancelServiceResponse }
     * 
     */
    public PharmacySaleCancelServiceResponse createPharmacySaleCancelServiceResponse() {
        return new PharmacySaleCancelServiceResponse();
    }

    /**
     * Create an instance of {@link PharmacySaleCancelServiceRequest }
     * 
     */
    public PharmacySaleCancelServiceRequest createPharmacySaleCancelServiceRequest() {
        return new PharmacySaleCancelServiceRequest();
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
     * Create an instance of {@link PharmacySaleCancelServiceResponse.PRODUCTLIST }
     * 
     */
    public PharmacySaleCancelServiceResponse.PRODUCTLIST createPharmacySaleCancelServiceResponsePRODUCTLIST() {
        return new PharmacySaleCancelServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link PharmacySaleCancelServiceRequest.PRODUCTLIST }
     * 
     */
    public PharmacySaleCancelServiceRequest.PRODUCTLIST createPharmacySaleCancelServiceRequestPRODUCTLIST() {
        return new PharmacySaleCancelServiceRequest.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", name = "PRODUCT")
    public JAXBElement<Object> createPRODUCT(Object value) {
        return new JAXBElement<Object>(_PRODUCT_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", name = "PharmacySaleCancelServiceRequest")
    public JAXBElement<PharmacySaleCancelServiceRequest> createPharmacySaleCancelServiceRequest(PharmacySaleCancelServiceRequest value) {
        return new JAXBElement<PharmacySaleCancelServiceRequest>(_PharmacySaleCancelServiceRequest_QNAME, PharmacySaleCancelServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", name = "PharmacySaleCancelServiceRequestType")
    public JAXBElement<PharmacySaleCancelServiceRequest> createPharmacySaleCancelServiceRequestType(PharmacySaleCancelServiceRequest value) {
        return new JAXBElement<PharmacySaleCancelServiceRequest>(_PharmacySaleCancelServiceRequestType_QNAME, PharmacySaleCancelServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", name = "PharmacySaleCancelServiceResponse")
    public JAXBElement<PharmacySaleCancelServiceResponse> createPharmacySaleCancelServiceResponse(PharmacySaleCancelServiceResponse value) {
        return new JAXBElement<PharmacySaleCancelServiceResponse>(_PharmacySaleCancelServiceResponse_QNAME, PharmacySaleCancelServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleCancelServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", name = "PharmacySaleCancelServiceResponseType")
    public JAXBElement<PharmacySaleCancelServiceResponse> createPharmacySaleCancelServiceResponseType(PharmacySaleCancelServiceResponse value) {
        return new JAXBElement<PharmacySaleCancelServiceResponse>(_PharmacySaleCancelServiceResponseType_QNAME, PharmacySaleCancelServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleCancelService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
