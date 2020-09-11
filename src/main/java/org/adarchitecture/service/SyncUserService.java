package org.adarchitecture.service;

import org.adarchitecture.dto.CreateEmployeeDto;
import org.adarchitecture.dto.SyncUserResposeDto;

public interface SyncUserService {

	SyncUserResposeDto syncUserIntegration(CreateEmployeeDto createEmployeeDto)throws Exception;

}
