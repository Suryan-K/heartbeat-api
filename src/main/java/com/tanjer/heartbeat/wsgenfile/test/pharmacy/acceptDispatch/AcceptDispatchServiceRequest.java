
package com.tanjer.heartbeat.wsgenfile.test.pharmacy.acceptDispatch;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for acceptDispatchServiceRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="acceptDispatchServiceRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DISPATCHNOTIFICATIONID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "acceptDispatchServiceRequest", propOrder = {
    "dispatchnotificationid"
})
public class AcceptDispatchServiceRequest {

    @XmlElement(name = "DISPATCHNOTIFICATIONID", required = true)
    protected String dispatchnotificationid;

    /**
     * Gets the value of the dispatchnotificationid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDISPATCHNOTIFICATIONID() {
        return dispatchnotificationid;
    }

    /**
     * Sets the value of the dispatchnotificationid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDISPATCHNOTIFICATIONID(String value) {
        this.dispatchnotificationid = value;
    }

}
