package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class F003_Cell_PageObject{
	
	//###############################F003 Cell Merge Page##################################
	@FindBy(id="F003_BodyCell_table")
	private WebElement F003CellTable;
	
	public WebElement getTableHeader(){
		WebElement tableHeader = F003CellTable.findElement(By
				.className("dojoxGridMasterHeader"));
		return tableHeader;
	}
	
	public WebElement getTableBody(){
		WebElement tableBody = F003CellTable.findElement(By
				.className("dojoxGridMasterView"));
		return tableBody;
	}
}
