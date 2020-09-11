
package org.adarchitecture.ws.user.common.basic;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.adarchitecture.user.common.basic package. 
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

    private final static QName _TipoDocumento_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "tipoDocumento");
    private final static QName _NumeroIdentificacion_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "numeroIdentificacion");
     private final static QName _PrimerApellido_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "primerApellido");
    private final static QName _SegundoApellido_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "segundoApellido");
    private final static QName _PrimerNombre_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "primerNombre");
    private final static QName _SegundoNombre_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "segundoNombre");
   private final static QName _TipoPersona_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "tipoPersona");
 private final static QName _FechaCreacion_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "fechaCreacion");
private final static QName _CodRespuesta_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "codRespuesta");
    private final static QName _CodRespuestaEquivalente_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "codRespuestaEquivalente");
    private final static QName _MsgRespuesta_QNAME = new QName("org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", "msgRespuesta");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.adarchitecture.user.common.basic
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TipoDocumentoType }
     * 
     */
    public TipoDocumentoType createTipoDocumentoType() {
        return new TipoDocumentoType();
    }

    /**
     * Create an instance of {@link NumeroDocumentoType }
     * 
     */
    public NumeroDocumentoType createNumeroDocumentoType() {
        return new NumeroDocumentoType();
    }


    /**
     * Create an instance of {@link PrimerApellidoType }
     * 
     */
    public PrimerApellidoType createPrimerApellidoType() {
        return new PrimerApellidoType();
    }

    /**
     * Create an instance of {@link SegundoApellidoType }
     * 
     */
    public SegundoApellidoType createSegundoApellidoType() {
        return new SegundoApellidoType();
    }

    /**
     * Create an instance of {@link PrimerNombreType }
     * 
     */
    public PrimerNombreType createPrimerNombreType() {
        return new PrimerNombreType();
    }

    /**
     * Create an instance of {@link SegundoNombreType }
     * 
     */
    public SegundoNombreType createSegundoNombreType() {
        return new SegundoNombreType();
    }


    /**
     * Create an instance of {@link TipoPersonaType }
     * 
     */
    public TipoPersonaType createTipoPersonaType() {
        return new TipoPersonaType();
    }

 

    /**
     * Create an instance of {@link CreateDateType }
     * 
     */
    public CreateDateType createCreateDateType() {
        return new CreateDateType();
    }

 

    /**
     * Create an instance of {@link CodRespuestaType }
     * 
     */
    public CodRespuestaType createCodRespuestaType() {
        return new CodRespuestaType();
    }

    /**
     * Create an instance of {@link MsjRespuestaType }
     * 
     */
    public MsjRespuestaType createMsjRespuestaType() {
        return new MsjRespuestaType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoDocumentoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "tipoDocumento")
    public JAXBElement<TipoDocumentoType> createTipoDocumento(TipoDocumentoType value) {
        return new JAXBElement<TipoDocumentoType>(_TipoDocumento_QNAME, TipoDocumentoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumeroDocumentoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "numeroIdentificacion")
    public JAXBElement<NumeroDocumentoType> createNumeroIdentificacion(NumeroDocumentoType value) {
        return new JAXBElement<NumeroDocumentoType>(_NumeroIdentificacion_QNAME, NumeroDocumentoType.class, null, value);
    }



    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimerApellidoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "primerApellido")
    public JAXBElement<PrimerApellidoType> createPrimerApellido(PrimerApellidoType value) {
        return new JAXBElement<PrimerApellidoType>(_PrimerApellido_QNAME, PrimerApellidoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegundoApellidoType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "segundoApellido")
    public JAXBElement<SegundoApellidoType> createSegundoApellido(SegundoApellidoType value) {
        return new JAXBElement<SegundoApellidoType>(_SegundoApellido_QNAME, SegundoApellidoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PrimerNombreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "primerNombre")
    public JAXBElement<PrimerNombreType> createPrimerNombre(PrimerNombreType value) {
        return new JAXBElement<PrimerNombreType>(_PrimerNombre_QNAME, PrimerNombreType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SegundoNombreType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "segundoNombre")
    public JAXBElement<SegundoNombreType> createSegundoNombre(SegundoNombreType value) {
        return new JAXBElement<SegundoNombreType>(_SegundoNombre_QNAME, SegundoNombreType.class, null, value);
    }



    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TipoPersonaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "tipoPersona")
    public JAXBElement<TipoPersonaType> createTipoPersona(TipoPersonaType value) {
        return new JAXBElement<TipoPersonaType>(_TipoPersona_QNAME, TipoPersonaType.class, null, value);
    }

   
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDateType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "fechaCreacion")
    public JAXBElement<CreateDateType> createFechaCreacion(CreateDateType value) {
        return new JAXBElement<CreateDateType>(_FechaCreacion_QNAME, CreateDateType.class, null, value);
    }

    
    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodRespuestaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "codRespuesta")
    public JAXBElement<CodRespuestaType> createCodRespuesta(CodRespuestaType value) {
        return new JAXBElement<CodRespuestaType>(_CodRespuesta_QNAME, CodRespuestaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CodRespuestaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "codRespuestaEquivalente")
    public JAXBElement<CodRespuestaType> createCodRespuestaEquivalente(CodRespuestaType value) {
        return new JAXBElement<CodRespuestaType>(_CodRespuestaEquivalente_QNAME, CodRespuestaType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MsjRespuestaType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", name = "msgRespuesta")
    public JAXBElement<MsjRespuestaType> createMsgRespuesta(MsjRespuestaType value) {
        return new JAXBElement<MsjRespuestaType>(_MsgRespuesta_QNAME, MsjRespuestaType.class, null, value);
    }

}
