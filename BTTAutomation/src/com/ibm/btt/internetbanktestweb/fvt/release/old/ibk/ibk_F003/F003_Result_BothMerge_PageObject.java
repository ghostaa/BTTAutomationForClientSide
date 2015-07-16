package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class F003_Result_BothMerge_PageObject {
	
	//###############################F003 Both Merge Result Page##################################
	@FindBy(id="F003_Result_Both_label01")
	private WebElement labelHisId;
	@FindBy(id="F003_Result_Both_label03")
	private WebElement labelT;
	@FindBy(id="F003_Result_Both_label05")
	private WebElement labelDate;
	@FindBy(id="F003_Result_Both_label09")
	private WebElement labelAmount;
	@FindBy(id="F003_Result_Both_label07")
	private WebElement labelComment;
	
	@FindBy(id="F003_Result_Both_table_copy")
	private WebElement F003Result_Both;
	
	public WebElement getSingleResult_labelHisId(){
		return labelHisId;
	}

	public WebElement getSingleResult_labelT(){
		return labelT;
	}
	
	public WebElement getSingleResult_labelDate(){
		return labelDate;
	}
	public WebElement getSingleResult_labelAmount(){
		return labelAmount;
	}
	public WebElement getSingleResult_labelComment(){
		return labelComment;
	}
	
	public WebElement getUpdatedTable(){
		return F003Result_Both;
	}
	
	
}
