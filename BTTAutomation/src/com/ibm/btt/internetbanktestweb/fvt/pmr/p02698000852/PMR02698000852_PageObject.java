package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PMR02698000852_PageObject {
	@FindBy(linkText="Establish Session")
	private WebElement Establish;
	
	public void Establish(){
		Establish.click();
	}
	@FindBy(id="index_tabbedPane_tablist_index_ContentPane07")
	private WebElement PMR;
	
	public void PMR_tab(){
		PMR.click();
	}
	
	@FindBy(id="index_link56")
	private WebElement PMR_link;
		
	public void PMR_link(){
		PMR_link.click();
	}
	
	
	@FindBy(id="VI_number_test_link")
	private WebElement VI_number_test_link;
		
	public void VI_number_test_link(){
		VI_number_test_link.click();
	}
	
	@FindBy(id="Text_submit_button01_label")
	private WebElement AutoFill_button_101;

	public WebElement getAutoFill_button_101() {
		return AutoFill_button_101;
	}
	
	/*
	 * 10 data types
	 * Begin
	 */
	//String
	@FindBy(id="Text_submit_text")
	private WebElement Text_submit_text;

	public WebElement getTenTypes_Text_String() {
		return Text_submit_text;
	}

	//Currency
	@FindBy(id="Text_submit_text02")
	private WebElement Text_submit_text02;

	public WebElement getTenTypes_Text_Currency() {
		return Text_submit_text02;
	}
	
	//Number
	@FindBy(id="Text_submit_text03")
	private WebElement Text_submit_text03;
	
	public WebElement getTenTypes_Text_Number() {
		return Text_submit_text03;
	}
	
	//Short
	@FindBy(id="Text_submit_text08")
	private WebElement Text_submit_text08;
	
	public WebElement getTenTypes_Text_Short() {
		return Text_submit_text08;
	}
	
	//Integer
	@FindBy(id="Text_submit_text09")
	private WebElement Text_submit_text09;
	
	public WebElement getTenTypes_Text_Integer() {
		return Text_submit_text09;
	}
		
	//Long
	@FindBy(id="Text_submit_text10")
	private WebElement Text_submit_text10;
	
	public WebElement getTenTypes_Text_Long() {
		return Text_submit_text10;
	}
	
	//Float
	@FindBy(id="Text_submit_text11")
	private WebElement Text_submit_text11;
	
	public WebElement getTenTypes_Text_Float() {
		return Text_submit_text11;
	}
	
	//Double
	@FindBy(id="Text_submit_text12")
	private WebElement Text_submit_text12;
	
	public WebElement getTenTypes_Text_Double() {
		return Text_submit_text12;
	}
	
	
	//BigInteger
	@FindBy(id="Text_submit_text13")
	private WebElement Text_submit_text13;
	
	public WebElement getTenTypes_Text_BigInteger() {
		return Text_submit_text13;
	}
	//BigDecimal
	@FindBy(id="Text_submit_text14")
	private WebElement Text_submit_text14;
	
	public WebElement getTenTypes_Text_BigDecimal() {
		return Text_submit_text14;
	}
	
	/*
	 * 10 data types
	 * End
	 */
	
	
}
