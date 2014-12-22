package com.ibm.btt.allwidgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Main_Page extends Index_Page{ 
	
//###############################For Label Main##################################	
	@FindBy(id="label_main_link")
	private WebElement Label_properties;
	
	@FindBy(id="label_main_link01")
	private WebElement Label_ECA;
	
	@FindBy(id="label_main_link02")
	private WebElement Label_CSS;
	
	@FindBy(id="label_main_link03")
	private WebElement Label_appearance;
	
	@FindBy(id="label_main_link03_copy")
	private WebElement Label_appearance1;

	
	public void label_properties(){
		Label_properties.click();
	}
	
	public void label_ECA(){
		Label_ECA.click();
	}
	
	public void label_CSS(){
		Label_CSS.click();
	}
	
	public void label_appearance(){
		Label_appearance.click();
	}
	
	public void label_appearance1(){
		Label_appearance1.click();
	}
//###############################For Label Main##################################
//###############################For Text Main###################################
	@FindBy(id="Text_main_link02")
	private WebElement Text_Properties;
	
	@FindBy(id="Text_main_link")
	private WebElement Text_event;
	
	@FindBy(id="Text_main_link05")
	private WebElement Text_condition;
	
	@FindBy(id="Text_main_link06")
	private WebElement Text_action;
	
	@FindBy(id="Text_main_link01")
	private WebElement Text_css;
	
	@FindBy(id="Text_main_link03")
	private WebElement Text_appearance1;
	
	@FindBy(id="Text_main_link04")
	private WebElement Text_appearance2;
	
	public void Text_Properties(){
		Text_Properties.click();
	}
	
	public void Text_event(){
		Text_event.click();
	}
	
	public void Text_condition(){
		Text_condition.click();
	}
	
	public void Text_action(){
		Text_action.click();
	}
	
	public void Text_css(){
		Text_css.click();
	}
	
	public void Text_appearance1(){
		Text_appearance1.click();
	}
	
	public void Text_appearance2(){
		Text_appearance2.click();
	}
//###############################For Text Main###################################
//###############################For Image Main##################################
	@FindBy(id="Image_main_link")
	private WebElement Image_properties;
	
	@FindBy(id="Image_main_link01")
	private WebElement Image_event;
	
	@FindBy(id="Image_main_link02")
	private WebElement Image_condition;
	
	@FindBy(id="Image_main_link03")
	private WebElement Image_action;
	
	@FindBy(id="Image_main_link04")
	private WebElement Image_actionTab;
	
	@FindBy(id="Image_main_link05")
	private WebElement Image_css;
	
	@FindBy(id="Image_main_link06")
	private WebElement Image_appearance1;
	
	@FindBy(id="Image_main_link07")
	private WebElement Image_appearance2;
	
	public void Image_properties(){
		Image_properties.click();
	}
	
	public void Image_event(){
		Image_event.click();
	}
	
	public void Image_condition(){
		Image_condition.click();
	}
	
	public void Image_action(){
		Image_action.click();
	}
	
	public void Image_actionTab(){
		Image_actionTab.click();
	}
	
	public void Image_css(){
		Image_css.click();
	}
	
	public void Image_appearance1(){
		Image_appearance1.click();
	}
	
	public void Image_appearance2(){
		Image_appearance2.click();
	}
//###############################For Image Main##################################
//###############################For Radio Main##################################
	@FindBy(id="Radio_main_link05")
	private WebElement Radio_properties;
	
	@FindBy(id="Radio_main_link")
	private WebElement Radio_submmit;
	
	@FindBy(id="Radio_main_link02")
	private WebElement Radio_css;
	
	@FindBy(id="Radio_main_link03")
	private WebElement Radio_appearance1;
	
	@FindBy(id="Radio_main_link04")
	private WebElement Radio_appearance2;
	
	@FindBy(id="Radio_main_link06")
	private WebElement Radio_Event;
	
	@FindBy(id="Radio_main_link07")
	private WebElement Radio_Action;
	
	@FindBy(id="Radio_main_link08")
	private WebElement Radio_Condition;
	
	public void Radio_properties(){
		Radio_properties.click();
	}
	
	public void Radio_submmit(){
		Radio_submmit.click();
	}
	
	public void Radio_css(){
		Radio_css.click();
	}
	
	public void Radio_appearance1(){
		Radio_appearance1.click();
	}
	
	public void Radio_appearance2(){
		Radio_appearance2.click();
	}
	
	public void Radio_Event(){
		Radio_Event.click();
	}
	
	public void Radio_Action(){
		Radio_Action.click();
	}
	
	public void Radio_Condition(){
		Radio_Condition.click();
	}
//###############################For Radio Main##################################
//###############################For CheckBox Main###############################
	@FindBy(id="CheckBox_main_link05")
	private WebElement CheckBox_properties;
	
	@FindBy(id="CheckBox_main_link")
	private WebElement CheckBox_submmit;
	
	@FindBy(id="CheckBox_main_link02")
	private WebElement CheckBox_css;
	
	@FindBy(id="CheckBox_main_link03")
	private WebElement CheckBox_appearance1;
	
	@FindBy(id="CheckBox_main_link04")
	private WebElement CheckBox_appearance2;
	
	@FindBy(id="CheckBox_main_link08")
	private WebElement CheckBox_Event;
	
	@FindBy(id="CheckBox_main_link06")
	private WebElement CheckBox_Action;
	 
	@FindBy(id="CheckBox_main_link07")
	private WebElement CheckBox_Condition;
	
	public void CheckBox_properties(){
		CheckBox_properties.click();
	}
	
	public void CheckBox_submmit(){
		CheckBox_submmit.click();
	}
	
	public void CheckBox_css(){
		CheckBox_css.click();
	}
	
	public void CheckBox_appearance1(){
		CheckBox_appearance1.click();
	}
	
	public void CheckBox_appearance2(){
		CheckBox_appearance2.click();
	}
	
	public void CheckBox_Event(){
		CheckBox_Event.click();
	}
	
	public void CheckBox_Action(){
		CheckBox_Action.click();
	}
	
	public void CheckBox_Condition(){
		CheckBox_Condition.click();
	}
//###############################For CheckBox Main###############################
//###############################For Message Main################################
	@FindBy(id="Message_main_link")
	private WebElement Message_properties;
	
	@FindBy(id="Message_main_link01")
	private WebElement Message_appearance;
	
	@FindBy(id="Message_main_link02")
	private WebElement Message_appearance1;
	
	@FindBy(id="Message_main_link03")
	private WebElement Message_action;
	
	@FindBy(id="Message_main_link04")
	private WebElement Message_css;
	
	public void Message_properties(){
		Message_properties.click();
	}
	
	public void Message_appearance(){
		Message_appearance.click();
	}
	
	public void Message_appearance1(){
		Message_appearance1.click();
	}
	
	public void Message_action(){
		Message_action.click();
	}
	
	public void Message_css(){
		Message_css.click();
	}
//###############################For Message Main################################
//###############################For Link Main###################################
	@FindBy(id="Link_main_link")
	private WebElement Link_properties;
	
	@FindBy(id="Link_main_link01")
	private WebElement Link_event;
	
	@FindBy(id="Link_main_link03")
	private WebElement Link_condition;
	
	@FindBy(id="Link_main_link04")
	private WebElement Link_action;
	
	@FindBy(id="Link_main_link05")
	private WebElement Link_css;
	
	@FindBy(id="Link_main_link06")
	private WebElement Link_appearance1;
	
	@FindBy(id="Link_main_link07")
	private WebElement Link_appearance2;
	
	public void Link_properties(){
		Link_properties.click();
	}
	
	public void Link_event(){
		Link_event.click();
	}
	
	public void Link_condition(){
		Link_condition.click();
	}
	
	public void Link_action(){
		Link_action.click();
	}
	
	public void Link_css(){
		Link_css.click();
	}
		
	public void Link_appearance1(){
		Link_appearance1.click();
	}
	
	public void Link_appearance2(){
		Link_appearance2.click();
	}
//###############################For Link Main###################################
} 

