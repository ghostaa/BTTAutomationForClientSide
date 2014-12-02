package com.ibm.btt.allwidgets.Text;

import org.openqa.selenium.WebElement;
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
//###############################Text Properties##################################

}
