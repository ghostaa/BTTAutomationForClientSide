package com.ibm.btt.allwidgets.Radio;

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

public class Radio_PageObject extends Main_Page{
	
//###############################Radio Properties##################################
	@FindBy(xpath=".//*[@id='Radio_properties_radio_Id_copy']")
	private WebElement Radio_properties_id;
	
	public String Radio_properties_id(){
		return Radio_properties_id.getAttribute("id");
	}
	
	@FindBy(id="Radio_properties_radio14")
	private WebElement Radio_properties_value;
	
	public String Radio_properties_value(){
		return Radio_properties_value.getAttribute("value");
	}
	
	@FindBy(id="Radio_properties_radio15")
	private WebElement Radio_properties_Rate;
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[3]/td[2]/label")
	private WebElement Radio_properties_RateText;
	
	public String Radio_properties_Rate(){
		return Radio_properties_RateText.getText();
	}
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[4]/td[2]/label")
	private WebElement Radio_properties_visible;
	
	public Boolean Radio_properties_visible(){
		return Radio_properties_visible.isDisplayed();
	}
	
	@FindBy(xpath=".//*[@id='Radio_properties_group']/div/div/div/div/label")
	private WebElement Radio_properties_hidden;
	
	public String Radio_properties_hidden(){
		return Radio_properties_hidden.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='Radio_properties_group01']/div/div/div/div/label")
	private WebElement Radio_properties_gone;
	
	public String Radio_properties_gone(){
		return Radio_properties_gone.getAttribute("style");
	}
	
	@FindBy(id="Radio_properties_radio17")
	private WebElement Radio_properties_disableTrue;
	
	public String Radio_properties_disableTrue(){
		return Radio_properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="Radio_properties_radio17_copy")
	private WebElement Radio_properties_disableFalse;
	
	public Boolean Radio_properties_disableFalse(){
		return Radio_properties_disableFalse.isEnabled();
	}
	
	@FindBy(id="Radio_properties_radio18")
	private WebElement Radio_properties_shortcut;
	
