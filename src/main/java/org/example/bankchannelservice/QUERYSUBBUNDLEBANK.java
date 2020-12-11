
package org.example.bankchannelservice;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="REQUERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dn",
    "requerid"
})
@XmlRootElement(name = "QUERYSUBBUNDLEBANK")
public class QUERYSUBBUNDLEBANK {

    @XmlElement(name = "DN", required = true)
    protected String dn;
    @XmlElement(name = "REQUERID", required = true)
    protected String requerid;

    /**
     * Gets the value of the dn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDN() {
        return dn;
    }

    /**
     * Sets the value of the dn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDN(String value) {
        this.dn = value;
    }

    /**
     * Gets the value of the requerid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREQUERID() {
        return requerid;
    }

    /**
     * Sets the value of the requerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREQUERID(String value) {
        this.requerid = value;
    }

}
