package com.ibm.btt.allwidgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Main_Page extends Index_Page{ 
	
//###############################For Button Main#################################
	@FindBy(id="button_main_link")
	private WebElement button_properties;
	
	@FindBy(id="button_main_link01")
	private WebElement button_ECA;
	
	@FindBy(id="button_main_link02")
	private WebElement button_CSS;
	
	@FindBy(id="button_main_link03")
	private WebElement button_appearance1;
	
	@FindBy(id="button_main_link04")
	private WebElement button_appearance2;

	
	public void button_properties(){
		button_properties.click();
	}
	
	public void button_ECA(){
		button_ECA.click();
	}
	
	public void button_CSS(){
		button_CSS.click();
	}
	
	public void button_appearance1(){
		button_appearance1.click();
	}
	
	public void button_appearance2(){
		button_appearance2.click();
	}
//###############################For Button Main#################################
//###############################For Label Main##################################	
	@FindBy(id="label_main_link")
	private WebElement Label_properties;
	
	@FindBy(id="label_main_link01")
	private WebElement Label_ECA;
	
	@FindBy(id="label_main_link02")
	private WebElement Label_CSS;
	
	@FindBy(id="label_main_link03")
	private WebElement Label_appearance;
	
	@FindBy(id="label_main_link03_copy")
	private WebElement Label_appearance1;

	
	public void label_properties(){
		Label_properties.click();
	}
	
	public void label_ECA(){
		Label_ECA.click();
	}
	
	public void label_CSS(){
		Label_CSS.click();
	}
	
	public void label_appearance(){
		Label_appearance.click();
	}
	
	public void label_appearance1(){
		Label_appearance1.click();
	}
//###############################For Label Main##################################
//###############################For Text Main###################################
	@FindBy(id="Text_main_link02")
	private WebElement Text_Properties;
	
	@FindBy(id="Text_main_link")
	private WebElement Text_event;
	
	@FindBy(id="Text_main_link05")
	private WebElement Text_condition;
	
	@FindBy(id="Text_main_link06")
	private WebElement Text_action;
	
	@FindBy(id="Text_main_link01")
	private WebElement Text_css;
	
	@FindBy(id="Text_main_link03")
	private WebElement Text_appearance1;
	
	@FindBy(id="Text_main_link04")
	private WebElement Text_appearance2;
	
	@FindBy(id="Text_main_link07")
	private WebElement Text_submit;
	
	public void Text_Properties(){
		Text_Properties.click();
	}
	
	public void Text_event(){
		Text_event.click();
	}
	
	public void Text_condition(){
		Text_condition.click();
	}
	
	public void Text_action(){
		Text_action.click();
	}
	
	public void Text_css(){
		Text_css.click();
	}
	
	public void Text_appearance1(){
		Text_appearance1.click();
	}
	
	public void Text_appearance2(){
		Text_appearance2.click();
	}
	
	public void Text_submit(){
		Text_submit.click();
	}
//###############################For Text Main###################################
//###############################For Image Main##################################
	@FindBy(id="Image_main_link")
	private WebElement Image_properties;
	
	@FindBy(id="Image_main_link01")
	private WebElement Image_event;
	
	@FindBy(id="Image_main_link02")
	private WebElement Image_condition;
	
	@FindBy(id="Image_main_link03")
	private WebElement Image_action;
	
	@FindBy(id="Image_main_link04")
	private WebElement Image_actionTab;
	
	@FindBy(id="Image_main_link05")
	private WebElement Image_css;
	
	@FindBy(id="Image_main_link06")
	private WebElement Image_appearance1;
	
	@FindBy(id="Image_main_link07")
	private WebElement Image_appearance2;
	
	public void Image_properties(){
		Image_properties.click();
	}
	
	public void Image_event(){
		Image_event.click();
	}
	
	public void Image_condition(){
		Image_condition.click();
	}
	
	public void Image_action(){
		Image_action.click();
	}
	
	public void Image_actionTab(){
		Image_actionTab.click();
	}
	
	public void Image_css(){
		Image_css.click();
	}
	
	public void Image_appearance1(){
		Image_appearance1.click();
	}
	
	public void Image_appearance2(){
		Image_appearance2.click();
	}
//###############################For Image Main##################################
//###############################For Radio Main##################################
	@FindBy(id="Radio_main_link05")
	private WebElement Radio_properties;
	
	@FindBy(id="Radio_main_link")
	private WebElement Radio_submmit;
	
	@FindBy(id="Radio_main_link01")
	private WebElement Radio_ECA;
	
	@FindBy(id="Radio_main_link02")
	private WebElement Radio_css;
	
	@FindBy(id="Radio_main_link03")
	private WebElement Radio_appearance1;
	
	@FindBy(id="Radio_main_link04")
	private WebElement Radio_appearance2;
	
	@FindBy(id="Radio_main_link06")
	private WebElement Radio_Event;
	
	@FindBy(id="Radio_main_link07")
	private WebElement Radio_Action;
	
	@FindBy(id="Radio_main_link08")
	private WebElement Radio_Condition;
	
	public void Radio_properties(){
		Radio_properties.click();
	}
	
	public void Radio_submmit(){
		Radio_submmit.click();
	}
	
	public void Radio_css(){
		Radio_css.click();
	}
	
	public void Radio_appearance1(){
		Radio_appearance1.click();
	}
	
	public void Radio_appearance2(){
		Radio_appearance2.click();
	}
	
	public void Radio_Event(){
		Radio_Event.click();
	}
	
	public void Radio_Action(){
		Radio_Action.click();
	}
	
	public void Radio_Condition(){
		Radio_Condition.click();
	}
	
	public void Radio_ECA(){
		Radio_ECA.click();
	}
//###############################For Radio Main##################################
//###############################For CheckBox Main###############################
	@FindBy(id="CheckBox_main_link05")
	private WebElement CheckBox_properties;
	
	@FindBy(id="CheckBox_main_link")
	private WebElement CheckBox_submmit;
	
	@FindBy(id="CheckBox_main_link02")
	private WebElement CheckBox_css;
	
	@FindBy(id="CheckBox_main_link03")
	private WebElement CheckBox_appearance1;
	
	@FindBy(id="CheckBox_main_link04")
	private WebElement CheckBox_appearance2;
	
	@FindBy(id="CheckBox_main_link08")
	private WebElement CheckBox_Event;
	
	@FindBy(id="CheckBox_main_link06")
	private WebElement CheckBox_Action;
	 
	@FindBy(id="CheckBox_main_link07")
	private WebElement CheckBox_Condition;
	
	@FindBy(id="CheckBox_main_link01")
	private WebElement CheckBox_ECA;
	
	public void CheckBox_properties(){
		CheckBox_properties.click();
	}
	
	public void CheckBox_submmit(){
		CheckBox_submmit.click();
	}
	
	public void CheckBox_css(){
		CheckBox_css.click();
	}
	
	public void CheckBox_appearance1(){
		CheckBox_appearance1.click();
	}
	
	public void CheckBox_appearance2(){
		CheckBox_appearance2.click();
	}
	
	public void CheckBox_Event(){
		CheckBox_Event.click();
	}
	
	public void CheckBox_Action(){
		CheckBox_Action.click();
	}
	
	public void CheckBox_Condition(){
		CheckBox_Condition.click();
	}
	
	public void CheckBox_ECA(){
		CheckBox_ECA.click();
	}
//###############################For CheckBox Main###############################
//###############################For Message Main################################
	@FindBy(id="Message_main_link")
	private WebElement Message_properties;
	
	@FindBy(id="Message_main_link01")
	private WebElement Message_appearance;
	
	@FindBy(id="Message_main_link02")
	private WebElement Message_appearance1;
	
	@FindBy(id="Message_main_link03")
	private WebElement Message_action;
	
	@FindBy(id="Message_main_link04")
	private WebElement Message_css;
	
	public void Message_properties(){
		Message_properties.click();
	}
	
	public void Message_appearance(){
		Message_appearance.click();
	}
	
	public void Message_appearance1(){
		Message_appearance1.click();
	}
	
	public void Message_action(){
		Message_action.click();
	}
	
	public void Message_css(){
		Message_css.click();
	}
//###############################For Message Main################################
//###############################For Link Main###################################
	@FindBy(id="Link_main_link")
	private WebElement Link_properties;
	
	@FindBy(id="Link_main_link01")
	private WebElement Link_event;
	
	@FindBy(id="Link_main_link03")
	private WebElement Link_condition;
	
	@FindBy(id="Link_main_link04")
	private WebElement Link_action;
	
	@FindBy(id="Link_main_link05")
	private WebElement Link_css;
	
	@FindBy(id="Link_main_link06")
	private WebElement Link_appearance1;
	
	@FindBy(id="Link_main_link07")
	private WebElement Link_appearance2;
	
	public void Link_properties(){
		Link_properties.click();
	}
	
	public void Link_event(){
		Link_event.click();
	}
	
	public void Link_condition(){
		Link_condition.click();
	}
	
	public void Link_action(){
		Link_action.click();
	}
	
	public void Link_css(){
		Link_css.click();
	}
		
	public void Link_appearance1(){
		Link_appearance1.click();
	}
	
	public void Link_appearance2(){
		Link_appearance2.click();
	}
//###############################For Link Main###################################
//###############################For SelectList Main#############################
	@FindBy(id="SelectList_main_SelectList_properties")
	private WebElement SelectList_properties;
	
	@FindBy(id="SelectList_main_link01_copy")
	private WebElement SelectList_event;
	
	@FindBy(id="SelectList_main_link03")
	private WebElement SelectList_condition;
	
	@FindBy(id="SelectList_main_link04")
	private WebElement SelectList_action;
	
	@FindBy(id="SelectList_main_link01")
	private WebElement SelectList_css;
	
	@FindBy(id="SelectList_main_link02")
	private WebElement SelectList_appearance;
	
	@FindBy(id="SelectList_main_link")
	private WebElement SelectList_submit;
	
	public void SelectList_properties(){
		SelectList_properties.click();
	}
	
	public void SelectList_event(){
		SelectList_event.click();
	}
	
	public void SelectList_condition(){
		SelectList_condition.click();
	}
	
	public void SelectList_action(){
		SelectList_action.click();
	}
	
	public void SelectList_css(){
		SelectList_css.click();
	}
		
	public void SelectList_appearance(){
		SelectList_appearance.click();
	}
	
	public void SelectList_submit(){
		SelectList_submit.click();
	}
//###############################For SelectList Main#############################
//###############################For MultiSelect Main############################
	@FindBy(id="MultiSelect_main_link")
	private WebElement MultiSelect_properties;
	
	@FindBy(id="MultiSelect_main_link01")
	private WebElement MultiSelect_ECA;
	
	@FindBy(id="MultiSelect_main_link02")
	private WebElement MultiSelect_submit;
	
	@FindBy(id="MultiSelect_main_link03")
	private WebElement MultiSelect_appearance1;
	
	@FindBy(id="MultiSelect_main_link04")
	private WebElement MultiSelect_appearance2;
	
	@FindBy(id="MultiSelect_main_link05")
	private WebElement MultiSelect_css;
	
	public void MultiSelect_properties(){
		MultiSelect_properties.click();
	}
	
	public void MultiSelect_ECA(){
		MultiSelect_ECA.click();
	}
	
	public void MultiSelect_submit(){
		MultiSelect_submit.click();
	}
	
	public void MultiSelect_appearance1(){
		MultiSelect_appearance1.click();
	}
	
	public void MultiSelect_appearance2(){
		MultiSelect_appearance2.click();
	}
		
	public void MultiSelect_css(){
		MultiSelect_css.click();
	}
//###############################For MultiSelect Main############################
//###############################For HorizontalSlider Main#######################
	@FindBy(id="HorizontalSlider_main_link")
	private WebElement HorizontalSlider_properties;
	
	@FindBy(id="HorizontalSlider_main_link04")
	private WebElement HorizontalSlider_event;
	
	@FindBy(id="HorizontalSlider_main_link06")
	private WebElement HorizontalSlider_condition;
	
	@FindBy(id="HorizontalSlider_main_link07")
	private WebElement HorizontalSlider_action;
	
	@FindBy(id="HorizontalSlider_main_link08")
	private WebElement HorizontalSlider_submit;
	
	@FindBy(id="HorizontalSlider_main_link02")
	private WebElement HorizontalSlider_appearance1;
	
	@FindBy(id="HorizontalSlider_main_link03")
	private WebElement HorizontalSlider_appearance2;
	
	@FindBy(id="HorizontalSlider_main_link01")
	private WebElement HorizontalSlider_css;
	
	@FindBy(id="HorizontalSlider_main_link05")
	private WebElement HorizontalSlider_InlineStyle;
	
	public void HorizontalSlider_properties(){
		HorizontalSlider_properties.click();
	}
	
	public void HorizontalSlider_event(){
		HorizontalSlider_event.click();
	}
	
	public void HorizontalSlider_condition(){
		HorizontalSlider_condition.click();
	}
	
	public void HorizontalSlider_action(){
		HorizontalSlider_action.click();
	}
	
	public void HorizontalSlider_submit(){
		HorizontalSlider_submit.click();
	}
		
	public void HorizontalSlider_appearance1(){
		HorizontalSlider_appearance1.click();
	}
	
	public void HorizontalSlider_appearance2(){
		HorizontalSlider_appearance2.click();
	}
	
	public void HorizontalSlider_css(){
		HorizontalSlider_css.click();
	}
	
	public void HorizontalSlider_InlineStyle(){
		HorizontalSlider_InlineStyle.click();
	}
//###############################For HorizontalSlider Main#######################
//###############################For VerticalSlider Main#########################
	@FindBy(id="VerticalSlider_main_link")
	private WebElement VerticalSlider_properties;
	
	@FindBy(id="VerticalSlider_main_link04")
	private WebElement VerticalSlider_event;
	
	@FindBy(id="VerticalSlider_main_link05")
	private WebElement VerticalSlider_condition;
	
	@FindBy(id="VerticalSlider_main_link06")
	private WebElement VerticalSlider_action;
	
	@FindBy(id="VerticalSlider_main_link02")
	private WebElement VerticalSlider_appearance1;
	
	@FindBy(id="VerticalSlider_main_link03")
	private WebElement VerticalSlider_appearance2;
	
	@FindBy(id="VerticalSlider_main_link01")
	private WebElement VerticalSlider_css;
	
	@FindBy(id="VerticalSlider_main_link07")
	private WebElement VerticalSlider_InlineStyle;
	
	public void VerticalSlider_properties(){
		VerticalSlider_properties.click();
	}
	
	public void VerticalSlider_event(){
		VerticalSlider_event.click();
	}
	
	public void VerticalSlider_condition(){
		VerticalSlider_condition.click();
	}
	
	public void VerticalSlider_action(){
		VerticalSlider_action.click();
	}
	
	public void VerticalSlider_appearance1(){
		VerticalSlider_appearance1.click();
	}
	
	public void VerticalSlider_appearance2(){
		VerticalSlider_appearance2.click();
	}
	
	public void VerticalSlider_css(){
		VerticalSlider_css.click();
	}
	
	public void VerticalSlider_InlineStyle(){
		VerticalSlider_InlineStyle.click();
	}
	
//###############################For VerticalSlider Main#########################
//###############################For CheckedMultiSelect Main#####################
	@FindBy(id="CheckedMultiSelect_main_link")
	private WebElement CheckedMultiSelect_properties;
	
	@FindBy(id="CheckedMultiSelect_main_link04")
	private WebElement CheckedMultiSelect_event;
	
	@FindBy(id="CheckedMultiSelect_main_link05")
	private WebElement CheckedMultiSelect_condition;
	
	@FindBy(id="CheckedMultiSelect_main_link06")
	private WebElement CheckedMultiSelect_submit;
	
	@FindBy(id="CheckedMultiSelect_main_link07")
	private WebElement CheckedMultiSelect_action;
	
	@FindBy(id="CheckedMultiSelect_main_link03")
	private WebElement CheckedMultiSelect_appearance1;
	
	@FindBy(id="CheckedMultiSelect_main_link04_copy")
	private WebElement CheckedMultiSelect_appearance2;
	
	@FindBy(id="CheckedMultiSelect_main_link01")
	private WebElement CheckedMultiSelect_appearance3;
	
	@FindBy(id="CheckedMultiSelect_main_link02")
	private WebElement CheckedMultiSelect_css;
	
	public void CheckedMultiSelect_properties(){
		CheckedMultiSelect_properties.click();
	}
	
	public void CheckedMultiSelect_event(){
		CheckedMultiSelect_event.click();
	}
	
	public void CheckedMultiSelect_condition(){
		CheckedMultiSelect_condition.click();
	}
	
		public void CheckedMultiSelect_submit(){
		CheckedMultiSelect_submit.click();
	}
	
	public void CheckedMultiSelect_action(){
		CheckedMultiSelect_action.click();
	}
	
	public void CheckedMultiSelect_appearance1(){
		CheckedMultiSelect_appearance1.click();
	}
	
	public void CheckedMultiSelect_appearance2(){
		CheckedMultiSelect_appearance2.click();
	}
	
	public void CheckedMultiSelect_appearance3(){
		CheckedMultiSelect_appearance3.click();
	}
	
	public void CheckedMultiSelect_css(){
		CheckedMultiSelect_css.click();
	}
	
//###############################For CheckedMultiSelect Main#####################
//###############################For RichText Main###############################
	@FindBy(id="RichText_main_link08")
	private WebElement RichText_properties;
	
	@FindBy(id="RichText_main_link07")
	private WebElement RichText_event;
	
	@FindBy(id="RichText_main_link05")
	private WebElement RichText_condition;
	
	@FindBy(id="RichText_main_link")
	private WebElement RichText_submit;
	
	@FindBy(id="RichText_main_link06")
	private WebElement RichText_action;
	
	@FindBy(id="RichText_main_link02")
	private WebElement RichText_appearance1;
	
	@FindBy(id="RichText_main_link03")
	private WebElement RichText_appearance2;
	
	@FindBy(id="RichText_main_link04")
	private WebElement RichText_css;
	
	public void RichText_properties(){
		RichText_properties.click();
	}
	
	public void RichText_event(){
		RichText_event.click();
	}
	
	public void RichText_condition(){
		RichText_condition.click();
	}
	
		public void RichText_submit(){
		RichText_submit.click();
	}
	
	public void RichText_action(){
		RichText_action.click();
	}
	
	public void RichText_appearance1(){
		RichText_appearance1.click();
	}
	
	public void RichText_appearance2(){
		RichText_appearance2.click();
	}
	
	public void RichText_css(){
		RichText_css.click();
	}
//###############################For RichText Main###############################
//###############################For TextArea Main###############################
	@FindBy(id="textArea_main_link_copy")
	private WebElement TextArea_properties;
	
	@FindBy(id="textArea_main_link01_copy")
	private WebElement TextArea_event;
	
	@FindBy(id="textArea_main_link02_copy")
	private WebElement TextArea_condition;
	
	@FindBy(id="textArea_main_link04")
	private WebElement TextArea_submit;
	
	@FindBy(id="textArea_main_link03")
	private WebElement TextArea_action;
	
	@FindBy(id="textArea_main_link01")
	private WebElement TextArea_appearance1;
	
	@FindBy(id="textArea_main_link02")
	private WebElement TextArea_appearance2;
	
	@FindBy(id="textArea_main_link")
	private WebElement TextArea_css;
	
	public void TextArea_properties(){
		TextArea_properties.click();
	}
	
	public void TextArea_event(){
		TextArea_event.click();
	}
	
	public void TextArea_condition(){
		TextArea_condition.click();
	}
	
	public void TextArea_submit(){
		TextArea_submit.click();
	}
	
	public void TextArea_action(){
		TextArea_action.click();
	}
	
	public void TextArea_appearance1(){
		TextArea_appearance1.click();
	}
	
	public void TextArea_appearance2(){
		TextArea_appearance2.click();
	}
	
	public void TextArea_css(){
		TextArea_css.click();
	}
//###############################For TextArea Main###############################
//###############################For panel Main##################################	
	@FindBy(id="panel_main_link02")
	private WebElement panel_properties;
	
	@FindBy(id="panel_main_link")
	private WebElement panel_ECA;
	
	@FindBy(id="panel_main_link03")
	private WebElement panel_CSS;
	
	@FindBy(id="panel_main_link01")
	private WebElement panel_appearance1;
	
	@FindBy(id="panel_main_link04")
	private WebElement panel_appearance2;

	
	public void panel_properties(){
		panel_properties.click();
	}
	
	public void panel_ECA(){
		panel_ECA.click();
	}
	
	public void panel_CSS(){
		panel_CSS.click();
	}
	
	public void panel_appearance1(){
		panel_appearance1.click();
	}
	
	public void panel_appearance2(){
		panel_appearance2.click();
	}
//###############################For panel Main##################################
//###############################For Combo Main##################################
	@FindBy(id="combo_main_link")
	private WebElement Combo_properties;
	
	@FindBy(id="combo_main_link01")
	private WebElement Combo_event;
	
	@FindBy(id="combo_main_link03")
	private WebElement Combo_condition;
	
	@FindBy(id="combo_main_link04")
	private WebElement Combo_action;
	
	@FindBy(id="combo_main_link05")
	private WebElement Combo_css;
	
	@FindBy(id="combo_main_link07")
	private WebElement Combo_appearance;
	
	@FindBy(id="combo_main_link02")
	private WebElement Combo_submit;
	
	public void Combo_properties(){
		Combo_properties.click();
	}
	
	public void Combo_event(){
		Combo_event.click();
	}
	
	public void Combo_condition(){
		Combo_condition.click();
	}
	
	public void Combo_action(){
		Combo_action.click();
	}
	
	public void Combo_css(){
		Combo_css.click();
	}
		
	public void Combo_appearance(){
		Combo_appearance.click();
	}
	
	public void Combo_submit(){
		Combo_submit.click();
	}
//###############################For Combo Main##################################
//###############################For Tree Main###################################
		@FindBy(id="tree_main_link07")
		private WebElement Tree_properties;
		
		@FindBy(id="tree_main_link04")
		private WebElement Tree_event;
		
		@FindBy(id="tree_main_link05")
		private WebElement Tree_condition;
		
		@FindBy(id="tree_main_link03")
		private WebElement Tree_action;
		
		@FindBy(id="tree_main_link")
		private WebElement Tree_css;
		
		@FindBy(id="tree_main_link01")
		private WebElement Tree_appearance1;
		
		@FindBy(id="tree_main_link02")
		private WebElement Tree_appearance2;
		
		@FindBy(id="tree_main_link06")
		private WebElement Tree_submit;
		
		public void Tree_properties(){
			Tree_properties.click();
		}
		
		public void Tree_event(){
			Tree_event.click();
		}
		
		public void Tree_condition(){
			Tree_condition.click();
		}
		
		public void Tree_action(){
			Tree_action.click();
		}
		
		public void Tree_css(){
			Tree_css.click();
		}
			
		public void Tree_appearance1(){
			Tree_appearance1.click();
		}
		
		public void Tree_appearance2(){
			Tree_appearance2.click();
		}
		
		public void Tree_submit(){
			Tree_submit.click();
		}
//###############################For Tree Main############################################
//###############################For RepetitivePanel Main##################################	
	@FindBy(id="RepetitivePanel_main_link")
	private WebElement RepetitivePanel_properties;
	
	@FindBy(id="RepetitivePanel_main_link01")
	private WebElement RepetitivePanel_ECA;
	
	@FindBy(id="RepetitivePanel_main_link02")
	private WebElement RepetitivePanel_CSS;
	
	@FindBy(id="RepetitivePanel_main_link03")
	private WebElement RepetitivePanel_appearance1;
	
	@FindBy(id="RepetitivePanel_main_link03")
	private WebElement RepetitivePanel_appearance2;
	
	@FindBy(id="RepetitivePanel_main_link04")
	private WebElement RepetitivePanel_submit;
	
	
	public void RepetitivePanel_properties(){
		RepetitivePanel_properties.click();
	}
	
	public void RepetitivePanel_ECA(){
		RepetitivePanel_ECA.click();
	}
	
	public void RepetitivePanel_CSS(){
		RepetitivePanel_CSS.click();
	}
	
	public void RepetitivePanel_appearance1(){
		RepetitivePanel_appearance1.click();
	}
	
	public void RepetitivePanel_appearance2(){
		RepetitivePanel_appearance2.click();
	}
	
	public void RepetitivePanel_submit(){
		RepetitivePanel_submit.click();
	}
//###############################For RepetitivePanel Main##################################
//###############################For FileUpload Main#######################################
	@FindBy(id="FileUpload_main_link03")
	private WebElement FileUpload_properties;
	
	@FindBy(id="FileUpload_main_link04")
	private WebElement FileUpload_event;
	
	@FindBy(id="FileUpload_main_link05")
	private WebElement FileUpload_condition;
	
	@FindBy(id="FileUpload_main_link06")
	private WebElement FileUpload_action;
	
	@FindBy(id="FileUpload_main_link02")
	private WebElement FileUpload_css;
	
	@FindBy(id="FileUpload_main_link")
	private WebElement FileUpload_appearance1;
	
	@FindBy(id="FileUpload_main_link01")
	private WebElement FileUpload_appearance2;
	
	@FindBy(id="FileUpload_main_link07")
	private WebElement FileUpload_submit;
	
	public void FileUpload_properties(){
		FileUpload_properties.click();
	}
	
	public void FileUpload_event(){
		FileUpload_event.click();
	}
	
	public void FileUpload_condition(){
		FileUpload_condition.click();
	}
	
	public void FileUpload_action(){
		FileUpload_action.click();
	}
	
	public void FileUpload_css(){
		FileUpload_css.click();
	}
		
	public void FileUpload_appearance1(){
		FileUpload_appearance1.click();
	}
	
	public void FileUpload_appearance2(){
		FileUpload_appearance2.click();
	}
	
	public void FileUpload_submit(){
		FileUpload_submit.click();
	}
//###############################For FileUpload Main############################################
//###############################For XUIInclude Main############################################
	@FindBy(id="xuiInclude_main_link")
	private WebElement XUIInclude_properties;
	
	
	@FindBy(id="xuiInclude_main_link01")
	private WebElement XUIInclude_appearance;
	
	
	public void XUIInclude_properties(){
		XUIInclude_properties.click();
	}
	
	public void XUIInclude_appearance(){
		XUIInclude_appearance.click();
	}
//###############################For XUIInclude Main##################################
//###############################For Table Main#######################################
	@FindBy(id="Table_Index_link")
	private WebElement Table_properties;
	
	@FindBy(id="Table_Index_link01")
	private WebElement Table_event;
	
	@FindBy(id="Table_Index_link02")
	private WebElement Table_condition;
	
	@FindBy(id="Table_Index_link03")
	private WebElement Table_action;
	
	@FindBy(id="Table_Index_link06")
	private WebElement Table_style;
	
	@FindBy(id="Table_Index_link04")
	private WebElement Table_appearance;
	
	@FindBy(id="Table_Index_link05")
	private WebElement Table_colStandard;
	
	public void Table_properties(){
		Table_properties.click();
	}
	
	public void Table_event(){
		Table_event.click();
	}
	
	public void Table_condition(){
		Table_condition.click();
	}
	
	public void Table_action(){
		Table_action.click();
	}
	
	public void Table_style(){
		Table_style.click();
	}
		
	public void Table_appearance(){
		Table_appearance.click();
	}
	
	public void Table_colStandard(){
		Table_colStandard.click();
	}
//###############################For Table Main#####################################
//###############################For Form Main#######################################
	@FindBy(id="form_main_link")
	private WebElement Form_properties;
	
	@FindBy(id="form_main_link01")
	private WebElement Form_eca;
	
	@FindBy(id="form_main_link04")
	private WebElement Form_actionTab;
	
	@FindBy(id="form_main_link03")
	private WebElement Form_style;
	
	@FindBy(id="form_main_link02")
	private WebElement Form_appearance1;
	
	@FindBy(id="form_main_link06")
	private WebElement Form_appearance2;
	
	@FindBy(id="form_main_link05")
	private WebElement Form_xValidation;
	
	public void Form_properties(){
		Form_properties.click();
	}
	
	public void Form_eca(){
		Form_eca.click();
	}
	
	public void Form_appearance1(){
		Form_appearance1.click();
	}
	
	public void Form_appearance2(){
		Form_appearance2.click();
	}
	
	public void Form_actionTab(){
		Form_actionTab.click();
	}
	
	public void Form_style(){
		Form_style.click();
	}
	
	public void Form_xValidation(){
		Form_xValidation.click();
	}
//###############################For Form Main#####################################
} 

