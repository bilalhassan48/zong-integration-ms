
package org.example.bankchannelservice;

import javax.xml.bind.annotation.*;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="requestDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
    "chnlNum",
    "chnlPasWd",
    "userNum",
    "amount",
    "requestDate",
    "requestId"
})
@XmlRootElement(name = "bankRecharge")
public class BankRecharge {

    @XmlElement(required = true)
    protected String chnlNum;
    @XmlElement(required = true)
    protected String chnlPasWd;
    @XmlElement(required = true)
    protected String userNum;
    protected int amount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar requestDate;
    @XmlElement(required = true)
    protected String requestId;

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
     * Gets the value of the amount property.
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * Gets the value of the requestDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRequestDate() {
        return requestDate;
    }

    /**
     * Sets the value of the requestDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRequestDate(XMLGregorianCalendar value) {
        this.requestDate = value;
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
