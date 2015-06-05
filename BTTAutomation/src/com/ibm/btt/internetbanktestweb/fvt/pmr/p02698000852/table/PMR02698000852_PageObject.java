package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852.table;

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
	
	@FindBy(id="VI_number_test_link02")
	private WebElement VI_number_table_link;
		
	public void VI_number_table_link(){
		VI_number_table_link.click();
	}
	
	/*
	 * Begin
	 */
	//Currency
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[2]/div")
	private WebElement table_multisubmit_1;

	public WebElement getTenTypes_multitable_1() {
		return table_multisubmit_1;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[5]/table/tbody/tr/td[3]/div")
	private WebElement table_multisubmit_2;

	public WebElement getTenTypes_multitable_2() {
		return table_multisubmit_2;
	}

	@FindBy(xpath=".//*[@id='dojox_grid__View_3']/div/div/div/div[4]/table/tbody/tr/td[2]/div")
	private WebElement table_singlesubmit;

	public WebElement getTenTypes_singletable() {
		return table_singlesubmit;
	}
	/*//Currency
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
	*/
	/*
	 * 10 data types
	 * End
	 */
	
	//SubmitButton
	@FindBy(id="table_submit_button01")
	private WebElement SubmitButton;
		
	public WebElement getSubmitButton() {
		return SubmitButton;
	}
	
/*	public Boolean submitButton(){
		return SubmitButton.isEnabled();
	}
	*/
	
//###############################Result Page##################################	
	
	//------------------------------Multi table Results Start---------------------------------
	//String-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement show_multisubmit_string1;

	public WebElement getTenTypes_Table_Result_String1() {
		return show_multisubmit_string1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement show_multisubmit_string2;

	public WebElement getTenTypes_Table_Result_String2() {
		return show_multisubmit_string2;
	}
	
	//Currency-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[2]/div/div[1]/span")
	private WebElement show_multisubmit_currency1;

	public WebElement getTenTypes_Table_Result_Currency1() {
		return show_multisubmit_currency1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[2]/div/div[2]/span")
	private WebElement show_multisubmit_currency2;

	public WebElement getTenTypes_Table_Result_Currency2() {
		return show_multisubmit_currency2;
	}
	
	//Number-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[3]/div/div[1]/span")
	private WebElement show_multisubmit_number1;

	public WebElement getTenTypes_Table_Result_Number1() {
		return show_multisubmit_number1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[3]/div/div[1]/span")
	private WebElement show_multisubmit_number2;

	public WebElement getTenTypes_Table_Result_Number2() {
		return show_multisubmit_number2;
	}
	
	//Short-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[4]/div/div[1]/span")
	private WebElement show_multisubmit_short1;

	public WebElement getTenTypes_Table_Result_Short1() {
		return show_multisubmit_short1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[4]/div/div[1]/span")
	private WebElement show_multisubmit_short2;

	public WebElement getTenTypes_Table_Result_Short2() {
		return show_multisubmit_short2;
	}
	
	//Integer-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[5]/div/div[1]/span")
	private WebElement show_multisubmit_integer1;

	public WebElement getTenTypes_Table_Result_Integer1() {
		return show_multisubmit_integer1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[5]/div/div[1]/span")
	private WebElement show_multisubmit_integer2;

	public WebElement getTenTypes_Table_Result_Integer2() {
		return show_multisubmit_integer2;
	}
	
	//Long-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[6]/div/div[1]/span")
	private WebElement show_multisubmit_long1;

	public WebElement getTenTypes_Table_Result_Long1() {
		return show_multisubmit_long1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[6]/div/div[1]/span")
	private WebElement show_multisubmit_long2;

	public WebElement getTenTypes_Table_Result_Long2() {
		return show_multisubmit_long2;
	}
	
	//Float-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[7]/div/div[1]/span")
	private WebElement show_multisubmit_float1;

	public WebElement getTenTypes_Table_Result_Float1() {
		return show_multisubmit_float1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[7]/div/div[1]/span")
	private WebElement show_multisubmit_float2;

	public WebElement getTenTypes_Table_Result_Float2() {
		return show_multisubmit_float2;
	}
	
	//Double-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[8]/div/div[1]/span")
	private WebElement show_multisubmit_double1;

	public WebElement getTenTypes_Table_Result_Double1() {
		return show_multisubmit_double1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[8]/div/div[2]/span")
	private WebElement show_multisubmit_double2;

	public WebElement getTenTypes_Table_Result_Double2() {
		return show_multisubmit_double2;
	}
	
	//BigInteger-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[9]/div/div[1]/span")
	private WebElement show_multisubmit_bigInteger1;

	public WebElement getTenTypes_Table_Result_BigInteger1() {
		return show_multisubmit_bigInteger1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[9]/div/div[1]/span")
	private WebElement show_multisubmit_bigInteger2;

	public WebElement getTenTypes_Table_Result_BigInteger2() {
		return show_multisubmit_bigInteger2;
	}
	
	//BigDecimal-multiTable
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[1]/table/tbody/tr/td[10]/div/div[1]/span")
	private WebElement show_multisubmit_bigDecimal1;

	public WebElement getTenTypes_Table_Result_BigDecimal1() {
		return show_multisubmit_bigDecimal1;
	}
	@FindBy(xpath=".//*[@id='dojox_grid__View_5']/div/div/div/div[2]/table/tbody/tr/td[10]/div/div[2]/span")
	private WebElement show_multisubmit_bigDecimal2;

	public WebElement getTenTypes_Table_Result_BigDecimal2() {
		return show_multisubmit_bigDecimal2;
	}
	//------------------------------Multi table Results End---------------------------------
	
	//------------------------------Single table Results Start---------------------------------
	//String-singleTable
	@FindBy(id="table_Result_submit_label02")
	private WebElement table_Result_submit_label02;
	
	public WebElement getTenTypes_Lable_Result_String() {
		return table_Result_submit_label02;
	}

	//Currency-singleTable
	@FindBy(id="table_Result_submit_label02_copy")
	private WebElement table_Result_submit_label02_copy;
	
	public WebElement getTenTypes_Lable_Result_Currency() {
		return table_Result_submit_label02_copy;
	}

	//Number-singleTable
	@FindBy(id="table_Result_submit_label02_copy01")
	private WebElement table_Result_submit_label02_copy01;
	
	public WebElement getTenTypes_Lable_Result_Number() {
		return table_Result_submit_label02_copy01;
	}
		
	//Short-singleTable
	@FindBy(id="table_Result_submit_label02_copy02")
	private WebElement table_Result_submit_label02_copy02;
	
	public WebElement getTenTypes_Lable_Result_Short() {
		return table_Result_submit_label02_copy02;
	}
	
	//Integer-singleTable
	@FindBy(id="table_Result_submit_label02_copy03")
	private WebElement table_Result_submit_label02_copy03;
	
	public WebElement getTenTypes_Lable_Result_Integer() {
		return table_Result_submit_label02_copy03;
	}	
	
	//Long-singleTable
	@FindBy(id="table_Result_submit_label02_copy04")
	private WebElement table_Result_submit_label02_copy04;
	
	public WebElement getTenTypes_Lable_Result_Long() {
		return table_Result_submit_label02_copy04;
	}
		
	//Float-singleTable
	@FindBy(id="table_Result_submit_label02_copy05")
	private WebElement table_Result_submit_label02_copy05;
	
	public WebElement getTenTypes_Lable_Result_Float() {
		return table_Result_submit_label02_copy05;
	}
	
	//Double-singleTable
	@FindBy(id="table_Result_submit_label02_copy06")
	private WebElement table_Result_submit_label02_copy06;
	
	public WebElement getTenTypes_Lable_Result_Double() {
		return table_Result_submit_label02_copy06;
	}

	//BigInteger-singleTable
	@FindBy(id="table_Result_submit_label02_copy07")
	private WebElement table_Result_submit_label02_copy07;
	
	public WebElement getTenTypes_Lable_Result_BigInteger() {
		return table_Result_submit_label02_copy07;
	}
			
	//BigDecimal-singleTable
	@FindBy(id="table_Result_submit_label02_copy08")
	private WebElement table_Result_submit_label02_copy08;
	
	public WebElement getTenTypes_Lable_Result_BigDecimal() {
		return table_Result_submit_label02_copy08;
	}
	//------------------------------Single table Results End---------------------------------
	
	//return
	@FindBy(id="table_Result_submit_link")
	private WebElement ReturnLink;
		
	public WebElement getReturnLink() {
		return ReturnLink;
	}
	
}
