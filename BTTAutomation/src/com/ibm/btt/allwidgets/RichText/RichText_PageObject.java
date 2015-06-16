package com.ibm.btt.allwidgets.RichText;

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

public class RichText_PageObject extends Main_Page{
	
//###############################RichText Properties##################################
	@FindBy(xpath=".//*[@id='RichText_properties_myRichText']")
	private WebElement properties_id;
	
	public String proId(){//1. SelectList's Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="RichText_properties_richText01")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility:visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="RichText_properties_richText02")
	private WebElement properties_hidden;
	
	public String proHidden(){// 3. visibility:hidden
		return properties_hidden.getAttribute("visibility");
	}
	
	@FindBy(id="RichText_properties_richText03")
	private WebElement properties_gone;
	
	public String proGone(){//4. visibility:gone
		return properties_gone.getAttribute("visibility");
	}
	
	@FindBy(id="RichText_properties_richText04")
	private WebElement properties_readonlyTrue;

	public String proReadonlyTrue(){//5. readonly:true
		return properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="RichText_properties_richText05")
	private WebElement properties_readonlyFalse;

	public Boolean proReadonlyFlase(){//6. readonly:false
		return properties_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="RichText_properties_richText06")
	private WebElement properties_hint;
	
	public String proHint(){//11. hint is "checkedmultiselectlist hint"
		return properties_hint.getAttribute("hint");
	}
//###############################RichText Properties##################################
//###############################RichText CSS#########################################
	@FindBy(id="RichText_css_richText02")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="RichText_css_richText")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setBorder", "setColor"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="RichText_css_richText01")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setBorder", "setColor", "setBackgroundColor"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="RichText_css_richText03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitSplitterVActive"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################RichText CSS#########################################
//###############################RichText Event#######################################
	@FindBy(id="dijitEditorBody")
	private WebElement event_panel;
	
	@FindBy(id="RichText_Event_RichText_focus")
	private WebElement event_RichText1;
	
