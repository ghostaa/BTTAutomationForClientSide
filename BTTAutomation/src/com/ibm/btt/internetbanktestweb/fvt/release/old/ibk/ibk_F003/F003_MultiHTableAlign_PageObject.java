package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F003_MultiHTableAlign_PageObject {
	@FindBy(id="F003_Both_table")
	private WebElement F003_Both_table;
	
	public WebElement getTable(){
		return F003_Both_table;
	}
	
}
