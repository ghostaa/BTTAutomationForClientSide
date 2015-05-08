package com.ibm.btt.allwidgets.CheckedMultiSelect;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.allwidgets.*;

public class CheckedMultiSelect_PageObject extends Main_Page{
	
//###############################CheckedMultiSelect Properties##################################
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_properties_form']/table/tbody/tr[2]/td[2]/div")
	private WebElement properties_id;
	
	public String proId(){//1. SelectList's Id
		return properties_id.getAttribute("id");
	}
	
	public int proTabIndex1(){//tabIndex = 1
		String[] temp = {"dojoxCheckedMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_id.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy09")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility:visible
		return properties_visible.isDisplayed();
	}
	
	public int proTabIndex2(){//tabIndex = 2
		String[] temp = {"dojoxCheckedMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_visible.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy")
	private WebElement properties_hidden;
	
	public int proHidden(){// 3. visibility:hidden
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy")
	private WebElement properties_gone;
	
	public int proGone(){//4. visibility:gone
		String[] temp={"display: none"};
		return Appearance.appearance_query(properties_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy01")
	private WebElement properties_disableTrue;
	
	public String proDisableTrue(){//5. disabled:true
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy02")
	private WebElement properties_disableFalse;
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy02")
	private WebElement properties_tabIndex3;
	
	public Boolean proDisableFlase(){//6. disable:false
		return properties_disableFalse.isEnabled();
	}
	
	public int proTabIndex3(){//tabIndex = 3
		String[] temp = {"dojoxCheckedMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex3.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy03")
	private WebElement properties_readonlyTrue;

	public int proReadonlyTrue(){//7. readonly:true
		String[] temp = {"dojoxCheckedMultiSelectReadOnly", "dijitReadOnly"};
		return CSS.css_query(properties_readonlyTrue.getAttribute("class"), temp);
	}
	
	@FindBy(id="CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy04")
	private WebElement properties_readonlyFalse;

	public Boolean proReadonlyFlase(){//8. readonly:false
		return properties_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy05")
	private WebElement properties_shortcut;
	
	public int proShortcut(){//9. shortcut is 'c'(shift+alt+c)
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_C);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_C);
		String[] temp = {"dojoxCheckedMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy06")
	private WebElement properties_hintNLS;
	
	public String proHintNLS(){//10. hint(NLS) is "%nls.bttsample/hint_test"
		return properties_hintNLS.getAttribute("title");
	}
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy06_copy")
	private WebElement properties_hint;
	
	public String proHint(){//11. hint is "checkedmultiselectlist hint"
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy07")
	private WebElement properties_tabIndex4;
	
	@FindBy(id="widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy07")
	private WebElement properties_tabIndex4focus;
	
	public String proTabIndex4(){//12. tabIndex = 4
		return properties_tabIndex4.getAttribute("tabindex");
	}
	
	public int proTabIndex4Focus(){//tabIndex = 4
		String[] temp = {"dojoxCheckedMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex4focus.getAttribute("class"), temp);
	}
//###############################CheckedMultiSelect Properties##################################
//###############################CheckedMultiSelect CSS#########################################
	@FindBy(id="widget_CheckedMultiSelect_css_checkedMultiSelect_copy_copy")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setFontStyle"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_css_checkedMultiSelect_copy")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setFontStyle", "setFontSize"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_css_checkedMultiSelect_copy01")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setFontSize", "setFontStyle", "setFontWeight"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_css_checkedMultiSelect_copy01_copy")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"claro"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################CheckedMultiSelect CSS#########################################
//###############################CheckedMultiSelect Event#######################################
	@FindBy(id="dijit_form_CheckBox_1")
	private WebElement event_onClick;
	
	@FindBy(id="CheckedMultiSelect_event_label02")
	private WebElement event_label1; 
	
	public String evtOnClick(){ //onClick
		event_onClick.click();
		return event_label1.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_11")
	private WebElement event_onFocus; 
	
	@FindBy(id="CheckedMultiSelect_event_label04")
	private WebElement event_label2; 
	
	public String evtOnFocus(){ //onFocus
		event_onFocus.click();
		return event_label2.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_21")
	private WebElement event_onBlur;
	
	@FindBy(id="CheckedMultiSelect_event_label11")
	private WebElement event_label3;
	
	public String evtOnBlur(){ //onBlur
		event_onBlur.click();
		event_label3.click();
		return event_label3.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_31")
	private WebElement event_onKeyDown; 
	
	@FindBy(id="CheckedMultiSelect_event_label12")
	private WebElement event_label4;
	
	public String evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label4.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_41")
	private WebElement event_onKeyPress; 
	
	@FindBy(id="CheckedMultiSelect_event_label13")
	private WebElement event_label5;
	
	public String evtOnKeyPress(){ //onKeyPress
		event_onKeyPress.click();
		Main_Class main_class = new Main_Class();
		main_class.keyPress(KeyEvent.VK_0);
		main_class.keyRelease(KeyEvent.VK_0);
		return event_label5.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_51")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="CheckedMultiSelect_event_label14")
	private WebElement event_label6;
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label6.getText();
	}

	@FindBy(id="dijit_form_CheckBox_61")
	private WebElement event_onMouseDown;
	
	@FindBy(id="CheckedMultiSelect_event_label15")
	private WebElement event_label7;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();;
		return event_label7.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_71")
	private WebElement event_onMouseUp;
	
	@FindBy(id="CheckedMultiSelect_event_label16")
	private WebElement event_label8;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_label8.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_81")
	private WebElement event_onMouseEnter; 
	
	@FindBy(id="CheckedMultiSelect_event_label17")
	private WebElement event_label9;

	public String evtOnMouseEnter(){ //onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("dijit_form_CheckBox_81");
		return event_label9.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_91")
	private WebElement event_onMouseLeave;
	
	@FindBy(id="CheckedMultiSelect_event_label18")
	private WebElement event_label10;

	public String evtOnMouseLeave(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("dijit_form_CheckBox_91");
		main_class.widget_moveToElement("CheckedMultiSelect_event_label18");
		return event_label10.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_101")
	private WebElement event_onMouseMove;
	
	@FindBy(id="CheckedMultiSelect_event_label20")
	private WebElement event_label11;
	
	public String evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("dijit_form_CheckBox_101");
		return event_label11.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_111")
	private WebElement event_onChange; 
	
	@FindBy(id="CheckedMultiSelect_event_label21")
	private WebElement event_label12; 
	
	public String evtOnChange(){ //onChange
		event_onChange.click();
		return event_label12.getText();
	}

//###############################CheckedMultiSelect Event######################################
//###############################CheckedMultiSelect Condition##################################
	@FindBy(id="dijit_form_CheckBox_1")
	private WebElement condition_isFocusable;
	
	@FindBy(id="CheckedMultiSelect_condition_label01")
	private WebElement condition_label1;
	
	public String conIsFocusable(){//Widget Function-isFocusable
		condition_isFocusable.click();
		return condition_label1.getText();
	}
	
	@FindBy(id="CheckedMultiSelect_condition_checkedMultiSelect01")
	private WebElement condition_disabled;
	
	@FindBy(id="CheckedMultiSelect_condition_label02")
	private WebElement condition_label2;
	
	public String conDisabled(){//Widget Property-disabled
		(new Main_Class()).widget_moveToElementByXpath(".//*[@id='widget_CheckedMultiSelect_condition_checkedMultiSelect01']/div[2]");
		return condition_label2.getText();
	}
	
	@FindBy(id="CheckedMultiSelect_condition_checkedMultiSelect01_copy")
	private WebElement condition_readonly;
	
	@FindBy(id="CheckedMultiSelect_condition_label03")
	private WebElement condition_label3;
	
	public String conReadonly(){//Widget Property-readOnly
		(new Main_Class()).widget_moveToElementByXpath(".//*[@id='widget_CheckedMultiSelect_condition_checkedMultiSelect01_copy']/div[2]");
		return condition_label3.getText();
	}

	@FindBy(id="dijit_form_CheckBox_31")
	private WebElement condition_ExpisFocusable;
	
	@FindBy(id="CheckedMultiSelect_condition_label04")
	private WebElement condition_label4;
	
	public String conExpisFocusable(){// Expression-Widget Function : isFocusable
		condition_ExpisFocusable.click();
		return condition_label4.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_41")
	private WebElement condition_ExpId;
	
	@FindBy(id="CheckedMultiSelect_condition_label05")
	private WebElement condition_label5;
	
	public String conExpId(){//Expression-Widget Property : id 
		condition_ExpId.click();
		return condition_label5.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_51")
	private WebElement condition_ExpValue;
	
	@FindBy(id="CheckedMultiSelect_condition_label06")
	private WebElement condition_label6;
	
	public String conExpValue(){// 	Expression-Widget Property : value
		condition_ExpValue.click();
		return condition_label6.getText();
	}
	
	@FindBy(id="CheckedMultiSelect_condition_label07")
	private WebElement condition_label7;
	
	public String conVisible(){//Widget Expression Condition: visibility=visible
		(new Main_Class()).widget_moveToElementByXpath(".//*[@id='widget_CheckedMultiSelect_condition_checkedMultiSelect04']/div[2]");
		return condition_label7.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_71")
	private WebElement condition_ExpDisabled;
	
	@FindBy(id="CheckedMultiSelect_condition_label09")
	private WebElement condition_label8;
	
	public String conExpDisabled(){// 	Expression-Widget Property : disabled
		condition_ExpDisabled.click();
		return condition_label8.getText();
	}
	
	@FindBy(id="dijit_form_CheckBox_81")
	private WebElement condition_ExpReadonly;
	
	@FindBy(id="CheckedMultiSelect_condition_label10")
	private WebElement condition_label9;
	
	public String conExpReadonly(){// 	Expression-Widget Property : readonly
		condition_ExpReadonly.click();
		return condition_label9.getText();
	}
	
	@FindBy(id="CheckedMultiSelect_condition_checkedMultiSelect07")
	private WebElement condition_asyncStatus;
	
	@FindBy(id="CheckedMultiSelect_condition_label12")
	private WebElement condition_label10;
	
	public String conAsyncStatus(){//Expression-Widget Property : asyncStatus
		condition_asyncStatus.click();
		return condition_label10.getText();
	}
	
	@FindBy(id="CheckedMultiSelect_condition_checkedMultiSelect07")
	private WebElement condition_asyncErrorMessage;
	
	@FindBy(id="CheckedMultiSelect_condition_label13")
	private WebElement condition_label11;
	
	public String conAsyncErrorMessage(){//Expression-Widget Property : asyncErrorMessage
		condition_asyncErrorMessage.click();
		return condition_label11.getText();
	}
//###############################CheckedMultiSelect Condition##################################
//###############################CheckedMultiSelect Action#####################################
	@FindBy(id="CheckedMultiSelect_action_checkedMultiSelect")
	private WebElement action_focus;
	
	@FindBy(id="CheckedMultiSelect_action_label03")
	private WebElement action_clickMe1;
	
	public int actFocus(){//Invoke Widget Function-focus()
		action_clickMe1.click();
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(action_focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="CheckedMultiSelect_action_label05")
	private WebElement action_clickMe2;
	
	@FindBy(id="widget_CheckedMultiSelect_action_checkedMultiSelect01")
	private WebElement action_styleClass;
	
	public int actStyleClass(){//Set Widget Property-styleClass
		action_clickMe2.click();
		String[] temp = {"setBorder"};
		return CSS.css_query(action_styleClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_CheckedMultiSelect_action_checkedMultiSelect03")
	private WebElement action_visibility;
	
	@FindBy(id="CheckedMultiSelect_action_label07")
	private WebElement action_clickMe3;
	
	public Boolean actVisible(){//visible
		action_clickMe3.click();
		return action_visibility.isDisplayed();
	}
	
	@FindBy(id="CheckedMultiSelect_action_label10")
	private WebElement action_clickMe4;
	
	public int actHidden(){//hidden
		action_clickMe4.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(action_visibility.getAttribute("style"), temp);
	}
	
	@FindBy(id="CheckedMultiSelect_action_label13")
	private WebElement action_clickMe5;
	
	public int actGone(){//gone
		action_clickMe5.click();
		String[] temp={"display: none"};
		return Appearance.appearance_query(action_visibility.getAttribute("style"), temp);
	}
	
	@FindBy(id="CheckedMultiSelect_action_label08")
	private WebElement action_clickMe6;
	
	@FindBy(id="CheckedMultiSelect_action_checkedMultiSelect04")
	private WebElement action_disableTrue;
	
	public String actDisableTrue(){//Set Widget Property : disable=true
		action_clickMe6.click();
		return action_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="CheckedMultiSelect_action_label16")
	private WebElement action_clickMe7;
	
	@FindBy(id="widget_CheckedMultiSelect_action_checkedMultiSelect05")
	private WebElement action_readonlyTrue;
	
	public int actReadonlyTrue(){//Set Widget Property : ReadOnly=true
		action_clickMe7.click();
		String[] temp = {"dojoxCheckedMultiSelectReadOnly", "dijitReadOnly"};
		return CSS.css_query(action_readonlyTrue.getAttribute("class"), temp);
	}
	
	@FindBy(id="CheckedMultiSelect_action_label18")
	private WebElement action_clickMe8;
	
	@FindBy(id="widget_CheckedMultiSelect_action_checkedMultiSelect06")
	private WebElement action_hint;
	
	public String actHint(){//Set Widget Property : Hint="test string"
		action_clickMe8.click();
		return action_hint.getAttribute("title");
	}
	
	
	@FindBy(id="CheckedMultiSelect_action_label20")
	private WebElement action_clickMe9;
	
	@FindBy(id="CheckedMultiSelect_action_checkedMultiSelect07")
	private WebElement action_disable;
	
	@FindBy(id="widget_CheckedMultiSelect_action_checkedMultiSelect07")
	private WebElement action_hint1;
	
	public String actDisable(){//disable=true and hint is "test string"
		action_clickMe9.click();
		return action_disable.getAttribute("disabled");
	}
	
	public String actHint1(){
		action_clickMe9.click();
		return action_hint1.getAttribute("title");
	}

//###############################CheckedMultiSelect Action#####################################
//###############################CheckedMultiSelect Appearance1################################
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance1_checkedMultiSelect_copy_copy']/div[2]")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance1_checkedMultiSelect_copy_copy_copy']/div[2]")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is Fixed 200px,Height is AutoSize
		String[] temp={"width: 200px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance1_checkedMultiSelect_copy_copy_copy01']/div[2]")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is Relative 30%,Height is AutoSize
		String[] temp={"width: 30%"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance1_checkedMultiSelect_copy_copy_copy02']/div[2]")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is Fill,Height is AutoSize
		String[] temp={"width: 100%"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
//###############################MultiSelect Appearance1###############################
//###############################MultiSelect Appearance2###############################
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='CheckedMultiSelect_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################CheckedMultiSelect Appearance2###############################
//###############################CheckedMultiSelect Appearance3###############################
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance3_checkedMultiSelect_copy_copy']/div[2]")
	private WebElement Appearance3_1;
	
	public int Appearance3_1(){//a. Height,Width are autosize
		String[] temp={""};
		return Appearance.appearance_query(Appearance3_1.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance3_checkedMultiSelect_copy_copy_copy']/div[2]")
	private WebElement Appearance3_2;
	
	public int Appearance3_2(){//b. Height is autosize, Width is fixed 50px
		String[] temp={"width: 50px"};
		return Appearance.appearance_query(Appearance3_2.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance3_checkedMultiSelect_copy_copy_copy03']/div[2]")
	private WebElement Appearance3_3;
	
	public int Appearance3_3(){//c. Height is 50px, Width is fixed autosize
		String[] temp={"height: 50px"};
		return Appearance.appearance_query(Appearance3_3.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance3_checkedMultiSelect_copy_copy_copy02_copy01_copy']/div[2]")
	private WebElement Appearance3_4;
	
	public int Appearance3_4(){//d. Fixed size:Height is 50px,Width is 300px
		String[] temp={"width: 300px", "height: 50px"};
		return Appearance.appearance_query(Appearance3_4.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance3_checkedMultiSelect_copy_copy_copy01']/div[2]")
	private WebElement Appearance3_5;
	
	public int Appearance3_5(){//a. Height=300px > elements length
		String[] temp={"height: 300px"};
		return Appearance.appearance_query(Appearance3_5.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_CheckedMultiSelect_appearance3_checkedMultiSelect_copy_copy_copy02']/div[2]")
	private WebElement Appearance3_6;
	
	public int Appearance3_6(){//b. Height < elements length
		String[] temp={"width: 100%", "height: 50px"};
		return Appearance.appearance_query(Appearance3_6.getAttribute("style"), temp);
	}
//###############################CheckedMultiSelect Appearance3###############################
//###############################CheckedMultiSelect Submit####################################
	
//###############################CheckedMultiSelect Submit####################################



}
