package com.ibm.btt.allwidgets.CheckBox;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.CSS;
import com.ibm.btt.util.DateType;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.allwidgets.*;

public class CheckBox_PageObject extends Main_Page{
	
//###############################CheckBox Properties##################################
	@FindBy(xpath=".//*[@id='CheckBox_properties_checkBox_id']")
	private WebElement CheckBox_properties_id;
	
	public String CheckBox_properties_id(){
		return CheckBox_properties_id.getAttribute("id");
	}
	
	@FindBy(id="CheckBox_properties_String_Data")
	private WebElement CheckBox_properties_valueString;
	
	public String CheckBox_properties_valueString(){
		return CheckBox_properties_valueString.getAttribute("name");
	}
	
	@FindBy(id="CheckBox_properties_checkBox_english")
	private WebElement CheckBox_properties_valueBoolean;
	
	public String CheckBox_properties_valueBoolean(){
		return CheckBox_properties_valueBoolean.getAttribute("name");
	}
	
	@FindBy(id="CheckBox_properties_checkBox_spanish")
	private WebElement CheckBox_properties_valueInteger;
	
	public String CheckBox_properties_valueInteger(){
		return CheckBox_properties_valueInteger.getAttribute("name");
	}
	
	@FindBy(xpath=".//*[@id='CheckBox_properties_form']/table/tbody/tr[3]/td[2]/label")
	private WebElement CheckBox_properties_visibility;
	
	public String CheckBox_properties_visibility(){
		return CheckBox_properties_visibility.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='CheckBox_properties_group']/div/div/div/div/label")
	private WebElement CheckBox_properties_hidden;
	
	public String CheckBox_properties_hidden(){
		return CheckBox_properties_hidden.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='CheckBox_properties_group01']/div/div/div/div/label")
	private WebElement CheckBox_properties_gone;
	
	public String CheckBox_properties_gone(){
		return CheckBox_properties_gone.getAttribute("style");
	}
	
	@FindBy(id="CheckBox_properties_checkBox_disabled")
	private WebElement CheckBox_properties_disabledFalse;
	
	public Boolean CheckBox_properties_disabledFalse(){
		return CheckBox_properties_disabledFalse.isEnabled();
	}
	
	@FindBy(id="CheckBox_properties_checkBox08")
	private WebElement CheckBox_properties_disableTrue;
	
	public String CheckBox_properties_disableTrue(){
		return CheckBox_properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="CheckBox_properties_checkBox_readOnly")
	private WebElement CheckBox_properties_checkBox_readOnlyFalse;
	
	public Boolean CheckBox_properties_checkBox_readOnlyFalse(){
		return CheckBox_properties_checkBox_readOnlyFalse.isEnabled();
	}
	
	@FindBy(id="CheckBox_properties_checkBox09")
	private WebElement CheckBox_properties_readOnlyTrue;
	
	public String CheckBox_properties_readOnlyTrue(){
		return CheckBox_properties_readOnlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="CheckBox_properties_checkBox")
	private WebElement CheckBox_properties_shortcut;
	
