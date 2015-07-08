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
}
