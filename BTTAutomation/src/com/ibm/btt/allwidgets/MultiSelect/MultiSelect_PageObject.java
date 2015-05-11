package com.ibm.btt.allwidgets.MultiSelect;

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

public class MultiSelect_PageObject extends Main_Page{
	
//###############################MultiSelect Properties##################################
//MultiSelect properties	
	@FindBy(xpath=".//*[@id='MultiSelect_properties_multiSelect']")
	private WebElement properties_id;
	
	public String proId(){//1. SelectList's Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility:visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy01")
	private WebElement properties_hidden;
	
	public int proHidden(){// 3. visibility:hidden
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy09")
	private WebElement properties_gone;
	
	public int proGone(){//4. visibility:gone
		String[] temp={"display: none"};
		return Appearance.appearance_query(properties_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy02")
	private WebElement properties_disableTrue;
	
	public String proDisableTrue(){//5. disabled:true
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy03")
	private WebElement properties_disableFalse;
	
	public Boolean proDisableFlase(){//6. disable:false
		return properties_disableFalse.isEnabled();
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy04")
	private WebElement properties_readonlyTrue;

	public String proReadonly(){//7. readonly:true
		return properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy05")
	private WebElement properties_readonlyFalse;

	public Boolean proReadonlyFlase(){//8. readonly:false
		return properties_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy06")
	private WebElement properties_shortcut;
	
	public int proShortcut(){//9. shortcut is 'c'(shift+alt+c)
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_C);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_C);
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	public int proTabIndex3(){//tabIndex = 3
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy07")
	private WebElement properties_hintNLS;
	
	public String proHintNLS(){//10. hint(NLS) is "%nls.bttsample/hint_test"
		return properties_hintNLS.getAttribute("title");
	}
	
	public int proTabIndex1(){//tabIndex = 1
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_hintNLS.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy07_copy")
	private WebElement properties_hint;
	
	public String proHint(){//11. SelectList's readOnly = false 
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy08")
	private WebElement properties_tabIndex2;
	
	public String proTabIndex2(){//12. tabIndex = 2
		return properties_tabIndex2.getAttribute("tabindex");
	}
	
	public int proTabIndex2Focus(){//tabIndex = 2
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex2.getAttribute("class"), temp);
	}
//###############################MultiSelect Properties##################################
//###############################MultiSelect CSS#########################################
	@FindBy(id="MultiSelect_css_multiSelect")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBackgroundColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_css_multiSelect_copy")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setBackgroundColor", "setFontSize"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_css_multiSelect_copy01")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setBackgroundColor", "setFontStyle", "setFontWeight"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_css_multiSelect_copy02")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"claro"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################MultiSelect CSS#########################################
//###############################MultiSelect ECA#########################################
//Event	
	@FindBy(id="MultiSelect_eca_multiSelect")
	private WebElement event_onClick;
	
	@FindBy(id="MultiSelect_eca_label")
	private WebElement event_label1; 
	
	public String evtOnClick(){ //onClick
		event_onClick.click();
		return event_label1.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy")
	private WebElement event_onFocus; 
	
	@FindBy(id="MultiSelect_eca_label_copy")
	private WebElement event_label2; 
	
	public String evtOnFocus(){ //onFocus
		event_onFocus.click();
		return event_label2.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy01")
	private WebElement event_onBlur;
	
	@FindBy(id="MultiSelect_eca_label_copy01")
	private WebElement event_label3;
	
	public String evtOnBlur(){ //onBlur
		event_onBlur.click();
		event_onFocus.click();
		return event_label3.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy02")
	private WebElement event_onKeyDown; 
	
	@FindBy(id="MultiSelect_eca_label_copy02")
	private WebElement event_label4;
	
	public String evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label4.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy03")
	private WebElement event_onKeyPress; 
	
	@FindBy(id="MultiSelect_eca_label_copy03")
	private WebElement event_label5;
	
	public String evtOnKeyPress(){ //onKeyPress
		event_onKeyPress.click();
		Main_Class main_class = new Main_Class();
		main_class.keyPress(KeyEvent.VK_0);
		main_class.keyRelease(KeyEvent.VK_0);
		return event_label5.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy04")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="MultiSelect_eca_label_copy04")
	private WebElement event_label6;
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label6.getText();
	}

	@FindBy(id="MultiSelect_eca_multiSelect_copy05")
	private WebElement event_onMouseDown;
	
	@FindBy(id="MultiSelect_eca_label_copy05")
	private WebElement event_label7;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();;
		return event_label7.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy06")
	private WebElement event_onMouseUp;
	
	@FindBy(id="MultiSelect_eca_label_copy06")
	private WebElement event_label8;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_label8.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy07")
	private WebElement event_onMouseEnter; 
	
	@FindBy(id="MultiSelect_eca_label_copy07")
	private WebElement event_label9;

	public String evtOnMouseEnter(){ //onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("MultiSelect_eca_multiSelect_copy07");
		return event_label9.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy08")
	private WebElement event_onMouseLeave;
	
	@FindBy(id="MultiSelect_eca_label_copy08")
	private WebElement event_label10;

	public String evtOnMouseLeave(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("MultiSelect_eca_multiSelect_copy08");
		main_class.widget_moveToElement("MultiSelect_eca_label_copy08");
		return event_label10.getText();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy09")
	private WebElement event_onMouseMove;
	
	@FindBy(id="MultiSelect_eca_label_copy09")
	private WebElement event_label11;
	
	public String evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("MultiSelect_eca_multiSelect_copy09");
		return event_label11.getText();
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_eca_multiSelect_copy10']/option[2]")
	private WebElement event_onChange; 
	
	@FindBy(id="MultiSelect_eca_label_copy10")
	private WebElement event_label12; 
	
	public String evtOnChange(){ //onChange
		Main_Class.keyPress(KeyEvent.VK_CONTROL);
		event_onChange.click();
		Main_Class.keyRelease(KeyEvent.VK_CONTROL);
		return event_label12.getText();
	}
//Action
	@FindBy(id="MultiSelect_eca_tabbedPane_tablist_MultiSelect_eca_ContentPane03")
	private WebElement actcon_tabbedPane; 
	
	public void actconTabbedPane(){//Condition& Action
		actcon_tabbedPane.click();
	}
	
	@FindBy(id="MultiSelect_eca_multiSelect_copy11")
	private WebElement action_MultiSelect;
	
	@FindBy(id="MultiSelect_eca_button")
	private WebElement action_clickMe1;
	
	public int actFocus(){//Invoke Widget Function-focus()
		action_clickMe1.click();
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(action_MultiSelect.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_eca_button_copy")
	private WebElement action_clickMe2;
	
	public int actStyleClassBlue(){//Set Widget Property-styleClass:blue
		action_clickMe2.click();
		String[] temp = {"blue"};
		return CSS.css_query(action_MultiSelect.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_eca_button_copy01")
	private WebElement action_clickMe3;
	
	public int actStyleClassRed(){//Set Widget Property-styleClass:red
		action_clickMe3.click();
		String[] temp = {"red"};
		return CSS.css_query(action_MultiSelect.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_eca_button_copy02")
	private WebElement action_clickMe4;
	
	@FindBy(xpath=".//*[@id='MultiSelect_eca_multiSelect_copy11']/option[3]")
	private WebElement action_multiSelectValue2;
	
	public String actmultiSelectValue1(){//Set Widget Property-value:2
		action_clickMe4.click();
		return action_multiSelectValue2.getAttribute("value");
	}
	
	@FindBy(id="MultiSelect_eca_button_copy03")
	private WebElement action_clickMe5;
	
	@FindBy(xpath=".//*[@id='MultiSelect_eca_multiSelect_copy11']/option[6]")
	private WebElement action_multiSelectValue5;
	
	public String actmultiSelectValue5(){//Set Widget Property-value:5
		action_clickMe5.click();
		return action_multiSelectValue5.getAttribute("value");
	}
	
	@FindBy(id="MultiSelect_eca_button_copy04")
	private WebElement action_clickMe6;
	
	public Boolean actVisible(){//Set Widget Property-visibility:visible
		action_clickMe6.click();
		return action_MultiSelect.isDisplayed();
	}
	
	@FindBy(id="MultiSelect_eca_button_copy05")
	private WebElement action_clickMe7;
	
	public int actHidden(){//Set Widget Property-visibility:hidden
		action_clickMe7.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(action_MultiSelect.getAttribute("style"), temp);
	}
	
	@FindBy(id="MultiSelect_eca_button_copy06")
	private WebElement action_clickMe8;
	
	public int actGone(){//Set Widget Property-visibility:gone
		action_clickMe8.click();
		String[] temp={"display: none"};
		return Appearance.appearance_query(action_MultiSelect.getAttribute("style"), temp);
	}
	
	
	@FindBy(id="MultiSelect_eca_button_copy07")
	private WebElement action_clickMe9;
	
	public String actDisableTrue(){//Set Widget Property-disabled: true
		action_clickMe6.click();
		action_clickMe9.click();
		return action_MultiSelect.getAttribute("disabled");
	}
	
	@FindBy(id="MultiSelect_eca_button_copy08")
	private WebElement action_clickMe10;
	
	public Boolean actDisableFalse(){//Set Widget Property-disabled: false
		action_clickMe10.click();
		return action_MultiSelect.isEnabled();
	}
	
	@FindBy(id="MultiSelect_eca_button_copy09")
	private WebElement action_clickMe11;
	
	public String actReadonlyTrue(){//Set Widget Property-readOnly:true
		action_clickMe11.click();
		return action_MultiSelect.getAttribute("readonly");
	}
	
	@FindBy(id="MultiSelect_eca_button_copy10")
	private WebElement action_clickMe12;
	
	public Boolean actReadonlyFalse(){//Set Widget Property-readOnly:false
		action_clickMe12.click();
		return action_MultiSelect.isEnabled();
	}
	
	@FindBy(id="MultiSelect_eca_button_copy11")
	private WebElement action_clickMe13;
	
	public String actHint(){//Set Widget Property-hint: This is hint~
		action_clickMe13.click();
		return action_MultiSelect.getAttribute("title");
	}
	
	@FindBy(id="MultiSelect_eca_button_copy12")
	private WebElement action_clickMe14;
	
	public String actHint1(){//Set Widget Property-hint: credit_card
		action_clickMe14.click();
		return action_MultiSelect.getAttribute("title");
	}
	
	@FindBy(id="MultiSelect_eca_button12")
	private WebElement action_clickMe15;
	
	public int actGroupGone(){//Action Group: visibility = gone
		action_clickMe15.click();
		String[] temp={"display: none"};
		return Appearance.appearance_query(action_MultiSelect.getAttribute("style"), temp);
	}
	
//Condition
	@FindBy(id="MultiSelect_eca_label05")
	private WebElement condition_label;
	
	@FindBy(id="MultiSelect_eca_button01")
	private WebElement condition_button1;
	
	public String conFocus(){//Widget Function-isFocusable
		action_clickMe6.click();
		condition_button1.click();
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button02")
	private WebElement condition_button2;
	
	public Boolean conDisabled(){//Widget Property-disabled
		condition_button2.click();
		return action_MultiSelect.isEnabled();
	}
	
	public String conLabelText2(){
		return condition_label.getText();
	}
	
	
	@FindBy(id="MultiSelect_eca_button03")
	private WebElement condition_button3;
	
	public Boolean conReadonly(){//Widget Property-readOnly
		condition_button3.click();
		return action_MultiSelect.isEnabled();
	}
	
	public String conLabelText3(){
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button04")
	private WebElement condition_button4;
	
	public String conisFocusable(){//Widget Expression Condition - multiSelect_copy11.isFocusable() == true
		condition_button4.click();
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button05")
	private WebElement condition_button5;
	
	@FindBy(xpath=".//*[@id='MultiSelect_eca_multiSelect_copy11']")
	private WebElement condition_multiselect;
	
	public String conId(){//Widget Expression Condition - multiSelect_copy11.id == "MultiSelect_eca_multiSelect_copy11"
		condition_button5.click();
		return condition_multiselect.getAttribute("id");
	}
	
	public String conLabelText5(){
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button06")
	private WebElement condition_button6;
	
	public String conValue(){//Widget Expression Condition - multiSelect_copy11.value == 1
		condition_button6.click();
		return condition_label.getText();
	}
	
	
	@FindBy(id="MultiSelect_eca_button07")
	private WebElement condition_button7;
	
	public Boolean conVisible(){//Widget Expression Condition - multiSelect_copy11.visibility=visible
		condition_button7.click();
		return condition_multiselect.isDisplayed();
	}
	
	public String conLabelText7(){
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button08")
	private WebElement condition_button8;
	
	public Boolean conDisable(){//Widget Expression Condition - multiSelect_copy11.disabled==true
		condition_button8.click();
		return condition_multiselect.isEnabled();
	}
	
	public String conLabelText8(){
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button09")
	private WebElement condition_button9;
	
	public Boolean conditionReadonly(){//Widget Expression Condition - multiSelect_copy11.readOnly == true
		condition_button9.click();
		return condition_multiselect.isEnabled();
	}
	
	public String conLabelText9(){
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button10")
	private WebElement condition_button10;
	
	public String conAsync(){//Widget Expression Condition - multiSelect_copy11.asyncStatus=ok
		condition_button10.click();
		return condition_label.getText();
	}
	
	@FindBy(id="MultiSelect_eca_button11")
	private WebElement condition_button11;
	
	public String conasyncErrorMessage(){//Widget Expression Condition - multiSelect_copy11.asyncErrorMessage = "error"
		condition_button11.click();
		return condition_label.getText();
	}
	
//###############################MultiSelect ECA#######################################
//###############################MultiSelect Appearance1################################
	@FindBy(id="MultiSelect_appearance1_multiSelect")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(id="MultiSelect_appearance1_multiSelect_copy")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is Fixed 200px,Height is AutoSize
		String[] temp={"width: 200px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(id="MultiSelect_appearance1_multiSelect_copy02")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is Relative 30%,Height is AutoSize
		String[] temp={"width: 30%"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(id="MultiSelect_appearance1_multiSelect_copy01")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is Fill,Height is AutoSize
		String[] temp={"width: 100%"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
//###############################MultiSelect Appearance1###############################
//###############################MultiSelect Appearance2###############################
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='MultiSelect_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################MultiSelect Appearance2###############################
//###############################MultiSelect Submit####################################
	
//###############################MultiSelect Submit####################################



}
