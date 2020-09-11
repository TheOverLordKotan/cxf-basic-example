	package org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.fachada;

import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;

import org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.ServicioSincronizarCliente;
import org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.SincronizarCrmUserFault;
import org.adarchitecture.ws.user.canal.common.aggregate.component.ResposeServiceType;
import org.adarchitecture.ws.user.canal.common.aggregate.component.SincronizarCrmUserRequestType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@WebService(targetNamespace = "http://org.adarchitecture/services/user/ServicioSincronizarCliente/V1", name = "ServicioSincronizarCliente")
@XmlSeeAlso({org.adarchitecture.ws.user.canal.common.aggregate.component.ObjectFactory.class, org.adarchitecture.ws.user.common.basic.ObjectFactory.class})
@Primary
public class ServicioSincronizarClienteFachadaWs implements ServicioSincronizarCliente{

	@Autowired
	ServicioSincronizarClienteFachada servicioSincronizarClienteFachada;
	

	@Override
	public ResposeServiceType sincronizarCrmUser(SincronizarCrmUserRequestType sincronizarCrmUserSafesRequest)
			throws SincronizarCrmUserFault {
		return servicioSincronizarClienteFachada.sincronizarCrmUser(sincronizarCrmUserSafesRequest);
		
	}

}
