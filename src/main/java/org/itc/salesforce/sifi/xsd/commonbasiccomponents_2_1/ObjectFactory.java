
package org.itc.salesforce.sifi.xsd.commonbasiccomponents_2_1;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.itc.salesforce.sifi.xsd.commonbasiccomponents_2_1 package. 
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

    private final static QName _CodRespuesta_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "codRespuesta");
    private final static QName _FillerKey_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "fillerKey");
    private final static QName _FillerValue_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "fillerValue");
    private final static QName _MsgRespuesta_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "msgRespuesta");
    private final static QName _NumeroIdentificacion_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "numeroIdentificacion");
    private final static QName _NumeroIntentos_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "numeroIntentos");
    private final static QName _State_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "state");
    private final static QName _TipoDocumento_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "tipoDocumento");
    private final static QName _TransactionId_QNAME = new QName("org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", "transactionId");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.itc.salesforce.sifi.xsd.commonbasiccomponents_2_1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "codRespuesta")
    public JAXBElement<String> createCodRespuesta(String value) {
        return new JAXBElement<String>(_CodRespuesta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "fillerKey")
    public JAXBElement<String> createFillerKey(String value) {
        return new JAXBElement<String>(_FillerKey_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "fillerValue")
    public JAXBElement<String> createFillerValue(String value) {
        return new JAXBElement<String>(_FillerValue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "msgRespuesta")
    public JAXBElement<String> createMsgRespuesta(String value) {
        return new JAXBElement<String>(_MsgRespuesta_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "numeroIdentificacion")
    public JAXBElement<BigDecimal> createNumeroIdentificacion(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NumeroIdentificacion_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "numeroIntentos")
    public JAXBElement<BigDecimal> createNumeroIntentos(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_NumeroIntentos_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "state")
    public JAXBElement<String> createState(String value) {
        return new JAXBElement<String>(_State_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "tipoDocumento")
    public JAXBElement<String> createTipoDocumento(String value) {
        return new JAXBElement<String>(_TipoDocumento_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:itc:salesforce:sifi:xsd:CommonBasicComponents-2-1", name = "transactionId")
    public JAXBElement<String> createTransactionId(String value) {
        return new JAXBElement<String>(_TransactionId_QNAME, String.class, null, value);
    }

}
