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
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;



/**
 *
 * <h1>ConvertidorUtil</h1>
 *
 * Description
 *
 * @author THEOVERLORDKOTAN (ADA) 
 * @version 1.0
 * 
 */
public class ConvertidorUtil {
	
	/*
	 * =======================
	 * Declaracion de varibles Globales
	 * =======================
	*/
	
	public static final String FORMATO_FECHA_SIN_HORA ="dd/MM/yyyy HH:mm:ss"; 
	public static final String FORMATO_FECHA_CON_HORA ="dd/MM/yyyy HH:mm:ss";
	public static final String FORMATO_HORA ="HHmmss";
	
	 public static int calculateAge(LocalDate birthDate, LocalDate currentDate) {
	        if ((birthDate != null) && (currentDate != null)) {
	            return Period.between(birthDate, currentDate).getYears();
	        } else {
	            return 0;
	        }
	    }
	 public static LocalDate convertToLocalDateViaInstant(Date dateToConvert) {
		    return dateToConvert.toInstant()
		      .atZone(ZoneId.systemDefault())
		      .toLocalDate();
		}
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de las fechas de String 
	 * a sql.Date
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static java.sql.Date convertirFechaDate(String startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		java.sql.Date valorResultadoDate = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			//Inicio logica
			SimpleDateFormat sdf1 = new SimpleDateFormat(formatoFecha);
			java.util.Date date = sdf1.parse(startDate);
			valorResultadoDate = new java.sql.Date(date.getTime()); 
		} catch (Exception e) {
			return null;
		}

