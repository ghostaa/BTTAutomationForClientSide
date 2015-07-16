package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F003_BaisicTableStyleAlign_PageObject {
	@FindBy(id="F003_Header_Table01")
	private WebElement F003_Header_Table01;
	
	public WebElement getTable(){
		return F003_Header_Table01;
	}
	
}
