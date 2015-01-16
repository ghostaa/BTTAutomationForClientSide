package com.ibm.btt.allwidgets.Image;

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

public class Image_PageObject extends Main_Page{
	
//###############################Image Properties##################################
	@FindBy(xpath=".//*[@id='Image_properties_Image_id']")
	private WebElement Image_properties_id;
	
	public String Image_properties_id_getId(){
		return Image_properties_id.getAttribute("id");
	}
	
	@FindBy(id="Image_properties_Image_id1")
	private WebElement Image_properties_dataNamefromImage_Data;
	
	public String Image_properties_dataNamefromImage_Data(){
		return Image_properties_dataNamefromImage_Data.getAttribute("src");
	}
	
	@FindBy(id="Image_properties_Image_id2")
	private WebElement Image_properties_Location;
	
	public String Image_properties_Location(){
		return Image_properties_Location.getAttribute("src");
	}
	
	@FindBy(id="Image_properties_image12")
	private WebElement Image_properties_visible;
	
	public Boolean Image_properties_visible(){
		return Image_properties_visible.isDisplayed();
	}
	
	@FindBy(id="Image_properties_image02")
	private WebElement Image_properties_hidden;
	
	public Boolean Image_properties_hidden(){
		return Image_properties_hidden.isDisplayed();
	}
	
	@FindBy(id="Image_properties_image01")
	private WebElement Image_properties_gone;
	
	public String Image_properties_gone(){
		return Image_properties_gone.getAttribute("style");
	}
	
	@FindBy(id="Image_properties_image")
	private WebElement Image_properties_disableTrue;
	
	public String Image_properties_disableTrue(){
		return Image_properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="Image_properties_image11")
	private WebElement Image_properties_disableFalse;
	
	public String Image_properties_disableFalse(){
		return Image_properties_disableFalse.getAttribute("disabled");
	}
	
	@FindBy(id="Image_properties_image03")
	private WebElement Image_properties_alt;
	
	public String Image_properties_alt(){
		return Image_properties_alt.getAttribute("alt");
	}
	
	@FindBy(id="Image_properties_image04")
	private WebElement Image_properties_hint;
	
	public String Image_properties_hint(){
		return Image_properties_hint.getAttribute("title");
	}
	
	@FindBy(id="Image_properties_image05")
	private WebElement Image_properties_tapIndex;
	
	public String Image_properties_tapIndex(){
		return Image_properties_tapIndex.getAttribute("tabindex");
	}
	public Boolean Image_properties_isfocus(){
		return Main_Class.widget_isFocus("Image_properties_image05", "id", "img:focus");
	}
//###############################Image Properties##################################
//###############################Image CSS#########################################
	@FindBy(id="Image_css_image")
	private WebElement Image_css_style1;
	
	public String Image_css_style1_getAttribute(){
		return Image_css_style1.getAttribute("class");
	}
	
	@FindBy(id="Image_css_image01")
	private WebElement Image_css_style2;
	
	public String Image_css_style2_getAttribute(){
		return Image_css_style2.getAttribute("class");
	}
	
	@FindBy(id="Image_css_image02")
	private WebElement Image_css_style3;
	
	public String Image_css_style3_getAttribute(){
		return Image_css_style3.getAttribute("class");
	}
	
	@FindBy(id="Image_css_image04")
	private WebElement Image_css_style4;
	
	public String Image_css_style4_getAttribute(){
		return Image_css_style4.getAttribute("class");
	}
//###############################Image CSS#########################################
//###############################Image Event#######################################
	@FindBy(id="Image_event_image")
	private WebElement Image_event_onclick;
	
	@FindBy(id="Image_event_link")
	private WebElement Image_event_onclick_link;
	
	public String Image_event_onclick(){
		Image_event_onclick.click();
		return Image_event_onclick_link.getText();
	}
	
	@FindBy(id="Image_event_image01")
	private WebElement Image_event_onFocus;
	
	@FindBy(id="Image_event_label02")
	private WebElement Image_event_onFocus_label;
	
	public String Image_event_onFocus(){
		Image_event_onFocus.click();
		return Image_event_onFocus_label.getText();
	}

	@FindBy(id="Image_event_image02")
	private WebElement Image_event_onBlur;
	
	@FindBy(id="Image_event_label06")
	private WebElement Image_event_onBlur_label;
	
	public String Image_event_onBlur(){
		Image_event_onBlur.click();
		Image_event_onFocus.click();
		return Image_event_onBlur_label.getText();
	}
	
	@FindBy(id="Image_event_image03")
	private WebElement Image_event_onMouseDown;
	
