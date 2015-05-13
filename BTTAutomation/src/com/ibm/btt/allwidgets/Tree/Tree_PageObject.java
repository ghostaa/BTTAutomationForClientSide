package com.ibm.btt.allwidgets.Tree;

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

public class Tree_PageObject extends Main_Page{
	
//###############################Tree Properties##################################
	@FindBy(xpath=".//*[@id='tree_properties_panel']/tbody/tr[1]/td[2]/div")
	private WebElement properties_id;
	
	public String proId(){//1.Id
		return properties_id.getAttribute("id");
	}
	
	@FindBy(id="tree_properties_tree")
	private WebElement properties_visible;
	
	public Boolean proVisible(){//2. visibility = visible
		return properties_visible.isDisplayed();
	}
	
	@FindBy(id="tree_properties_tree01")
	private WebElement properties_hidden;

	public int proHidden(){//3.  visibility = hidden
		String[] temp = {"visibility: hidden"};
		return Appearance.appearance_query(properties_hidden.getAttribute("style"), temp);
	}
	
	@FindBy(id="tree_properties_tree02")
	private WebElement properties_gone;

	public int proGone(){//4.  visibility = gone
		String[] temp = {"display: none"};
		return Appearance.appearance_query(properties_gone.getAttribute("style"), temp);
	}
	
	@FindBy(id="tree_properties_tree03")
	private WebElement properties_hint;
	
	public String proHint(){//5.  hint 
		return properties_hint.getAttribute("title");
	}
	
	@FindBy(id="tree_properties_tree04")
	private WebElement properties_NLSHint;

	public String proNLSHint(){//6.  hint nls
		return properties_NLSHint.getAttribute("title");
	}
	
//###############################Tree Properties##################################
//###############################Tree CSS#########################################
	@FindBy(id="tree_css_tree")
	private WebElement css_style1;
	
	public int css_style1(){//only have one type of style
		String[] temp = {"setBackgroundColor"};
		return CSS.css_query(css_style1.getAttribute("class"), temp);
	}
	
	@FindBy(id="tree_css_tree01")
	private WebElement css_style2;
	
	public int css_style2(){//have two types of style
		String[] temp = {"setBackgroundColor", "setBorder"};
		return CSS.css_query(css_style2.getAttribute("class"), temp);
	}
	
	@FindBy(id="tree_css_tree02")
	private WebElement css_style3;
	
	public int css_style3(){//have three types of style
		String[] temp = {"setBorder", "setFontStyle", "setFontWeight"};
		return CSS.css_query(css_style3.getAttribute("class"), temp);
	}
	
	@FindBy(id="tree_css_tree03")
	private WebElement css_style4;
	
	public int css_style4(){//preload css
		String[] temp = {"dijitSplitterHActive"};
		return CSS.css_query(css_style4.getAttribute("class"), temp);
	}
//###############################Tree CSS#########################################
//###############################Tree Event#######################################
	@FindBy(id="Tree_event_label")
	private WebElement event_label1;
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_1']/div[1]")
	private WebElement event_onClick; 
	
