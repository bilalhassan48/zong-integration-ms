
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
 *         &lt;element name="AMT" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRANSID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TRANDATE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CHNLNAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ORDERID" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "amt",
    "transid",
    "trandate",
    "chnlname",
    "orderid"
})
@XmlRootElement(name = "RECHARGEBALNEONLINE")
public class RECHARGEBALNEONLINE {

    @XmlElement(name = "DN", required = true)
    protected String dn;
    @XmlElement(name = "AMT", required = true)
    protected String amt;
    @XmlElement(name = "TRANSID", required = true)
    protected String transid;
    @XmlElement(name = "TRANDATE", required = true)
    protected String trandate;
    @XmlElement(name = "CHNLNAME", required = true)
    protected String chnlname;
    @XmlElement(name = "ORDERID", required = true)
    protected String orderid;

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
     * Gets the value of the transid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANSID() {
        return transid;
    }

    /**
     * Sets the value of the transid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANSID(String value) {
        this.transid = value;
    }

    /**
     * Gets the value of the trandate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTRANDATE() {
        return trandate;
    }

    /**
     * Sets the value of the trandate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTRANDATE(String value) {
        this.trandate = value;
    }

    /**
     * Gets the value of the chnlname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCHNLNAME() {
        return chnlname;
    }

    /**
     * Sets the value of the chnlname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCHNLNAME(String value) {
        this.chnlname = value;
    }

    /**
     * Gets the value of the orderid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getORDERID() {
        return orderid;
    }

    /**
     * Sets the value of the orderid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setORDERID(String value) {
        this.orderid = value;
    }

}
