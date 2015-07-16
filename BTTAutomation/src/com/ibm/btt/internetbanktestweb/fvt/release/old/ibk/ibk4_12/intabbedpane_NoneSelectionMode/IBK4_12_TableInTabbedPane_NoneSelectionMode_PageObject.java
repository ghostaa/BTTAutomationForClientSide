package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane_NoneSelectionMode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_TableInTabbedPane_NoneSelectionMode_PageObject extends Index_Page{
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
	/*=============NoneSelectionMode start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane06")  //NoneSelectionMode
	private WebElement NonEditableTableInTabbedPane_ContentPane06;
	public void NonEditableTableInTabbedPane_ContentPane06(){
		NonEditableTableInTabbedPane_ContentPane06.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_15']/div/div/div/div[3]/table/tbody/tr/td[1]/a")  //NoneSelectionMode  - dataNameForLink
	private WebElement NoneSelectionMode_dataNameForLink;
	public void NoneSelectionMode_dataNameForLink(){
		NoneSelectionMode_dataNameForLink.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_15']/div/div/div/div[3]/table/tbody/tr/td[2]/a")  //NoneSelectionMode  - LinkECA
	private WebElement NoneSelectionMode_LinkECA;
	public void NoneSelectionMode_LinkECA(){
		NoneSelectionMode_LinkECA.click();
	}
	
	@FindBy(id="dijit_MenuItem_3_text")  //NoneSelectionMode  - LinkECA - ECA1
	private WebElement dijit_MenuItem_3_text;
	public void dijit_MenuItem_3_text(){
		dijit_MenuItem_3_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_4_text")  //NoneSelectionMode  - LinkECA - ECA2
	private WebElement dijit_MenuItem_4_text;
	public void dijit_MenuItem_4_text(){
		dijit_MenuItem_4_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_5_text")  //NoneSelectionMode  - LinkECA - English
	private WebElement dijit_MenuItem_5_text;
	public void dijit_MenuItem_5_text(){
		dijit_MenuItem_5_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_6_text")  //NoneSelectionMode  - LinkECA - menuitem113
	private WebElement dijit_MenuItem_6_text;
	public void dijit_MenuItem_6_text(){
		dijit_MenuItem_6_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_7_text")  //NoneSelectionMode  - LinkECA - menuitem114
	private WebElement dijit_MenuItem_7_text;
	public void dijit_MenuItem_7_text(){
		dijit_MenuItem_7_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_8_text")  //NoneSelectionMode  - LinkECA - menuitem115
	private WebElement dijit_MenuItem_8_text;
	public void dijit_MenuItem_8_text(){
		dijit_MenuItem_8_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_9_text")  //NoneSelectionMode  - LinkECA - menuitem116
	private WebElement dijit_MenuItem_9_text;
	public void dijit_MenuItem_9_text(){
		dijit_MenuItem_9_text.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_showMenuItemId")  //NoneSelectionMode  - LinkECA - showMenuItemId
	private WebElement NonEditableTableInTabbedPane_showMenuItemId;
	public String NonEditableTableInTabbedPane_showMenuItemId(){
		return NonEditableTableInTabbedPane_showMenuItemId.getText();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_showWidgetId")  //NoneSelectionMode  - LinkECA - showWidgetId
	private WebElement NonEditableTableInTabbedPane_showWidgetId;
	public String NonEditableTableInTabbedPane_showWidgetId(){
		return NonEditableTableInTabbedPane_showWidgetId.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_15']/div/div/div/div[3]/table/tbody/tr/td[3]/a")  //NoneSelectionMode  - LinkURL
	private WebElement NoneSelectionMode_LinkURL;
	public void NoneSelectionMode_LinkURL(){
		NoneSelectionMode_LinkURL.click();
	}
	
	@FindBy(id="dijit_MenuItem_10_text")  //NoneSelectionMode  - LinkURL - launch URL
	private WebElement dijit_MenuItem_10_text;
	public void dijit_MenuItem_10_text(){
		dijit_MenuItem_10_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_11_text")  //NoneSelectionMode  - LinkURL - launch URL in new window
	private WebElement dijit_MenuItem_11_text;
	public void dijit_MenuItem_11_text(){
		dijit_MenuItem_11_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_15']/div/div/div/div[3]/table/tbody/tr/td[4]/a")  //NoneSelectionMode  - LinkSubmit
	private WebElement NoneSelectionMode_LinkSubmit;
	public void NoneSelectionMode_LinkSubmit(){
		NoneSelectionMode_LinkSubmit.click();
	}
	
	@FindBy(id="dijit_MenuItem_12_text")  //NoneSelectionMode  - LinkSubmit - SubmitByChangeFlowEvent
	private WebElement dijit_MenuItem_12_text;
	public void dijit_MenuItem_12_text(){
		dijit_MenuItem_12_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_13_text")  //NoneSelectionMode  - LinkSubmit - SubmitByLaunchNewFlow
	private WebElement dijit_MenuItem_13_text;
	public void dijit_MenuItem_13_text(){
		dijit_MenuItem_13_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_14_text")  //NoneSelectionMode  - LinkSubmit - SubmitByLaunchOperation
	private WebElement dijit_MenuItem_14_text;
	public void dijit_MenuItem_14_text(){
		dijit_MenuItem_14_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_15_text")  //NoneSelectionMode  - LinkSubmit - NoDataByChangeFlowEvent
	private WebElement dijit_MenuItem_15_text;
	public void dijit_MenuItem_15_text(){
		dijit_MenuItem_15_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_16_text")  //NoneSelectionMode  - LinkSubmit - NoDataByLaunchNewFlow
	private WebElement dijit_MenuItem_16_text;
	public void dijit_MenuItem_16_text(){
		dijit_MenuItem_16_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_17_text")  //NoneSelectionMode  - LinkSubmit - NoDataByLaunchOperation
	private WebElement dijit_MenuItem_17_text;
	public void dijit_MenuItem_17_text(){
		dijit_MenuItem_17_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_18_text")  //NoneSelectionMode  - LinkSubmit - WithoutValidationByChangeFlowEvent
	private WebElement dijit_MenuItem_18_text;
	public void dijit_MenuItem_18_text(){
		dijit_MenuItem_18_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_19_text")  //NoneSelectionMode  - LinkSubmit - WithoutValidationByLaunchNewFlow
	private WebElement dijit_MenuItem_19_text;
	public void dijit_MenuItem_19_text(){
		dijit_MenuItem_19_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_20_text")  //NoneSelectionMode  - LinkSubmit - WithoutValidationByLaunchOperation
	private WebElement dijit_MenuItem_20_text;
	public void dijit_MenuItem_20_text(){
		dijit_MenuItem_20_text.click();
	}
	
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_15']/div/div/div/div[3]/table/tbody/tr/td[5]/span/span/div/span")  //NoneSelectionMode  - ButtonECA
	private WebElement NoneSelectionMode_ButtonECA;
	public WebElement NoneSelectionMode_ButtonECA(){
		return NoneSelectionMode_ButtonECA;
	}
	
	@FindBy(id="dijit_MenuItem_21_text")  //NoneSelectionMode  - ButtonECA - ECA
	private WebElement dijit_MenuItem_21_text;
	public void dijit_MenuItem_21_text(){
		dijit_MenuItem_21_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_22_text")  //NoneSelectionMode  - ButtonECA - ECA2
	private WebElement dijit_MenuItem_22_text;
	public void dijit_MenuItem_22_text(){
		dijit_MenuItem_22_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_21']/td[4]/div")  //NoneSelectionMode  - ButtonECA - close
	private WebElement ButtonECA_Close;
	public void ButtonECA_Close(){
		ButtonECA_Close.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_15']/div/div/div/div[3]/table/tbody/tr/td[6]/span/span/div/span")  //NoneSelectionMode  - ButtonURL
	private WebElement NoneSelectionMode_ButtonURL;
	public void NoneSelectionMode_ButtonURL(){
		NoneSelectionMode_ButtonURL.click();
	}
	
	@FindBy(id="dijit_MenuItem_23_text")  //NoneSelectionMode  - ButtonURL - launch URL
	private WebElement dijit_MenuItem_23_text;
	public void dijit_MenuItem_23_text(){
		dijit_MenuItem_23_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_24_text")  //NoneSelectionMode  - ButtonURL - launch URL in new window
	private WebElement dijit_MenuItem_24_text;
	public void dijit_MenuItem_24_text(){
		dijit_MenuItem_24_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_23']/td[4]/div")  //NoneSelectionMode  - ButtonURL - close
	private WebElement ButtonURL_Close;
	public void ButtonURL_Close(){
		ButtonURL_Close.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_15']/div/div/div/div[3]/table/tbody/tr/td[7]/span/span/div/span")  //NoneSelectionMode  - ButtonSubmit
	private WebElement NoneSelectionMode_ButtonSubmit;
	public void NoneSelectionMode_ButtonSubmit(){
		NoneSelectionMode_ButtonSubmit.click();
	}
	
	@FindBy(id="dijit_MenuItem_25_text")  //NoneSelectionMode  - ButtonSubmit - SubmitByChangeFlowEvent
	private WebElement dijit_MenuItem_25_text;
	public void dijit_MenuItem_25_text(){
		dijit_MenuItem_25_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_26_text")  //NoneSelectionMode  - ButtonSubmit - SubmitByLaunchNewFlow
	private WebElement dijit_MenuItem_26_text;
	public void dijit_MenuItem_26_text(){
		dijit_MenuItem_26_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_27_text")  //NoneSelectionMode  - ButtonSubmit - SubmitByLaunchOperation
	private WebElement dijit_MenuItem_27_text;
	public void dijit_MenuItem_27_text(){
		dijit_MenuItem_27_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_28_text")  //NoneSelectionMode  - ButtonSubmit - NoDataByChangeFlowEvent
	private WebElement dijit_MenuItem_28_text;
	public void dijit_MenuItem_28_text(){
		dijit_MenuItem_28_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_29_text")  //NoneSelectionMode  - ButtonSubmit - NoDataByLaunchNewFlow
	private WebElement dijit_MenuItem_29_text;
	public void dijit_MenuItem_29_text(){
		dijit_MenuItem_29_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_30_text")  //NoneSelectionMode  - ButtonSubmit - NoDataByLaunchOperation
	private WebElement dijit_MenuItem_30_text;
	public void dijit_MenuItem_30_text(){
		dijit_MenuItem_30_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_31_text")  //NoneSelectionMode  - ButtonSubmit - WithoutValidationByChangeFlowEvent
	private WebElement dijit_MenuItem_31_text;
	public void dijit_MenuItem_31_text(){
		dijit_MenuItem_31_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_32_text")  //NoneSelectionMode  - ButtonSubmit - WithoutValidationByLaunchNewFlow
	private WebElement dijit_MenuItem_32_text;
	public void dijit_MenuItem_32_text(){
		dijit_MenuItem_32_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_33_text")  //NoneSelectionMode  - ButtonSubmit - WithoutValidationByLaunchOperation
	private WebElement dijit_MenuItem_33_text;
	public void dijit_MenuItem_33_text(){
		dijit_MenuItem_33_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_25']/td[4]/div")  //NoneSelectionMode  - ButtonSubmit - close
	private WebElement ButtonSubmit_Close;
	public void ButtonSubmit_Close(){
		ButtonSubmit_Close.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_text")  //NoneSelectionMode  - mandatory textbox
	private WebElement NonEditableTableInTabbedPane_text;
	public void NonEditableTableInTabbedPane_text(){
		NonEditableTableInTabbedPane_text.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_checkBox")  //NoneSelectionMode  - feel happy checkbox
	private WebElement NonEditableTableInTabbedPane_checkBox;
	public void NonEditableTableInTabbedPane_checkBox(){
		NonEditableTableInTabbedPane_checkBox.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_combo")  //NoneSelectionMode  - combolist
	private WebElement NonEditableTableInTabbedPane_combo;
	public void NonEditableTableInTabbedPane_combo(){
		NonEditableTableInTabbedPane_combo.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button02_label")  //NoneSelectionMode  - submit - Submit By ChangeFlowEvent
	private WebElement NonEditableTableInTabbedPane_button02_label;
	public void NonEditableTableInTabbedPane_button02_label(){
		NonEditableTableInTabbedPane_button02_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button04_label")  //NoneSelectionMode  - submit - Submit By Launch New Flow
	private WebElement NonEditableTableInTabbedPane_button04_label;
	public void NonEditableTableInTabbedPane_button04_label(){
		NonEditableTableInTabbedPane_button04_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button05_label")  //NoneSelectionMode  - submit - Submit By Launch Operation
	private WebElement NonEditableTableInTabbedPane_button05_label;
	public void NonEditableTableInTabbedPane_button05_label(){
		NonEditableTableInTabbedPane_button05_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button03_label")  //NoneSelectionMode  - submit with no data(Cancle) - submit with no data(Cancle)
	private WebElement NonEditableTableInTabbedPane_button03_label;
	public void NonEditableTableInTabbedPane_button03_label(){
		NonEditableTableInTabbedPane_button03_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_Button02_label")  //NoneSelectionMode  - submit with no data(Cancle) - Cancle By Launch New Flow
	private WebElement NonEditableTableInTabbedPane_Button02_label;
	public void NonEditableTableInTabbedPane_Button02_label(){
		NonEditableTableInTabbedPane_Button02_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button06_label")  //NoneSelectionMode  - submit with no data(Cancle) - Cancle By Launch Operation
	private WebElement NonEditableTableInTabbedPane_button06_label;
	public void NonEditableTableInTabbedPane_button06_label(){
		NonEditableTableInTabbedPane_button06_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_Button01_label")  //NoneSelectionMode  - submit without validation(Save) - Save By ChangeFlowEvent
	private WebElement NonEditableTableInTabbedPane_Button01_label;
	public void NonEditableTableInTabbedPane_Button01_label(){
		NonEditableTableInTabbedPane_Button01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button07_label")  //NoneSelectionMode  - submit without validation(Save) - Save By LaunchNewFlow
	private WebElement NonEditableTableInTabbedPane_button07_label;
	public void NonEditableTableInTabbedPane_button07_label(){
		NonEditableTableInTabbedPane_button07_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button08_label")  //NoneSelectionMode  - submit without validation(Save) - Save By LaunchOperation
	private WebElement NonEditableTableInTabbedPane_button08_label;
	public void NonEditableTableInTabbedPane_button08_label(){
		NonEditableTableInTabbedPane_button08_label.click();
	}
	/*=============NoneSelectionMode end====================*/
}
