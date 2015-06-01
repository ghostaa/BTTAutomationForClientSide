package com.ibm.btt.allwidgets.Form;

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

public class Form_PageObject extends Main_Page{
	
//###############################Form Properties##################################
//Form properties
// 1.Form_id
	@FindBy(xpath=".//*[@id='form_properties_panel']/tbody/tr[1]/td[3]/form")
	private WebElement properties_id;
		
	public String proId(){
		return properties_id.getAttribute("id");
	}
	
// 2. validateOnSubmit = true	
	@FindBy(id="form_properties_text")
	private WebElement properties_textbox;
	
	@FindBy(id="form_properties_button")
	private WebElement properties_onSubmitT;
	
	@FindBy(id="showform_properties_text")
	private WebElement properties_textResult;
	
	public String proValidationT1(){
		return properties_onSubmitT.getAttribute("aria-disabled");
	}
	
	public String proValidationT2(){
		properties_textbox.sendKeys("aaa");
		return properties_onSubmitT.getAttribute("aria-disabled");
	}
	
	public String proValidationResult(){
		properties_onSubmitT.click();
		return properties_textResult.getAttribute("value");
	}
//3. validateOnSubmit = false	
	@FindBy(id="form_properties_button01")
	private WebElement properties_validateOnSubmit;
	
	public String properties_validateOnSubmit(){
		return properties_validateOnSubmit.getAttribute("aria-disabled");
	}
//fasTab  	error
	
//gernerrateLayout=false
	@FindBy(xpath=".//*[@id='form_properties_form04']/select")
	private WebElement properties_gernerrateLayoutF;
	
	public String proGernerrateLayoutF(){
		return properties_gernerrateLayoutF.getTagName();
	}
	
//gernerrateLayout=true	
	@FindBy(xpath=".//*[@id='form_properties_form05']/div")
	private WebElement properties_gernerrateLayoutT;
	
	public int proGernerrateLayoutT(){
		String[] temp={"BTTTableStyle"};
		return CSS.css_query(properties_gernerrateLayoutT.getAttribute("class"), temp);
	}
//gernerrateInlineStyle=true	
	@FindBy(xpath=".//*[@id='form_properties_form06']/div/div/div")
	private WebElement properties_gernerrateInlineStyleT;
	
	public int proGernerrateInlineStyleT(){//6. Test page can not click
		String[] temp = {"vertical-align: middle"};
		return Appearance.appearance_query(properties_gernerrateInlineStyleT.getAttribute("style"), temp);
	}
//gernerrateInlineStyle=false	
	@FindBy(xpath=".//*[@id='form_properties_form07']/div/div/div")
	private WebElement properties_gernerrateInlineStyleF;
	
	public int proGernerrateInlineStyleF(){//7. Test page is able to click
		String[] temp = {"vertical-align: middle"};
		return Appearance.appearance_query(properties_gernerrateInlineStyleF.getAttribute("style"), temp);
	}
	
//###############################Form Properties####################################
//###############################Form Style#########################################
	@FindBy(id="form_css_form")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBackgroundColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="form_css_form_copy")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setBorder", "setBackgroundColor"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="form_css_form_copy01")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setColor", "setBorder", "setBackgroundColor"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="form_css_form01")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"setBackgroundColor"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################Form Style#########################################
