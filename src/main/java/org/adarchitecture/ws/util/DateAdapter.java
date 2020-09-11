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

import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.datatype.XMLGregorianCalendar;



/**
 *
 * <h1>DateAdapter</h1>
 *
 * Description
 *
 * @version 1.0
 * 
 */
public class DateAdapter extends XmlAdapter<String , XMLGregorianCalendar>{

    @Override
    public String marshal(XMLGregorianCalendar date) throws Exception {
    	 String resultado = null;
    	if (date!= null)
        {
    		resultado =  ConvertidorUtil.convertirFechaDateGregorianString(date, ConvertidorUtil.FORMATO_FECHA_SIN_HORA);
        }
        return resultado;
    }

    @Override
    public XMLGregorianCalendar unmarshal(String date) throws Exception 
    {
    	XMLGregorianCalendar retultadoDate = null;
    	if (date!= null && !date.isEmpty())
        {
    		retultadoDate =  ConvertidorUtil.convertirFechaDateGregorianToXMLGregorianCalendar(date, ConvertidorUtil.FORMATO_FECHA_SIN_HORA);
        }
    	return retultadoDate;
     }

}