/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.ws.client;

import org.adarchitecture.ws.services.user.serviciosincronizarcliente.v1.ServicioSincronizarCliente;
import org.adarchitecture.ws.user.canal.common.aggregate.component.InfoGeneralType;
import org.adarchitecture.ws.user.canal.common.aggregate.component.SincronizarCrmUserRequestType;
import org.adarchitecture.ws.user.common.basic.CreateDateType;
import org.adarchitecture.ws.user.common.basic.NumeroDocumentoType;
import org.adarchitecture.ws.user.common.basic.PrimerApellidoType;
import org.adarchitecture.ws.user.common.basic.PrimerNombreType;
import org.adarchitecture.ws.user.common.basic.SegundoApellidoType;
import org.adarchitecture.ws.user.common.basic.TipoDocumentoType;
import org.adarchitecture.ws.user.common.basic.TipoPersonaType;
import org.adarchitecture.ws.util.ConvertidorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * <h1>ClientAuth</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
@Component	
public class ClientUser {

	@Autowired
	ServicioSincronizarCliente serviceUser;
	/**
	 * cliente del servicio
	 * de User
	 * @param name
	 * @param lastname
	 * @param tpDocument
	 * @param nbDocument
	 * @param fchBorn
	 * @param fchIn
	 * @param role
	 * @param salary
	 * @return
	 * @throws Exception
	 */
	public org.adarchitecture.ws.user.canal.common.aggregate.component.ResposeServiceType sincronizarCrmUser(
			String name, String lastname, String tpDocument, String nbDocument,String fchBorn,String fchIn,String role,String salary
			) throws Exception{

		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		 */
		org.adarchitecture.ws.user.canal.common.aggregate.component.ResposeServiceType result = null;


		//Inicio logica
		/*
		 * =====================================
		 * Este if se encarga de validar la no 
		 * nullalidad de username and password
		 * =====================================
		 */
		if (tpDocument!=null && nbDocument!=null) {
			/*
			 * =====================================
			 * Este if se encarga de varificar que los
			 * campos contengan un cuerpo
			 * =====================================
			 */
			if (!nbDocument.isEmpty() && !nbDocument.isEmpty()) {

				SincronizarCrmUserRequestType sincronizarCrmUserSafesRequest = new SincronizarCrmUserRequestType();
				InfoGeneralType value;
				value = new InfoGeneralType();
				TipoPersonaType cargo = new TipoPersonaType();
				cargo.setValue(role);
				value.setCargo(cargo);
				CreateDateType fchNacimiento = new CreateDateType();
				fchNacimiento.setValue(ConvertidorUtil.convertirFechaDateGregorianToXMLGregorianCalendar(fchBorn, ConvertidorUtil.FORMATO_FECHA_SIN_HORA));
				value.setFchNacimiento(fchNacimiento);
				CreateDateType fchVinc = new CreateDateType();
				fchVinc.setValue(ConvertidorUtil.convertirFechaDateGregorianToXMLGregorianCalendar(fchIn, ConvertidorUtil.FORMATO_FECHA_SIN_HORA));
				value.setFchVinc(fchVinc);
				NumeroDocumentoType numeroIdentificacion = new NumeroDocumentoType();
				numeroIdentificacion.setValue(ConvertidorUtil.convertirBigDecimal(nbDocument));
				value.setNumeroIdentificacion(numeroIdentificacion);
				TipoDocumentoType tipoDocumento = new TipoDocumentoType();
				tipoDocumento.setValue(tpDocument);
				value.setTipoDocumento(tipoDocumento);
				PrimerApellidoType primerApellido = new PrimerApellidoType();
				primerApellido.setValue(lastname);
				value.setPrimerApellido(primerApellido);
				SegundoApellidoType segundoApellido = new SegundoApellidoType();
				segundoApellido.setValue(lastname);
				value.setSegundoApellido(segundoApellido);
				PrimerNombreType primerNombre = new PrimerNombreType();
				primerNombre.setValue(name);
				value.setPrimerNombre(primerNombre);
				NumeroDocumentoType salario = new NumeroDocumentoType();
				salario.setValue(ConvertidorUtil.convertirBigDecimal(salary));
				value.setSalario(salario);
				sincronizarCrmUserSafesRequest.setClienteCrm(value);
				
				result= serviceUser.sincronizarCrmUser(sincronizarCrmUserSafesRequest);

			}else {
				throw new Exception("Not Usernamae or Password value");
			}

		}else {
			throw new Exception("Not Usernamae or Password");
		}


		return result; 
	}
}
