package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_TableInTabbedPane_PageObject extends Index_Page{

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
	
	/*=============normalTab start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane01")  //NormalTab
	private WebElement NonEditableTableInTabbedPane_ContentPane01;
	public void NonEditableTableInTabbedPane_ContentPane01(){
		NonEditableTableInTabbedPane_ContentPane01.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[3]/table/tbody/tr/td[1]/div/span")  
	private WebElement Helen2AccountName;
	public void Helen2AccountName(){
		Helen2AccountName.click();
	}
	public String getHelen2AccountName(){
		return Helen2AccountName.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[3]/table/tbody/tr/td[5]/div/span")  
	private WebElement Helen2AccountBalance;
	public String getHelen2AccountBalance(){
		return Helen2AccountBalance.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[4]/table/tbody/tr/td[1]/div/span")  
	private WebElement Helen3AccountName;
	public void Helen3AccountName(){
		Helen3AccountName.click();
	}
	public String getHelen3AccountName(){
		return Helen3AccountName.getText();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_button_label")  //to group page
	private WebElement NonEditableTableInTabbedPane_button_label;
	public void NonEditableTableInTabbedPane_button_label(){
		NonEditableTableInTabbedPane_button_label.click();
	}

	@FindBy(id="NonEditableTableInTabbedPane_button01_label")  //to pane popup page
	private WebElement NonEditableTableInTabbedPane_button01_label;
	public void NonEditableTableInTabbedPane_button01_label(){
		NonEditableTableInTabbedPane_button01_label.click();
	}
	//group result
	@FindBy(id="SelectionResultInGroupPage_link_copy")  //non-editable table
	private WebElement SelectionResultInGroupPage_link_copy;
	public void SelectionResultInGroupPage_link_copy(){
		SelectionResultInGroupPage_link_copy.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_23']/div/div/div/div[1]/table/tbody/tr/td[1]/div/span")  
	private WebElement Helen2AccountNameResult;
	public String Helen2AccountNameResult(){
		return Helen2AccountNameResult.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_23']/div/div/div/div[1]/table/tbody/tr/td[5]/div/span")  
	private WebElement Helen2AccountBalanceResult;
	public String Helen2AccountBalanceResult(){
		return Helen2AccountBalanceResult.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_23']/div/div/div/div[2]/table/tbody/tr/td[1]/div/span")  
	private WebElement Helen3AccountNameResult;
	public String Helen3AccountNameResult(){
		return Helen3AccountNameResult.getText();
	}
	/*=============normalTab end====================*/
	
	/*=============Group start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane02")  //Group
	private WebElement NonEditableTableInTabbedPane_ContentPane02;
	public void NonEditableTableInTabbedPane_ContentPane02(){
		NonEditableTableInTabbedPane_ContentPane02.click();
	}
	//TODO 如何测试table的表头 resizable = "false"
	/*=============Group end====================*/
	
	/*=============Pane start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane03")  //Pane
	private WebElement NonEditableTableInTabbedPane_ContentPane03;
	public void NonEditableTableInTabbedPane_ContentPane03(){
		NonEditableTableInTabbedPane_ContentPane03.click();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane01_tablist_NonEditableTableInTabbedPane_ContentPane04")  //Pane-Tab01
	private WebElement NonEditableTableInTabbedPane_ContentPane04;
	public void NonEditableTableInTabbedPane_ContentPane04(){
		NonEditableTableInTabbedPane_ContentPane04.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_7']/div/div/div/div[5]/table/tbody/tr/td[1]/div/span")
	private WebElement tab01AccountName;
	public String tab01AccountName(){
		return tab01AccountName.getText();
	}
	
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane01_tablist_NonEditableTableInTabbedPane_ContentPane05")  //Pane-Tab02
	private WebElement NonEditableTableInTabbedPane_ContentPane05;
	public void NonEditableTableInTabbedPane_ContentPane05(){
		NonEditableTableInTabbedPane_ContentPane05.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_9']/div/div/div/div[3]/table/tbody/tr/td[1]/div/span")
	private WebElement tab02AccountName;
	public String tab02AccountName(){
		return tab02AccountName.getText();
	}
	/*=============Pane end====================*/
	
	/*=============Link start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane09")  //Pane
	private WebElement NonEditableTableInTabbedPane_ContentPane09;
	public void NonEditableTableInTabbedPane_ContentPane09(){
		NonEditableTableInTabbedPane_ContentPane09.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_11']/div/div/div/div[1]/table/tbody/tr/td[1]/a")  
	private WebElement dataNameforLink;
	public void dataNameforLink(){
		dataNameforLink.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_11']/div/div/div/div[1]/table/tbody/tr/td[2]/a")  
	private WebElement imageLinkText;
	public void imageLinkText(){
		imageLinkText.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_11']/div/div/div/div[1]/table/tbody/tr/td[3]/a")  
	private WebElement changeFlowEvent;
	public void changeFlowEvent(){
		changeFlowEvent.click();
	}
	
	@FindBy(id="SelectionResultInGroupPage_label")  
	private WebElement changeToBlank;
	public String changeToBlank(){
		return changeToBlank.getText();
	}
	
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_11']/div/div/div/div[1]/table/tbody/tr/td[4]/img")  
	private WebElement imageLink;
	public void imageLink(){
		imageLink.click();
	}
	
	@FindBy(id="su")  //跳转到baidu,判断搜索按钮是否为"百度一下"
	private WebElement baiduId;
	public String baiduId(){
		return dataNameforLink.getAttribute("value");
	}
	/*=============Link end====================*/
	
	/*=============Button start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane10")  //Pane
	private WebElement NonEditableTableInTabbedPane_ContentPane10;
	public void NonEditableTableInTabbedPane_ContentPane10(){
		NonEditableTableInTabbedPane_ContentPane10.click();
	}
	/*=============Button end====================*/
	
	/*=============NoneSelectionMode start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane06")  //Pane
	private WebElement NonEditableTableInTabbedPane_ContentPane06;
	public void NonEditableTableInTabbedPane_ContentPane06(){
		NonEditableTableInTabbedPane_ContentPane06.click();
	}
	/*=============NoneSelectionMode end====================*/
	
	/*=============SingleSelectionMode start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane08")  //Pane
	private WebElement NonEditableTableInTabbedPane_ContentPane08;
	public void NonEditableTableInTabbedPane_ContentPane08(){
		NonEditableTableInTabbedPane_ContentPane08.click();
	}
	/*=============SingleSelectionMode end====================*/
	
	/*=============MutipleSelectionMode start====================*/
	@FindBy(id="NonEditableTableInTabbedPane_tabbedPane_tablist_NonEditableTableInTabbedPane_ContentPane07")  //Pane
	private WebElement NonEditableTableInTabbedPane_ContentPane07;
	public void NonEditableTableInTabbedPane_ContentPane07(){
		NonEditableTableInTabbedPane_ContentPane07.click();
	}
	/*=============MutipleSelectionMode end====================*/
	
}
