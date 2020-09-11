package org.adarchitecture.ws.user.salesforce.crm.web.comun;

import org.adarchitecture.IntegracionesUserWebApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(IntegracionesUserWebApplication.class);
	}

}
