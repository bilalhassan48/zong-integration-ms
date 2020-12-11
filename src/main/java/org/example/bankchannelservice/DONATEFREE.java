
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
 *         &lt;element name="PROMID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="VALIDDAY" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FLAG" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Username" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "promid",
    "amt",
    "validday",
    "flag",
    "username",
    "password"
})
@XmlRootElement(name = "DONATEFREE")
public class DONATEFREE {

    @XmlElement(name = "DN", required = true)
    protected String dn;
    @XmlElement(name = "PROMID", required = true)
    protected String promid;
    @XmlElement(name = "AMT", required = true)
    protected String amt;
    @XmlElement(name = "VALIDDAY", required = true)
    protected String validday;
    @XmlElement(name = "FLAG", required = true)
    protected String flag;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Password", required = true)
    protected String password;

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
     * Gets the value of the promid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPROMID() {
        return promid;
    }

    /**
     * Sets the value of the promid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPROMID(String value) {
        this.promid = value;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAMT() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAMT(String value) {
        this.amt = value;
    }

    /**
     * Gets the value of the validday property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVALIDDAY() {
        return validday;
    }

    /**
     * Sets the value of the validday property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVALIDDAY(String value) {
        this.validday = value;
    }

    /**
     * Gets the value of the flag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFLAG() {
        return flag;
    }

    /**
     * Sets the value of the flag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFLAG(String value) {
        this.flag = value;
    }

    /**
     * Gets the value of the username property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the password property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the value of the password property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
