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

import java.math.BigInteger;

import javax.xml.bind.annotation.*;

/**
 * Example              : An example of possible input
 * 
 * <p>Java class for PromptLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PromptLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prompt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SuggestedInputLength" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *         &lt;element name="Example" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PromptLine", propOrder = { "prompt", "suggestedInputLength", "example" })
public class CawPromptLine {

    @XmlElement(name = "Prompt", required = true)
    protected String     prompt;

    @XmlElement(name = "SuggestedInputLength", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger suggestedInputLength;

    @XmlElement(name = "Example", required = true)
    protected String     example;

    /**
     * Gets the value of the prompt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrompt() {

        return prompt;
    }

    /**
     * Sets the value of the prompt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrompt(String value) {

        this.prompt = value;
    }

    /**
     * Gets the value of the suggestedInputLength property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSuggestedInputLength() {

        return suggestedInputLength;
    }

    /**
     * Sets the value of the suggestedInputLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSuggestedInputLength(BigInteger value) {

        this.suggestedInputLength = value;
    }

    /**
     * Gets the value of the example property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExample() {

        return example;
    }

    /**
     * Sets the value of the example property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExample(String value) {

        this.example = value;
    }

}
