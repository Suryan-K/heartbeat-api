
package com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for productResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="productResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GTIN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="BN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *         &lt;element name="RC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "productResponse", propOrder = {
    "gtin",
    "sn",
    "bn",
    "xd",
    "rc"
})
public class ProductResponse {

    @XmlElement(name = "GTIN")
    protected String gtin;
    @XmlElement(name = "SN")
    protected String sn;
    @XmlElement(name = "BN")
    protected String bn;
    @XmlElement(name = "XD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xd;
    @XmlElement(name = "RC")
    protected String rc;

    /**
     * Gets the value of the gtin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGTIN() {
        return gtin;
    }

    /**
     * Sets the value of the gtin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGTIN(String value) {
        this.gtin = value;
    }

    /**
     * Gets the value of the sn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSN() {
        return sn;
    }

    /**
     * Sets the value of the sn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSN(String value) {
        this.sn = value;
    }

    /**
     * Gets the value of the bn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBN() {
        return bn;
    }

    /**
     * Sets the value of the bn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBN(String value) {
        this.bn = value;
    }

    /**
     * Gets the value of the xd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXD() {
        return xd;
    }

    /**
     * Sets the value of the xd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXD(XMLGregorianCalendar value) {
        this.xd = value;
    }

    /**
     * Gets the value of the rc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRC() {
        return rc;
    }

    /**
     * Sets the value of the rc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRC(String value) {
        this.rc = value;
    }

}
