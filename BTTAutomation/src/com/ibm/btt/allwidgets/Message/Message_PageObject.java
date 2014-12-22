package com.ibm.btt.allwidgets.Message;

import java.awt.event.KeyEvent;

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

public class Message_PageObject extends Main_Page{
	
//###############################Message Properties##################################
//Message properties	
	@FindBy(xpath=".//*[@id='Message_properties_message01']/div[1]/span[1]")
	private WebElement properties_String;
	
	public String proString(){// String(Only String works for message widgets)
		return properties_String.getText();
	}
	
	@FindBy(id="Message_properties_message16")
	private WebElement properties_message;
	
	@FindBy(id="Message_properties_label10")
	private WebElement properties_display;
	
	@FindBy(id="Message_properties_label11")
	private WebElement properties_hidden;
	
	@FindBy(id="Message_properties_label12")
	private WebElement properties_gone;
	
	public String proDisplay(){//display message
		properties_display.click();
		return properties_message.getAttribute("style");
	}

	public String proHidden(){//set message visibility to hidden
		properties_hidden.click();
		return properties_message.getAttribute("style");
	}
	
	public String proGone(){//set message visibility to gone
		properties_gone.click();
		return properties_message.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='Message_properties_message18']/div[1]/span[1]")
	private WebElement properties_messagelevel;
	
	@FindBy(id="Message_properties_label15")
	private WebElement properties_errorlevel;
	
	@FindBy(id="Message_properties_label16")
	private WebElement properties_infolevel;
	
	@FindBy(id="Message_properties_label17")
	private WebElement properties_warnlevel;
	
	public String proErrorLevel(){//verify message with error level
		properties_errorlevel.click();
		String[] temp = {"errorMessage"};
		if (1 == CSS.css_query(properties_messagelevel.getAttribute("class"), temp)){
			return properties_messagelevel.getText();
		}else
			return "Message output error";
	}
	
	public String proInfoLevel(){//verify message with info level
		properties_infolevel.click();
		String[] temp = {"infoMessage"};
		if (1 == CSS.css_query(properties_messagelevel.getAttribute("class"), temp)){
			return properties_messagelevel.getText();
		}else
			return "Message output error";
	}
	
	public String proWarnLevel(){//verify message with warn level
		properties_warnlevel.click();
		String[] temp = {"warnMessage"};
		if (1 == CSS.css_query(properties_messagelevel.getAttribute("class"), temp)){
			return properties_messagelevel.getText();
		}else
			return "Message output error";
	}
//###############################Message Properties##################################
//###############################Message CSS#########################################
	@FindBy(id="Message_css_message")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBackgroundColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_css_message01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setFontSize", "setBackgroundColor"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_css_message02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setFontSize", "setFontStyle", "setBackgroundColor"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_css_message03")
	private WebElement css_style4;
	
