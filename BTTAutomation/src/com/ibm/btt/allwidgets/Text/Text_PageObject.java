package com.ibm.btt.allwidgets.Text;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
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
	
	@FindBy(id="widget_Text_properties_text02")
	private WebElement Text_properties_hidden;
	
	public int Text_properties_hidden(){
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(Text_properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_Text_properties_text03")
	private WebElement Text_properties_gone;
	
	public int Text_properties_gone(){
		String[] temp={"display: none"};
		return Appearance.appearance_query(Text_properties_gone.getAttribute("style"), temp);
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
	
	@FindBy(id="Text_properties_text08")
	private WebElement Text_properties_shortcut;
	
	public Boolean Text_properties_shortcut(){
		Main_Class.executeCombinationKey(Keys.SHIFT,Keys.ALT,"C");	
		Boolean b = AllWidgetsProjectMain_Class.widget_isFocus("Text_properties_text08");
		return b;
	}

	@FindBy(id="Text_properties_text09")
	private WebElement Text_properties_hint;
	
	public String Text_properties_hint(){
		return Text_properties_hint.getAttribute("title");
	}
	
	@FindBy(id="Text_properties_text10")
	private WebElement Text_properties_password;
	
	public String Text_properties_password(){
		return Text_properties_password.getAttribute("type");
	}
	
	public void Text_properties_password_sendKeys(){
		Text_properties_password.sendKeys("111111");
	}
	
	@FindBy(id="Text_properties_text11")
	private WebElement Text_properties_tabIndex;
	
	public String Text_properties_tabIndex_getTabIndex(){
		return Text_properties_tabIndex.getAttribute("tabindex");
	}
	
	@FindBy(id="Text_properties_text12")
	private WebElement Text_properties_maxLength;
	
	public void Text_properties_maxLength_sendKeys(){
		Text_properties_maxLength.sendKeys("123456789011");
	}
	
	public String Text_properties_maxLength_getValue(){
		return Text_properties_maxLength.getAttribute("value");
	}
	
	public String Text_properties_maxLength_getSize(){
		return Text_properties_maxLength.getAttribute("maxlength");
	}
	
	@FindBy(xpath=".//*[@id='widget_Text_properties_text13']/div[2]/span")
	private WebElement Text_properties_placeHolder;
	
	public String Text_properties_placeHolder_getText(){
		return Text_properties_placeHolder.getText();
	}
	
	@FindBy(id="Text_properties_text14")
	private WebElement Text_properties_acceptedCharReg;
	
	public void Text_properties_acceptedCharReg_sendKeys(String str){
		Text_properties_acceptedCharReg.sendKeys(str);
	}
	
	public String Text_properties_acceptedCharReg_getValue(){
		return Text_properties_acceptedCharReg.getAttribute("value");
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
//###############################Text Event#######################################
	@FindBy(id="Text_event_text")
	private WebElement Text_event_onclick;
	
	@FindBy(id="Text_event_Label1")
	private WebElement Text_event_onclick_label;
	
	public Boolean Text_event_onclick(){
		Text_event_onclick.click();
		return Text_event_onclick_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text01")
	private WebElement Text_event_onFocus;
	
	@FindBy(id="Text_event_Label2")
	private WebElement Text_event_onFocus_label;
	
	public Boolean Text_event_onFocus(){
		Text_event_onFocus.click();
		return Text_event_onFocus_label.isDisplayed();
	}

	@FindBy(id="Text_event_text02")
	private WebElement Text_event_onBlur;
	
	@FindBy(id="Text_event_Label3")
	private WebElement Text_event_onBlur_label;
	
	public Boolean Text_event_onBlur(){
		Text_event_onBlur.click();
		Text_event_onFocus.click();
		return Text_event_onBlur_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text03")
	private WebElement Text_event_keyDown;
	
	@FindBy(id="Text_event_Label4")
	private WebElement Text_event_keyDown_label;
	
	public Boolean Text_event_keyDown(){
		Text_event_keyDown.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.SHIFT);
		return Text_event_keyDown_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text04")
	private WebElement Text_event_onKeyPress;
	
	@FindBy(id="Text_event_Label5")
	private WebElement Text_event_onKeyPress_label;
	
	public Boolean Text_event_onKeyPress(){
		Text_event_onKeyPress.click();
		Main_Class.pressAnyKey("C");
		return Text_event_onKeyPress_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text05")
	private WebElement Text_event_onKeyUp;
	
	@FindBy(id="Text_event_Label6")
	private WebElement Text_event_onKeyUp_label;
	
	public Boolean Text_event_onKeyUp(){
		Text_event_onKeyUp.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return Text_event_onKeyUp_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text06")
	private WebElement Text_event_onMouseDown;
	
	@FindBy(id="Text_event_Label7")
	private WebElement Text_event_onMouseDown_label;
	
	public Boolean Text_event_onMouseDown(){
		Text_event_onMouseDown.click();
		return Text_event_onMouseDown_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text07")
	private WebElement Text_event_onMouseUp;
	
	@FindBy(id="Text_event_Label8")
	private WebElement Text_event_onMouseUp_label;
	
	public Boolean Text_event_onMouseUp(){
		Text_event_onMouseUp.click();
		return Text_event_onMouseUp_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text08")
	private WebElement Text_event_onMouseEnter;
	
	@FindBy(id="Text_event_Label9")
	private WebElement Text_event_onMouseEnter_label;
	
	public Boolean Text_event_onMouseEnter(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Text_event_text08");
		return Text_event_onMouseEnter_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text09")
	private WebElement Text_event_onMouseLeave;
	
	@FindBy(id="Text_event_Label10")
	private WebElement Text_event_onMouseLeave_label;
	
	public Boolean Text_event_onMouseLeave(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Text_event_text09");
		main_class.widget_moveToElement("Text_event_text08");
		return Text_event_onMouseLeave_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text10")
	private WebElement Text_event_onMouseMove;
	
	@FindBy(id="Text_event_Label11")
	private WebElement Text_event_onMouseMove_label;
	
	public Boolean Text_event_onMouseMove(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Text_event_text10");
		return Text_event_onMouseMove_label.isDisplayed();
	}
	
	@FindBy(id="Text_event_text11")
	private WebElement Text_event_onChange;
	
	@FindBy(id="Text_event_Label12")
	private WebElement Text_event_onChange_label;
	
	public Boolean Text_event_onChange(){
		Text_event_onChange.sendKeys("asdf");
		Text_event_onMouseMove.click();
		return Text_event_onChange_label.isDisplayed();
	}
//###############################Text Event#######################################
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
	
	public Boolean Text_condition_disable_buttonisDisplayed(){
		return Text_condition_disable_button.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text03")
	private WebElement Text_condition_readonlyTrue;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement Text_condition_readonlyTrue_tooltip;
	
	public String Text_condition_readonlyTrue(){
		return Text_condition_readonlyTrue.getAttribute("readonly");
	}
	
	public String Text_condition_getTooltip(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Text_condition_text03");
		try {
			Thread.sleep(1000);
			main_class.widget_moveToElement("Text_condition_text04");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Text_condition_readonlyTrue_tooltip.getText();
	}
	
	@FindBy(id="Text_condition_text04")
	private WebElement Text_Expression_isFocusable;
	
	public void Text_condition_Focusable_click(){
		Text_Expression_isFocusable.click();
	}
	
	@FindBy(id="Text_condition_button02")
	private WebElement Text_Expression_isFocusable_button;
	
	public Boolean Text_Expression_isFocusable_button(){
		return Text_Expression_isFocusable_button.isDisplayed();
	}
	
	@FindBy(xpath=".//*[@id='Text_condition_text05']")
	private WebElement Text_Expression_id;
	
	public void Text_Expression_id(){
		if(Text_Expression_id.getAttribute("id").equals("Text_condition_text05")){
			Text_Expression_id.click();
		}else
			System.out.println("id does not equal Text_condition_text05");
	}
	
	@FindBy(id="Text_condition_button03")
	private WebElement Text_Expression_id_button;
	
	public Boolean Text_Expression_id_button(){
		return Text_Expression_id_button.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text06")
	private WebElement Text_Expression_isMandatory;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_1']/div[2]")
	private WebElement Text_Expression_isMandatory_tooltip;
	
	@FindBy(id="Text_condition_label07")
	private WebElement Text_Expression_label;
	
	public String Text_Expression_isMandatory_tooltip(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Text_condition_text06");
		Text_Expression_isMandatory.click();
		main_class.widget_moveToElement("Text_condition_label07");
		Text_Expression_label.click();
		Text_Expression_isMandatory.click();
		return Text_Expression_isMandatory_tooltip.getText();
	}
	
	@FindBy(id="Text_condition_button06")
	private WebElement Text_Expression_isMandatory_button;
	
	public Boolean Text_Expression_isMandatory_button(){
		return Text_Expression_isMandatory_button.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text07")
	private WebElement Text_Expression_visible;
	
	public Boolean Text_Expression_visible(){
		Text_Expression_visible.click();
		return Text_Expression_visible.isDisplayed();
	}
	
	@FindBy(id="Text_condition_button04")
	private WebElement Text_Expression_visible_button;
	
	public Boolean Text_Expression_visible_button(){
		return Text_Expression_visible_button.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text08")
	private WebElement Text_Expression_disabledFalse;
	
	public Boolean Text_Expression_disabledFalse(){
		Text_Expression_disabledFalse.click();
		return Text_Expression_disabledFalse.isEnabled();
	}
	
	@FindBy(id="Text_condition_button05")
	private WebElement Text_Expression_disabledFalse_button;
	
	public Boolean Text_Expression_disabledFalse_button(){
		return Text_Expression_disabledFalse_button.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text09")
	private WebElement Text_Expression_readonlyFalse;
	
	public Boolean Text_Expression_readonlyFalse(){
		Text_Expression_readonlyFalse.click();
		return Text_Expression_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="Text_condition_button07")
	private WebElement Text_Expression_readonlyFalse_button;
	
	public Boolean Text_Expression_readonlyFalse_button(){
		return Text_Expression_readonlyFalse_button.isDisplayed();
	}
	
	@FindBy(id="Text_condition_text10")
	private WebElement Text_Expression_valueabc;
	
	public void Text_Expression_valueabc_clear(){
		Text_Expression_valueabc.clear();
	}
	
	public void Text_Expression_valueabc(String str){
		Text_Expression_valueabc.sendKeys(str);
		Text_Expression_valueabc.click();
	}
	
	@FindBy(id="Text_condition_button08")
	private WebElement Text_Expression_valueabc_button;
	
	public Boolean Text_Expression_valueabc_button(){
		return Text_Expression_valueabc_button.isDisplayed();
	}

//###############################Text Condition###################################
//###############################Text Action######################################
	@FindBy(id="Text_action_label05")
	private WebElement Text_Action_focus;
	
	public Boolean Text_Action_focus(){
		Text_Action_focus.click();
		return AllWidgetsProjectMain_Class.widget_isFocus("Text_action_text");
	}
	
	@FindBy(id="Text_action_label18")
	private WebElement Text_Action_showErrorMessage;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement Text_Action_showErrorMessage_tooltip;
	
	public String Text_Action_showErrorMessage(){
		Text_Action_showErrorMessage.click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Text_Action_showErrorMessage_tooltip.getText();
	}
	
	@FindBy(id="Text_action_label21")
	private WebElement Text_Action_styleClass;
	
	@FindBy(id="widget_Text_action_text02")
	private WebElement Text_Action_styleClassChange;
	
	public int Text_Action_styleClass(){
		Text_Action_styleClass.click();
		String[] temp = {"setBorder"};
		int num = CSS.css_query(Text_Action_styleClassChange.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="Text_action_label22")
	private WebElement Text_Action_value;
	
	@FindBy(id="Text_action_text03")
	private WebElement Text_Action_getValue;
	
	public String Text_Action_value(){
		Text_Action_value.click();
		return Text_Action_getValue.getAttribute("value");
	}
	
	@FindBy(id="Text_action_label23")
	private WebElement Text_Action_isMandatory;
	
	@FindBy(id="Text_action_text04")
	private WebElement Text_Action_isMandatory_Text;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_1']/div[2]")
	private WebElement Text_Action_isMandatory_TextTooltip;
	
	public String Text_Action_isMandatory(){
		Text_Action_isMandatory.click();
		Text_Action_isMandatory_Text.click();
		Text_Action_isMandatory.click();
		Text_Action_isMandatory_Text.click();
		return Text_Action_isMandatory_TextTooltip.getText();
	}
	
	@FindBy(id="Text_action_label15")
	private WebElement Text_Action_hidden;
	
	@FindBy(id="Text_action_text05")
	private WebElement Text_Action_hidden_Text;
	
	public Boolean Text_Action_hidden(){
		Text_Action_hidden.click();
		return Text_Action_hidden_Text.isDisplayed();
	}
	
	@FindBy(id="Text_action_label24")
	private WebElement Text_Action_disabledTrue;
	
	@FindBy(id="Text_action_text06")
	private WebElement Text_Action_disabledTrue_Text;
	
	public String Text_Action_disabledTrue(){
		Text_Action_disabledTrue.click();
		return Text_Action_disabledTrue_Text.getAttribute("disabled");
	}
	
	@FindBy(id="Text_action_label25")
	private WebElement Text_Action_readOnlyTrue;
	
	@FindBy(id="Text_action_text07")
	private WebElement Text_Action_readOnlyTrue_Text;
	
	public String Text_Action_readOnlyTrue(){
		Text_Action_readOnlyTrue.click();
		return Text_Action_readOnlyTrue_Text.getAttribute("readonly");
	}
	
	@FindBy(id="Text_action_label26")
	private WebElement Text_Action_hint;
	
	@FindBy(id="Text_action_text08")
	private WebElement Text_Action_getHint;
	
	public String Text_Action_hint(){
		Text_Action_hint.click();
		return Text_Action_getHint.getAttribute("title");
	}
//###############################Text Action######################################
//###########################Text Appearance1#################################
	@FindBy(id="widget_Text_appearance1_text")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_Text_appearance1_text01")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is Fixed 200px,Height is AutoSize
		String[] temp={"width: 200px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_Text_appearance1_text02")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is Fill,Height is AutoSize
		String[] temp={"width: 100%"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_Text_appearance1_text03")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is Relative 30%,Height is AutoSize
		String[] temp={"width: 30%"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
//###############################Text Appearance1###############################
//###############################Text Appearance2###############################
	@FindBy(xpath=".//*[@id='Text_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='Text_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################Text Appearance2###############################
//###############################Text Submit####################################
	@FindBy(id="Text_submit_text")
	private WebElement subString;
	
	@FindBy(id="Text_submit_text01")
	private WebElement subDate;
	
	@FindBy(id="Text_submit_text02")
	private WebElement subCurrency;
	
	@FindBy(id="Text_submit_text03")
	private WebElement subNumber;
	
	@FindBy(id="Text_submit_text06")
	private WebElement subXMLGregorianCalendar;
	
	@FindBy(id="Text_submit_text07")
	private WebElement subByte;
	
	@FindBy(id="Text_submit_text08")
	private WebElement subShort;
	
	@FindBy(id="Text_submit_text09")
	private WebElement subInteger;
	
	@FindBy(id="Text_submit_text10")
	private WebElement subLong;
	
	@FindBy(id="Text_submit_text11")
	private WebElement subFloat;
	
	@FindBy(id="Text_submit_text12")
	private WebElement subDouble;
	
	@FindBy(id="Text_submit_text13")
	private WebElement subBigInteger;
	
	@FindBy(id="Text_submit_text14")
	private WebElement subDecimal;
	
	@FindBy(id="Text_submit_text15")
	private WebElement subIsMandatoryT;
	
	@FindBy(id="Text_submit_text16")
	private WebElement subIsMandatoryF;
	
	@FindBy(id="Text_submit_button")
	private WebElement subButton;
	
	public String subButton(){
		return subButton.getAttribute("aria-disabled");
	}
	
	public String subData(){
		subString.sendKeys("aaa");
		subDate.sendKeys("2015-05-21");
		subCurrency.sendKeys("$213.05");
		subNumber.sendKeys("123");
		subXMLGregorianCalendar.sendKeys("2015-05-26");
		subByte.sendKeys("12");
		subShort.sendKeys("23");
		subInteger.sendKeys("123");
		subLong.sendKeys("123");
		subFloat.sendKeys("21.45");
		subDouble.sendKeys("23.456");
		subBigInteger.sendKeys("234");
		subDecimal.sendKeys("334.563");
		subIsMandatoryT.sendKeys("123");
		subIsMandatoryF.sendKeys("");
		return subButton.getAttribute("aria-disabled");
	}
	
	public void ButtonClick(){
		subButton.click();
	}
	
//result page	
	@FindBy(id="Text_submit_Result_text")
	private WebElement subResultString;
	
	@FindBy(id="Text_submit_Result_text01")
	private WebElement subResultDate;
	
	@FindBy(id="Text_submit_Result_text02")
	private WebElement subResultCurrency;
	
	@FindBy(id="Text_submit_Result_text03")
	private WebElement subResultNumber;
	
	@FindBy(id="Text_submit_Result_text06")
	private WebElement subResultXMLGregorianCalendar;
	
	@FindBy(id="Text_submit_Result_text07")
	private WebElement subResultByte;
	
	@FindBy(id="Text_submit_Result_text08")
	private WebElement subResultShort;
	
	@FindBy(id="Text_submit_Result_text09")
	private WebElement subResultInteger;
	
	@FindBy(id="Text_submit_Result_text10")
	private WebElement subResultLong;
	
	@FindBy(id="Text_submit_Result_text11")
	private WebElement subResultFloat;
	
	@FindBy(id="Text_submit_Result_text12")
	private WebElement subResultDouble;
	
	@FindBy(id="Text_submit_Result_text13")
	private WebElement subResultBigInteger;
	
	@FindBy(id="Text_submit_Result_text14")
	private WebElement subResultBigDecimal;
	
	@FindBy(id="Text_submit_Result_text15")
	private WebElement subResultIsMandatoryT;
	
	@FindBy(id="Text_submit_Result_text16")
	private WebElement subResultIsMandatoryF;
	
	public String subResultString(){
		return subResultString.getAttribute("value");
	}
	
	public String subResultDate(){
		return subResultDate.getAttribute("value");
	}
	
	public String subResultCurrency(){
		return subResultCurrency.getAttribute("value");
	}
	
	public String subResultNumber(){
		return subResultNumber.getAttribute("value");
	}
	
	public String subResultXMLGregorianCalendar(){
		return subResultXMLGregorianCalendar.getAttribute("value");
	}
	
	public String subResultByte(){
		return subResultByte.getAttribute("value");
	}
	
	public String subResultShort(){
		return subResultShort.getAttribute("value");
	}
	
	public String subResultInteger(){
		return subResultInteger.getAttribute("value");
	}
	
	public String subResultLong(){
		return subResultLong.getAttribute("value");
	}
	
	public String subResultFloat(){
		return subResultFloat.getAttribute("value");
	}
	
	public String subResultDouble(){
		return subResultDouble.getAttribute("value");
	}
	
	public String subResultBigInteger(){
		return subResultBigInteger.getAttribute("value");
	}
	
	public String subResultBigDecimal(){
		return subResultBigDecimal.getAttribute("value");
	}
	
	public String subResultIsMandatoryT(){
		return subResultIsMandatoryT.getAttribute("value");
	}
	
	public String subResultIsMandatoryF(){
		return subResultIsMandatoryF.getAttribute("value");
	}
//###############################Text Submit####################################


}
