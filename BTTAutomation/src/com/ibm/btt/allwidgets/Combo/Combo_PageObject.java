package com.ibm.btt.allwidgets.Combo;

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

public class Combo_PageObject extends Main_Page{
	
//###############################Combo Properties##################################
	@FindBy(xpath=".//*[@id='widget_combo_properties_combo01']")
	private WebElement properties_id;
	
	public String proId(){//1. SelectList's Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="widget_combo_properties_combo")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. SelectList's visibility = visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="widget_combo_properties_combo02")
	private WebElement properties_hidden;

	public String proHidden(){//3. SelectList's visibility = hidden
		return properties_hidden.getAttribute("style");
	}
	
	@FindBy(id="widget_combo_properties_combo03")
	private WebElement properties_gone;

	public String proGone(){//4. SelectList's visibility = gone
		return properties_gone.getAttribute("style");
	}
	
	@FindBy(id="combo_properties_combo05")
	private WebElement properties_disableFalse;
	
	@FindBy(id="widget_combo_properties_combo05")
	private WebElement properties_tabIndex1;
	
	public Boolean proDisableFalse(){//5. SelectList's disabled = false
		return properties_disableFalse.isEnabled();
	}
	
	public int properties_tabIndex1(){
		String[] temp={"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex1.getAttribute("class"), temp);
	}
	
	@FindBy(id="combo_properties_combo04")
	private WebElement properties_disableTrue;
	
	public String proDisableTrue(){//6. SelectList's disabled = true
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="combo_properties_combo07")
	private WebElement properties_readonlyFalse;
	
	public Boolean proReadonlyFalse(){//7. SelectList's readOnly = false 
		return properties_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="combo_properties_combo06")
	private WebElement properties_readonlyTrue;
	
	public String proReadonlyTrue(){//8. SelectList's readOnly = true
		return properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="widget_combo_properties_combo08")
	private WebElement properties_shortcut;
	
	public int proShortcut(){//9. SelectList's shortcut is 'w'
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_W);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_W);
		String[] temp={"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	public int properties_tabIndex5(){
		String[] temp={"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	@FindBy(id="combo_properties_combo09")
	private WebElement properties_hint;
	
	@FindBy(id="widget_combo_properties_combo09")
	private WebElement properties_tabIndex6;
	
	public String proHint(){//10. SelectList's hint is "This is no data." 
		return properties_hint.getAttribute("title");
	}
	
	public int properties_tabIndex6(){
		String[] temp={"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex6.getAttribute("class"), temp);
	}
	
	@FindBy(id="combo_properties_combo13")
	private WebElement properties_typeAHeadFalse;
	
	@FindBy(id="widget_combo_properties_combo13")
	private WebElement properties_tabIndex4;
	
	public String proTypeAHeadFalse(){//11. SelectList's typeAHead = false(only select)
		properties_typeAHeadFalse.sendKeys("asd");
		return properties_typeAHeadFalse.getText();
	}
	
	public int properties_tabIndex4(){
		String[] temp={"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex4.getAttribute("class"), temp);
	}
	
	@FindBy(id="combo_properties_combo10")
	private WebElement properties_typeAHeadTrue;
	
	public Boolean proTypeAHeadTrue(){//12. SelectList's typeAHead = true(input or select)
		return properties_typeAHeadTrue.isEnabled();
	}
	
	@FindBy(id="combo_properties_combo14")
	private WebElement properties_acceptedCharReg;
	
	@FindBy(id="widget_combo_properties_combo14")
	private WebElement properties_tabIndex7;
	
	public void proAcceptedCharReg(){//13. acceptedCharReg: The combo data RegExp is [012]
	}
	
	public int properties_tabIndex7(){
		String[] temp={"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex7.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='widget_combo_properties_combo12']/div[3]/span")
	private WebElement properties_placeHolder;
	
	public String proPlaceHolder(){//14. SelectList's placeHolder is 'Please input something.'
		return properties_placeHolder.getText();
	}
	
//###############################Combo Properties##################################
//###############################Combo CSS#########################################
	@FindBy(id="widget_combo_css_combo")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBorder"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_combo_css_combo01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setFontSize", "setFontFamily"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_combo_css_combo02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setBorder", "setFontStyle", "setFontWeight"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="widget_combo_css_combo03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitBorderContainer-dijitTabContainerLeft"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################Combo CSS#########################################
//###############################Combo Event#######################################
	@FindBy(id="combo_event_label06")
	private WebElement event_label;
	
	@FindBy(id="combo_event_combo")
	private WebElement event_onClick; 
	
	public Boolean evtOnClick(){ //onClick
		event_onClick.click();
		return event_label.isDisplayed();
	}
	
	@FindBy(id="combo_event_text")
	private WebElement event_Text;
	
	@FindBy(id="combo_event_combo01")
	private WebElement event_onFocus; 
	
	public String evtonFocus(){ //onFocus
		event_onFocus.click();
		return event_Text.getAttribute("value");
	}
	
	@FindBy(id="combo_event_combo02")
	private WebElement event_onBlur;
	
	@FindBy(id="combo_event_radio")
	private WebElement event_Radio;
	
	public Boolean evtOnBlur(){//onBlur
		event_onBlur.click();
		event_Radio.click();
		return event_Radio.isSelected();
	}
	
	@FindBy(id="combo_event_combo03")
	private WebElement event_onKeyDown;
	
	@FindBy(id="combo_event_button")
	private WebElement event_Button;
	
	public Boolean evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_Button.isEnabled();
	}
	
	@FindBy(id="combo_event_combo04")
	private WebElement event_onKeypress;
	
	@FindBy(id="combo_event_button01")
	private WebElement event_Button01;
	
	public Boolean evtOnKeypress(){ //onKeypress
		event_onKeypress.click();
		Main_Class.keyPress(KeyEvent.VK_1);
		Main_Class.keyRelease(KeyEvent.VK_1);
		return event_Button01.isEnabled();
	}
	
	@FindBy(id="combo_event_combo05")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="combo_event_button02")
	private WebElement event_Button02;
	
	public Boolean evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_Button02.isEnabled();
	}

	@FindBy(id="combo_event_combo06")
	private WebElement event_onMouseDown;
	
	@FindBy(id="combo_event_checkBox")
	private WebElement event_checkBox;
	
	public Boolean evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();;
		return event_checkBox.isSelected();
	}
	
	@FindBy(id="combo_event_combo07")
	private WebElement event_onMouseUp;
	
	@FindBy(id="combo_event_checkBox01")
	private WebElement event_checkBox01;
	
	public Boolean evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_checkBox01.isSelected();
	}
	
	@FindBy(id="widget_combo_event_combo08")
	private WebElement event_onMouseEnter; 
	
	@FindBy(id="combo_event_checkBox02")
	private WebElement event_checkBox02;

	public Boolean evtOnMouseEnter(){ //onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("widget_combo_event_combo08");
		return event_checkBox02.isSelected();
	}
	
	@FindBy(id="widget_combo_event_combo09")
	private WebElement event_onMouseLeave; 
	
	@FindBy(id="combo_event_radio01")
	private WebElement event_Radio01;

	public Boolean evtOnMouseLeave(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("widget_combo_event_combo09");
		main_class.widget_moveToElement("combo_event_radio01");
		return event_Radio01.isSelected();
	}
	
	@FindBy(id="widget_combo_event_combo10")
	private WebElement event_onMouseMove; 
	
	@FindBy(id="combo_event_radio02")
	private WebElement event_Radio02;
	
	public Boolean evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("widget_combo_event_combo10");
		return event_Radio02.isSelected();
	}
	
