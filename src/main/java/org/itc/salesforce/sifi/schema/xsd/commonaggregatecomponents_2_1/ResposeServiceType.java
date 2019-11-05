
package org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ResposeServiceType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ResposeServiceType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}transactionId"/&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}codRespuesta"/&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}msgRespuesta" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResposeServiceType", propOrder = {
    "transactionId",
    "codRespuesta",
    "msgRespuesta"
})
public class ResposeServiceType {

    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", required = true)
    protected String transactionId;
    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", required = true)
    protected String codRespuesta;
    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1")
    protected String msgRespuesta;

    /**
     * Obtiene el valor de la propiedad transactionId.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransactionId() {
        return transactionId;
    }

    /**
     * Define el valor de la propiedad transactionId.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransactionId(String value) {
        this.transactionId = value;
    }

    /**
     * Obtiene el valor de la propiedad codRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRespuesta() {
        return codRespuesta;
    }

    /**
     * Define el valor de la propiedad codRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRespuesta(String value) {
        this.codRespuesta = value;
    }

    /**
     * Obtiene el valor de la propiedad msgRespuesta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMsgRespuesta() {
        return msgRespuesta;
    }

    /**
     * Define el valor de la propiedad msgRespuesta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMsgRespuesta(String value) {
        this.msgRespuesta = value;
    }

}
