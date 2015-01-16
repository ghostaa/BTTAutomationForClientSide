package com.ibm.btt.allwidgets.SelectList;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
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
	
/*	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_06']/div[3]/input[2]")
	private WebElement properties_dataNameForList;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_properties_selectList_06']/div[1]/input")
	private WebElement properties_clickTrangle;
	
	public String[] proDataNameForL(){// 4. SelectList's dataNameForList
		properties_clickTrangle.click();
		String[] elements = Main_Class.elementList("SelectList_properties_selectList_06_popup");
		return elements;
	}*/
	
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
	
	@FindBy(id="SelectList_properties_selectList_14")
	private WebElement properties_shortcut;
	
	public Boolean proShortcut(){//14. SelectList's shortcut is 'v'
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_V);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_V);
		return Main_Class.widget_isFocus("SelectList_properties_selectList_14", "id", "input:focus");
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
	
	@FindBy(id="SelectList_properties_selectList_15_copy")
	private WebElement properties_tabIndex;
	
	public Boolean proTab(){
		return Main_Class.widget_isFocus("SelectList_properties_selectList_15_copy", "id", "input:focus");
	}
	public String proTabIndex(){//17. SelectList's tabInex is '12' 
		return properties_tabIndex.getAttribute("tabindex");
	}
	
	@FindBy(id="SelectList_properties_selectList_15_copy_copy")
	private WebElement properties_typeAHeadFalse;
	
	public Boolean proTypeAHeadFalse(){//18. SelectList's typeAHead = false(only select)
		return properties_typeAHeadFalse.isEnabled();
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
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onKeypress")
	private WebElement event_onKeypress;
	
	public String evtOnKeypress(){ //onKeypress
		event_onKeypress.click();
		Main_Class.keyPress(KeyEvent.VK_1);
		Main_Class.keyRelease(KeyEvent.VK_1);
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onKeyUp")
	private WebElement event_onKeyUp; 
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_message.getText();
	}

	@FindBy(id="SelectList_event_selectList_onMouseDown")
	private WebElement event_onMouseDown;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();;
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onMouseUp")
	private WebElement event_onMouseUp;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onMouseEnter")
	private WebElement event_onMouseEnter; 

	public String evtOnMouseEnter(){ //onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("SelectList_event_selectList_onMouseEnter");
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList_onMouseLeave")
	private WebElement event_onMouseLeave; 

	public String evtOnMouseLeave(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("widget_SelectList_event_selectList_onMouseLeave");
		main_class.widget_moveToElement("SelectList_event_label18");
		return event_message.getText();
	}
	
	@FindBy(id="widget_SelectList_event_selectList_onMouseMove")
	private WebElement event_onMouseMove; 
	
	public String evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
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
	
	public String evtOnBlur(){//onBlur
		event_onBlur.click();
		event_message.click();
		return event_message.getText();
	}
	
/*	@FindBy(id="SelectList_event_selectList")
	private WebElement event_onAsyncOK;
	
	public String evtOnAsyncOK(){//onAsyncOK
		return event_message.getText();
	}
	
	@FindBy(id="SelectList_event_selectList01")
	private WebElement event_onAsyncError;
	
	public String evtOnAsyncError(){//onAsyncError
		return event_message.getText();
	}*/
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
	
	public String actHidden(){//Set Widget Property : visibility = hidden
		actionClick6.click();
		return action_hidden.getAttribute("style");
	}
	
	@FindBy(id="SelectList_action_button_copy09")
	private WebElement actionClick7;//action Click here 7
	
	@FindBy(id="widget_SelectList_action_selectList_onChnge")
	private WebElement action_gone;
	
	public String actGone(){//Set Widget Property : visibility = gone
		actionClick7.click();
		return action_gone.getAttribute("style");
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


}
