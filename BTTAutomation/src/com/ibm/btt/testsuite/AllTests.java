package com.ibm.btt.testsuite;


import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.ibm.btt.allwidgets.Button.ButtonSuite;
import com.ibm.btt.allwidgets.CheckBox.CheckBoxSuite;
import com.ibm.btt.allwidgets.CheckedMultiSelect.CheckedMultiSelectSuite;
import com.ibm.btt.allwidgets.Combo.ComboSuite;
import com.ibm.btt.allwidgets.HorizontalSlider.HorizontalSliderSuite;
import com.ibm.btt.allwidgets.Image.ImageSuite;
import com.ibm.btt.allwidgets.Label.LabelSuite;
import com.ibm.btt.allwidgets.Link.LinkSuite;
import com.ibm.btt.allwidgets.Message.MessageSuite;
import com.ibm.btt.allwidgets.MultiSelect.MultiSelectSuite;
import com.ibm.btt.allwidgets.Panel.PanelSuite;
import com.ibm.btt.allwidgets.Radio.RadioSuite;
import com.ibm.btt.allwidgets.RichText.RichTextSuite;
import com.ibm.btt.allwidgets.SelectList.SelectListSuite;
import com.ibm.btt.allwidgets.Text.TextSuite;
import com.ibm.btt.allwidgets.TextArea.TextAreaSuite;
import com.ibm.btt.allwidgets.VerticalSlider.VerticalSliderSuite;
  
@RunWith(Suite.class)  
@Suite.SuiteClasses({    
	ButtonSuite.class,
	CheckBoxSuite.class,
	CheckedMultiSelectSuite.class,
	HorizontalSliderSuite.class,
	ImageSuite.class,
	LabelSuite.class,
	LinkSuite.class,
	MessageSuite.class,
	MultiSelectSuite.class,
	RadioSuite.class,
	RichTextSuite.class,
	SelectListSuite.class,
	TextSuite.class,
	VerticalSliderSuite.class,
	TextAreaSuite.class,
	ComboSuite.class,
	PanelSuite.class,
})  
public class AllTests {      
    // why on earth I need this class, I have no idea!  
}  