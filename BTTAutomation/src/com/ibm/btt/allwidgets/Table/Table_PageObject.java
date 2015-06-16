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
//Table with default properties
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
//###############################Table Appearance###########################################
//###############################table column standard #####################################
	@FindBy(id="Table_Column_table01")
	private WebElement colStandardTable;
	
	@FindBy(id="columnId0")
	private WebElement col_AccountName;
	
	@FindBy(id="columnId1")
	private WebElement col_TradeTime;
	
	@FindBy(id="columnId3")
	private WebElement col_OpeningDate;
	
	@FindBy(id="columnId4")
	private WebElement col_Balance;
	
	@FindBy(id="columnId5")
	private WebElement col_Rate;
	
	@FindBy(id="columnId6")
	private WebElement col_Usable;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[1]")
	private WebElement col_row11;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[2]")
	private WebElement col_row12;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[4]")
	private WebElement col_row13;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[5]")
	private WebElement col_row14;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[6]")
	private WebElement col_row15;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[7]")
	private WebElement col_row16;
	
/*
1. This table is with fixed width 661px. relative size calculate to fixed size expected value is as bellow
16% ~~ 160px
14% ~~ 140px
10% ~~ 100px
*/
	public int colFixed(){
		String[] temp={"width: 661px"};
		return Appearance.appearance_query(colStandardTable.getAttribute("style"), temp);
	}
	
	public int colOpeningDate(){
		String[] temp={"width: 16%"};
		return Appearance.appearance_query(col_OpeningDate.getAttribute("style"), temp);
	}
	
	public int colBalance(){
		String[] temp={"width: 14%"};
		return Appearance.appearance_query(col_Balance.getAttribute("style"), temp);
	}
	
	public int colRate(){
		String[] temp={"width: 10%"};
		return Appearance.appearance_query(col_Rate.getAttribute("style"), temp);
	}
//2. Allignment: the first two column allignment is left, the second two is centre and the last two is right
	public int colAllignmentL1(){
		String[] temp={"text-align: left"};
		return Appearance.appearance_query(col_row11.getAttribute("style"), temp);
	}
	
	public int colAllignmentL2(){
		String[] temp={"text-align: left"};
		return Appearance.appearance_query(col_row12.getAttribute("style"), temp);
	}
	
	public int colAllignmentC1(){
		String[] temp={"text-align: center"};
		return Appearance.appearance_query(col_row13.getAttribute("style"), temp);
	}
	
	public int colAllignmentC2(){
		String[] temp={"text-align: center"};
		return Appearance.appearance_query(col_row14.getAttribute("style"), temp);
	}
	
	public int colAllignmentR1(){
		String[] temp={"text-align: right"};
		return Appearance.appearance_query(col_row15.getAttribute("style"), temp);
	}
	
	public int colAllignmentR2(){
		String[] temp={"text-align: right"};
		return Appearance.appearance_query(col_row16.getAttribute("style"), temp);
	}
/*
3. Tooltip:
AccountName tooltip position: textEnd
TradeTime tooltip position:right;
Openning Date tooltip, position: mouse point;
 */
