package org.adarchitecture.serviceimpl;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

import org.adarchitecture.dto.CreateEmployeeDto;
import org.adarchitecture.dto.Employee;
import org.adarchitecture.dto.SyncUserResposeDto;
import org.adarchitecture.service.SyncUserService;
import org.adarchitecture.ws.client.ClientUser;
import org.adarchitecture.ws.util.ConvertidorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class SyncUserServiceImpl implements SyncUserService {

	@Autowired
	ClientUser aClientUser;
	@Override
	public SyncUserResposeDto syncUserIntegration(CreateEmployeeDto createEmployeeDto) throws Exception {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		 */
		SyncUserResposeDto resultBusiness = null;
		org.adarchitecture.ws.user.canal.common.aggregate.component.ResposeServiceType resultWs = null;
		/*
		 * =====================================
		 * Validate User
		 * =====================================
		 */
		try {
			//
			if (createEmployeeDto.getName()==null && !createEmployeeDto.getName().trim().isEmpty()) {
				throw new  Exception(String.format("Name '%s' has field Name null", "None Value or Null value"));
			}else if (createEmployeeDto.getLastname()==null && !createEmployeeDto.getLastname().trim().isEmpty()) {
				throw new  Exception(String.format("Lastname '%s' has field Lastname null", "None Value or Null value"));
			}else if (createEmployeeDto.getNbDocument()==null && !createEmployeeDto.getNbDocument().trim().isEmpty()) {
				throw new  Exception(String.format("NbDocument '%s' has field NbDocument null", "None Value or Null value"));
			}else if (createEmployeeDto.getTpDocument()==null && !createEmployeeDto.getTpDocument().trim().isEmpty()) {
				throw new  Exception(String.format("TpDocument '%s' has field TpDocument null", "None Value or Null value"));
			}else if (createEmployeeDto.getFchBorn()==null && !createEmployeeDto.getFchBorn().trim().isEmpty()) {
				throw new  Exception(String.format("FchBorn '%s' has field FchBorn null", "None Value or Null value"));
			}else if (createEmployeeDto.getFchIn()==null && !createEmployeeDto.getFchIn().trim().isEmpty()) {
				throw new  Exception(String.format("FchIn '%s' has field FchIn null", "None Value or Null value"));
			}else if (createEmployeeDto.getRole()==null && !createEmployeeDto.getRole().trim().isEmpty()) {
				throw new  Exception(String.format("Role '%s' has field Role null", "None Value or Null value"));
			}else if (createEmployeeDto.getSalary()==null && !createEmployeeDto.getSalary().trim().isEmpty()) {
				throw new  Exception(String.format("Salary '%s' has field Salary null", "None Value or Null value"));
			}else {
				/*
				  * =====================================
				  * Este if se encarga de validar
				  * la fecha del User
				  * =====================================
				*/
				Date date = new Date();
				Date date1=ConvertidorUtil.convertirFechaDateString(createEmployeeDto.getFchBorn(),ConvertidorUtil.FORMATO_FECHA_SIN_HORA);
				Date date2=ConvertidorUtil.convertirFechaDateString(createEmployeeDto.getFchIn(),ConvertidorUtil.FORMATO_FECHA_SIN_HORA);
				if (date1== null || date2==null) {
					throw new  Exception(String.format("FchBorn '%s' or FchIn '%s' invalid formatDate", "invalid Format"));
				}else {
					LocalDate birthDate = ConvertidorUtil.convertToLocalDateViaInstant(date1);
					LocalDate currentDate = ConvertidorUtil.convertToLocalDateViaInstant(date);
					LocalDate curent = ConvertidorUtil.convertToLocalDateViaInstant(date2);
					long diff = Math.abs(date.getTime() - date1.getTime());
					long diffDays = diff / (24 * 60 * 60 * 1000);
					System.out.println("Difference"+diffDays);
					int ages = ConvertidorUtil.calculateAge(birthDate, currentDate);
					if(ages > 18){
						resultWs = aClientUser.sincronizarCrmUser(createEmployeeDto.getName(), createEmployeeDto.getLastname(), createEmployeeDto.getTpDocument(), createEmployeeDto.getNbDocument(), createEmployeeDto.getFchBorn(), createEmployeeDto.getFchIn(), createEmployeeDto.getRole(), createEmployeeDto.getSalary());
						resultBusiness = new SyncUserResposeDto();
						/*
						  * =====================================
						  * Este if se encarga de evaluar la
						  * respuesta del dominio
						  * =====================================
						*/
						if (resultWs.getCodRespuesta().getValue().equals("OK")) {
						
							//
							Period p = Period.between(birthDate, currentDate);
							resultBusiness.setEdadActual(String.valueOf("You are " + p.getYears() + " years, " + p.getMonths() +
					                   " months and " + p.getDays() +
					                   " days old."));
							
							p = Period.between(curent, currentDate);
							resultBusiness.setTiempoVinculacion(String.valueOf("You are " + p.getYears() + " years, " + p.getMonths() +
					                   " months and " + p.getDays() +
					                   " days in the company."));
							resultBusiness.setRespStatusCode("success");
							Employee userIntegration = new Employee();
							userIntegration.setId(Integer.valueOf(resultWs.getIdUser().getValue()));
							userIntegration.setName(createEmployeeDto.getName());
							userIntegration.setLastname(createEmployeeDto.getLastname());
							userIntegration.setFchBorn(createEmployeeDto.getFchBorn());
							userIntegration.setFchIn(createEmployeeDto.getFchIn());
							userIntegration.setNbDocument(createEmployeeDto.getNbDocument());
							userIntegration.setTpDocument(createEmployeeDto.getTpDocument());
							userIntegration.setRole(createEmployeeDto.getRole());
							userIntegration.setSalary(createEmployeeDto.getSalary());
							resultBusiness.setUserIntegration(userIntegration);
						}else{
							throw new  Exception(String.format("The employee is ´present cant create it.."));
						}
					}else{
						throw new  Exception(String.format("The employee below 18.."));
					}
				}
				
			}
		} catch (Exception e) {
			throw new  Exception(String.format("The employee below 18.."));
		}
		return resultBusiness;
		
	}
}