	@FindBy(id="Image_event_label13")
	private WebElement Image_event_onMouseDown_label;
	
	public String Image_event_onMouseDown(){
		Image_event_onMouseDown.click();
		return Image_event_onMouseDown_label.getText();
	}
	
	@FindBy(id="Image_event_image04")
	private WebElement Image_event_onMouseUp;
	
	@FindBy(id="Image_event_label18")
	private WebElement Image_event_onMouseUp_label;
	
	public String Image_event_onMouseUp(){
		Image_event_onMouseUp.click();
		return Image_event_onMouseUp_label.getText();
	}
	
	@FindBy(id="Image_event_image05")
	private WebElement Image_event_onMouseEnter;
	
	@FindBy(id="Image_event_label19")
	private WebElement Image_event_onMouseEnter_label;
	
	public String Image_event_onMouseEnter(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_event_image05");
		return Image_event_onMouseEnter_label.getText();
	}
	
	@FindBy(id="Image_event_image06")
	private WebElement Image_event_onMouseLeave;
	
	@FindBy(id="Image_event_label20")
	private WebElement Image_event_onMouseLeave_label;
	
	public String Image_event_onMouseLeave(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_event_image06");
		main_class.widget_moveToElement("Image_event_label20");
		return Image_event_onMouseLeave_label.getText();
	}
	
	@FindBy(id="Image_event_image07")
	private WebElement Image_event_onMouseMove;
	
	@FindBy(id="Image_event_label21")
	private WebElement Image_event_onMouseMove_label;
	
	public String Image_event_onMouseMove(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_event_image07");
		return Image_event_onMouseMove_label.getText();
	}
	
//###############################Image Event#######################################
//###############################Image Condition###################################
	@FindBy(id="Image_condition_image")
	private WebElement Image_condition_isFocusable;
	
	@FindBy(id="Image_condition_label04")
	private WebElement Image_condition_isFocusable_label;
	
	public String Image_condition_isFocusable(){
		Image_condition_isFocusable.click();
		return Image_condition_isFocusable_label.getText();
	}
	
	@FindBy(id="Image_condition_image02")
	private WebElement Image_condition_disabledTrue;
	
	@FindBy(id="Image_condition_text")
	private WebElement Image_condition_disabledTrue_label;
	
	public String Image_condition_disabledTrue(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_condition_image02");
		return Image_condition_disabledTrue_label.getAttribute("value");
	}
	
	@FindBy(id="Image_condition_image01")
	private WebElement Image_condition_disabledFalse;
	
	@FindBy(id="Image_condition_label07")
	private WebElement Image_condition_disabledFalse_label;
	
	public String Image_condition_disabledFalse(){
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Image_condition_image01");
		return Image_condition_disabledFalse_label.getText();
	}
	
	@FindBy(id="Image_condition_image03")
	private WebElement Image_condition_Constant;
	
	@FindBy(id="Image_condition_label17")
	private WebElement Image_condition_Constant_label;
	
	public String Image_condition_Constant(){
		Image_condition_Constant.click();
		return Image_condition_Constant_label.getText();
	}
	
	@FindBy(id="Image_condition_image04")
	private WebElement Image_condition_Constant02;
	
	@FindBy(id="Image_condition_label21")
	private WebElement Image_condition_Constant02_label;
	
	public String Image_condition_Constant02(){
		Image_condition_Constant02.click();
		return Image_condition_Constant02_label.getText();
	}
	
	@FindBy(id="Image_condition_image05")
	private WebElement Image_Expression_isFocusable;
	
	@FindBy(id="Image_condition_label25")
	private WebElement Image_Expression_isFocusable_label;
	
	public String Image_Expression_isFocusable(){
		Image_Expression_isFocusable.click();
		return Image_Expression_isFocusable_label.getText();
	}
	
	@FindBy(id="Image_condition_image06")
	private WebElement Image_Expression_id;
	
	@FindBy(id="Image_condition_label29")
	private WebElement Image_Expression_id_label;
	
	public String Image_Expression_id(){
		Image_Expression_id.click();
		return Image_Expression_id_label.getText();
	}
	
	@FindBy(id="Image_condition_image07")
	private WebElement Image_Expression_location;
	
	@FindBy(id="Image_condition_label36")
	private WebElement Image_Expression_location_label;
	
	public String Image_Expression_location(){
		Image_Expression_location.click();
		return Image_Expression_location_label.getText();
	}
	
	@FindBy(id="Image_condition_image08")
	private WebElement Image_Expression_visibility;
	
	@FindBy(id="Image_condition_label38")
	private WebElement Image_Expression_visibility_label;
	