//###############################Form ECA###########################################
//Form-event
	@FindBy(id="form_ECA_link01")
	private WebElement event_FormEvent; 
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement event_onLoaded;
	
	public void eventClick(){
		event_FormEvent.click();
	}
	
	public String evtOnLoaded(){ //onLoaded  2.When page onload,the text will show 'Form onLoaded event'.
		return event_onLoaded.getText();
	}
	
	@FindBy(xpath=".//*[@id='form_event_form']/div/div/div/span")
	private WebElement event_onClick; 
	
	public int evtOnClick(){ //onClick  1.Click the button,the button will be hidden.
		event_onClick.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_onClick.getAttribute("style"), temp);
	}
	
	@FindBy(id="form_event_image")
	private WebElement event_onFocus;
	
	public String evtOnFocusBefore(){
		return event_onFocus.getAttribute("src");
	}
	
	public String evtOnFocusAfter(){//onFocus 3.Focuse the image,the image will be changed to another.
		(new AllWidgetsProjectMain_Class()).widget_moveToElement("form_event_image");
		(new AllWidgetsProjectMain_Class()).rightClick();
		Main_Class.keyPress(KeyEvent.VK_ESCAPE);
		Main_Class.keyRelease(KeyEvent.VK_ESCAPE);
		return event_onFocus.getAttribute("src");
	}
	
	@FindBy(id="form_event_radio")
	private WebElement event_onBlur; 
	
	@FindBy(id="form_event_label07")
	private WebElement event_onBlurLabel;
	
	public String evtOnBlur(){ //onBlur
		event_onBlur.click();
		event_onBlurLabel.click();
		return event_onBlur.getAttribute("aria-disabled");
	}
	
	@FindBy(id="form_event_text01")
	private WebElement event_onKeyDown; 
	
	public String evtOnKeyDown(){ //onKeyDown  5.Prush CTRL key down in text,the text will show 1234.
		event_onKeyDown.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.CONTROL);
		main_class.keyUp(Keys.CONTROL);
		return event_onKeyDown.getAttribute("value");
	}
	
	@FindBy(id="form_event_text02")
	private WebElement event_onKeyPress; 
	
	@FindBy(id="form_event_label12")
	private WebElement event_onKeyPressLabel;
	
	public String evtOnKeyPress(){ //onKeyPress  6.Press one key in text ,before text will show 'keyPress'.
		event_onKeyPress.click();;
		AllWidgetsProjectMain_Class.keyPress(KeyEvent.VK_3);
		AllWidgetsProjectMain_Class.keyRelease(KeyEvent.VK_3);
		return event_onKeyPressLabel.getText();
	}
	
	@FindBy(id="form_event_text03")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="form_event_button01")
	private WebElement event_button;
	
	public String evtOnKeyUp(){ //onKeyUp 7.Prush one key up in text,the button will be disabled.
		event_onKeyUp.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_button.getAttribute("aria-disabled");
	}
	
	@FindBy(id="form_event_button02")
	private WebElement event_onMouseDown; 
	
	public String evtOnMouseDown(){ //onMouseDown  8.When mouse down on the button ,the button will be enabled.
		event_onMouseDown.click();
		return event_onMouseDown.getAttribute("aria-disabled");
	}
	
	@FindBy(id="form_event_link")
	private WebElement event_onMouseUp; 
	
	public Boolean evtOnMouseUp(){ //onMouseUp  9.When mouse up ,the link will be disabled.
		event_onMouseUp.click();
		return event_onMouseUp.isEnabled();
	}
	
	@FindBy(id="form_event_checkBox01")
	private WebElement event_onMouseEnter; 
	
	public String evtOnMouseEnter(){ //onMouseEnter  10.When mouse enter,the checkbox will be disabled.
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("form_event_checkBox01");
		return event_onMouseEnter.getAttribute("aria-disabled");
	}
	
	@FindBy(id="form_event_text05")
	private WebElement event_onMouseLeave; 
	
	@FindBy(id="form_event_label22")
	private WebElement event_onMouseLeaveLabel;
	
	public String evtOnMouseLeave(){ //onMouseLeave 11.When mouse leave the text,the text will show 'You are successful!'.
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("form_event_text05");
		main_class.widget_moveToElement("form_event_label22");
		return event_onMouseLeave.getAttribute("value");
	}
	
	@FindBy(id="form_event_form11")
	private WebElement event_onMouseMove; 
	
	@FindBy(id="form_event_textArea")
	private WebElement event_textarea;
	
	public String evtOnMouseMove(){ //onMouseMove  12.When move the mouse over the textarea,the textare will show 'Move on the form'.
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("form_event_form11");
		return event_textarea.getAttribute("value");
	}
	
	@FindBy(id="form_event_button03")
	private WebElement event_onSubmit; 
	
	@FindBy(id="showform_ECA_text")
	private WebElement event_submitResult;
	
	public String evtOnSubmit(){ //onSubmit  13.When click submit,the label will show 'Have submitted'. 
		event_onSubmit.click();
		Main_Class.waitUntilLoadElement(20, "showform_ECA_text");
		return event_submitResult.getAttribute("value");
	}
	
	@FindBy(id="form_event_button04")
	private WebElement event_onReset; 
	
	@FindBy(id="form_event_label38")
	private WebElement event_resetLable;
	
	public String evtOnReset(){ //onReset  14.When click reset,the label will show 'reset'. 
		event_onReset.click();
		return event_resetLable.getText();
	}
	
	@FindBy(id="form_event_text07")
	private WebElement event_onValidStateChange; 
	
	@FindBy(id="form_event_button05")
	private WebElement event_changeButton;
	
	public String evtisMandatoryT(){ //onValidStateChange  true 15.Click the button,the text's isMandatory will be changed between true and false
		return event_onValidStateChange.getAttribute("aria-required");
	}
	
	public String evtisMandatoryF(){ //onValidStateChange  true 15.Click the button,the text's isMandatory will be changed between true and false.
		event_changeButton.click();
		event_changeButton.click();
		return event_onValidStateChange.getAttribute("aria-required");
	}
	
	@FindBy(id="form_event_text08")
	private WebElement event_onAsyncOK; 
	
	@FindBy(id="form_event_button06")
	private WebElement event_onAsyncOKbutton;
	
	public String evtOnAsyncOK(){ //onAsyncOK  16.Click callAsyncOp, text will show data and the button will be disabled. 
		event_onAsyncOKbutton.click();
		return event_onAsyncOK.getAttribute("value");
	}
	
	@FindBy(id="form_event_link01")
	private WebElement eventBack;
	
	public void evtBack(){
		eventBack.click();
	}
