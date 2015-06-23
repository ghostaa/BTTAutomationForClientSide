package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_20andibk_6;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.InternetBankTestWebMain_Class;

public class IBK_20andIBK_6_PageObject extends Index_Page {
	
//###############################IBK_20##################################
//IBK Requirement 20 (new line character(line separator) in table widget)
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[3]/span")
	private WebElement IBK20_Text1;
	
	public String[] IBK20_Text1(){
		String[] strings = IBK20_Text1.getText().split("\n");
		return strings;
	}

	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[3]/span")
	private WebElement IBK20_Text2;

	public String IBK20_Text2() {
		return IBK20_Text2.getText();
	}

	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[3]/span")
	private WebElement IBK20_Text3;

	public String IBK20_Text3() {
		return IBK20_Text3.getText();
	}

//IBK Requirement 6 (Enable/Disable Combo Widget editing functions and support Label/Value fields)	

	@FindBy(id="IBK_testpage1_combo")
	private WebElement Combo_dataNameForList;

	public String Combo_dataNameForList() {
		return Combo_dataNameForList.getAttribute("name");
	}

	@FindBy(id="IBK_testpage1_button")
	private WebElement SubmitButton;

	public String SubmitButtonF() {
		return SubmitButton.getAttribute("aria-disabled");
	}
	
	@FindBy(id="IBK_testpage1_label02")
	private WebElement Combo_Lable;
	
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement Combo_dataNameForListTooltip;
	
	public String Combo_isMandatory(){
		Combo_dataNameForList.click();
		Combo_Lable.click();
		Combo_dataNameForList.click();
		return Combo_dataNameForListTooltip.getText();
	}
	
	@FindBy(xpath=".//*[@id='widget_IBK_testpage1_combo']/div[1]/input")
	private WebElement Combo_dataNameForListClickArrow;
	
	@FindBy(xpath=".//*[@id='IBK_testpage1_combo_popup1']")
	private WebElement Combo_dataNameForListValue;
	
	public String SubmitButtonT(){
		Combo_dataNameForListClickArrow.click();
		Combo_dataNameForListValue.click();
		return SubmitButton.getAttribute("aria-disabled");
	}
	
	@FindBy(id="IBK_testpage1_combo01")
	private WebElement Combo_urlForList;

	public String Combo_urlForList() {
		return Combo_urlForList.getAttribute("name");
	}
	
	@FindBy(id="IBK_testpage1_combo02")
	private WebElement Combo_LableDataNameForList;

	public String Combo_LableDataNameForList() {
		return Combo_LableDataNameForList.getAttribute("name");
	}
	
	@FindBy(id="IBK_testpage1_combo03")
	private WebElement Combo_LableurlForList;

	public String Combo_LableurlForList() {
		return Combo_LableurlForList.getAttribute("name");
	}
	
	public void ComboSubmit(){
		SubmitButton.click();
	}
	
	@FindBy(id="finalPage_label")
	private WebElement FinalPage;
	
	public String FinalPage(){
		return FinalPage.getText();
	}
}
