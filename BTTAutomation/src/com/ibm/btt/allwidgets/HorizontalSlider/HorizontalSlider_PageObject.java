package com.ibm.btt.allwidgets.HorizontalSlider;

import java.awt.event.KeyEvent;
import java.util.List;

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

public class HorizontalSlider_PageObject extends Main_Page{
	
//###############################HorizontalSlider Properties##################################
//HorizontalSlider properties	
	@FindBy(xpath=".//*[@id='MultiSelect_properties_multiSelect']")
	private WebElement properties_id;
	
	public String proId(){//1. SelectList's Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility:visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy01")
	private WebElement properties_hidden;
	
	public String proHidden(){// 3. visibility:hidden
		return properties_hidden.getAttribute("style");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy09")
	private WebElement properties_gone;
	
	public String proGone(){//4. visibility:gone
		return properties_gone.getAttribute("style");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy02")
	private WebElement properties_disableTrue;
	
	public String proDisableTrue(){//5. disabled:true
		return properties_disableTrue.getAttribute("disabled");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy03")
	private WebElement properties_disableFalse;
	
	public Boolean proDisableFlase(){//6. disable:false
		return properties_disableFalse.isEnabled();
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy04")
	private WebElement properties_readonlyTrue;

	public String proReadonly(){//7. readonly:true
		return properties_readonlyTrue.getAttribute("readonly");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy05")
	private WebElement properties_readonlyFalse;

	public Boolean proReadonlyFlase(){//8. readonly:false
		return properties_readonlyFalse.isEnabled();
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy06")
	private WebElement properties_shortcut;
	
	public int proShortcut(){//9. shortcut is 'c'(shift+alt+c)
		Main_Class.keyPress(KeyEvent.VK_SHIFT);
		Main_Class.keyPress(KeyEvent.VK_ALT);
		Main_Class.keyPress(KeyEvent.VK_C);
		Main_Class.keyRelease(KeyEvent.VK_SHIFT);
		Main_Class.keyRelease(KeyEvent.VK_ALT);
		Main_Class.keyRelease(KeyEvent.VK_C);
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	public int proTabIndex3(){//tabIndex = 3
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_shortcut.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy07")
	private WebElement properties_hintNLS;
	
	public String proHintNLS(){//10. hint(NLS) is "%nls.bttsample/hint_test"
		return properties_hintNLS.getAttribute("title");
	}
	
	public int proTabIndex1(){//tabIndex = 1
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_hintNLS.getAttribute("class"), temp);
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy07_copy")
	private WebElement properties_hint;
	
	public String proHint(){//11. SelectList's readOnly = false 
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="MultiSelect_properties_multiSelect_copy08")
	private WebElement properties_tabIndex2;
	
	public String proTabIndex2(){//12. tabIndex = 2
		return properties_tabIndex2.getAttribute("tabindex");
	}
	
	public int proTabIndex2Focus(){//tabIndex = 2
		String[] temp = {"bttMultiSelectFocused", "dijitFocused"};
		return CSS.css_query(properties_tabIndex2.getAttribute("class"), temp);
	}
//###############################HorizontalSlider Properties##################################
//###############################HorizontalSlider CSS#########################################
	@FindBy(xpath=".//*[@id='HorizontalSlider_css_form']/div/div[2]/div[3]/table")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setFontStyle"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_css_form']/div/div[4]/div[3]/table")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"mybankSlider", "setFontStyle"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_css_form']/div/div[5]/div[3]/table")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setFontWeight", "setFontStyle", "mybankSlider"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_css_form']/div/div[6]/div[3]/table")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"claro"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################HorizontalSlider CSS#########################################
//###############################HorizontalSlider Event#######################################
	@FindBy(id="HorizontalSlider_event_horizontalSlider")
	private WebElement event_onClick;
	
	@FindBy(id="HorizontalSlider_event_label02")
	private WebElement event_label1; 
	
	public String evtOnClick(){ //onClick
		event_onClick.click();
		return event_label1.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider01")
	private WebElement event_onDoubleClick;
	
	@FindBy(id="HorizontalSlider_event_label04")
	private WebElement event_label2; 
	
	public String evtOnDbClick(){ //onDoubleClick
		Main_Class main_class = new Main_Class();
		main_class.doubleClick("HorizontalSlider_event_horizontalSlider01");
		return event_label2.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider02")
	private WebElement event_onKeyDown;
	
	@FindBy(id="HorizontalSlider_event_label06")
	private WebElement event_label3;
	
	public String evtOnKeyDown(){ //onKeyDown
		event_onKeyDown.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label3.getText();
	}
	@FindBy(id="HorizontalSlider_event_horizontalSlider03")
	private WebElement event_onKeyPress;
	
	@FindBy(id="HorizontalSlider_event_label08")
	private WebElement event_label4;
	
	public String evtOnKeyPress(){ //onKeyPress
		event_onKeyPress.click();
		Main_Class.keyPress(KeyEvent.VK_0);
		Main_Class.keyRelease(KeyEvent.VK_0);
		return event_label4.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider04")
	private WebElement event_onKeyUp;
	
	@FindBy(id="HorizontalSlider_event_label14")
	private WebElement event_label5;
	
	public String evtOnKeyUP(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
		main_class.keyDown(Keys.SHIFT);
		main_class.keyUp(Keys.SHIFT);
		return event_label5.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider05")
	private WebElement event_onMouseDown;
	
	@FindBy(id="HorizontalSlider_event_label15")
	private WebElement event_label6;
	
	public String evtOnMouseDown(){ //onMouseDown
		event_onMouseDown.click();
		return event_label6.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_label16")
	private WebElement event_label7;

	public String evtOnMouseEnter(){ //onMouseEnter
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("HorizontalSlider_event_horizontalSlider06");
		return event_label7.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_label17")
	private WebElement event_label8;

	public String evtOnMouseLeave1(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("HorizontalSlider_event_horizontalSlider07");
		main_class.widget_moveToElement("HorizontalSlider_event_label17");
		return event_label8.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_label18")
	private WebElement event_label9;

	public String evtOnMouseLeave2(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("HorizontalSlider_event_horizontalSlider08");
		main_class.widget_moveToElement("HorizontalSlider_event_label18");
		return event_label9.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_label21")
	private WebElement event_label10;
	
	public String evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("HorizontalSlider_event_horizontalSlider09");
		return event_label10.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider10")
	private WebElement event_onMouseOut;
	
	@FindBy(id="HorizontalSlider_event_label22")
	private WebElement event_label11;
	
	public String evtOnMouseOut(){ //onMouseOut
		event_onMouseOut.click();
		event_label11.click();
		return event_label11.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_label23")
	private WebElement event_label12;
	
	public String evtOnMouseOver(){ //onMouseOver
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("HorizontalSlider_event_horizontalSlider11");
		return event_label12.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider12")
	private WebElement event_onMouseUp;
	
	@FindBy(id="HorizontalSlider_event_label27")
	private WebElement event_label13;
	
	public String evtOnMouseUp(){ //onMouseUp
		event_onMouseUp.click();
		return event_label13.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider13")
	private WebElement event_onFocus;
	
	@FindBy(id="HorizontalSlider_event_label28")
	private WebElement event_label14;
	
	public String evtOnFocus(){ //onFocus
		event_onFocus.click();
		return event_label14.getText();
	}
	
	@FindBy(id="HorizontalSlider_event_horizontalSlider14")
	private WebElement event_onBlur;
	
	@FindBy(id="HorizontalSlider_event_label29")
	private WebElement event_label15;
	
	public String evtOnBlur(){ //onBlur
		event_onBlur.click();
		event_label15.click();
		return event_label15.getText();
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_event_horizontalSlider15']/tbody/tr[2]/td[5]/div")
	private WebElement event_onChange;
	
	@FindBy(id="HorizontalSlider_event_label33")
	private WebElement event_label16;
	
	public String evtOnChange(){ //onChange
		event_onChange.click();
		return event_label16.getText();
	}
//###############################HorizontalSlider Event######################################
//###############################HorizontalSlider Condition##################################
// Widget property	
		@FindBy(xpath=".//*[@id='HorizontalSlider_condition_horizontalSlider02']/tbody/tr[2]/td[1]/div")
		private WebElement condition_Focused;
		
		@FindBy(id="HorizontalSlider_condition_label10")
		private WebElement condition_label2;
		
		public String conFocused(){//Focused
			condition_Focused.click();
			return condition_label2.getText();
		}
		
		@FindBy(xpath=".//*[@id='HorizontalSlider_condition_horizontalSlider03']/tbody/tr[2]/td[3]/div/div[1]/div/div")
		private WebElement condition_disabled;
		
		@FindBy(id="HorizontalSlider_condition_label11")
		private WebElement condition_label3;
		
		public String conDisabled(){//Disabled
			condition_disabled.click();
			return condition_label3.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider04")
		private WebElement condition_readonly;
		
		@FindBy(id="HorizontalSlider_condition_label12")
		private WebElement condition_label4;
		
		public String conReadonly(){//readonly
			condition_readonly.click();
			return condition_label4.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider01")
		private WebElement condition_clickSelect;
		
		@FindBy(id="HorizontalSlider_condition_label13")
		private WebElement condition_label5;
		
		public String conClickSelect(){//clickSelect
			condition_clickSelect.click();
			return condition_label5.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider05")
		private WebElement condition_hovering;
		
		@FindBy(id="HorizontalSlider_condition_label14")
		private WebElement condition_label6;
		
		public String conHover(){//hovering
			condition_hovering.click();
			return condition_label6.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider06")
		private WebElement condition_intermediatechanges;
		
		@FindBy(id="HorizontalSlider_condition_label18")
		private WebElement condition_label7;
		
		public String conHntermediatechanges(){//intermediatechanges
			condition_intermediatechanges.click();
			return condition_label7.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider07")
		private WebElement condition_showButtons;
		
		@FindBy(id="HorizontalSlider_condition_label19")
		private WebElement condition_label8;
		
		public String conShowButtons(){//showButtons
			condition_showButtons.click();
			return condition_label8.getText();
		}
// Expression Widget function	
/*		@FindBy(id="VerticalSlider_condition_verticalSlider01")
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
		}*/
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider10")
		private WebElement condition_compare;
		
		@FindBy(id="HorizontalSlider_condition_label26")
		private WebElement condition_label11;
		
		public String conExpCompare(){//compare(var1,var2)
			condition_compare.click();
			return condition_label11.getText();
		}
		
	/*	@FindBy(id="VerticalSlider_condition_label29")
		private WebElement condition_click;
		
		@FindBy(id="VerticalSlider_condition_label74")
		private WebElement condition_clickHere12;
		
		@FindBy(id="VerticalSlider_condition_label28")
		private WebElement condition_label12;
		
		public String conExpFocus(){//focus()--void
			condition_click.click();
			condition_Expression.click();
			condition_clickHere12.click();
			return condition_label12.getText();
		}*/
		
		@FindBy(id="HorizontalSlider_condition_label29")
		private WebElement condition_click;
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider12")
		private WebElement condition_ExpisFocusable;
		
		@FindBy(id="HorizontalSlider_condition_label28")
		private WebElement condition_label12;
		
		public String conExpisFocusable(){//isFocusable
			condition_click.click();
			condition_ExpisFocusable.click();
			return condition_label12.getText();
		}
		
//Expression Widget property
		@FindBy(id="HorizontalSlider_condition_test1")
		private WebElement condition_id;
		
		@FindBy(id="HorizontalSlider_condition_label34")
		private WebElement condition_label13;
		
		public String conProId(){//id
			condition_id.click();
			return condition_label13.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider16")
		private WebElement condition_focus;
		
		@FindBy(id="HorizontalSlider_condition_label35")
		private WebElement condition_label14;
		
		public String conProFocus(){//focus
			condition_focus.click();
			return condition_label14.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider17")
		private WebElement condition_disable;
		
		@FindBy(id="HorizontalSlider_condition_label37")
		private WebElement condition_label15;
		
		public String conProDisabled(){//disabled
			condition_label15.click();
			return condition_label15.getText();
		}
		
		@FindBy(xpath=".//*[@id='HorizontalSlider_condition_horizontalSlider08']/tbody/tr[2]/td[3]/div/div[1]/div/div")
		private WebElement condition_value;
		
		@FindBy(id="HorizontalSlider_condition_label40")
		private WebElement condition_label16;
		
		public String conProValue(){//value
			condition_value.click();
			return condition_label16.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider18")
		private WebElement condition_WidgetName;
		
		@FindBy(id="HorizontalSlider_condition_label41")
		private WebElement condition_label17;
		
		public String conProWidgetName(){//WidgetName
			condition_WidgetName.click();
			return condition_label17.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider19")
		private WebElement condition_Readonly;
		
		@FindBy(id="HorizontalSlider_condition_label42")
		private WebElement condition_label18;
		
		public String conProReadonly(){//Readonly
			condition_Readonly.click();
			return condition_label18.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider15")
		private WebElement condition_ClickSelect;
		
		@FindBy(id="HorizontalSlider_condition_label50")
		private WebElement condition_label19;
		
		public String conProClickSelect(){//ClickSelect
			condition_ClickSelect.click();
			return condition_label19.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider20")
		private WebElement condition_discreateValues;
		
		@FindBy(id="HorizontalSlider_condition_label51")
		private WebElement condition_label20;
		
		public String conProDiscreateValues(){//discreateValues
			condition_discreateValues.click();
			return condition_label20.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider21")
		private WebElement condition_Hovering;
		
		@FindBy(id="HorizontalSlider_condition_label52")
		private WebElement condition_label21;
		
		public String conProHovering(){//Hovering
			condition_Hovering.click();
			return condition_label21.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider22")
		private WebElement condition_intermediaChanges;
		
		@FindBy(id="HorizontalSlider_condition_label53")
		private WebElement condition_label22;
		
		public String conProintermediaChanges(){//intermediaChanges
			condition_intermediaChanges.click();
			return condition_label22.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider23")
		private WebElement condition_Maximum;
		
		@FindBy(id="HorizontalSlider_condition_label56")
		private WebElement condition_label23;
		
		public String conProMaximum(){//Maximum
			condition_Maximum.click();
			return condition_label23.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider24")
		private WebElement condition_Minimum;
		
		@FindBy(id="HorizontalSlider_condition_label57")
		private WebElement condition_label24;
		
		public String conProMinimum(){//Minimum
			condition_Minimum.click();
			return condition_label24.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider25")
		private WebElement condition_pageIncrement;
		
		@FindBy(id="HorizontalSlider_condition_label58")
		private WebElement condition_label25;
		
		public String conPropageIncrement(){//pageIncrement
			condition_pageIncrement.click();
			return condition_label25.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider26")
		private WebElement condition_ProshowButtons;
		
		@FindBy(id="HorizontalSlider_condition_label63")
		private WebElement condition_label26;
		
		public String conProshowButtons(){//showButtons
			condition_ProshowButtons.click();
			return condition_label26.getText();
		}
		
		@FindBy(id="HorizontalSlider_condition_horizontalSlider27")
		private WebElement condition_slideDuration;
		
		@FindBy(id="HorizontalSlider_condition_label64")
		private WebElement condition_label27;
		
		public String conProslideDuration(){//slideDuration
			condition_slideDuration.click();
			return condition_label27.getText();
		}
		
//###############################HorizontalSlider Condition##################################
//###############################HorizontalSlider Action#####################################
		@FindBy(id="HorizontalSlider_action_label02")
		private WebElement action_label1;
		
		public String actGetName(){//Click to get(name)
			action_label1.click();
			return action_label1.getText();
		}
		
		@FindBy(id="HorizontalSlider_action_label04")
		private WebElement action_label2;
		
		public String actSetName(){//Click to set(name,value)
			action_label2.click();
			return action_label2.getText();
		}
		
		@FindBy(id="HorizontalSlider_action_label05")
		private WebElement action_label3;
		
		public String actCompare(){//Click to compare(var1,var2)
			action_label3.click();
			return action_label3.getText();
		}
		
		@FindBy(id="HorizontalSlider_action_horizontalSlider03")
		private WebElement action_focus;
		
		@FindBy(id="HorizontalSlider_action_label06")
		private WebElement action_label4;
		
		public int actFocus(){//Click to focus VerticalSlider
			action_label4.click();
			String[] temp = {"dijitSliderFocused", "dijitFocused"};
			return CSS.css_query(action_focus.getAttribute("class"), temp);
		}
		
		@FindBy(xpath=".//*[@id='HorizontalSlider_action_horizontalSlider05']/tbody/tr[2]/td[5]/div")
		private WebElement action_reset;
		
		@FindBy(xpath=".//*[@id='HorizontalSlider_action_horizontalSlider05']/tbody/tr[2]/td[3]/div/div[1]/div/div")
		private WebElement action_value;
		
		@FindBy(id="HorizontalSlider_action_label11")
		private WebElement action_label6;
		
		public String actReset(){//Click here to reset VerticalSlider
			action_reset.click();
			action_label6.click();
			return action_value.getAttribute("aria-valuenow");
		}
//###############################HorizontalSlider Action#####################################
//###############################HorizontalSlider Appearance1################################
	@FindBy(id="HorizontalSlider_appearance1_horizontalSlider")
	private WebElement Appearance1_1;
	
	public String Appearance1_1(){//1.Width is AutoSize
		return Appearance1_1.getAttribute("style");
	}
	
	@FindBy(id="HorizontalSlider_appearance1_horizontalSlider01")
	private WebElement Appearance1_2;
	
	public String Appearance1_2(){//2.Width is Fixed 400px
		return Appearance1_2.getAttribute("style");
	}
	
	@FindBy(id="HorizontalSlider_appearance1_horizontalSlider02")
	private WebElement Appearance1_3;
	
	public String Appearance1_3(){//3.Width is Fill
		return Appearance1_3.getAttribute("style");
	}
	
	@FindBy(id="HorizontalSlider_appearance1_horizontalSlider03")
	private WebElement Appearance1_4;
	
	public String Appearance1_4(){//4.Width is Relative 80%
		return Appearance1_4.getAttribute("style");
	}
//###############################HorizontalSlider Appearance1###############################
//###############################HorizontalSlider Appearance2###############################
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group04_copy']/div/div/div/div")
	private WebElement Appearance2_1;
	
	public String Appearance2_1(){//1.horizontal is left,vertical is top
		String v = Appearance2_1.getAttribute("style");
		String h = Appearance2_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group04_copy01']/div/div/div/div")
	private WebElement Appearance2_2;
	
	public String Appearance2_2(){//2.horizontal is left,vertical is center
		String v = Appearance2_2.getAttribute("style");
		String h = Appearance2_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group04_copy02']/div/div/div/div")
	private WebElement Appearance2_3;
	
	public String Appearance2_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance2_3.getAttribute("style");
		String h = Appearance2_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group04_copy03']/div/div/div/div")
	private WebElement Appearance2_4;
	
	public String Appearance2_4(){//4.horizontal is center,vertical is top
		String v = Appearance2_4.getAttribute("style");
		String h = Appearance2_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group04']/div/div/div/div")
	private WebElement Appearance2_5;
	
	public String Appearance2_5(){//5.horizontal is center,vertical is center
		String v = Appearance2_5.getAttribute("style");
		String h = Appearance2_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group05']/div/div/div/div")
	private WebElement Appearance2_6;
	
	public String Appearance2_6(){//6.horizontal is center,vertical is bottom
		String v = Appearance2_6.getAttribute("style");
		String h = Appearance2_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group06']/div/div/div/div")
	private WebElement Appearance2_7;
	
	public String Appearance2_7(){//7.horizontal is right,vertical is top
		String v = Appearance2_7.getAttribute("style");
		String h = Appearance2_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group07']/div/div/div/div")
	private WebElement Appearance2_8;
	
	public String Appearance2_8(){//8.horizontal is right,vertical is center
		String v = Appearance2_8.getAttribute("style");
		String h = Appearance2_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group08']/div/div/div/div")
	private WebElement Appearance2_9;
	
	public String Appearance2_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance2_9.getAttribute("style");
		String h = Appearance2_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group09']/div/div/div/div")
	private WebElement Appearance2_10;
	
	public String Appearance2_10(){//10.horizontal indent is 50px
		return Appearance2_10.getAttribute("style");
		
	}
	
	@FindBy(xpath=".//*[@id='HorizontalSlider_appearance2_group10']/div/div/div/div")
	private WebElement Appearance2_11;
	
	public String Appearance2_11(){//11.horizontal indent is 10percent
		return Appearance2_11.getAttribute("style");
	}
//###############################HorizontalSlider Appearance2###############################
//###############################HorizontalSlider Submit####################################
	@FindBy(xpath=".//*[@id='HorizontalSlider_submit_horizontalSlider01']/tbody/tr[2]/td[5]/div")
	private WebElement submit_value;
	
	@FindBy(id="HorizontalSlider_submit_button")
	private WebElement submit_button;
	
	@FindBy(id="HorizontalSlider_submit_result_label")
	private WebElement submit_result;
	
	public String submit(){
		submit_value.click();
		submit_button.click();
		return submit_result.getText();
	}
//###############################HorizontalSlider Submit####################################



}
