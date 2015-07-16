package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane_MultipleSelectionMode;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_TableInTabbedPane_MultiSelectionMode_PageObject extends Index_Page{

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

	/*=============MutipleSelectionMode start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane07")  //MutipleSelectionMode
	private WebElement NonEditableTableInTabbedPane_ContentPane07;
	public void NonEditableTableInTabbedPane_ContentPane07(){
		NonEditableTableInTabbedPane_ContentPane07.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_21']/div/div/div/div[1]/table/tbody/tr/td[1]/a")  //MutipleSelectionMode  - Rate
	private WebElement MutipleSelectionMode_Rate;
	public void MutipleSelectionMode_Rate(){
		MutipleSelectionMode_Rate.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_21']/div/div/div/div[1]/table/tbody/tr/td[2]/a")  //MutipleSelectionMode  - LinkECA
	private WebElement MutipleSelectionMode_LinkECA;
	public void MutipleSelectionMode_LinkECA(){
		MutipleSelectionMode_LinkECA.click();
	}
	
	@FindBy(id="dijit_MenuItem_60_text")  //MutipleSelectionMode  - LinkECA - ECA
	private WebElement dijit_MenuItem_60_text;
	public void dijit_MenuItem_60_text(){
		dijit_MenuItem_60_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_61_text")  //MutipleSelectionMode  - LinkECA - ECA2
	private WebElement dijit_MenuItem_61_text;
	public void dijit_MenuItem_61_text(){
		dijit_MenuItem_61_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_60']/td[4]/div")  //MutipleSelectionMode  - LinkECA - close
	private WebElement LinkECA_close;
	public void LinkECA_close(){
		LinkECA_close.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_show1")  //MutipleSelectionMode  - LinkECA - ItemId testing result
	private WebElement NonEditableTableInTabbedPane_show1;
	public String NonEditableTableInTabbedPane_show1(){
		return NonEditableTableInTabbedPane_show1.getText();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_show2")  //MutipleSelectionMode  - LinkECA - WidgetId testing result
	private WebElement NonEditableTableInTabbedPane_show2;
	public String NonEditableTableInTabbedPane_show2(){
		return NonEditableTableInTabbedPane_show2.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_21']/div/div/div/div[1]/table/tbody/tr/td[3]/a")  //MutipleSelectionMode  - LinkURL
	private WebElement MutipleSelectionMode_LinkURL;
	public void MutipleSelectionMode_LinkURL(){
		MutipleSelectionMode_LinkURL.click();
	}
	
	@FindBy(id="dijit_MenuItem_62_text")  //MutipleSelectionMode  - LinkURL - launch URL
	private WebElement dijit_MenuItem_62_text;
	public void dijit_MenuItem_62_text(){
		dijit_MenuItem_62_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_63_text")  //MutipleSelectionMode  - LinkURL - launch URL in new window
	private WebElement dijit_MenuItem_63_text;
	public void dijit_MenuItem_63_text(){
		dijit_MenuItem_63_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_62']/td[4]/div")  //MutipleSelectionMode  - LinkURL - close
	private WebElement LinkURL_close;
	public void LinkURL_close(){
		LinkURL_close.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_21']/div/div/div/div[1]/table/tbody/tr/td[4]/a")  //MutipleSelectionMode  - LinkSubmit
	private WebElement MutipleSelectionMode_LinkSubmit;
	public void MutipleSelectionMode_LinkSubmit(){
		MutipleSelectionMode_LinkSubmit.click();
	}
	
	@FindBy(id="dijit_MenuItem_64_text")  //MutipleSelectionMode  - LinkSubmit - SubmitByChangeFlowEvent
	private WebElement dijit_MenuItem_64_text;
	public void dijit_MenuItem_64_text(){
		dijit_MenuItem_64_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_65_text")  //MutipleSelectionMode  - LinkSubmit - SubmitByLaunchNewFlow
	private WebElement dijit_MenuItem_65_text;
	public void dijit_MenuItem_65_text(){
		dijit_MenuItem_65_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_66_text")  //MutipleSelectionMode  - LinkSubmit - SubmitByLaunchOperation
	private WebElement dijit_MenuItem_66_text;
	public void dijit_MenuItem_66_text(){
		dijit_MenuItem_66_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_67_text")  //MutipleSelectionMode  - LinkSubmit - NoDataByChangeFlowEvent
	private WebElement dijit_MenuItem_67_text;
	public void dijit_MenuItem_67_text(){
		dijit_MenuItem_67_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_68_text")  //MutipleSelectionMode  - LinkSubmit - NoDataByLaunchNewFlow
	private WebElement dijit_MenuItem_68_text;
	public void dijit_MenuItem_68_text(){
		dijit_MenuItem_68_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_69_text")  //MutipleSelectionMode  - LinkSubmit - NoDataByLaunchOperation
	private WebElement dijit_MenuItem_69_text;
	public void dijit_MenuItem_69_text(){
		dijit_MenuItem_69_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_70_text")  //MutipleSelectionMode  - LinkSubmit - WithoutValidationByChangeFlowEvent
	private WebElement dijit_MenuItem_70_text;
	public void dijit_MenuItem_70_text(){
		dijit_MenuItem_70_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_71_text")  //MutipleSelectionMode  - LinkSubmit - WithoutValidationByLaunchNewFlow
	private WebElement dijit_MenuItem_71_text;
	public void dijit_MenuItem_71_text(){
		dijit_MenuItem_71_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_72_text")  //MutipleSelectionMode  - LinkSubmit - WithoutValidationByLaunchOperation
	private WebElement dijit_MenuItem_72_text;
	public void dijit_MenuItem_72_text(){
		dijit_MenuItem_72_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dijit_MenuItem_64']/td[4]/div")  //MutipleSelectionMode  - LinkSubmit - close
	private WebElement LinkSubmit_Close;
	public void LinkSubmit_Close(){
		LinkSubmit_Close.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_21']/div/div/div/div[1]/table/tbody/tr/td[5]/span/span/div/span")  //MutipleSelectionMode  - ButtonECA
	private WebElement MutipleSelectionMode_ButtonECA;
	public WebElement MutipleSelectionMode_ButtonECA(){
		return MutipleSelectionMode_ButtonECA;
	}
	
	@FindBy(id="dijit_MenuItem_73_text")  //MutipleSelectionMode  - ButtonECA - NoAction
	private WebElement dijit_MenuItem_73_text;
	public void dijit_MenuItem_73_text(){
		dijit_MenuItem_73_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_74_text")  //MutipleSelectionMode  - ButtonECA - English
	private WebElement dijit_MenuItem_74_text;
	public void dijit_MenuItem_74_text(){
		dijit_MenuItem_74_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_21']/div/div/div/div[1]/table/tbody/tr/td[6]/span/span/div/span")  //MutipleSelectionMode  - ButtonURL
	private WebElement MutipleSelectionMode_ButtonURL;
	public void MutipleSelectionMode_ButtonURL(){
		MutipleSelectionMode_ButtonURL.click();
	}
	
	@FindBy(id="dijit_MenuItem_75_text")  //MutipleSelectionMode  - ButtonURL - launch URL
	private WebElement dijit_MenuItem_75_text;
	public void dijit_MenuItem_75_text(){
		dijit_MenuItem_75_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_76_text")  //MutipleSelectionMode  - ButtonURL - launch URL in new window
	private WebElement dijit_MenuItem_76_text;
	public void dijit_MenuItem_76_text(){
		dijit_MenuItem_76_text.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_21']/div/div/div/div[1]/table/tbody/tr/td[7]/span/span/div/span")  //MutipleSelectionMode  - ButtonSubmit
	private WebElement MutipleSelectionMode_ButtonSubmit;
	public void MutipleSelectionMode_ButtonSubmit(){
		MutipleSelectionMode_ButtonSubmit.click();
	}
	
	@FindBy(id="dijit_MenuItem_77_text")  //MutipleSelectionMode  - ButtonSubmit - SubmitByChangeFlowEvent
	private WebElement dijit_MenuItem_77_text;
	public void dijit_MenuItem_77_text(){
		dijit_MenuItem_77_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_78_text")  //MutipleSelectionMode  - ButtonSubmit - SubmitByLaunchNewFlow
	private WebElement dijit_MenuItem_78_text;
	public void dijit_MenuItem_78_text(){
		dijit_MenuItem_78_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_79_text")  //MutipleSelectionMode  - ButtonSubmit - SubmitByLaunchOperation
	private WebElement dijit_MenuItem_79_text;
	public void dijit_MenuItem_79_text(){
		dijit_MenuItem_79_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_80_text")  //MutipleSelectionMode  - ButtonSubmit - NoDataByChangeFlowEvent
	private WebElement dijit_MenuItem_80_text;
	public void dijit_MenuItem_80_text(){
		dijit_MenuItem_80_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_81_text")  //MutipleSelectionMode  - ButtonSubmit - NoDataByLaunchNewFlow
	private WebElement dijit_MenuItem_81_text;
	public void dijit_MenuItem_81_text(){
		dijit_MenuItem_81_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_82_text")  //MutipleSelectionMode  - ButtonSubmit - NoDataByLaunchOperation
	private WebElement dijit_MenuItem_82_text;
	public void dijit_MenuItem_82_text(){
		dijit_MenuItem_82_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_83_text")  //MutipleSelectionMode  - ButtonSubmit - WithoutValidationByChangeFlowEvent
	private WebElement dijit_MenuItem_83_text;
	public void dijit_MenuItem_83_text(){
		dijit_MenuItem_83_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_84_text")  //MutipleSelectionMode  - ButtonSubmit - WithoutValidationByLaunchNewFlow
	private WebElement dijit_MenuItem_84_text;
	public void dijit_MenuItem_84_text(){
		dijit_MenuItem_84_text.click();
	}
	
	@FindBy(id="dijit_MenuItem_85_text")  //MutipleSelectionMode  - ButtonSubmit - WithoutValidationByLaunchOperation
	private WebElement dijit_MenuItem_85_text;
	public void dijit_MenuItem_85_text(){
		dijit_MenuItem_85_text.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_text_copy01")  //MutipleSelectionMode  - mandatory textbox
	private WebElement NonEditableTableInTabbedPane_text_copy01;
	public void NonEditableTableInTabbedPane_text_copy01(){
		NonEditableTableInTabbedPane_text_copy01.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_checkBox_copy01")  //MutipleSelectionMode  - feel happy checkbox
	private WebElement NonEditableTableInTabbedPane_checkBox_copy01;
	public void NonEditableTableInTabbedPane_checkBox_copy01(){
		NonEditableTableInTabbedPane_checkBox_copy01.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_combo_copy01")  //MutipleSelectionMode  - combolist
	private WebElement NonEditableTableInTabbedPane_combo_copy01;
	public void NonEditableTableInTabbedPane_combo_copy01(){
		NonEditableTableInTabbedPane_combo_copy01.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button02_copy01_label")  //MutipleSelectionMode  - submit - Submit By ChangeFlowEvent
	private WebElement NonEditableTableInTabbedPane_button02_copy01_label;
	public void NonEditableTableInTabbedPane_button02_copy01_label(){
		NonEditableTableInTabbedPane_button02_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button04_copy01_label")  //MutipleSelectionMode  - submit - Submit By Launch New Flow
	private WebElement NonEditableTableInTabbedPane_button04_copy01_label;
	public void NonEditableTableInTabbedPane_button04_copy01_label(){
		NonEditableTableInTabbedPane_button04_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button05_copy01_label")  //MutipleSelectionMode  - submit - Submit By Launch Operation
	private WebElement NonEditableTableInTabbedPane_button05_copy01_label;
	public void NonEditableTableInTabbedPane_button05_copy01_label(){
		NonEditableTableInTabbedPane_button05_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button03_copy01_label")  //MutipleSelectionMode  - submit with no data(Cancle) - submit with no data(Cancle)
	private WebElement NonEditableTableInTabbedPane_button03_copy01_label;
	public void NonEditableTableInTabbedPane_button03_copy01_label(){
		NonEditableTableInTabbedPane_button03_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_Button02_copy01_label")  //MutipleSelectionMode  - submit with no data(Cancle) - Cancle By Launch New Flow
	private WebElement NonEditableTableInTabbedPane_Button02_copy01_label;
	public void NonEditableTableInTabbedPane_Button02_copy01_label(){
		NonEditableTableInTabbedPane_Button02_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button06_copy01_label")  //MutipleSelectionMode  - submit with no data(Cancle) - Cancle By Launch Operation
	private WebElement NonEditableTableInTabbedPane_button06_copy01_label;
	public void NonEditableTableInTabbedPane_button06_copy01_label(){
		NonEditableTableInTabbedPane_button06_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_Button01_copy01_label")  //MutipleSelectionMode  - submit without validation(Save) - Save By ChangeFlowEvent
	private WebElement NonEditableTableInTabbedPane_Button01_copy01_label;
	public void NonEditableTableInTabbedPane_Button01_copy01_label(){
		NonEditableTableInTabbedPane_Button01_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button07_copy01_label")  //MutipleSelectionMode  - submit without validation(Save) - Save By LaunchNewFlow
	private WebElement NonEditableTableInTabbedPane_button07_copy01_label;
	public void NonEditableTableInTabbedPane_button07_copy01_label(){
		NonEditableTableInTabbedPane_button07_copy01_label.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button08_copy01_label")  //MutipleSelectionMode  - submit without validation(Save) - Save By LaunchOperation
	private WebElement NonEditableTableInTabbedPane_button08_copy01_label;
	public void NonEditableTableInTabbedPane_button08_copy01_label(){
		NonEditableTableInTabbedPane_button08_copy01_label.click();
	}
	
	/*=============MutipleSelectionMode end====================*/
	
}
