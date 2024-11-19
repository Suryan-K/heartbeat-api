
package com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pharmacySaleCancelServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pharmacySaleCancelServiceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TOGLN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRESCRIPTIONID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRODUCTLIST" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRODUCT" type="{http://dtts.sfda.gov.sa/PharmacySaleCancelService}product" maxOccurs="unbounded" minOccurs="0"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pharmacySaleCancelServiceRequest", propOrder = {
    "togln",
    "prescriptionid",
    "productlist"
})
public class PharmacySaleCancelServiceRequest {

    @XmlElement(name = "TOGLN", required = true)
    protected String togln;
    @XmlElement(name = "PRESCRIPTIONID", required = true)
    protected String prescriptionid;
    @XmlElement(name = "PRODUCTLIST")
    protected PharmacySaleCancelServiceRequest.PRODUCTLIST productlist;

    /**
     * Gets the value of the togln property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTOGLN() {
        return togln;
    }

    /**
     * Sets the value of the togln property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTOGLN(String value) {
        this.togln = value;
    }

    /**
     * Gets the value of the prescriptionid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRESCRIPTIONID() {
        return prescriptionid;
    }

    /**
     * Sets the value of the prescriptionid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRESCRIPTIONID(String value) {
        this.prescriptionid = value;
    }

    /**
     * Gets the value of the productlist property.
     * 
     * @return
     *     possible object is
     *     {@link PharmacySaleCancelServiceRequest.PRODUCTLIST }
     *     
     */
    public PharmacySaleCancelServiceRequest.PRODUCTLIST getPRODUCTLIST() {
        return productlist;
    }

    /**
     * Sets the value of the productlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmacySaleCancelServiceRequest.PRODUCTLIST }
     *     
     */
    public void setPRODUCTLIST(PharmacySaleCancelServiceRequest.PRODUCTLIST value) {
        this.productlist = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PRODUCT" type="{http://dtts.sfda.gov.sa/PharmacySaleCancelService}product" maxOccurs="unbounded" minOccurs="0"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "product"
    })
    public static class PRODUCTLIST {

        @XmlElement(name = "PRODUCT")
        protected List<Product> product;

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPRODUCT().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Product }
         * 
         * 
         */
        public List<Product> getPRODUCT() {
            if (product == null) {
                product = new ArrayList<Product>();
            }
            return this.product;
        }

    }

}