	public int evtOnClick(){//onClick
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Event_RichText_onClick_iframe");
		event_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText1.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility")
	private WebElement event_RichText2;
	
	public int evtOnFocus(){//onfocus
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Event_RichText_onClick_copy_iframe");
		event_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText2.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_01")
	private WebElement event_RichText3;
	
	@FindBy(id="RichText_Event_String_Data_copy_copy")
	private WebElement event_label;
	
	public int evtOnBlur(){//onBlur
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Event_RichText_onBlur_iframe");
		event_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		event_label.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText3.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_02")
	private WebElement event_RichText4;
	
	public int evtOnKeyDown(){//onKeyDown
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Event_RichText_onKeyDown_iframe");
		event_panel.click();
		(new AllWidgetsProjectMain_Class()).keyDown(Keys.SHIFT);
		(new AllWidgetsProjectMain_Class()).keyUp(Keys.SHIFT);
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText4.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_03")
	private WebElement event_RichText5;
	
	public int evtOnKeyPress(){//onKeyPress
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Event_RichText_onKeyPress_iframe");
		event_panel.click();
		AllWidgetsProjectMain_Class.keyPress(KeyEvent.VK_SHIFT);
		AllWidgetsProjectMain_Class.keyRelease(KeyEvent.VK_SHIFT);
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText5.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_04")
	private WebElement event_RichText6;
	
	public int evtOnKeyUp(){//onKeyUp
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Event_RichText_onKeyUp_iframe");
		event_panel.click();
		(new AllWidgetsProjectMain_Class()).keyDown(Keys.SHIFT);
		(new AllWidgetsProjectMain_Class()).keyUp(Keys.SHIFT);
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText6.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_05")
	private WebElement event_RichText7;
	
	public int evtOnMouseEnter(){//onMouseEnter
		(new AllWidgetsProjectMain_Class()).widget_moveToElement("RichText_Event_RichText_onMouseEnter");
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText7.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_06")
	private WebElement event_RichText8;
	
	public int evtOnMouseLeave(){//onMouseLeave
		(new AllWidgetsProjectMain_Class()).widget_moveToElement("RichText_Event_RichText_onMouseLeave");
		(new AllWidgetsProjectMain_Class()).widget_moveToElement("RichText_Event_RichText_onMouseEnter");
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText8.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_07")
	private WebElement event_RichText9;
	
	public int evtOnMouseMove(){//onMouseMove
		(new AllWidgetsProjectMain_Class()).widget_moveToElement("RichText_Event_RichText_onMouseMove");
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText9.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Event_RichText_visibility_08")
	private WebElement event_RichText10;
	
	@FindBy(id="RichText_Event_onChange")
	private WebElement event_onChangeLable;
	
	public int evtOnChange(){//onChange
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Event_RichText_onChange_iframe");
		event_panel.sendKeys("aaa");
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		event_onChangeLable.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(event_RichText10.getAttribute("style"), temp);
	}
	

//###############################RichText Event######################################
//###############################RichText Condition##################################
	@FindBy(id="RichText_Condition_text")
	private WebElement condition_text;
	
	@FindBy(id="dijitEditorBody")
	private WebElement condition_panel;
	
	public String conIsFocusable(){//Widget Function-isFocusable
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Condition_RichText_WidgetFunction_iframe");
		condition_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return condition_text.getAttribute("value");
	}
	
	public String conReadonly(){//Widget Property : readOnly
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Condition_RichText_WidgetProperty_iframe");
		condition_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return condition_text.getAttribute("value");
	}
	
	public String conExpIsFocusable(){//Expression-Widget Function : isFocusable
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Condition_RichText_Expression_iframe");
		condition_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return condition_text.getAttribute("value");
	}

	public String conExpId(){//Expression-Widget Property : id
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Condition_RichText_Expression_id_iframe");
		condition_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return condition_text.getAttribute("value");
	}
	
	public String conExpValue(){//Expression-Widget Property : Value
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Condition_richText_iframe");
		condition_panel.sendKeys("hello");
		condition_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return condition_text.getAttribute("value");
	}
	
	public String conExpVisibility(){//Expression-Widget Property : visibility
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Condition_RichText_Expression_visibility_iframe");
		condition_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return condition_text.getAttribute("value");
	}
	
	public String conExpReadonly(){//Expression-Widget Property : readOnly
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Condition_RichText_Expression_readOnly_iframe");
		condition_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return condition_text.getAttribute("value");
	}
	
//###############################RichText Condition##################################
//###############################RichText Action#####################################
	@FindBy(id="dijitEditorBody")
	private WebElement action_panel;
	
	@FindBy(id="RichText_Action_RichText_focus")
	private WebElement action_Focus;
	
	public int actFocus(){//Action_focus
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onClick_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"dijitEditorFocused"};
		return CSS.css_query(action_Focus.getAttribute("class"), temp);
	}

	@FindBy(id="RichText_Action_RichText_visibility")
	private WebElement action_hidden;
	
	public int actHidden(){//Action_Visibility_hidden
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onClick_copy_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(action_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="RichText_Action_RichText_visibility_01")
	private WebElement action_visible;
	
	public Boolean actVisible(){//Action_Visibility_visible
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onBlur_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		return action_visible.isDisplayed();
	}
	
	@FindBy(id="RichText_Action_RichText_visibility_02")
	private WebElement action_gone;
	
	public int actGone(){//Action_Visibility_gone
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onKeyDown_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"display: none"};
		return Appearance.appearance_query(action_gone.getAttribute("style"), temp);
	}
	
	public String actReadonlyT(){//Action_readOnly_true
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onKeyPress_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_visibility_03_iframe");
		return action_panel.getAttribute("contenteditable");
	}
	
	public String actReadonlyF(){//Action_readOnly_false
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onKeyUp_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_visibility_04_iframe");
		return action_panel.getAttribute("contenteditable");
	}
	
	@FindBy(xpath="/html/body")
	private WebElement action_hint;
	
	public String actHint(){//Action_hint "Say hello to you "
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onMouseEnter_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_visibility_05_iframe");
		return action_hint.getAttribute("title");
	}
	
	@FindBy(id="RichText_Action_RichText_visibility_06")
	private WebElement action_styleClass;
	
	public int actStyleClass(){//Action_styleClass
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_RichText_onMouseLeave_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"richTextStyle1"};
		return CSS.css_query(action_styleClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="RichText_Action_richText01")
	private WebElement ActionGroup;
	
	public int actGroup(){//ActionGroup
		(new AllWidgetsProjectMain_Class()).switchIframe("RichText_Action_richText_iframe");
		action_panel.click();
		(new AllWidgetsProjectMain_Class()).switchDefaultIframe();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(ActionGroup.getAttribute("style"), temp);
	}
	
//###############################RichText Action#####################################
//###############################RichText Appearance1################################
	@FindBy(id="RichText_appearance1_richText")
	private WebElement Appearance1_1;
	
	public String Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
		String width = Appearance1_1.getAttribute("width");
		String height = Appearance1_1.getAttribute("height");
		return width + " & " + height;
	}
	
	@FindBy(id="RichText_appearance1_richText01")
	private WebElement Appearance1_2;
	
	public String Appearance1_2(){//2.Width is AutoSize,Height is 200px
		String width = Appearance1_2.getAttribute("width");
		String height = Appearance1_2.getAttribute("height");
		return width + " & " + height;
	}
	
	@FindBy(id="RichText_appearance1_richText02")
	private WebElement Appearance1_3;
	
	public String Appearance1_3(){//3.Width is Relative 200px,Height is AutoSize
		String width = Appearance1_3.getAttribute("width");
		String height = Appearance1_3.getAttribute("height");
		return width + " & " + height;
	}
	
	@FindBy(id="RichText_appearance1_richText03")
	private WebElement Appearance1_4;
	
	public String Appearance1_4(){//4.Width is Fixed 200px,Height is Fixed 200px
		String width = Appearance1_4.getAttribute("width");
		String height = Appearance1_4.getAttribute("height");
		return width + " & " + height;
	}


	@FindBy(id="RichText_appearance1_richText04")
	private WebElement Appearance1_5;
	
	public String Appearance1_5(){//5.Width is Relative 50%,Height is AutoSize
		String width = Appearance1_5.getAttribute("width");
		String height = Appearance1_5.getAttribute("height");
		return width + " & " + height;
	}
	
	@FindBy(id="RichText_appearance1_richText05")
	private WebElement Appearance1_6;
	
	public String Appearance1_6(){//6.Width is Relative 50%,Height is Fixed 200px
		String width = Appearance1_6.getAttribute("width");
		String height = Appearance1_6.getAttribute("height");
		return width + " & " + height;
	}
	
	@FindBy(id="RichText_appearance1_richText06")
	private WebElement Appearance1_7;
	
	public String Appearance1_7(){//7.Width is Fill,Height is AutoSize
		String width = Appearance1_7.getAttribute("width");
		String height = Appearance1_7.getAttribute("height");
		return width + " & " + height;
	}
	
	@FindBy(id="RichText_appearance1_richText07")
	private WebElement Appearance1_8;
	
	public String Appearance1_8(){//8.Width is Fill,Height is Fixed 200px
		String width = Appearance1_8.getAttribute("width");
		String height = Appearance1_8.getAttribute("height");
		return width + " & " + height;
	}
//###############################RichText Appearance1###############################
//###############################RichText Appearance2###############################
	@FindBy(xpath=".//*[@id='RichText_appearance2_group']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group07']/div/div/div[1]/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public int Appearance2_10(){//10.horizontal indent is 50px
		String[] temp={"padding-left: 50px"};
		return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='RichText_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public int Appearance2_11(){//11.horizontal indent is 10percent
		String[] temp={"padding-left: 10%"};
		return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
	}
//###############################RichText Appearance2###############################
//###############################RichText Submit####################################
//form
//###############################RichText Submit####################################



}
