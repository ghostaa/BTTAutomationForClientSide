package com.ibm.btt.allwidgets.TextArea;

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

public class TextArea_PageObject extends Main_Page{
	
//###############################TextArea Properties##################################
	@FindBy(xpath=".//*[@id='textArea_properties_mytextArea']")
	private WebElement properties_id;
	
	public String proId(){//1. SelectList's Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="textArea_properties_textArea01")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility:visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="textArea_properties_textArea02")
	private WebElement properties_hidden;
	
	public String proHidden(){// 3. visibility:hidden
		return properties_hidden.getAttribute("style");
	}
	
	@FindBy(id="textArea_properties_textArea03")
	private WebElement properties_gone;
	
	public String proGone(){//4. visibility:gone
		return properties_gone.getAttribute("style");
	}
	
	@FindBy(id="textArea_properties_textArea05")
	private WebElement properties_disableTrue;

	public String proDisableTrue(){//5. disabled:true
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="textArea_properties_textArea")
	private WebElement properties_disablFalse;

	public Boolean proDisableFalse(){//6. disabled:false
		return properties_disablFalse.isEnabled();
	}
	
	@FindBy(id="textArea_properties_textArea08")
	private WebElement properties_readonlyTrue;

	public String proReadonlyTrue(){//7. readonly:true
		return properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="textArea_properties_textArea07")
	private WebElement properties_readonlyFalse;

	public Boolean proReadonlyFlase(){//8. readonly:false
		return properties_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="textArea_properties_textArea06")
	private WebElement properties_shortcut;
	
	public int proShortcut(){//9. shortcut:z
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_Z);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_Z);
		String[] temp = {"dijitTextAreaFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	@FindBy(id="textArea_properties_textArea04")
	private WebElement properties_hint;
	
	public String proHint(){//10. textArea choose hint
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="textArea_properties_textArea09")
	private WebElement properties_tabIndex;
	
	public String proTabIndex(){//11. textArea tabIndex is 0
		return properties_tabIndex.getAttribute("tabindex");
	}
	
	@FindBy(id="textArea_properties_textArea10")
	private WebElement properties_cols;
	
	public String proCols(){//12. textArea cols = 10
		return properties_cols.getAttribute("cols");
	}
//###############################TextArea Properties##################################
//###############################TextArea CSS#########################################
	@FindBy(id="textArea_css_textArea")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setFontWeight"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="textArea_css_textArea01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setBorder", "setFontStyle"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="textArea_css_textArea02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setFontStyle", "setFontWeight", "setFontSize"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="textArea_css_textArea03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitSplitterVActive"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################TextArea CSS#########################################
//###############################TextArea Event#######################################
	@FindBy(id="textArea_event_textArea")
	private WebElement event_onClick;
	
	@FindBy(id="textArea_event_label13")
	private WebElement event_label1; 
	
	public String evtOnClick(){ //onClick
		event_onClick.click();
		return event_label1.getText();
	}
	
	@FindBy(id="textArea_event_textArea01")
	private WebElement event_onFocus; 
	
	@FindBy(id="textArea_event_label14")
	private WebElement event_label2; 
	
	public String evtOnFocus(){ //onFocus
		event_onFocus.click();
		return event_label2.getText();
	}
	
	@FindBy(id="textArea_event_textArea02")
	private WebElement event_onBlur;
	
	@FindBy(id="textArea_event_label15")
	private WebElement event_label3;
	
	public String evtOnBlur(){ //onBlur
		event_onBlur.click();
		event_label3.click();
		return event_label3.getText();
	}
	
	@FindBy(id="textArea_event_textArea03")
	private WebElement event_onKeyDown; 
	
	@FindBy(id="textArea_event_label16")
	private WebElement event_label4;
	
	public String evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label4.getText();
	}
	
	@FindBy(id="textArea_event_textArea04")
	private WebElement event_onKeyPress; 
	
	@FindBy(id="textArea_event_label17")
	private WebElement event_label5;
	
	public String evtOnKeyPress(){ //onKeyPress
		event_onKeyPress.click();
		Main_Class main_class = new Main_Class();
		main_class.keyPress(KeyEvent.VK_0);
		main_class.keyRelease(KeyEvent.VK_0);
		return event_label5.getText();
	}
	
