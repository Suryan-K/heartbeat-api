
package com.tanjer.heartbeat.wsgenfile.test.consumption.deactivationservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for faultBean complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="faultBean"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FC" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "faultBean", propOrder = {
    "fc"
})
public class FaultBean {

    @XmlElement(name = "FC")
    protected String fc;

    /**
     * Gets the value of the fc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFC() {
        return fc;
    }

    /**
     * Sets the value of the fc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFC(String value) {
        this.fc = value;
    }

}
