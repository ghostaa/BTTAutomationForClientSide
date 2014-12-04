package com.ibm.btt.allwidgets.Text;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.allwidgets.*;

public class Text_PageObject extends Main_Page{
	

//###############################Text Properties##################################
	@FindBy(id="Text_properties_text")
	private WebElement Text_properties_id;
	
	public String Text_properties_id_getText(){
		return Text_properties_id.getText();
	}
	
	@FindBy(id="Text_properties_text01")
	private WebElement Text_properties_visible;
	
	public Boolean Text_properties_visible(){
		return Text_properties_visible.isDisplayed();
	}
	
	@FindBy(id="Text_properties_text02")
	private WebElement Text_properties_hidden;
	
	public Boolean Text_properties_hidden(){
		return Text_properties_hidden.isDisplayed();
	}
	
	@FindBy(id="Text_properties_text03")
	private WebElement Text_properties_gone;
	
	public Boolean Text_properties_gone(){
		return Text_properties_gone.isDisplayed();
	}
	
	@FindBy(id="Text_properties_text04")
	private WebElement Text_properties_disableTrue;
	
	public String Text_properties_disableTrue(){
		return Text_properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="Text_properties_text05")
	private WebElement Text_properties_disableFalse;
	
	public Boolean Text_properties_disableFalse(){
		return Text_properties_disableFalse.isEnabled();
	}
	
	@FindBy(id="Text_properties_text06")
	private WebElement Text_properties_readonlyTrue;
	
	public String Text_properties_readonlyTrue(){
		return Text_properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="Text_properties_text07")
	private WebElement Text_properties_readonlyFalse;
	
	public Boolean Text_properties_readonlyFalse(){
		return Text_properties_readonlyFalse.isEnabled();
	}
	

//###############################Text Properties##################################

}
