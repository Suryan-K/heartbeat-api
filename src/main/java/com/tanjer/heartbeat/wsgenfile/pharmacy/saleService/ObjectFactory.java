
package com.tanjer.heartbeat.wsgenfile.pharmacy.saleService;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice package. 
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

    private final static QName _PRODUCT_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleService", "PRODUCT");
    private final static QName _PharmacySaleServiceRequest_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleService", "PharmacySaleServiceRequest");
    private final static QName _PharmacySaleServiceRequestType_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleService", "PharmacySaleServiceRequestType");
    private final static QName _PharmacySaleServiceResponse_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleService", "PharmacySaleServiceResponse");
    private final static QName _PharmacySaleServiceResponseType_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleService", "PharmacySaleServiceResponseType");
    private final static QName _ServiceError_QNAME = new QName("http://dtts.sfda.gov.sa/PharmacySaleService", "ServiceError");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tanjer.heartbeat.wsgenfile.pharmacy.saleservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PharmacySaleServiceResponse }
     * 
     */
    public PharmacySaleServiceResponse createPharmacySaleServiceResponse() {
        return new PharmacySaleServiceResponse();
    }

    /**
     * Create an instance of {@link PharmacySaleServiceRequest }
     * 
     */
    public PharmacySaleServiceRequest createPharmacySaleServiceRequest() {
        return new PharmacySaleServiceRequest();
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
     * Create an instance of {@link PharmacySaleServiceResponse.PRODUCTLIST }
     * 
     */
    public PharmacySaleServiceResponse.PRODUCTLIST createPharmacySaleServiceResponsePRODUCTLIST() {
        return new PharmacySaleServiceResponse.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link PharmacySaleServiceRequest.PRODUCTLIST }
     * 
     */
    public PharmacySaleServiceRequest.PRODUCTLIST createPharmacySaleServiceRequestPRODUCTLIST() {
        return new PharmacySaleServiceRequest.PRODUCTLIST();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleService", name = "PRODUCT")
    public JAXBElement<Object> createPRODUCT(Object value) {
        return new JAXBElement<Object>(_PRODUCT_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleService", name = "PharmacySaleServiceRequest")
    public JAXBElement<PharmacySaleServiceRequest> createPharmacySaleServiceRequest(PharmacySaleServiceRequest value) {
        return new JAXBElement<PharmacySaleServiceRequest>(_PharmacySaleServiceRequest_QNAME, PharmacySaleServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceRequest }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceRequest }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleService", name = "PharmacySaleServiceRequestType")
    public JAXBElement<PharmacySaleServiceRequest> createPharmacySaleServiceRequestType(PharmacySaleServiceRequest value) {
        return new JAXBElement<PharmacySaleServiceRequest>(_PharmacySaleServiceRequestType_QNAME, PharmacySaleServiceRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleService", name = "PharmacySaleServiceResponse")
    public JAXBElement<PharmacySaleServiceResponse> createPharmacySaleServiceResponse(PharmacySaleServiceResponse value) {
        return new JAXBElement<PharmacySaleServiceResponse>(_PharmacySaleServiceResponse_QNAME, PharmacySaleServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PharmacySaleServiceResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleService", name = "PharmacySaleServiceResponseType")
    public JAXBElement<PharmacySaleServiceResponse> createPharmacySaleServiceResponseType(PharmacySaleServiceResponse value) {
        return new JAXBElement<PharmacySaleServiceResponse>(_PharmacySaleServiceResponseType_QNAME, PharmacySaleServiceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultBean }{@code >}
     */
    @XmlElementDecl(namespace = "http://dtts.sfda.gov.sa/PharmacySaleService", name = "ServiceError")
    public JAXBElement<FaultBean> createServiceError(FaultBean value) {
        return new JAXBElement<FaultBean>(_ServiceError_QNAME, FaultBean.class, null, value);
    }

}
