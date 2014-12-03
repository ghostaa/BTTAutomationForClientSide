package com.ibm.btt.util;

import java.util.regex.Pattern;

public class DateType {
	/*
	 * Match Date, Currency, Number and Boolean from runtime
	 * str: The current runtime element content cached by using getText()
	 * return regular expression match results
	 * Support: vndlmmli@cn.ibm.com
	 */
	public static boolean Date(String str){
		boolean b = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", str);
		return b;
	}
	
	public static boolean Currency(String str){
		if (str.indexOf(",") != -1){
			str = str.replace(",", "");
		}
		boolean b = Pattern.matches("\\$\\d*+(.[0-9]{2})?$", str);
		return b;
	}
	
	public static boolean Number(String str){
		if (str.indexOf(",") != -1){
			str = str.replace(",", "");
		}
		
		boolean b = Pattern.matches("\\d*$", str);
		return b;
	}
	
	public static boolean Boolean(String str){
		boolean b = false;
		if (str.equals("true")){
			b = Pattern.matches("true", str);
		}else if(str.equals("false")){
			b = Pattern.matches("false", str);
		}
		return b;
	}
}
