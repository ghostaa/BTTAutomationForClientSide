package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F003_Result_BodyCell_PageObject {
	
	//###############################F003 Cell Merge Page##################################
	@FindBy(id="F003_Result_BodyCell_table")
	private WebElement F003Result_MultiSelectTable;
	@FindBy(id="F003_Result_BodyCell_table_copy")
	private WebElement F003Result_Whole;
	
	public WebElement getMultiSelectTable(){
		return F003Result_MultiSelectTable;
	
	}

	public WebElement getUpdatedTable(){
		return F003Result_Whole;
	}
	
	
}
