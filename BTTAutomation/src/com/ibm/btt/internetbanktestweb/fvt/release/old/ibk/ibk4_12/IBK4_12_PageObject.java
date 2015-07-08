package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_PageObject extends Index_Page{
	
	/***********main page start***********/
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[6]/table/tbody/tr/td[1]/div/span")
	private WebElement record5;
	public void selectFive(){
		record5.click();
	}
	public String record5Name(){
		return record5.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[6]/table/tbody/tr/td[5]/div/span")
	private WebElement record5Balance;
	public String record5Balance(){
		return record5Balance.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[7]/table/tbody/tr/td[1]/div/span")
	private WebElement record6;
	public void selectSix(){
		record6.click();
	}
	public String record6Name(){
		return record6.getText();
	}
	
	@FindBy(id="NonEditableTable_link") //Link to 'table in group' page
	private WebElement tableInGroup;
	public void tableInGroupLink(){
		tableInGroup.click();
	}
	
	@FindBy(id="NonEditableTable_link02") //Link to popup page (table in group)
	private WebElement tableInGroupPopup;
	public void tableInGroupPopupLink(){
		tableInGroupPopup.click();
	}
	
	@FindBy(id="NonEditableTable_button_label")  //button - submit to group page
	private WebElement tableInGroupButton;
	public void tableInGroupButton(){
		tableInGroupButton.click();
	}
	
	@FindBy(id="NonEditableTable_button02_label")  //button - submit to group popup page
	private WebElement tableInGroupPopupButton;
	public void tableInGroupPopupButton(){
		tableInGroupPopupButton.click();
	}
	
	
	@FindBy(id="NonEditableTable_link04")  //Link to popup page(table in tabbedPane)
	private WebElement tableInTabbedPanePopupLink;
	public void tableInTabbedPanePopupLink(){
		tableInTabbedPanePopupLink.click();
	}
	
	@FindBy(id="NonEditableTable_button01_label")  //button - submit to pane page
	private WebElement tableInPaneButton;
	public void tableInPaneButton(){
		tableInPaneButton.click();
	}
	
	@FindBy(id="NonEditableTable_button03_label")  //button - submit to pane popup page
	private WebElement tableInPanePopupButton;
	public void tableInPanePopupButton(){
		tableInPanePopupButton.click();
	}
	
	@FindBy(id="NonEditableTable_link03")  //Link to 'manipulate table' page
	private WebElement manipulateLink;
	public void manipulateLink(){
		manipulateLink.click();
	}
	/***********main page end***********/
	
	/***********table in group start***********/
	@FindBy(id="NonEditableTableInGroup_link")  // non-editable table
	private WebElement NonEditableTableInGroup_link;
	public void NonEditableTableInGroup_link(){
		NonEditableTableInGroup_link.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[7]/table/tbody/tr/td[1]/div/span")  //Helen6 - AccountName
	private WebElement TableInGroupAccountName;
	public void TableInGroupAccountName(){
		TableInGroupAccountName.click();
	}
	public String getTableInGroupAccountName(){
		return TableInGroupAccountName.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[7]/table/tbody/tr/td[5]/div/span") //Helen6 - AccountBalance
	private WebElement TableInGroupAccountBalance;
	public String getTableInGroupAccountBalance(){
		return TableInGroupAccountBalance.getText();
	}
	
	@FindBy(id="NonEditableTableInGroup_button")   //button - to group popup page
	private WebElement NonEditableTableInGroup_button;
	public void NonEditableTableInGroup_button(){
		NonEditableTableInGroup_button.click();
	}
	
	@FindBy(id="NonEditableTableInGroup_button01")  //button - to pane page
	private WebElement NonEditableTableInGroup_button01;
	public void NonEditableTableInGroup_button01(){
		NonEditableTableInGroup_button01.click();
	}
	
	//Selection Result in group
	@FindBy(id="SelectionResultInGroupPage_link_copy")  // non-editable table
	private WebElement SelectionResultInGroupPage_link_copy;
	public void SelectionResultInGroupPage_link_copy(){
		SelectionResultInGroupPage_link_copy.click();
	}
	
	@FindBy(id="SelectionResultInGroupPage_label01")  //AccountName
	private WebElement SelectionResultInGroupPage_label01;
	public String SelectionResultInGroupPage_label01(){
		return SelectionResultInGroupPage_label01.getText();
	}
	
	@FindBy(id="SelectionResultInGroupPage_label05")  //AccountBalance
	private WebElement SelectionResultInGroupPage_label05;
	public String SelectionResultInGroupPage_label05(){
		return SelectionResultInGroupPage_label05.getText();
	}
	//Selection Result in pane
	@FindBy(id="SelectionResultInPanePage_link_copy")  // non-editable table
	private WebElement SelectionResultInPanePage_link_copy;
	public void SelectionResultInPanePage_link_copy(){
		SelectionResultInPanePage_link_copy.click();
	}
	
	@FindBy(id="SelectionResultInPanePage_tabbedPane_tablist_SelectionResultInPanePage_ContentPane02")  // single-selection result
	private WebElement SelectionResultInPanePage_ContentPane02;
	public void SelectionResultInPanePage_ContentPane02(){
		SelectionResultInPanePage_ContentPane02.click();
	}
	
	@FindBy(id="SelectionResultInPanePage_label01")  //AccountName
	private WebElement SelectionResultInPanePage_label01;
	public String SelectionResultInPanePage_label01(){
		return SelectionResultInPanePage_label01.getText();
	}
	
	@FindBy(id="SelectionResultInPanePage_label05")  //AccountBalance
	private WebElement SelectionResultInPanePage_label05;
	public String SelectionResultInPanePage_label05(){
		return SelectionResultInPanePage_label05.getText();
	}
	/***********table in group end***********/
	
	/***********popup1 page start***********/
	@FindBy(id="NonEditableTableInGroup_link")
	private WebElement NonEditableTableInGroup_link2;
	public void NonEditableTableInGroup_link2(){
		NonEditableTableInGroup_link2.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[6]/table/tbody/tr/td[1]/div/span") //AccountName - Helen5
	private WebElement PopupPage1AccountName;
	public void PopupPage1AccountName(){
		PopupPage1AccountName.click();
	}
	public String getPopupPage1AccountName(){
		return PopupPage1AccountName.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[6]/table/tbody/tr/td[5]/div/span") //AccountBalance - Helen5
	private WebElement PopupPage1AccountBalance;
	public String getPopupPage1AccountBalance(){
		return PopupPage1AccountBalance.getText();
	}
	
	@FindBy(id="NonEditableTableInGroup_button_label")  //button - to group popup page
	private WebElement NonEditableTableInGroup_button_label;
	public void NonEditableTableInGroup_button_label(){
		NonEditableTableInGroup_button_label.click();
	}
	
	@FindBy(id="NonEditableTableInGroup_button01_label") //button - to pane page
	private WebElement NonEditableTableInGroup_button01_label;
	public void NonEditableTableInGroup_button01_label(){
		NonEditableTableInGroup_button01_label.click();
	}
	//Popup Group Page -- refer to [table in group - Selection Result in group]
	//Popup Pane Page --  refer to [table in group - Selection Result in pane]
	/***********popup1 page end***********/
	
	/***********group page start***********/
	@FindBy(id="SelectionResultInGroupPage_link_copy") //button - submit to group page
	private WebElement SubmitResultInGroupPage_link;
	public void SubmitResultInGroupPage_link(){
		SubmitResultInGroupPage_link.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[1]/div/span") 
	private WebElement record1AccountName;
	public String record1AccountName(){
		return record1AccountName.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[1]/table/tbody/tr/td[5]/div/span") 
	private WebElement record1AccountBalance;
	public String record1AccountBalance(){
		return record1AccountBalance.getText();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[2]/table/tbody/tr/td[1]/div/span") 
	private WebElement record2AccountName;
	public String record2AccountName(){
		return record2AccountName.getText();
	}
	/***********group page end***********/
	
	/***********group popup page start***********/
	/***********group popup page end***********/
	
	/***********table in TabbedPane start***********/
	/***********table in TabbedPane end***********/
	
	/***********popup2 page start***********/
	/***********popup2 page end***********/
	
	/***********pane page start***********/
	/***********pane page end***********/
	
	/***********pane popup page start***********/
	/***********pane popup page end***********/
	
	/***********manipulate table start***********/
	/***********manipulate table end***********/

}
