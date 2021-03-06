package com.ibm.btt.allwidgets.Radio;

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
	
	public int Radio_properties_hidden(){
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(Radio_properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='Radio_properties_group01']/div/div/div/div/label")
	private WebElement Radio_properties_gone;
	
	public int Radio_properties_gone(){
		String[] temp={"display: none"};
		return Appearance.appearance_query(Radio_properties_gone.getAttribute("style"), temp);
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
		Main_Class.executeCombinationKey(Keys.SHIFT,Keys.ALT,"a");
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
	AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
	
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
		AllWidgetsProjectMain_Class.keyPress(KeyEvent.VK_6);
		AllWidgetsProjectMain_Class.keyRelease(KeyEvent.VK_6);
		return Radio_Event_radio_visibility.isDisplayed();
	}
	
	@FindBy(id="Radio_Event_radio_onKeyUp")
	private WebElement Radio_Event_radio_onKeyUp;
	
	@FindBy(id="Radio_Event_radio_disabled")
	private WebElement Radio_Event_radio_disabled;
	
	public Boolean Radio_Event_radio_onKeyUp(){
		Radio_Event_radio_onKeyUp.click();
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
		main_class.rightClick();
		return Radio_Event_radio_isChecked .getAttribute("aria-checked");
	}
	
	@FindBy(id="Radio_Event_radio_onMouseEnter")
	private WebElement Radio_Event_radio_onMouseEnter;
	
	@FindBy(id="Radio_Event_radio_hint")
	private WebElement Radio_Event_radio_hint;
	
	public String Radio_Event_radio_onMouseEnter(){
		main_class.widget_moveToElement("Radio_Event_radio_onMouseEnter");
		return Radio_Event_radio_hint.getAttribute("title");
	}
	
	@FindBy(id="Radio_Event_radio_onMouseLeave")
	private WebElement Radio_Event_radio_onMouseLeave;
	
	@FindBy(xpath=".//*[@id='Radio_Event_form']/table/tbody/tr[8]/td[3]/label")
	private WebElement Radio_Event_radio_addClass;
	
	public int Radio_Event_radio_onMouseLeave(){
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
	
	public Boolean Radio_Action_radio_visible(){
		Radio_Action_radio_onChange_copy_copy.click();
		return Radio_Action_radio_visible.isDisplayed();
	}
	
	@FindBy(id="Radio_Action_radio_onKeypress")
	private WebElement Radio_Action_radio_onKeypress;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[5]/td[3]/label")
	private WebElement Radio_Action_radio_gone;
	
	public int Radio_Action_radio_gone(){
		Radio_Action_radio_onKeypress.click();
		String[] temp={"display: none"};
		return Appearance.appearance_query(Radio_Action_radio_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="Radio_Action_radio_onChange_copy")
	private WebElement Radio_Action_radio_hidden_click;
	
	@FindBy(xpath=".//*[@id='Radio_Action_form']/table/tbody/tr[6]/td[3]/label")
	private WebElement Radio_Action_radio_hidden;
	
	public int Radio_Action_radio_hidden_click(){
		Radio_Action_radio_hidden_click.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(Radio_Action_radio_hidden.getAttribute("style"), temp);
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
	//###########################Radio Appearance1#################################
	@FindBy(xpath=".//*[@id='Radio_appearance1_form']/div/div[1]/div[2]/label")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance1_form']/div/div[2]/div[2]/label")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is AutoSize,Height is Fixed 50px
		String[] temp={"height: 50px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance1_form']/div/div[3]/div[2]/label")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is Fixed 100px,Height is AutoSize
		String[] temp={"width: 100px"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance1_form']/div/div[4]/div[2]/label")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is Fixed 100px,Height is Fixed 50px
		String[] temp={"width: 100px", "height: 50px"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance1_form']/div/div[5]/div[2]/label")
	private WebElement Appearance1_5;
	
	public int Appearance1_5(){//5.Width textwrap is true
		String[] temp = {"dijitLabelWrap"};
		return CSS.css_query(Appearance1_5.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance1_form']/div/div[6]/div[2]/label")
	private WebElement Appearance1_6;
	
	public int Appearance1_6(){//6.Width textwrap is false
		String[] temp = {"dijitLabelWrap"};
		return CSS.css_query(Appearance1_6.getAttribute("class"), temp);
	}
//###############################Radio Appearance1###############################
//###############################Radio Appearance2###############################
	@FindBy(xpath=".//*[@id='Radio_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='Radio_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################Radio Appearance2#################################
//###############################Radio Submit######################################
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement sub_tooltipVerify;
	
	@FindBy(id="Radio_submit_radio")
	private WebElement sub_String;
	
	@FindBy(id="Radio_submit_radio22")
	private WebElement sub_RadioString;
	
	@FindBy(id="Radio_submit_button")
	private WebElement sub_Button;
	
	@FindBy(id="Radio_submit_button01")
	private WebElement sub_with_no_data;
	
	@FindBy(id="Radio_submit_button02")
	private WebElement sub_without_validation;
	
	public String subTooltipVerify(){
		sub_String.click();
		return sub_tooltipVerify.getText();
	}
	
	public Boolean subTooltipDisappear() throws InterruptedException{
		sub_RadioString.click();
		Thread.sleep(2000);
		return sub_tooltipVerify.isDisplayed();
	}
	
	public Boolean subButton(){
		return sub_Button.isEnabled();
	}
	
	public void subClick(){
		sub_Button.click();
	}
	
	public void NodataClick(){
		sub_with_no_data.click();
	}
	
	@FindBy(id="Radio_submit_radio04")
	private WebElement sub_Date;
	
	@FindBy(id="Radio_submit_radio01")
	private WebElement sub_Currency;
	
	@FindBy(id="Radio_submit_radio02")
	private WebElement sub_Number;
	
	@FindBy(id="Radio_submit_radio03")
	private WebElement sub_Boolean;
	
	@FindBy(id="Radio_submit_radio07")
	private WebElement sub_Byte;
	
	@FindBy(id="Radio_submit_radio23")
	private WebElement sub_Short;
	
	@FindBy(id="Radio_submit_radio08")
	private WebElement sub_Integer;
	
	@FindBy(id="Radio_submit_radio09")
	private WebElement sub_Long;
	
	@FindBy(id="Radio_submit_radio10")
	private WebElement sub_Float;
	
	@FindBy(id="Radio_submit_radio11")
	private WebElement sub_Double;
	
	@FindBy(id="Radio_submit_radio12")
	private WebElement sub_BigInteger;
	
	@FindBy(id="Radio_submit_radio13")
	private WebElement sub_BigDecimal;
	
	public void submit(){
		sub_Date.click();
		sub_Currency.click();
		sub_Number.click();
		sub_Boolean.click();
		sub_Byte.click();
		sub_Short.click();
		sub_Integer.click();
		sub_Long.click();
		sub_Float.click();
		sub_Double.click();
		sub_BigInteger.click();
		sub_BigDecimal.click();
	}
	
	public void selectString_Data(){
		sub_String.click();
		sub_without_validation.click();
	}
	//resutls page
	@FindBy(id="ShowRadio_result_radio")
	private WebElement subResult_String1;
	
	@FindBy(id="ShowRadio_result_radio22")
	private WebElement subResult_String2;
	
	@FindBy(id="ShowRadio_result_label")
	private WebElement subResult_label1;
	
	public Boolean subResultString1(){
		return subResult_String1.isSelected();
	}
	
	public Boolean subResultString2(){
		return subResult_String2.isSelected();
	}
	
	public String subResultText1(){
		return subResult_label1.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio04")
	private WebElement subResult_Date1;
	
	@FindBy(id="ShowRadio_result_radio05")
	private WebElement subResult_Date2;
	
	@FindBy(id="ShowRadio_result_label01")
	private WebElement subResult_label2;
	
	public Boolean subResultDate1(){
		return subResult_Date1.isSelected();
	}
	
	public Boolean subResultDate2(){
		return subResult_Date2.isSelected();
	}
	
	public String subResultText2(){
		return subResult_label2.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio01")
	private WebElement subResult_Currency1;
	
	@FindBy(id="ShowRadio_result_radio01_copy")
	private WebElement subResult_Currency2;
	
	@FindBy(id="ShowRadio_result_label02")
	private WebElement subResult_label3;
	
	public Boolean subResultCurrency1(){
		return subResult_Currency1.isSelected();
	}
	
	public Boolean subResultCurrency2(){
		return subResult_Currency2.isSelected();
	}
	
	public String subResultText3(){
		return subResult_label3.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio02")
	private WebElement subResult_Number1;
	
	@FindBy(id="ShowRadio_result_radio02_copy")
	private WebElement subResult_Number2;
	
	@FindBy(id="ShowRadio_result_label03")
	private WebElement subResult_label4;
	
	public Boolean subResultNumber1(){
		return subResult_Number1.isSelected();
	}
	
	public Boolean subResultNumber2(){
		return subResult_Number2.isSelected();
	}
	
	public String subResultText4(){
		return subResult_label4.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio03")
	private WebElement subResult_Boolean1;
	
	@FindBy(id="ShowRadio_result_radio03_copy")
	private WebElement subResult_Boolean2;
	
	@FindBy(id="ShowRadio_result_label04")
	private WebElement subResult_label5;
	
	public Boolean subResultBoolean1(){
		return subResult_Boolean1.isSelected();
	}
	
	public Boolean subResultBoolean2(){
		return subResult_Boolean2.isSelected();
	}
	
	public String subResultText5(){
		return subResult_label5.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio07")
	private WebElement subResult_Byte1;
	
	@FindBy(id="ShowRadio_result_radio07_copy")
	private WebElement subResult_Byte2;
	
	@FindBy(id="ShowRadio_result_label08")
	private WebElement subResult_label6;
	
	public Boolean subResultByte1(){
		return subResult_Byte1.isSelected();
	}
	
	public Boolean subResultByte2(){
		return subResult_Byte2.isSelected();
	}
	
	public String subResultText6(){
		return subResult_label6.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio23")
	private WebElement subResult_Short1;
	
	@FindBy(id="ShowRadio_result_radio23_copy")
	private WebElement subResult_Short2;
	
	@FindBy(id="ShowRadio_result_label09")
	private WebElement subResult_label7;
	
	public Boolean subResultShort1(){
		return subResult_Short1.isSelected();
	}
	
	public Boolean subResultShort2(){
		return subResult_Short2.isSelected();
	}
	
	public String subResultText7(){
		return subResult_label7.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio08")
	private WebElement subResult_Integer1;
	
	@FindBy(id="ShowRadio_result_radio08_copy")
	private WebElement subResult_Integer2;
	
	@FindBy(id="ShowRadio_result_label10")
	private WebElement subResult_label8;
	
	public Boolean subResultInteger1(){
		return subResult_Integer1.isSelected();
	}
	
	public Boolean subResultInteger2(){
		return subResult_Integer2.isSelected();
	}
	
	public String subResultText8(){
		return subResult_label8.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio09")
	private WebElement subResult_Long1;
	
	@FindBy(id="ShowRadio_result_radio09_copy")
	private WebElement subResult_Long2;
	
	@FindBy(id="ShowRadio_result_label11")
	private WebElement subResult_label9;
	
	public Boolean subResultLong1(){
		return subResult_Long1.isSelected();
	}
	
	public Boolean subResultLong2(){
		return subResult_Long2.isSelected();
	}
	
	public String subResultText9(){
		return subResult_label9.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio10")
	private WebElement subResult_Float1;
	
	@FindBy(id="ShowRadio_result_radio10_copy")
	private WebElement subResult_Float2;
	
	@FindBy(id="ShowRadio_result_label12")
	private WebElement subResult_label10;
	
	public Boolean subResultFloat1(){
		return subResult_Float1.isSelected();
	}
	
	public Boolean subResultFloat2(){
		return subResult_Float2.isSelected();
	}
	
	public String subResultText10(){
		return subResult_label10.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio11")
	private WebElement subResult_Double1;
	
	@FindBy(id="ShowRadio_result_radio11_copy")
	private WebElement subResult_Double2;
	
	@FindBy(id="ShowRadio_result_label13")
	private WebElement subResult_label11;
	
	public Boolean subResultDouble1(){
		return subResult_Double1.isSelected();
	}
	
	public Boolean subResultDouble2(){
		return subResult_Double2.isSelected();
	}
	
	public String subResultText11(){
		return subResult_label11.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio12")
	private WebElement subResult_BigInteger1;
	
	@FindBy(id="ShowRadio_result_radio12_copy")
	private WebElement subResult_BigInteger2;
	
	@FindBy(id="ShowRadio_result_label14")
	private WebElement subResult_label12;
	
	public Boolean subResultBigInteger1(){
		return subResult_BigInteger1.isSelected();
	}
	
	public Boolean subResultBigInteger2(){
		return subResult_BigInteger2.isSelected();
	}
	
	public String subResultText12(){
		return subResult_label12.getText();
	}
	
	@FindBy(id="ShowRadio_result_radio13")
	private WebElement subResult_BigDecimal1;
	
	@FindBy(id="ShowRadio_result_radio13_copy")
	private WebElement subResult_BigDecimal2;
	
	@FindBy(id="ShowRadio_result_label15")
	private WebElement subResult_label13;
	
	public Boolean subResultBigDecimal1(){
		return subResult_BigDecimal1.isSelected();
	}
	
	public Boolean subResultBigDecimal2(){
		return subResult_BigDecimal2.isSelected();
	}
	
	public String subResultText13(){
		return subResult_label13.getText();
	}
//###############################Radio Submit######################################
//###############################Radio ECA#########################################
	
	@FindBy(id="Radio_ECA_radio_onClick")
	private WebElement Radio_ECA_radio_onClick;
	
	@FindBy(xpath=".//*[@id='Radio_ECA_form']/div/div[1]/div[3]/div")
	private WebElement Radio_ECA_Radio_Focus;
	
	public int Radio_ECA_radio_onClick(){
		Radio_ECA_radio_onClick.click();
		String[] temp = {"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Radio_ECA_Radio_Focus.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_ECA_radio_Expression")
	private WebElement Radio_ECA_radio_Expression;
	
	@FindBy(xpath=".//*[@id='Radio_ECA_form']/div/div[2]/div[3]/label")
	private WebElement Radio_ECA_radio_styleClass;
	
	public int Radio_ECA_radio_Expression(){
		Radio_ECA_radio_Expression.click();
		String[] temp = {"BTN"};
		return CSS.css_query(Radio_ECA_radio_styleClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="Radio_ECA_radio_onKeyDown")
	private WebElement Radio_ECA_radio_onKeyDown;
	
	@FindBy(xpath=".//*[@id='Radio_ECA_form']/div/div[3]/div[3]/label")
	private WebElement Radio_ECA_radio_Text;
	
	public String Radio_ECA_radio_onKeyDown(){
		Radio_ECA_radio_onKeyDown.click();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return Radio_ECA_radio_Text.getText();
	}

	@FindBy(id="Radio_ECA_radio_onKeypress")
	private WebElement Radio_ECA_radio_onKeypress;
	
	@FindBy(id="Radio_ECA_radio_visibility")
	private WebElement Radio_ECA_radio_visibility;
	
	public Boolean Radio_ECA_radio_onKeypress(){
		Radio_ECA_radio_onKeypress.click();
		AllWidgetsProjectMain_Class.keyPress(KeyEvent.VK_6);
		AllWidgetsProjectMain_Class.keyRelease(KeyEvent.VK_6);
		return Radio_ECA_radio_visibility.isDisplayed();
	}
	
	@FindBy(id="Radio_ECA_radio_onKeyUp")
	private WebElement Radio_ECA_radio_onKeyUp;
	
	@FindBy(id="Radio_ECA_radio_disabled")
	private WebElement Radio_ECA_radio_disabled;
	
	public Boolean Radio_ECA_radio_onKeyUp(){
		Radio_ECA_radio_onKeyUp.click();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return Radio_ECA_radio_disabled.isEnabled();
	}
	
	@FindBy(id="Radio_ECA_radio_onMouseDown")
	private WebElement Radio_ECA_radio_onMouseDown;
	
	@FindBy(id="Radio_ECA_radio_readOnly")
	private WebElement Radio_ECA_radio_readOnly;
	
	public String Radio_ECA_radio_onMouseDown(){
		Radio_ECA_radio_onMouseDown.click();
		return Radio_ECA_radio_readOnly.getAttribute("readonly");
	}
	
	@FindBy(id="Radio_ECA_radio_onMouseUp")
	private WebElement Radio_ECA_radio_onMouseUp;
	
	@FindBy(id="Radio_ECA_radio_isChecked ")
	private WebElement Radio_ECA_radio_isChecked ;
	
	public String Radio_ECA_radio_onMouseUp(){
		Radio_ECA_radio_onMouseUp.click();
		main_class.rightClick();
		return Radio_ECA_radio_isChecked .getAttribute("aria-checked");
	}
	
	@FindBy(id="Radio_ECA_radio_onMouseEnter")
	private WebElement Radio_ECA_radio_onMouseEnter;
	
	@FindBy(id="Radio_ECA_radio_hint")
	private WebElement Radio_ECA_radio_hint;
	
	public String Radio_ECA_radio_onMouseEnter(){
		main_class.widget_moveToElement("Radio_ECA_radio_onMouseEnter");
		return Radio_ECA_radio_hint.getAttribute("title");
	}
	
	@FindBy(id="Radio_ECA_radio_onMouseLeave")
	private WebElement Radio_ECA_radio_onMouseLeave;
	
	@FindBy(xpath=".//*[@id='Radio_ECA_form']/div/div[9]/div[3]/label")
	private WebElement Radio_ECA_radio_addClass;
	
	public int Radio_ECA_radio_onMouseLeave(){
		main_class.widget_moveToElement("Radio_ECA_radio_onMouseLeave");
		main_class.widget_moveToElement("Radio_ECA_radio_addClass");
		String[] temp = {"grid_titlebg"};
		int num = CSS.css_query(Radio_ECA_radio_addClass.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="Radio_ECA_radio_onMouseMove")
	private WebElement Radio_ECA_radio_onMouseMove;
	
	@FindBy(xpath=".//*[@id='Radio_ECA_form']/div/div[10]/div[3]/label")
	private WebElement Radio_ECA_radio_invokeActionGroup;
	
	public String Radio_ECA_radio_onMouseMove(){
		main_class.widget_moveToElement("Radio_ECA_radio_onMouseMove");
		return Radio_ECA_radio_invokeActionGroup.getText();
	}
	
	@FindBy(id="Radio_ECA_radio_onChange")
	private WebElement Radio_ECA_radio_onChange;
	
	@FindBy(id="Radio_ECA_radio_inlineScript")
	private WebElement Radio_ECA_radio_inlineScript;
	
	public String Radio_ECA_radio_onChange(){
		Radio_ECA_radio_onChange.click();
		return Radio_ECA_radio_inlineScript.getAttribute("disabled");
	}
//###############################Radio ECA#########################################

}
