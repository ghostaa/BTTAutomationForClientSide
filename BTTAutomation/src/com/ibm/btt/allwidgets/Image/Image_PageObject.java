package com.ibm.btt.allwidgets.Image;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.allwidgets.Main_Page;
import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;

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
	
	public int Image_properties_hidden(){
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(Image_properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_properties_image01")
	private WebElement Image_properties_gone;
	
	public int Image_properties_gone(){
		String[] temp={"display: none"};
		return Appearance.appearance_query(Image_properties_gone.getAttribute("style"), temp);
	}
//html not support image disabled properties	
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
	
	@FindBy(id="Image_properties_image06")
	private WebElement propertiesTargetBlank;//target = _blank
	
	@FindBy(id="index_link13")
	private WebElement propertiesTargetPage;
	
	public String proTargetBlank(){
		propertiesTargetBlank.click();
		return AllWidgetsProjectMain_Class.switchWindow();
	}
	
	@FindBy(id="Image_properties_image08")
	private WebElement propertiesTargetSelf;//target = _self
	
	public String propertiesTargetSelf(){
		propertiesTargetSelf.click();
		return propertiesTargetPage.getText();
	}
	
	@FindBy(id="Image_properties_image09")
	private WebElement propertiesTargetParent;//target = _parent
	
	public String propertiesTargetParent(){
		propertiesTargetParent.click();
		return propertiesTargetPage.getText();
	}
	
	@FindBy(id="Image_properties_image10")
	private WebElement propertiesTargetTop;//target = _top
	
	public String propertiesTargetTop(){
		propertiesTargetTop.click();
		return propertiesTargetPage.getText();
	}
	
	@FindBy(id="Image_properties_image07")
	private WebElement propertiesPageName;//extraparams : pageName = Image_css.jsp
	
	public Boolean propertiesPageName(){
		propertiesPageName.click();
		return ((Main_Class.getCurrentURL()).indexOf("Image_css.jsp") > -1);
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
		return AllWidgetsProjectMain_Class.widget_isFocus("Image_properties_image05");
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
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Image_event_image05");
		return Image_event_onMouseEnter_label.getText();
	}
	
	@FindBy(id="Image_event_image06")
	private WebElement Image_event_onMouseLeave;
	
	@FindBy(id="Image_event_label20")
	private WebElement Image_event_onMouseLeave_label;
	
	public String Image_event_onMouseLeave(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Image_event_image06");
		main_class.widget_moveToElement("Image_event_label20");
		return Image_event_onMouseLeave_label.getText();
	}
	
	@FindBy(id="Image_event_image07")
	private WebElement Image_event_onMouseMove;
	
	@FindBy(id="Image_event_label21")
	private WebElement Image_event_onMouseMove_label;
	
	public String Image_event_onMouseMove(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
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
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Image_condition_image02");
		return Image_condition_disabledTrue_label.getAttribute("value");
	}
	
	@FindBy(id="Image_condition_image01")
	private WebElement Image_condition_disabledFalse;
	
	@FindBy(id="Image_condition_label07")
	private WebElement Image_condition_disabledFalse_label;
	
	public String Image_condition_disabledFalse(){
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
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
	
	@FindBy(id="Image_action_image04")
	private WebElement action_target;
	
	@FindBy(id="Image_action_text05")
	private WebElement action_targetText;
	
	public Boolean actTarget(){
		action_target.click();
		return AllWidgetsProjectMain_Class.getCurrentURL().indexOf("index.jsp")>-1;
	}
	
	public String actTargetText(){
		action_targetText.click();
		return action_targetText.getAttribute("value");
	}
	
	public Boolean actTargetImage(){
		action_target.click();
		AllWidgetsProjectMain_Class.switchWindow();
		return AllWidgetsProjectMain_Class.getCurrentURL().indexOf("index.jsp")>-1;
	}
	
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
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={"visibility: inherit"};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image01")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is AutoSize,Height is Fixed 50px
		String[] temp={"height: 50px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image05")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is AutoSize,Height is Relative 50 percent
		String[] temp={"height: 50%"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image08")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is AutoSize,Height is Fill
		String[] temp={"height: 100%"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image02")
	private WebElement Appearance1_5;
	
	public int Appearance1_5(){//5.Width is Fixed50px,Height is AutoSize
		String[] temp={"width: 50px"};
		return Appearance.appearance_query(Appearance1_5.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image03")
	private WebElement Appearance1_6;
	
	public int Appearance1_6(){//6.Width is Fixed 50px,Height is Fixed 50px
		String[] temp={"width: 50px", "height: 50px"};
		return Appearance.appearance_query(Appearance1_6.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image11")
	private WebElement Appearance1_7;
	
	public int Appearance1_7(){//7.Width is Fixed 50px,Height is Relative 50 percent
		String[] temp={"width: 50px", "height: 50%"};
		return Appearance.appearance_query(Appearance1_7.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image11_copy")
	private WebElement Appearance1_8;
	
	public int Appearance1_8(){//8.Width is Fixed 50px,Height is Fill
		String[] temp={"width: 50px", "height: 100%"};
		return Appearance.appearance_query(Appearance1_8.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image04")
	private WebElement Appearance1_9;
	
	public int Appearance1_9(){//9.Width is Relative 50 percent,Height is AutoSize
		String[] temp={"width: 50%"};
		return Appearance.appearance_query(Appearance1_9.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image04_copy")
	private WebElement Appearance1_10;
	
	public int Appearance1_10(){//10.Width is Relative 50 percent,Height is Fixed 50 px
		String[] temp={"width: 50%", "height: 50px"};
		return Appearance.appearance_query(Appearance1_10.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image06")
	private WebElement Appearance1_11;
	
	public int Appearance1_11(){//11.Width is Relative 50 percent,Height is Relative 50 percent
		String[] temp={"width: 50%", "height: 50%"};
		return Appearance.appearance_query(Appearance1_11.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image06_copy")
	private WebElement Appearance1_12;
	
	public int Appearance1_12(){//12.Width is Relative 50 percent,Height is Fill
		String[] temp={"width: 50%","height: 100%"};
		return Appearance.appearance_query(Appearance1_12.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image07")
	private WebElement Appearance1_13;
	
	public int Appearance1_13(){//13.Width is Fill,Height is AutoSize
		String[] temp={"width: 100%"};
		return Appearance.appearance_query(Appearance1_13.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image07_copy")
	private WebElement Appearance1_14;
	
	public int Appearance1_14(){//14.Width is Fill,Height is Fixed 50 px
		String[] temp={"width: 100%", "height: 50px"};
		return Appearance.appearance_query(Appearance1_14.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image07_copy01")
	private WebElement Appearance1_15;
	
	public int Appearance1_15(){//15.Width is Fill,Height is Relative 50%
		String[] temp={"width: 100%", "height: 50%"};
		return Appearance.appearance_query(Appearance1_15.getAttribute("style"), temp);
	}
	
	@FindBy(id="Image_appearance1_image09")
	private WebElement Appearance1_16;
	
	public int Appearance1_16(){//16.Width is Fill,Height is Fill
		String[] temp={"width: 100%", "height: 100%"};
		return Appearance.appearance_query(Appearance1_16.getAttribute("style"), temp);
	}
//###############################Image Appearance1###############################
//###############################Image Appearance2###############################
	@FindBy(xpath=".//*[@id='Image_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='Image_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################Image Appearance2###############################

}
