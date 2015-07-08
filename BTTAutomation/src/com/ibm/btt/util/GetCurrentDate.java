package com.ibm.btt.util;

import java.util.Calendar;
import java.util.Date; 
import java.text.SimpleDateFormat;
public class GetCurrentDate { 
	/*static Calendar c = Calendar.getInstance();//可以对每个时间域单独修改
	static int year = c.get(Calendar.YEAR); 
	static int month = c.get(Calendar.MONTH); 
	static int day = c.get(Calendar.DATE);*/
	
	static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	static String currentDate = df.format(new Date());
	
	static String[] strings= currentDate.split("-");
	static String year = strings[0];
	static String month = strings[1];
	static String day = strings[2];
	
	
	
	public static String currentDate(){
		return currentDate;
		}
	public static String currentYear(){
		return year;
		}
	public static String currentMonth(){
		return month;
		}
	public static String currentDay(){
		return day;
		}
}