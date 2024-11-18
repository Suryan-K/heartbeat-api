
package com.tanjer.heartbeat.wsgenfile.pharmacy.acceptService;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for product complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="product"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GTIN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XD" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "product", propOrder = {
    "gtin",
    "sn",
    "bn",
    "xd"
})
public class Product {

    @XmlElement(name = "GTIN", required = true)
    protected String gtin;
    @XmlElement(name = "SN", required = true)
    protected String sn;
    @XmlElement(name = "BN")
    protected String bn;
    @XmlElement(name = "XD")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xd;

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

}
