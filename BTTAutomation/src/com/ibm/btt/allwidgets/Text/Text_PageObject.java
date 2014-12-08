package com.ibm.btt.allwidgets.Text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.allwidgets.*;

public class Text_PageObject extends Main_Page{
	
/*	private static WebDriver driver;
	
	public void setWebDriver(WebDriver driver){
		this.driver = driver;
	}
	
	Actions event = new Actions(driver);*/
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
//###############################Text CSS#########################################
	@FindBy(id="widget_Text_css_text03")
	private WebElement Text_css_style1;
	
	public String Text_css_style1_getAttribute(){
		return Text_css_style1.getAttribute("class");
	}
	
	@FindBy(id="widget_Text_css_text02")
	private WebElement Text_css_style2;
	
	public String Text_css_style2_getAttribute(){
		return Text_css_style2.getAttribute("class");
	}
	
	@FindBy(id="widget_Text_css_text01")
	private WebElement Text_css_style3;
	
	public String Text_css_style3_getAttribute(){
		return Text_css_style3.getAttribute("class");
	}
	
	@FindBy(id="widget_Text_css_text")
	private WebElement Text_css_style4;
	
	public String Text_css_style4_getAttribute(){
		return Text_css_style4.getAttribute("class");
	}
//###############################Text CSS#########################################
//###############################Text Condition###################################
	@FindBy(id="Text_condition_text")
	private WebElement Text_condition_isFocusable;
	
	public void Text_condition_isFocusable_click(){
		Text_condition_isFocusable.click();
	}
	
	public Boolean Text_condition_isFocusable(){
		return Text_condition_isFocusable.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text01")
	private WebElement Text_condition_isMandatory;
	
	public void Text_condition_isMandatory_click(){
		Text_condition_isMandatory.click();
	}
	
	public String Text_condition_isMandatory_getValue(){
		return Text_condition_isMandatory.getAttribute("value");
	}
	
	@FindBy(id="Text_condition_button01")
	private WebElement Text_condition_changeMandatory;
	
	public void Text_condition_changeMandatory(){
		Text_condition_changeMandatory.click();
	}
	
	@FindBy(id="Text_condition_text02")
	private WebElement Text_condition_disableFalse;
	
	public void Text_condition_disableFalse_click(){
		Text_condition_disableFalse.click();
	}
	
	public Boolean Text_condition_isEnabled(){
		return Text_condition_disableFalse.isEnabled();
	}
	
	@FindBy(id="Text_condition_button")
	private WebElement Text_condition_disable_button;
	
	public Boolean Text_condition_disable_button(){
		return Text_condition_disable_button.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text03")
	private WebElement Text_condition_readonlyTrue;
	
	public String Text_condition_readonlyTrue(){
		return Text_condition_readonlyTrue.getAttribute("readonly");
	}
/*	
	public void Text_condition_mouseOver(){
		event.moveToElement(driver.findElement(By.id("Text_condition_text03")));
		event.moveToElement(driver.findElement(By.id("Text_condition_text03")));
	}
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement Text_condition_Tooltip;
	
	public String Text_condition_Tooltip_getText(){
		return Text_condition_Tooltip.getAttribute(arg0);
	}*/
//###############################Text Condition###################################

}
