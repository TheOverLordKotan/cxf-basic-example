
package org.adarchitecture.ws.user.canal.common.aggregate.component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * idTransaccion
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2" xmlns:qdt="org:adarchitecture:salesforce:user:schema:xsd:QualifiedDatatypes-2" xmlns:udt="org:adarchitecture:salesforce:user:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ADA&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;SincronizarCrmUserRequestType
 * 					&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Information about request
 * 						SincronizarCrmUserRequestType
 * 					&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;SincronizarCrmUser&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para SincronizarCrmUserRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SincronizarCrmUserRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2}clienteCrm"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2}representanteLegalClienteCrm" minOccurs="0"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2}empresaClienteCrm" minOccurs="0"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2}direccionesClienteCrm" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SincronizarCrmUserRequestType", propOrder = {
	"clienteCrm"
})
public class SincronizarCrmUserRequestType {

    @XmlElement(required = true)
    protected InfoGeneralType clienteCrm;
    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2" xmlns:qdt="org:adarchitecture:salesforce:user:schema:xsd:QualifiedDatatypes-2" xmlns:udt="org:adarchitecture:salesforce:user:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;SincronizarCrmUser. Identifier
     * 							&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for the SincronizarCrmUser.
     * 							&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;0..1&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;SincronizarCrmUser&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;"First", "Second"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * 
     * 
     * @return
     *     possible object is
     *     {@link InfoGeneralType }
     *     
     */
    public InfoGeneralType getClienteCrm() {
        return clienteCrm;
    }

    /**
     * Define el valor de la propiedad clienteCrm.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoGeneralType }
     *     
     */
    public void setClienteCrm(InfoGeneralType value) {
        this.clienteCrm = value;
    }
}
