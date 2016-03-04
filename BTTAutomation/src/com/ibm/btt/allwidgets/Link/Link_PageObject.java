package com.ibm.btt.allwidgets.Link;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.allwidgets.Main_Page;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Main_Class;

public class Link_PageObject extends Main_Page{
	
//###############################Link Properties##################################
//Link properties	
	@FindBy(id="Link_properties_100")
	private WebElement properties_change;
	
	public String proChange(){// 1. Click test page link, text will be changed when link id =100
		properties_change.click();
		return properties_change.getText();
	}
	
	@FindBy(id="Link_properties_link01")
	private WebElement properties_text;
	
	public String proText(){// 2. "text" properties should be test page
		return properties_text.getText();
	}
	
	@FindBy(id="Link_properties_link02")
	private WebElement properties_visible;
	
	public Boolean proVisible(){// 3. "Test page" link should be shown
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="Link_properties_link09")
	private WebElement properties_hidden;
	
	public int proHidden(){// 4. "Test page" link should be hidden
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="Link_properties_link02_copy")
	private WebElement properties_gone;
	
	public int proGone(){//5. "Test page" link should be gone
		String[] temp={"display: none"};
		return Appearance.appearance_query(properties_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="Link_properties_link03")
	private WebElement properties_disableTrue;
	
	public int proDisableTrue(){//6. Test page can not click
		String[] temp = {"bttDisabledLink"};
		return CSS.css_query(properties_disableTrue.getAttribute("class"), temp);
	}
	
	@FindBy(id="Link_properties_link03_copy")
	private WebElement properties_disableFalse;
	
	public int proDisableFalse(){//7. Test page is able to click
		String[] temp = {"dijitLabelBase"};
		return CSS.css_query(properties_disableFalse.getAttribute("class"), temp);
	}
	
	@FindBy(id="Link_properties_link04")
	private WebElement properties_shortcut;

	public String proShortcut(){//8. Shift+Alt+w. Start new pages.
		Main_Class.executeCombinationKey(Keys.SHIFT,Keys.ALT,"w");
		return AllWidgetsProjectMain_Class.getCurrentURL();
	}
	
	@FindBy(id="Link_properties_link05")
	private WebElement properties_parent;
	
	public String pro_parent() throws InterruptedException{//9. sohu will be shown on the current page.
		properties_parent.click();
		Thread.sleep(2000);
		return AllWidgetsProjectMain_Class.getCurrentURL();
	}
	
	@FindBy(id="Link_properties_link05_copy")
	private WebElement properties_self;
	
	public String pro_self() throws InterruptedException{//10. sohu will be shown on the current page.
		properties_self.click();
		Thread.sleep(2000);
		return AllWidgetsProjectMain_Class.getCurrentURL();
	}
	
	@FindBy(id="Link_properties_link05_copy01")
	private WebElement properties_blank;
	
	public String pro_blank() throws InterruptedException{//11. Click test page, and new blank page 
		properties_blank.click();
		AllWidgetsProjectMain_Class.switchWindow(1);
		return Main_Class.getCurrentURL();
	}
	
	@FindBy(id="Link_properties_link06")
	private WebElement properties_extraParams;
	
	@FindBy(id="Image_css_label04")
	private WebElement properties_ImageCSS;
	
	public String pro_extraParams() throws Exception{//12. Image_css.jsp will be shown 
		properties_extraParams.click();
		Thread.sleep(3000);
		return properties_ImageCSS.getText();
	}
	
	@FindBy(id="Link_properties_link05_copy02")
	private WebElement properties_top;
	
	public String pro_top() throws InterruptedException{//13. sohu will be shown on the current page.
		properties_top.click();
		Thread.sleep(2000);
		return AllWidgetsProjectMain_Class.getCurrentURL();
	}
	
	@FindBy(id="Link_properties_link07")
	private WebElement properties_hint;
	
	public String pro_Hint(){//14. Hoer text for test page 
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="Link_properties_link08")
	private WebElement properties_tabIndex;
	
	public String pro_tabIndex(){//15. Press tab button, and focus is the current line.(tabindex=3) 
		return properties_tabIndex.getAttribute("tabindex");
	}
	
	public Boolean pro_isfocused(){//Verify link isfocused
		return AllWidgetsProjectMain_Class.widget_isFocus("Link_properties_link08");
	}
	
//###############################Link Properties##################################
//###############################Link CSS#########################################
	@FindBy(id="Link_css_link")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBackgroundColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="Link_css_link01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setBorder", "setColor"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="Link_css_link02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setFontSize", "setFontStyle", "setFontFamily"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="Link_css_link03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitPopup"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################Link CSS#########################################
//###############################Link Event#######################################
	@FindBy(id="Link_event_link")
	private WebElement event_onClick; 
	
	@FindBy(id="Link_event_label")
	private WebElement event_onClickLabel;
	
	public Boolean evtOnClick(){ //onClick
		event_onClick.click();
		return event_onClickLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link01")
	private WebElement event_onFocus; 
	
	@FindBy(id="Link_event_label02")
	private WebElement event_onFocusLabel;
	
	public Boolean evtOnFocus(){ //onFocus
		event_onFocus.click();
		return event_onFocusLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link02")
	private WebElement event_onBlur; 
	
	@FindBy(id="Link_event_label110")
	private WebElement event_onBlurLabel;
	
	public Boolean evtOnBlur(){ //onBlur
		event_onBlur.click();
		event_onFocus.click();
		return event_onBlurLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link03")
	private WebElement event_onKeyDown; 
	
	@FindBy(id="Link_event_label111")
	private WebElement event_onKeyDownLabel;
	
	public Boolean evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_onKeyDownLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link04")
	private WebElement event_onKeyPress; 
	
	@FindBy(id="Link_event_label112")
	private WebElement event_onKeyPressLabel;
	
	public Boolean evtOnKeyPress(){ //onKeyPress
		event_onKeyPress.click();
		Main_Class.pressAnyKey("3");
		return event_onKeyPressLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link05")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="Link_event_label113")
	private WebElement event_onKeyUpLabel;
	
	public Boolean evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_onKeyUpLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link06")
	private WebElement event_onMouseDown; 
	
	@FindBy(id="Link_event_label114")
	private WebElement event_onMouseDownLabel;
	
	public Boolean evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();
		return event_onMouseDownLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link07")
	private WebElement event_onMouseUp; 
	
	@FindBy(id="Link_event_label115")
	private WebElement event_onMouseUpLabel;
	
	public Boolean evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_onMouseUpLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link08")
	private WebElement event_onMouseEnter; 
	
	@FindBy(id="Link_event_label116")
	private WebElement event_onMouseEnterLabel;
	
	public Boolean evtOnMouseEnter(){ //onMouseEnter
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Link_event_link08");
		return event_onMouseEnterLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link09")
	private WebElement event_onMouseLeave; 
	
	@FindBy(id="Link_event_label117")
	private WebElement event_onMouseLeaveLabel;
	
	public Boolean evtOnMouseLeave(){ //onMouseLeave
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Link_event_link09");
		main_class.widget_moveToElement("Link_event_link08");
		return event_onMouseLeaveLabel.isDisplayed();
	}
	
	@FindBy(id="Link_event_link10")
	private WebElement event_onMouseMove; 
	
	@FindBy(id="Link_event_label118")
	private WebElement event_onMouseMoveLabel;
	
	public Boolean evtOnMouseMove(){ //onMouseMove
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Link_event_link10");
		return event_onMouseMoveLabel.isDisplayed();
	}
	
//###############################Link Event#######################################
//###############################Link Condition###################################
	@FindBy(id="Link_condition_link")
	private WebElement condition_click1; //click 1
	
	@FindBy(id="Link_condition_label02")
	private WebElement condition_isFocusable;
	
	public Boolean conisFocusable(){//Link with condition--widget function "isFocusable" =true 
		condition_click1.click();
		return condition_isFocusable.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link08")
	private WebElement condition_disableTrue; //click 2
	
	@FindBy(id="Link_condition_label02_copy07")
	private WebElement condition_labelShow;
	
	public String conDisableTrue(){//Link with condition--widget property"disabled" =true
		condition_labelShow.click();
		String[] temp = {"bttDisabledLink"};
		if(1 == CSS.css_query(condition_disableTrue.getAttribute("class"), temp)){
			return condition_labelShow.getText();
		}else
			return "disable is not true.";
	}
	
	@FindBy(id="Link_condition_link08_copy")
	private WebElement condition_click3; //click 3
	
	@FindBy(id="Link_condition_label02_copy07_copy")
	private WebElement condition_disableFalse;
	
	public Boolean conDisableFalse(){//Link with condition--widget property"disabled" =false
		condition_click3.click();
		return condition_disableFalse.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link01")
	private WebElement condition_click4; //click 4
	
	@FindBy(id="Link_condition_label02_copy")
	private WebElement condition_expInstant;
	
	public Boolean conExpInstant(){//Link with condition--expression--instant 
		condition_click4.click();
		return condition_expInstant.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link02")
	private WebElement condition_click5; //click 5
	
	@FindBy(id="Link_condition_label02_copy_copy")
	private WebElement condition_expisFocusable;
	
	public Boolean conExpisFocusable(){//Link with condition--expression--widget function isFocusable
		condition_click5.click();
		return condition_expisFocusable.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link_id")
	private WebElement condition_click6; //click 6
	
	@FindBy(id="Link_condition_label02_copy_copy_copy")
	private WebElement condition_expid;
	
	public Boolean conExpid(){//Link with condition--expression--widget property(id)
		condition_click6.click();
		return condition_expid.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link04")
	private WebElement condition_click7; //click 7
	
	@FindBy(id="Link_condition_label02_copy_copy_copy_copy")
	private WebElement condition_exptext;
	
	public Boolean conExpText(){//Link with condition--expression--widget property(text) 
		condition_click7.click();
		return condition_exptext.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link03")
	private WebElement condition_click8; //click 8
	
	@FindBy(id="Link_condition_label02_test")
	private WebElement condition_expvisiblity;
	
	public Boolean conExpVisiblity(){//Link with condition--expression--widget property(visiblity)
		condition_click8.click();
		return condition_expvisiblity.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link05")
	private WebElement condition_click9; //click 9
	
	@FindBy(id="Link_condition_label02_test_copy")
	private WebElement condition_expdisabled;
	
	public Boolean conExpDisabled(){//Link with condition--expression--widget property(disabled) 
		condition_click9.click();
		return condition_expdisabled.isDisplayed();
	}
	
	@FindBy(id="Link_condition_link05_copy")
	private WebElement condition_click10; //click 10
	
	@FindBy(id="Link_condition_label02_test_copy_copy")
	private WebElement condition_exptarget;
	
	public String conExpTarget(){//Link with condition--expression--widget property(target) 
		AllWidgetsProjectMain_Class.switchWindow(1);
		return Main_Class.getCurrentURL();
	}
	
	public Boolean conExpLabel(){
		condition_click10.click();
		return condition_exptarget.isDisplayed();
	}
//###############################Link Condition###################################
//###############################Link Action######################################
//Link action	
	@FindBy(id="Link_action_label01")
	private WebElement actionClick1; //action Click here 1
	
	public Boolean actFocus(){//Focus will be on "Link"
		actionClick1.click();
		return AllWidgetsProjectMain_Class.widget_isFocus("Link_action_link");
	}
	
	@FindBy(id="Link_action_label03")
	private WebElement actionClick2;//action Click here 2
	
	@FindBy(id="Link_action_link01")
	private WebElement action_styleclass;
	
	public int actStyleClass(){//Link01.Styleclass is changed.
		actionClick2.click();
		String[] temp = {"labelStyle2"};
		return CSS.css_query(action_styleclass.getAttribute("class"), temp);
	}
	
	@FindBy(id="Link_action_label04")
	private WebElement actionClick3; //action Click here 3
	
	@FindBy(id="Link_action_link02")
	private WebElement action_text;
	
	public String actText(){//Link text has been changed to 'test'
		actionClick3.click();
		return action_text.getText();
	}
	
	@FindBy(id="Link_action_label05")
	private WebElement actionClick4;//action Click here 4
	
	@FindBy(id="Link_action_label10")
	private WebElement action_verify;
	
	public String actVerify(){
		actionClick4.click();
		if(action_verify.isDisplayed() == true ){
			return action_verify.getText();
		}else
			return  "Verify Error";
	}
	
	@FindBy(id="Link_action_label06")
	private WebElement actionClick5;//action Click here 5
	
	@FindBy(id="Link_action_link04")
	private WebElement action_visible;
	
	public Boolean actVisible(){//Link visibility will be visible
		actionClick5.click();	
		return action_visible.isDisplayed();
	}
	
	@FindBy(id="Link_action_label07")
	private WebElement actionClick6;//action Click here 6
	
	@FindBy(id="Link_action_link05")
	private WebElement action_disabled;
	
	public String actDisabled(){//Link will be disabled
		actionClick6.click();
		return action_disabled.getAttribute("disabled");
	}
	
	@FindBy(id="Link_action_label13")
	private WebElement actionClick7;//action Click here 7
	
	@FindBy(id="Link_action_link03")
	private WebElement action_LinkClick;
	
	public String actBlank(){//Link target is _blank
		actionClick7.click();
		action_LinkClick.click();
		AllWidgetsProjectMain_Class.switchWindow(1);
		return Main_Class.getCurrentURL();
	}
	
	@FindBy(id="Link_action_label14")
	private WebElement actionClick8; //action Click here 8
	
	@FindBy(id="Link_action_link06")
	private WebElement action_hint;
	
	public String actHint(){
		actionClick8.click();
		return action_hint.getAttribute("title");
	}
	
	@FindBy(id="Link_action_label18")
	private WebElement actionClick9;//action Click here 9
	
	@FindBy(id="Link_action_link07")
	private WebElement action_TextHint;
	
	public String actText2(){//Link text is changed to "test", and hint is "test successfully" 
		actionClick9.click();
		return action_TextHint.getText();
	}
	
	public String actHint2(){
		return action_TextHint.getAttribute("title");
	}
	
//###############################Link Action######################################
//###############################Link Appearance1#################################
	@FindBy(id="Link_appearance1_link")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(id="Link_appearance1_link01")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is AutoSize,Height is Fixed 50px
		String[] temp={"height: 50px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(id="Link_appearance1_link02")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is Fixed50px,Height is AutoSize
		String[] temp={"width: 50px"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(id="Link_appearance1_link03")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is Fixed 50px,Height is Fixed 50px
		String[] temp={"height: 50px", "width: 50px"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
	
	@FindBy(id="Link_appearance1_link04")
	private WebElement Appearance1_5;
	
	public int Appearance1_5(){//5.Width textwrap is true
		String[] temp = {"dijitLabelWrap"};
		return CSS.css_query(Appearance1_5.getAttribute("class"), temp);
	}
	
	@FindBy(id="Link_appearance1_link05")
	private WebElement Appearance1_6;
	
	public int Appearance1_6(){//6.Width textwrap is false
		String[] temp = {""};
		return CSS.css_query(Appearance1_6.getAttribute("class"), temp);
	}
//###############################Link Appearance1###############################
//###############################Link Appearance2###############################
	@FindBy(xpath=".//*[@id='Link_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='Link_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################Link Appearance2###############################


}
