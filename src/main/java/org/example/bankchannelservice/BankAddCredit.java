
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
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bankName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="depositorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="slipNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="depositorDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="chequeFlag" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "payMode",
    "bankName",
    "depositorId",
    "amount",
    "slipNo",
    "depositorDate",
    "chequeFlag"
})
@XmlRootElement(name = "bankAddCredit")
public class BankAddCredit {

    @XmlElement(required = true)
    protected String userName;
    @XmlElement(required = true)
    protected String passWord;
    @XmlElement(required = true)
    protected String payMode;
    @XmlElement(required = true)
    protected String bankName;
    @XmlElement(required = true)
    protected String depositorId;
    protected int amount;
    @XmlElement(required = true)
    protected String slipNo;
    @XmlElement(required = true)
    protected String depositorDate;
    protected int chequeFlag;

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
     * Gets the value of the payMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * Sets the value of the payMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * Gets the value of the bankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * Sets the value of the bankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankName(String value) {
        this.bankName = value;
    }

    /**
     * Gets the value of the depositorId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositorId() {
        return depositorId;
    }

    /**
     * Sets the value of the depositorId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositorId(String value) {
        this.depositorId = value;
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
     * Gets the value of the slipNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSlipNo() {
        return slipNo;
    }

    /**
     * Sets the value of the slipNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSlipNo(String value) {
        this.slipNo = value;
    }

    /**
     * Gets the value of the depositorDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepositorDate() {
        return depositorDate;
    }

    /**
     * Sets the value of the depositorDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepositorDate(String value) {
        this.depositorDate = value;
    }

    /**
     * Gets the value of the chequeFlag property.
     * 
     */
    public int getChequeFlag() {
        return chequeFlag;
    }

    /**
     * Sets the value of the chequeFlag property.
     * 
     */
    public void setChequeFlag(int value) {
        this.chequeFlag = value;
    }

}
