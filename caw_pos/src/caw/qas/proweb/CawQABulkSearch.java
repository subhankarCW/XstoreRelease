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
 *         &lt;element name="Country" type="{http://www.qas.com/web-2013-12}DataIDType"/>
 *         &lt;element name="Engine" type="{http://www.qas.com/web-2013-12}EngineType"/>
 *         &lt;element name="Layout" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BulkSearchTerm" type="{http://www.qas.com/web-2013-12}QASearchType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Language" type="{http://www.qas.com/web-2013-12}LanguageIDType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "country", "engine", "layout", "bulkSearchTerm" })
@XmlRootElement(name = "QABulkSearch")
public class CawQABulkSearch {

    @XmlElement(name = "Country", required = true)
    protected String          country;

    @XmlElement(name = "Engine", required = true)
    protected CawEngineType   engine;

    @XmlElement(name = "Layout")
    protected String          layout;

    @XmlElement(name = "BulkSearchTerm")
    protected CawQASearchType bulkSearchTerm;

    @XmlAttribute(name = "Language")
    protected String          language;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {

        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {

        this.country = value;
    }

    /**
     * Gets the value of the engine property.
     * 
     * @return
     *     possible object is
     *     {@link EngineType }
     *     
     */
    public CawEngineType getEngine() {

        return engine;
    }

    /**
     * Sets the value of the engine property.
     * 
     * @param value
     *     allowed object is
     *     {@link EngineType }
     *     
     */
    public void setEngine(CawEngineType value) {

        this.engine = value;
    }

    /**
     * Gets the value of the layout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayout() {

        return layout;
    }

    /**
     * Sets the value of the layout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayout(String value) {

        this.layout = value;
    }

    /**
     * Gets the value of the bulkSearchTerm property.
     * 
     * @return
     *     possible object is
     *     {@link QASearchType }
     *     
     */
    public CawQASearchType getBulkSearchTerm() {

        return bulkSearchTerm;
    }

    /**
     * Sets the value of the bulkSearchTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link QASearchType }
     *     
     */
    public void setBulkSearchTerm(CawQASearchType value) {

        this.bulkSearchTerm = value;
    }

    /**
     * Gets the value of the language property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {

        return language;
    }

    /**
     * Sets the value of the language property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {

        this.language = value;
    }

}
