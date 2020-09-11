/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.fachada.json;

import org.adarchitecture.ws.user.canal.common.aggregate.component.SincronizarCrmUserRequestType;

/**
 *
 * <h1>SincronizarCrmUserRequestTypeJson</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public class SincronizarCrmUserRequestTypeJson {
	
	private SincronizarCrmUserRequestType sincronizarCrmUserRequest;
	
	
	public SincronizarCrmUserRequestTypeJson(SincronizarCrmUserRequestType sincronizarCrmUserRequestR) {
		this.sincronizarCrmUserRequest = sincronizarCrmUserRequestR;
	}


	public SincronizarCrmUserRequestType getSincronizarCrmUserRequest() {
		return sincronizarCrmUserRequest;
	}


	public void setSincronizarCrmUserRequest(SincronizarCrmUserRequestType sincronizarCrmUserRequest) {
		this.sincronizarCrmUserRequest = sincronizarCrmUserRequest;
	}

	
	
}

