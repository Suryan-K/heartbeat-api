
package com.tanjer.heartbeat.wsgenfile.test.pharmacy.deactivationService;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for deactivationServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="deactivationServiceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DR" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="EXPLANATION" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PRODUCTLIST"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PRODUCT" type="{http://dtts.sfda.gov.sa/DeactivationService}product" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "deactivationServiceRequest", propOrder = {
    "dr",
    "explanation",
    "productlist"
})
public class DeactivationServiceRequest {

    @XmlElement(name = "DR", required = true)
    protected String dr;
    @XmlElement(name = "EXPLANATION", required = true)
    protected String explanation;
    @XmlElement(name = "PRODUCTLIST", required = true)
    protected DeactivationServiceRequest.PRODUCTLIST productlist;

    /**
     * Gets the value of the dr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDR() {
        return dr;
    }

    /**
     * Sets the value of the dr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDR(String value) {
        this.dr = value;
    }

    /**
     * Gets the value of the explanation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEXPLANATION() {
        return explanation;
    }

    /**
     * Sets the value of the explanation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEXPLANATION(String value) {
        this.explanation = value;
    }

    /**
     * Gets the value of the productlist property.
     * 
     * @return
     *     possible object is
     *     {@link DeactivationServiceRequest.PRODUCTLIST }
     *     
     */
    public DeactivationServiceRequest.PRODUCTLIST getPRODUCTLIST() {
        return productlist;
    }

    /**
     * Sets the value of the productlist property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeactivationServiceRequest.PRODUCTLIST }
     *     
     */
    public void setPRODUCTLIST(DeactivationServiceRequest.PRODUCTLIST value) {
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
     *         &lt;element name="PRODUCT" type="{http://dtts.sfda.gov.sa/DeactivationService}product" maxOccurs="unbounded"/&gt;
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

        @XmlElement(name = "PRODUCT", required = true)
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
