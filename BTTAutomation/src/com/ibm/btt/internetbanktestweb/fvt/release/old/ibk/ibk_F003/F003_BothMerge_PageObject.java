package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F003_BothMerge_PageObject {
	@FindBy(id="F003_Both_table")
	private WebElement F003BothTable;
	@FindBy(id="F003_Both_button_hide01")
	private WebElement F003_Hide_button_01;
	@FindBy(id="F003_Both_button_show01")
	private WebElement F003_Show_button01;
	@FindBy(id="F003_Both_button")
	private WebElement F003_Submit_button;
	
	public WebElement getTable(){
		return F003BothTable;
	}
	public WebElement getHideButton01(){
		return F003_Hide_button_01;
	}
	public WebElement getShowButton01(){
		return F003_Show_button01;
	}
	
	public WebElement getSubmitButton(){
		return F003_Submit_button;
	}
	
}
