
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
    "bossId",
    "requestId"
})
@XmlRootElement(name = "UNSUBPROM4GToSMSResponse")
public class UNSUBPROM4GToSMSResponse {

    @XmlElement(name = "RETN")
    protected int retn;
    @XmlElement(name = "DESC", required = true)
    protected String desc;
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
