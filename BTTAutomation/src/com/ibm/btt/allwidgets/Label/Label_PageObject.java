package com.ibm.btt.allwidgets.Label;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
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

	public int proHidden(){//verify label hidden
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(properties_hidden.getAttribute("style"), temp);
	}

	@FindBy(id="label_properties_label21")
	private WebElement properties_gone;

	public int proGone(){//verify label gone
		String[] temp={"display: none"};
		return Appearance.appearance_query(properties_gone.getAttribute("style"), temp);
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
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("label_ECA_onMouseLeave");
		main_class.widget_moveToElement("label_ECA_onMouseMove");
		return Evt_onMouseLeave.getText();
	}

	@FindBy(id="label_ECA_onMouseMove")
	private WebElement Evt_onMouseMove;

	public String Evt_onMouseMove(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("label_ECA_onMouseMove");
		return Evt_onMouseMove.getText();
	}

	@FindBy(id="label_ECA_onMouseEnter")
	private WebElement Evt_onMouseEnter;

	public String Evt_onMouseEnter(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
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
	@FindBy(id="label_appearance_label01")
	private WebElement appearance1;

	public boolean appearance1(){//1.Width is AutoSize,Height is AutoSize
		return Appearance.appearance_autosize(appearance1.getAttribute("style"));
	}
	
	@FindBy(id="label_appearance_label01_copy")
	private WebElement appearance2;

	public int appearance2(){//2.Width is AutoSize,Height is Fixed 30px
		String[] temp={"height: 30px"};
		return Appearance.appearance_query(appearance2.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy")
	private WebElement appearance3;

	public int appearance3(){//3.Width is AutoSize,Height is Relative 50%
		String[] temp={"height: 50%"};
		return Appearance.appearance_query(appearance3.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy")
	private WebElement appearance4;

	public int appearance4(){//4.Width is AutoSize,Height is Fill
		String[] temp={"height: 100%"};
		return Appearance.appearance_query(appearance4.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy")
	private WebElement appearance5;

	public int appearance5(){//5.Width is Fixed 100px,Height is AutoSize
		String[] temp={"width: 100px"};
		return Appearance.appearance_query(appearance5.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy")
	private WebElement appearance6;

	public int appearance6(){//6.Width is Fixed 100px,Height is Fixed 30px
		String[] temp={"height: 30px", "width: 100px"};
		return Appearance.appearance_query(appearance6.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy01")
	private WebElement appearance7;

	public int appearance7(){//7.Width is Fixed 100px,Height is Relative 50%
		String[] temp={"height: 50%", "width: 100px"};
		return Appearance.appearance_query(appearance7.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02")
	private WebElement appearance8;

	public int appearance8(){//8.Width is Fixed 100px,Height is Fill
		String[] temp={"height: 100%", "width: 100px"};
		return Appearance.appearance_query(appearance8.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy")
	private WebElement appearance9;

	public int appearance9(){//9.Width is Relative 50%,Height is AutoSize
		String[] temp={"width: 50%"};
		return Appearance.appearance_query(appearance9.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy01")
	private WebElement appearance10;

	public int appearance10(){//10.Width is Relative 50%,Height is Fixed 30px
		String[] temp={"height: 30px", "width: 50%"};
		return Appearance.appearance_query(appearance10.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy02")
	private WebElement appearance11;

	public int appearance11(){//11.Width is Relative 50%,Height is Relative 50%
		String[] temp={"height: 50%", "width: 50%"};
		return Appearance.appearance_query(appearance11.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy03")
	private WebElement appearance12;

	public int appearance12(){//12.Width is Relative 50%,Height is Fill
		String[] temp={"height: 100%", "width: 50%"};
		return Appearance.appearance_query(appearance12.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy04")
	private WebElement appearance13;

	public int appearance13(){//13.Width is Fill,Height is AutoSize
		String[] temp={"width: 100%"};
		return Appearance.appearance_query(appearance13.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy04_copy")
	private WebElement appearance14;

	public int appearance14(){//14.Width is Fill,Height is Fixed 30px
		String[] temp={"height: 30px", "width: 100%"};
		return Appearance.appearance_query(appearance14.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy04_copy01")
	private WebElement appearance15;

	public int appearance15(){//15.Width is Fill,Height is Relatvie 50%
		String[] temp={"height: 50%", "width: 100%"};
		return Appearance.appearance_query(appearance15.getAttribute("style"), temp);
	}
	
	@FindBy(id="label_appearance_label01_copy_copy_copy_copy_copy02_copy04_copy02")
	private WebElement appearance16;

	public int appearance16(){//16.Width is Fill,Height is Fill
		String[] temp={"height: 100%", "width: 100%"};
		return Appearance.appearance_query(appearance16.getAttribute("style"), temp);
	}
//###############################For Label Appearance#################################
//###############################For Label Appearance1################################
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[1]/td[2]")
	private WebElement Appearance1_1;
	
	public String Appearance1_1(){//1.horizontal is left,vertical is top
		String v = Appearance1_1.getAttribute("valign");
		String h = Appearance1_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[2]/td[2]")
	private WebElement Appearance1_2;
	
	public String Appearance1_2(){//2.horizontal is left,vertical is center
		String v = Appearance1_2.getAttribute("valign");
		String h = Appearance1_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[3]/td[2]")
	private WebElement Appearance1_3;
	
	public String Appearance1_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance1_3.getAttribute("valign");
		String h = Appearance1_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[4]/td[2]")
	private WebElement Appearance1_4;
	
	public String Appearance1_4(){//4.horizontal is center,vertical is top
		String v = Appearance1_4.getAttribute("valign");
		String h = Appearance1_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[5]/td[2]")
	private WebElement Appearance1_5;
	
	public String Appearance1_5(){//5.horizontal is center,vertical is center
		String v = Appearance1_5.getAttribute("valign");
		String h = Appearance1_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[6]/td[2]")
	private WebElement Appearance1_6;
	
	public String Appearance1_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance1_6.getAttribute("valign");
		String h = Appearance1_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[7]/td[2]")
	private WebElement Appearance1_7;
	
	public String Appearance1_7(){//7.horizontal is right,vertical is top
		String v = Appearance1_7.getAttribute("valign");
		String h = Appearance1_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[8]/td[2]")
	private WebElement Appearance1_8;
	
	public String Appearance1_8(){//8.horizontal is right,vertical is center
		String v = Appearance1_8.getAttribute("valign");
		String h = Appearance1_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[9]/td[2]")
	private WebElement Appearance1_9;
	
	public String Appearance1_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance1_9.getAttribute("valign");
		String h = Appearance1_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[10]/td[2]")
	private WebElement Appearance1_10;
	
	public int Appearance1_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance1_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='label_appearance1_panel']/tbody/tr[11]/td[2]")
	private WebElement Appearance1_11;
	
	public int Appearance1_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance1_11.getAttribute("style"), temp);
	}
//###############################For Label Appearance1################################
} 