	public String evtOnClick(){ //onClick
		event_onClick.click();
		return event_label1.getText();
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
		Main_Class main_class = new Main_Class();
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
		Main_Class.keyPress(KeyEvent.VK_1);
		Main_Class.keyRelease(KeyEvent.VK_1);
		return event_label5.getText();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_11']/div[1]")
	private WebElement event_onKeyUp; 
	
	@FindBy(id="Tree_event_label05")
	private WebElement event_label6;
	
	public String evtOnKeyUp(){ //onKeyUp
		event_onKeyUp.click();
		Main_Class main_class = new Main_Class();
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
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Tree_event_tree08");
		return event_label9.getText();
	}
	
	@FindBy(id="Tree_event_tree09")
	private WebElement event_onMouseLeave; 
	
	@FindBy(id="Tree_event_label09")
	private WebElement event_label10;

	public String evtOnMouseLeave(){ //onMouseLeave
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Tree_event_tree09");
		main_class.widget_moveToElement("Tree_event_label09");
		return event_label10.getText();
	}
	
	@FindBy(id="Tree_event_tree10")
	private WebElement event_onMouseMove; 
	
	@FindBy(id="Tree_event_label10")
	private WebElement event_label11;
	
	public String evtOnMouseMove(){ //onMouseMove
		Main_Class main_class = new Main_Class();
		main_class.widget_moveToElement("Tree_event_tree10");
		return event_label11.getText();
	}

//###############################Tree Event#######################################
//###############################Tree Condition###################################
	@FindBy(xpath=".//*[@id='dijit__TreeNode_1']/div[1]")
	private WebElement condition_TreeNode;
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_2']/div[1]/span[1]")
	private WebElement condition_nodeExtend;
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_5']/div[1]/span[3]/span[1]")
	private WebElement condition_node2_1;
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_6_label']")
	private WebElement condition_node3_1;
	
	@FindBy(xpath=".//*[@id='Tree_condition_message']/div[1]/span[1]")
	private WebElement condtion_message;
	
	@FindBy(id="Tree_condition_button06")
	private WebElement condition_button1;
	
	public String conIsFocusable(){//1.verify focus
		condition_TreeNode.click();
		condition_button1.click();
		return condtion_message.getText();
	}
	
	@FindBy(id="Tree_condition_button01")
	private WebElement condition_button2;
	
	public String conSelectedLable(){//2. verify SelectedLabel
		condition_nodeExtend.click();
		condition_node2_1.click();
		condition_button2.click();
		return condtion_message.getText();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_3']/div[1]/span[1]")
	private WebElement condition_node2;
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_7_label']")
	private WebElement condition_subnode;
	
	@FindBy(id="Tree_condition_button02")
	private WebElement condition_button3;
	
	public String conNLS(){//3. verify selected label NLS
		condition_node2.click();
		condition_subnode.click();
		condition_button3.click();
		return condtion_message.getText();
	}
	
	@FindBy(id="Tree_condition_button03")
	private WebElement condition_button4;
	
	public String conSelectedValue(){//4. verify SelectedValue
//		condition_nodeExtend.click();
		condition_node3_1.click();
		condition_button4.click();
		return condtion_message.getText();
	}
	
	@FindBy(id="Tree_condition_button")
	private WebElement condition_button5;
	
	public String conFocus(){//5. verify focus
		condition_button5.click();
		return condtion_message.getText();
	}
		
	@FindBy(id="Tree_condition_verify tree id")
	private WebElement condition_button6;
	
	public String conTreeId(){//6.verify Tree ID
		condition_button6.click();
		return condtion_message.getText();
	}
	
	@FindBy(id="Tree_condition_button04")
	private WebElement condition_button7;
	
	public String conVisibility(){//7.verify visibility
		condition_button7.click();
		return condtion_message.getText();
	}
	
	@FindBy(id="Tree_condition_button05")
	private WebElement condition_button8;
	
	public String conValue(){//8. Verify value
		condition_button8.click();
		return condtion_message.getText();
	}

	@FindBy(id="Tree_condition_get tree id")
	private WebElement condition_button9;
	
	public String conGetID(){//9.Get Tree id
		condition_button9.click();
		return condtion_message.getText();
	}

//###############################Tree Condition###################################
//###############################Tree Action######################################
	@FindBy(xpath=".//*[@id='Tree_action_message']/div[1]/span[1]")
	private WebElement actionMessage; //message
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_16']/div[1]")
	private WebElement actionClick1; //action Click here 1
	
	@FindBy(id="Tree_action_button")
	private WebElement actionButton1; 
	
	public String actGetSelectLabel(){// 	Invoke Widget Function : getSelectedLabel()
		actionClick1.click();
		actionButton1.click();
		return actionMessage.getText();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_20_label']")
	private WebElement actionClick2;//action Click 2
	
	@FindBy(id="Tree_action_button_copy")
	private WebElement actionButton2;
	
	public String actGetLabelNLS(){//Invoke Widget Function : getSelectedLabelNLS()
		actionClick2.click();
		actionButton2.click();
		return actionMessage.getText();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_22']/div[1]")
	private WebElement actionClick3;//action Click here 3
	
	@FindBy(id="Tree_action_button01")
	private WebElement actionButton3;
	
	public String actGetSelectedVal(){//Invoke Widget Function : getSelectedValue()
		actionClick3.click();
		actionButton3.click();
		return actionMessage.getText();
	}
	
	@FindBy(id="Tree_action_button01_copy")
	private WebElement actionButton4; //action Click here 4
	
	@FindBy(id="Tree_action_tree")
	private WebElement action_styleClass;
	
	public int actStyleClass(){//Set Widget Property : styleClass
		actionButton4.click();
		String[] temp = {"treeStyle"};
		return CSS.css_query(action_styleClass.getAttribute("class"), temp);
	}
	
	@FindBy(id="Tree_action_button01_copy_copy")
	private WebElement actionButton5;//action Click here 5
	
	public String actValue(){//Set Widget Property : value
		actionButton5.click();
		return actionMessage.getText();
	}
	
	@FindBy(id="Tree_action_button01_copy_copy_copy")
	private WebElement actionButton6;
	
	@FindBy(id="Tree_action_tree06")
	private WebElement action_hint;
	
	public String actHint(){//Set Widget Property : hint
		actionButton6.click();
		return action_hint.getAttribute("title");
	}
	
	
	@FindBy(id="Tree_action_tree04")
	private WebElement actionVisibility;
	
	@FindBy(id="Tree_action_hidden")
	private WebElement action_hidden;
	
	public int actHidden(){//Set Widget Property : visibility = hidden
		action_hidden.click();
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(actionVisibility.getAttribute("style"), temp);
	}
	
	@FindBy(id="Tree_action_gone")
	private WebElement action_gone;
	
	public int actGone(){//Set Widget Property : visibility = gone
		action_gone.click();
		String[] temp={"display: none"};
		return Appearance.appearance_query(actionVisibility.getAttribute("style"), temp);
	}
	
	@FindBy(id="Tree_action_visible")
	private WebElement action_visible;
	
	public Boolean actVisible(){//Set Widget Property : visibility = visible
		action_visible.click();
		return actionVisibility.isDisplayed();
	}
	
	@FindBy(xpath=".//*[@id='dijit__TreeNode_37']/div[1]")
	private WebElement actionClickNode;
	
	@FindBy(id="Tree_action_tree04_copy")
	private WebElement actionGroup;
	
	@FindBy(id="Tree_action_button01_copy_copy_copy_copy")
	private WebElement actionButton;
	
	public int actGroup(){//Action Group
		actionClickNode.click();
		actionButton.click();
		String[] temp={"treeStyle"};
		return CSS.css_query(actionGroup.getAttribute("class"), temp);
	}
	
	public String actGroupMessage(){
		return actionMessage.getText();
	}
	
//###############################Tree Action######################################
//###############################Tree Appearance1#################################
		@FindBy(id="tree_appearance1_tree")
		private WebElement Appearance1_1;
		
		public int Appearance1_1(){//1.Width is AutoSize,Height is AutoSize
			String[] temp = {""};
			return Appearance.appearance_query(Appearance1_1.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree01")
		private WebElement Appearance1_2;
		
		public int Appearance1_2(){//2.Width is AutoSize,Height is Fixed 150px
			String[] temp = {"height: 150px"};
			return Appearance.appearance_query(Appearance1_2.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree02")
		private WebElement Appearance1_3;
		
		public int Appearance1_3(){//3.Width is AutoSize,Height is Relative 100%
			String[] temp = {"height: 100%"};
			return Appearance.appearance_query(Appearance1_3.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree03")
		private WebElement Appearance1_4;
		
		public int Appearance1_4(){//4.Width is AutoSize,Height is Fill
			String[] temp = {"height: 100%"};
			return Appearance.appearance_query(Appearance1_4.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree04")
		private WebElement Appearance1_5;
		
		public int Appearance1_5(){//5.Width is Fixed 150px,Height is AutoSize
			String[] temp = {"width: 150px"};
			return Appearance.appearance_query(Appearance1_5.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree05")
		private WebElement Appearance1_6;
		
		public int Appearance1_6(){//6.Width is Fixed 150px,Height is Fixed 150px
			String[] temp = {"width: 150px", "height: 150px"};
			return Appearance.appearance_query(Appearance1_6.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree06")
		private WebElement Appearance1_7;
		
		public int Appearance1_7(){//7.Width is Fixed 150px,Height is Relative 100%
			String[] temp = {"width: 150px", "height: 100%"};
			return Appearance.appearance_query(Appearance1_7.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree07")
		private WebElement Appearance1_8;
		
		public int Appearance1_8(){//8.Width is Fixed 150px,Height is Fill
			String[] temp = {"width: 150px", "height: 100%"};
			return Appearance.appearance_query(Appearance1_8.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree08")
		private WebElement Appearance1_9;
		
		public int Appearance1_9(){//9.Width is Relative 50%,Height is AutoSize
			String[] temp = {"width: 50%"};
			return Appearance.appearance_query(Appearance1_9.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree09")
		private WebElement Appearance1_10;
		
		public int Appearance1_10(){//10.Width is Relative 50%,Height is Fixed 150px
			String[] temp = {"width: 50%", "height: 150px"};
			return Appearance.appearance_query(Appearance1_10.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree10")
		private WebElement Appearance1_11;
		
		public int Appearance1_11(){//11.Width is Relative 50%,Height is Relative 100%
			String[] temp = {"width: 50%", "height: 100%"};
			return Appearance.appearance_query(Appearance1_11.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree11")
		private WebElement Appearance1_12;
		
		public int Appearance1_12(){//12.Width is Relative 50%,Height is Fill
			String[] temp = {"width: 50%", "height: 100%"};
			return Appearance.appearance_query(Appearance1_12.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree12")
		private WebElement Appearance1_13;
		
		public int Appearance1_13(){//13.Width is Fill,Height is AutoSize 
			String[] temp = {"width: 100%"};
			return Appearance.appearance_query(Appearance1_13.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree13")
		private WebElement Appearance1_14;
		
		public int Appearance1_14(){//14.Width is Fill,Height is Fixed 150px
			String[] temp = {"width: 100%", "height: 150px"};
			return Appearance.appearance_query(Appearance1_14.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree14")
		private WebElement Appearance1_15;
		
		public int Appearance1_15(){//15.Width is Fill,Height is Relatvie 50%
			String[] temp = {"width: 100%", "height: 50%"};
			return Appearance.appearance_query(Appearance1_15.getAttribute("style"), temp);
		}
		
		@FindBy(id="tree_appearance1_tree15")
		private WebElement Appearance1_16;
		
		public int Appearance1_16(){//16.Width is Fill,Height is Fill
			String[] temp = {"width: 100%", "height: 100%"};
			return Appearance.appearance_query(Appearance1_16.getAttribute("style"), temp);
		}

//###############################Tree Appearance1###################################
//###############################Tree Appearance2###################################
		@FindBy(xpath=".//*[@id='tree_appearance2_group']/div/div/div/div")
		private WebElement Appearance2_1;
		
		public String Appearance2_1(){//1.horizontal is left,vertical is top
			String v = Appearance.appearance_place(Appearance2_1.getAttribute("style"), "top");
			String h = Appearance2_1.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group01']/div/div/div/div")
		private WebElement Appearance2_2;
		
		public String Appearance2_2(){//2.horizontal is left,vertical is center
			String v = Appearance.appearance_place(Appearance2_2.getAttribute("style"), "middle");
			String h = Appearance2_2.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group02']/div/div/div/div")
		private WebElement Appearance2_3;
		
		public String Appearance2_3(){//3.horizontal is left,vertical is bottom
			String v = Appearance.appearance_place(Appearance2_3.getAttribute("style"), "bottom");
			String h = Appearance2_3.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group03']/div/div/div/div")
		private WebElement Appearance2_4;
		
		public String Appearance2_4(){//4.horizontal is center,vertical is top
			String v = Appearance.appearance_place(Appearance2_4.getAttribute("style"), "top");
			String h = Appearance2_4.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group04']/div/div/div[1]/div")
		private WebElement Appearance2_5;
		
		public String Appearance2_5(){//5.horizontal is center,vertical is center
			String v = Appearance.appearance_place(Appearance2_5.getAttribute("style"), "middle");
			String h = Appearance2_5.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group05']/div/div/div/div")
		private WebElement Appearance2_6;
		
		public String Appearance2_6(){//6.horizontal is center,vertical is bottom
			String v =Appearance.appearance_place(Appearance2_6.getAttribute("style"), "bottom");
			String h = Appearance2_6.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group06']/div/div/div/div")
		private WebElement Appearance2_7;
		
		public String Appearance2_7(){//7.horizontal is right,vertical is top
			String v = Appearance.appearance_place(Appearance2_7.getAttribute("style"), "top");
			String h = Appearance2_7.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group07']/div/div/div[1]/div")
		private WebElement Appearance2_8;
		
		public String Appearance2_8(){//8.horizontal is right,vertical is center
			String v = Appearance.appearance_place(Appearance2_8.getAttribute("style"), "middle");
			String h = Appearance2_8.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group08']/div/div/div/div")
		private WebElement Appearance2_9;
		
		public String Appearance2_9(){//9.horizontal is right,vertical is bottom
			String v = Appearance.appearance_place(Appearance2_9.getAttribute("style"), "bottom");
			String h = Appearance2_9.getAttribute("align");
			return h+"&"+v;
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group09']/div/div/div/div")
		private WebElement Appearance2_10;
		
		public int Appearance2_10(){//10.horizontal indent is 50px
			String[] temp = {"padding-left: 50px"};
			return Appearance.appearance_query(Appearance2_10.getAttribute("style"), temp);
			
		}
		
		@FindBy(xpath=".//*[@id='tree_appearance2_group10']/div/div/div/div")
		private WebElement Appearance2_11;
		
		public int Appearance2_11(){//11.horizontal indent is 10percent
			String[] temp = {"padding-left: 10%"};
			return Appearance.appearance_query(Appearance2_11.getAttribute("style"), temp);
		}
//###############################Tree Appearance2##################################
//###############################Tree Submit######################################
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
