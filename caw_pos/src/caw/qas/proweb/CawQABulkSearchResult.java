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
 *         &lt;element name="BulkAddress" type="{http://www.qas.com/web-2013-12}QABulkSearchItemType" maxOccurs="unbounded"/>
 *         &lt;element name="BulkError" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}string" default="None" />
 *       &lt;attribute name="SearchCount" type="{http://www.w3.org/2001/XMLSchema}string" default="None" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = { "bulkAddress", "bulkError", "errorCode" })
@XmlRootElement(name = "QABulkSearchResult")
public class CawQABulkSearchResult {

    @XmlElement(name = "BulkAddress", required = true)
    protected List<CawQABulkSearchItemType> bulkAddress;

    @XmlElement(name = "BulkError")
    protected String                        bulkError;

    @XmlElement(name = "ErrorCode")
    protected String                        errorCode;

    @XmlAttribute(name = "Count")
    protected String                        count;

    @XmlAttribute(name = "SearchCount")
    protected String                        searchCount;

    /**
     * Gets the value of the bulkAddress property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bulkAddress property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBulkAddress().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QABulkSearchItemType }
     * 
     * 
     */
    public List<CawQABulkSearchItemType> getBulkAddress() {

        if (bulkAddress == null) {
            bulkAddress = new ArrayList<CawQABulkSearchItemType>();
        }
        return this.bulkAddress;
    }

    /**
     * Gets the value of the bulkError property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBulkError() {

        return bulkError;
    }

    /**
     * Sets the value of the bulkError property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBulkError(String value) {

        this.bulkError = value;
    }

    /**
     * Gets the value of the errorCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getErrorCode() {

        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setErrorCode(String value) {

        this.errorCode = value;
    }

    /**
     * Gets the value of the count property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCount() {

        if (count == null) {
            return "None";
        } else {
            return count;
        }
    }

    /**
     * Sets the value of the count property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCount(String value) {

        this.count = value;
    }

    /**
     * Gets the value of the searchCount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchCount() {

        if (searchCount == null) {
            return "None";
        } else {
            return searchCount;
        }
    }

    /**
     * Sets the value of the searchCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchCount(String value) {

        this.searchCount = value;
    }

}