	@FindBy(xpath=".//*[@id='widget_combo_event_combo11']/div[1]/input")
	private WebElement event_click; 
	
	@FindBy(xpath=".//*[@id='combo_event_combo11_popup1']")
	private WebElement event_onChange; 
	
	@FindBy(id="combo_event_text01")
	private WebElement event_Account1; 
	
	public String evtOnChange(){ //onChange
		event_click.click();
		event_onChange.click();
		return event_Account1.getAttribute("value");
	}
	
//###############################Combo Event#######################################
//###############################Combo Condition###################################
	@FindBy(id="combo_condition_combo")
	private WebElement condition_isFocusable;
	
	public String conIsFocusable(){//1.Widget Function = isFocusable()
		condition_isFocusable.click();
		return condition_isFocusable.getAttribute("disabled");
	}

	@FindBy(id="combo_condition_combo01")
	private WebElement condition_isMandatory;
	
	@FindBy(id="combo_condition_button")
	private WebElement condition_changeMandatory;
	
	public String conIsMandatoryTrue(){//2. Widget Property = isMandatory
		condition_isMandatory.click();
		return condition_isMandatory.getAttribute("value");
	}
	
	public String conIsMandatoryFalse(){//2. Widget Property = isMandatory
		condition_changeMandatory.click();
		condition_isMandatory.click();
		return condition_isMandatory.getAttribute("value");
	}
	
