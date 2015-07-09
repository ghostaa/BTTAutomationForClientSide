package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class F003_Header_PageObject{
	
	//###############################F003 Header Merge Page##################################
	@FindBy(id="F003_Header_Table01")
	private WebElement F003Table;
	
	public WebElement getTableHeader(){
		WebElement tableHeader = F003Table.findElement(By
				.className("dojoxGridMasterHeader"));
		return tableHeader;
	}
	
	public WebElement getTableBody(){
		WebElement tableBody = F003Table.findElement(By
				.className("dojoxGridMasterView"));
		return tableBody;
	}
}
