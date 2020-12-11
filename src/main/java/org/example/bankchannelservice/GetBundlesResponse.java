
package org.example.bankchannelservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="bundleId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="bundleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="BDPNOTAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BDTAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="RECHARETAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DISCOUNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DEDUCTAMOUNT" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SERVICEFEE" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="SERVICETAX" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="AIT" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "bundleIdAndBundleNameAndBDPNOTAX"
})
@XmlRootElement(name = "getBundlesResponse")
public class GetBundlesResponse {

    @XmlElementRefs({
        @XmlElementRef(name = "SERVICETAX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BDTAX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DISCOUNT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bundleName", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "SERVICEFEE", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "DEDUCTAMOUNT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "bundleId", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "RECHARETAX", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "AIT", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "BDPNOTAX", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> bundleIdAndBundleNameAndBDPNOTAX;

    /**
     * Gets the value of the bundleIdAndBundleNameAndBDPNOTAX property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bundleIdAndBundleNameAndBDPNOTAX property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBundleIdAndBundleNameAndBDPNOTAX().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getBundleIdAndBundleNameAndBDPNOTAX() {
        if (bundleIdAndBundleNameAndBDPNOTAX == null) {
            bundleIdAndBundleNameAndBDPNOTAX = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.bundleIdAndBundleNameAndBDPNOTAX;
    }

}
