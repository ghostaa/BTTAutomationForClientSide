package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane_SingleSelectionMode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_TableInTabbedPane_SingleSelectionMode_PageObject extends Index_Page{

	@FindBy(id="NonEditableTable_link01")  //Link to 'table in TabbedPane' page (1. link and button in the table 2. Table noresize 3.context menu)
	private WebElement tableInTabbedPaneLink;
	public void tableInTabbedPaneLink(){
		tableInTabbedPaneLink.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_link")  //non-editable table
	private WebElement NonEditableTableInTabbedPane_link;
	public void NonEditableTableInTabbedPane_link(){
		NonEditableTableInTabbedPane_link.click();
	}
	
	/*=============SingleSelectionMode start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane08")  //SingleSelectionMode
	private WebElement NonEditableTableInTabbedPane_ContentPane08;
	public void NonEditableTableInTabbedPane_ContentPane08(){
		NonEditableTableInTabbedPane_ContentPane08.click();
	}

	@FindBy(xpath=".//*[@id='dojox_grid__View_18']/div/div/div/div[1]/table/tbody/tr/td[1]/span/span/div/span")  //SingleSelectionMode  - Button
	private WebElement SingleSelectionMode_Button;
	public void SingleSelectionMode_Button(){
		SingleSelectionMode_Button.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_18']/div/div/div/div[1]/table/tbody/tr/td[2]/a")  //SingleSelectionMode  - LinkECA
	private WebElement SingleSelectionMode_LinkECA;
	public WebElement SingleSelectionMode_LinkECA(){
		return SingleSelectionMode_LinkECA;
	}
	
	@FindBy(id="dijit_MenuItem_34_text")  //SingleSelectionMode  - LinkECA - getCellValueByName(ContentMenu_Link_NoAction)
	private WebElement dijit_MenuItem_34_text;
	public void dijit_MenuItem_34_text(){
		dijit_MenuItem_34_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_35_text")  //SingleSelectionMode  - LinkECA - getCellValueByIndex(5)
	private WebElement dijit_MenuItem_35_text;
	public void dijit_MenuItem_35_text(){
		dijit_MenuItem_35_text.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_label17")  //SingleSelectionMode  - LinkECA - ECA result
	private WebElement NonEditableTableInTabbedPane_label17;
	public String NonEditableTableInTabbedPane_label17(){
		return NonEditableTableInTabbedPane_label17.getText();
	}

	@FindBy(xpath=".//*[@id='dojox_grid__View_19']/div/div/div/div[1]/table/tbody/tr/td[1]/a")  //SingleSelectionMode  - LinkURL
	private WebElement SingleSelectionMode_LinkURL;
	public void SingleSelectionMode_LinkURL(){
		SingleSelectionMode_LinkURL.click();
	}
	
	@FindBy(id="dijit_MenuItem_36_text")  //SingleSelectionMode  - LinkURL - launch URL
	private WebElement dijit_MenuItem_36_text;
	public void dijit_MenuItem_36_text(){
		dijit_MenuItem_36_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_37_text")  //SingleSelectionMode  - LinkURL - launch URL in new window
	private WebElement dijit_MenuItem_37_text;
	public void dijit_MenuItem_37_text(){
		dijit_MenuItem_37_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_19']/div/div/div/div[1]/table/tbody/tr/td[2]/a")  //SingleSelectionMode  - LinkSubmit
	private WebElement SingleSelectionMode_LinkSubmit;
	public void SingleSelectionMode_LinkSubmit(){
		SingleSelectionMode_LinkSubmit.click();
	}
	
	@FindBy(id="dijit_MenuItem_38_text")  //SingleSelectionMode  - LinkSubmit - SubmitByChangeFlowEvent
	private WebElement dijit_MenuItem_38_text;
	public void dijit_MenuItem_38_text(){
		dijit_MenuItem_38_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_39_text")  //SingleSelectionMode  - LinkSubmit - SubmitByLaunchNewFlow
	private WebElement dijit_MenuItem_39_text;
	public void dijit_MenuItem_39_text(){
		dijit_MenuItem_39_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_40_text")  //SingleSelectionMode  - LinkSubmit - SubmitByLaunchOperation
	private WebElement dijit_MenuItem_40_text;
	public void dijit_MenuItem_40_text(){
		dijit_MenuItem_40_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_41_text")  //SingleSelectionMode  - LinkSubmit - NoDataByChangeFlowEvent
	private WebElement dijit_MenuItem_41_text;
	public void dijit_MenuItem_41_text(){
		dijit_MenuItem_41_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_42_text")  //SingleSelectionMode  - LinkSubmit - NoDataByLaunchNewFlow
	private WebElement dijit_MenuItem_42_text;
	public void dijit_MenuItem_42_text(){
		dijit_MenuItem_42_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_43_text")  //SingleSelectionMode  - LinkSubmit - NoDataByLaunchOperation
	private WebElement dijit_MenuItem_43_text;
	public void dijit_MenuItem_43_text(){
		dijit_MenuItem_43_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_44_text")  //SingleSelectionMode  - LinkSubmit - WithoutValidationByChangeFlowEvent
	private WebElement dijit_MenuItem_44_text;
	public void dijit_MenuItem_44_text(){
		dijit_MenuItem_44_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_45_text")  //SingleSelectionMode  - LinkSubmit - WithoutValidationByLaunchNewFlow
	private WebElement dijit_MenuItem_45_text;
	public void dijit_MenuItem_45_text(){
		dijit_MenuItem_45_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_46_text")  //SingleSelectionMode  - LinkSubmit - WithoutValidationByLaunchOperation
	private WebElement dijit_MenuItem_46_text;
	public void dijit_MenuItem_46_text(){
		dijit_MenuItem_46_text.click();
	}
	
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_19']/div/div/div/div[1]/table/tbody/tr/td[3]/span/span/div/span")  //SingleSelectionMode  - ButtonECA
	private WebElement SingleSelectionMode_ButtonECA;
	public void SingleSelectionMode_ButtonECA(){
		SingleSelectionMode_ButtonECA.click();
	}
	
	@FindBy(id="dijit_MenuItem_47_text")  //SingleSelectionMode  - ButtonECA - TEST_ECA_01
	private WebElement dijit_MenuItem_47_text;
	public void dijit_MenuItem_47_text(){
		dijit_MenuItem_47_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_48_text")  //SingleSelectionMode  - ButtonECA - TEST_ECA_02
	private WebElement dijit_MenuItem_48_text;
	public void dijit_MenuItem_48_text(){
		dijit_MenuItem_48_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_47']/td[4]/div")  //SingleSelectionMode  - ButtonECA - close
	private WebElement ButtonECA_Close;
	public void ButtonECA_Close(){
		ButtonECA_Close.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_19']/div/div/div/div[1]/table/tbody/tr/td[4]/span/span/div/span")  //SingleSelectionMode  - ButtonURL
	private WebElement SingleSelectionMode_ButtonURL;
	public void SingleSelectionMode_ButtonURL(){
		SingleSelectionMode_ButtonURL.click();
	}
	
	@FindBy(id="dijit_MenuItem_49_text")  //SingleSelectionMode  - ButtonURL - launch URL
	private WebElement dijit_MenuItem_49_text;
	public void dijit_MenuItem_49_text(){
		dijit_MenuItem_49_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_50_text")  //SingleSelectionMode  - ButtonURL - launch URL in new window
	private WebElement dijit_MenuItem_50_text;
	public void dijit_MenuItem_50_text(){
		dijit_MenuItem_50_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_49']/td[4]/div")  //SingleSelectionMode  - ButtonURL - close
	private WebElement ButtonURL_Close;
	public void ButtonURL_Close(){
		ButtonURL_Close.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_19']/div/div/div/div[1]/table/tbody/tr/td[5]/span/span/div/span")  //SingleSelectionMode  - ButtonSubmit
	private WebElement SingleSelectionMode_ButtonSubmit;
	public void SingleSelectionMode_ButtonSubmit(){
		SingleSelectionMode_ButtonSubmit.click();
	}
	
	@FindBy(id="dijit_MenuItem_51_text")  //SingleSelectionMode  - ButtonSubmit - SubmitByChangeFlowEvent
	private WebElement dijit_MenuItem_51_text;
	public void dijit_MenuItem_51_text(){
		dijit_MenuItem_51_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_52_text")  //SingleSelectionMode  - ButtonSubmit - SubmitByLaunchNewFlow
	private WebElement dijit_MenuItem_52_text;
	public void dijit_MenuItem_52_text(){
		dijit_MenuItem_52_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_53_text")  //SingleSelectionMode  - ButtonSubmit - SubmitByLaunchOperation
	private WebElement dijit_MenuItem_53_text;
	public void dijit_MenuItem_53_text(){
		dijit_MenuItem_53_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_54_text")  //SingleSelectionMode  - ButtonSubmit - NoDataByChangeFlowEvent
	private WebElement dijit_MenuItem_54_text;
	public void dijit_MenuItem_54_text(){
		dijit_MenuItem_54_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_55_text")  //SingleSelectionMode  - ButtonSubmit - NoDataByLaunchNewFlow
	private WebElement dijit_MenuItem_55_text;
	public void dijit_MenuItem_55_text(){
		dijit_MenuItem_55_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_56_text")  //SingleSelectionMode  - ButtonSubmit - NoDataByLaunchOperation
	private WebElement dijit_MenuItem_56_text;
	public void dijit_MenuItem_56_text(){
		dijit_MenuItem_56_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_57_text")  //SingleSelectionMode  - ButtonSubmit - WithoutValidationByChangeFlowEvent
	private WebElement dijit_MenuItem_57_text;
	public void dijit_MenuItem_57_text(){
		dijit_MenuItem_57_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_58_text")  //SingleSelectionMode  - ButtonSubmit - WithoutValidationByLaunchNewFlow
	private WebElement dijit_MenuItem_58_text;
	public void dijit_MenuItem_58_text(){
		dijit_MenuItem_58_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_59_text")  //SingleSelectionMode  - ButtonSubmit - WithoutValidationByLaunchOperation
	private WebElement dijit_MenuItem_59_text;
	public void dijit_MenuItem_59_text(){
		dijit_MenuItem_59_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_51']/td[4]/div")  //SingleSelectionMode  - ButtonSubmit - close
	private WebElement ButtonSubmit_Close;
	public void ButtonSubmit_Close(){
		ButtonSubmit_Close.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_text_copy")  //SingleSelectionMode  - textbox
	private WebElement NonEditableTableInTabbedPane_text_copy;
	public void NonEditableTableInTabbedPane_text_copy(){
		NonEditableTableInTabbedPane_text_copy.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_checkBox_copy")  //SingleSelectionMode  - feel happy checkbox
	private WebElement NonEditableTableInTabbedPane_checkBox_copy;
	public void NonEditableTableInTabbedPane_checkBox_copy(){
		NonEditableTableInTabbedPane_checkBox_copy.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_combo_copy")  //SingleSelectionMode  - combolist
	private WebElement NonEditableTableInTabbedPane_combo_copy;
	public void NonEditableTableInTabbedPane_combo_copy(){
		NonEditableTableInTabbedPane_combo_copy.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button02_copy_label")  //SingleSelectionMode  - submit - Submit By ChangeFlowEvent
	private WebElement NonEditableTableInTabbedPane_button02_copy_label;
	public void NonEditableTableInTabbedPane_button02_copy_label(){
		NonEditableTableInTabbedPane_button02_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button04_copy_label")  //SingleSelectionMode  - submit - Submit By Launch New Flow
	private WebElement NonEditableTableInTabbedPane_button04_copy_label;
	public void NonEditableTableInTabbedPane_button04_copy_label(){
		NonEditableTableInTabbedPane_button04_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button05_copy_label")  //SingleSelectionMode  - submit - Submit By Launch Operation
	private WebElement NonEditableTableInTabbedPane_button05_copy_label;
	public void NonEditableTableInTabbedPane_button05_copy_label(){
		NonEditableTableInTabbedPane_button05_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button03_copy_label")  //SingleSelectionMode  - submit with no data(Cancle) - submit with no data(Cancle)
	private WebElement NonEditableTableInTabbedPane_button03_copy_label;
	public void NonEditableTableInTabbedPane_button03_copy_label(){
		NonEditableTableInTabbedPane_button03_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_Button02_copy_label")  //SingleSelectionMode  - submit with no data(Cancle) - Cancle By Launch New Flow
	private WebElement NonEditableTableInTabbedPane_Button02_copy_label;
	public void NonEditableTableInTabbedPane_Button02_copy_label(){
		NonEditableTableInTabbedPane_Button02_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button06_copy_label")  //SingleSelectionMode  - submit with no data(Cancle) - Cancle By Launch Operation
	private WebElement NonEditableTableInTabbedPane_button06_copy_label;
	public void NonEditableTableInTabbedPane_button06_copy_label(){
		NonEditableTableInTabbedPane_button06_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_Button01_copy_label")  //SingleSelectionMode  - submit without validation(Save) - Save By ChangeFlowEvent
	private WebElement NonEditableTableInTabbedPane_Button01_copy_label;
	public void NonEditableTableInTabbedPane_Button01_copy_label(){
		NonEditableTableInTabbedPane_Button01_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button07_copy_label")  //SingleSelectionMode  - submit without validation(Save) - Save By LaunchNewFlow
	private WebElement NonEditableTableInTabbedPane_button07_copy_label;
	public void NonEditableTableInTabbedPane_button07_copy_label(){
		NonEditableTableInTabbedPane_button07_copy_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button08_copy_label")  //SingleSelectionMode  - submit without validation(Save) - Save By LaunchOperation
	private WebElement NonEditableTableInTabbedPane_button08_copy_label;
	public void NonEditableTableInTabbedPane_button08_copy_label(){
		NonEditableTableInTabbedPane_button08_copy_label.click();
	}

	/*=============SingleSelectionMode end====================*/
}
