
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
 *         &lt;element name="RETN" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DESC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BDPNOTAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BDTAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RECHARETAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DEDUCTAMOUNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SERVICEFEE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SERVICETAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bossId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "retn",
    "desc",
    "bdpnotax",
    "bdtax",
    "recharetax",
    "discount",
    "deductamount",
    "servicefee",
    "servicetax",
    "ait",
    "bossId",
    "requestId"
})
@XmlRootElement(name = "subBundleResponse")
public class SubBundleResponse {

    @XmlElement(name = "RETN")
    protected int retn;
    @XmlElement(name = "DESC", required = true)
    protected String desc;
    @XmlElement(name = "BDPNOTAX")
    protected int bdpnotax;
    @XmlElement(name = "BDTAX")
    protected int bdtax;
    @XmlElement(name = "RECHARETAX")
    protected int recharetax;
    @XmlElement(name = "DISCOUNT")
    protected int discount;
    @XmlElement(name = "DEDUCTAMOUNT")
    protected int deductamount;
    @XmlElement(name = "SERVICEFEE")
    protected int servicefee;
    @XmlElement(name = "SERVICETAX")
    protected int servicetax;
    @XmlElement(name = "AIT")
    protected int ait;
    @XmlElement(required = true)
    protected String bossId;
    @XmlElement(required = true)
    protected String requestId;

    /**
     * Gets the value of the retn property.
     * 
     */
    public int getRETN() {
        return retn;
    }

    /**
     * Sets the value of the retn property.
     * 
     */
    public void setRETN(int value) {
        this.retn = value;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDESC() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDESC(String value) {
        this.desc = value;
    }

    /**
     * Gets the value of the bdpnotax property.
     * 
     */
    public int getBDPNOTAX() {
        return bdpnotax;
    }

    /**
     * Sets the value of the bdpnotax property.
     * 
     */
    public void setBDPNOTAX(int value) {
        this.bdpnotax = value;
    }

    /**
     * Gets the value of the bdtax property.
     * 
     */
    public int getBDTAX() {
        return bdtax;
    }

    /**
     * Sets the value of the bdtax property.
     * 
     */
    public void setBDTAX(int value) {
        this.bdtax = value;
    }

    /**
     * Gets the value of the recharetax property.
     * 
     */
    public int getRECHARETAX() {
        return recharetax;
    }

    /**
     * Sets the value of the recharetax property.
     * 
     */
    public void setRECHARETAX(int value) {
        this.recharetax = value;
    }

    /**
     * Gets the value of the discount property.
     * 
     */
    public int getDISCOUNT() {
        return discount;
    }

    /**
     * Sets the value of the discount property.
     * 
     */
    public void setDISCOUNT(int value) {
        this.discount = value;
    }

    /**
     * Gets the value of the deductamount property.
     * 
     */
    public int getDEDUCTAMOUNT() {
        return deductamount;
    }

    /**
     * Sets the value of the deductamount property.
     * 
     */
    public void setDEDUCTAMOUNT(int value) {
        this.deductamount = value;
    }

    /**
     * Gets the value of the servicefee property.
     * 
     */
    public int getSERVICEFEE() {
        return servicefee;
    }

    /**
     * Sets the value of the servicefee property.
     * 
     */
    public void setSERVICEFEE(int value) {
        this.servicefee = value;
    }

    /**
     * Gets the value of the servicetax property.
     * 
     */
    public int getSERVICETAX() {
        return servicetax;
    }

    /**
     * Sets the value of the servicetax property.
     * 
     */
    public void setSERVICETAX(int value) {
        this.servicetax = value;
    }

    /**
     * Gets the value of the ait property.
     * 
     */
    public int getAIT() {
        return ait;
    }

    /**
     * Sets the value of the ait property.
     * 
     */
    public void setAIT(int value) {
        this.ait = value;
    }

    /**
     * Gets the value of the bossId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBossId() {
        return bossId;
    }

    /**
     * Sets the value of the bossId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBossId(String value) {
        this.bossId = value;
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

}