	public String CheckBox_properties_shortcut(){
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_C);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_C);
        return CheckBox_properties_shortcut.getAttribute("aria-checked");
	}

	@FindBy(id="CheckBox_properties_checkBox01")
	private WebElement CheckBox_properties_hint;
	
	public String CheckBox_properties_hint(){
		return CheckBox_properties_hint.getAttribute("title");
	}
	
	@FindBy(id="CheckBox_properties_checkBox10")
	private WebElement CheckBox_properties_hint1;
	
	public String CheckBox_properties_hint1(){
		return CheckBox_properties_hint1.getAttribute("title");
	}
	
	@FindBy(id="CheckBox_properties_checkBox04")
	private WebElement CheckBox_properties_tabIndex1;
	
	@FindBy(xpath=".//*[@id='CheckBox_properties_form']/table/tbody/tr[13]/td[3]/div")
	private WebElement CheckBox_properties_tabIndex1Focus;
	
	public String CheckBox_properties_tabIndex1(){
		return CheckBox_properties_tabIndex1.getAttribute("tabindex");
	}
	
	public int CheckBox_properties_tabIndex1Focus(){
		String[] temp = {"dijitCheckBoxFocused", "dijitFocused"};
		System.out.println(CheckBox_properties_tabIndex1Focus.getAttribute("class"));
		return CSS.css_query(CheckBox_properties_tabIndex1Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="CheckBox_properties_checkBox05")
	private WebElement CheckBox_properties_tabIndex2;
	
	@FindBy(xpath=".//*[@id='CheckBox_properties_form']/table/tbody/tr[13]/td[4]/div")
	private WebElement CheckBox_properties_tabIndex2Focus;
	
	public String CheckBox_properties_tabIndex2(){
		return CheckBox_properties_tabIndex2.getAttribute("tabindex");
	}
	
	public int CheckBox_properties_tabIndex2Focus(){
		String[] temp = {"dijitCheckBoxFocused", "dijitFocused"};
		return CSS.css_query(CheckBox_properties_tabIndex2Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="CheckBox_properties_checkBox02")
	private WebElement CheckBox_properties_tabIndex3;
	
	@FindBy(xpath=".//*[@id='CheckBox_properties_form']/table/tbody/tr[13]/td[2]/div")
	private WebElement CheckBox_properties_tabIndex3Focus;
	
	public String CheckBox_properties_tabIndex3(){
		return CheckBox_properties_tabIndex3.getAttribute("tabindex");
	}
	
	public int CheckBox_properties_tabIndex3Focus(){
		String[] temp = {"dijitCheckBoxFocused", "dijitFocused"};
		return CSS.css_query(CheckBox_properties_tabIndex3Focus.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='CheckBox_properties_form']/table/tbody/tr[14]/td[2]/label")
	private WebElement CheckBox_properties_NLS;
	
	public String CheckBox_properties_NLS(){
		return CheckBox_properties_NLS.getText();
	}
//###############################CheckBox Properties##################################
//###############################CheckBox CSS#########################################
	@FindBy(xpath=".//*[@id='CheckBox_css_form']/div/div[1]/div[2]/label")
	private WebElement CheckBox_css_style1;
	
	public int CheckBox_css_style1_getAttribute(){
		String[] temp={"setFontWeight"};
		return CSS.css_query(CheckBox_css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='CheckBox_css_form']/div/div[2]/div[2]/label")
	private WebElement CheckBox_css_style2;
	
	public int CheckBox_css_style2_getAttribute(){
		String[] temp={"setFontSize", "setColor"};
		return CSS.css_query(CheckBox_css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='CheckBox_css_form']/div/div[3]/div[2]/label")
	private WebElement CheckBox_css_style3;
	
	public int CheckBox_css_style3_getAttribute(){
		String[] temp={"setFontWeight", "setFontSize", "setFontStyle"};
		return CSS.css_query(CheckBox_css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='CheckBox_css_form']/div/div[4]/div[2]/label")
	private WebElement CheckBox_css_style4;
	
	public int CheckBox_css_style4_getAttribute(){
		String[] temp={"dijitIconConfigure"};
		return CSS.css_query(CheckBox_css_style4.getAttribute("class"), temp);
	}
//###############################CheckBox CSS#########################################
//###############################CheckBox Event#######################################
	@FindBy(id="CheckBox_Event_checkBox_Event_onClick")
	private WebElement CheckBox_Event_CheckBox_onClick;
	
	@FindBy(id="CheckBox_Event_label01")
	private WebElement CheckBox_Event_CheckBox_onClick_label;
	
	public String CheckBox_Event_CheckBox_onClick(){
		CheckBox_Event_CheckBox_onClick.click();
		return CheckBox_Event_CheckBox_onClick_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onKeyDown")
	private WebElement CheckBox_Event_checkBox_event_onKeyDown;
	
	@FindBy(id="CheckBox_Event_label08")
	private WebElement CheckBox_Event_checkBox_event_onKeyDown_label;
	
	public String CheckBox_Event_checkBox_event_onKeyDown(){
		CheckBox_Event_checkBox_event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return CheckBox_Event_checkBox_event_onKeyDown_label.getText();
	}

	@FindBy(id="CheckBox_Event_checkBox_event_onKeyPress")
	private WebElement CheckBox_Event_checkBox_event_onKeyPress;
	
	@FindBy(id="CheckBox_Event_label07")
	private WebElement CheckBox_Event_checkBox_event_onKeyPress_label;
	
	public String CheckBox_Event_checkBox_event_onKeyPress(){
		CheckBox_Event_checkBox_event_onKeyPress.click();
		Main_Class.keyPress(KeyEvent.VK_6);
		Main_Class.keyRelease(KeyEvent.VK_6);
		return CheckBox_Event_checkBox_event_onKeyPress_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onKeyUp")
	private WebElement CheckBox_Event_checkBox_event_onKeyUp;
	
	@FindBy(id="CheckBox_Event_label06")
	private WebElement CheckBox_Event_checkBox_event_onKeyUp_label;
	
	public String CheckBox_Event_checkBox_event_onKeyUp(){
		CheckBox_Event_checkBox_event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return CheckBox_Event_checkBox_event_onKeyUp_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onMouseDown")
	private WebElement CheckBox_Event_checkBox_event_onMouseDown;
	
	@FindBy(id="CheckBox_Event_label05")
	private WebElement CheckBox_Event_checkBox_event_onMouseDown_label;
	
	public String CheckBox_Event_checkBox_event_onMouseDown(){
		CheckBox_Event_checkBox_event_onMouseDown.click();
		return CheckBox_Event_checkBox_event_onMouseDown_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onMouseUp")
	private WebElement CheckBox_Event_checkBox_event_onMouseUp;
	
	@FindBy(id="CheckBox_Event_label04")
	private WebElement CheckBox_Event_checkBox_event_onMouseUp_label;
	
	public String CheckBox_Event_checkBox_event_onMouseUp(){
		CheckBox_Event_checkBox_event_onMouseUp.click();
		return CheckBox_Event_checkBox_event_onMouseUp_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onMouseEnter")
	private WebElement CheckBox_Event_checkBox_event_onMouseEnter;
	
	@FindBy(id="CheckBox_Event_label03")
	private WebElement CheckBox_Event_checkBox_event_onMouseEnter_label;
	
	public String CheckBox_Event_checkBox_event_onMouseEnter(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("CheckBox_Event_checkBox_event_onMouseEnter");
		return CheckBox_Event_checkBox_event_onMouseEnter_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onMouseLeave")
	private WebElement CheckBox_Event_checkBox_event_onMouseLeave;
	
	@FindBy(id="CheckBox_Event_label02")
	private WebElement CheckBox_Event_checkBox_event_onMouseLeave_label;
	
	public String CheckBox_Event_checkBox_event_onMouseLeave(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("CheckBox_Event_checkBox_event_onMouseLeave");
		main_class.widget_moveToElement("CheckBox_Event_checkBox_event_onMouseEnter");
		return CheckBox_Event_checkBox_event_onMouseLeave_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onMouseMove")
	private WebElement CheckBox_Event_checkBox_event_onMouseMove;
	
	@FindBy(id="CheckBox_Event_label09")
	private WebElement CheckBox_Event_checkBox_event_onMouseMove_label;
	
	public String CheckBox_Event_checkBox_event_onMouseMove(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("CheckBox_Event_checkBox_event_onMouseMove");
		return CheckBox_Event_checkBox_event_onMouseMove_label.getText();
	}
	
	@FindBy(id="CheckBox_Event_checkBox_event_onChange")
	private WebElement CheckBox_Event_checkBox_event_onChange;
	
	@FindBy(id="CheckBox_Event_label09_copy")
	private WebElement CheckBox_Event_checkBox_event_onChange_label;
	
	public String CheckBox_Event_checkBox_event_onChange(){
		CheckBox_Event_checkBox_event_onChange.click();
		return CheckBox_Event_checkBox_event_onChange_label.getText();
	}
	
//###############################CheckBox Event#######################################
//###############################CheckBox Condition###################################
	@FindBy(id="CheckBox_Condtion_checkBox_onClick")
	private WebElement CheckBox_Condtion_checkBox_onClick;
	
	@FindBy(xpath=".//*[@id='CheckBox_Condtion_panel']/tbody/tr[1]/td[3]/div")
	private WebElement CheckBox_Condtion_checkBox_isFocusable;
	
	public int CheckBox_Condtion_checkBox_isFocusable(){
		CheckBox_Condtion_checkBox_onClick.click();
		String[] temp = {"dijitCheckBoxFocused", "dijitFocused"};
		System.out.println(CheckBox_Condtion_checkBox_isFocusable.getAttribute("class"));
		return CSS.css_query(CheckBox_Condtion_checkBox_isFocusable.getAttribute("class"), temp);
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onKeyDown")
	private WebElement CheckBox_Condtion_CheckBox_doubleClick;
	
	@FindBy(xpath=".//*[@id='CheckBox_Condtion_panel']/tbody/tr[2]/td[3]/label")
	private WebElement CheckBox_Condtion_CheckBox_isChecked;
	
	public String CheckBox_Condtion_CheckBox_isChecked(){
		Main_Class main_class = new Main_Class();
		main_class.doubleClick("CheckBox_Condtion_CheckBox_onKeyDown");
		return CheckBox_Condtion_CheckBox_isChecked.getText();
	}

	@FindBy(id="CheckBox_Condtion_CheckBox_onKeyPress")
	private WebElement CheckBox_Condtion_CheckBox_onKeyPress;
	
	@FindBy(id="CheckBox_Condtion_CheckBox_visibility ")
	private WebElement CheckBox_Condtion_CheckBox_readonly;
	
	@FindBy(xpath=".//*[@id='CheckBox_Condtion_panel']/tbody/tr[3]/td[3]/label")
	private WebElement CheckBox_Condtion_CheckBox_visibility;
	
	public String CheckBox_Condition_CheckBox_readOnly(){
		return CheckBox_Condtion_CheckBox_readonly.getAttribute("readonly");
	}
	
	public String CheckBox_Condition_CheckBox_visibility(){
		CheckBox_Condtion_CheckBox_onKeyPress.click();
		return CheckBox_Condtion_CheckBox_visibility.getAttribute("style");
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onKeyUp")
	private WebElement CheckBox_Condtion_CheckBox_onKeyUp;
	
	@FindBy(id="CheckBox_Condtion_CheckBox_disabled")
	private WebElement CheckBox_Condtion_CheckBox_disabled;
	
	@FindBy(xpath=".//*[@id='CheckBox_Condtion_panel']/tbody/tr[4]/td[3]/label")
	private WebElement CheckBox_Condtion_CheckBox_hidden;
	
	public String CheckBox_Condtion_CheckBox_disabled(){
		return CheckBox_Condtion_CheckBox_disabled.getAttribute("aria-disabled");
	}
	
	public String CheckBox_Condtion_CheckBox_disable(){
		CheckBox_Condtion_CheckBox_onKeyUp.click();
		return CheckBox_Condtion_CheckBox_hidden.getAttribute("style");
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onMouseDown")
	private WebElement CheckBox_Condtion_CheckBox_onMouseDown;
	
	@FindBy(id="CheckBox_Condtion_CheckBox_readOnly")
	private WebElement CheckBox_Condtion_CheckBox_readOnly;
	
	public String CheckBox_Expression_isFocusable(){
		CheckBox_Condtion_CheckBox_onMouseDown.click();
		return CheckBox_Condtion_CheckBox_readOnly.getAttribute("disabled");
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onMouseUp")
	private WebElement CheckBox_Condtion_CheckBox_onMouseUp;
	
	@FindBy(id="CheckBox_Condtion_CheckBox_isChecked")
	private WebElement CheckBox_Expression_id;
	
	public Boolean CheckBox_Condtion_Expression_id(){
		CheckBox_Condtion_CheckBox_onMouseUp.click();
		return CheckBox_Expression_id.isSelected();
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onMouseEnter")
	private WebElement CheckBox_Condtion_CheckBox_onMouseEnter;
	
	@FindBy(id="CheckBox_Condtion_CheckBox_hint")
	private WebElement CheckBox_Condtion_CheckBox_hint;
	
	public String CheckBox_Condtion_Expression_Text(){
		CheckBox_Condtion_CheckBox_onMouseEnter.click();
		return CheckBox_Condtion_CheckBox_hint.getAttribute("title");
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onMouseLeave")
	private WebElement CheckBox_Condtion_CheckBox_onMouseLeave;
	
	@FindBy(xpath=".//*[@id='CheckBox_Condtion_panel']/tbody/tr[8]/td[3]/label")
	private WebElement CheckBox_Condtion_CheckBox_lanchNewFlow;
	
	public String CheckBox_Condition_Expression_visibility(){
		CheckBox_Condtion_CheckBox_onMouseLeave.click();
		return CheckBox_Condtion_CheckBox_lanchNewFlow.getText();
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onMouseMove")
	private WebElement CheckBox_Condtion_CheckBox_onMouseMove;
	
	@FindBy(xpath=".//*[@id='CheckBox_Condtion_panel']/tbody/tr[9]/td[3]/label")
	private WebElement CheckBox_Condtion_CheckBox_gone;
	
	public String CheckBox_Condition_Expression_disabled(){
		CheckBox_Condtion_CheckBox_onMouseMove.click();
		return CheckBox_Condtion_CheckBox_gone.getAttribute("style");
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onChnge")
	private WebElement CheckBox_Condtion_CheckBox_onChnge;
	
	@FindBy(id="CheckBox_Condtion_CheckBox_InlineScript")
	private WebElement CheckBox_Expression_readOnly;
	
	public Boolean CheckBox_Expression_readOnly(){
		CheckBox_Condtion_CheckBox_onChnge.click();
		return CheckBox_Expression_readOnly.isSelected();
	}
	
	@FindBy(id="CheckBox_Condtion_CheckBox_onChnge_copy")
	private WebElement CheckBox_Condtion_CheckBox_onChnge_copy;
	
	@FindBy(id="CheckBox_Condtion_CheckBox_InlineScript_copy")
	private WebElement CheckBox_Condition_Expression_isChecked;

	public Boolean CheckBox_Condition_Expression_isChecked(){
		CheckBox_Condtion_CheckBox_onChnge_copy.click();
		return CheckBox_Condition_Expression_isChecked.isSelected();
	}

//###############################CheckBox Condition###################################
//###############################CheckBox Action######################################
	@FindBy(id="CheckBox_Action_checkBox_onClick")
	private WebElement CheckBox_Action_checkBox_onClick;
	
	@FindBy(xpath=".//*[@id='CheckBox_Action_panel']/tbody/tr[1]/td[3]/div")
	private WebElement CheckBox_Action_checkBox_focus;
	
	public int CheckBox_Action_checkBox_focus(){
		CheckBox_Action_checkBox_onClick.click();
		String[] temp = {"dijitCheckBoxFocused", "dijitFocused"};
		return CSS.css_query(CheckBox_Action_checkBox_focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="CheckBox_Action_checkBox_Expression")
	private WebElement CheckBox_Action_checkBox_Expression;
	
	@FindBy(xpath=".//*[@id='CheckBox_Action_panel']/tbody/tr[2]/td[3]/label")
	private WebElement CheckBox_Action_CheckBox_styleClass;
	
	public int CheckBox_Action_CheckBox_styleClass(){
		CheckBox_Action_checkBox_Expression.click();
		String[] temp = {"BTN_IMG"};
		int num = CSS.css_query(CheckBox_Action_CheckBox_styleClass.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onKeyDown")
	private WebElement CheckBox_Action_CheckBox_onKeyDown;
	
	@FindBy(xpath=".//*[@id='CheckBox_Action_panel']/tbody/tr[3]/td[3]/label")
	private WebElement CheckBox_Action_CheckBox_Text;
	
	public String CheckBox_Action_CheckBox_Text(){
		CheckBox_Action_CheckBox_onKeyDown.click();
		return CheckBox_Action_CheckBox_Text.getText();
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onKeyPress")
	private WebElement CheckBox_Action_CheckBox_onKeyPress;
	
	@FindBy(xpath=".//*[@id='CheckBox_Action_panel']/tbody/tr[4]/td[3]/div")
	private WebElement CheckBox_Action_CheckBox_visible;
	
	public String CheckBox_Action_CheckBox_visible(){
		CheckBox_Action_CheckBox_onKeyPress.click();
		return CheckBox_Action_CheckBox_visible.getAttribute("style");
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onChnge")
	private WebElement CheckBox_Action_CheckBox_onChnge;
	
	@FindBy(xpath=".//*[@id='CheckBox_Action_panel']/tbody/tr[5]/td[3]/div")
	private WebElement CheckBox_Action_CheckBox_gone;
	
	public String CheckBox_Action_CheckBox_gone(){
		CheckBox_Action_CheckBox_onChnge.click();
		return CheckBox_Action_CheckBox_gone.getAttribute("style");
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onChnge_copy")
	private WebElement CheckBox_Action_CheckBox_onChnge_copy;
	
	@FindBy(xpath=".//*[@id='CheckBox_Action_panel']/tbody/tr[5]/td[3]/div")
	private WebElement CheckBox_Action_CheckBox_visibility;
	
	public String CheckBox_Action_CheckBox_visibility(){
		CheckBox_Action_CheckBox_onChnge_copy.click();
		return CheckBox_Action_CheckBox_visibility.getAttribute("style");
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onKeyUp")
	private WebElement CheckBox_Action_CheckBox_onKeyUp;
	
	@FindBy(id="CheckBox_Action_CheckBox_disabled")
	private WebElement CheckBox_Action_CheckBox_disabled;
	
	public Boolean CheckBox_Action_CheckBox_disabled(){
		CheckBox_Action_CheckBox_onKeyUp.click();
		return CheckBox_Action_CheckBox_disabled.isEnabled();
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onMouseLeave")
	private WebElement CheckBox_Action_CheckBox_onMouseLeave;
	
	@FindBy(id="CheckBox_Action_CheckBox_lanchNewFlow")
	private WebElement CheckBox_Action_CheckBox_disableTrue;
	
	public String CheckBox_Action_CheckBox_disableTrue(){
		CheckBox_Action_CheckBox_onMouseLeave.click();
		return CheckBox_Action_CheckBox_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onMouseDown")
	private WebElement CheckBox_Action_CheckBox_onMouseDown;
	
	@FindBy(id="CheckBox_Action_CheckBox_readOnly")
	private WebElement CheckBox_Action_CheckBox_readOnly;
	
	public String CheckBox_Action_CheckBox_readOnly(){
		CheckBox_Action_CheckBox_onMouseDown.click();
		return CheckBox_Action_CheckBox_readOnly.getAttribute("readonly");
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onMouseMove")
	private WebElement CheckBox_Action_CheckBox_onMouseMove;
	
	@FindBy(id="CheckBox_Action_CheckBox_invokeActionGroup")
	private WebElement CheckBox_Action_CheckBox_invokeActionGroup;
	
	public Boolean CheckBox_Action_CheckBox_radonlyFalse(){
		CheckBox_Action_CheckBox_onMouseMove.click();
		return CheckBox_Action_CheckBox_invokeActionGroup.isEnabled();
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onMouseUp")
	private WebElement CheckBox_Action_CheckBox_onMouseUp;
	
	@FindBy(id="CheckBox_Action_CheckBox_isChecked")
	private WebElement CheckBox_Action_CheckBox_isChecked;
	
	public String CheckBox_Action_CheckBox_isChecked(){
		CheckBox_Action_CheckBox_onMouseUp.click();
		return CheckBox_Action_CheckBox_isChecked.getAttribute("aria-checked");
	}
	
	@FindBy(id="CheckBox_Action_CheckBox_onMouseEnter")
	private WebElement CheckBox_Action_CheckBox_onMouseEnter;
	
	@FindBy(id="CheckBox_Action_CheckBox_hint")
	private WebElement CheckBox_Action_CheckBox_hint;
	
	public String CheckBox_Action_CheckBox_hint(){
		CheckBox_Action_CheckBox_onMouseEnter.click();
		return CheckBox_Action_CheckBox_hint.getAttribute("title");
	}
	
	@FindBy(id="CheckBox_Action_checkBox")
	private WebElement CheckBox_Action_checkBox;
	
	@FindBy(xpath=".//*[@id='CheckBox_Action_panel']/tbody/tr[13]/td[3]/label")
	private WebElement CheckBox_Action_checkBox01;
	
	public String CheckBox_Action_checkBox01(){
		CheckBox_Action_checkBox.click();
		return CheckBox_Action_checkBox01.getAttribute("style");
	}

//###############################CheckBox Action######################################
//###############################CheckBox Submit######################################
	@FindBy(id="CheckBox_submit_checkBox_spanish")
	private WebElement CheckBox_submit_Integer;
	
	@FindBy(id="CheckBox_submit_checkBox02")
	private WebElement CheckBox_submit_Number;
	
	@FindBy(id="CheckBox_submit_checkBox05")
	private WebElement CheckBox_submit_Byte;
	
	@FindBy(id="CheckBox_submit_checkBox08")
	private WebElement CheckBox_submit_Float;
	
	@FindBy(id="CheckBox_submit_checkBox11")
	private WebElement CheckBox_submit_BigDecimal;
	
	@FindBy(id="CheckBox_submit_checkBox_english")
	private WebElement CheckBox_submit_Boolean;
	
	@FindBy(id="CheckBox_submit_checkBox01")
	private WebElement CheckBox_submit_Currency;
	
	@FindBy(id="CheckBox_submit_checkBox04")
	private WebElement CheckBox_submit_XMLGregorianCalendar;
	
	@FindBy(id="CheckBox_submit_checkBox07")
	private WebElement CheckBox_submit_Long;
	
	@FindBy(id="CheckBox_submit_checkBox10")
	private WebElement CheckBox_submit_BigInteger;
	
	@FindBy(id="CheckBox_submit_String_Data")
	private WebElement CheckBox_submit_String;
	
	@FindBy(id="CheckBox_submit_checkBox")
	private WebElement CheckBox_submit_Date;
	
	@FindBy(id="CheckBox_submit_checkBox03")
	private WebElement CheckBox_submit_Duration;
	
	@FindBy(id="CheckBox_submit_checkBox06")
	private WebElement CheckBox_submit_Short;
	
	@FindBy(id="CheckBox_submit_checkBox09")
	private WebElement CheckBox_submit_Double;
	
	@FindBy(id="CheckBox_submit_button")
	private WebElement CheckBox_submit_button;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement CheckBox_submit_Tooltip;
	
	public String CheckBox_submit_getTooltip(){
		CheckBox_submit_Integer.click();
		CheckBox_submit_Number.click();
		CheckBox_submit_Byte.click();
		CheckBox_submit_Float.click();
		CheckBox_submit_BigDecimal.click();
		CheckBox_submit_Boolean.click();
		CheckBox_submit_Currency.click();
		CheckBox_submit_XMLGregorianCalendar.click();
		CheckBox_submit_Long.click();
		CheckBox_submit_BigInteger.click();
		CheckBox_submit_Date.click();
		CheckBox_submit_Duration.click();
		CheckBox_submit_Short.click();
		CheckBox_submit_Double.click();
		return CheckBox_submit_Tooltip.getText();
	}
	
	public Boolean CheckBox_submit_TooltipVerify(){
		CheckBox_submit_String.click();
		return CheckBox_submit_Tooltip.isDisplayed();
	}
	
	public void CheckBox_submit_clickButton(){
		CheckBox_submit_button.click();
	}
	
	@FindBy(id="CheckBox_Result_String_Data")
	private WebElement CheckBox_Result_String;
	
	@FindBy(id="CheckBox_Result_label02")
	private WebElement CheckBox_Result_String_label;
	
	public String CheckBox_Result_String(){
		return CheckBox_Result_String.getAttribute("checked");
	}
	
	public String CheckBox_Result_String_label(){
		return CheckBox_Result_String_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox")
	private WebElement CheckBox_Result_Date;
	
	@FindBy(id="CheckBox_Result_label03")
	private WebElement CheckBox_Result_Date_label;
	
	public String CheckBox_Result_Date(){
		return CheckBox_Result_Date.getAttribute("checked");
	}
	
	public String CheckBox_Result_Date_label(){
		return CheckBox_Result_Date_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox03")
	private WebElement CheckBox_Result_Duration;
	
	@FindBy(id="CheckBox_Result_label04")
	private WebElement CheckBox_Result_Duration_label;
	
	public String CheckBox_Result_Duration(){
		return CheckBox_Result_Duration.getAttribute("checked");
	}
	
	public String CheckBox_Result_Duration_label(){
		return CheckBox_Result_Duration_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox06")
	private WebElement CheckBox_Result_Short;
	
	@FindBy(id="CheckBox_Result_label05")
	private WebElement CheckBox_Result_Short_label;
	
	public String CheckBox_Result_Short(){
		return CheckBox_Result_Short.getAttribute("checked");
	}
	
	public String CheckBox_Result_Short_label(){
		return CheckBox_Result_Short_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox09")
	private WebElement CheckBox_Result_Double;
	
	@FindBy(id="CheckBox_Result_label06")
	private WebElement CheckBox_Result_Double_label;
	
	public String CheckBox_Result_Double(){
		return CheckBox_Result_Double.getAttribute("checked");
	}
	
	public String CheckBox_Result_Double_label(){
		return CheckBox_Result_Double_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox_english")
	private WebElement CheckBox_Result_Boolean;
	
	@FindBy(id="CheckBox_Result_label07")
	private WebElement CheckBox_Result_Boolean_label;
	
	public String CheckBox_Result_Boolean(){
		return CheckBox_Result_Boolean.getAttribute("checked");
	}
	
	public String CheckBox_Result_Boolean_label(){
		return CheckBox_Result_Boolean_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox01")
	private WebElement CheckBox_Result_Currency;
	
	@FindBy(id="CheckBox_Result_label08")
	private WebElement CheckBox_Result_Currency_label;
	
	public String CheckBox_Result_Currency(){
		return CheckBox_Result_Currency.getAttribute("checked");
	}
	
	public String CheckBox_Result_Currency_label(){
		return CheckBox_Result_Currency_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox04")
	private WebElement CheckBox_Result_XMLGregorianCalendar;
	
	@FindBy(id="CheckBox_Result_label09")
	private WebElement CheckBox_Result_XMLGregorianCalendar_label;
	
	public String CheckBox_Result_XMLGregorianCalendar(){
		return CheckBox_Result_XMLGregorianCalendar.getAttribute("checked");
	}
	
	public String CheckBox_Result_XMLGregorianCalendar_label(){
		return CheckBox_Result_XMLGregorianCalendar_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox07")
	private WebElement CheckBox_Result_Long;
	
	@FindBy(id="CheckBox_Result_label10")
	private WebElement CheckBox_Result_Long_label;
	
	public String CheckBox_Result_Long(){
		return CheckBox_Result_Long.getAttribute("checked");
	}
	
	public String CheckBox_Result_Long_label(){
		return CheckBox_Result_Long_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox10")
	private WebElement CheckBox_Result_BigInteger;
	
	@FindBy(id="CheckBox_Result_label11")
	private WebElement CheckBox_Result_BigInteger_label;
	
	public String CheckBox_Result_BigInteger(){
		return CheckBox_Result_BigInteger.getAttribute("checked");
	}
	
	public String CheckBox_Result_BigInteger_label(){
		return CheckBox_Result_BigInteger_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox_spanish")
	private WebElement CheckBox_Result_Integer;
	
	@FindBy(id="CheckBox_Result_label12")
	private WebElement CheckBox_Result_Integer_label;
	
	public String CheckBox_Result_Integer(){
		return CheckBox_Result_Integer.getAttribute("checked");
	}
	
	public String CheckBox_Result_Integer_label(){
		return CheckBox_Result_Integer_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox02")
	private WebElement CheckBox_Result_Number;
	
	@FindBy(id="CheckBox_Result_label13")
	private WebElement CheckBox_Result_Number_label;
	
	public String CheckBox_Result_Number(){
		return CheckBox_Result_Number.getAttribute("checked");
	}
	
	public String CheckBox_Result_Number_label(){
		return CheckBox_Result_Number_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox05")
	private WebElement CheckBox_Result_Byte;
	
	@FindBy(id="CheckBox_Result_label14")
	private WebElement CheckBox_Result_Byte_label;
	
	public String CheckBox_Result_Byte(){
		return CheckBox_Result_Byte.getAttribute("checked");
	}
	
	public String CheckBox_Result_Byte_label(){
		return CheckBox_Result_Byte_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox08")
	private WebElement CheckBox_Result_Float;
	
	@FindBy(id="CheckBox_Result_label15")
	private WebElement CheckBox_Result_Float_label;
	
	public String CheckBox_Result_Float(){
		return CheckBox_Result_Float.getAttribute("checked");
	}
	
	public String CheckBox_Result_Float_label(){
		return CheckBox_Result_Float_label.getText();
	}
	
	@FindBy(id="CheckBox_Result_checkBox11")
	private WebElement CheckBox_Result_BigDecimal;
	
	@FindBy(id="CheckBox_Result_label16")
	private WebElement CheckBox_Result_BigDecimal_label;
	
	public String CheckBox_Result_BigDecimal(){
		return CheckBox_Result_BigDecimal.getAttribute("checked");
	}
	
	public String CheckBox_Result_BigDecimal_label(){
		return CheckBox_Result_BigDecimal_label.getText();
	}
	
//###############################CheckBox Submit######################################

}
