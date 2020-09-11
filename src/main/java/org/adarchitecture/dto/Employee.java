/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.dto;

import javax.validation.constraints.Size;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 * <h1>Employee</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
@Data
@ApiModel(description="All details about the Users Employee. ")
public class Employee {
    private int id;
	@ApiModelProperty(notes="name should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="name unique value related to integration value ")
    private String name;
	@ApiModelProperty(notes="lastname should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="lastname unique value related to integration value ")
    private String lastname;
	@ApiModelProperty(notes="tpDocument should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="tpDocument unique value related to integration value ")
    private String tpDocument;
	@ApiModelProperty(notes="nbDocument should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="nbDocument unique value related to integration value ")
    private String nbDocument;
	@ApiModelProperty(notes="fchBorn should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="fchBorn unique value related to integration value ")
    private String fchBorn;
	@ApiModelProperty(notes="fchIn should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="fchIn unique value related to integration value ")
    private String fchIn;
	@ApiModelProperty(notes="role should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="role unique value related to integration value ")
    private String role;
	@ApiModelProperty(notes="salary should have at least 2 characters and max 49")
	@Size(min=2,max = 49, message="salary unique value related to integration value ")
    private String salary;
    
    //getters and setters
}