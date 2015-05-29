package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852.combolist;

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
	
	@FindBy(id="VI_number_test_link01")
	private WebElement VI_number_combo_link;
		
	public void VI_number_combo_link(){
		VI_number_combo_link.click();
	}

	//fill  101.8
	@FindBy(id="combo_submit_button02")
	private WebElement AutoFill_button_101;

	public WebElement getAutoFill_button_101() {
		return AutoFill_button_101;
	}

	//fill 112.0
	@FindBy(id="combo_submit_button01")
	private WebElement AutoFill_button_112;

	public WebElement getAutoFill_button_112() {
		return AutoFill_button_112;
	}
	
	//fill 1208.32
	@FindBy(id="combo_submit_button03_copy")
	private WebElement AutoFill_button_1208;

	public WebElement getAutoFill_button_1208() {
		return AutoFill_button_1208;
	}
	
	//fill 1234.00
	@FindBy(id="combo_submit_button03_copy02")
	private WebElement AutoFill_button_1234;

	public WebElement getAutoFill_button_1234() {
		return AutoFill_button_1234;
	}
	
	//fill 123456789.00
	@FindBy(id="combo_submit_button03")
	private WebElement AutoFill_button_123456789;

	public WebElement getAutoFill_button_123456789() {
		return AutoFill_button_123456789;
	}
	
	//fill 123456789.123
	@FindBy(id="combo_submit_button03_copy01")
	private WebElement AutoFill_button_1_9;

	public WebElement getAutoFill_button_1_9() {
		return AutoFill_button_1_9;
	}
	
	/*
	 * 10 data types
	 * Begin
	 */
	//String
	@FindBy(id="combo_submit_combo")
	private WebElement combo_submit_combo;

	public WebElement getTenTypes_Combo_String() {
		return combo_submit_combo;
	}

	//Currency
	@FindBy(id="combo_submit_combo02")
	private WebElement combo_submit_combo02;

	public WebElement getTenTypes_Combo_Currency() {
		return combo_submit_combo02;
	}
	
	//Number
	@FindBy(id="combo_submit_combo03")
	private WebElement combo_submit_combo03;
	
	public WebElement getTenTypes_Combo_Number() {
		return combo_submit_combo03;
	}
	
	//Short
	@FindBy(id="combo_submit_combo08")
	private WebElement combo_submit_combo08;
	
	public WebElement getTenTypes_Combo_Short() {
		return combo_submit_combo08;
	}
	
	//Integer
	@FindBy(id="combo_submit_combo09")
	private WebElement combo_submit_combo09;
	
	public WebElement getTenTypes_Combo_Integer() {
		return combo_submit_combo09;
	}
		
	//Long
	@FindBy(id="combo_submit_combo10")
	private WebElement combo_submit_combo10;
	
	public WebElement getTenTypes_Combo_Long() {
		return combo_submit_combo10;
	}
	
	//Float
	@FindBy(id="combo_submit_combo11")
	private WebElement combo_submit_combo11;
	
	public WebElement getTenTypes_Combo_Float() {
		return combo_submit_combo11;
	}
	
	//Double
	@FindBy(id="combo_submit_combo12")
	private WebElement combo_submit_combo12;
	
	public WebElement getTenTypes_Combo_Double() {
		return combo_submit_combo12;
	}
	
	
	//BigInteger
	@FindBy(id="combo_submit_combo13")
	private WebElement combo_submit_combo13;
	
	public WebElement getTenTypes_Combo_BigInteger() {
		return combo_submit_combo13;
	}
	//BigDecimal
	@FindBy(id="combo_submit_combo14")
	private WebElement combo_submit_combo14;
	
	public WebElement getTenTypes_Combo_BigDecimal() {
		return combo_submit_combo14;
	}
	
	/*
	 * 10 data types
	 * End
	 */
	
	//SubmitButton
	@FindBy(id="combo_submit_button")
	private WebElement SubmitButton;
		
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
	
	
	
