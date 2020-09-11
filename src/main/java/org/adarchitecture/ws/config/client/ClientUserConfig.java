/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.ws.config.client;

import org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.ServicioSincronizarCliente;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * <h1>ClientAuthConfig</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
@Configuration
public class ClientUserConfig {

	@Value("${safesforce.ws.user.url}")
	private String address;

	@Bean(name = "helloWorldProxy")
	public ServicioSincronizarCliente helloWorldProxy() {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
				new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(ServicioSincronizarCliente.class);
		jaxWsProxyFactoryBean.setAddress(address);

		return (ServicioSincronizarCliente) jaxWsProxyFactoryBean.create();
	}
}