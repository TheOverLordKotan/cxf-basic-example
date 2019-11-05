package org.itc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication; 

@SpringBootApplication 
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
    
    /*	@Autowired
	private Bus bus;
	
	@Value("${spring.datasource.jndi-name}")
	private String jndiDS;
	
	@Value("${driverClassName}")
	String driverClassName;
	@Value("${url}")
	String url;
	@Value("${username}")
	String username;
	@Value("${password}")
	String password;
	

	
    @Bean
    @Profile({ "IntegracionesSifiAgraria" })
    public TomcatServletWebServerFactory tomcatFactory( ) {
        return new TomcatServletWebServerFactory() {
            @Override
            protected TomcatWebServer getTomcatWebServer(org.apache.catalina.startup.Tomcat tomcat) {
                tomcat.enableNaming();
                return super.getTomcatWebServer(tomcat);
            }

            @Override
            protected void postProcessContext(Context context) {
                ContextResource resource = new ContextResource();           
                //resource.setProperty("factory", "org.apache.tomcat.jdbc.pool.DataSourceFactory");
                resource.setName("java:comp/env/"+jndiDS);///IntegracionSalesForceSifi");
                resource.setType(DataSource.class.getName());
                resource.setProperty("driverClassName", driverClassName);
                resource.setProperty("url", url);
                resource.setProperty("username", username);
                resource.setProperty("password", password);
                context.getNamingResources().addResource(resource);
            }
        };
    }
	@Bean
	@Profile({ "IntegracionesSifiAgraria" })
	public DataSource dataSource() throws IllegalArgumentException, NamingException {
	       JndiObjectFactoryBean bean = new JndiObjectFactoryBean();
	        bean.setJndiName("java:comp/env/"+jndiDS);
	        //bean.setResourceRef(true); // this was previously uncommented
	        bean.setProxyInterface(DataSource.class);
	        //bean.setLookupOnStartup(false); // this was previously uncommented
	        bean.afterPropertiesSet();
	        return (DataSource)bean.getObject();
	}

	@Profile({ "IntegracionesSifiAgrariaTest" })
	@Bean(destroyMethod = "", name = "dataSource")
	public DataSource getDataSourceTest() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@172.27.11.232:1599:NSOPORTE");
		dataSource.setUsername("is_appia");
		dataSource.setPassword("is_appia");

		return dataSource;

	}
	
	@Bean
	public Endpoint endpointServicioSincronizarCliente(ServicioSincronizarClienteFachadaWs endpointServicioSincronizarCliente) {
		EndpointImpl endpoint = new EndpointImpl(bus, endpointServicioSincronizarCliente);
		endpoint.getProperties().put("ws-security.callback-handler", new ServerPasswordCallbackHandler());
		endpoint.publish("/ServicioSalesForceInteSifi");
		endpoint.getOutFaultInterceptors().add(soapInterceptor());
		return endpoint;
	}
	@Bean
	public Endpoint endpointServicioSifiUpdateSafe(ServicioActualizarClienteSafeFachadaWS endpointServicioSifiUpdateSafe) {
		EndpointImpl endpoint = new EndpointImpl(bus, endpointServicioSifiUpdateSafe);
		endpoint.publish("/ServicioSifiUpdateSafe");
		endpoint.getOutFaultInterceptors().add(soapInterceptor());
		return endpoint;
	}	

    @Bean
    public AbstractSoapInterceptor soapInterceptor() {
        return new ValidationInterceptor();
    }
	
	public static void main(String[] args) {
		SpringApplication.run(IntegracionesSifiAgrariaWebApplication.class, args);
	}
	*/
}
