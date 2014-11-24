package com.ibm.btt.util;

import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.allwidgets.Label.Label_PageObject;


public class NLS {
	
	public boolean NLS_lang(String lang_str){
		  String[] lang = {"en","es","zh","ko"};
		  for(int i=0; i<lang.length; i++ ){
			  if(lang_str.equals(lang[i])){
				  return true;
			  }
		  }
		  return false;
	  }

}
