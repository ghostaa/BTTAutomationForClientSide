package com.ibm.btt.allwidgets.Panel;

import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.allwidgets.Index_Page;
import com.ibm.btt.allwidgets.Main_Page;

public class Panel_PageObject extends Main_Page{ 

//###############################For Panel Properties##################################
	@FindBy(xpath=".//*[@id='panel_properties_mypanel']")
	private WebElement properties_id;

	public String proId(){
		 return properties_id.getAttribute("id");
	}

//###############################For Panel Properties##################################	
//###############################For Panel ECA#########################################	
//Panel Event	
	@FindBy(id="panel_ECA_text")
	private WebElement Evt_onKeyDown;
	
	@FindBy(id="panel_ECA_label")
	private WebElement Evt_label1;

	public String Evt_onKeyDown(){//1.Key down in the text, the label will change
		Evt_onKeyDown.click();
		(new AllWidgetsProjectMain_Class()).keyDown(Keys.SHIFT);
		(new AllWidgetsProjectMain_Class()).keyUp(Keys.SHIFT);
		return Evt_label1.getText();
	}

	@FindBy(id="panel_ECA_text01")
	private WebElement Evt_onKeyPress;
	
	@FindBy(id="panel_ECA_label01")
	private WebElement Evt_label2;

	public String Evt_onKeyPress(){//2.Key press in the text, the label will change
		Evt_onKeyPress.click();
		AllWidgetsProjectMain_Class.keyPress(KeyEvent.VK_0);
		AllWidgetsProjectMain_Class.keyRelease(KeyEvent.VK_0);
		return Evt_label2.getText();
	}

	@FindBy(id="panel_ECA_text02")
	private WebElement Evt_onKeyUp;
	
	@FindBy(id="panel_ECA_label02")
	private WebElement Evt_label3;

	public String Evt_onKeyUp(){//3.Key up in the text, the label will change
		Evt_onKeyUp.click();
		(new AllWidgetsProjectMain_Class()).keyDown(Keys.SHIFT);
		(new AllWidgetsProjectMain_Class()).keyUp(Keys.SHIFT);
		return Evt_label3.getText();
	}

	@FindBy(id="panel_ECA_text03")
	private WebElement Evt_onKeyDown1;
	
	@FindBy(xpath=".//*[@id='panel_ECA_panel04']/div[1]/div[1]/span")
	private WebElement Evt_StyleCSS;
	
	@FindBy(id="panel_ECA_button_disable")
	private WebElement Evt_buttonDisable;
	
	@FindBy(xpath=".//*[@id='panel_ECA_button_text_label']/span")
	private WebElement Evt_buttonText;
	
	@FindBy(xpath=".//*[@id='panel_ECA_panel04']/div[2]/div[2]/div")
	private WebElement Evt_labelFocus;
	
	@FindBy(id="panel_ECA_button_visibility")
	private WebElement Evt_buttonVisibility;
	
	@FindBy(id="panel_ECA_label03")
	private WebElement Evt_label;

	public void Evt_onKeyDown1(){//4.Key down in the text, the button ,radio and label will change as the description
		Evt_onKeyDown1.click();
		(new AllWidgetsProjectMain_Class()).keyDown(Keys.SHIFT);
		(new AllWidgetsProjectMain_Class()).keyUp(Keys.SHIFT);
	}
	
	public int Evt_StyleCSS(){
		String[] temp = {"pointer_down"};
		return CSS.css_query(Evt_StyleCSS.getAttribute("class"), temp);
	}
	
	public String Evt_buttonDisable(){
		return Evt_buttonDisable.getAttribute("disabled");
	}
	
	public String Evt_buttonText(){
		return Evt_buttonText.getText();
	}
	
	public int Evt_labelFocus(){
		String[] temp={"dijitRadioFocused", "dijitFocused"};
		return CSS.css_query(Evt_labelFocus.getAttribute("class"), temp);
	}
	
	public Boolean Evt_buttonVisibility(){
		return Evt_buttonVisibility.isDisplayed();
	}
	
	public String Evt_label(){
		return Evt_label.getText();
	}

//Panel Condition
	@FindBy(id="panel_ECA_text04")
	private WebElement Con_Constant;
	
	@FindBy(id="panel_ECA_label04")
	private WebElement Con_Label;

	public String Con_Constant(){//5.Input something in the text, the label will show 'expression test ok'
		Con_Constant.click();
		Con_Constant.sendKeys("asd");
		return Con_Label.getText();
	}

	@FindBy(id="panel_ECA_text06")
	private WebElement con_Click;
	
	@FindBy(id="panel_ECA_label06")
	private WebElement Con_Label1;

	public String con_Click(){//6.If panel's id is right,click text, the label will show 'panel_ECA_panel07'
		con_Click.click();
		return Con_Label1.getText();
	}

	@FindBy(id="panel_ECA_text07")
	private WebElement con_Click1;
	
	@FindBy(id="panel_ECA_label07")
	private WebElement Con_Label2;

