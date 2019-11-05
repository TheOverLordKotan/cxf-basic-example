
package org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NodeType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NodeType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}tipoDocumento"/&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}numeroIdentificacion"/&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}state"/&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}transactionId"/&gt;
 *         &lt;element ref="{org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1}numeroIntentos"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NodeType", propOrder = {
    "tipoDocumento",
    "numeroIdentificacion",
    "state",
    "transactionId",
    "numeroIntentos"
})
public class NodeType {

    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", required = true)
    protected String tipoDocumento;
    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", required = true)
    protected BigDecimal numeroIdentificacion;
    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", required = true)
    protected String state;
    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", required = true)
    protected String transactionId;
    @XmlElement(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", required = true)
    protected BigDecimal numeroIntentos;

    /**
     * Obtiene el valor de la propiedad tipoDocumento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Define el valor de la propiedad tipoDocumento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDocumento(String value) {
        this.tipoDocumento = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroIdentificacion.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    /**
     * Define el valor de la propiedad numeroIdentificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroIdentificacion(BigDecimal value) {
        this.numeroIdentificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad state.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * Define el valor de la propiedad state.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

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
     * Obtiene el valor de la propiedad numeroIntentos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNumeroIntentos() {
        return numeroIntentos;
    }

    /**
     * Define el valor de la propiedad numeroIntentos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNumeroIntentos(BigDecimal value) {
        this.numeroIntentos = value;
    }

}