//form condition
	@FindBy(id="form_ECA_link02")
	private WebElement conditionClick;
	
	public void conditionClick(){
		conditionClick.click();
	}
//1.The form valid is true,so click the text will show 'form is validate'.
	@FindBy(id="form_condition_text")
	private WebElement condition_isValid;
	
	public String conIsValid(){
		condition_isValid.click();
		return condition_isValid.getAttribute("value");
	}
//2.The form valid is true,there is a blue fish.Or there will be a orange fish.
	@FindBy(id="form_condition_image")
	private WebElement condition_validateOnSubmitT;
	
	public String conValidateOnSubmitT(){
		return condition_validateOnSubmitT.getAttribute("src");
	}

//3.Let mouse enter text,the text will show ''form.isValid()==true''.	
	@FindBy(id="form_condition_text01")
	private WebElement condition_isValidT;
	
	public String conIsValidT(){
		(new AllWidgetsProjectMain_Class()).widget_moveToElement("form_condition_text01");
		return condition_isValidT.getAttribute("value");
	}

//	4.When current page onload,the form id will change to 'This is form03'.
	@FindBy(id="form_condition_label13")
	private WebElement condition_ExpisValidT;
	
	public String conExpIsValidT(){
		return condition_ExpisValidT.getText();
	}
//	5.If validateOnSubmit is true,click button,the button will named true,or false.
	@FindBy(xpath=".//*[@id='form_condition_button_label']/span")
	private WebElement condition_ExpvalidateOnSubmitT;
	
	public String conExpValidateOnSubmitT(){
		condition_ExpvalidateOnSubmitT.click();
		return condition_ExpvalidateOnSubmitT.getText();
	}
	
//condition	back
	@FindBy(id="form_condition_link")
	private WebElement condition_back;
	
	public void conditionBack(){
		condition_back.click();
	}
//action
	@FindBy(id="form_ECA_link03")
	private WebElement actionClick;
	
	public void actionClick(){
		actionClick.click();
	}
//1.Form validate is false,move over button,do the validate action.
	@FindBy(id="form_action_button")
	private WebElement action_validate;
	
//2.When text value changed,the data will be submitted to another page.	
	@FindBy(id="form_action_text01")
	private WebElement action_submit;
	
	@FindBy(id="form_action_label03")
	private WebElement action_submitLable;
	
	@FindBy(id="showform_ECA_text02")
	private WebElement action_submitResult;
	
	public String actSubmit(){
		action_submit.sendKeys("1234");
		action_submitLable.click();
		Main_Class.waitUntilLoadElement(20, "showform_ECA_text02");
		return action_submitResult.getAttribute("value");
	}
	
