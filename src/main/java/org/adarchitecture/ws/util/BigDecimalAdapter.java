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

import java.math.BigDecimal;

import javax.xml.bind.annotation.adapters.XmlAdapter;

/**
 *
 * <h1>BigDecimalAdapter</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public class BigDecimalAdapter extends XmlAdapter<String, BigDecimal>{

    @Override
    public String marshal(BigDecimal date) throws Exception {
    	 String resultado = null;
    	if (date!= null)
        {
    		resultado =  ConvertidorUtil.convertirIntegeraBigDecimal(date);
        }
        return resultado;
    }

    @Override
    public BigDecimal unmarshal(String date) throws Exception 
    {
    	BigDecimal retultadoDate = null;
    	if (date!= null && !date.isEmpty())
        {
    		retultadoDate =  ConvertidorUtil.convertirBigDecimal(date.trim());
        }
    	return retultadoDate;
     }

}