//###############################table column standard ######################################
//###############################table style and column style################################
//First table
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[5]/table/tbody/tr/td[1]")
	private WebElement table1_CCS1;
	
	public int table1_CCS1(){//the fifth row of the AccountName text is red
		String[] temp={"font-style", "red"};
		return CSS.css_query(table1_CCS1.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement table1_CCS2_Odd;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[2]")
	private WebElement table1_CCS2_Even;
	
	public int table1_CCS2_Even(){//the even rows of the AccountType is bold
		String[] temp={"font-style"};
		return CSS.css_query(table1_CCS2_Even.getAttribute("class"), temp);
	}
	
	public int table1_CCS2_Odd(){//the odd rows of 'AccountType' has a blue border
		String[] temp={"border-style"};
		return CSS.css_query(table1_CCS2_Odd.getAttribute("class"), temp);
	}
	
	@FindBy(id="columnId2")
	private WebElement table1_CCS3;
	
	public int table1_CCS3(){//AccountBalance's tiltle in dark blue color
		String[] temp={"area_title"};
		return CSS.css_query(table1_CCS3.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[4]")
	private WebElement table1_CCS4;
	
	public int table1_CCS4(){//Rate text is in blue color
		String[] temp={"blue"};
		return CSS.css_query(table1_CCS4.getAttribute("class"), temp);
	}
	
	@FindBy(id="columnId3")
	private WebElement table1_CCS5_Header;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[5]")
	private WebElement table1_CCS5_cell;
	
	public int table1_CCS5_Header(){//Usable column has the bold text style on both header and cell rows
		String[] temp={"font-style"};
		return CSS.css_query(table1_CCS5_Header.getAttribute("class"), temp);
	}
	
	public int table1_CCS5_cell(){
		String[] temp={"font-style"};
		return CSS.css_query(table1_CCS5_cell.getAttribute("class"), temp);
	}
//Second table	
//Header	
	@FindBy(xpath=".//*[@id='Table_Style_Table01_copy']/div[1]/div/div/div/table/tbody/tr/th[1]")
	private WebElement table2_Header1;
	
	@FindBy(xpath=".//*[@id='Table_Style_Table01_copy']/div[1]/div/div/div/table/tbody/tr/th[2]")
	private WebElement table2_Header2;
	
	@FindBy(xpath=".//*[@id='Table_Style_Table01_copy']/div[1]/div/div/div/table/tbody/tr/th[3]")
	private WebElement table2_Header3;
	
	@FindBy(xpath=".//*[@id='Table_Style_Table01_copy']/div[1]/div/div/div/table/tbody/tr/th[4]")
	private WebElement table2_Header4;
	
	@FindBy(xpath=".//*[@id='Table_Style_Table01_copy']/div[1]/div/div/div/table/tbody/tr/th[5]")
	private WebElement table2_Header5;
	
	public int table2_Header1(){
		String[] temp={"font-style", "h-align-right"};
		return CSS.css_query(table2_Header1.getAttribute("class"), temp);
	}
	
	public int table2_Header2(){
		String[] temp={"font-style", "h-align-right"};
		return CSS.css_query(table2_Header2.getAttribute("class"), temp);
	}
	
	public int table2_Header3(){
		String[] temp={"font-style", "h-align-right"};
		return CSS.css_query(table2_Header3.getAttribute("class"), temp);
	}
	
	public int table2_Header4(){
		String[] temp={"font-style", "h-align-right"};
		return CSS.css_query(table2_Header4.getAttribute("class"), temp);
	}
	
	public int table2_Header5(){
		String[] temp={"font-style", "h-align-right"};
		return CSS.css_query(table2_Header5.getAttribute("class"), temp);
	}
//row0	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[1]")
	private WebElement table2_row01;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[2]")
	private WebElement table2_row02;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[3]")
	private WebElement table2_row03;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[4]")
	private WebElement table2_row04;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[5]")
	private WebElement table2_row05;
//row1
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[2]/table/tbody/tr/td[1]")
	private WebElement table2_row11;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[2]/table/tbody/tr/td[2]")
	private WebElement table2_row12;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[2]/table/tbody/tr/td[3]")
	private WebElement table2_row13;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[2]/table/tbody/tr/td[4]")
	private WebElement table2_row14;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[2]/table/tbody/tr/td[5]")
	private WebElement table2_row15;
//row4
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[5]/table/tbody/tr/td[1]")
	private WebElement table2_row41;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[5]/table/tbody/tr/td[2]")
	private WebElement table2_row42;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[5]/table/tbody/tr/td[3]")
	private WebElement table2_row43;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[5]/table/tbody/tr/td[4]")
	private WebElement table2_row44;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[5]/table/tbody/tr/td[5]")
	private WebElement table2_row45;
//row5
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[6]/table/tbody/tr/td[1]")
	private WebElement table2_row51;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[6]/table/tbody/tr/td[2]")
	private WebElement table2_row52;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[6]/table/tbody/tr/td[3]")
	private WebElement table2_row53;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[6]/table/tbody/tr/td[4]")
	private WebElement table2_row54;
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[6]/table/tbody/tr/td[5]")
	private WebElement table2_row55;
	
	public int table2_row01(){
		String[] temp={"font-Georgia", "h-align-right", "red"};
		return CSS.css_query(table2_row01.getAttribute("class"), temp);
	}
	
	public int table2_row02(){
		String[] temp={"font-Georgia", "h-align-right", "red"};
		return CSS.css_query(table2_row02.getAttribute("class"), temp);
	}
	
	public int table2_row03(){
		String[] temp={"font-Georgia", "h-align-right", "red"};
		return CSS.css_query(table2_row03.getAttribute("class"), temp);
	}
	
	public int table2_row04(){
		String[] temp={"font-Georgia", "h-align-right", "red"};
		return CSS.css_query(table2_row04.getAttribute("class"), temp);
	}
	
	public int table2_row05(){
		String[] temp={"font-Georgia", "h-align-right", "red"};
		return CSS.css_query(table2_row05.getAttribute("class"), temp);
	}
	
	
	public int table2_row11(){
		String[] temp={"font-Georgia", "h-align-right", "blue"};
		return CSS.css_query(table2_row11.getAttribute("class"), temp);
	}
	
	public int table2_row12(){
		String[] temp={"font-Georgia", "h-align-right", "blue"};
		return CSS.css_query(table2_row12.getAttribute("class"), temp);
	}
	
	public int table2_row13(){
		String[] temp={"font-Georgia", "h-align-right", "blue"};
		return CSS.css_query(table2_row13.getAttribute("class"), temp);
	}
	
	public int table2_row14(){
		String[] temp={"font-Georgia", "h-align-right", "blue"};
		return CSS.css_query(table2_row14.getAttribute("class"), temp);
	}
	
	public int table2_row15(){
		String[] temp={"font-Georgia", "h-align-right", "blue"};
		return CSS.css_query(table2_row15.getAttribute("class"), temp);
	}
	
	public int table2_row41(){
		String[] temp={"font-Georgia", "h-align-right", "red", "redblue"};
		return CSS.css_query(table2_row41.getAttribute("class"), temp);
	}
	
	public int table2_row42(){
		String[] temp={"font-Georgia", "h-align-right", "red", "redblue"};
		return CSS.css_query(table2_row42.getAttribute("class"), temp);
	}
	
	public int table2_row43(){
		String[] temp={"font-Georgia", "h-align-right", "red", "redblue"};
		return CSS.css_query(table2_row43.getAttribute("class"), temp);
	}
	
	public int table2_row44(){
		String[] temp={"font-Georgia", "h-align-right", "red", "redblue"};
		return CSS.css_query(table2_row44.getAttribute("class"), temp);
	}
	
	public int table2_row45(){
		String[] temp={"font-Georgia", "h-align-right", "red", "redblue"};
		return CSS.css_query(table2_row45.getAttribute("class"), temp);
	}
	
	public int table2_row51(){
		String[] temp={"font-Georgia", "h-align-right", "blue", "redblue"};
		return CSS.css_query(table2_row51.getAttribute("class"), temp);
	}
	
	public int table2_row52(){
		String[] temp={"font-Georgia", "h-align-right", "blue", "redblue"};
		return CSS.css_query(table2_row52.getAttribute("class"), temp);
	}
	
	public int table2_row53(){
		String[] temp={"font-Georgia", "h-align-right", "blue", "redblue"};
		return CSS.css_query(table2_row53.getAttribute("class"), temp);
	}
	
	public int table2_row54(){
		String[] temp={"font-Georgia", "h-align-right", "blue", "redblue"};
		return CSS.css_query(table2_row54.getAttribute("class"), temp);
	}
	
	public int table2_row55(){
		String[] temp={"font-Georgia", "h-align-right", "blue", "redblue"};
		return CSS.css_query(table2_row55.getAttribute("class"), temp);
	}
	
//###############################table style and column style################################


}