	public int css_style4(){//The types of style from dojo provided
		String[] temp = {"dijitIconEditTask"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################Message CSS#########################################
//###############################Message Action######################################
//Message action	
	@FindBy(id="Message_action_label01")
	private WebElement action_display_click; //action Click here 1
	
	@FindBy(id="Message_action_message")
	private WebElement action_display;
	
	public String actDisplay(){//Message.display(String)
		action_display_click.click();
		return action_display.getAttribute("style");
	}
	
	@FindBy(id="Message_action_label02")
	private WebElement action_INFO_click;//action Click here 2
	
	@FindBy(xpath=".//*[@id='Message_action_message01']/div[1]/span[1]")
	private WebElement action_INFO;
	
	public int actINFO(){//Message.display(String,Level), Level INFO
		action_INFO_click.click();
		String[] temp = {"infoMessage"};
		return CSS.css_query(action_INFO.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_action_label03")
	private WebElement action_WARN_click; //action Click here 3
	
	@FindBy(xpath=".//*[@id='Message_action_message02']/div[1]/span[1]")
	private WebElement action_WARN;
	
	public int actWARN(){//Message.display(String,Level), Level WARN
		action_WARN_click.click();
		String[] temp = {"warnMessage"};
		return CSS.css_query(action_WARN.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_action_label04")
	private WebElement action_error_click;//action Click here 4
	
	@FindBy(xpath=".//*[@id='Message_action_message03']/div[1]/span[1]")
	private WebElement action_error;
	
	public int actError(){//Message.display(String,Level), Level error does not take action, only ERROR takes action
		action_error_click.click();
		String[] temp = {"dijitLabelBase"};
		return CSS.css_query(action_error.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_action_label05")
	private WebElement action_ERROR_click;//action Click here 5
	
	@FindBy(xpath=".//*[@id='Message_action_message04']/div[1]/span[1]")
	private WebElement action_ERROR;
	
	public int actERROR(){//Message.display(String,Level), Level ERROR
		action_ERROR_click.click();
		String[] temp = {"errorMessage"};		
		return CSS.css_query(action_ERROR.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_action_label08")
	private WebElement action_value_click;//action Click here 6
	
	@FindBy(xpath=".//*[@id='Message_action_message05']/div[1]/span[1]")
	private WebElement action_value;
	
	public String actValue(){//Message.display(String,Level,arbitrary). Test value first parameter.Change value to GOLD from NLS
		action_value_click.click();
		return action_value.getText();
	}
	
	@FindBy(id="Message_action_label09")
	private WebElement action_popupString_click;//action Click here 7
	
	@FindBy(id="Message_action_message06messagePopup_title")
	private WebElement action_popupString_titleBar;
	
	@FindBy(xpath=".//*[@id='Message_action_message06messagePopup']/div[2]/span")
	private WebElement action_popupString_containerNode;
	
	@FindBy(xpath=".//*[@id='Message_action_message06messagePopup']/div[1]/span[2]")
	private WebElement action_popupString_cancel;
	
	public String actPopupString_title(){
		action_popupString_click.click();
		return action_popupString_titleBar.getText();
	}
	
	public String actPopString(){//Test successfully, message.displayPopup(String), String is widgets property
		return action_popupString_containerNode.getText();
	}
	
	public void actPopStringCancel(){
		action_popupString_cancel.click();
	}
	
	@FindBy(id="Message_action_label10")
	private WebElement action_popup_level_click; //action Click here 8
	
	@FindBy(xpath=".//*[@id='Message_action_message07messagePopup']/div[2]/span")
	private WebElement action_popup_level;
	
	@FindBy(xpath=".//*[@id='Message_action_message07messagePopup']/div[1]/span[2]")
	private WebElement action_popup_level_cancel;
	
	public String actPopLevel(){//Message.displayPopup(String,Level)
		action_popup_level_click.click();
		return action_popup_level.getText();
	}
	
	public void actPopLevelCancel(){
		action_popup_level_cancel.click();
	}
	
	@FindBy(id="Message_action_label11")
	private WebElement action_popupValueClick;//action Click here 9
	
	@FindBy(xpath=".//*[@id='Message_action_message08messagePopup']/div[2]/span")
	private WebElement action_popupValue;
	
	@FindBy(xpath=".//*[@id='Message_action_message08messagePopup']/div[1]/span[2]")
	private WebElement action_popupValueCancel;
	
	public String actPopupValue(){//Message.displayPopup(String, level,arbitrary), test value [test]Change value to GOLD from NLS
		action_popupValueClick.click();
		return action_popupValue.getText();
	}
	
	public void actPopupValueCancel(){
		action_popupValueCancel.click();
	}
	
	@FindBy(id="Message_action_label16")
	private WebElement action_openMessage; //action Click here 11
	
	@FindBy(id="Message_action_label12")
	private WebElement action_closeMessage;//action Click here 10
	
	@FindBy(id="Message_action_message09")
	private WebElement action_messageStatus;
	
	public Boolean actOpenMessage(){
		action_openMessage.click();
		return action_messageStatus.isDisplayed();
	}
	
	public Boolean actCloseMessage(){
		action_closeMessage.click();
		return action_messageStatus.isDisplayed();
	}
//Message action group
	@FindBy(id="Message_action_label19")
	private WebElement action_group;//action Click here 12
	
	@FindBy(id="Message_action_message10")
	private WebElement action_message;
	
	@FindBy(xpath=".//*[@id='Message_action_message11messagePopup']/div[2]/span")
	private WebElement action_dialog;
	
	@FindBy(xpath=".//*[@id='Message_action_message11messagePopup']/div[1]/span[2]")
	private WebElement action_dialog_cancel;
	
	public Boolean actGroup(){
		action_group.click();
		return action_message.isDisplayed(); //show message
	}
	
	public Boolean actDialog(){
		return action_dialog.isDisplayed();//popup dialog
	}
	
	public void actDialogCancel(){ //cancel dialog
		action_dialog_cancel.click();
	}
//Message action(widget property)
	@FindBy(id="Message_action_label21")
	private WebElement action_displayClick1;//action Click here 13
	
	@FindBy(id="Message_action_message12")
	private WebElement action_displayStyle;
	
	public Boolean actDisplayStyle(){//Display message and change styleclass
		action_displayClick1.click();
		return action_displayStyle.isDisplayed();
	}
	 public int actStyle(){
		 String[] temp = {"labelStyle"};
		 return CSS.css_query(action_displayStyle.getAttribute("class"), temp);
	 }
	 
	@FindBy(id="Message_action_label23")
	private WebElement action_displayClick2;//action Click here 14
		
	@FindBy(id="Message_action_message13")
	private WebElement action_displayvisible;
		
	public Boolean actDisplayVisible(){ //Display message and visibility is visible
		action_displayClick2.click();
		return action_displayvisible.isDisplayed();
	}
	
	@FindBy(id="Message_action_label25")
	private WebElement action_displayClick3;//action Click here 15
		
	@FindBy(id="Message_action_message14")
	private WebElement action_displayhidden;
		
	public String actDisplayHidden(){ //Display message and visibility is hidden. Message is shown with hiden status 
		action_displayClick3.click();
		return action_displayhidden.getAttribute("style");
	}
	
	@FindBy(id="Message_action_label26")
	private WebElement action_displayClick4;//action Click here 16
		
	@FindBy(id="Message_action_message15")
	private WebElement action_displaygone;
		
	public String actDisplayGone(){ //Display message and visibility is shown with gone status. 
		action_displayClick4.click();
		return action_displaygone.getAttribute("style");
	}
	
	@FindBy(id="Message_action_label27")
	private WebElement action_displayClick5;//action Click here 17
		
	@FindBy(xpath=".//*[@id='Message_action_message16']/div[1]/span[1]")
	private WebElement action_displayERROR;
		
	public int actDisplayERROR(){ //Display message and level is ERROR
		action_displayClick5.click();
		String[] temp = {"errorMessage"};
		return CSS.css_query(action_displayERROR.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_action_label28")
	private WebElement action_displayClick6;//action Click here 18
		
	@FindBy(xpath=".//*[@id='Message_action_message17']/div[1]/span[1]")
	private WebElement action_displayINFO;
		
	public int actDisplayINFO(){ //Display message and level is INFO
		action_displayClick6.click();
		String[] temp = {"infoMessage"};
		return CSS.css_query(action_displayINFO.getAttribute("class"), temp);
	}
	
	@FindBy(id="Message_action_label29")
	private WebElement action_displayClick7;//action Click here 19
		
	@FindBy(xpath=".//*[@id='Message_action_message18']/div[1]/span[1]")
	private WebElement action_displayWARN;
		
	public int actDisplayWARN(){ //Display message and level is WARN
		action_displayClick7.click();
		String[] temp = {"warnMessage"};
		return CSS.css_query(action_displayWARN.getAttribute("class"), temp);
	}
//###############################Message Action######################################

}
