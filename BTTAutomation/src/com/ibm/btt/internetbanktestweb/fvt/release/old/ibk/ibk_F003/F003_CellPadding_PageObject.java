package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F003_CellPadding_PageObject {
	@FindBy(id="F003_BodyCell_table")
	private WebElement F003_BodyCellPaddingTable;
	@FindBy(id="F003_BodyCell_button")
	private WebElement F003_BodyCell_button;
	
	public WebElement getTable(){
		return F003_BodyCellPaddingTable;
	}
	
	public WebElement getSubmitButton(){
		return F003_BodyCell_button;
	}
	
}
