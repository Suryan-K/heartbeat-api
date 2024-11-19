
package com.tanjer.heartbeat.wsgenfile.test.pharmacy.saleCancelService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pharmacySaleCancelServiceResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pharmacySaleCancelServiceResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NOTIFICATIONID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PRODUCTLIST" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRODUCT" type="{http://dtts.sfda.gov.sa/PharmacySaleCancelService}productResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "pharmacySaleCancelServiceResponse", propOrder = {
    "notificationid",
    "productlist"
})
public class PharmacySaleCancelServiceResponse {

    @XmlElement(name = "NOTIFICATIONID")
    protected String notificationid;
    @XmlElement(name = "PRODUCTLIST")
    protected PharmacySaleCancelServiceResponse.PRODUCTLIST productlist;

    /**
     * Gets the value of the notificationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNOTIFICATIONID() {
        return notificationid;
    }

    /**
     * Sets the value of the notificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNOTIFICATIONID(String value) {
        this.notificationid = value;
    }

    /**
     * Gets the value of the productlist property.
     * 
     * @return
     *     possible object is
     *     {@link PharmacySaleCancelServiceResponse.PRODUCTLIST }
     *     
     */
    public PharmacySaleCancelServiceResponse.PRODUCTLIST getPRODUCTLIST() {
        return productlist;
    }

    /**
     * Sets the value of the productlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link PharmacySaleCancelServiceResponse.PRODUCTLIST }
     *     
     */
    public void setPRODUCTLIST(PharmacySaleCancelServiceResponse.PRODUCTLIST value) {
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
     *         &lt;element name="PRODUCT" type="{http://dtts.sfda.gov.sa/PharmacySaleCancelService}productResponse" maxOccurs="unbounded" minOccurs="0"/&gt;
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
        protected List<ProductResponse> product;

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
         * {@link ProductResponse }
         * 
         * 
         */
        public List<ProductResponse> getPRODUCT() {
            if (product == null) {
                product = new ArrayList<ProductResponse>();
            }
            return this.product;
        }

    }

}
