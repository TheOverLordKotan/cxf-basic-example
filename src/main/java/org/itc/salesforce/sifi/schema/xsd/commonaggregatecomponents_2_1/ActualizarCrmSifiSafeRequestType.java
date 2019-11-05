
package org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ActualizarCrmSifiSafeRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ActualizarCrmSifiSafeRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="stateNode" type="{org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1}NodeType"/&gt;
 *         &lt;element name="fillers" type="{org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1}FillersType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ActualizarCrmSifiSafeRequestType", propOrder = {
    "stateNode",
    "fillers"
})
public class ActualizarCrmSifiSafeRequestType {

    @XmlElement(required = true)
    protected NodeType stateNode;
    @XmlElement(nillable = true)
    protected List<FillersType> fillers;

    /**
     * Obtiene el valor de la propiedad stateNode.
     * 
     * @return
     *     possible object is
     *     {@link NodeType }
     *     
     */
    public NodeType getStateNode() {
        return stateNode;
    }

    /**
     * Define el valor de la propiedad stateNode.
     * 
     * @param value
     *     allowed object is
     *     {@link NodeType }
     *     
     */
    public void setStateNode(NodeType value) {
        this.stateNode = value;
    }

    /**
     * Gets the value of the fillers property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fillers property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFillers().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FillersType }
     * 
     * 
     */
    public List<FillersType> getFillers() {
        if (fillers == null) {
            fillers = new ArrayList<FillersType>();
        }
        return this.fillers;
    }

}
