/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.ws.handlers;

import javax.xml.bind.JAXBElement;

import org.adarchitecture.ws.user.canal.common.aggregate.component.FaultServiceType;
import org.adarchitecture.ws.user.common.basic.CodRespuestaType;
import org.adarchitecture.ws.user.common.basic.MsjRespuestaType;
import org.adarchitecture.ws.util.ConstantesCrm;
import org.adarchitecture.ws.util.FaultConst;

/**
 *
 * <h1>CrmOutError</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public class CrmOutError {

	private CrmOutError() {
	 // private Constructor for Utility-Class
	};
	
	private static final org.adarchitecture.ws.user.canal.common.aggregate.component.ObjectFactory objectFactoryDatatypes = new org.adarchitecture.ws.user.canal.common.aggregate.component.ObjectFactory();
	
	public static JAXBElement<FaultServiceType> createWeatherException(FaultConst faultContent, String originalFaultMessage) {
		
	
		// Build SOAP-Fault detail <datatypes:WeatherException>
		FaultServiceType weatherException = objectFactoryDatatypes.createFaultServiceType();	
		weatherException = new FaultServiceType();
	    CodRespuestaType codRespuestaFault = new CodRespuestaType();
	    codRespuestaFault.setValue(ConstantesCrm.CODERESPUESTAERROR);
	    MsjRespuestaType msgRespuestaFault = new MsjRespuestaType();
	    msgRespuestaFault.setValue(ConstantesCrm.CODEMENSAJEERRORF);
	   
		weatherException.setCodRespuesta(codRespuestaFault);
		weatherException.setMsgRespuesta(msgRespuestaFault);
		JAXBElement<FaultServiceType> weatherExceptionf = objectFactoryDatatypes.createSincronizarCrmUserFault(weatherException);
		return weatherExceptionf;
	}

}