//3.Click callAsyncOperation, the data in two text will change and current page will flash in an instant.
//4.Click callAsyncOpWithMapping, the data in text will change and current page will flash in an instant.
//5.Click callAsyncOperation2, the data in two text will be changed	
//6.Click callAsyncOpWithMapping1, the data in text will change.
//7.Please input 'reset' in text,then focus on the text, reset text.
	@FindBy(id="form_action_text02")
	private WebElement action_reset;
	
	@FindBy(id="form_action_label08")
	private WebElement action_resetLable;
	
	public String actReset(){
		action_reset.sendKeys("reset");
		action_resetLable.click();
		action_reset.click();
		return action_reset.getAttribute("value");
	}
//8.Mouse move over the label, the word color will change.
	@FindBy(id="form_action_form04")
	private WebElement action_styleClass;
	
	public int actStyleClass(){
		(new AllWidgetsProjectMain_Class()).widget_moveToElement("form_action_label15");
		String[] temp={"redblue"};
		return CSS.css_query(action_styleClass.getAttribute("class"), temp);
	}
//9.Click the text,form will doesn't validate.
//###############################Form ECA#########################################
// form not support appearance
//###############################Form Appearance1#################################
	@FindBy(id="Form_appearance1_Form")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(id="Form_appearance1_Form01")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is AutoSize,Height is Fixed 50px
		String[] temp={"height: 50px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(id="Form_appearance1_Form02")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is Fixed50px,Height is AutoSize
		String[] temp={"width: 50px"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(id="Form_appearance1_Form03")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is Fixed 50px,Height is Fixed 50px
		String[] temp={"height: 50px", "width: 50px"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
	
	@FindBy(id="Form_appearance1_Form04")
	private WebElement Appearance1_5;
	
	public int Appearance1_5(){//5.Width textwrap is true
		String[] temp = {"dijitLabelWrap"};
		return CSS.css_query(Appearance1_5.getAttribute("class"), temp);
	}
	
	@FindBy(id="Form_appearance1_Form05")
	private WebElement Appearance1_6;
	
	public int Appearance1_6(){//6.Width textwrap is false
		String[] temp = {""};
		return CSS.css_query(Appearance1_6.getAttribute("class"), temp);
	}
//###############################Form Appearance1###############################
//###############################Form Appearance2###############################
	@FindBy(xpath=".//*[@id='Form_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='Form_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################Form Appearance2###############################
//###############################Form ActionTab#################################
//1.change flow event
	@FindBy(id="form_actionTab_button02")
	private WebElement changeFlowEvent;
	
	@FindBy(id="form_main_link")
	private WebElement changeFlowEventPage;
	
	public String changeFlowEvent(){
		changeFlowEvent.click();
		return changeFlowEventPage.getText();
	}
	
//2.launch new flow
	@FindBy(id="form_actionTab_button")
	private WebElement lauchNewFlow;
	
	public String lauchNewFlow(){
		lauchNewFlow.click();
		return event_FormEvent.getText();
	}
//3.launch operation
	@FindBy(id="form_actionTab_button01")
	private WebElement launchOperation;
	
	@FindBy(id="finalPage_label")
	private WebElement launchOperationLable;
	
	public String launchOperation(){
		launchOperation.click();
		return launchOperationLable.getText();
	}
//###############################Form ActionTab###################################
//###############################Form xValidation#################################
//Which color do you like? Please input the text.
	@FindBy(id="form_xValidation_text")
	private WebElement xValidationText;
	
	@FindBy(id="form_xValidation_button01")
	private WebElement xValidationButton;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement xValidationTooltip;//Input '123' in text.
	
	public String xValidationButton(){
		return xValidationButton.getAttribute("aria-disabled");
	}
	
	public String xValidationTooltip(){
		xValidationText.sendKeys("pink");
		xValidationButton.click();
		return xValidationTooltip.getText();
	}
	
	public String xValidationT(){
		xValidationText.clear();
		xValidationText.sendKeys("123");
		xValidationButton.click();
		return xValidationButton.getAttribute("aria-disabled");
	}
//###############################Form xValidation#################################


}
