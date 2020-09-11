package org.adarchitecture.http;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class ApiErrorResponse {
	
	@Autowired
	private MessageSource messageSource;
	
	

	public String getErrorMessage(String errorCode, Locale locale) {
		return messageSource.getMessage(errorCode, null, locale);
	}
    
}