	@FindBy(id="combo_condition_combo02")
	private WebElement condition_disable;
	
	@FindBy(id="combo_condition_label21")
	private WebElement condition_nlsShow;
	
	public String conDisable(){//3. Widget Property = disabled
		condition_disable.click();
		(new Main_Class()).keyDown(Keys.SHIFT);
		(new Main_Class()).keyUp(Keys.SHIFT);
		return condition_nlsShow.getText();
	}
	
	@FindBy(id="combo_condition_combo03")
	private WebElement condition_readonly;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement conTooltip;
	
	public String conReadonly(){//4. Widget Property = readOnly
		return condition_readonly.getAttribute("readonly");
	}
	
	public String conGetTooltip(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("combo_condition_combo03");
		main_class.widget_moveToElement("combo_condition_combo02");
		return conTooltip.getText();
	}
	
	@FindBy(id="combo_condition_combo04")
	private WebElement conExpisFocusable;
	
	@FindBy(id="combo_condition_label28")
	private WebElement conExp_label;
	
	public String conExpisFocusable(){//5. Expression : Widget Function = isFocusable()
		conExpisFocusable.click();
		return conExp_label.getText();
	}
	
	@FindBy(xpath=".//*[@id='combo_condition_combo05']")
	private WebElement conExpId;
	
	@FindBy(id="combo_condition_label29")
	private WebElement conExp_label01;
	
	public String conExpId(){//6.Expression : Widget Property = id
		conExpId.click();
	    return conExp_label01.getText();
	}
	@FindBy(id="combo_condition_combo06")
	private WebElement conExpisMandatory;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_1']/div[2]")
	private WebElement conExptooltip;
	
	@FindBy(id="combo_condition_label16")
	private WebElement conExplabel;
	
	public String conExpisMandatory(){//7.Expression : Widget Property = isMandatory
		conExpisMandatory.click();
		conExplabel.click();
		conExpisMandatory.click();
		return conExptooltip.getText();
	}
	
	@FindBy(id="combo_condition_combo07")
	private WebElement conExpVisible;
	
	@FindBy(id="combo_condition_label30")
	private WebElement conExplabel01;
	
	public Boolean conExpVisible(){//8. Expression : Widget Property = visibility
		conExpVisible.click();
		return conExpVisible.isDisplayed();
	}
	
	public String conExplabel01(){
		return conExplabel01.getText();
	}
	
	@FindBy(id="combo_condition_combo08")
	private WebElement conExpDisabled;
	
	@FindBy(id="combo_condition_label12")
	private WebElement conExplabel02;
	
	public String conExpDisabled(){//9.Expression : Widget Property = disabled
		conExpDisabled.click();
		conExplabel02.click();
		return conExpDisabled.getAttribute("disabled");
	}
	
	@FindBy(id="combo_condition_combo09")
	private WebElement conExpReadonly;
	
	@FindBy(id="combo_condition_checkBox")
	private WebElement conExpCheckBox;
	
