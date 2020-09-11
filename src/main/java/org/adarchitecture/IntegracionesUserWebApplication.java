package org.adarchitecture;

import javax.xml.ws.Endpoint;

import org.adarchitecture.ws.handlers.ValidationInterceptor;
import org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.ServicioSincronizarCliente;
import org.apache.cxf.Bus;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.scheduling.annotation.EnableAsync;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan("org.adarchitecture.*")
@EnableAsync
@Profile({"IntegracionesUser","IntegracionesUserTest"})
@PropertySources({    
    @PropertySource(value = "classpath:application.properties")
})

public class IntegracionesUserWebApplication {

	@Autowired
	private Bus bus;

	
	@Bean
	public Endpoint endpointServicioSincronizarCliente(ServicioSincronizarCliente servicioSincronizarCliente) {
		EndpointImpl endpoint = new EndpointImpl(bus, servicioSincronizarCliente);
		//endpoint.getProperties().put("ws-security.callback-handler", new ServerPasswordCallbackHandler());
		endpoint.publish("/ServicioSalesForceInteUser");
		endpoint.getOutFaultInterceptors().add(soapInterceptor());
		return endpoint;
	}
    @Bean
    public AbstractSoapInterceptor soapInterceptor() {
        return new ValidationInterceptor();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(IntegracionesUserWebApplication.class, args);
	}
	

}
