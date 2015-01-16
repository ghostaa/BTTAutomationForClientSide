package com.ibm.btt.allwidgets.Button;

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

public class Button_PageObject extends Main_Page{
	
//###############################Button Properties##################################
	@FindBy(xpath=".//*[@id='button_properties_panel']/tbody/tr[1]/td[2]/span/span/span")
	private WebElement properties_id;
	
	public String proId(){//button id is"Button1"
		return properties_id.getAttribute("id");
	}
	
	@FindBy(xpath=".//*[@id='button_properties_button01_label']/span")
	private WebElement properties_typeSubmit;
	
	public String proTypeSubmit(){//submit
		return properties_typeSubmit.getText();
	}
	
	@FindBy(xpath=".//*[@id='button_properties_button02_label']/span")
	private WebElement properties_typeReset;
	
	public String proTypeReset(){//reset
		return properties_typeReset.getText();
	}
	
	@FindBy(xpath=".//*[@id='button_properties_button03_label']/span")
	private WebElement properties_typeSubmitNoData;
	
	public String proTypeSubmitNoData(){//submit without data
		return properties_typeSubmitNoData.getText();
	}
	
	@FindBy(xpath=".//*[@id='button_properties_button04_label']/span")
	private WebElement properties_typeSubmitNoValidation;
	
	public String proTypeSubmitNoValidation(){//submit without validation
		return properties_typeSubmitNoValidation.getText();
	}
	
	@FindBy(xpath=".//*[@id='button_properties_button06_label']/span")
	private WebElement properties_NLS;
	
	public String proNLS(){//NLS-button choose "%nls.bttsample/exit"
		return properties_NLS.getText();
	}
	
	@FindBy(id="button_properties_Button_is_visible")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//Button is visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(xpath=".//*[@id='button_properties_panel']/tbody/tr[5]/td[2]/span")
	private WebElement properties_hidden;
	
	public String proHidden(){//Button is hidden
		return properties_hidden.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='button_properties_panel']/tbody/tr[6]/td[2]/span")
	private WebElement properties_gone;
	
	public String proGone(){//Button is gone
		return properties_gone.getAttribute("style");
	}
	
	@FindBy(id="button_properties_button07")
	private WebElement properties_disableFalse;
	
	public Boolean proDisableFalse(){//Button disabled is false
		return properties_disableFalse.isEnabled();
	}
	
	@FindBy(xpath=".//*[@id='button_properties_panel']/tbody/tr[8]/td[2]/span/input")
	private WebElement properties_disableTrue;
	
