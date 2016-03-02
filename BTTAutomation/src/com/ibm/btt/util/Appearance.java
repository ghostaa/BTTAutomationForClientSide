package com.ibm.btt.util;

public class Appearance {
	
	/*
	 * Query the widget appearance
	 * appearance: The current runtime widget appearance cached by using getAttribute("style")
	 * temp:configing appearance by using xui editor
	 * return the number of matched widget style
	 * Support: vndlmmli@cn.ibm.com
	 */
	public static int appearance_query(String appearance,String[] temp)
	  { int num=0;
	    String appearance_string[] = appearance.split("; ");
	    String[] s = appearance_string[appearance_string.length-1].split(";");
	    appearance_string[appearance_string.length-1] = s[0];
	    for(int i=0;i<appearance_string.length;i++){
	    	for (int j=0;j<temp.length;j++)
	    		if (appearance_string[i].equals(temp[j]))
	    			num=num+1;  
//	    	System.out.println(appearance_string[i]+" ");
	    }
	    	
	    return num;
	  }
	
	/*
	 * Query the widget appearance
	 * appearance: The current runtime widget appearance cached by using getAttribute("style")
	 * temp:configing appearance(top/middle/bottom) by using xui editor
	 * return valign of matched widget
	 * Support: vndlmmli@cn.ibm.com
	 */
	public static String appearance_place(String appearance,String temp)
	  { String valign = null;
		  if(appearance.indexOf(temp) != -1){
			  valign = temp;
		  }
		  return valign;
	  }
	/*
	 * Widget appearance - AutoSize(special)
	 * special : There is no width and height in html element's style attribute
	 * appearance: The html element's style attribute
	 * return: flag is to confirm there exists width or height or not
	 * Support: jshang@cn.ibm.com
	 */
	public static boolean appearance_autosize(String appearance){
		boolean flag = true;
		if(appearance.contains("width") || appearance.contains("height")){
			flag = false;
		}
		return flag;
	}
}