//###############################Result Page##################################	
	//String-combo
	@FindBy(id="showcombo_submit_combo")
	private WebElement showcombo_submit_combo;

	public WebElement getTenTypes_Combo_Result_String() {
		return showcombo_submit_combo;
	}
	//String-label
	@FindBy(id="showcombo_submit_label")
	private WebElement showcombo_submit_label;
	
	public WebElement getTenTypes_Lable_Result_String() {
		return showcombo_submit_label;
	}

	
	//Currency-combo
	@FindBy(id="showcombo_submit_combo_copy")
	private WebElement showcombo_submit_combo_copy;

	public WebElement getTenTypes_Combo_Result_Currency() {
		return showcombo_submit_combo_copy;
	}
	//Currency-label
	@FindBy(id="showcombo_submit_label02")
	private WebElement showcombo_submit_label02;
	
	public WebElement getTenTypes_Lable_Result_Currency() {
		return showcombo_submit_label02;
	}

	
	//Number-combo
	@FindBy(id="showcombo_submit_combo_copy_copy")
	private WebElement showcombo_submit_combo_copy_copy;
	
	public WebElement getTenTypes_Combo_Result_Number() {
		return showcombo_submit_combo_copy_copy;
	}
	//Number-label
	@FindBy(id="showcombo_submit_label03")
	private WebElement showcombo_submit_label03;
	
	public WebElement getTenTypes_Lable_Result_Number() {
		return showcombo_submit_label03;
	}
	
	
	//Short-combo
	@FindBy(id="showcombo_submit_combo_copy_copy01")
	private WebElement showcombo_submit_combo_copy_copy01;
	
	public WebElement getTenTypes_Combo_Result_Short() {
		return showcombo_submit_combo_copy_copy01;
	}
	//Short-label
	@FindBy(id="showcombo_submit_label08")
	private WebElement showcombo_submit_label08;
	
	public WebElement getTenTypes_Lable_Result_Short() {
		return showcombo_submit_label08;
	}
	
	
	//Integer-combo
	@FindBy(id="showcombo_submit_combo_copy_copy02")
	private WebElement showcombo_submit_combo_copy_copy02;
	
	public WebElement getTenTypes_Combo_Result_Integer() {
		return showcombo_submit_combo_copy_copy02;
	}
	//Integer-label
	@FindBy(id="showcombo_submit_label09")
	private WebElement showcombo_submit_label09;
	
	public WebElement getTenTypes_Lable_Result_Integer() {
		return showcombo_submit_label09;
	}
	
	
	//Long-combo
	@FindBy(id="showcombo_submit_combo_copy_copy03")
	private WebElement showcombo_submit_combo_copy_copy03;
	
	public WebElement getTenTypes_Combo_Result_Long() {
		return showcombo_submit_combo_copy_copy03;
	}
	//Long-label
	@FindBy(id="showcombo_submit_label10")
	private WebElement showcombo_submit_label10;
	
	public WebElement getTenTypes_Lable_Result_Long() {
		return showcombo_submit_label10;
	}
	
	
	//Float-combo
	@FindBy(id="showcombo_submit_combo_copy_copy04")
	private WebElement showcombo_submit_combo_copy_copy04;
	
	public WebElement getTenTypes_Combo_Result_Float() {
		return showcombo_submit_combo_copy_copy04;
	}
	//Float-label
	@FindBy(id="showcombo_submit_label13")
	private WebElement showcombo_submit_label13;
	
	public WebElement getTenTypes_Lable_Result_Float() {
		return showcombo_submit_label13;
	}
	
	
	//Double-combo
	@FindBy(id="showcombo_submit_combo_copy_copy05")
	private WebElement showcombo_submit_combo_copy_copy05;
	
	public WebElement getTenTypes_Combo_Result_Double() {
		return showcombo_submit_combo_copy_copy05;
	}
	//Double-label
	@FindBy(id="showcombo_submit_label15")
	private WebElement showcombo_submit_label15;
	
	public WebElement getTenTypes_Lable_Result_Double() {
		return showcombo_submit_label15;
	}
	
	
	//BigInteger-combo
	@FindBy(id="showcombo_submit_combo_copy_copy06")
	private WebElement showcombo_submit_combo_copy_copy06;
	
	public WebElement getTenTypes_Combo_Result_BigInteger() {
		return showcombo_submit_combo_copy_copy06;
	}
	//BigInteger-label
	@FindBy(id="showcombo_submit_label16")
	private WebElement showcombo_submit_label16;
	
	public WebElement getTenTypes_Lable_Result_BigInteger() {
		return showcombo_submit_label16;
	}
		
	
	//BigDecimal-combo
	@FindBy(id="showcombo_submit_combo_copy_copy07")
	private WebElement showcombo_submit_combo_copy_copy07;
	
	public WebElement getTenTypes_Combo_Result_BigDecimal() {
		return showcombo_submit_combo_copy_copy07;
	}
	//BigDecimal-label
	@FindBy(id="showcombo_submit_label17")
	private WebElement showcombo_submit_label17;
	
	public WebElement getTenTypes_Lable_Result_BigDecimal() {
		return showcombo_submit_label17;
	}

	
	//return
	@FindBy(id="showcombo_submit_link")
	private WebElement ReturnLink;
		
	public WebElement getReturnLink() {
		return ReturnLink;
	}	
}
