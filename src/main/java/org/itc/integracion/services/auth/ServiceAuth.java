/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.itc.integracion.services.auth;

import java.util.concurrent.Future;

import org.itc.integracion.services.sifi.servicioactualizarclientesafe.v1.ActualizarStateCrmSifiFault;
import org.itc.integracion.services.sifi.servicioactualizarclientesafe.v1.ServicioActualizarStateSafe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

/**
 *
 * <h1>ServiceAuth</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
@Component
public class ServiceAuth {

	@Autowired
	ServicioActualizarStateSafe client;
	/**
	 * Description
	 * JavaDoc
	 * @throws ActualizarStateCrmSifiFault 
	*/
	public Future<org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.ResposeServiceType> actualizarStateCrmSifi(org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.ActualizarCrmSifiSafeRequestType request) throws ActualizarStateCrmSifiFault {
		
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.ResposeServiceType response = null;
		

		//Inicio logica
		response  = client.actualizarStateCrmSifi(request);
		return new AsyncResult<org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.ResposeServiceType> (response);
	}
}