	@FindBy(id="textArea_event_textArea05")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="textArea_event_label18")
	private WebElement event_label6;
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label6.getText();
	}

	@FindBy(id="textArea_event_textArea06")
	private WebElement event_onMouseDown;
	
	@FindBy(id="textArea_event_label19")
	private WebElement event_label7;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();;
		return event_label7.getText();
	}
	
	@FindBy(id="textArea_event_textArea07")
	private WebElement event_onMouseUp;
	
	@FindBy(id="textArea_event_label20")
	private WebElement event_label8;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_label8.getText();
	}
	
	@FindBy(id="textArea_event_textArea08")
	private WebElement event_onMouseEnter; 
	
	@FindBy(id="textArea_event_label21")
	private WebElement event_label9;

	public String evtOnMouseEnter(){ //onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("textArea_event_textArea08");
		return event_label9.getText();
	}
	
	@FindBy(id="textArea_event_textArea09")
	private WebElement event_onMouseLeave;
	
	@FindBy(id="textArea_event_label22")
	private WebElement event_label10;

	public String evtOnMouseLeave(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("textArea_event_textArea09");
		main_class.widget_moveToElement("textArea_event_label22");
		return event_label10.getText();
	}
	
	@FindBy(id="textArea_event_textArea10")
	private WebElement event_onMouseMove;
	
	@FindBy(id="textArea_event_label23")
	private WebElement event_label11;
	
	public String evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("textArea_event_textArea10");
		return event_label11.getText();
	}
	
	@FindBy(id="textArea_event_textArea11")
	private WebElement event_onChange; 
	
	@FindBy(id="textArea_event_label24")
	private WebElement event_label12; 
	
	public String evtOnChange(){ //onChange
		event_onChange.sendKeys("aaa");
		event_label12.click();
		return event_label12.getText();
	}

//###############################TextArea Event######################################
//###############################TextArea Condition##################################	
	@FindBy(id="textArea_condition_textArea")
	private WebElement condition_isFocusable;
	
	@FindBy(id="textArea_condition_label18")
	private WebElement condition_label1;
	
	public String conIsFocusable(){//Widget Function-isFocusable
		condition_isFocusable.click();
		return condition_label1.getText();
	}
	
	@FindBy(id="textArea_condition_textArea01")
	private WebElement condition_isMandatory;
	
	@FindBy(id="textArea_condition_label17")
	private WebElement condition_label2;
	
	public String conIsMandatory(){//isMandatory
		condition_isMandatory.click();
		return condition_label2.getText();
	}
	
	@FindBy(id="textArea_condition_label19")
	private WebElement condition_label3;
	
	public String conDisabled(){//Widget Property-disabled
		condition_label3.click();
		return condition_label3.getText();
	}

	@FindBy(id="textArea_condition_textArea03")
	private WebElement condition_readOnly;
	
	@FindBy(id="textArea_condition_label20")
	private WebElement condition_label4;
	
	public String conReadOnly(){// readOnly
		condition_readOnly.click();
		return condition_label4.getText();
	}
	
	@FindBy(id="textArea_condition_textArea04")
	private WebElement condition_Constant;
	
	@FindBy(id="textArea_condition_label22")
	private WebElement condition_label5;
	
	public String conConstant(){// Constant: 5 > 3 
		condition_Constant.click();
		return condition_label5.getText();
	}
	
	@FindBy(id="textArea_condition_textArea12")
	private WebElement condition_ConstantTF;
	
	@FindBy(id="textArea_condition_label24")
	private WebElement condition_label6;
	
	public String conConstantTF(){// 	Constant: true or false
		condition_ConstantTF.click();
		return condition_label6.getText();
	}
	
	@FindBy(id="textArea_condition_textArea05")
	private WebElement condition_ExpIsFocusable;
	
	@FindBy(id="textArea_condition_label10")
	private WebElement condition_label7;
	
	public String conExpIsFocusable(){//Widget Function = isFocusable
		condition_ExpIsFocusable.click();
		return condition_label7.getText();
	}
	
	@FindBy(id="textArea_condition_text02")
	private WebElement condition_text;
	
	public String conExpId(){//Widget Function = id
		condition_text.click();
		return condition_text.getAttribute("value");
	}
	
	@FindBy(id="textArea_condition_textArea07")
	private WebElement condition_ExpValue;
	
	@FindBy(id="textArea_condition_text04")
	private WebElement condition_text1;
	
	public String conExpValue(){// 	Expression-Widget Property : value
		condition_ExpValue.sendKeys("test value");
		condition_text1.click();
		return condition_text1.getAttribute("value");
	}
	
	@FindBy(id="textArea_condition_text")
	private WebElement condition_text2;
	
	public String conExpIsMandatory(){// 	Expression-Widget Property : isMandatory 	
		condition_text2.click();
		return condition_text2.getAttribute("value");
	}
	
	@FindBy(id="textArea_condition_text05")
	private WebElement condition_text3;
	
	public String conExpVisibility(){// 	Expression-Widget Property : visibility
		condition_text3.click();
		return condition_text3.getAttribute("value");
	}
	
	@FindBy(id="textArea_condition_text01")
	private WebElement condition_text4;
	
	public String conExpDisabled(){// 	Expression-Widget Property : disabled
		condition_text4.click();
		return condition_text4.getAttribute("value");
	}
	
	@FindBy(id="textArea_condition_text03")
	private WebElement condition_text5;
	
	public String conExpReadonly(){// 	Expression-Widget Property : readonly
		condition_text5.click();
		return condition_text5.getAttribute("value");
	}
