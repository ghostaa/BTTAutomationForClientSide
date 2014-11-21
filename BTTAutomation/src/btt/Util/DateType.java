package btt.Util;

import java.util.regex.Pattern;

public class DateType {
	/*
	 * Author: Ming Ming Lee
	 */
	public static boolean Date(String str){
		boolean b = Pattern.matches("\\d{4}-\\d{2}-\\d{2}", str);
		return b;
	}
	
	public static boolean Currency(String str){
		boolean b = Pattern.matches("\\$^[0-9]+(.[0-9]{2})?$", str);
		return b;
	}
	
	public static boolean Number(String str){
		boolean b = Pattern.matches("[0-9]*", str);
		return b;
	}
}
