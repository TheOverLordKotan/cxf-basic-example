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
 * <h1>StringTransaccionID</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public class StringTransaccionID  extends XmlAdapter<String, String>{

    @Override
    public String marshal(String date) throws Exception {
    	 String resultado = null;
    	if (date!= null)
        {
    		resultado =  date;
        }
        return resultado;
    }

    @Override
    public String unmarshal(String date) throws Exception 
    {
    	String retultadoDate = null;
    	if (date!= null && !date.isEmpty())
        {
    		retultadoDate =  date;
        }
    	return retultadoDate;
     }
}