//###############################TextArea Condition##################################
//###############################TextArea Action#####################################
	@FindBy(id="textArea_action_textArea")
	private WebElement action_focus;
	
	@FindBy(id="textArea_action_text")
	private WebElement action_clickMe1;
	
	public String actFocus(){//Invoke Widget Function-focus()
		action_clickMe1.click();
		return action_focus.getAttribute("value");
	}
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement action_showErrorMessage;
	
	@FindBy(id="textArea_action_text01")
	private WebElement action_click;
	
	public String actErrorMessage(){//Invoke Widget Function- 	showErrorMessage
		action_click.click();
		return action_showErrorMessage.getText();
	}
	
	@FindBy(id="textArea_action_text03")
	private WebElement action_clickMe2;
	
	@FindBy(id="textArea_action_textArea02")
	private WebElement action_styleClass;
	
	public int actStyleClass(){//Set Widget Property-styleClass
		action_clickMe2.click();
		String[] temp = {"setBorder"};
		return CSS.css_query(action_styleClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="textArea_action_textArea03")
	private WebElement action_value;
	
	@FindBy(id="textArea_action_text04")
	private WebElement action_clickMe3;
	
	public String actValue(){//value
		action_clickMe3.click();
		return action_value.getAttribute("value");
	}
	
	@FindBy(id="textArea_action_textArea04")
	private WebElement action_isMandatory;
	
	@FindBy(id="textArea_action_text05")
	private WebElement action_clickMe4;
	
	public int actIsMandatory(){//isMandatory
		action_isMandatory.click();
		action_clickMe4.click();
		String[] temp={"dijitTextAreaError"};
		return CSS.css_query(action_isMandatory.getAttribute("class"), temp);
	}
	
	@FindBy(id="textArea_action_textArea05")
	private WebElement action_visibility;
	
	@FindBy(id="textArea_action_text06")
	private WebElement action_clickMe5;
	
	public int actVisibility(){//visibility
		action_clickMe5.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(action_visibility.getAttribute("style"), temp);
	}
	
	@FindBy(id="textArea_action_text07")
	private WebElement action_clickMe6;
	
	@FindBy(id="textArea_action_textArea06")
	private WebElement action_disable;
	
	public String actDisable(){//Set Widget Property : disable
		action_clickMe6.click();
		return action_disable.getAttribute("disabled");
	}
	
	@FindBy(id="textArea_action_text08")
	private WebElement action_clickMe7;
	
	@FindBy(id="textArea_action_textArea07")
	private WebElement action_readonly;
	
	public String actReadonly(){//Set Widget Property : ReadOnly
		action_clickMe7.click();
		return action_readonly.getAttribute("readonly");
	}
	
	@FindBy(id="textArea_action_text09")
	private WebElement action_clickMe8;
	
	@FindBy(id="textArea_action_textArea08")
	private WebElement action_hint;
	
	public String actHint(){//Set Widget Property : Hint
		action_clickMe8.click();
		return action_hint.getAttribute("title");
	}
	
	@FindBy(id="textArea_action_textArea09")
	private WebElement action_ActionGroup;
	
	@FindBy(id="textArea_action_label15")
	private WebElement action_label;
	
	public String actActionGroup(){//ActionGroup
		action_ActionGroup.click();
		return action_label.getText();
	}
	
	@FindBy(id="textArea_action_textArea10")
	private WebElement action_keyDown;
	
	@FindBy(id="textArea_action_label17")
	private WebElement action_label1;
	
	public String actKeyDown(){//ActionGroup
		action_keyDown.click();
		(new Main_Class()).keyDown(Keys.SHIFT);
		(new Main_Class()).keyUp(Keys.SHIFT);
		return action_label1.getText();
	}
	
//###############################TextArea Action#####################################
//###############################TextArea Appearance1################################
	@FindBy(id="textArea_appearance1_textArea")
	private WebElement Appearance1_1;
	
	public String Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		return Appearance1_1.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy")
	private WebElement Appearance1_2;
	
	public String Appearance1_2(){//2.Width is AutoSize,Height is Fixed 50px
		return Appearance1_2.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy01")
	private WebElement Appearance1_3;
	
	public String Appearance1_3(){//3.Width is AutoSize,Height is Relative 50%
		return Appearance1_3.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy02")
	private WebElement Appearance1_4;
	
	public String Appearance1_4(){//4.Width is AutoSize,Height is Fill
		return Appearance1_4.getAttribute("style");
	}


	@FindBy(id="textArea_appearance1_textArea_copy03")
	private WebElement Appearance1_5;
	
	public String Appearance1_5(){//5.Width is Fixed 150px,Height is AutoSize
		return Appearance1_5.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy")
	private WebElement Appearance1_6;
	
	public String Appearance1_6(){//6.Width is Fixed 150px,Height is Fixed 50px
		return Appearance1_6.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy01")
	private WebElement Appearance1_7;
	
	public String Appearance1_7(){//7.Width is Fixed 150px,Height is Relative 50%
		return Appearance1_7.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy02")
	private WebElement Appearance1_8;
	
	public String Appearance1_8(){//8.Width is Fixed 150px,Height is Fill
		return Appearance1_8.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy03")
	private WebElement Appearance1_9;
	
	public String Appearance1_9(){//9.Width is Relative 50%,Height is AutoSize
		return Appearance1_9.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy03_copy")
	private WebElement Appearance1_10;
	
	public String Appearance1_10(){//10.Width is Relative 50%,Height is Fixed 50px
		return Appearance1_10.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy03_copy01")
	private WebElement Appearance1_11;
	
	public String Appearance1_11(){//11.Width is Relative 50%,Height is Relative 50%
		return Appearance1_11.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy03_copy02")
	private WebElement Appearance1_12;
	
	public String Appearance1_12(){//12.Width is Relative 50%,Height is Fill
		return Appearance1_12.getAttribute("style");
	}


	@FindBy(id="textArea_appearance1_textArea_copy03_copy03_copy03")
	private WebElement Appearance1_13;
	
	public String Appearance1_13(){//13.Width is Fill,Height is AutoSize
		return Appearance1_13.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy03_copy03_copy")
	private WebElement Appearance1_14;
	
	public String Appearance1_14(){//14.Width is Fill,Height is Fixed 50px
		return Appearance1_14.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy03_copy03_copy01")
	private WebElement Appearance1_15;
	
	public String Appearance1_15(){//15.Width is Fill,Height is Relatvie 50%
		return Appearance1_15.getAttribute("style");
	}
	
	@FindBy(id="textArea_appearance1_textArea_copy03_copy03_copy03_copy02")
	private WebElement Appearance1_16;
	
	public String Appearance1_16(){//16.Width is Fill,Height is Fill
		return Appearance1_16.getAttribute("style");
	}
//###############################TextArea Appearance1###############################
//###############################TextArea Appearance2###############################
	@FindBy(xpath=".//*[@id='textArea_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance2_1.getAttribute("style");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance2_2.getAttribute("style");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance2_3.getAttribute("style");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance2_4.getAttribute("style");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance2_5.getAttribute("style");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance2_6.getAttribute("style");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance2_7.getAttribute("style");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group07']/div/div/div[1]/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance2_8.getAttribute("style");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance2_9.getAttribute("style");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public String Appearance2_10(){//10.horizontal indent is 50px
		return Appearance2_10.getAttribute("style");
		
	}
	
	@FindBy(xpath=".//*[@id='textArea_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public String Appearance2_11(){//11.horizontal indent is 10percent
		return Appearance2_11.getAttribute("style");
	}
//###############################TextArea Appearance2###############################
//###############################TextArea Submit####################################
	
//###############################TextArea Submit####################################



}