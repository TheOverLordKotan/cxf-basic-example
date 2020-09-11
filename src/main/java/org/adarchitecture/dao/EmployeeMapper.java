/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.adarchitecture.dto.Employee;

/**
 *
 * <h1>EmployeeMapper</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
	@Mapper
	public interface EmployeeMapper {
		@Insert("INSERT INTO employee(name, lastname, tpDocument,nbDocument, fchBorn, fchIn, role, salary) " +
				" VALUES (#{name}, #{lastname}, #{tpDocument}, #{nbDocument}, #{fchBorn}, #{fchIn}, #{role}, #{salary})")
		int insert(Employee employee);
		@Select("SELECT * FROM employee")
		List<Employee> findAll();
		@Select("SELECT * FROM employee WHERE id = #{id}")
		Employee findById(@Param("id") long id);
		@Select("SELECT * FROM employee WHERE tpDocument = #{tpDocument} AND nbDocument = #{nbDocument}")
		Employee isPresentDocument(@Param("tpDocument") String tpDocument,@Param("nbDocument") String nbDocument);
		@Delete("DELETE FROM employee WHERE id = #{id}")
		int deleteById(@Param("id") long id);
	}
