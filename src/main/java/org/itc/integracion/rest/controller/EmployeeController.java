package org.itc.integracion.rest.controller;

import java.math.BigDecimal;
import java.net.URI;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.itc.integracion.rest.dao.EmployeeDAO;
import org.itc.integracion.rest.model.Employee;
import org.itc.integracion.rest.model.Employees;
import org.itc.integracion.services.auth.ServiceAuth;
import org.itc.integracion.services.sifi.servicioactualizarclientesafe.v1.ActualizarStateCrmSifiFault;
import org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.ActualizarCrmSifiSafeRequestType;
import org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.NodeType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
@RequestMapping(path = "/employees")
public class EmployeeController 
{
    @Autowired
    private EmployeeDAO employeeDao;
    
    @Autowired
    private ServiceAuth serviceAuth;    
    
    @GetMapping(path="/", produces = "application/json")
    public Employees getEmployees() 
    {		try {
    	Future<org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.ResposeServiceType> futureClienteAgraSifiSafeForce;
    	org.itc.salesforce.sifi.schema.xsd.commonaggregatecomponents_2_1.ResposeServiceType response = null;
    	ActualizarCrmSifiSafeRequestType request = new ActualizarCrmSifiSafeRequestType();
    	NodeType value = new NodeType();
    	value.setNumeroIdentificacion(new BigDecimal("212"));
    	value.setNumeroIntentos(new BigDecimal("212"));
    	value.setState("RD");
    	value.setTipoDocumento("CC");
    	value.setTransactionId("52121");
    	request.setStateNode(value);
    	futureClienteAgraSifiSafeForce = serviceAuth.actualizarStateCrmSifi(request);

    	response = futureClienteAgraSifiSafeForce.get();
    	System.out.println(response);
    } catch (InterruptedException | ExecutionException e) {
    	// TODO Auto-generated catch block
    	e.printStackTrace();
    } catch (ActualizarStateCrmSifiFault e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    return employeeDao.getAllEmployees();
    }
    
    @GetMapping(path="/Auth", produces = "application/json")
    public Employees getAuth() 
    {
    	
        return employeeDao.getAllEmployees();
    }
    
    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public ResponseEntity<Object> addEmployee(
                        @RequestHeader(name = "X-COM-PERSIST", required = true) String headerPersist,
                        @RequestHeader(name = "X-COM-LOCATION", required = false, defaultValue = "ASIA") String headerLocation,
                        @RequestBody Employee employee) 
                 throws Exception 
    {       
        //Generate resource id
        Integer id = employeeDao.getAllEmployees().getEmployeeList().size() + 1;
        employee.setId(id);
        
        //add resource
        employeeDao.addEmployee(employee);
        
        //Create resource location
        URI location = ServletUriComponentsBuilder.fromCurrentRequest()
                                    .path("/{id}")
                                    .buildAndExpand(employee.getId())
                                    .toUri();
        
        //Send location in response
        return ResponseEntity.created(location).build();
    }
}
