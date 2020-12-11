
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
 *         &lt;element name="chnlNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chnlPasWd" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="userNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bundleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "chnlNum",
    "chnlPasWd",
    "userNum",
    "bundleId",
    "requestId",
    "username",
    "password"
})
@XmlRootElement(name = "subBundle")
public class SubBundle {

    @XmlElement(required = true)
    protected String chnlNum;
    @XmlElement(required = true)
    protected String chnlPasWd;
    @XmlElement(required = true)
    protected String userNum;
    @XmlElement(required = true)
    protected String bundleId;
    @XmlElement(required = true)
    protected String requestId;
    @XmlElement(name = "Username", required = true)
    protected String username;
    @XmlElement(name = "Password", required = true)
    protected String password;

    /**
     * Gets the value of the chnlNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlNum() {
        return chnlNum;
    }

    /**
     * Sets the value of the chnlNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChnlNum(String value) {
        this.chnlNum = value;
    }

    /**
     * Gets the value of the chnlPasWd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChnlPasWd() {
        return chnlPasWd;
    }

    /**
     * Sets the value of the chnlPasWd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChnlPasWd(String value) {
        this.chnlPasWd = value;
    }

    /**
     * Gets the value of the userNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNum() {
        return userNum;
    }

    /**
     * Sets the value of the userNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNum(String value) {
        this.userNum = value;
    }

    /**
     * Gets the value of the bundleId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleId() {
        return bundleId;
    }

    /**
     * Sets the value of the bundleId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleId(String value) {
        this.bundleId = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestId(String value) {
        this.requestId = value;
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
