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
	
	@FindBy(id="index_link48")
	private WebElement Button_widget;
		
	public void Button_widget(){
		Button_widget.click();
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
	
	@FindBy(id="index_link52")
	private WebElement image_widget;
	
	public void image_widget(){
		image_widget.click();
	}
	
	@FindBy(id="index_link43")
	private WebElement Radio_widget;
	
	public void Radio_widget(){
		Radio_widget.click();
	}
	
	@FindBy(id="index_link45")
	private WebElement CheckBox_widget;
	
	public void CheckBox_widget(){
		CheckBox_widget.click();
	}
	
	@FindBy(id="index_link57")
	private WebElement Message_widget;
	
	public void Message_widget(){
		Message_widget.click();
	}
	
	@FindBy(id="index_link56")
	private WebElement Link_widget;
	
	public void Link_widget(){
		Link_widget.click();
	}
	
	@FindBy(id="index_link46")
	private WebElement SelectList_widget;
	
	public void SelectList_widget(){
		SelectList_widget.click();
	}
	
	@FindBy(id="index_link59")
	private WebElement MultiSelect_widget;
	
	public void MultiSelect_widget(){
		MultiSelect_widget.click();
	}
	
	@FindBy(id="index_link79")
	private WebElement HorizontalSlider_widget;
	
	public void HorizontalSlider_widget(){
		HorizontalSlider_widget.click();
	}
	
	@FindBy(id="index_link80")
	private WebElement VerticalSlider_widget;
	
	public void VerticalSlider_widget(){
		VerticalSlider_widget.click();
	}
	
	@FindBy(id="index_link60")
	private WebElement CheckedMultiSelect_widget;
	
	public void CheckedMultiSelect_widget(){
		CheckedMultiSelect_widget.click();
	}


} 

