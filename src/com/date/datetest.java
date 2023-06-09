package com.date;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class datetest {

	public static void main(String[] args) throws DatatypeConfigurationException {
		
		
		LocalDate l1 =LocalDate.of(1992,12,23);
		System.out.println(l1);
		
		//String date = "1992-12-23";
		DateTimeFormatter formatter =DateTimeFormatter.ofPattern("yyyy-MM-dd");
				
		//System.out.println(LocalDate.parse(date,formatter));
		
		System.out.println("helll  " +LocalDate.now().minusYears(2).format(formatter));
		
		SimpleDateFormat temp = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss.SSS");
		
		System.out.println(temp);
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new Date());
		
		System.out.println(timeStamp);
		
		
		Date d1 = new Date("1998/10/02");
		System.out.println( "date eeeeee"+ d1);
		
		String str="";
		
		System.out.println(str.length());
		
		XMLGregorianCalendar tse =DatatypeFactory.newInstance().
				newXMLGregorianCalendar(new GregorianCalendar());
		
		System.out.println(tse);
		System.out.println(tse.toString());
		
		
	
		System.out.println("------------------");
		
		System.out.println(LocalDate.now().toString());
		System.out.println(new Date());
		
		
		String s="eeee";
		
		System.out.println(s.toString());
		
		
		System.out.println(UUID.randomUUID().toString());
		
		
		
		System.out.println(new BigDecimal(20).movePointLeft(2).add(new BigDecimal(324)));
		System.out.println(new BigDecimal(0).movePointLeft(2));

	}

}
