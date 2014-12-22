package com.ibm.btt.allwidgets.Label;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.allwidgets.Index_Page;
import com.ibm.btt.allwidgets.Main_Page;

public class Label_PageObject extends Main_Page{ 

//###############################For Label Properties##################################
	@FindBy(id="label_properties_label")
	private WebElement properties_String;

	public String proString(){
		 return properties_String.getText();
	}

	@FindBy(id="label_properties_label06")
	private WebElement properties_Duration;

	public String proDuration(){
		 return properties_Duration.getText();
	}

	@FindBy(id="label_properties_label01")
	private WebElement properties_Date;

	public String proDate(){
		 return properties_Date.getText();
	}

	@FindBy(id="label_properties_label02")
	private WebElement properties_Currency;

	public String proCurrency(){
		 return properties_Currency.getText();
	}

	@FindBy(id="label_properties_label03")
	private WebElement properties_Number;

	public String proNumber(){
		 return properties_Number.getText();
	}
	
	@FindBy(id="label_properties_label04")
	private WebElement properties_Boolean;

	public Boolean proBoolean(){
		 if("true".equals(properties_Boolean.getText())){
			 return true;
		 }else
			 return true;
	}

	@FindBy(id="label_properties_label07")
	private WebElement properties_XMLGregorianCalendar;

	public String proXMLGregorianCalendar(){
		 return properties_XMLGregorianCalendar.getText();
	}

	@FindBy(id="label_properties_label08")
	private WebElement properties_Byte;

	public String proByte(){
		 return properties_Byte.getText();
	}

	@FindBy(id="label_properties_label09")
	private WebElement properties_Short;

	public String proShort(){
		 return properties_Short.getText();
	}

	@FindBy(id="label_properties_label10")
	private WebElement properties_Integer;

	public String proInteger(){
		 return properties_Integer.getText();
	}

	@FindBy(id="label_properties_label11")
	private WebElement properties_Long;

	public String proLong(){
		 return properties_Long.getText();
	}

	@FindBy(id="label_properties_label12")
	private WebElement properties_Float;

	public String proFloat(){
		 return properties_Float.getText();
	}

	@FindBy(id="label_properties_label13")
	private WebElement properties_Double;

	public String proDouble(){
		 return properties_Double.getText();
	}

	@FindBy(id="label_properties_label14")
	private WebElement properties_BigInteger;

	public String proBigInteger(){
		 return properties_BigInteger.getText();
	}

	@FindBy(id="label_properties_label22")
	private WebElement properties_visible;

	public Boolean proVisible(){//verify label visible
		 return properties_visible.isDisplayed();
	}

	@FindBy(id="label_properties_label19")
	private WebElement properties_hidden;

	public Boolean proHidden(){//verify label hidden
		 return properties_hidden.isDisplayed();
	}

	@FindBy(id="label_properties_label21")
	private WebElement properties_gone;

	public String proGone(){//verify label gone
		 return properties_gone.getAttribute("style");
	}

	@FindBy(id="label_properties_label26")
	private WebElement properties_filedReference;

	public void proFiledReference(){
		properties_filedReference.click();
	}

	@FindBy(id="label_properties_radio")
	private WebElement properties_filedReference_radio;

	public Boolean proFiledReferenceRadio(){
		 return properties_filedReference_radio.isSelected();
	}

	@FindBy(id="label_properties_label16")
	private WebElement properties_NLS;

	public String proNLS(){
		 return properties_NLS.getAttribute("lang");
	}

//###############################For Label Properties##################################	
//###############################For Label ECA#########################################	
//label Event	
	@FindBy(id="label_ECA_onclick")
	private WebElement Evt_onclick;

	public String Evt_onclick(){
		Evt_onclick.click();
		return Evt_onclick.getText();
	}

	@FindBy(id="label_ECA_onMouseup")
	private WebElement Evt_onMouseup;

	public String Evt_onMouseup(){
		Evt_onMouseup.click();
		return Evt_onMouseup.getText();
	}

	@FindBy(id="label_ECA_onMouseLeave")
	private WebElement Evt_onMouseLeave;

	public String Evt_onMouseLeave(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("label_ECA_onMouseLeave");
		main_class.widget_moveToElement("label_ECA_onMouseMove");
		return Evt_onMouseLeave.getText();
	}

	@FindBy(id="label_ECA_onMouseMove")
	private WebElement Evt_onMouseMove;

	public String Evt_onMouseMove(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("label_ECA_onMouseMove");
		return Evt_onMouseMove.getText();
	}

	@FindBy(id="label_ECA_onMouseEnter")
	private WebElement Evt_onMouseEnter;

	public String Evt_onMouseEnter(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("label_ECA_onMouseEnter");
		return Evt_onMouseEnter.getText();
	}

	@FindBy(id="label_ECA_onMousedown")
	private WebElement Evt_onMousedown;

	public String Evt_onMousedown(){
		 Evt_onMousedown.click();
		 return Evt_onMousedown.getText();
	}

//label Condition
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
//###############################For Label ECA#########################################
//###############################For Label Action#####################################	
	@FindBy(id="label_ECA_label11")
	private WebElement Evt_stylecss;

	public int Evt_stylecss(){
		Evt_stylecss.click();
		String[] temp = {"pointer_down"};
		return CSS.css_query(Evt_stylecss.getAttribute("class"), temp);
	}
	
	@FindBy(id="label_ECA_label13")
	private WebElement action_hiddenClick;
	
	@FindBy(id="label_ECA_label15")
	private WebElement action_hidden;

	public boolean actHidden(){
		action_hiddenClick.click();
		return action_hidden.isDisplayed();
	}

	@FindBy(id="label_ECA_label14")
	private WebElement action_goneClick;
	
	@FindBy(id="label_ECA_label16")
	private WebElement action_gone;

	public boolean actGone(){
		action_goneClick.click();
		return action_gone.isDisplayed();
	}

	@FindBy(id="label_ECA_label29")
	private WebElement action_showClick;
	
	@FindBy(id="label_ECA_label30")
	private WebElement action_show;

	public boolean actShow(){
		action_showClick.click();
		return action_show.isDisplayed();
	}

	@FindBy(id="label_ECA_label09")
	private WebElement action_change;

	public String actChange(){
		action_change.click();
		return action_change.getText();
	}
//###############################For Label Action#####################################
//###############################For Label CSS########################################
	@FindBy(id="label_css_label03")
	private WebElement css_style1;

	public int cssStyle1(){//only have one css style
		String[] temp={"setFontSize"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="label_css_label04")
	private WebElement css_style2;

	public int cssStyle2(){//two css styles
		String[] temp={"setFontSize", "setColor"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="label_css_label05")
	private WebElement css_style3;

	public int cssStyle3(){//three css styles
		String[] temp={"setColor", "setBackgroundColor", "setBorder"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="label_css_label06")
	private WebElement css_style4;

	public int cssStyle4(){//The types of style from dojo provided 	
		String[] temp={"dijitIconUsers"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################For Label CSS########################################
//###############################For Label Appearance#################################
	
//###############################For Label Appearance#################################



} 