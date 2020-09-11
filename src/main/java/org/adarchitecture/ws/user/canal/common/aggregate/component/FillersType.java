
package org.adarchitecture.ws.user.canal.common.aggregate.component;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.adarchitecture.ws.user.common.basic.FillerType;


/**
 * 
 * <pre>
 * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2" xmlns:qdt="org:adarchitecture:salesforce:user:schema:xsd:QualifiedDatatypes-2" xmlns:udt="org:adarchitecture:salesforce:user:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;ADA&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;SincronizarCrmUserRequestType
 * 					&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;Information about request
 * 						SincronizarCrmUserRequestType
 * 					&lt;/ccts:Definition&gt;&lt;ccts:ObjectClass&gt;SincronizarCrmUser&lt;/ccts:ObjectClass&gt;&lt;/ccts:Component&gt;
 * </pre>
 * 
 * 
 * <p>Clase Java para FillersType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FillersType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}filler" maxOccurs="unbounded"/&gt;
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
    "filler"
})
public class FillersType {

    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected List<FillerType> filler;

    /**
     * 
     * <pre>
     * &lt;?xml version="1.0" encoding="UTF-8"?&gt;&lt;ccts:Component xmlns:ccts="urn:un:unece:uncefact:documentation:2" xmlns="org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2" xmlns:cbc="org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2" xmlns:qdt="org:adarchitecture:salesforce:user:schema:xsd:QualifiedDatatypes-2" xmlns:udt="org:adarchitecture:salesforce:user:data:specification:UnqualifiedDataTypesSchemaModule:2" xmlns:xsd="http://www.w3.org/2001/XMLSchema"&gt;&lt;ccts:ComponentType&gt;BBIE&lt;/ccts:ComponentType&gt;&lt;ccts:DictionaryEntryName&gt;SincronizarCrmUser. Identifier
     * 							&lt;/ccts:DictionaryEntryName&gt;&lt;ccts:Definition&gt;An identifier for the SincronizarCrmUser.
     * 							&lt;/ccts:Definition&gt;&lt;ccts:Cardinality&gt;1..M&lt;/ccts:Cardinality&gt;&lt;ccts:ObjectClass&gt;SincronizarCrmUser&lt;/ccts:ObjectClass&gt;&lt;ccts:PropertyTerm&gt;Identifier&lt;/ccts:PropertyTerm&gt;&lt;ccts:RepresentationTerm&gt;Identifier&lt;/ccts:RepresentationTerm&gt;&lt;ccts:DataType&gt;Identifier. Type&lt;/ccts:DataType&gt;&lt;ccts:Examples&gt;"A", "C"&lt;/ccts:Examples&gt;&lt;/ccts:Component&gt;
     * </pre>
     * Gets the value of the filler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the filler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFiller().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FillerType }
     * 
     * 
     */
    public List<FillerType> getFiller() {
        if (filler == null) {
            filler = new ArrayList<FillerType>();
        }
        return this.filler;
    }

}
