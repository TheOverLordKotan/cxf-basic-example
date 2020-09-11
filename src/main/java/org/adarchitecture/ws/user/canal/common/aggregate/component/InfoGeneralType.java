
package org.adarchitecture.ws.user.canal.common.aggregate.component;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.adarchitecture.ws.user.common.basic.CreateDateType;
import org.adarchitecture.ws.user.common.basic.NumeroDocumentoType;
import org.adarchitecture.ws.user.common.basic.PrimerApellidoType;
import org.adarchitecture.ws.user.common.basic.PrimerNombreType;
import org.adarchitecture.ws.user.common.basic.SegundoApellidoType;
import org.adarchitecture.ws.user.common.basic.SegundoNombreType;
import org.adarchitecture.ws.user.common.basic.TipoDocumentoType;
import org.adarchitecture.ws.user.common.basic.TipoPersonaType;


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
 * <p>Clase Java para InfoGeneralType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="InfoGeneralType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}tipoDocumento"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}numeroIdentificacion"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}primerApellido" minOccurs="0"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}segundoApellido" minOccurs="0"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}primerNombre"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}segundoNombre" minOccurs="0"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}tipoAuxiliar"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}tipoPersona"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}claUsercacionTributaria"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}codActividad"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}exceptoContrExp"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}reteFuente"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}numeroDirecciones"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}origenRecursos"/&gt;
 *         &lt;element ref="{org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2}segmentoCliente"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InfoGeneralType", propOrder = {
    "primerNombre",
    "segundoApellido",
    "primerApellido",
    "segundoNombre",
    "tipoDocumento",
    "numeroIdentificacion",
    "fchNacimiento",
    "fchVinc",
    "cargo",
    "salario"
})
public class InfoGeneralType {
	
    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected PrimerNombreType primerNombre;
    
    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2")
    protected SegundoApellidoType segundoApellido;

    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2")
    protected PrimerApellidoType primerApellido;
    
    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2")
    protected SegundoNombreType segundoNombre;
    
    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected TipoDocumentoType tipoDocumento;
    
    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected NumeroDocumentoType numeroIdentificacion;

    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected CreateDateType fchNacimiento;
    
    
    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected CreateDateType fchVinc;


    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected TipoPersonaType cargo;
    
    @XmlElement(namespace = "org:adarchitecture:salesforce:user:xsd:CommonBasicComponents-2", required = true)
    protected NumeroDocumentoType salario;
    


	public PrimerNombreType getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(PrimerNombreType primerNombre) {
		this.primerNombre = primerNombre;
	}

	public SegundoApellidoType getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(SegundoApellidoType segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public PrimerApellidoType getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(PrimerApellidoType primerApellido) {
		this.primerApellido = primerApellido;
	}

	public SegundoNombreType getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(SegundoNombreType segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public TipoDocumentoType getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumentoType tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public NumeroDocumentoType getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(NumeroDocumentoType numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public CreateDateType getFchNacimiento() {
		return fchNacimiento;
	}

	public void setFchNacimiento(CreateDateType fchNacimiento) {
		this.fchNacimiento = fchNacimiento;
	}

	public CreateDateType getFchVinc() {
		return fchVinc;
	}

	public void setFchVinc(CreateDateType fchVinc) {
		this.fchVinc = fchVinc;
	}

	public TipoPersonaType getCargo() {
		return cargo;
	}

	public void setCargo(TipoPersonaType cargo) {
		this.cargo = cargo;
	}

	public NumeroDocumentoType getSalario() {
		return salario;
	}

	public void setSalario(NumeroDocumentoType salario) {
		this.salario = salario;
	} 
}
