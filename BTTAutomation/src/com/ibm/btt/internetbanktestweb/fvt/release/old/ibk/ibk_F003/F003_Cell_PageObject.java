package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class F003_Cell_PageObject{
	
	//###############################F003 Cell Merge Page##################################
	@FindBy(id="F003_BodyCell_table")
	private WebElement F003CellTable;
	@FindBy(id="F003_BodyCell_button")
	private WebElement F003_B_button;
	
	public WebElement getTable(){
		return F003CellTable;
	}
	
	
	public WebElement getBButton(){
		return F003_B_button;
	}
}
