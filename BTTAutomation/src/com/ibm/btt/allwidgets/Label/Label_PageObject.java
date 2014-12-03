package com.ibm.btt.allwidgets.Label;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.Event;
import com.ibm.btt.allwidgets.Index_Page;
import com.ibm.btt.allwidgets.Main_Page;

public class Label_PageObject extends Main_Page{ 

//###############################For Label Properties##################################
	@FindBy(id="label_properties_label")
	private WebElement label_String;

	public String label_String_getText(){
		 return label_String.getText();
	}

	@FindBy(id="label_properties_label06")
	private WebElement label_Duration;

	public String label_Duration_getText(){
		 return label_Duration.getText();
	}

	@FindBy(id="label_properties_label01")
	private WebElement label_Date;

	public String label_Date_getText(){
		 return label_Date.getText();
	}

	@FindBy(id="label_properties_label02")
	private WebElement label_Currency;

	public String label_Currency_getText(){
		 return label_Currency.getText();
	}

	@FindBy(id="label_properties_label03")
	private WebElement label_Number;

	public String label_Number_getText(){
		 return label_Number.getText();
	}
	
	@FindBy(id="label_properties_label04")
	private WebElement label_Boolean;

	public String label_Boolean_getText(){
		 return label_Boolean.getText();
	}

	@FindBy(id="label_properties_label07")
	private WebElement label_XMLGregorianCalendar;

	public String label_XMLGregorianCalendar_getText(){
		 return label_XMLGregorianCalendar.getText();
	}

	@FindBy(id="label_properties_label08")
	private WebElement label_Byte;

	public String label_Byte_getText(){
		 return label_Byte.getText();
	}

	@FindBy(id="label_properties_label09")
	private WebElement label_Short;

	public String label_Short_getText(){
		 return label_Short.getText();
	}

	@FindBy(id="label_properties_label10")
	private WebElement label_Integer;

	public String label_Integer_getText(){
		 return label_Integer.getText();
	}

	@FindBy(id="label_properties_label11")
	private WebElement label_Long;

	public String label_Long_getText(){
		 return label_Long.getText();
	}

	@FindBy(id="label_properties_label12")
	private WebElement label_Float;

	public String label_Float_getText(){
		 return label_Float.getText();
	}

	@FindBy(id="label_properties_label13")
	private WebElement label_Double;

	public String label_Double_getText(){
		 return label_Double.getText();
	}

	@FindBy(id="label_properties_label14")
	private WebElement label_BigInteger;

	public String label_BigInteger_getText(){
		 return label_BigInteger.getText();
	}

	@FindBy(id="label_properties_label22")
	private WebElement label_visible;

	public Boolean label_visible_isDisplay(){
		 return label_visible.isDisplayed();
	}

	@FindBy(id="label_properties_label19")
	private WebElement label_hidden;

	public Boolean label_hidden_isDisplay(){
		 return label_hidden.isDisplayed();
	}

	@FindBy(id="label_properties_label21")
	private WebElement label_gone;

	public String label_gone_GetAttribute(){
		 return label_gone.getAttribute("style");
	}

	@FindBy(id="label_properties_label26")
	private WebElement label_filedReference;

	public void label_filedReference_click(){
		 label_filedReference.click();
	}

	@FindBy(id="label_properties_radio")
	private WebElement label_filedReference_radio;

	public Boolean label_filedReference_radio(){
		 return label_filedReference_radio.isSelected();
	}

	@FindBy(id="label_properties_label16")
	private WebElement label_NLS;

	public String label_NLS(){
		 return label_NLS.getAttribute("lang");
	}

//###############################For Label Properties##################################	
//###############################For Label ECA#########################################	
	@FindBy(id="label_ECA_onclick")
	private WebElement Evt_onclick;

	public void Evt_onclick(){
		 Evt_onclick.click();

	}

	public String Evt_onclick_getText(){
		 return Evt_onclick.getText();
	}

	@FindBy(id="label_ECA_onMouseup")
	private WebElement Evt_onMouseup;

	public void Evt_onMouseup(){
		 Evt_onMouseup.click();
	}

	public String Evt_onMouseup_getText(){
		 return Evt_onMouseup.getText();
	}

