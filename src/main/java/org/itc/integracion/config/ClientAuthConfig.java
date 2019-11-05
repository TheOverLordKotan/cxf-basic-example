/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.itc.integracion.config;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.itc.integracion.services.sifi.servicioactualizarclientesafe.v1.ServicioActualizarStateSafe;
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
public class ClientAuthConfig {

	@Value("${client.url}")
	private String address;

	@Bean(name = "helloWorldProxy")
	public ServicioActualizarStateSafe helloWorldProxy() {
		JaxWsProxyFactoryBean jaxWsProxyFactoryBean =
				new JaxWsProxyFactoryBean();
		jaxWsProxyFactoryBean.setServiceClass(ServicioActualizarStateSafe.class);
		jaxWsProxyFactoryBean.setAddress(address);

		return (ServicioActualizarStateSafe) jaxWsProxyFactoryBean.create();
	}
}