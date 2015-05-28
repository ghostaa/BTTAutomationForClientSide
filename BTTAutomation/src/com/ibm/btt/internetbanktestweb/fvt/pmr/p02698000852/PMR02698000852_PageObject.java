package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PMR02698000852_PageObject {
	
//###############################Data selection page ##################################
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
	
	@FindBy(id="index_link55")
	private WebElement PMR_link;
		
	public void PMR_link(){
		PMR_link.click();
	}
	
	@FindBy(id="VI_number_test_link")
	private WebElement VI_number_test_link;
		
	public void VI_number_test_link(){
		VI_number_test_link.click();
	}

	//fill  101.8
	@FindBy(id="Text_submit_button01_label")
	private WebElement AutoFill_button_101;

	public WebElement getAutoFill_button_101() {
		return AutoFill_button_101;
	}

	//fill 112.0
	@FindBy(id="Text_submit_button04_label")
	private WebElement AutoFill_button_112;

	public WebElement getAutoFill_button_112() {
		return AutoFill_button_112;
	}
	
	//fill 1208.32
	@FindBy(id="Text_submit_button03_copy_label")
	private WebElement AutoFill_button_1208;

	public WebElement getAutoFill_button_1208() {
		return AutoFill_button_1208;
	}
	
	//fill 1234.00
	@FindBy(id="Text_submit_button03_copy_copy_label")
	private WebElement AutoFill_button_1234;

	public WebElement getAutoFill_button_1234() {
		return AutoFill_button_1234;
	}
	
	//fill 123456789.00
	@FindBy(id="Text_submit_button03_label")
	private WebElement AutoFill_button_123456789;

	public WebElement getAutoFill_button_123456789() {
		return AutoFill_button_123456789;
	}
	
	//fill 123456789.123
	@FindBy(id="Text_submit_button02_label")
	private WebElement AutoFill_button_1_9;

	public WebElement getAutoFill_button_1_9() {
		return AutoFill_button_1_9;
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
	
	//SubmitButton
	@FindBy(id="Text_submit_button_label")
	private WebElement SubmitButton;
		
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	
	
	
//###############################Result Page##################################	
	//String-text
	@FindBy(id="Text_submit_Result_text")
	private WebElement Text_submit_Result_text;

	public WebElement getTenTypes_Text_Result_String() {
		return Text_submit_Result_text;
	}
	//String-label
	@FindBy(id="Text_submit_Result_label07")
	private WebElement Text_submit_Result_label07;
	
	public WebElement getTenTypes_Lable_Result_String() {
		return Text_submit_Result_label07;
	}

	
	//Currency-text
	@FindBy(id="Text_submit_Result_text02")
	private WebElement Text_submit_Result_text02;

	public WebElement getTenTypes_Text_Result_Currency() {
		return Text_submit_Result_text02;
	}
	//Currency-label
	@FindBy(id="Text_submit_Result_label10_copy")
	private WebElement Text_submit_Result_label10_copy;
	
	public WebElement getTenTypes_Lable_Result_Currency() {
		return Text_submit_Result_label10_copy;
	}

	
	//Number-text
	@FindBy(id="Text_submit_Result_text03")
	private WebElement Text_submit_Result_text03;
	
	public WebElement getTenTypes_Text_Result_Number() {
		return Text_submit_Result_text03;
	}
	//Number-label
	@FindBy(id="Text_submit_Result_label10_copy01")
	private WebElement Text_submit_Result_label10_copy01;
	
	public WebElement getTenTypes_Lable_Result_Number() {
		return Text_submit_Result_label10_copy01;
	}
	
	
	//Short-text
	@FindBy(id="Text_submit_Result_text08")
	private WebElement Text_submit_Result_text08;
	
	public WebElement getTenTypes_Text_Result_Short() {
		return Text_submit_Result_text08;
	}
	//Short-label
	@FindBy(id="Text_submit_Result_label10_copy06")
	private WebElement Text_submit_Result_label10_copy06;
	
	public WebElement getTenTypes_Lable_Result_Short() {
		return Text_submit_Result_label10_copy06;
	}
	
	
	//Integer-text
	@FindBy(id="Text_submit_Result_text09")
	private WebElement Text_submit_Result_text09;
	
	public WebElement getTenTypes_Text_Result_Integer() {
		return Text_submit_Result_text09;
	}
	//Integer-label
	@FindBy(id="Text_submit_Result_label10_copy07")
	private WebElement Text_submit_Result_label10_copy07;
	
	public WebElement getTenTypes_Lable_Result_Integer() {
		return Text_submit_Result_label10_copy07;
	}
	
	
	//Long-text
	@FindBy(id="Text_submit_Result_text10")
	private WebElement Text_submit_Result_text10;
	
	public WebElement getTenTypes_Text_Result_Long() {
		return Text_submit_Result_text10;
	}
	//Long-label
	@FindBy(id="Text_submit_Result_label10_copy08")
	private WebElement Text_submit_Result_label10_copy08;
	
	public WebElement getTenTypes_Lable_Result_Long() {
		return Text_submit_Result_label10_copy08;
	}
	
	
	//Float-text
	@FindBy(id="Text_submit_Result_text11")
	private WebElement Text_submit_Result_text11;
	
	public WebElement getTenTypes_Text_Result_Float() {
		return Text_submit_Result_text11;
	}
	//Float-label
	@FindBy(id="Text_submit_Result_label10_copy09")
	private WebElement Text_submit_Result_label10_copy09;
	
	public WebElement getTenTypes_Lable_Result_Float() {
		return Text_submit_Result_label10_copy09;
	}
	
	
	//Double-text
	@FindBy(id="Text_submit_Result_text12")
	private WebElement Text_submit_Result_text12;
	
	public WebElement getTenTypes_Text_Result_Double() {
		return Text_submit_Result_text12;
	}
	//Double-label
	@FindBy(id="Text_submit_Result_label10_copy10")
	private WebElement Text_submit_Result_label10_copy10;
	
	public WebElement getTenTypes_Lable_Result_Double() {
		return Text_submit_Result_label10_copy10;
	}
	
	
	//BigInteger-text
	@FindBy(id="Text_submit_Result_text13")
	private WebElement Text_submit_Result_text13;
	
	public WebElement getTenTypes_Text_Result_BigInteger() {
		return Text_submit_Result_text13;
	}
	//BigInteger-label
	@FindBy(id="Text_submit_Result_label10_copy11")
	private WebElement Text_submit_Result_label10_copy11;
	
	public WebElement getTenTypes_Lable_Result_BigInteger() {
		return Text_submit_Result_label10_copy11;
	}
		
	
	//BigDecimal-text
	@FindBy(id="Text_submit_Result_text14")
	private WebElement Text_submit_Result_text14;
	
	public WebElement getTenTypes_Text_Result_BigDecimal() {
		return Text_submit_Result_text14;
	}
	//BigDecimal-label
	@FindBy(id="Text_submit_Result_label10_copy12")
	private WebElement Text_submit_Result_label10_copy12;
	
	public WebElement getTenTypes_Lable_Result_BigDecimal() {
		return Text_submit_Result_label10_copy12;
	}

	
	
	//return
	@FindBy(id="Text_submit_Result_link")
	private WebElement ReturnLink;
		
	public WebElement getReturnLink() {
		return ReturnLink;
	}	
	
	
	
}
