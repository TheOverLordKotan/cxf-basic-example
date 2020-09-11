/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.ws.util;

/**
 *
 * <h1>FaultConst</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public enum FaultConst {

	SUCCESSFULL_PROCESSING("01", "Proceso OK"),
	SCHEME_VALIDATION_ERROR("07", "Existen campos con valores de un tipo distinto al del servicio."),
	SYNTACTICALLY_INCORRECT_XML_ERROR("08", "Xml erroneo sintacticamente."),	
	BACKEND_PROCESSING_FAILED("04", "Proceso en capa media incorrecto.");

	private String id;
	private String message;
	
	private FaultConst(String id, String text) {
		this.id = id;
		this.message = text;
	}
	
	public String getMessage() {
		return message;
	}
	
	public String getId() {
		return id;
	}
	
}
