package org.adarchitecture.api;

import org.adarchitecture.aspect.ResponseSuccess;
import org.adarchitecture.dto.CreateEmployeeDto;
import org.adarchitecture.dto.SyncUserResposeDto;
import org.adarchitecture.http.ApiBaseResponse;
import org.adarchitecture.http.SuccessCode;
import org.adarchitecture.service.SyncUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/user")
@Api(value="/api/user",description="SyncUserService",produces ="application/json")
public class SyncUserApi {

	@Autowired
	private SyncUserService serviceSyncUserServiceImpl;
	@ApiOperation(value="syncUserIntegration",response=ApiBaseResponse.class)
	@ResponseSuccess(SuccessCode.OK_SCR001)
	@RequestMapping(value = "/trx/post/sync-user/v.1", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<SyncUserResposeDto> syncUserIntegration(
			@RequestHeader(name = HttpHeaders.ACCEPT_LANGUAGE, required = false) String locale,
			@RequestBody(required = true) CreateEmployeeDto p_dto) throws Exception {
		return new ResponseEntity<SyncUserResposeDto>(serviceSyncUserServiceImpl.syncUserIntegration(p_dto), HttpStatus.OK);
	}

}