	@FindBy(id="label_ECA_onMouseLeave")
	private WebElement Evt_onMouseLeave;

	public void Evt_onMouseLeave(){
		Event evn = new Event();
		evn.event_id("label_ECA_onMouseLeave");
		evn.event_id("label_ECA_onMouseMove");
	}

	public String Evt_onMouseLeave_getText(){
		 return Evt_onMouseLeave.getText();
	}

	@FindBy(id="label_ECA_onMouseMove")
	private WebElement Evt_onMouseMove;

	public void Evt_onMouseMove(){
		Event evn = new Event();
		evn.event_id("label_ECA_onMouseMove");
	}

	public String Evt_onMouseMove_getText(){
		 return Evt_onMouseMove.getText();
	}

	@FindBy(id="label_ECA_onMouseEnter")
	private WebElement Evt_onMouseEnter;

	public void Evt_onMouseEnter(){
		Event evn = new Event();
		evn.event_id("label_ECA_onMouseEnter");
	}

	public String Evt_onMouseEnter_getText(){
		 return Evt_onMouseEnter.getText();
	}

	@FindBy(id="label_ECA_onMousedown")
	private WebElement Evt_onMousedown;

	public void Evt_onMousedown(){
		 Evt_onMousedown.click();
	}

	public String Evt_onMousedown_getText(){
		 return Evt_onMousedown.getText();
	}

	@FindBy(id="label_ECA_label04")
	private WebElement ID_exp_result;

	public String ID_exp_getText(){
		return ID_exp_result.getText();
	}

	@FindBy(id="label_ECA_label03")
	private WebElement ID_exp;

	public void ID_exp(){
		ID_exp.click();
	}

	@FindBy(id="label_ECA_label01")
	private WebElement Text_exp;

	public void Text_exp(){
		Text_exp.click();
	}

	@FindBy(id="label_ECA_label02")
	private WebElement Text_exp_result;

	public String Text_exp_getText(){
		return Text_exp_result.getText();
	}

	@FindBy(id="label_ECA_label07")
	private WebElement ID_false;

	public void ID_false(){
		ID_false.click();
	}

	@FindBy(id="label_ECA_label08")
	private WebElement ID_false_result;

	public String ID_false_getText(){
		return ID_false_result.getText();
	}

	@FindBy(id="label_ECA_label05")
	private WebElement ID_visibility;

	public void ID_visibility(){
		ID_visibility.click();
	}

	@FindBy(id="label_ECA_label06")
	private WebElement ID_visibility_result;

	public String ID_visibility_getText(){
		return ID_visibility_result.getText();
	}

	@FindBy(id="label_ECA_label11")
	private WebElement label_stylecss;

	public void Label_Evt_Click(){
		label_stylecss.click();
	}

	public String css_getAttribute(){
		return label_stylecss.getAttribute("class");
	}

//###############################For Label ECA#########################################
//###############################For Label Action#####################################	
	@FindBy(id="label_ECA_label13")
	private WebElement label_action_hiddenClick;

	public void label_action_hiddenClick(){
		label_action_hiddenClick.click();
	}

	@FindBy(id="label_ECA_label15")
	private WebElement label_action_hidden;

	public boolean label_action_hidden(){
		 return label_action_hidden.isDisplayed();
	}

	@FindBy(id="label_ECA_label14")
	private WebElement label_action_goneClick;

	public void label_action_goneClick(){
		label_action_goneClick.click();
	}

	@FindBy(id="label_ECA_label16")
	private WebElement label_action_gone;

	public boolean label_action_gone(){
		 return label_action_gone.isDisplayed();
	}

	@FindBy(id="label_ECA_label29")
	private WebElement label_action_showClick;

	public void label_action_showClick(){
		label_action_showClick.click();
	}

	@FindBy(id="label_ECA_label30")
	private WebElement label_action_show;

	public boolean label_action_show(){
		 return label_action_show.isDisplayed();
	}

	@FindBy(id="label_ECA_label09")
	private WebElement label_action_change;

	public void label_action_changeClick(){
		label_action_change.click();
	}
	public String label_action_change(){
		 return label_action_change.getText();
	}
//###############################For Label Action#####################################



} 