	public String conExpReadonly(){//10. Expression : Widget Property = readOnly
		conExpReadonly.click();
		return conExpReadonly.getAttribute("readonly");
	}
	
	public Boolean conExpCheckBox(){
		return conExpCheckBox.isSelected();
	}
	
	@FindBy(xpath=".//*[@id='widget_combo_condition_combo10']/div[1]/input")
	private WebElement conExpClick;
	
	@FindBy(xpath=".//*[@id='combo_condition_combo10_popup1']")
	private WebElement conExpValue;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_2']/div[2]")
	private WebElement conExpTooltip;
	
	public String conExpValue(){//11.Expression : Widget Property = value
		conExpClick.click();
		conExpValue.click();
		return conExpTooltip.getText();
	}
//###############################Combo Condition###################################
//###############################Combo Action######################################
	@FindBy(id="combo_action_button")
	private WebElement actionClick1; //action Click here 1
	
	@FindBy(id="widget_combo_action_combo")
	private WebElement actionFocus; 
	
	public int actFocus(){// 	Invoke Widget Function : focus()
		actionClick1.click();
		String[] temp = {"dijitComboBoxFocused", "dijitFocused"};
		return CSS.css_query(actionFocus.getAttribute("class"), temp);
	}
	
	@FindBy(id="combo_action_radio")
	private WebElement actionClick2;//action Click 2
	
	@FindBy(xpath=".//*[@id='widget_combo_action_combo01']/div[1]/input")
	private WebElement actionClickArrow;
	
	@FindBy(xpath=".//*[@id='combo_action_combo01_popup0']")
	private WebElement action_loadStoreFromURL;
	
	public String actClickBefor(){
		actionClickArrow.click();
		return action_loadStoreFromURL.getText();
	}
	
	public String actLoadStoreFromURL() throws InterruptedException{//Invoke Widget Function = loadStoreFromURL(file)
		actionClick2.click();
		actionClickArrow.click();
		Thread.sleep(2000);
		return action_loadStoreFromURL.getText();
	}
	
	@FindBy(id="combo_action_link")
	private WebElement actionClick3;//action Click here 3
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement action_showErrorMessage;
	
	public String actShowErrorMessage(){//Invoke Widget Function : showErrorMessage
		actionClick3.click();
		return action_showErrorMessage.getText();
	}
	
	@FindBy(id="combo_action_button01")
	private WebElement actionClick4; //action Click here 4
	
	@FindBy(id="widget_combo_action_combo03")
	private WebElement action_styleClass;
	
