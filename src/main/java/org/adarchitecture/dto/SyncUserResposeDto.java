package org.adarchitecture.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.adarchitecture.http.ApiBaseResponse;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
@Data()
@EqualsAndHashCode(callSuper=false)
@NoArgsConstructor
@AllArgsConstructor
public class SyncUserResposeDto extends ApiBaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4477191503251121296L;
	
	@ApiModelProperty(notes="userIntegration should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="userIntegration unique value related to integration value ")
	private Employee userIntegration;
	
	@ApiModelProperty(notes="tiempoVinculacion should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="tiempoVinculacion unique value related to integration value ")

	private String tiempoVinculacion;
	@ApiModelProperty(notes="edadActual should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="edadActual unique value related to integration value ")

	private String edadActual;
	

}
