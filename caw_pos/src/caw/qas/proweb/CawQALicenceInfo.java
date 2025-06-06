/**
 * CONFIDENTIAL AND PROPRIETARY SOURCE CODE. 
 * 
 * Use and distribution of this code is subject to applicable 
 * licenses and the permission of the code owner.  This notice 
 * does not indicate the actual or intended publication of 
 * this source code.
 * 
 * Portions developed for Camping World by BTM Global Consulting
 * LLC and are the property of Camping World.
 * 
 * ===== BTM Modification ===========================================
 * Req/Bug ID#      ddMMyy    Description
 * BZ23405          160118    [QAS] There are problem when integrate Xstore with QAS service of Camping World
 *===================================================================
 */

package caw.qas.proweb;

import java.util.ArrayList;
import java.util.List;

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
 *         &lt;element name="WarningLevel" type="{http://www.qas.com/web-2013-12}LicenceWarningLevel"/>
 *         &lt;element name="LicensedSet" type="{http://www.qas.com/web-2013-12}QALicensedSet" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "warningLevel", "licensedSet" })
@XmlRootElement(name = "QALicenceInfo")
public class CawQALicenceInfo {

    @XmlElement(name = "WarningLevel", required = true)
    @XmlSchemaType(name = "string")
    protected CawLicenceWarningLevel warningLevel;

    @XmlElement(name = "LicensedSet")
    protected List<CawQALicensedSet> licensedSet;

    /**
     * Gets the value of the warningLevel property.
     * 
     * @return
     *     possible object is
     *     {@link LicenceWarningLevel }
     *     
     */
    public CawLicenceWarningLevel getWarningLevel() {

        return warningLevel;
    }

    /**
     * Sets the value of the warningLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link LicenceWarningLevel }
     *     
     */
    public void setWarningLevel(CawLicenceWarningLevel value) {

        this.warningLevel = value;
    }

    /**
     * Gets the value of the licensedSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the licensedSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLicensedSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QALicensedSet }
     * 
     * 
     */
    public List<CawQALicensedSet> getLicensedSet() {

        if (licensedSet == null) {
            licensedSet = new ArrayList<CawQALicensedSet>();
        }
        return this.licensedSet;
    }

}