	public Boolean Image_Expression_visibility(){
		Image_Expression_visibility.click();
		return Image_Expression_visibility_label.isDisplayed();
	}
	
	@FindBy(id="Image_condition_image09")
	private WebElement Image_Expression_disbaleFalse;
	
	@FindBy(id="Image_condition_label40")
	private WebElement Image_Expression_disbaleFalse_label;
	
	public String Image_Expression_disbaleFalse(){
		Image_Expression_disbaleFalse.click();
		return Image_Expression_disbaleFalse_label.getText();
	}
	
	@FindBy(id="Image_condition_image10")
	private WebElement Image_Expression_target;
	
	@FindBy(id="Image_condition_label42")
	private WebElement Image_Expression_target_label;
	
	public String Image_Expression_target(){
		Image_Expression_target.click();
		return Image_Expression_target_label.getText();
	}
	
	@FindBy(id="Image_condition_image11")
	private WebElement Image_Expression_tabIndex;
	
	@FindBy(id="Image_condition_label44")
	private WebElement Image_Expression_tabIndex_label;
	
	public String Image_Expression_tabIndex(){
		Image_Expression_tabIndex.click();
		return Image_Expression_tabIndex_label.getText();
	}
	
//###############################Image Condition###################################
//###############################Image Action######################################
	@FindBy(id="Image_action_image")
	private WebElement Image_Action_focus;
	
	@FindBy(id="Image_action_text")
	private WebElement Image_Action_focus_text;
	
	public String Image_Action_focus_getValue(){
		Image_Action_focus_text.click();
		return Image_Action_focus_text.getAttribute("value");
	}
	
	@FindBy(id="Image_action_image01")
	private WebElement Image_Action_styleClass;
	
	@FindBy(id="Image_action_text01")
	private WebElement Image_Action_styleClass_text;
	
	public int Image_Action_styleClass(){
		Image_Action_styleClass_text.click();
		String[] temp = {"commonStyle"};
		int num = CSS.css_query(Image_Action_styleClass.getAttribute("class"), temp);
		return num;
	}
	
	@FindBy(id="Image_action_image08")
	private WebElement Image_Action_location;
	
	@FindBy(id="Image_action_text02")
	private WebElement Image_Action_location_text;
	
	public String Image_Action_location(){
		Image_Action_location_text.click();
		return Image_Action_location.getAttribute("src");
	}
	
	@FindBy(id="Image_action_image02")
	private WebElement Image_Action_visibility;
	
	@FindBy(id="Image_action_text03")
	private WebElement Image_Action_visibility_text;
	
	public Boolean Image_Action_visibility(){
		Image_Action_visibility_text.click();
		return Image_Action_visibility.isDisplayed();
	}
	
	@FindBy(id="Image_action_image03")
	private WebElement Image_Action_disabled;
	
	@FindBy(id="Image_action_text04")
	private WebElement Image_Action_disabled_text;
	
	public String Image_Action_disabled(){
		Image_Action_disabled_text.click();
		return Image_Action_disabled_text.getAttribute("value");
	}
	
	/*@FindBy(id="Image_action_image04")
	private WebElement Image_Action_target;
	
	@FindBy(id="Image_action_text05")
	private WebElement Image_Action_target_text;
	
	public Boolean Image_Action_target(){
	}*/
	
	@FindBy(id="Image_action_image06")
	private WebElement Image_Action_alt;
	
	@FindBy(id="Image_action_text07")
	private WebElement Image_Action_alt_text;
	
	public String Image_Action_alt(){
		Image_Action_alt_text.click();
		return Image_Action_alt.getAttribute("alt");
	}
	
	public String Image_Action_alt_getvalue(){
		return Image_Action_alt_text.getAttribute("value");
	}
	
	@FindBy(id="Image_action_image07")
	private WebElement Image_Action_hint;
	
	@FindBy(id="Image_action_text08")
	private WebElement Image_Action_hint_text;
	
	public String Image_Action_hint(){
		Image_Action_hint_text.click();
		return Image_Action_hint.getAttribute("title");
	}
	
	@FindBy(id="Image_action_image05")
	private WebElement Image_Action_actionGroup;
	
	@FindBy(id="Image_action_text06")
	private WebElement Image_Action_actionGroup_text;
	
	public Boolean Image_Action_actionGroup(){
		Image_Action_actionGroup_text.click();
		return Image_Action_actionGroup.isDisplayed();
	}
//###############################Image Action######################################
//###############################Image ActionTab###################################
	@FindBy(id="Image_actionTab_image")
	private WebElement actionTab_newFlow;
	