		return valorResultadoDate;
	}
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un xml
	 * de las fechas de String 
	 * a sql.Date
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static java.sql.Date convertirFechaDateGregorian(String startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		java.sql.Date valorResultadoDate = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
		      SimpleDateFormat format = new SimpleDateFormat(formatoFecha);
		        Date parsed = format.parse(startDate);
		        valorResultadoDate = new java.sql.Date(parsed.getTime());
		} catch (Exception e) {
			return null;
		}
		//Inicio logica

		return valorResultadoDate;
	}
	
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un xml
	 * de las fechas de String 
	 * a sql.Date
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static java.sql.Date convertirFechaDateGregorian(XMLGregorianCalendar startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		java.sql.Date valorResultadoDate = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
		    TimeZone fromTimeZone = TimeZone.getDefault();
		    GregorianCalendar gCalendar = startDate.toGregorianCalendar();
		    java.util.Date date= adjustToTimezone(gCalendar.getTime(), fromTimeZone, gmtTimeZone);
		    valorResultadoDate=new  java.sql.Date(date.getTime());
		} catch (Exception e) {
			return null;
		}
		//Inicio logica

		return valorResultadoDate;
	}
	
	public static XMLGregorianCalendar convertirFechaDateGregorianToXMLGregorianCalendar(String startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		XMLGregorianCalendar valorResultadoDate = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			DateFormat format = new SimpleDateFormat(formatoFecha);
			Date date = format.parse(startDate);

			GregorianCalendar cal = new GregorianCalendar();
			
			cal.setTime(date);

			valorResultadoDate=  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		} catch (Exception e) {
			return null;
		}
		//Inicio logica

		return valorResultadoDate;
	}
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de las fechas de String 
	 * a sql.Date
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static Date convertirFechaDateString(String startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		Date valorResultadoDate = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			//Inicio logica
			SimpleDateFormat sdf1 = new SimpleDateFormat(formatoFecha);
			Date date = sdf1.parse(startDate);
			valorResultadoDate = new Date(date.getTime()); 
		} catch (Exception e) {
			return null;
		}

		return valorResultadoDate;
	}
	public static XMLGregorianCalendar convertirHourDateGregorianToXMLGregorianCalendar(String startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		XMLGregorianCalendar valorResultadoDate = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			DateFormat format = new SimpleDateFormat(formatoFecha);
			Date date = format.parse(startDate);

			GregorianCalendar cal = new GregorianCalendar();
			
			cal.setTime(date);

			valorResultadoDate=  DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		} catch (Exception e) {
			return null;
		}
		//Inicio logica

		return valorResultadoDate;
	}
	
	
	public static String convertirFechaDateGregorianString(XMLGregorianCalendar startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		String valorResultadoDate = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			DateFormat format = new SimpleDateFormat(formatoFecha);

			//TimeZone gmtTimeZone = TimeZone.getTimeZone("GMT");
		    GregorianCalendar gCalendar = startDate.toGregorianCalendar();
			//format.setTimeZone(gmtTimeZone);
			//Converted to date object
			Date date = gCalendar.getTime();
			valorResultadoDate = format.format(date);

		} catch (Exception e) {
			return null;
		}
		//Inicio logica

		return valorResultadoDate;
	}
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un 
	 * a BigDecimal
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal convertirBigDecimal(String valueBigDecimal){
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		BigDecimal valorResultadoDate;
		//Inicio logica
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			 valorResultadoDate=new  BigDecimal(valueBigDecimal.trim());
		} catch (Exception e) {
			valorResultadoDate = null;
		}
	   
		return valorResultadoDate;
	}
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un 
	 * a BigDecimal
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal convertirBigDecimal(BigDecimal valueBigDecimal){
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		BigDecimal valorResultadoDate;
		//Inicio logica
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			/*
			  * =====================================
			  * Este if se encarga de validar 
			  * que el objeto contega un valor
			  * =====================================
			*/
			if (valueBigDecimal!= null) {
				valorResultadoDate=valueBigDecimal;
			}else {
				throw new Exception();
			}
			 
		} catch (Exception e) {
			valorResultadoDate = null;
		}
	   
		return valorResultadoDate;
	}
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un 
	 * a Integer
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static String convertirIntegeraBigDecimal(BigDecimal valueInteger){
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		String valorResultadoDate;
		//Inicio logica
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			 valorResultadoDate=valueInteger.toString();
		} catch (Exception e) {
			valorResultadoDate = null;
		}
	   
		return valorResultadoDate;
	}
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un 
	 * a BigDecimal
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static Integer convertirInteger(String valueInteger){
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		Integer valorResultadoDate;
		//Inicio logica
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			 valorResultadoDate=new  Integer(valueInteger.trim());
		} catch (Exception e) {
			valorResultadoDate = null;
		}
	   
		return valorResultadoDate;
	}
	
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un 
	 * a Integer
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static String convertirIntegeraString(Integer valueInteger){
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		String valorResultadoDate;
		//Inicio logica
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			 valorResultadoDate=valueInteger.toString();
		} catch (Exception e) {
			valorResultadoDate = null;
		}
	   
		return valorResultadoDate;
	}
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un 
	 * a BigDecimal
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static BigDecimal convertirBigDecimal(Integer valueBigDecimal) {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		BigDecimal valorResultadoDate;
		//Inicio logica
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			 valorResultadoDate=new  BigDecimal(valueBigDecimal);
		} catch (Exception e) {
			valorResultadoDate = null;
		}
	   
		return valorResultadoDate;
	}
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de un xml
	 * de las fechas de String 
	 * a sql.Date
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static java.sql.Timestamp convertirFechaDateGregorianDatatime(XMLGregorianCalendar startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		java.sql.Timestamp timestamp = null;
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			timestamp = new Timestamp(startDate.toGregorianCalendar().getTimeInMillis());
		} catch (Exception e) {
			return null;
		}
		//Inicio logica
		
		return timestamp;
	}
	
	
	/**
	 * Description
	 * Este metodo se encarga 
	 * de realizar la conversion 
	 * de las fechas de String 
	 * a sql.Date
	 * JavaDoc
	 * @param startDate
	 * @param formatoFecha
	 * @return
	 * @throws ParseException
	 */
	public static java.sql.Timestamp convertirFechaDatatime(String startDate,String formatoFecha) throws ParseException {
		/*
		 * =======================
		 * Declaracion de varibles 
		 * =======================
		*/
		DateFormat dF =  null;
		Date bbdt = null;
		Calendar cal = null;
		java.sql.Timestamp timeInit = null;
		//Inicio logica
		/*
		  * =====================================
		  * Este try catch se encarga de ...
		  * =====================================
		*/
		try {
			dF = new SimpleDateFormat(formatoFecha);
		    bbdt = (Date)dF.parse(startDate);
			
			cal = Calendar.getInstance();
			cal.setTime(bbdt);
			cal.set(Calendar.MILLISECOND, 0);
			timeInit  = new java.sql.Timestamp(bbdt.getTime());
		} catch (Exception e) {
			return null;
		}


		return timeInit;
	}
	
	/**
	 * pasar una hora String 
	 * a una fecha xml
	 * @param fechaConvertir
	 * @param formatoFechaCre
	 * @return
	 */
		
		public static XMLGregorianCalendar generarHoursDeXSD (String fechaConvertir,String formatoFechaCre) {
			try {
				Date fechaCreacion=null;
				DateFormat df=null;
				if (formatoFechaCre==null) {
					df =new  SimpleDateFormat(FORMATO_FECHA_SIN_HORA, Locale.ENGLISH);
				}else {
					df =new SimpleDateFormat(formatoFechaCre, Locale.ENGLISH);
				}
				fechaCreacion=df.parse(fechaConvertir);
				GregorianCalendar calendario = new GregorianCalendar();
				calendario.setTime(fechaCreacion);
				String FORMATER = FORMATO_HORA;

				DateFormat format = new SimpleDateFormat(FORMATER);
				XMLGregorianCalendar gDateFormatted =
						DatatypeFactory.newInstance().newXMLGregorianCalendar(format.format(fechaCreacion));
				return gDateFormatted;
			} catch ( Exception e) {
				return null;
			}
		}
		/**
		 * generar fecha
		 * hora para la generacion de un xml
		 * @param fechaConvertir
		 * @param formatoFechaCre
		 * @return
		 */
		public static XMLGregorianCalendar generarFechaHoraDeXSD (String fechaConvertir,String formatoFechaCre) {
			try {
				Date fechaCreacion=null;
				DateFormat df=null;
				if (formatoFechaCre==null) {
					df =new  SimpleDateFormat(FORMATO_FECHA_CON_HORA, Locale.ENGLISH);
				}else {
					df =new SimpleDateFormat(formatoFechaCre, Locale.ENGLISH);
				}
				fechaCreacion=df.parse(fechaConvertir);
				GregorianCalendar calendario = new GregorianCalendar();
				calendario.setTime(fechaCreacion);
				
				XMLGregorianCalendar gDateFormatted =
			            DatatypeFactory.newInstance().newXMLGregorianCalendar(
			                calendario.get(Calendar.YEAR),
			                calendario.get(Calendar.MONTH) + 1,
			                calendario.get(Calendar.DAY_OF_MONTH),
			                calendario.get(Calendar.HOUR_OF_DAY),
			                calendario.get(Calendar.MINUTE),
			                calendario.get(Calendar.SECOND), DatatypeConstants.FIELD_UNDEFINED, DatatypeConstants.FIELD_UNDEFINED);
				return gDateFormatted;
			} catch ( Exception e) {
				return null;
			}
		}
	    public static Date adjustToTimezone(Date date, TimeZone fromZone, TimeZone toZone)
	    {
	        Date adjustedToTimezone = new Date(date.getTime() + toZone.getRawOffset() - fromZone.getRawOffset());
	        // Is the adjusted date in Daylight savings?
	        if (fromZone.inDaylightTime(adjustedToTimezone) != toZone.inDaylightTime(adjustedToTimezone)) {
	            adjustedToTimezone = new Date(adjustedToTimezone.getTime() + toZone.getDSTSavings() - fromZone.getDSTSavings());
	        }
	        return adjustedToTimezone;
	    }
	    
		/**
		 * Description
		 * Este metodo se encarga 
		 * de realizar la conversion 
		 * de un 
		 * a BigDecimal
		 * JavaDoc
		 * @param startDate
		 * @param formatoFecha
		 * @return
		 * @throws ParseException
		 */
		public static boolean confirmTheTypeValue(String valueBigDecimal,String faultFieldName, int lenght) throws Exception{
			
			boolean valorResultadoTrue =false;
            /*
			  * =====================================
			  * Este if se encarga de validar el tamaño de 
			  * los campos
			  * =====================================
			*/
		      Exception faultValue = null;
			if (valueBigDecimal!=null) {
				/*
				  * =====================================
				  * Este if se encarga de validar 
				  * si los objetos estan en el rango
				  * =====================================
				*/
				if (!inRange(valueBigDecimal.trim(),lenght)) {
					faultValue = new Exception("EL VALOR PARA LA VARIABLE"+ " " + faultFieldName+ " " + "NO CUMPLE CON LAS CONDICIONES DEL WSDL"  + " Value: "+valueBigDecimal);
					throw faultValue;
				}			
			}
		   
			return valorResultadoTrue;
		}
		
		  public static boolean inRange(String input, int lenght) {
			  boolean isTrue =false;
			  /*
			  * =====================================
			  * Este try catch se encarga de vlaidar el 
			  * tyamaño
			  * =====================================
			*/
			try {
				  char [] valuesInput = input.toCharArray();
				  /*
				  * =====================================
				  * Este if se encarga de validar el
				  * tamaño
				  * =====================================
				*/
				if (valuesInput.length<=lenght) {
					isTrue = true;
				}
			} catch (Exception e) {
				isTrue = false;
			}
				return isTrue;
			}
		  	public boolean checkString(String pattern,String arg) {
		  	   return Pattern.matches(pattern,arg);
			}

}
