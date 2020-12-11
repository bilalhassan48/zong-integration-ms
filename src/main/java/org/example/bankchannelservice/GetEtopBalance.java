
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
 *         &lt;element name="PASSWD" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "passwd",
    "dn"
})
@XmlRootElement(name = "getEtopBalance")
public class GetEtopBalance {

    @XmlElement(name = "PASSWD", required = true)
    protected String passwd;
    @XmlElement(name = "DN", required = true)
    protected String dn;

    /**
     * Gets the value of the passwd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPASSWD() {
        return passwd;
    }

    /**
     * Sets the value of the passwd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPASSWD(String value) {
        this.passwd = value;
    }

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

}
