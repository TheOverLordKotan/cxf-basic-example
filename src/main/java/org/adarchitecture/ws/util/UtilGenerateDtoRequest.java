/*
 * MIT License 
 * 
 * Copyright (c) 2018 Ownk
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 */

package org.adarchitecture.ws.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.log4j.Log4j2;

/**
 *
 * <h1>UtilGenerateDtoRequest</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */

@Component
@Log4j2
public class UtilGenerateDtoRequest {
	private static final String PROCESO_LOG = "UtilGenerateDtoRequest - ";
   @Autowired
   private ObjectMapper mapper;

   /**
    * Converts message to JSON. Used mostly by {@link org.springframework.jms.core.JmsTemplate}
    */
   public String toMessage(Object object) throws Exception {
       String json= null;

       try {
           json = mapper.writeValueAsString(object);
       } catch (Exception e) {
       	log.error(PROCESO_LOG +" "+"error no obtuve de conversion User core del type  de los servicios {} ",e.toString());
       	json = "No generated Json Object";
       }


       return json;
   }
   
   
   /**
    * Converts message to JSON. Used mostly by {@link org.springframework.jms.core.JmsTemplate}
    */
   public String toMessageTypeRequestService(Object object) throws Exception {
       String json= null;

       try {
           json = mapper.writeValueAsString(object);
       } catch (Exception e) {
       	log.error(PROCESO_LOG +" "+"error no obtuve de conversion User core del type  de los servicios {} ",e.toString());
       	json = "No generated Json Object";
       }


       return json;
   }
   
   /**
    * Converts message to JSON. Used mostly by {@link org.springframework.jms.core.JmsTemplate}
    */
   public String toMessageTypeToServiceUserCore(Object object) throws Exception {
       String json= null;

       try {
           json = mapper.writeValueAsString(object);
       } catch (Exception e) {
       	log.error(PROCESO_LOG +" "+"error no obtuve de conversion User core del type  de los servicios {} ",e.toString());
       	json = "No generated Json Object";
       }


       return json;
   }

   /**
    * Converts message to JSON. Used mostly by {@link org.springframework.jms.core.JmsTemplate}
    */
   public String toMessageTypeMapUserCore(Object object) throws Exception {
       String json= null;

       try {
           json = mapper.writeValueAsString(object);
       } catch (Exception e) {
       	log.error(PROCESO_LOG +" "+"error no obtuve de conversion User core del type  de los servicios {} ",e.toString());
       	json = "No generated Json Object";
       }


       return json;
   }
   

   /**
    * Converts message to JSON. Used mostly by {@link org.springframework.jms.core.JmsTemplate}
    */
   public String toMessageTypeOutServiceUserCore(Object object) throws Exception {
       String json= null;

       try {
           json = mapper.writeValueAsString(object);
       } catch (Exception e) {
       	log.error(PROCESO_LOG +" "+"error no obtuve de conversion User core del type  de los servicios {} ",e.toString());
       	json = "No generated Json Object";
       }


       return json;
   }

}