	public String con_Click1(){//7.Please click the text, this comment will change to "ActionGroup test success".
		con_Click1.click();
		return Con_Label2.getText();
	}
//###############################For Panel ECA#########################################
//###############################For Panel CSS#########################################
	@FindBy(id="panel_css_panel01")
	private WebElement css_style1;

	public int cssStyle1(){//only have one css style
		String[] temp={"setBackgroundColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="panel_css_panel02")
	private WebElement css_style2;

	public int cssStyle2(){//two css styles
		String[] temp={"setBorder", "setColor"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="panel_css_panel03")
	private WebElement css_style3;

	public int cssStyle3(){//three css styles
		String[] temp={"setColor", "setBackgroundColor", "setBorder"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="panel_css_label06")
	private WebElement css_style4;

	public int cssStyle4(){//The types of style from dojo provided 	
		String[] temp={"dijitLabelBase"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################For Panel CSS########################################
	//###########################Panel Appearance1####################################
	@FindBy(id="panel_appearance1_panel01")
	private WebElement Appearance1_1;
	
	public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String[] temp={""};
		return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel02")
	private WebElement Appearance1_2;
	
	public int Appearance1_2(){//2.Width is AutoSize,Height is Fixed 150px
		String[] temp={"height: 150px"};
		return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel03")
	private WebElement Appearance1_3;
	
	public int Appearance1_3(){//3.Width is AutoSize,Height is Relative 50%
		String[] temp={"height: 50%"};
		return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel04")
	private WebElement Appearance1_4;
	
	public int Appearance1_4(){//4.Width is AutoSize,Height is Fill
		String[] temp={"height: 100%"};
		return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel05")
	private WebElement Appearance1_5;
	
	public int Appearance1_5(){//5.Width is Fixed 150px,Height is AutoSize
		String[] temp={"width: 150px"};
		return Appearance.appearance_query(Appearance1_5.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel06")
	private WebElement Appearance1_6;
	
	public int Appearance1_6(){//6.Width is Fixed 150px,Height is Fixed 150px
		String[] temp={"width: 150px", "height: 150px"};
		return Appearance.appearance_query(Appearance1_6.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel07")
	private WebElement Appearance1_7;
	
	public int Appearance1_7(){//7.Width is Fixed 150px,Height is Relative 50%
		String[] temp={"width: 150px", "height: 50%"};
		return Appearance.appearance_query(Appearance1_7.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel08")
	private WebElement Appearance1_8;
	
	public int Appearance1_8(){//8.Width is Fixed 150px,Height is Fill
		String[] temp={"width: 150px", "height: 100%"};
		return Appearance.appearance_query(Appearance1_8.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel09")
	private WebElement Appearance1_9;
	
	public int Appearance1_9(){//9.Width is Relative 50%,Height is AutoSize
		String[] temp={"width: 50%"};
		return Appearance.appearance_query(Appearance1_9.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel10")
	private WebElement Appearance1_10;
	
	public int Appearance1_10(){//10.Width is Relative 50%,Height is Fixed 150px
		String[] temp={"width: 50%", "height: 150px"};
		return Appearance.appearance_query(Appearance1_10.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel11")
	private WebElement Appearance1_11;
	
	public int Appearance1_11(){//11.Width is Relative 50%,Height is Relative 50%
		String[] temp={"width: 50%", "height: 50%"};
		return Appearance.appearance_query(Appearance1_11.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel12")
	private WebElement Appearance1_12;
	
	public int Appearance1_12(){//12.Width is Relative 50%,Height is Fill
		String[] temp={"width: 50%", "height: 100%"};
		return Appearance.appearance_query(Appearance1_12.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel13")
	private WebElement Appearance1_13;
	
	public int Appearance1_13(){//13.Width is Fill,Height is AutoSize
		String[] temp={"width: 100%"};
		return Appearance.appearance_query(Appearance1_13.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel14")
	private WebElement Appearance1_14;
	
	public int Appearance1_14(){//14.Width is Fill,Height is Fixed 150px
		String[ ]temp={"width: 100%", "height: 150px"};
		return Appearance.appearance_query(Appearance1_14.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel15")
	private WebElement Appearance1_15;
	
	public int Appearance1_15(){//15.Width is Fill,Height is Relatvie 50%
		String[] temp={"width: 100%", "height: 50%"};
		return Appearance.appearance_query(Appearance1_15.getAttribute("style"), temp);
	}
	
	@FindBy(id="panel_appearance1_panel16")
	private WebElement Appearance1_16;
	
	public int Appearance1_16(){//16.Width is Fill,Height is Fill
		String[] temp={"width: 100%", "height: 100%"};
		return Appearance.appearance_query(Appearance1_16.getAttribute("style"), temp);
	}
//###############################Panel Appearance1###############################
//###############################Panel Appearance2###############################
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[1]/div[3]")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[3]/div[3]")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[5]/div[3]")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[7]/div[3]")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[8]/div[3]")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[10]/div[3]")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[12]/div[3]")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[14]/div[3]")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[16]/div[3]")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[18]/div[3]")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='panel_appearance2_panel']/div[20]/div[3]")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################Panel Appearance2###############################


} 