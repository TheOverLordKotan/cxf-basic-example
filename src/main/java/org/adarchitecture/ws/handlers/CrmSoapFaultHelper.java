/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.ws.handlers;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.interceptor.Fault;
import org.adarchitecture.ws.util.FaultConst;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import lombok.extern.log4j.Log4j2;

/**
 *
 * <h1>CrmSoapFaultHelper</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
@Log4j2
public class CrmSoapFaultHelper {

	// private Constructor for Utility-Class
	private CrmSoapFaultHelper() {};
	
	
	
	public static void buildWeatherFaultAndSet2SoapMessage(SoapMessage message, FaultConst faultContent) {
		Fault exceptionFault = (Fault) message.getContent(Exception.class);
		String originalFaultMessage = exceptionFault.getMessage();
		exceptionFault.setMessage(faultContent.getMessage());
		exceptionFault.setDetail(createFaultDetailWithWeatherException(originalFaultMessage, faultContent));
		message.setContent(Exception.class, exceptionFault);
	}
	
	private static Element createFaultDetailWithWeatherException(String originalFaultMessage,  FaultConst faultContent) {
		Element weatherExceptionElementAppended = null;
		try {
			Document weatherExcecption = XmlUtils.marhallJaxbElementIntoDocument(CrmOutError.createWeatherException(faultContent, originalFaultMessage));
			// As the Root-Element is deleted while adding the WeatherException to the Fault-Details, we have to use a Workaround:
	    	// we append it to a new Element, which then gets deleted again
	    	weatherExceptionElementAppended = XmlUtils.appendAsChildElement2NewElement(weatherExcecption);
		} catch (Exception exception) {
			log.error("{} valores  {}", exception);
			// We don´t want an Exception in the Exceptionhandling
		}
		return weatherExceptionElementAppended;
	}

}