	@FindBy(id="Image_main_link04")
	private WebElement actionTab_mainPage;
	
	public String actTabNewFlow(){//Launch New Flow
		actionTab_newFlow.click();
		return actionTab_mainPage.getText();
	}
	
	@FindBy(id="Image_actionTab_image01")
	private WebElement actionTab_changeFlow;
	
	@FindBy(id="index_tabbedPane_tablist_index_ContentPane02")
	private WebElement actionTab_index;
	
	public String actTabChangeFlow(){//Change Flow Event
		actionTab_changeFlow.click();
		return actionTab_index.getText();
	}
	
	@FindBy(id="Image_actionTab_image01")
	private WebElement actionTab_Operation;
	
	@FindBy(id="index_tabbedPane_tablist_index_ContentPane02")
	private WebElement actionTab_index1;
	
	public String actTabOperation(){//Launch Operation
		actionTab_Operation.click();
		return actionTab_index1.getText();
	}
//###############################Image ActionTab###################################
//###########################Image Appearance1#####################################
	@FindBy(id="Image_appearance1_image")
	private WebElement Appearance1_1;
	
	public String Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		return Appearance1_1.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image01")
	private WebElement Appearance1_2;
	
	public String Appearance1_2(){//2.Width is AutoSize,Height is Fixed 50px
		return Appearance1_2.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image05")
	private WebElement Appearance1_3;
	
	public String Appearance1_3(){//3.Width is AutoSize,Height is Relative 50 percent
		return Appearance1_3.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image08")
	private WebElement Appearance1_4;
	
	public String Appearance1_4(){//4.Width is AutoSize,Height is Fill
		return Appearance1_4.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image02")
	private WebElement Appearance1_5;
	
	public String Appearance1_5(){//5.Width is Fixed50px,Height is AutoSize
		return Appearance1_5.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image03")
	private WebElement Appearance1_6;
	
	public String Appearance1_6(){//6.Width is Fixed 50px,Height is Fixed 50px
		return Appearance1_6.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image11")
	private WebElement Appearance1_7;
	
	public String Appearance1_7(){//7.Width is Fixed 50px,Height is Relative 50 percent
		return Appearance1_7.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image11_copy")
	private WebElement Appearance1_8;
	
	public String Appearance1_8(){//8.Width is Fixed 50px,Height is Fill
		return Appearance1_8.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image04")
	private WebElement Appearance1_9;
	
	public String Appearance1_9(){//9.Width is Relative 50 percent,Height is AutoSize
		return Appearance1_9.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image04_copy")
	private WebElement Appearance1_10;
	
	public String Appearance1_10(){//10.Width is Relative 50 percent,Height is Fixed 50 px
		return Appearance1_10.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image06")
	private WebElement Appearance1_11;
	
	public String Appearance1_11(){//11.Width is Relative 50 percent,Height is Relative 50 percent
		return Appearance1_11.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image06_copy")
	private WebElement Appearance1_12;
	
	public String Appearance1_12(){//12.Width is Relative 50 percent,Height is Fill
		return Appearance1_12.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image07")
	private WebElement Appearance1_13;
	
	public String Appearance1_13(){//13.Width is Fill,Height is AutoSize
		return Appearance1_13.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image07_copy")
	private WebElement Appearance1_14;
	
	public String Appearance1_14(){//14.Width is Fill,Height is Fixed 50 px
		return Appearance1_14.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image07_copy01")
	private WebElement Appearance1_15;
	
	public String Appearance1_15(){//15.Width is Fill,Height is Relative 50%
		return Appearance1_15.getAttribute("style");
	}
	
	@FindBy(id="Image_appearance1_image09")
	private WebElement Appearance1_16;
	
	public String Appearance1_16(){//16.Width is Fill,Height is Fill
		return Appearance1_16.getAttribute("style");
	}
//###############################Image Appearance1###############################
//###############################Image Appearance2###############################
	@FindBy(xpath=".//*[@id='Image_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance2_1.getAttribute("style");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance2_2.getAttribute("style");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance2_3.getAttribute("style");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance2_4.getAttribute("style");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance2_5.getAttribute("style");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance2_6.getAttribute("style");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance2_7.getAttribute("style");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance2_8.getAttribute("style");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance2_9.getAttribute("style");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public String Appearance2_10(){//10.horizontal indent is 50px
		return Appearance2_10.getAttribute("style");
		
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public String Appearance2_11(){//11.horizontal indent is 10percent
		return Appearance2_11.getAttribute("style");
	}
//###############################Image Appearance2###############################

}
