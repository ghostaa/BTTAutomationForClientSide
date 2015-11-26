package com.ibm.btt.allwidgets.SelectList;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.touch.MoveAction;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.allwidgets.*;

public class SelectList_PageObject extends Main_Page{
	
//###############################SelectList Properties##################################
//SelectList properties	
	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_03']")
	private WebElement properties_id;
	
	public String proId(){//1. SelectList's Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_04']/div[3]/input[2]")
	private WebElement properties_dataname;
	
	public String proDataname(){//2. SelectList's dataName
		return properties_dataname.getAttribute("name");
	}
	
	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_05']/div[3]/input[2]")
	private WebElement properties_urlForList;
	
	public String proUrlForList(){// 3. SelectList's urlForList
		return properties_urlForList.getAttribute("name");
	}
	
	@FindBy(id="SelectList_properties_selectList_06_popup")
	private WebElement properties_dataNameForList;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_06']/div[1]/input")
	private WebElement properties_clickTrangle;
	
	public String[] proDataNameForL(){// 4. SelectList's dataNameForList
		properties_clickTrangle.click();
		String[] strings = properties_dataNameForList.getText().split("\n");
		return strings;
	}
	
	@FindBy(id="SelectList_properties_selectList_07")
	private WebElement properties_labelField;
	
	public String proLabelField(){//5. SelectList's labelField
		return properties_labelField.getAttribute("value");
	}
	
	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_08']/div[3]/input[2]")
	private WebElement properties_valueField;
	
	public String proValueField(){//6. SelectList's valueField
		return properties_valueField.getAttribute("value");
	}
	
	@FindBy(id="widget_SelectList_properties_selectList_09")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//7. SelectList's visibility = visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="widget_SelectList_properties_selectList")
	private WebElement properties_hidden;

	public String proHidden(){//8. SelectList's visibility = hidden
		return properties_hidden.getAttribute("style");
	}
	
	@FindBy(id="widget_SelectList_properties_selectList01")
	private WebElement properties_gone;

	public String proGone(){//9. SelectList's visibility = gone
		return properties_gone.getAttribute("style");
	}
	
	@FindBy(id="SelectList_properties_selectList_10")
	private WebElement properties_disableFalse;
	
	public Boolean proDisableFalse(){//10. SelectList's disabled = false
		return properties_disableFalse.isEnabled();
	}
	
	@FindBy(id="SelectList_properties_selectList02")
	private WebElement properties_disableTrue;
	
	public String proDisableTrue(){//11. SelectList's disabled = true
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="SelectList_properties_selectList03")
	private WebElement properties_readonlyFalse;
	
	public Boolean proReadonlyFalse(){//12. SelectList's readOnly = false 
		return properties_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="SelectList_properties_selectList_13")
	private WebElement properties_readonlyTrue;
	
	public String proReadonlyTrue(){//13. SelectList's readOnly = true
		return properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="widget_SelectList_properties_selectList_14")
	private WebElement properties_shortcut;
	
	public int proShortcut(){//14. SelectList's shortcut is 'v'
		Main_Class.executeCombinationKey(Keys.SHIFT,Keys.ALT,"v");
		String[] temp={"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	@FindBy(id="SelectList_properties_selectList_15")
	private WebElement properties_NLShint;
	
	public String proNLSHint(){//15. SelectList's hint(NLS) is 'TradingVolume' 
		return properties_NLShint.getAttribute("title");
	}
	
	@FindBy(id="SelectList_properties_selectList04")
	private WebElement properties_hint;
	
	public String proHint(){//16. SelectList's hint is 'Test hint' 
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="widget_SelectList_properties_selectList_15_copy")
	private WebElement properties_tab;
	
	@FindBy(id="SelectList_properties_selectList_15_copy")
	private WebElement properties_tabIndex;
	
	public int proTab(){
		String[] temp = {"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_tab.getAttribute("class"), temp);
	}
	public String proTabIndex(){//17. SelectList's tabInex is '12' 
		return properties_tabIndex.getAttribute("tabindex");
	}
	
	@FindBy(id="SelectList_properties_selectList_15_copy_copy")
	private WebElement properties_typeAHeadFalse;
	
	public String proTypeAHeadFalse(){//18. SelectList's typeAHead = false(only select)
		properties_typeAHeadFalse.sendKeys("asd");
		return properties_typeAHeadFalse.getText();
	}
	
	@FindBy(id="SelectList_properties_selectList_15_copy_copy")
	private WebElement properties_typeAHeadTrue;
	
	public Boolean proTypeAHeadTrue(){//19. SelectList's typeAHead = true(input or select)
		return properties_typeAHeadTrue.isEnabled();
	}
	
	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_15_copy_copy01']/div[3]/span")
	private WebElement properties_placeHolder;
	
	public String proPlaceHolder(){//20. SelectList's placeHolder is 'Transfer'
		return properties_placeHolder.getText();
	}
	
//###############################SelectList Properties##################################
//###############################SelectList CSS#########################################
	@FindBy(id="widget_selectlist_css_selectList")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setFontSize"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_selectlist_css_selectList01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setFontStyle", "setFontWeight"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_selectlist_css_selectList02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setBorder", "setFontStyle", "setFontSize"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_selectlist_css_selectList03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitBorderContainer-dijitTabContainerLeft"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################SelectList CSS#########################################
//###############################SelectList Event#######################################
	@FindBy(xpath=".//*[@id='SelectList_event_message']/div[1]/span[1]")
	private WebElement event_message;
	
	@FindBy(id="SelectList_event_selectList_onClick")
	private WebElement event_onClick; 
	
	public String evtOnClick(){ //onClick
		event_onClick.click();
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onKeyDown")
	private WebElement event_onKeyDown; 
	
	public String evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		event_onKeyDown.click();
		Main_Class.pressAnyKey(Keys.SHIFT);
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onKeypress")
	private WebElement event_onKeypress;
	
	public String evtOnKeypress(){ //onKeypress
		event_onKeypress.click();
		event_onKeypress.click();
		Main_Class.pressAnyKey("1");
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onKeyUp")
	private WebElement event_onKeyUp; 
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class.pressAnyKey(Keys.SHIFT);
		return event_message.getText();
	}

	@FindBy(id="SelectList_event_selectList_onMouseDown")
	private WebElement event_onMouseDown;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();
		Main_Class.mouseHold(event_onMouseDown);
		Main_Class.mouseRelease(event_onMouseDown);
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onMouseUp")
	private WebElement event_onMouseUp;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		Main_Class.mouseHold(event_onMouseUp);
		Main_Class.mouseRelease(event_onMouseUp);
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onMouseEnter")
	private WebElement event_onMouseEnter; 

	public String evtOnMouseEnter(){ //onMouseEnter
		event_message.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("SelectList_event_selectList_onMouseEnter");
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onMouseLeave")
	private WebElement event_onMouseLeave; 

	public String evtOnMouseLeave(){ //onMouseLeave
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("widget_SelectList_event_selectList_onMouseLeave");
		main_class.widget_moveToElement("SelectList_event_label18");
		return event_message.getText();
	}
	
	@FindBy(id="widget_SelectList_event_selectList_onMouseMove")
	private WebElement event_onMouseMove; 
	
	public String evtOnMouseMove(){ //onMouseMove
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("widget_SelectList_event_selectList_onMouseMove");
		return event_message.getText();
	}
	
	@FindBy(xpath=".//*[@id='widget_SelectList_event_selectList_onChnge']/div[1]/input")
	private WebElement event_onChange; 
	
	@FindBy(id="SelectList_event_selectList_onChnge_popup1")
	private WebElement event_Account1; 
	
	public String evtOnChange(){ //onChange
		event_onChange.click();
		event_Account1.click();
		return event_message.getText();
	}

	@FindBy(id="SelectList_event_selectList_onFocus")
	private WebElement event_onFocus; 
	
	public String evtOnFocus(){ //onFocus
		event_onFocus.click();
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onBlur")
	private WebElement event_onBlur;
	
	@FindBy(id="SelectList_event_label15_copy_copy")
	private WebElement onBlur_label;
	
	
	public String evtOnBlur(){//onBlur
		event_onBlur.click();
		event_onBlur.click();
		onBlur_label.click();
		return event_message.getText();
	}
	
//###############################SelectList Event#######################################
//###############################SelectList Condition###################################
	@FindBy(id="SelectList_condition_button")
	private WebElement condition_button1; //click 1
	
	@FindBy(xpath=".//*[@id='widget_SelectList_condition_selectList_onClick']/div[3]/input[2]")
	private WebElement condition_isFocusable;
	
	public String conisFocusable(){//Widget Function : isFocusable
		condition_button1.click();
		return condition_isFocusable.getAttribute("value");
	}
	
	@FindBy(id="SelectList_condition_button_copy")
	private WebElement condition_button2; //click 2
	
	@FindBy(id="SelectList_condition_selectListBox_Expression")
	private WebElement condition_disabled;
	
	public Boolean conDisable(){//Widget Property : disabled
		condition_button2.click();
		return condition_disabled.isEnabled();
	}
	
	@FindBy(id="SelectList_condition_button_copy01")
	private WebElement condition_button3; //click 3
	
	@FindBy(id="SelectList_condition_selectList_onKeyDown")
	private WebElement condition_readonly;
	
	public Boolean conReadonly(){//Widget Property : readOnly
		condition_button3.click();
		return condition_readonly.isDisplayed();
	}
	
	@FindBy(id="SelectList_condition_button_copy02")
	private WebElement condition_button4; //click 4
	
	@FindBy(id="widget_SelectList_condition_selectList_onKeypress")
	private WebElement condition_expisFocusable;
	
	public int conExpisFocusable(){//Expression-Widget Function : isFocusable
		condition_button4.click();
		String[] temp = {"channelSummaryListDate"};
		return CSS.css_query(condition_expisFocusable.getAttribute("class"), temp);
	}
	
	@FindBy(id="SelectList_condition_button_copy03")
	private WebElement condition_button5; //click 5
	
	@FindBy(xpath=".//*[@id='widget_SelectList_condition_selectList_onKeyUp']/div[3]/input[2]")
	private WebElement condition_expid;
	
	public String conExpid(){//Expression-Widget Property : id
		condition_button5.click();
		return condition_expid.getAttribute("value");
	}
	
	@FindBy(id="SelectList_condition_button_copy04")
	private WebElement condition_button6; //click 6
	
	@FindBy(xpath=".//*[@id='widget_SelectList_condition_selectList_onMouseDown']/div[1]/input")
	private WebElement condition_expTrangle;
	
	@FindBy(id="SelectList_condition_selectList_onMouseDown_popup5")
	private WebElement condition_Account5;
	
	@FindBy(id="SelectList_condition_selectList_onKeyUp")
	private WebElement condition_expValue;
	
	public Boolean conExpValue(){//Expression-Widget Property : value
		condition_expTrangle.click();
		condition_Account5.click();
		condition_button6.click();
		return condition_expValue.isDisplayed();
	}
	
	@FindBy(id="SelectList_condition_button_copy05")
	private WebElement condition_button7; //click 7
	
	@FindBy(id="widget_SelectList_condition_selectList_onMouseUp")
	private WebElement condition_visibility;
	
	public Boolean conExpVisibility(){//Expression-Widget Property : visibility 
		condition_button7.click();
		return condition_visibility.isDisplayed();
	}
	
	@FindBy(id="SelectList_condition_button_copy06")
	private WebElement condition_button8; //click 8
	
	@FindBy(id="SelectList_condition_selectList_onMouseEnter")
	private WebElement condition_expdisable;
	
	public Boolean conExpDisable(){//Expression-Widget Property : disabled
		condition_button8.click();
		return condition_expdisable.isEnabled();
	}
	
	@FindBy(id="SelectList_condition_button_copy08")
	private WebElement condition_button9; //click 9
	
	@FindBy(id="SelectList_condition_selectList_onMouseMove")
	private WebElement condition_expdisreadonly;
	
	public String conExpReadonly(){//SelectList with condition--expression--widget property(disabled) 
		condition_button9.click();
		return condition_expdisreadonly.getAttribute("readonly");
	}

//###############################SelectList Condition###################################
//###############################SelectList Action######################################
//SelectList action	
	@FindBy(id="SelectList_action_button")
	private WebElement actionClick1; //action Click here 1
	
	@FindBy(id="widget_SelectList_action_selectList_onClick")
	private WebElement actionFocus; 
	
	public int actFocus(){// 	Invoke Widget Function : focus()
		actionClick1.click();
		String[] temp = {"dijitTextBoxFocused", "dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(actionFocus.getAttribute("class"), temp);
	}
	
	@FindBy(id="SelectList_action_button_copy01")
	private WebElement actionClick2;//action Click here 2
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement action_showErrorMessage;
	
	public String actShowErrorMessage(){//Invoke Widget Function : showErrorMessage
		actionClick2.click();
		return action_showErrorMessage.getText();
	}
	
	@FindBy(id="SelectList_action_button_copy02")
	private WebElement actionClick3; //action Click here 3
	
	@FindBy(id="widget_SelectList_action_selectList_onKeypress")
	private WebElement action_styleClass;
	
	public int actStyleClass(){//Set Widget Property : styleClass
		actionClick3.click();
		String[] temp = {"channelSummaryListDate"};
		return CSS.css_query(action_styleClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="SelectList_action_button_copy03")
	private WebElement actionClick4;//action Click here 4
	
	@FindBy(xpath=".//*[@id='widget_SelectList_action_selectList_onKeyUp']/div[3]/input[2]")
	private WebElement action_value;
	
	public String actValue(){//Set Widget Property : value
		actionClick4.click();
		return action_value.getAttribute("value");
	}
	
	@FindBy(id="SelectList_action_button_copy04")
	private WebElement actionClick5;//action Click here 5
	
	@FindBy(id="widget_SelectList_action_selectList_onMouseDown")
	private WebElement action_visible;
	
	public Boolean actVisible(){// Set Widget Property : visibility = visible
		actionClick5.click();	
		return action_visible.isDisplayed();
	}
	
	@FindBy(id="SelectList_action_button_copy08")
	private WebElement actionClick6;//action Click here 6
	
	@FindBy(id="widget_SelectList_action_selectList_onMouseMove")
	private WebElement action_hidden;
	
	public int actHidden(){//Set Widget Property : visibility = hidden
		actionClick6.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(action_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="SelectList_action_button_copy09")
	private WebElement actionClick7;//action Click here 7
	
	@FindBy(id="widget_SelectList_action_selectList_onChnge")
	private WebElement action_gone;
	
	public int actGone(){//Set Widget Property : visibility = gone
		actionClick7.click();
		String[] temp={"display: none"};
		return Appearance.appearance_query(action_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="SelectList_action_button_copy05")
	private WebElement actionClick8; //action Click here 8
	
	@FindBy(id="widget_SelectList_action_selectList_onMouseUp")
	private WebElement action_disableFalse;
	
	public Boolean actDisableFalse(){//Set Widget Property : disabled = false
		actionClick8.click();
		return action_disableFalse.isEnabled();
	}
	
	@FindBy(id="SelectList_action_button_copy11")
	private WebElement actionClick9;//action Click here 9
	
	@FindBy(id="SelectList_action_selectList_onFocus")
	private WebElement action_disableTrue;
	
	public String actdisableTrue(){//Set Widget Property : disabled = true
		actionClick9.click();
		return action_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="SelectList_action_button_copy06")
	private WebElement actionClick10;
	
	@FindBy(id="widget_SelectList_action_selectList_onMouseEnter")
	private WebElement action_readonlyFalse;
	
	public Boolean actreadonlyFalse(){//Set Widget Property : readOnly = false
		actionClick10.click();
		return action_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="SelectList_action_button_copy10")
	private WebElement actionClick11;
	
	@FindBy(id="SelectList_action_selectList_onBlur")
	private WebElement action_readonlyTrue;
	
	public String actreadonlyTrue(){//Set Widget Property : readOnly = true
		actionClick11.click();
		return action_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="SelectList_action_button_copy07")
	private WebElement actionClick12;
	
	@FindBy(id="SelectList_action_selectList_onMouseLeave")
	private WebElement action_hint;
	
	public String actHint(){//Set Widget Property : hint
		actionClick12.click();
		return action_hint.getAttribute("title");
	}
	
	@FindBy(id="SelectList_action_button_copy07_copy")
	private WebElement actionClick13;
	
	@FindBy(id="SelectList_action_selectList_onMouseLeave_copy")
	private WebElement action_group;
	
	public String actGroup(){//Action Group
		actionClick13.click();
		return action_group.getAttribute("aria-disabled");
	}
	
//###############################SelectList Action######################################
//###############################SelectList Appearance##################################
	@FindBy(xpath=".//*[@id='selectlist_appearance_group']/div/div/div/div")
	private WebElement Appearance_1;
	
	public String Appearance_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance_1.getAttribute("style"), "top");
		String h = Appearance_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group01']/div/div/div/div")
	private WebElement Appearance_2;
	
	public String Appearance_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance_2.getAttribute("style"), "middle");
		String h = Appearance_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group02']/div/div/div/div")
	private WebElement Appearance_3;
	
	public String Appearance_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance_3.getAttribute("style"), "bottom");
		String h = Appearance_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group03']/div/div/div/div")
	private WebElement Appearance_4;
	
	public String Appearance_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance_4.getAttribute("style"), "top");
		String h = Appearance_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group04']/div/div/div/div")
	private WebElement Appearance_5;
	
	public String Appearance_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance_5.getAttribute("style"), "middle");
		String h = Appearance_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group05']/div/div/div/div")
	private WebElement Appearance_6;
	
	public String Appearance_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance_6.getAttribute("style"), "bottom");
		String h = Appearance_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group06']/div/div/div/div")
	private WebElement Appearance_7;
	
	public String Appearance_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance_7.getAttribute("style"), "top");
		String h = Appearance_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group07']/div/div/div[1]/div")
	private WebElement Appearance_8;
	
	public String Appearance_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance_8.getAttribute("style"), "middle");
		String h = Appearance_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group08']/div/div/div/div")
	private WebElement Appearance_9;
	
	public String Appearance_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance_9.getAttribute("style"), "bottom");
		String h = Appearance_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group09']/div/div/div/div")
	private WebElement Appearance_10;
	
	public int Appearance_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='selectlist_appearance_group10']/div/div/div/div")
	private WebElement Appearance_11;
	
	public int Appearance_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance_11.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_selectlist_appearance_selectList11")
	private WebElement Appearance_12;
	
	public int Appearance_12(){//12.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance_12.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_selectlist_appearance_selectList12")
	private WebElement Appearance_13;
	
	public int Appearance_13(){//13.Width is fixed100,Height is AutoSize
		String[] temp={"width: 100px"};
		return Appearance.appearance_query(Appearance_13.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_selectlist_appearance_selectList13")
	private WebElement Appearance_14;
	
	public int Appearance_14(){//14.Width is Relative50%,Height is AutoSize
		String[] temp={"width: 50%"};
		return Appearance.appearance_query(Appearance_14.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_selectlist_appearance_selectList14")
	private WebElement Appearance_15;
	
	public int Appearance_15(){//15.Width is Fill,Height is AutoSize
		String[] temp={"width: 100%"};
		return Appearance.appearance_query(Appearance_15.getAttribute("style"), temp);
	}
//###############################SelectList Appearance##################################
//###############################SelectList Submit######################################
//form
	@FindBy(id="SelectList_submit_button")
	private WebElement submit_button;
	
	public void Submit(){
		submit_button.click();
	}
	
	@FindBy(id="SelectList_Result_submit_selectList")
	private WebElement submitResult_String;
	
	public String subResultString(){
		return submitResult_String.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList_01")
	private WebElement submitResult_Date;
	
	public String subResultDate(){
		return submitResult_Date.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList01")
	private WebElement submitResult_Currency;
	
	public String subResultCurrency(){
		return submitResult_Currency.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList02")
	private WebElement submitResult_Number;
	
	public String subResultNumber(){
		return submitResult_Number.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList03")
	private WebElement submitResult_Boolean;
	
	public String subResultBoolean(){
		return submitResult_Boolean.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList04")
	private WebElement submitResult_Duration;
	
	public String subResultDuration(){
		return submitResult_Duration.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList05")
	private WebElement submitResult_XMLGregorianCalendar;
	
	public String subResultXMLGregorianCalendar(){
		return submitResult_XMLGregorianCalendar.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList06")
	private WebElement submitResult_Byte;
	
	public String subResultByte(){
		return submitResult_Byte.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList07")
	private WebElement submitResult_Short;
	
	public String subResultShort(){
		return submitResult_Short.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList08")
	private WebElement submitResult_Integer;
	
	public String subResultInteger(){
		return submitResult_Integer.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList09")
	private WebElement submitResult_Long;
	
	public String subResultLong(){
		return submitResult_Long.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList10")
	private WebElement submitResult_Float;
	
	public String subResultFloat(){
		return submitResult_Float.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList11")
	private WebElement submitResult_Double;
	
	public String subResultDouble(){
		return submitResult_Double.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList12")
	private WebElement submitResult_BigInteger;
	
	public String subResultBigInteger(){
		return submitResult_BigInteger.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_selectList13")
	private WebElement submitResult_BigDecimal;
	
	public String subResultBigDecimal(){
		return submitResult_BigDecimal.getAttribute("value");
	}
	
	@FindBy(id="SelectList_Result_submit_link")
	private WebElement submitResult_return;
	
	public void subResultReturn(){
		submitResult_return.click();
	}
	
//form01	
	@FindBy(id="SelectList_submit_selectList_copy")
	private WebElement submit_selectlistText;
	
	@FindBy(id="SelectList_submit_button01")
	private WebElement submit_button2;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement submit_FormXValHint;
	
	@FindBy(id="SelectList_submit_label16")
	private WebElement submit_lable;
	
	public String subButtonDisableT(){
		return submit_button2.getAttribute("aria-disabled");
	}
	
	public String subFormVal(){
		submit_selectlistText.click();
		submit_button2.click();
		return submit_FormXValHint.getText();
	}
	
	public String subButtonDisableF(){
		submit_selectlistText.clear();
		submit_selectlistText.sendKeys("Account2");
		submit_lable.click();
		return submit_button2.getAttribute("aria-disabled");
	}
	
	public String subForm01Submit(){
		submit_button2.click();
		return submitResult_String.getAttribute("value");
	}
	
//###############################SelectList Submit######################################


}