	public int actStyleClass(){//Set Widget Property : styleClass
		actionClick4.click();
		String[] temp = {"testComboStyle"};
		return CSS.css_query(action_styleClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="combo_action_label15")
	private WebElement actionClick5;//action Click here 5
	
	@FindBy(id="combo_action_combo04")
	private WebElement action_isMandatory;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_1']/div[2]")
	private WebElement action_tooltip;
	
	public String actIsMandatory(){//Set Widget Property = isMandatory = true
		actionClick5.click();
		action_isMandatory.click();
		actionClick5.click();
		action_isMandatory.click();
		return action_tooltip.getText();
	}
	
	@FindBy(id="combo_action_button02")
	private WebElement actionClick6;//action Click here 6
	
	@FindBy(id="widget_combo_action_combo05")
	private WebElement action_hidden;
	
	public Boolean actHidden(){//Set Widget Property : visibility = hidden
		actionClick6.click();
		return action_hidden.isDisplayed();
	}
	
	@FindBy(id="combo_action_combo06")
	private WebElement action_disableTrue;
	
	public String actdisableTrue(){//Set Widget Property : disabled = true
		action_disableTrue.click();
		return action_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="combo_action_combo07")
	private WebElement action_readonlyTrue;
	
	public String actreadonlyTrue(){//Set Widget Property : readOnly = true
		action_readonlyTrue.click();
		return action_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="SelectList_action_button_copy07")
	private WebElement actionClick9;
	
	@FindBy(id="combo_action_combo08")
	private WebElement action_value;
	
	public String actValue(){//Set Widget Property = value
		actionClick9.click();
		return action_value.getAttribute("value");
	}
	
	@FindBy(id="combo_action_combo09")
	private WebElement action_hint;
	
	public String actHint(){//Set Widget Property : hint
		(new Main_Class()).widget_moveToElement("combo_action_combo09");
		return action_hint.getAttribute("title");
	}
	
	@FindBy(id="combo_action_text")
	private WebElement action_text;
	
	@FindBy(id="combo_action_combo10")
	private WebElement action_group;
	
	public String actGroup(){//Action Group
		action_text.sendKeys("action group");
		action_group.click();
		return action_group.getAttribute("value");
	}
	
//###############################Combo Action######################################
//###############################Combo Appearance##################################
	@FindBy(xpath=".//*[@id='combo_appearance_group']/div/div/div/div")
	private WebElement Appearance_1;
	
	public String Appearance_1(){//1.horizontal is left,vertical is top
		String v = Appearance_1.getAttribute("style");
		String h = Appearance_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group01']/div/div/div/div")
	private WebElement Appearance_2;
	
	public String Appearance_2(){//2.horizontal is left,vertical is center
		String v = Appearance_2.getAttribute("style");
		String h = Appearance_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group02']/div/div/div/div")
	private WebElement Appearance_3;
	
	public String Appearance_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance_3.getAttribute("style");
		String h = Appearance_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group03']/div/div/div/div")
	private WebElement Appearance_4;
	
	public String Appearance_4(){//4.horizontal is center,vertical is top
		String v = Appearance_4.getAttribute("style");
		String h = Appearance_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group04']/div/div/div/div")
	private WebElement Appearance_5;
	
	public String Appearance_5(){//5.horizontal is center,vertical is center
		String v = Appearance_5.getAttribute("style");
		String h = Appearance_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group05']/div/div/div/div")
	private WebElement Appearance_6;
	
	public String Appearance_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance_6.getAttribute("style");
		String h = Appearance_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group06']/div/div/div/div")
	private WebElement Appearance_7;
	
	public String Appearance_7(){//7.horizontal is right,vertical is top
		String v = Appearance_7.getAttribute("style");
		String h = Appearance_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group07']/div/div/div[1]/div")
	private WebElement Appearance_8;
	
	public String Appearance_8(){//8.horizontal is right,vertical is center
		String v = Appearance_8.getAttribute("style");
		String h = Appearance_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group08']/div/div/div/div")
	private WebElement Appearance_9;
	
	public String Appearance_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance_9.getAttribute("style");
		String h = Appearance_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group09']/div/div/div/div")
	private WebElement Appearance_10;
	
	public String Appearance_10(){//10.horizontal indent is 50px
		return Appearance_10.getAttribute("style");
		
	}
	
	@FindBy(xpath=".//*[@id='combo_appearance_group10']/div/div/div/div")
	private WebElement Appearance_11;
	
	public String Appearance_11(){//11.horizontal indent is 10percent
		return Appearance_11.getAttribute("style");
	}
	
	@FindBy(id="widget_combo_appearance_combo11")
	private WebElement Appearance_12;
	
	public String Appearance_12(){//12.Width is AutoSize,Height is AutoSize
		return Appearance_12.getAttribute("style");
	}
	
	@FindBy(id="widget_combo_appearance_combo12")
	private WebElement Appearance_13;
	
	public String Appearance_13(){//13.Width is fixed100,Height is AutoSize
		return Appearance_13.getAttribute("style");
	}
	
	@FindBy(id="widget_combo_appearance_combo13")
	private WebElement Appearance_14;
	
	public String Appearance_14(){//14.Width is Relative50%,Height is AutoSize
		return Appearance_14.getAttribute("style");
	}
	
	@FindBy(id="widget_combo_appearance_combo14")
	private WebElement Appearance_15;
	
	public String Appearance_15(){//15.Width is Fill,Height is AutoSize
		return Appearance_15.getAttribute("style");
	}
//###############################Combo Appearance##################################
//###############################Combo Submit######################################
	
	/*@FindBy(xpath=".//*[@id='widget_combo_submit_combo']/div[1]/input")
	private WebElement submit_click1;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo_popup0']")
	private WebElement submit_Country0;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo_popup1']")
	private WebElement submit_Country1;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement submit_StringTooltip;
	
	
	public String subString(){//Please select Country1.
		submit_click1.click();
		submit_Country0.click();
		return submit_StringTooltip.getText();
	}
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList_01']/div[1]/input")
	private WebElement submit_click2;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList_01_popup2']")
	private WebElement submit_Date;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList01']/div[1]/input")
	private WebElement submit_click3;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList01_popup3']")
	private WebElement submit_Currency;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList02']/div[1]/input")
	private WebElement submit_click4;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList02_popup0']")
	private WebElement submit_Number;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList03']/div[1]/input")
	private WebElement submit_click5;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList03_popup0']")
	private WebElement submit_Boolean;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList04']/div[1]/input")
	private WebElement submit_click6;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList04_popup4']")
	private WebElement submit_Duration;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList05']/div[1]/input")
	private WebElement submit_click7;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList05_popup4']")
	private WebElement submit_XMLGregorianCalendar;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo07']/div[1]/input")
	private WebElement submit_click8;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo07_popup0']")
	private WebElement submit_Byte;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement submit_ByteTooltip;
	
	public String subByteTooltip(){//Must select one.
		return submit_ByteTooltip.getText();
	}
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList07']/div[1]/input")
	private WebElement submit_click9;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_Short;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList08']/div[1]/input")
	private WebElement submit_click10;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_Integer;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList09']/div[1]/input")
	private WebElement submit_click11;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_Long;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList10']/div[1]/input")
	private WebElement submit_click12;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_Float;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList11']/div[1]/input")
	private WebElement submit_click13;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_Double;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList12']/div[1]/input")
	private WebElement submit_click14;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_BigInteger;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList13']/div[1]/input")
	private WebElement submit_click15;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_BigDecimal;
	
	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList13']/div[1]/input")
	private WebElement submit_click17;
	
	@FindBy(xpath="widget_selectlist_appearance_selectList14")
	private WebElement submit_isMandatory;
	
	
	
	@FindBy(id="SelectList_submit_button")
	private WebElement submit_button;
	
	public void Submit(){
		submit_click1.click();
		submit_String.click();
		submit_click2.click();
		submit_Date.click();
		submit_click3.click();
		submit_Currency.click();
		submit_click4.click();
		submit_Number.click();
		submit_click5.click();
		submit_Boolean.click();
		submit_click6.click();
		submit_Duration.click();
		submit_click7.click();
		submit_XMLGregorianCalendar.click();
		submit_click8.click();
		submit_Byte.click();
		submit_click9.click();
		submit_Short.click();
		submit_click10.click();
		submit_Integer.click();
		submit_click11.click();
		submit_Long.click();
		submit_click12.click();
		submit_Float.click();
		submit_click13.click();
		submit_Double.click();
		submit_click14.click();
		submit_BigInteger.click();
		submit_click15.click();
		submit_BigDecimal.click();
		submit_button.click();
	}

	@FindBy(xpath=".//*[@id='widget_SelectList_submit_selectList_copy']/div[1]/input")
	private WebElement submit_click16;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList_copy_popup2']")
	private WebElement submit_Account2;
	
	@FindBy(xpath=".//*[@id='SelectList_submit_selectList_copy_popup3']")
	private WebElement submit_Account3;
	
	@FindBy(id="SelectList_submit_button01")
	private WebElement submit_FormXValButton;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement submit_FormXValHint;
	
	public String subFormVal(){
		submit_click16.click();
		submit_Account3.click();
		return submit_FormXValHint.getText();
	}
	
	public Boolean subFormValHint(){
		submit_click16.click();
		submit_Account2.click();
		return submit_FormXValButton.isEnabled();
	}
	*/
//###############################Combo Submit######################################


}
