package com.ibm.btt.allwidgets;

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

	@FindBy(id="index_tabbedPane_tablist_index_ContentPane05")
	private WebElement BTT8200_tab;
	
	public void BTT8200_tab(){
		BTT8200_tab.click();
	}
	
	@FindBy(id="index_link44")
	private WebElement Label_widget;
		
	public void Label_widget(){
		Label_widget.click();
	}
	
	@FindBy(id="index_link81")
	private WebElement Text_widget;
	
	public void Text_widget(){
		Text_widget.click();
	}

} 

