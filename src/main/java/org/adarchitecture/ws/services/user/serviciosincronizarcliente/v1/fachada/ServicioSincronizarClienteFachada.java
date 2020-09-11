package org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.fachada;

import org.adarchitecture.dao.EmployeeMapper;
import org.adarchitecture.dto.Employee;
import org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.SincronizarCrmUserFault;
import org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.fachada.json.SincronizarCrmUserRequestTypeJson;
import org.adarchitecture.ws.user.canal.common.aggregate.component.FaultServiceType;
import org.adarchitecture.ws.user.canal.common.aggregate.component.ResposeServiceType;
import org.adarchitecture.ws.user.canal.common.aggregate.component.SincronizarCrmUserRequestType;
import org.adarchitecture.ws.user.common.basic.CodRespuestaType;
import org.adarchitecture.ws.user.common.basic.MsjRespuestaType;
import org.adarchitecture.ws.util.ConstantesCrm;
import org.adarchitecture.ws.util.ConvertidorUtil;
import org.adarchitecture.ws.util.UtilGenerateDtoRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j2;

@Component
@Log4j2
public class ServicioSincronizarClienteFachada {
	
	
	private static final String PROCESO_LOG = "ServicioSincronizarClienteFachada-";


	@Autowired
	UtilGenerateDtoRequest utilGenerateDtoRequest;
	@Autowired
	EmployeeMapper aEmployeeMapper;
	

	public ResposeServiceType sincronizarCrmUser(SincronizarCrmUserRequestType sincronizarCrmUserRequest) throws SincronizarCrmUserFault {
		
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		 */
		log.warn("################################################## {} ##################################################",PROCESO_LOG);
		String requestUser = "La rquest";
		String request ="";	
		ResposeServiceType respuestaServicio = null;
		FaultServiceType serviceExcep = null;
		SincronizarCrmUserFault exection = null;
		Employee isEmployee = null;
		int newEmployee = 0;
		String codResp="Error";
		String msjResp="Error Cant not create the user";
		SincronizarCrmUserRequestTypeJson AdminClientePJRequestJson = new SincronizarCrmUserRequestTypeJson(sincronizarCrmUserRequest);
		try {
			request = utilGenerateDtoRequest.toMessage(AdminClientePJRequestJson);
			log.info(" {} obtuve el siguiente request {}",PROCESO_LOG,request.toString());
		} catch (Exception e1) {
			log.error(" {} obtuve el siguiente error en el request  {} ",PROCESO_LOG,e1.toString());
			request = null;
		}
		
		/*
		  * =====================================
		  * Este if se encarga de el request
		  * no sea null
		  * =====================================
		*/
		if (request!=null) {
			requestUser = request.toString();
		}
		/*
		 * =====================================
		 * Este try catch se encarga de realizar 
		 * la evaluacion de un error grave en 
		 * los servicios de negocio
		 * =====================================
		 */
		try {
			log.info("obtuve el siguiente request {}",requestUser);
			/*
			 * =====================================
			 * se crea el type de control
			 * para realizar la transaccion
			 * de User core
			 * =====================================
			 */
			 isEmployee = aEmployeeMapper.isPresentDocument(sincronizarCrmUserRequest.getClienteCrm().getTipoDocumento().getValue(),sincronizarCrmUserRequest.getClienteCrm().getNumeroIdentificacion().getValue().toString());
			/*
			  * =====================================
			  * Este if se encarga de evaluar 
			  * la respuesta de User Core 
			  * no es una respuesta null
			  * =====================================
			*/
			 respuestaServicio = new ResposeServiceType();
			if (isEmployee==null) {
				log.info(" {} obtuve de  User core del type erro de los servicios ",PROCESO_LOG,sincronizarCrmUserRequest.toString());
				MsjRespuestaType idUser = new MsjRespuestaType();
				Employee newEmploqye= new Employee();
				newEmploqye.setId(0);
				newEmploqye.setName(sincronizarCrmUserRequest.getClienteCrm().getPrimerNombre().getValue());
				newEmploqye.setLastname(sincronizarCrmUserRequest.getClienteCrm().getPrimerApellido().getValue());
				newEmploqye.setFchBorn(ConvertidorUtil.convertirFechaDateGregorianString(sincronizarCrmUserRequest.getClienteCrm().getFchNacimiento().getValue(), ConvertidorUtil.FORMATO_FECHA_SIN_HORA));
				newEmploqye.setFchIn(ConvertidorUtil.convertirFechaDateGregorianString(sincronizarCrmUserRequest.getClienteCrm().getFchVinc().getValue(), ConvertidorUtil.FORMATO_FECHA_SIN_HORA));
				newEmploqye.setNbDocument(sincronizarCrmUserRequest.getClienteCrm().getNumeroIdentificacion().getValue().toString());
				newEmploqye.setTpDocument(sincronizarCrmUserRequest.getClienteCrm().getTipoDocumento().getValue());
				newEmploqye.setRole(sincronizarCrmUserRequest.getClienteCrm().getCargo().getValue());
				newEmploqye.setSalary(sincronizarCrmUserRequest.getClienteCrm().getSalario().getValue().toString());
				newEmployee = aEmployeeMapper.insert(newEmploqye);
				idUser.setValue(String.valueOf(newEmployee));
				respuestaServicio.setIdUser(idUser);
				codResp="OK";
				msjResp="OK registrando el cliente";
				log.info(" {} envio de  User core del type respuestaServicio de los servicios {} ",PROCESO_LOG,respuestaServicio.toString());
			}else {
				log.error(" {} error no obtuve de  User core del type erro de los servicios {}",PROCESO_LOG,isEmployee);
			}
			
			CodRespuestaType ad1 = new CodRespuestaType();
			ad1.setValue(codResp);
			respuestaServicio.setCodRespuesta(ad1);
			respuestaServicio.setCodRespuestaEquivalente(ad1);
			MsjRespuestaType ad = new MsjRespuestaType();
			ad.setValue(msjResp);
			respuestaServicio.setMsgRespuesta(ad);
		} catch (Exception e) {
			log.error(" {} error no obtuve de  User core del type  de los servicios {} ",PROCESO_LOG,e.toString());

			serviceExcep = new FaultServiceType();
		    CodRespuestaType codRespuestaFault = new CodRespuestaType();
		    codRespuestaFault.setValue(ConstantesCrm.CODERESPUESTAERROR);
		    MsjRespuestaType msgRespuestaFault = new MsjRespuestaType();
		    /*
			  * =====================================
			  * Este if se encarga de evaluar la respuesta null
			  * =====================================
			*/
		    String valError= ConstantesCrm.MSGRESPUESTA;
			if (getRootException(e).getLocalizedMessage()==null) {
				 msgRespuestaFault.setValue(valError);
			}else {
				if (!getRootException(e).getLocalizedMessage().isEmpty()) {
					valError = getRootException(e).getLocalizedMessage();
				}
				 msgRespuestaFault.setValue(valError);
			}
		   
		    serviceExcep.setCodRespuesta(codRespuestaFault);
		    serviceExcep.setMsgRespuesta(msgRespuestaFault);
			exection = new SincronizarCrmUserFault(msgRespuestaFault.getValue(),serviceExcep);
		    log.info(" {} envio de  User core del type serviceExcep de los servicios ",PROCESO_LOG,serviceExcep.toString());
			throw exection;
		}
		return respuestaServicio;

	}
	public static Throwable getRootException(Throwable exception){
		Throwable rootException=exception;
		while(rootException.getCause()!=null){
			rootException = rootException.getCause();
		}
		return rootException;
	}
}
