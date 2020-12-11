
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
 *         &lt;element name="userName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="passWord" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SERVICE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SERVICEID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SUBTYPE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PAYMENTID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "userName",
    "passWord",
    "dn",
    "amt",
    "service",
    "serviceid",
    "subtype",
    "paymentid"
})
@XmlRootElement(name = "DEDUCTBALANCENEWSOAP")
public class DEDUCTBALANCENEWSOAP {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String passWord;
    @XmlElement(name = "DN", required = true)
    protected String dn;
    @XmlElement(name = "AMT", required = true)
    protected String amt;
    @XmlElement(name = "SERVICE", required = true)
    protected String service;
    @XmlElement(name = "SERVICEID", required = true)
    protected String serviceid;
    @XmlElement(name = "SUBTYPE", required = true)
    protected String subtype;
    @XmlElement(name = "PAYMENTID", required = true)
    protected String paymentid;

    /**
     * Gets the value of the userName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the value of the userName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * Gets the value of the passWord property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * Sets the value of the passWord property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassWord(String value) {
        this.passWord = value;
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
     * Gets the value of the service property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICE() {
        return service;
    }

    /**
     * Sets the value of the service property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICE(String value) {
        this.service = value;
    }

    /**
     * Gets the value of the serviceid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSERVICEID() {
        return serviceid;
    }

    /**
     * Sets the value of the serviceid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSERVICEID(String value) {
        this.serviceid = value;
    }

    /**
     * Gets the value of the subtype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUBTYPE() {
        return subtype;
    }

    /**
     * Sets the value of the subtype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUBTYPE(String value) {
        this.subtype = value;
    }

    /**
     * Gets the value of the paymentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAYMENTID() {
        return paymentid;
    }

    /**
     * Sets the value of the paymentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAYMENTID(String value) {
        this.paymentid = value;
    }

}
