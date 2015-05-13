package com.ibm.btt.allwidgets.VerticalSlider;

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

public class VerticalSlider_PageObject extends Main_Page{
	
//###############################VerticalSlider Properties##################################	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_panel']/div[2]/div[2]/table")
	private WebElement properties_id;
	
	public String proId(){//1.VerticalSlider's id is"VerticalSlider_my"
		return properties_id.getAttribute("id");
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider01']/tbody/tr[3]/td[2]/center/div[2]/div/div")
	private WebElement properties_disableTrue;
	
	public String proDisableTrue(){//2.VerticalSlider is disabled
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="VerticalSlider_properties1_verticalSlider02")
	private WebElement properties_readonlyTrue;
	
	public int proReadonlyTrue(){// 3.VerticalSlider readonly is true
		String[] temp = {"dijitSliderReadOnly", "dijitReadOnly"};
		return CSS.css_query(properties_readonlyTrue.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider03']/tbody/tr[3]/td[2]/center/div[2]/div/div")
	private WebElement properties_value;
	
	public String proValue(){//4.VerticalSlider value is 30
		return properties_value.getAttribute("aria-valuenow");
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider04']/tbody/tr[3]/td[2]/center/div[1]")
	private WebElement properties_bar;
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider04']/tbody/tr[3]/td[2]/center/div[2]")
	private WebElement properties_pressbar;
	
	public String proClickSelectFalse(){//5.VerticalSlider clickselect is false
		properties_bar.click();
		return properties_pressbar.getAttribute("style");
	}
	
/*	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider04']/tbody/tr[3]/td[2]/center/div[1]")
	private WebElement properties_bar;
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider04']/tbody/tr[3]/td[2]/center/div[2]")
	private WebElement properties_pressbar;
	
	public String proClickSelectFalse(){//6.VerticalSlider discreteValues is 60
		properties_bar.click();
		return properties_pressbar.getAttribute("style");
	}*/
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider06']/tbody/tr[3]/td[2]/center/div[2]/div/div")
	private WebElement properties_HandleMax;

	public String proMaximum(){//7.VerticalSlider maximum is 200 
		return properties_HandleMax.getAttribute("aria-valuemin");
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider07']/tbody/tr[3]/td[2]/center/div[2]/div/div")
	private WebElement properties_HandleMin;

	public String proMinimum(){//8.VerticalSlider minimum is 10 
		return properties_HandleMin.getAttribute("aria-valuemin");
	}
	
/*	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_verticalSlider07']/tbody/tr[3]/td[2]/center/div[2]/div/div")
	private WebElement properties_HandleMin;

	public String proMinimum(){//9. VerticalSlider pageIncrement is 10 
		return properties_HandleMin.getAttribute("aria-valuemin");
	}*/
	
	@FindBy(xpath=".//*[@id='VerticalSlider_properties1_panel']/div[12]/div[2]/table/tbody/tr[1]/td[2]/div")
	private WebElement properties_showButton;

	public String proShowButton(){//10.VerticalSlider showButton is false
		return properties_showButton.getAttribute("style");
	}
//###############################VerticalSlider Properties##################################
//###############################VerticalSlider CSS#########################################
	@FindBy(id="VerticalSlider_css_verticalSlider")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"mybankSliderV"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="VerticalSlider_css_verticalSlider01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setFontStyle", "setFontSize"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="VerticalSlider_css_verticalSlider01_copy")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setFontSize", "setFontStyle", "setFontWeight"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="VerticalSlider_css_verticalSlider01_copy01")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"claro"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################VerticalSlider CSS#########################################
//###############################VerticalSlider Event#######################################	
	@FindBy(id="VerticalSlider_event_verticalSlider")
	private WebElement event_VerticalSlider;
	
	@FindBy(xpath=".//*[@id='VerticalSlider_event_verticalSlider']/tbody/tr[1]/td[2]/div")
	private WebElement event_VerticalSliderValue;
	
	@FindBy(id="VerticalSlider_event_label02")
	private WebElement event_label1; 
	
	public String evtOnClick(){ //onClick
		event_VerticalSlider.click();
		return event_label1.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label04")
	private WebElement event_label2; 
	
	public String evtOnDbClick(){ //onDoubleClick
		Main_Class main_class = new Main_Class();
		main_class.doubleClick("VerticalSlider_event_verticalSlider");
		return event_label2.getText();
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_event_verticalSlider']/tbody/tr[3]/td[2]/center/div[2]")
	private WebElement event_VerticalSliderV;
	
	@FindBy(id="VerticalSlider_event_label06")
	private WebElement event_label3;
	
	public String evtOnKeyDown(){ //onKeyDown
		event_VerticalSliderV.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label3.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label08")
	private WebElement event_label4;
	
	public String evtOnKeyPress(){ //onKeyPress
		event_VerticalSliderV.click();
		Main_Class.keyPress(KeyEvent.VK_0);
		Main_Class.keyRelease(KeyEvent.VK_0);
		return event_label4.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label10")
	private WebElement event_label5;
	
	public String evtOnKeyUP(){ //onKeyUp
		event_VerticalSliderV.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label5.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label12")
	private WebElement event_label6;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_VerticalSlider.click();
		return event_label6.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label14")
	private WebElement event_label9;

	public String evtOnMouseEnter(){ //onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("VerticalSlider_event_verticalSlider");
		return event_label9.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label16")
	private WebElement event_label10;

	public String evtOnMouseLeave(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("VerticalSlider_event_verticalSlider");
		main_class.widget_moveToElement("VerticalSlider_event_label16");
		return event_label10.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label18")
	private WebElement event_label11;
	
	public String evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("VerticalSlider_event_verticalSlider");
		return event_label11.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label25")
	private WebElement event_label12;
	
	public String evtOnMouseOut(){ //onMouseOut
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("VerticalSlider_event_verticalSlider");
		return event_label12.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label26")
	private WebElement event_label13;
	
	public String evtOnMouseOver(){ //onMouseOver
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("VerticalSlider_event_verticalSlider");
		return event_label13.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label27")
	private WebElement event_label14;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_VerticalSlider.click();
		return event_label14.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label28")
	private WebElement event_label15;
	
	public String evtOnFocus(){ //onFocus
		event_VerticalSlider.click();
		return event_label15.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label29")
	private WebElement event_label16;
	
	public String evtOnBlur(){ //onBlur
		event_VerticalSlider.click();
		event_label16.click();
		return event_label16.getText();
	}
	
	@FindBy(id="VerticalSlider_event_label30")
	private WebElement event_label17;
	
	public String evtOnChange(){ //onChange
		event_VerticalSliderValue.click();
		return event_label17.getText();
	}
//###############################VerticalSlider Event######################################
//###############################VerticalSlider Condition##################################
// Widget function	
	@FindBy(id="VerticalSlider_condition_verticalSlider")
	private WebElement condition_VerticalSlider;
	
	
	
	@FindBy(id="VerticalSlider_condition_label10")
	private WebElement condition_label2;
	
	public String conDbClick(){//Doublie click the current widget 
		Main_Class main_class = new Main_Class();
		main_class.doubleClick("VerticalSlider_condition_verticalSlider");
		return condition_label2.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label65")
	private WebElement condition_clickHere3;
	
	@FindBy(id="VerticalSlider_condition_label11")
	private WebElement condition_label3;
	
	public String conDisabled(){//disabled
		condition_clickHere3.click();
		return condition_label3.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label66")
	private WebElement condition_clickHere4;
	
	@FindBy(id="VerticalSlider_condition_label12")
	private WebElement condition_label4;
	
	public String conReadonly(){//readonly
		condition_clickHere4.click();
		return condition_label4.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label67")
	private WebElement condition_clickHere5;
	
	@FindBy(id="VerticalSlider_condition_label13")
	private WebElement condition_label5;
	
	public String conClickSelect(){//clickSelect
		condition_clickHere5.click();
		return condition_label5.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label14")
	private WebElement condition_label6;
	
	public String conHover(){//hovering
		condition_VerticalSlider.click();
		return condition_label6.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label69")
	private WebElement condition_clickHere7;
	
	@FindBy(id="VerticalSlider_condition_label18")
	private WebElement condition_label7;
	
	public String conHntermediatechanges(){//intermediatechanges
		condition_clickHere7.click();
		return condition_label7.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label70")
	private WebElement condition_clickHere8;
	
	@FindBy(id="VerticalSlider_condition_label19")
	private WebElement condition_label8;
	
	public String conShowButtons(){//showButtons
		condition_clickHere8.click();
		return condition_label8.getText();
	}
// Expression Widget function	
	@FindBy(id="VerticalSlider_condition_verticalSlider01")
	private WebElement condition_Expression;
	
	@FindBy(id="VerticalSlider_condition_label71")
	private WebElement condition_clickHere9;
	
	@FindBy(id="VerticalSlider_condition_label22")
	private WebElement condition_label9;
	
	public String conExpId(){//get(id)=verticalSlider01
		condition_clickHere9.click();
		return condition_label9.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label72")
	private WebElement condition_clickHere10;
	
	@FindBy(id="VerticalSlider_condition_label24")
	private WebElement condition_label10;
	
	public String conExpSet(){//set(name,value)
		condition_clickHere9.click();
		return condition_label9.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label73")
	private WebElement condition_clickHere11;
	
	@FindBy(id="VerticalSlider_condition_label26")
	private WebElement condition_label11;
	
	public String conExpCompare(){//compare(var1,var2)
		condition_clickHere11.click();
		return condition_label11.getText();
	}
	
	
// Widget property
	@FindBy(id="VerticalSlider_condition_verticalSlider02")
	private WebElement condition_widgetPro;
	
	@FindBy(id="VerticalSlider_condition_label75")
	private WebElement condition_clickHere13;
	
	@FindBy(id="VerticalSlider_condition_label34")
	private WebElement condition_label13;
	
	public String conProId(){//id
		condition_clickHere13.click();
		return condition_label13.getText();
	}
	
	/*@FindBy(id="VerticalSlider_condition_label75")
	private WebElement condition_clickHere14;
	
	@FindBy(id="VerticalSlider_condition_label34")
	private WebElement condition_label14;
	
	public String conProFocus(){//focus
		condition_clickHere14.click();
		return condition_label14.getText();
	}*/
	
	@FindBy(id="VerticalSlider_condition_label77")
	private WebElement condition_clickHere15;
	
	@FindBy(id="VerticalSlider_condition_label37")
	private WebElement condition_label15;
	
	public String conProDisabled(){//disabled
		condition_clickHere15.click();
		return condition_label15.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label78")
	private WebElement condition_clickHere16;
	
	@FindBy(id="VerticalSlider_condition_label40")
	private WebElement condition_label16;
	
	public String conProValue(){//value
		condition_clickHere16.click();
		return condition_label16.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label79")
	private WebElement condition_clickHere17;
	
	@FindBy(id="VerticalSlider_condition_label41")
	private WebElement condition_label17;
	
	public String conProWidgetName(){//WidgetName
		condition_clickHere17.click();
		return condition_label17.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label80")
	private WebElement condition_clickHere18;
	
	@FindBy(id="VerticalSlider_condition_label42")
	private WebElement condition_label18;
	
	public String conProReadonly(){//Readonly
		condition_clickHere18.click();
		return condition_label18.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label81")
	private WebElement condition_clickHere19;
	
	@FindBy(id="VerticalSlider_condition_label50")
	private WebElement condition_label19;
	
	public String conProClickSelect(){//ClickSelect
		condition_clickHere19.click();
		return condition_label19.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label82")
	private WebElement condition_clickHere20;
	
	@FindBy(id="VerticalSlider_condition_label51")
	private WebElement condition_label20;
	
	public String conProDiscreateValues(){//discreateValues
		condition_clickHere20.click();
		return condition_label20.getText();
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_condition_verticalSlider01']/tbody/tr[3]/td[2]/center/div[2]/div/div")
	private WebElement condition_verticalSlider01;
	
	@FindBy(id="VerticalSlider_condition_label83")
	private WebElement condition_clickHere21;
	
	@FindBy(id="VerticalSlider_condition_label52")
	private WebElement condition_label21;
	
	public String conProHovering1(){//Hovering
		condition_verticalSlider01.click();
		return condition_label21.getText();
	}
	
	public String conProHovering2(){//Hovering
		condition_clickHere21.click();
		return condition_label21.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label84")
	private WebElement condition_clickHere22;
	
	@FindBy(id="VerticalSlider_condition_label53")
	private WebElement condition_label22;
	
	public String conProintermediaChanges(){//intermediaChanges
		condition_clickHere22.click();
		return condition_label22.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label85")
	private WebElement condition_clickHere23;
	
	@FindBy(id="VerticalSlider_condition_label56")
	private WebElement condition_label23;
	
	public String conProMaximum(){//Maximum
		condition_clickHere23.click();
		return condition_label23.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label86")
	private WebElement condition_clickHere24;
	
	@FindBy(id="VerticalSlider_condition_label57")
	private WebElement condition_label24;
	
	public String conProMinimum(){//Minimum
		condition_clickHere24.click();
		return condition_label24.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label87")
	private WebElement condition_clickHere25;
	
	@FindBy(id="VerticalSlider_condition_label58")
	private WebElement condition_label25;
	
	public String conPropageIncrement(){//pageIncrement
		condition_clickHere25.click();
		return condition_label25.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label88")
	private WebElement condition_clickHere26;
	
	@FindBy(id="VerticalSlider_condition_label63")
	private WebElement condition_label26;
	
	public String conProshowButtons(){//showButtons
		condition_clickHere26.click();
		return condition_label26.getText();
	}
	
	@FindBy(id="VerticalSlider_condition_label89")
	private WebElement condition_clickHere27;
	
	@FindBy(id="VerticalSlider_condition_label64")
	private WebElement condition_label27;
	
	public String conProslideDuration(){//slideDuration
		condition_clickHere27.click();
		return condition_label27.getText();
	}
	
//###############################VerticalSlider Condition##################################
//###############################VerticalSlider Action#####################################
	@FindBy(xpath=".//*[@id='VerticalSlider_action_panel']/div[2]/div[2]/table")
	private WebElement action_VerticalSlider;
	
	@FindBy(id="VerticalSlider_action_label01")
	private WebElement action_click1;
	
	@FindBy(id="VerticalSlider_action_label02")
	private WebElement action_label1;
	
	public String actGetName(){//Click to get(name)
		action_click1.click();
		return action_label1.getText();
	}
	
	@FindBy(id="VerticalSlider_action_label03")
	private WebElement action_click2;
	
	@FindBy(id="VerticalSlider_action_label04")
	private WebElement action_label2;
	
	public String actSetName(){//Click to set(name,value)
		action_click2.click();
		return action_label2.getText();
	}
	
	@FindBy(id="VerticalSlider_action_label05")
	private WebElement action_click3;
	
	@FindBy(id="VerticalSlider_action_label06")
	private WebElement action_label3;
	
	public String actCompare(){//Click to compare(var1,var2)
		action_click3.click();
		return action_label3.getText();
	}
	
	@FindBy(id="VerticalSlider_action_label07")
	private WebElement action_click4;
	
	public int actFocus(){//Click to focus VerticalSlider
		action_click4.click();
		String[] temp = {"dijitSliderFocused", "dijitFocused"};
		return CSS.css_query(action_VerticalSlider.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_action_panel']/div[2]/div[2]/table/tbody/tr[1]/td[2]/div")
	private WebElement action_reset;
	
	@FindBy(xpath=".//*[@id='VerticalSlider_action_panel']/div[2]/div[2]/table/tbody/tr[3]/td[2]/center/div[2]/div/div")
	private WebElement action_value;
	
	@FindBy(id="VerticalSlider_action_label09")
	private WebElement action_click6;
	
	public String actReset(){//Click here to reset VerticalSlider
		action_reset.click();
		action_click6.click();
		return action_value.getAttribute("aria-valuenow");
	}

//###############################VerticalSlider Action#####################################
//###############################VerticalSlider Appearance1################################
	@FindBy(id="VerticalSlider_appearance1_verticalSlider01")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(id="VerticalSlider_appearance1_verticalSlider01_copy")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Height is Fixed 100px
		String[] temp={"height: 100px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(id="VerticalSlider_appearance1_verticalSlider01_copy01")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.3.Height is Fill
		String[] temp={"height: 100%"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(id="VerticalSlider_appearance1_verticalSlider01_copy02")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Height is Relative 80%
		String[] temp={"height: 80%"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
//###############################VerticalSlider Appearance1###############################
//###############################VerticalSlider Appearance2###############################
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group04_copy']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group04_copy01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group04_copy02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group04_copy03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='VerticalSlider_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################VerticalSlider Appearance2###############################



}
