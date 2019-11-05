
package org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FillersType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FillersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}fillerKey" minOccurs="0"/&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}fillerValue" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FillersType", propOrder = {
    "fillerKey",
    "fillerValue"
})
public class FillersType {

    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1")
    protected String fillerKey;
    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1")
    protected String fillerValue;

    /**
     * Obtiene el valor de la propiedad fillerKey.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillerKey() {
        return fillerKey;
    }

    /**
     * Define el valor de la propiedad fillerKey.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillerKey(String value) {
        this.fillerKey = value;
    }

    /**
     * Obtiene el valor de la propiedad fillerValue.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFillerValue() {
        return fillerValue;
    }

    /**
     * Define el valor de la propiedad fillerValue.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFillerValue(String value) {
        this.fillerValue = value;
    }

}