	public String Radio_properties_shortcut(){
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_A);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_A);
        return Radio_properties_shortcut.getAttribute("aria-checked");
	}

	@FindBy(id="Radio_properties_radio19")
	private WebElement Radio_properties_readonlyTrue;
	
	public String Radio_properties_readonlyTrue(){
		return Radio_properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="Radio_properties_radio19_copy")
	private WebElement Radio_properties_readonlyFalse;
	
	public Boolean Radio_properties_readonlyFalse(){
		Radio_properties_readonlyFalse.click();
		return Radio_properties_readonlyFalse.isSelected();
	}
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[12]/td[2]/label")
	private WebElement Radio_properties_hint;
	
	public String Radio_properties_hint(){
		return Radio_properties_hint.getAttribute("title");
	}
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[13]/td[2]/label")
	private WebElement Radio_properties_NLSHint;
	
	public String Radio_properties_NLShint(){
		return Radio_properties_NLSHint.getAttribute("title");
	}
	
	@FindBy(id="Radio_properties_radio24")
	private WebElement Radio_properties_tabIndex1;
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[14]/td[3]/div")
	private WebElement Radio_properties_tabIndex1Focus;
	
	public String Radio_properties_tabIndex1(){
		return Radio_properties_tabIndex1.getAttribute("tabindex");
	}
	
	public int Radio_properties_tabIndex1Focus(){
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_properties_tabIndex1Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_properties_radio25")
	private WebElement Radio_properties_tabIndex2;
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[14]/td[4]/div")
	private WebElement Radio_properties_tabIndex2Focus;
	
	public String Radio_properties_tabIndex2(){
		return Radio_properties_tabIndex2.getAttribute("tabindex");
	}
	
	public int Radio_properties_tabIndex2Focus(){
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_properties_tabIndex2Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_properties_radio21")
	private WebElement Radio_properties_tabIndex3;
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[14]/td[2]/div")
	private WebElement Radio_properties_tabIndex3Focus;
	
	public String Radio_properties_tabIndex3(){
		return Radio_properties_tabIndex3.getAttribute("tabindex");
	}
	
	public int Radio_properties_tabIndex3Focus(){
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_properties_tabIndex3Focus.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='Radio_properties_form']/table/tbody/tr[15]/td[2]/label")
	private WebElement Radio_properties_NLS;
	
	public String Radio_properties_NLS(){
		return Radio_properties_NLS.getText();
	}

//###############################Radio Properties##################################
//###############################Radio CSS#########################################
	@FindBy(xpath=".//*[@id='Radio_css_form']/div/div[1]/div[2]/label")
	private WebElement Radio_css_style1;
	
	public String Radio_css_style1_getAttribute(){
		return Radio_css_style1.getAttribute("class");
	}
	
	@FindBy(xpath=".//*[@id='Radio_css_form']/div/div[2]/div[2]/label")
	private WebElement Radio_css_style2;
	
	public String Radio_css_style2_getAttribute(){
		return Radio_css_style2.getAttribute("class");
	}
	
	@FindBy(xpath=".//*[@id='Radio_css_form']/div/div[3]/div[2]/label")
	private WebElement Radio_css_style3;
	
	public String Radio_css_style3_getAttribute(){
		return Radio_css_style3.getAttribute("class");
	}
	
	@FindBy(xpath=".//*[@id='Radio_css_form']/div/div[4]/div[2]/label")
	private WebElement Radio_css_style4;
	
	public String Radio_css_style4_getAttribute(){
		return Radio_css_style4.getAttribute("class");
	}
//###############################Radio CSS#########################################
//###############################Radio Event#######################################
	@FindBy(id="Radio_Event_radio_onClick")
	private WebElement Radio_Event_radio_onClick;
	
	@FindBy(xpath=".//*[@id='Radio_Event_form']/table/tbody/tr[1]/td[3]/div")
	private WebElement Radio_Event_Radio_Focus;
	
	public int Radio_Event_radio_onClick(){
		Radio_Event_radio_onClick.click();
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_Event_Radio_Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_Event_radio_onKeyDown")
	private WebElement Radio_Event_radio_onKeyDown;
	
	@FindBy(xpath=".//*[@id='Radio_Event_form']/table/tbody/tr[2]/td[3]/label")
	private WebElement Radio_Event_radio_Text;
	
	public String Radio_Event_radio_onKeyDown(){
		Radio_Event_radio_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return Radio_Event_radio_Text.getText();
	}

	@FindBy(id="Radio_Event_radio_onKeypress")
	private WebElement Radio_Event_radio_onKeypress;
	
	@FindBy(id="Radio_Event_radio_visibility")
	private WebElement Radio_Event_radio_visibility;
	
	public Boolean Radio_Event_radio_onKeypress(){
		Radio_Event_radio_onKeypress.click();
		Main_Class.keyPress(KeyEvent.VK_6);
		Main_Class.keyRelease(KeyEvent.VK_6);
		return Radio_Event_radio_visibility.isDisplayed();
	}
	
	@FindBy(id="Radio_Event_radio_onKeyUp")
	private WebElement Radio_Event_radio_onKeyUp;
	
	@FindBy(id="Radio_Event_radio_disabled")
	private WebElement Radio_Event_radio_disabled;
	
	public Boolean Radio_Event_radio_onKeyUp(){
		Radio_Event_radio_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return Radio_Event_radio_disabled.isEnabled();
	}
	
	@FindBy(id="Radio_Event_radio_onMouseDown")
	private WebElement Radio_Event_radio_onMouseDown;
	
	@FindBy(id="Radio_Event_radio_readOnly")
	private WebElement Radio_Event_radio_readOnly;
	
	public String Radio_Event_radio_onMouseDown(){
		Radio_Event_radio_onMouseDown.click();
		return Radio_Event_radio_readOnly.getAttribute("readonly");
	}
	
	@FindBy(id="Radio_Event_radio_onMouseUp")
	private WebElement Radio_Event_radio_onMouseUp;
	
	@FindBy(id="Radio_Event_radio_isChecked ")
	private WebElement Radio_Event_radio_isChecked ;
	
	public String Radio_Event_radio_onMouseUp(){
		Radio_Event_radio_onMouseUp.click();
		return Radio_Event_radio_isChecked .getAttribute("aria-checked");
	}
	
	@FindBy(id="Radio_Event_radio_onMouseEnter")
	private WebElement Radio_Event_radio_onMouseEnter;
	
	@FindBy(id="Radio_Event_radio_hint")
	private WebElement Radio_Event_radio_hint;
	
	public String Radio_Event_radio_onMouseEnter(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Radio_Event_radio_onMouseEnter");
		return Radio_Event_radio_hint.getAttribute("title");
	}
	
	@FindBy(id="Radio_Event_radio_onMouseLeave")
	private WebElement Radio_Event_radio_onMouseLeave;
	
	@FindBy(xpath=".//*[@id='Radio_Event_form']/table/tbody/tr[8]/td[3]/label")
	private WebElement Radio_Event_radio_addClass;
	
	public int Radio_Event_radio_onMouseLeave(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Radio_Event_radio_onMouseLeave");
		main_class.widget_moveToElement("Radio_Event_radio_addClass");
		String[] temp = {"grid_titlebg"};
		int num = CSS.css_query(Radio_Event_radio_addClass.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="Radio_Event_radio_onMouseMove")
	private WebElement Radio_Event_radio_onMouseMove;
	
	@FindBy(xpath=".//*[@id='Radio_Event_form']/table/tbody/tr[9]/td[3]/label")
	private WebElement Radio_Event_radio_invokeActionGroup;
	
	public String Radio_Event_radio_onMouseMove(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Radio_Event_radio_onMouseMove");
		return Radio_Event_radio_invokeActionGroup.getText();
	}
	
	@FindBy(id="Radio_Event_radio_onChange")
	private WebElement Radio_Event_radio_onChange;
	
	@FindBy(id="Radio_Event_radio_inlineScript")
	private WebElement Radio_Event_radio_inlineScript;
	
	public String Radio_Event_radio_onChange(){
		Radio_Event_radio_onChange.click();
		return Radio_Event_radio_inlineScript.getAttribute("disabled");
	}
	
//###############################Radio Event#######################################
//###############################Radio Condition###################################
	@FindBy(id="Radio_Condition_radio_onClick")
	private WebElement Radio_Condition_radio_isFocusable;
	
	@FindBy(xpath=".//*[@id='Radio_Condition_form']/table/tbody/tr[1]/td[3]/div")
	private WebElement Radio_Condition_Radio_Focus;
	
	public int Radio_Condition_radio_isFocusable(){
		Radio_Condition_radio_isFocusable.click();
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_Condition_Radio_Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_Condition_radio_onKeyDown")
	private WebElement Radio_Condition_radio_isChecked;
	
	@FindBy(xpath=".//*[@id='Radio_Condition_form']/table/tbody/tr[2]/td[3]/label")
	private WebElement Radio_Condition_radio_Text;
	
	public String Radio_Condition_radio_isChecked(){
		Radio_Condition_radio_isChecked.click();
		return Radio_Condition_radio_Text.getText();
	}

	@FindBy(id="Radio_Condition_radio_onKeypress")
	private WebElement Radio_Condition_radio_readOnly;
	
	@FindBy(id="Radio_Condition_radio_visibility")
	private WebElement Radio_Condition_radio_visibility;
	
	public Boolean Radio_Condition_radio_readOnly(){
		Radio_Condition_radio_readOnly.click();
		return Radio_Condition_radio_visibility.isDisplayed();
	}
	
	@FindBy(id="Radio_Condition_radio_onKeyUp")
	private WebElement Radio_Condition_radio_disabledClick;
	
	@FindBy(id="Radio_Condition_radio_disabled")
	private WebElement Radio_Condition_radio_disabled;
	
	public Boolean Radio_Condition_radio_disabled(){
		Radio_Condition_radio_disabledClick.click();
		return Radio_Condition_radio_disabled.isEnabled();
	}
	
	@FindBy(id="Radio_Condition_radio_onMouseDown")
	private WebElement Radio_Condition_Expression_id;
	
	@FindBy(id="Radio_Condition_radio_readOnly")
	private WebElement Radio_Condition_Expression_readOnly;
	
	public String Radio_Condition_Expression_id(){
		Radio_Condition_Expression_id.click();
		return Radio_Condition_Expression_readOnly.getAttribute("disabled");
	}
	
	@FindBy(id="Radio_Condition_radio_Expression")
	private WebElement Radio_Condition_Expression_text;
	
	@FindBy(xpath=".//*[@id='Radio_Condition_form']/table/tbody/tr[6]/td[3]/label")
	private WebElement Radio_Condition_Radio_styleClass;
	
	public int Radio_Condition_Expression_text(){
		Radio_Condition_Expression_text.click();
		String[] temp = {"channelSummaryListDate"};
		int num = CSS.css_query(Radio_Condition_Radio_styleClass.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="Radio_Condition_radio_onMouseUp")
	private WebElement Radio_Condition_Expression_visibility;
	
	@FindBy(id="Radio_Condition_radio_isChecked ")
	private WebElement Radio_Condition_Expression_isChecked;
	
	public Boolean Radio_Condition_Expression_visibility(){
		Radio_Condition_Expression_visibility.click();
		return Radio_Condition_Expression_isChecked.isSelected();
	}
	
	@FindBy(id="Radio_Condition_radio_onMouseEnter")
	private WebElement Radio_Condition_Expression_disabled;
	
	@FindBy(id="Radio_Condition_radio_hint")
	private WebElement Radio_Condition_radio_hint;
	
	public String Radio_Condition_Expression_disabled(){
		Radio_Condition_Expression_disabled.click();
		return Radio_Condition_radio_hint.getAttribute("title");
	}
	
	@FindBy(id="Radio_Condition_radio_onMouseLeave")
	private WebElement Radio_Expression_readOnly;
	
	@FindBy(xpath=".//*[@id='Radio_Condition_form']/table/tbody/tr[9]/td[3]/label")
	private WebElement Radio_Condition_radio_addClass;
	
	public int Radio_Condition_Expression_readOnly(){
		Radio_Expression_readOnly.click();
		String[] temp = {"channelSummaryListDate"};
		return CSS.css_query(Radio_Condition_radio_addClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_Condition_radio_onMouseMove")
	private WebElement Radio_Expression_isChecked;
	
	@FindBy(id="Radio_Condition_radio_invokeActionGroup")
	private WebElement Radio_Condition_radio_invokeActionGroup;
	
	@FindBy(xpath=".//*[@id='Radio_Condition_form']/table/tbody/tr[10]/td[3]/div")
	private WebElement Radio_Expression_focus;
	
	public int Radio_Expression_isChecked(){
		Radio_Condition_radio_invokeActionGroup.click();
		Radio_Expression_isChecked.click();
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_Expression_focus.getAttribute("class"), temp); 
	}
	
	@FindBy(id="Radio_Condition_radio")
	private WebElement Radio_Condition_Expression_isFocusable;
	
	@FindBy(xpath=".//*[@id='Radio_Condition_form']/table/tbody/tr[11]/td[2]/div")
	private WebElement Radio_Condition_Expression_focus;
	
	@FindBy(id="Radio_Condition_radio01")
	private WebElement Radio_Condition_Expression_radio01;

	public Boolean Radio_Condition_Expression_isFocusable(){
		Radio_Condition_Expression_isFocusable.click();
		return Radio_Condition_Expression_radio01.isSelected();
	}
	
	public int Radio_Condition_Expression_focus(){
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_Condition_Expression_focus.getAttribute("class"), temp);
	}

//###############################Radio Condition###################################
//###############################Radio Action######################################
	@FindBy(id="Radio_Action_radio_onClick")
	private WebElement Radio_Action_radio_onClick;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[1]/td[3]/div")
	private WebElement Radio_Action_Radio_Focus;
	
	public int Radio_Action_Radio_Focus(){
		Radio_Action_radio_onClick.click();
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_Action_Radio_Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_Action_radio_Expression")
	private WebElement Radio_Action_radio_Expression;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[2]/td[3]/label")
	private WebElement Radio_Action_Radio_styleClass;
	
	public int Radio_Action_Radio_styleClass(){
		Radio_Action_radio_Expression.click();
		String[] temp = {"BTN"};
		int num = CSS.css_query(Radio_Action_Radio_styleClass.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="Radio_Action_radio_onKeyDown")
	private WebElement Radio_Action_radio_onKeyDown;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[3]/td[3]/label")
	private WebElement Radio_Action_radio_Text;
	
	public String Radio_Action_radio_Text(){
		Radio_Action_radio_onKeyDown.click();
		return Radio_Action_radio_Text.getText();
	}
	
	@FindBy(id="Radio_Action_radio_onChange_copy_copy")
	private WebElement Radio_Action_radio_onChange_copy_copy;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[4]/td[3]/label")
	private WebElement Radio_Action_radio_visible;
	
	public String Radio_Action_radio_visible(){
		Radio_Action_radio_onChange_copy_copy.click();
		return Radio_Action_radio_visible.getAttribute("style");
	}
	
	@FindBy(id="Radio_Action_radio_onKeypress")
	private WebElement Radio_Action_radio_onKeypress;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[5]/td[3]/label")
	private WebElement Radio_Action_radio_gone;
	
	public String Radio_Action_radio_gone(){
		Radio_Action_radio_onKeypress.click();
		return Radio_Action_radio_gone.getAttribute("style");
	}
	
	@FindBy(id="Radio_Action_radio_onChange_copy")
	private WebElement Radio_Action_radio_hidden_click;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[6]/td[3]/label")
	private WebElement Radio_Action_radio_hidden;
	
	public String Radio_Action_radio_hidden_click(){
		Radio_Action_radio_hidden_click.click();
		return Radio_Action_radio_hidden.getAttribute("style");
	}
	
	@FindBy(id="Radio_Action_radio_onKeyUp")
	private WebElement Radio_Action_radio_onKeyUp;
	
	@FindBy(id="Radio_Action_radio_disabled")
	private WebElement Radio_Action_radio_disabled;
	
	public Boolean Radio_Action_radio_disabled(){
		Radio_Action_radio_onKeyUp.click();
		return Radio_Action_radio_disabled.isEnabled();
	}
	
	@FindBy(id="Radio_Action_radio_onChange")
	private WebElement Radio_Action_radio_onChange;
	
	@FindBy(id="Radio_Action_radio_dis")
	private WebElement Radio_Action_radio_dis;
	
	public String Radio_Action_radio_dis(){
		Radio_Action_radio_onChange.click();
		return Radio_Action_radio_dis.getAttribute("disabled");
	}
	
	@FindBy(id="Radio_Action_radio_onMouseDown")
	private WebElement Radio_Action_radio_onMouseDown;
	
	@FindBy(id="Radio_Action_radio_readOnly")
	private WebElement Radio_Action_radio_readOnly;
	
	public String Radio_Action_radio_readOnly(){
		Radio_Action_radio_onMouseDown.click();
		return Radio_Action_radio_readOnly.getAttribute("readonly");
	}
	
	@FindBy(id="Radio_Action_radio_onMouseMove")
	private WebElement Radio_Action_radio_onMouseMove;
	
	@FindBy(id="Radio_Action_radio_invokeActionGroup")
	private WebElement Radio_Action_radio_invokeActionGroup;
	
	public Boolean Radio_Action_radio_invokeActionGroup(){
		String str = "true";
		if (str.equals(Radio_Action_radio_invokeActionGroup.getAttribute("readonly"))){
			Radio_Action_radio_onMouseMove.click();
			return Radio_Action_radio_invokeActionGroup.isEnabled();
		}else
			return false;
	}
	
	@FindBy(id="Radio_Action_radio_onMouseUp")
	private WebElement Radio_Action_radio_onMouseUp;
	
	@FindBy(id="Radio_Action_radio_isChecked ")
	private WebElement Radio_Action_radio_isChecked;
	
	public String Radio_Action_radio_isChecked(){
		Radio_Action_radio_onMouseUp.click();
		return Radio_Action_radio_isChecked.getAttribute("aria-checked");
	}
	
	@FindBy(id="Radio_Action_radio_onMouseLeave")
	private WebElement Radio_Action_radio_onMouseLeave;
	
	@FindBy(id="Radio_Action_radio_addClass")
	private WebElement Radio_Action_radio_unCheck;
	
	public Boolean Radio_Action_radio_unCheck(){
		Radio_Action_radio_unCheck.click();
		Radio_Action_radio_onMouseLeave.click();
		return Radio_Action_radio_unCheck.isSelected();
	}
	
	@FindBy(id="Radio_Action_radio_onMouseEnter")
	private WebElement Radio_Action_radio_onMouseEnter;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[13]/td[3]/label")
	private WebElement Radio_Action_radio_hint;
	
	public String Radio_Action_radio_hint(){
		Radio_Action_radio_onMouseEnter.click();
		return Radio_Action_radio_hint.getAttribute("title");
	}
	
	@FindBy(id="Radio_Action_radio")
	private WebElement Radio_Action_radio;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[14]/td[2]/label")
	private WebElement Radio_Action_radio_styleClass;
	
	public int Radio_Action_radio_styleClass(){
		Radio_Action_radio.click();
		String[] temp = {"channelSummaryListDate", "dijitFocusedLabel"};
		return CSS.css_query(Radio_Action_radio_styleClass.getAttribute("class"), temp);
	}
//###############################Radio Action######################################
//###############################Radio Submit######################################
	
//###############################Radio Submit######################################

}