	public String proDisableTrue(){//Button disabled is true
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(xpath=".//*[@id='button_properties_panel']/tbody/tr[9]/td[2]/span")
	private WebElement properties_shortcut;
	
	public int proShortcut(){//button shortcut is a
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_A);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_A);
		String[] temp = {"dijitButtonFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	@FindBy(id="button_properties_button09")
	private WebElement properties_hint;
	
	public String proHint(){//button hint
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(xpath=".//*[@id='button_properties_button10_label']/img")
	private WebElement properties_img;
	
	public String proImg(){//button icon
		return properties_img.getAttribute("src");
	}
	
	@FindBy(id="button_properties_button11")
	private WebElement properties_tabIndex;
	
	@FindBy(xpath=".//*[@id='button_properties_panel']/tbody/tr[12]/td[2]/span")
	private WebElement properties_tabFocus;
	
	public int proTabFocus(){//TabFocus
		String[] temp = {"dijitButtonFocused", "dijitFocused"};
		return CSS.css_query(properties_tabFocus.getAttribute("class"), temp);
	}
	
	public String proTabIndex(){//button choose tabindex is 2
		return properties_tabIndex.getAttribute("tabindex");
	}
//###############################Button Properties##################################
//###############################Button CSS#########################################
	@FindBy(xpath=".//*[@id='button_css_panel01']/div/div/span")
	private WebElement css_style1;
	
	public int css_style1(){
		String[] temp = {"setBorder"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='button_css_panel02']/div/div/span")
	private WebElement css_style2;
	
	public int css_style2(){
		String[] temp = {"setColor", "setBackgroundColor"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='button_css_panel03']/div/div/span")
	private WebElement css_style3;
	
	public int css_style3(){
		String[] temp = {"setFontFamily", "setFontSize", "setFontStyle"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='button_css_panel']/div[4]/div[2]/span")
	private WebElement css_style4;
	
	public int css_style4(){
		String[] temp = {"dijitSplitterHActive"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################Button CSS#########################################
//###############################Button ECA#########################################
	@FindBy(id="button_ECA_onclick")
	private WebElement eca_onclick;
	
	@FindBy(id="button_ECA_onclick1")
	private WebElement eca_label1;
	
	public String ecaOnclick(){//onclick
		eca_onclick.click();
		return eca_label1.getText();
	}
	
	@FindBy(id="button_ECA_onFocus")
	private WebElement eca_onFocus;
	
	@FindBy(id="button_ECA_onFocus1")
	private WebElement eca_label2;
	
	public String ecaOnFocus(){//onfocus
		eca_onFocus.click();
		return eca_label2.getText();
	}

	@FindBy(id="button_ECA_onBlur")
	private WebElement eca_onBlur;
	
	@FindBy(id="button_ECA_onBlur1")
	private WebElement eca_label3;
	
	public String ecaOnBlur(){//onBlur
		eca_onBlur.click();
		eca_label3.click();
		return eca_label3.getText();
	}
	
	@FindBy(id="button_ECA_onKeyDown")
	private WebElement eca_keyDown;
	
	@FindBy(id="button_ECA_onKeyDown1")
	private WebElement eca_label4;
	
	public String ecaKeyDown(){//onKeyDown
		eca_keyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return eca_label4.getText();
	}
	
	@FindBy(id="button_ECA_onKeyPress")
	private WebElement eca_onKeyPress;
	
	@FindBy(id="button_ECA_onKeyPress1")
	private WebElement eca_label5;
	
	public String ecaOnKeyPress(){//onKeyPress
		eca_onKeyPress.click();
		Main_Class.keyPress(KeyEvent.VK_C);
		Main_Class.keyRelease(KeyEvent.VK_C);
		return eca_label5.getText();
	}
	
	@FindBy(id="button_ECA_onKeyUp")
	private WebElement eca_onKeyUp;
	
	@FindBy(id="button_ECA_onKeyUp1")
	private WebElement eca_label6;
	
	public String ecaOnKeyUp(){//onKeyUp
		eca_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return eca_label6.getText();
	}
	
	@FindBy(id="button_ECA_onMouseUp")
	private WebElement eca_onMouseUp;
	
	@FindBy(id="button_ECA_onMouseUp1")
	private WebElement eca_label7;
	
	public String ecaOnMouseUp(){//onMouseUp
		eca_onMouseUp.click();
		return eca_label7.getText();
	}
	
	@FindBy(id="button_ECA_onMouseDown")
	private WebElement eca_onMouseDown;
	
	@FindBy(id="button_ECA_onMouseDown1")
	private WebElement eca_label8;
	
	public String ecaOnMouseDown(){//onMouseDown
		eca_onMouseDown.click();
		return eca_label8.getText();
	}
	
	@FindBy(id="button_ECA_onMouseEnter1")
	private WebElement eca_label9;
	
	public String ecaOnMouseEnter(){//onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("button_ECA_onMouseEnter");
		return eca_label9.getText();
	}
	
	@FindBy(id="button_ECA_onMouseLeave1")
	private WebElement eca_label10;
	
	public String ecaOnMouseLeave(){//onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("button_ECA_onMouseLeave");
		main_class.widget_moveToElement("button_ECA_onMouseLeave1");
		return eca_label10.getText();
	}
	
	@FindBy(id="button_ECA_onMouseMove1")
	private WebElement eca_label11;
	
	public String ecaonMouseMove(){//onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("button_ECA_onMouseMove");
		return eca_label11.getText();
	}
	
	@FindBy(id="button_ECA_button")
	private WebElement eca_focus;
	
	@FindBy(xpath=".//*[@id='button_ECA_panel']/div[12]/div[3]/span")
	private WebElement eca_focusStatus;
	
	public int ecaFocus(){//focus
		eca_focus.click();
		String[] temp = {"dijitButtonFocused", "dijitFocused"};
		return CSS.css_query(eca_focusStatus.getAttribute("class"), temp);
	}
	
	@FindBy(id="button_ECA_styleclass")
	private WebElement eca_click1;
	
	@FindBy(xpath=".//*[@id='button_ECA_panel01']/div[1]/div[1]/span")
	private WebElement eca_styleclass;
	
	public int ecaStyleClass(){//styleclass
		eca_click1.click();
		String[] temp = {"pointer_down"};
		return CSS.css_query(eca_styleclass.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='button_ECA_text1_label']/span")
	private WebElement eca_text;
	
	public String ecaText(){//text
		eca_text.click();
		return eca_text.getText();
	}
	
	@FindBy(id="button_ECA_visibility")
	private WebElement eca_visible;
	
	public Boolean ecaVisible(){//visible
		return eca_visible.isDisplayed();
	}
	
	@FindBy(id="button_ECA_hidden")
	private WebElement eca_hiddenClick;
	
	@FindBy(xpath=".//*[@id='button_ECA_panel01']/div[2]/div[2]/span")
	private WebElement eca_hidden;
	
	public String ecaHidden(){//hidden
		eca_hiddenClick.click();
		return eca_hidden.getAttribute("style");
	}
	
	@FindBy(id="button_ECA_gone")
	private WebElement eca_goneClick;
	
	@FindBy(xpath=".//*[@id='button_ECA_panel01']/div[3]/div[1]/span")
	private WebElement eca_gone;
	
	public String ecaGone(){//gone
		eca_goneClick.click();
		return eca_gone.getAttribute("style");
	}
	
	@FindBy(id="button_ECA_disabled_true")
	private WebElement eca_click3;
	
	@FindBy(xpath=".//*[@id='button_ECA_panel01']/div[4]/div[1]/span/input")
	private WebElement eca_disableTrue;
	
	public String ecaDisableTrue(){//disableTrue
		eca_click3.click();
		return eca_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="button_ECA_disabled_false")
	private WebElement eca_click4;
	
	public Boolean ecaDisableFalse(){//disableFalse
		return eca_click4.isEnabled();
	}
	
	@FindBy(xpath=".//*[@id='button_ECA_panel01']/div[5]/div[1]/span/span/span")
	private WebElement eca_hint;
	
	public String ecaHint(){//hint
		eca_hint.click();
		return eca_hint.getAttribute("title");
	}
	
	@FindBy(id="button_ECA_icon")
	private WebElement eca_icon;
	
	@FindBy(xpath=".//*[@id='button_ECA_icon_label']/img")
	private WebElement eca_img;
	
	public String ecaIcon(){//icon
		eca_icon.click();
		return eca_img.getAttribute("src");
	}
	
	@FindBy(id="button_ECA_button05")
	private WebElement eca_onfocus1;
	
	@FindBy(xpath=".//*[@id='button_ECA_panel03']/div/div[2]/span")
	private WebElement eca_onfocus2;
	
	public int ecaOnfocus(){//onfocus
		eca_onfocus1.click();
		String[] temp = {"dijitButtonFocused", "dijitFocused"};
		return CSS.css_query(eca_onfocus2.getAttribute("class"), temp);
	}
	
	@FindBy(id="button_ECA_button04")
	private WebElement eca_button1;
	
	@FindBy(id="button_ECA_button07")
	private WebElement eca_button2;
	
	@FindBy(xpath=".//*[@id='button_ECA_button07_label']/span")
	private WebElement eca_label;
	
	public String eca_OnBlur(){//onBlur
		eca_button1.click();
		eca_button2.click();
		return eca_label.getText();
	}
	
	@FindBy(id="button_ECA_button03")
	private WebElement eca_click;

	@FindBy(id="button_ECA_button10")
	private WebElement eca_disable;
	
	public Boolean eca_disable(){//onclick_disable
		eca_click.click();
		return eca_disable.isDisplayed();
	}
	
	@FindBy(id="button_ECA_button08")
	private WebElement eca_Expclick;

	@FindBy(id="button_ECA_button09")
	private WebElement eca_Exphint;
	
	public String ecaExpHint(){//ExpHint
		eca_Expclick.click();
		(new Main_Class()).keyDown(Keys.SHIFT);
		(new Main_Class()).keyUp(Keys.SHIFT);
		eca_Exphint.click();
		return eca_Exphint.getAttribute("title");
	}
	
	@FindBy(id="button_ECA_button11")
	private WebElement eca_onKeyup;

	@FindBy(id="button_ECA_text")
	private WebElement eca_Exptext;
	
	public String ecaExponKeyup(){//onkeyup
		eca_Exptext.click();
		eca_onKeyup.click();
		(new Main_Class()).keyDown(Keys.SHIFT);
		(new Main_Class()).keyUp(Keys.SHIFT);
		return eca_onKeyup.getAttribute("aria-disabled");
	}
//###############################Button ECA#########################################
//###############################Button Appearance1#################################
	@FindBy(xpath=".//*[@id='button_appearance1_panel']/div[1]/div[2]/span/span")
	private WebElement Appearance1_1;
	
	public String Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		return Appearance1_1.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='button_appearance1_panel']/div[2]/div[2]/span/span")
	private WebElement Appearance1_2;
	
	public String Appearance1_2(){//2.Width is AutoSize,Height is Fixed 50px
		return Appearance1_2.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='button_appearance1_panel']/div[3]/div[2]/span/span")
	private WebElement Appearance1_3;
	
	public String Appearance1_3(){//3.Width is Fixed50px,Height is AutoSize
		return Appearance1_3.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='button_appearance1_panel']/div[4]/div[2]/span/span")
	private WebElement Appearance1_4;
	
	public String Appearance1_4(){//4.Width is Fixed 50px,Height is Fixed 50px
		return Appearance1_4.getAttribute("style");
	}
	
	@FindBy(xpath=".//*[@id='button_appearance1_button_label']/span")
	private WebElement Appearance1_5;
	
	public String Appearance1_5(){//5.Width textwrap is true
		return Appearance1_5.getAttribute("class");
	}
	
	@FindBy(xpath=".//*[@id='button_appearance1_button06_label']/span")
	private WebElement Appearance1_6;
	
	public String Appearance1_6(){//6.Width textwrap is false
		return Appearance1_6.getAttribute("class");
	}
//###############################Button Appearance1###############################
//###############################Button Appearance2###############################
	@FindBy(xpath=".//*[@id='button_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance2_1.getAttribute("style");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance2_2.getAttribute("style");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance2_3.getAttribute("style");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance2_4.getAttribute("style");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance2_5.getAttribute("style");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance2_6.getAttribute("style");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance2_7.getAttribute("style");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance2_8.getAttribute("style");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance2_9.getAttribute("style");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public String Appearance2_10(){//10.horizontal indent is 50px
		return Appearance2_10.getAttribute("style");
		
	}
	
	@FindBy(xpath=".//*[@id='button_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public String Appearance2_11(){//11.horizontal indent is 10percent
		return Appearance2_11.getAttribute("style");
	}
//###############################Button Appearance2###############################


}
