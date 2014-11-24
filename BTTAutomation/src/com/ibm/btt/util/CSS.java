package com.ibm.btt.util;

public class CSS {
	/*
	 * Query the css style is valid
	 * css: The current runtime css style cached by using getAttribute("class")
	 * temp:configing css by using xui editor
	 * return the number of matched css style
	 * Support: zhaomm@cn.ibm.com
	 */
	public static int css_query(String css,String[] temp)
	  { int num=0;
	    String css_string[] = css.split(" ");
	    for(int i=0;i<css_string.length;i++)
	    	for (int j=0;j<temp.length;j++)
	    		if (css_string[i].equals(temp[j]))
	    			num=num+1;
	   // 	   System.out.print(css_string[i]+" ");   
	    return num;
	  }
}
