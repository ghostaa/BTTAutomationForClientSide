package com.ibm.btt.allwidgets.FileUpload;

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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.allwidgets.*;

public class FileUpload_PageObject extends Main_Page{
	
//###############################FileUpload Properties##################################
	@FindBy(xpath=".//*[@id='FileUpload_properties_panel']/div[1]/div[3]/div")
	private WebElement properties_id;
	
	public String proId(){//1.Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="FileUpload_properties_fileUpload01")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility = visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="FileUpload_properties_fileUpload02")
	private WebElement properties_hidden;

	public int proHidden(){//3.  visibility = hidden
		String[] temp = {"visibility: hidden"};
		return Appearance.appearance_query(properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="FileUpload_properties_fileUpload03")
	private WebElement properties_gone;

	public int proGone(){//4.  visibility = gone
		String[] temp = {"display: none"};
		return Appearance.appearance_query(properties_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="com_ibm_btt_dijit_FileUploader_4")
	private WebElement properties_disableT;
	
	public int proDisableT(){//5. disbale=true
		String[] temp={"dojoxUploaderDisabled"};
		return CSS.css_query(properties_disableT.getAttribute("class"), temp);
	}
	
	@FindBy(id="com_ibm_btt_dijit_FileUploader_5")
	private WebElement properties_disableF;
	
	public int proDisableF(){//6. disbale=false
		String[] temp={"dojoxUploaderDisabled"};
		return CSS.css_query(properties_disableF.getAttribute("class"), temp);
	}
	
	@FindBy(id="FileUpload_properties_fileUpload06")
	private WebElement properties_hint;
	
	public String proHint(){//7.  hint 
		return properties_hint.getAttribute("title");
	}
	
//###############################FileUpload Properties##################################
//###############################FileUpload CSS#########################################
	@FindBy(id="FileUpload_css_fileUpload")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBorder"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="FileUpload_css_fileUpload01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setColor", "setBorder"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="FileUpload_css_fileUpload02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setBorder", "setColor", "setBackgroundColor"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="FileUpload_css_fileUpload03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitSplitterHHover"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################FileUpload CSS#########################################
//###############################FileUpload Event#######################################
	@FindBy(id="widget_dijit_form_TextBox_0")
	private WebElement event_fileupload1;
	
	@FindBy(id="Fileupload_event_Label1")
	private WebElement event_lable1; 
	
	public String evtUpload(){ //uploadfile
		event_fileupload1.sendKeys("C:\\Program Files\\Internet Explorer\\iexplore.exe");
		return event_lable1.getAttribute("style");
	}
	
	@FindBy(id="Tree_event_label01")
	private WebElement event_label2;
	
	@FindBy(id="Tree_event_tree01")
	private WebElement event_onFocus; 
	
	public String evtonFocus(){ //onFocus
		event_onFocus.click();
		return event_label2.getText();
	}
	
	@FindBy(id="Tree_event_tree02")
	private WebElement event_onBlur;
	
	@FindBy(id="Tree_event_label02")
	private WebElement event_label3;
	
	public String evtOnBlur(){//onBlur
		event_onBlur.click();
		event_label3.click();
		return event_label3.getText();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_7']/div[1]")
	private WebElement event_onKeyDown;
	
	@FindBy(id="Tree_event_label03")
	private WebElement event_label4;
	
	public String evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label4.getText();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_9']/div[1]")
	private WebElement event_onKeypress;
	
	@FindBy(id="Tree_event_label04")
	private WebElement event_label5;
	
	public String evtOnKeypress(){ //onKeypress
		event_onKeypress.click();
		AllWidgetsProjectMain_Class.keyPress(KeyEvent.VK_1);
		AllWidgetsProjectMain_Class.keyRelease(KeyEvent.VK_1);
		return event_label5.getText();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_11']/div[1]")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="Tree_event_label05")
	private WebElement event_label6;
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label6.getText();
	}

	@FindBy(id="Tree_event_tree06")
	private WebElement event_onMouseDown;
	
	@FindBy(id="Tree_event_label06")
	private WebElement event_label7;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();;
		return event_label7.getText();
	}
	
	@FindBy(id="Tree_event_tree07")
	private WebElement event_onMouseUp;
	
	@FindBy(id="Tree_event_label07")
	private WebElement event_label8;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_label8.getText();
	}
	
	@FindBy(id="Tree_event_tree08")
	private WebElement event_onMouseEnter; 
	
	@FindBy(id="Tree_event_label08")
	private WebElement event_label9;

	public String evtOnMouseEnter(){ //onMouseEnter
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Tree_event_tree08");
		return event_label9.getText();
	}
	
	@FindBy(id="Tree_event_tree09")
	private WebElement event_onMouseLeave; 
	
	@FindBy(id="Tree_event_label09")
	private WebElement event_label10;

	public String evtOnMouseLeave(){ //onMouseLeave
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Tree_event_tree09");
		main_class.widget_moveToElement("Tree_event_label09");
		return event_label10.getText();
	}
	
	@FindBy(id="Tree_event_tree10")
	private WebElement event_onMouseMove; 
	
	@FindBy(id="Tree_event_label10")
	private WebElement event_label11;
	
	public String evtOnMouseMove(){ //onMouseMove
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.widget_moveToElement("Tree_event_tree10");
		return event_label11.getText();
	}

//###############################FileUpload Event#######################################
//###############################FileUpload Condition###################################
	
	@FindBy(id="Fileupload_condition_label")
	private WebElement condition_label1;
	
	public String conDisableT(){//1.Widget Property =disabled=true
		condition_label1.click();
		return condition_label1.getText();
	}
	
	@FindBy(id="Fileupload_condition_label05")
	private WebElement condition_label2;
	
	public String conExpId(){//2.Expression: Widget Property = id
		condition_label2.click();
		return condition_label2.getText();
	}
	
	@FindBy(id="Fileupload_condition_label06")
	private WebElement condition_label3;
	
	public String conHidden(){//3.Expression: Widget Property = visibility =hidden
		condition_label3.click();
		return condition_label3.getText();
	}
	
	@FindBy(id="Fileupload_condition_label07")
	private WebElement condition_label4;
	
	public String conDisableF(){//4.Expression: Widget Property = disabled=false
		condition_label4.click();
		return condition_label4.getText();
	}
//###############################FileUpload Condition###################################
//###############################FileUpload Action######################################
	@FindBy(id="Fileupload_action_label05")
	private WebElement actionClick1; //action Click here 1
	
	@FindBy(id="Fileupload_action_fileUpload")
	private WebElement actSetClass;
	
	public int actSetClass(){// Set Widget Property = styleClass
		actionClick1.click();
		String[] temp={"setColor"};
		return CSS.css_query(actSetClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="Fileupload_action_label18")
	private WebElement actionClick2;//action Click 2
	
	@FindBy(id="Fileupload_action_fileUpload01")
	private WebElement actSetVisibility;
	
	public int actSetVisibility(){// 	Set Widget Property = visibility
		actionClick2.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(actSetVisibility.getAttribute("style"), temp);
	}
	
	@FindBy(id="Fileupload_action_label21")
	private WebElement actionClick3;//action Click here 3
	
	@FindBy(id="com_ibm_btt_dijit_FileUploader_2")
	private WebElement actSetDisable;
	
	public int actSetDisable(){//Set Widget Property = disabled
		actionClick3.click();
		String[] temp={"dojoxUploaderDisabled"};
		return CSS.css_query(actSetDisable.getAttribute("class"), temp);
	}
	
	@FindBy(id="Fileupload_action_label22")
	private WebElement actionClick4; //action Click here 4
	
	@FindBy(id="Fileupload_action_fileUpload03")
	private WebElement actHint;
	
	public String actHint(){//Set Widget Property = hint
		actionClick4.click();
		return actHint.getAttribute("title");
	}
	
//###############################FileUpload Action######################################
//###############################FileUpload Appearance1#################################
		@FindBy(id="FileUpload_appearance1_fileUpload")
		private WebElement Appearance1_1;
		
		public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
			String[] temp = {""};
			return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
		}
		
		@FindBy(id="FileUpload_appearance1_fileUpload01")
		private WebElement Appearance1_2;
		
		public int Appearance1_2(){//2.Width is AutoSize,Height is Fixed 150px
			String[] temp = {"width: 500px"};
			return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
		}
//###############################FileUpload Appearance1###################################
//###############################FileUpload Appearance2###################################
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[1]/div[3]")
		private WebElement Appearance2_1;
		
		public String Appearance2_1(){//1.horizontal is left,vertical is top
			String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
			String h = Appearance2_1.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[3]/div[3]")
		private WebElement Appearance2_2;
		
		public String Appearance2_2(){//2.horizontal is left,vertical is center
			String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
			String h = Appearance2_2.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[5]/div[3]")
		private WebElement Appearance2_3;
		
		public String Appearance2_3(){//3.horizontal is left,vertical is bottom
			String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
			String h = Appearance2_3.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[7]/div[3]")
		private WebElement Appearance2_4;
		
		public String Appearance2_4(){//4.horizontal is center,vertical is top
			String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
			String h = Appearance2_4.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[9]/div[3]")
		private WebElement Appearance2_5;
		
		public String Appearance2_5(){//5.horizontal is center,vertical is center
			String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
			String h = Appearance2_5.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[11]/div[3]")
		private WebElement Appearance2_6;
		
		public String Appearance2_6(){//6.horizontal is center,vertical is bottom
			String v =Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
			String h = Appearance2_6.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[13]/div[3]")
		private WebElement Appearance2_7;
		
		public String Appearance2_7(){//7.horizontal is right,vertical is top
			String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
			String h = Appearance2_7.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[15]/div[3]")
		private WebElement Appearance2_8;
		
		public String Appearance2_8(){//8.horizontal is right,vertical is center
			String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
			String h = Appearance2_8.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[17]/div[3]")
		private WebElement Appearance2_9;
		
		public String Appearance2_9(){//9.horizontal is right,vertical is bottom
			String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
			String h = Appearance2_9.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[19]/div[3]")
		private WebElement Appearance2_10;
		
		public int Appearance2_10(){//10.horizontal indent is 50px
			String[] temp = {"padding-left: 50px"};
			return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
			
		}
		
		@FindBy(xpath=".//*[@id='FileUpload_appearance2_panel']/div[21]/div[3]")
		private WebElement Appearance2_11;
		
		public int Appearance2_11(){//11.horizontal indent is 10percent
			String[] temp = {"padding-left: 10%"};
			return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
		}
//###############################FileUpload Appearance2##################################
//###############################FileUpload Submit######################################
//Must execute step 1 ,2 ,3	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo']/div[1]/input")
	private WebElement submit_click1;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo_popup0']")
	private WebElement submit_Country0;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo_popup1']")
	private WebElement submit_Country1;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement submit_StringTooltip;
	
	public String subString(){//1. Please select Country1.
		submit_click1.click();
		submit_Country0.click();
		return submit_StringTooltip.getText();
	}
	
	public void subStringClick(){//String
		submit_click1.click();
		submit_Country1.click();
	}
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo01']/div[1]/input")
	private WebElement submit_click2;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo01_popup0']")
	private WebElement submit_Date;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo02']/div[1]/input")
	private WebElement submit_click3;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo02_popup0']")
	private WebElement submit_Currency;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo03']/div[1]/input")
	private WebElement submit_click4;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo03_popup0']")
	private WebElement submit_Number;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo04']/div[1]/input")
	private WebElement submit_click5;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo04_popup0']")
	private WebElement submit_Boolean;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo05']/div[1]/input")
	private WebElement submit_click6;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo05_popup0']")
	private WebElement submit_Duration;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo06']/div[1]/input")
	private WebElement submit_click7;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo06_popup0']")
	private WebElement submit_XMLGregorianCalendar;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo07']/div[1]/input")
	private WebElement submit_click8;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo07_popup0']")
	private WebElement submit_Byte;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement submit_ByteTooltip;
	
	public String subByteTooltip(){//2. Must select one.
		return submit_ByteTooltip.getText();
	}
	
	public void subByte(){//Byte
		submit_click8.click();
		submit_Byte.click();
	}
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo08']/div[1]/input")
	private WebElement submit_click9;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo08_popup0']")
	private WebElement submit_Short;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo09']/div[1]/input")
	private WebElement submit_click10;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo09_popup0']")
	private WebElement submit_Integer;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo10']/div[1]/input")
	private WebElement submit_click11;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo10_popup0']")
	private WebElement submit_Long;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo11']/div[1]/input")
	private WebElement submit_click12;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo11_popup0']")
	private WebElement submit_Float;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo12']/div[1]/input")
	private WebElement submit_click13;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo12_popup0']")
	private WebElement submit_Double;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo13']/div[1]/input")
	private WebElement submit_click14;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo13_popup0']")
	private WebElement submit_BigInteger;
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo14']/div[1]/input")
	private WebElement submit_click15;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo14_popup0']")
	private WebElement submit_BigDecimal;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement submit_isMandatoryTooltip;
	
	@FindBy(xpath="combo_submit_combo15")
	private WebElement submit_isMandatoryT;
	
	public String subIsMandatoryTooltip(){//3. This is required.
		return submit_isMandatoryTooltip.getText();
	}
	
	public void submit_isMandatory(){
		submit_isMandatoryT.sendKeys("aaa");
	}
	
	@FindBy(xpath=".//*[@id='widget_combo_submit_combo17']/div[1]/input")
	private WebElement submit_click16;
	
	@FindBy(xpath=".//*[@id='combo_submit_combo17_popup0']")
	private WebElement submit_urlForList;

	@FindBy(id="combo_submit_button")
	private WebElement submit_button;
	
	public Boolean subButton(){
		return submit_button.isEnabled();
	}
	
	public void Submit(){
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
		submit_click16.click();
		submit_urlForList.click();
		submit_button.click();
	}
	
//submit result
	@FindBy(id="showcombo_submit_label")
	private WebElement result_String;
	
	public String resString(){
		return result_String.getText();
	}
	
	@FindBy(id="showcombo_submit_label01")
	private WebElement result_Date;
	
	public String resDate(){
		return result_Date.getText();
	}
	
	@FindBy(id="showcombo_submit_label02")
	private WebElement result_Currency;
	
	public String resCurrency(){
		return result_Currency.getText();
	}
	
	@FindBy(id="showcombo_submit_label03")
	private WebElement result_Number;
	
	public String resNumber(){
		return result_Number.getText();
	}
	
	@FindBy(id="showcombo_submit_label04")
	private WebElement result_Boolean;
	
	public String resBoolean(){
		return result_Boolean.getText();
	}
	
	@FindBy(id="showcombo_submit_label05")
	private WebElement result_Duration;
	
	public String resDuration(){
		return result_Duration.getText();
	}
	
	@FindBy(id="showcombo_submit_label06")
	private WebElement result_XMLGregorianCalendar;
	
	public String resXMLGregorianCalendar(){
		return result_XMLGregorianCalendar.getText();
	}
	
	@FindBy(id="showcombo_submit_label07")
	private WebElement result_Byte;
	
	public String resByte(){
		return result_Byte.getText();
	}
	
	@FindBy(id="showcombo_submit_label08")
	private WebElement result_Short;
	
	public String resShort(){
		return result_Short.getText();
	}
	
	@FindBy(id="showcombo_submit_label09")
	private WebElement result_Integer;
	
	public String resInteger(){
		return result_Integer.getText();
	}
	
	@FindBy(id="showcombo_submit_label10")
	private WebElement result_Long;
	
	public String resLong(){
		return result_Long.getText();
	}
	
	@FindBy(id="showcombo_submit_label13")
	private WebElement result_Float;
	
	public String resFloat(){
		return result_Float.getText();
	}
	
	@FindBy(id="showcombo_submit_label15")
	private WebElement result_Double;
	
	public String resDouble(){
		return result_Double.getText();
	}
	
	@FindBy(id="showcombo_submit_label16")
	private WebElement result_BigInteger;
	
	public String resBigInteger(){
		return result_BigInteger.getText();
	}
	
	@FindBy(id="showcombo_submit_label17")
	private WebElement result_BigDecimal;
	
	public String resBigDecimal(){
		return result_BigDecimal.getText();
	}
	
	@FindBy(id="showcombo_submit_label18")
	private WebElement result_isMandatoryT;
	
	public String resisMandatoryT(){
		return result_isMandatoryT.getText();
	}
	
	@FindBy(id="showcombo_submit_label19")
	private WebElement result_isMandatoryF;
	
	public String resisMandatoryF(){
		return result_isMandatoryF.getText();
	}
	
	@FindBy(id="showcombo_submit_label20")
	private WebElement result_urlForList;
	
	public String resurlForList(){
		return result_urlForList.getText();
	}
	
//###############################Combo Submit######################################


}
