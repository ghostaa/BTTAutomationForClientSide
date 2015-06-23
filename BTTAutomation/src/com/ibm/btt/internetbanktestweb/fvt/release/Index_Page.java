package com.ibm.btt.internetbanktestweb.fvt.release;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Index_Page {
	
	@FindBy(linkText="Establish Session")
	private WebElement Establish;
	
	public void Establish(){
		Establish.click();
	}
//IBK-FVT Tab	
	@FindBy(id="index_tabbedPane_tablist_index_ContentPane01")
	private WebElement IBK_FVT;
	
	public void IBK_FVT_tab(){
		IBK_FVT.click();
	}
	
	@FindBy(id="index_link01")
	private WebElement IBK_4_11;//Click link to launch test case for IBK4-11( muti-Widget )
		
	public void IBK_4_11(){
		IBK_4_11.click();
	}
	
	@FindBy(id="index_link16")
	private WebElement IBK_F_007;//Click link to launch test case for IBK_F_007:multilanguage switch
		
	public void IBK_F_007(){
		IBK_F_007.click();
	}
	
	@FindBy(id="index_link07_copy01_copy")
	private WebElement IBK_19and21forInnerSubFolder;//Click link to launch test case for IBK19 and 21 for inner sub folder
		
	public void IBK_19and21forInnerSubFolder(){
		IBK_19and21forInnerSubFolder.click();
	}
	
	@FindBy(id="index_IBK20And6")
	private WebElement IBK20AndIBK6;//Click link to launch test case for IBK20 (new line character in table) and IBK6 (Combox supports disabling edit)
		
	public void IBK20AndIBK6(){
		IBK20AndIBK6.click();
	}


} 

