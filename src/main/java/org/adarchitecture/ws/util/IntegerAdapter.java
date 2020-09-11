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

/**
 *
 * <h1>IntegerAdapter</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public class IntegerAdapter extends XmlAdapter<String, Integer>{

    @Override
    public String marshal(Integer date) throws Exception {
    	 String resultado = null;
    	if (date!= null)
        {
    		resultado =  ConvertidorUtil.convertirIntegeraString(date);
        }
        return resultado;
    }

    @Override
    public Integer unmarshal(String date) throws Exception 
    {
    	Integer retultadoDate = null;
    	if (date!= null && !date.isEmpty())
        {
    		retultadoDate =  ConvertidorUtil.convertirInteger(date.trim());
        }
    	return retultadoDate;
     }
}