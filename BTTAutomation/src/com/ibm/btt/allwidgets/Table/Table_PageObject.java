package com.ibm.btt.allwidgets.Table;

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

public class Table_PageObject extends Main_Page{
	
//###############################Table Properties##################################
	@FindBy(xpath=".//*[@id='Table_properties_panel']/tbody/tr[1]/td[2]/div")
	private WebElement properties_id;
	
	public String proId(){//1.Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="Table_properties_Table")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility = visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="Table_properties_Table01")
	private WebElement properties_hidden;

	public int proHidden(){//3.  visibility = hidden
		String[] temp = {"visibility: hidden"};
		return Appearance.appearance_query(properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="Table_properties_Table02")
	private WebElement properties_gone;

	public int proGone(){//4.  visibility = gone
		String[] temp = {"display: none"};
		return Appearance.appearance_query(properties_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="Table_properties_Table03")
	private WebElement properties_hint;
	
	public String proHint(){//5.  hint 
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="Table_properties_Table04")
	private WebElement properties_NLSHint;

	public String proNLSHint(){//6.  hint nls
		return properties_NLSHint.getAttribute("title");
	}
	
//###############################Table Properties##################################
//###############################Table CSS#########################################
	@FindBy(id="Table_css_Table")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBackgroundColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="Table_css_Table01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setBackgroundColor", "setBorder"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="Table_css_Table02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setBorder", "setFontStyle", "setFontWeight"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="Table_css_Table03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitSplitterHActive"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################Table CSS#########################################
//###############################Table Event#######################################
//Test Table's ECA event - group01
	@FindBy(id="Table_ECA_Event_label01")
	private WebElement event_label1;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[1]")
	private WebElement event_onClick; 
	
	public String evtOnClick(){ //onClick
		event_onClick.click();
		return event_label1.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[1]")
	private WebElement event_onKeyDown;
	
	@FindBy(id="Table_ECA_Event_label07")
	private WebElement event_label4;
	
	public String evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label4.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[1]")
	private WebElement event_onKeypress;
	
	@FindBy(id="Table_ECA_Event_label09")
	private WebElement event_label5;
	
	public String evtOnKeypress(){ //onKeypress
		event_onKeypress.click();
		Main_Class.keyPress(KeyEvent.VK_1);
		Main_Class.keyRelease(KeyEvent.VK_1);
		return event_label5.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label11")
	private WebElement event_label6;
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label6.getText();
	}
//Test Table's ECA event - group02	
	@FindBy(id="Table_ECA_Event_label03_copy")
	private WebElement event_label2;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[1]")
	private WebElement event_onFocus; 
	
	public String evtonFocus(){ //onFocus
		event_onFocus.click();
		return event_label2.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label04_copy")
	private WebElement event_onBlur;
	
	@FindBy(id="Table_ECA_Event_label05_copy")
	private WebElement event_label3;
	
	public String evtOnBlur(){//onBlur
		event_onBlur.click();
		return event_label3.getText();
	}
//Test Table's ECA event - group03
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[4]/table/tbody/tr/td[1]")
	private WebElement event_onMouseDown;
	
	@FindBy(id="Table_ECA_Event_label13_copy01")
	private WebElement event_label7;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();;
		return event_label7.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label15_copy01")
	private WebElement event_label8;
	
	public String evtOnMouseUp(){ //onMouseUp
		return event_label8.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label17_copy01")
	private WebElement event_label9;

	public String evtOnMouseEnter(){ //onMouseEnter
		return event_label9.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label20_copy01")
	private WebElement event_onMouseLeave; 
	
	@FindBy(id="Table_ECA_Event_label19_copy01")
	private WebElement event_label10;

	public String evtOnMouseLeave(){ //onMouseLeave
		event_onMouseLeave.click();
		return event_label10.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label02")
	private WebElement event_label11;
	
	public String evtOnMouseMove(){ //onMouseMove
		return event_label11.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label03")
	private WebElement event_label12;
	
	public String evtOnSelected(){ //onSelected
		return event_label12.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label04")
	private WebElement event_label13;
	
	public String evtOnRowClick(){ //onRowClick
		return event_label13.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label05")
	private WebElement event_label14;
	
	public String evtOnRowDbClick(){ //onRowDbClick
		(new Main_Class()).doubleClickByXpath(".//*[@id='dojox_grid__View_5']/div/div/div/div[4]/table/tbody/tr/td[1]");
		return event_label14.getText();
	}
//Test Table's ECA event - group04
	@FindBy(xpath=".//*[@id='dojox_grid__View_7']/div/div/div/div[5]/table/tbody/tr/td[1]")
	private WebElement event_table;
	
	@FindBy(id="Table_ECA_Event_label12")
	private WebElement event_label15;
	
	public String evtOnSelected2(){ //onSelected
		event_table.click();
		return event_label15.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label13")
	private WebElement event_label16;
	
	public String evtOnRowClick2(){ //onRowClick
		return event_label16.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label14")
	private WebElement event_label17;
	
	public String evtOnRowDbClick2(){ //onRowDbClick
		(new Main_Class()).doubleClickByXpath(".//*[@id='dojox_grid__View_7']/div/div/div/div[5]/table/tbody/tr/td[1]");
		return event_label17.getText();
	}
	
	@FindBy(id="Table_ECA_Event_label15")
	private WebElement event_label18;
	
	public String evtOnCellEdit(){ //onCellEdit
		return event_label18.getText();
	}

//###############################Table Event#######################################
//###############################Table Condition###################################
//This table's eca condition - widget function	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[1]")
	private WebElement condition_table1;
	
	@FindBy(id="Table_ECA_Condition_button")
	private WebElement condition_button1;
	
	public int conFocus(){//1.verify focus
		condition_button1.click();
		String[] temp={"dojoxGridCellFocus"};
		return CSS.css_query(condition_table1.getAttribute("class"), temp);
	}
	
	@FindBy(id="Table_ECA_Condition_button01")
	private WebElement condition_button2;
	
	@FindBy(id="Table_ECA_Condition_label03")
	private WebElement condition_focusable;
	
	public String conFocusable(){//2. focusable
		condition_button2.click();
		return condition_focusable.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_label")
	private WebElement condition_visibleT;
	
	@FindBy(id="Table_ECA_Condition_button04")
	private WebElement condition_button3;
	
	public String conVisibleT(){//3. visible true
		condition_button3.click();
		return condition_visibleT.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button03")
	private WebElement condition_button4;
	
	@FindBy(id="Table_ECA_Condition_label07")
	private WebElement condition_visibleF;
	
	public String conVisibleF(){//3. visible true
		condition_button4.click();
		return condition_visibleF.getText();
	}
//This table's eca condition - widget property
	@FindBy(id="Table_ECA_Condition_button_copy")
	private WebElement condition_button5;
	
	@FindBy(id="Table_ECA_Condition_label01_copy")
	private WebElement condition_disable;
	
	public String conDisable(){//3. disabled true
		condition_button5.click();
		return condition_disable.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button01_copy")
	private WebElement condition_button6;
	
	@FindBy(id="Table_ECA_Condition_label03_copy")
	private WebElement condition_readonly;
	
	public String conReadonly(){//3. disabled true
		condition_button6.click();
		return condition_readonly.getText();
	}
//This table's eca condition - expression - widget property
	@FindBy(id="Table_ECA_Condition_button_copy01")
	private WebElement condition_button7;
	
	@FindBy(id="Table_ECA_Condition_label01_copy01")
	private WebElement condition_id;
	
	public String conId(){
		condition_button7.click();
		return condition_id.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button01_copy01")
	private WebElement condition_button8;
	
	@FindBy(id="Table_ECA_Condition_label03_copy01")
	private WebElement condition_disableF;
	
	public String conDisableF(){
		condition_button8.click();
		return condition_disableF.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button04_copy")
	private WebElement condition_button9;
	
	@FindBy(id="Table_ECA_Condition_label_copy")
	private WebElement condition_readonlyT;
	
	public String conReadonlyT(){
		condition_button9.click();
		return condition_readonlyT.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button03_copy")
	private WebElement condition_button10;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[4]")
	private WebElement condition_colIndex;
	
	@FindBy(id="Table_ECA_Condition_label07_copy")
	private WebElement condition_lable1;
	
	public String conColIndex(){
		condition_colIndex.click();
		condition_button10.click();
		return condition_lable1.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button02")
	private WebElement condition_button11;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[3]/table/tbody/tr/td[1]")
	private WebElement condition_rowIndex;
	
	@FindBy(id="Table_ECA_Condition_label02")
	private WebElement condition_lable2;
	
	public String conRowIndex(){
		condition_rowIndex.click();
		condition_button11.click();
		return condition_lable2.getText();
	}
//This table's eca condition - widget function
	@FindBy(id="Table_ECA_Condition_button_copy02")
	private WebElement condition_button12;
	
	@FindBy(id="Table_ECA_Condition_label01_copy02")
	private WebElement condition_isFocusable;
	
	public String conIsFocusable(){
		condition_button12.click();
		return condition_isFocusable.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_7']/div/div/div/div[8]/table/tbody/tr/td[1]")
	private WebElement condition_Helen7;
	
	@FindBy(id="Table_ECA_Condition_button01_copy02")
	private WebElement condition_button13;
	
	@FindBy(id="Table_ECA_Condition_label03_copy02")
	private WebElement condition_getValueInFirstSelectedItem;
	
	public String conGetValueInFirstSelectedItem(){
		condition_Helen7.click();
		condition_button13.click();
		return condition_getValueInFirstSelectedItem.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button04_copy01")
	private WebElement condition_button14;
	
	@FindBy(id="Table_ECA_Condition_label_copy01")
	private WebElement condition_getValueInSelectedItem;
	
	public String conGetValueInSelectedItem(){
		condition_button14.click();
		return condition_getValueInSelectedItem.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button03_copy01")
	private WebElement condition_button15;
	
	@FindBy(id="Table_ECA_Condition_label07_copy01")
	private WebElement condition_visibaleF;
	
	public String conVisableF(){
		condition_button15.click();
		return condition_visibaleF.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_7']/div/div/div/div[1]/table/tbody/tr/td[1]")
	private WebElement condition_Helen0;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_7']/div/div/div/div[2]/table/tbody/tr/td[1]")
	private WebElement condition_Helen1;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_7']/div/div/div/div[3]/table/tbody/tr/td[1]")
	private WebElement condition_Helen2;
	
	@FindBy(id="Table_ECA_Condition_button05")
	private WebElement condition_button16;
	
	@FindBy(id="Table_ECA_Condition_label04")
	private WebElement condition_getLengthOfSelectedRows;
	
	public String conGetLengthOfSelectedRows(){//if 'getLengthOfSelectedRows=3', show '3 rows are selected'.
		Main_Class.keyPress(KeyEvent.VK_CONTROL);
		condition_Helen0.click();
		condition_Helen1.click();
		condition_Helen2.click();
		condition_Helen7.click();
		condition_button16.click();
		Main_Class.keyRelease(KeyEvent.VK_CONTROL);
		return condition_getLengthOfSelectedRows.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button06")
	private WebElement condition_button17;
	
	@FindBy(id="Table_ECA_Condition_label05")
	private WebElement condition_isColumnVisible;
	
	public String conIsColumnVisible(){//if isColumnVisible('columnId0')=visible, show 'correct', expected: correct
		condition_button17.click();
		return condition_isColumnVisible.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button07")
	private WebElement condition_button18;
	
	@FindBy(id="Table_ECA_Condition_label06")
	private WebElement condition_getCellValueByIndex;
	
	public String conGetCellValueByIndex(){//if getCellValueByIndex(0,1) = 'Helen1', show 'correct', expected: correct
		condition_button18.click();
		return condition_getCellValueByIndex.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button08")
	private WebElement condition_button19;
	
	@FindBy(id="Table_ECA_Condition_label08")
	private WebElement condition_getCellValuetByName;
	
	public String conGetCellValuetByName(){//if getCellValuetByName('AccountName',1) = 'Helen1', show 'correct', expected: correct
		condition_button19.click();
		return condition_getCellValuetByName.getText();
	}
	
	@FindBy(id="Table_ECA_Condition_button08_copy")
	private WebElement condition_button20;
	
	@FindBy(id="Table_ECA_Condition_label08_copy")
	private WebElement condition_getCellObjectByName;
	
	public String conGetCellObjectByName(){//if getCellObjectByName('AccountName',1) = 'Helen1', show 'correct', expected: correct
		condition_button20.click();
		return condition_getCellObjectByName.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_7']/div/div/div/div[4]/table/tbody/tr/td[1]")
	private WebElement condition_Helen3;
	
	@FindBy(id="Table_ECA_Condition_button09")
	private WebElement condition_button21;
	
	@FindBy(id="Table_ECA_Condition_label09")
	private WebElement condition_ObjectInFirstSelectedItem;
	
	public String conObjectInFirstSelectedItem(){//if get ObjectInFirstSelectedItem('AccountName')='Helen3', show 'correct'
		condition_Helen3.click();
		condition_button21.click();
		return condition_ObjectInFirstSelectedItem.getText();
	}
//###############################Table Condition###################################
//###############################Table Action######################################
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[1]")
	private WebElement actionFocus; //action Click here 1
	
	@FindBy(id="Table_ECA_Action_button")
	private WebElement actionButton1; 
	
	public int actFocus(){// Focus
		actionButton1.click();
		String[] temp={"dojoxGridCellFocus"};
		return CSS.css_query(actionFocus.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[5]/table/tbody/tr/td[1]")
	private WebElement actionHelen4;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[6]/table/tbody/tr/td[1]")
	private WebElement actionHelen5;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[7]/table/tbody/tr/td[1]")
	private WebElement actionHelen6;
	
	@FindBy(id="Table_ECA_Action_button01")
	private WebElement actionButton2;
	
	@FindBy(id="Table_ECA_Action_label03")
	private WebElement actionLable2;
	
	public String actGetLengthOfRow(){// 	click this button to get the length of the selected row, and set to this lable
		Main_Class.keyPress(KeyEvent.VK_CONTROL);
		actionHelen4.click();
		actionHelen5.click();
		actionHelen6.click();
		actionButton2.click();
		Main_Class.keyRelease(KeyEvent.VK_CONTROL);
		return actionLable2.getText();
	}
	
	@FindBy(id="Table_ECA_Action_label05")
	private WebElement actionLable3;
	
	@FindBy(id="Table_ECA_Action_button02")
	private WebElement actionButton3;
	
	public String actVisibleT(){//click this button to get if 'AccountName' column is visiable, expected: true
		actionButton3.click();
		return actionLable3.getText();
	}
	
	@FindBy(id="Table_ECA_Action_button03")
	private WebElement actionButton4; //action Click here 4
	
	@FindBy(id="Table_ECA_Action_label07")
	private WebElement actionLable4;
	
	public String actVisibleF(){//Set Widget Property : styleClass
		actionButton4.click();
		return actionLable4.getText();
	}
//###############################Table Action######################################
//###############################Table Appearance###################################
		@FindBy(xpath=".//*[@id='Table_Appearance_group']/div/div/div/div")
		private WebElement Appearance_1;
		
		public String Appearance_1(){//1.horizontal is left,vertical is top
			String v = Appearance.appearance_place(Appearance_1.getAttribute("style"), "top");
			String h = Appearance_1.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group01']/div/div/div/div")
		private WebElement Appearance_2;
		
		public String Appearance_2(){//2.horizontal is left,vertical is center
			String v = Appearance.appearance_place(Appearance_2.getAttribute("style"), "middle");
			String h = Appearance_2.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group02']/div/div/div/div")
		private WebElement Appearance_3;
		
		public String Appearance_3(){//3.horizontal is left,vertical is bottom
			String v = Appearance.appearance_place(Appearance_3.getAttribute("style"), "bottom");
			String h = Appearance_3.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group03']/div/div/div/div")
		private WebElement Appearance_4;
		
		public String Appearance_4(){//4.horizontal is center,vertical is top
			String v = Appearance.appearance_place(Appearance_4.getAttribute("style"), "top");
			String h = Appearance_4.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group04']/div/div/div/div")
		private WebElement Appearance_5;
		
		public String Appearance_5(){//5.horizontal is center,vertical is center
			String v = Appearance.appearance_place(Appearance_5.getAttribute("style"), "middle");
			String h = Appearance_5.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group05']/div/div/div/div")
		private WebElement Appearance_6;
		
		public String Appearance_6(){//6.horizontal is center,vertical is bottom
			String v =Appearance.appearance_place(Appearance_6.getAttribute("style"), "bottom");
			String h = Appearance_6.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group06']/div/div/div/div")
		private WebElement Appearance_7;
		
		public String Appearance_7(){//7.horizontal is right,vertical is top
			String v = Appearance.appearance_place(Appearance_7.getAttribute("style"), "top");
			String h = Appearance_7.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group07']/div/div/div[1]/div")
		private WebElement Appearance_8;
		
		public String Appearance_8(){//8.horizontal is right,vertical is center
			String v = Appearance.appearance_place(Appearance_8.getAttribute("style"), "middle");
			String h = Appearance_8.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group08']/div/div/div/div")
		private WebElement Appearance_9;
		
		public String Appearance_9(){//9.horizontal is right,vertical is bottom
			String v = Appearance.appearance_place(Appearance_9.getAttribute("style"), "bottom");
			String h = Appearance_9.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group09']/div/div/div/div")
		private WebElement Appearance_10;
		
		public int Appearance_10(){//10.horizontal indent is 50px
			String[] temp = {"padding-left: 50px"};
			return Appearance.appearance_query(Appearance_10.getAttribute("style"), temp);
			
		}
		
		@FindBy(xpath=".//*[@id='Table_Appearance_group10']/div/div/div/div")
		private WebElement Appearance_11;
		
		public int Appearance_11(){//11.horizontal indent is 10percent
			String[] temp = {"padding-left: 10%"};
			return Appearance.appearance_query(Appearance_11.getAttribute("style"), temp);
		}
//###############################Table Appearance##################################
//###############################Table Submit######################################
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
