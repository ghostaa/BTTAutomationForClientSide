package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_11;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

public class IBK4_11_PageObject extends Index_Page {
	
//###############################Link multi-widget by tooling ##################################
	
	@FindBy(id="IBK_4_11_mutiWidget_index_link02")
	private WebElement LinkMultiWidgetByTooling;
		
	public void LinkMultiWidgetByTooling(){
		LinkMultiWidgetByTooling.click();
	}

	@FindBy(id="IBK_4_11_mutiWidget_link_byTooling_RowIdResult")
	private WebElement LinkRowIndex;

	public String LinkRowIndex() {
		return LinkRowIndex.getText();
	}

	@FindBy(id="IBK_4_11_mutiWidget_link_byTooling_MenuIdResult")
	private WebElement LinkMenuId;

	public String LinkMenuId() {
		return LinkMenuId.getText();
	}
	
	@FindBy(id="IBK_4_11_mutiWidget_link_byTooling_WidgetIdResult")
	private WebElement LinkWidgetId;

	public String LinkWidgetId() {
		return LinkWidgetId.getText();
	}
	
	public String LinkInfo(){
		return "RowIndex: " + LinkRowIndex() + ";MenuId: " + LinkMenuId() + ";WidgetId: " + LinkWidgetId();
	}
	
	@FindBy(id="IBK_4_11_mutiWidget_link_byTooling_table")
	private WebElement IBK4_11MutiWidgetLinkByToolingTable;
	
	public String[] tableHeaderText(){
		List<WebElement> tableheader = IBK4_11MutiWidgetLinkByToolingTable.findElement(By.className("dojoxGridMasterHeader")).findElements(By.tagName("div"));
			String headertexts = tableheader.get(0).getText();
			String[] headertext = headertexts.split("\n");
			return headertext;
	}
	
	public List tableBody(){
		List<WebElement> tableRow = IBK4_11MutiWidgetLinkByToolingTable.findElement(By.className("dojoxGridMasterView")).findElements(By.className("dojoxGridRow"));
		return tableRow;
	}
	
	
}
