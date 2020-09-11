
package org.adarchitecture.ws.user.canal.common.aggregate.component;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.adarchitecture.user.canal.common.aggregate.component package. 
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

    private final static QName _SincronizarCrmUserRequest_QNAME = new QName("org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", "sincronizarCrmUserRequest");
    private final static QName _ClienteCrm_QNAME = new QName("org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", "clienteCrm");
private final static QName _SincronizarCrmUserResponse_QNAME = new QName("org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", "sincronizarCrmUserResponse");
    private final static QName _SincronizarCrmUserFault_QNAME = new QName("org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", "sincronizarCrmUserFault");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.adarchitecture.user.canal.common.aggregate.component
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SincronizarCrmUserRequestType }
     * 
     */
    public SincronizarCrmUserRequestType createSincronizarCrmUserRequestType() {
        return new SincronizarCrmUserRequestType();
    }

    /**
     * Create an instance of {@link InfoGeneralType }
     * 
     */
    public InfoGeneralType createInfoGeneralType() {
        return new InfoGeneralType();
    }




    /**
     * Create an instance of {@link ResposeServiceType }
     * 
     */
    public ResposeServiceType createResposeServiceType() {
        return new ResposeServiceType();
    }

    /**
     * Create an instance of {@link FaultServiceType }
     * 
     */
    public FaultServiceType createFaultServiceType() {
        return new FaultServiceType();
    }


    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SincronizarCrmUserRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", name = "sincronizarCrmUserRequest")
    public JAXBElement<SincronizarCrmUserRequestType> createSincronizarCrmUserRequest(SincronizarCrmUserRequestType value) {
        return new JAXBElement<SincronizarCrmUserRequestType>(_SincronizarCrmUserRequest_QNAME, SincronizarCrmUserRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InfoGeneralType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", name = "clienteCrm")
    public JAXBElement<InfoGeneralType> createClienteCrm(InfoGeneralType value) {
        return new JAXBElement<InfoGeneralType>(_ClienteCrm_QNAME, InfoGeneralType.class, null, value);
    }



    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResposeServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", name = "sincronizarCrmUserResponse")
    public JAXBElement<ResposeServiceType> createSincronizarCrmUserResponse(ResposeServiceType value) {
        return new JAXBElement<ResposeServiceType>(_SincronizarCrmUserResponse_QNAME, ResposeServiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultServiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:schema:xsd:CommonAggregateComponents-2", name = "sincronizarCrmUserFault")
    public JAXBElement<FaultServiceType> createSincronizarCrmUserFault(FaultServiceType value) {
        return new JAXBElement<FaultServiceType>(_SincronizarCrmUserFault_QNAME, FaultServiceType.class, null, value);
    }


}
