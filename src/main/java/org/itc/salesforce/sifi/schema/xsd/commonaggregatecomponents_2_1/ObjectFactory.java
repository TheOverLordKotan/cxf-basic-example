
package org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ActualizarCrmSifiSafeFault_QNAME = new QName("org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", "actualizarCrmSifiSafeFault");
    private final static QName _ActualizarCrmSifiSafeRequest_QNAME = new QName("org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", "actualizarCrmSifiSafeRequest");
    private final static QName _ActualizarCrmSifiSafeResponse_QNAME = new QName("org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", "actualizarCrmSifiSafeResponse");
    private final static QName _Fillers_QNAME = new QName("org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", "fillers");
    private final static QName _StateNode_QNAME = new QName("org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", "stateNode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultServiceType }
     * 
     */
    public FaultServiceType createFaultServiceType() {
        return new FaultServiceType();
    }

    /**
     * Create an instance of {@link ActualizarCrmSifiSafeRequestType }
     * 
     */
    public ActualizarCrmSifiSafeRequestType createActualizarCrmSifiSafeRequestType() {
        return new ActualizarCrmSifiSafeRequestType();
    }

    /**
     * Create an instance of {@link ResposeServiceType }
     * 
     */
    public ResposeServiceType createResposeServiceType() {
        return new ResposeServiceType();
    }

    /**
     * Create an instance of {@link FillersType }
     * 
     */
    public FillersType createFillersType() {
        return new FillersType();
    }

    /**
     * Create an instance of {@link NodeType }
     * 
     */
    public NodeType createNodeType() {
        return new NodeType();
    }

    /**
     * Create an instance of {@link StateNodesType }
     * 
     */
    public StateNodesType createStateNodesType() {
        return new StateNodesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", name = "actualizarCrmSifiSafeFault")
    public JAXBElement<FaultServiceType> createActualizarCrmSifiSafeFault(FaultServiceType value) {
        return new JAXBElement<FaultServiceType>(_ActualizarCrmSifiSafeFault_QNAME, FaultServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ActualizarCrmSifiSafeRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", name = "actualizarCrmSifiSafeRequest")
    public JAXBElement<ActualizarCrmSifiSafeRequestType> createActualizarCrmSifiSafeRequest(ActualizarCrmSifiSafeRequestType value) {
        return new JAXBElement<ActualizarCrmSifiSafeRequestType>(_ActualizarCrmSifiSafeRequest_QNAME, ActualizarCrmSifiSafeRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResposeServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", name = "actualizarCrmSifiSafeResponse")
    public JAXBElement<ResposeServiceType> createActualizarCrmSifiSafeResponse(ResposeServiceType value) {
        return new JAXBElement<ResposeServiceType>(_ActualizarCrmSifiSafeResponse_QNAME, ResposeServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FillersType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", name = "fillers")
    public JAXBElement<FillersType> createFillers(FillersType value) {
        return new JAXBElement<FillersType>(_Fillers_QNAME, FillersType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NodeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:schema:xsd:CommonAggregateComponents-2-1", name = "stateNode")
    public JAXBElement<NodeType> createStateNode(NodeType value) {
        return new JAXBElement<NodeType>(_StateNode_QNAME, NodeType.class, null, value);
    }

}
