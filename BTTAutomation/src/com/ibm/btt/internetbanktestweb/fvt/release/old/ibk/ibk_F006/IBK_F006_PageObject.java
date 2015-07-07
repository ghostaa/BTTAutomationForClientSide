package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F006;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.GetCurrentDate;

public class IBK_F006_PageObject extends Index_Page {

	
	@FindBy(id="DatePicker_calendar")
	private WebElement SelectDay;	
	
	public String selectDate(){
		SelectDay.sendKeys(GetCurrentDate.currentDate());
		
		return null;
		}
	@FindBy(id="DatePicker_form")
	private WebElement clickform;
	public void clickForm(){
		clickform.click();
		}
	
	@FindBy(id="DatePicker_combo_year")
	private WebElement yearInput;
	public String yearInput(){
//		System.out.println(yearInput.getAttribute("value"));
		return yearInput.getAttribute("value");
		}
	@FindBy(id="DatePicker_combo_month")
	private WebElement monthInput;
	public String monthInput(){
//		System.out.println(monthInput.getAttribute("value"));
		return monthInput.getAttribute("value");
		}
	@FindBy(id="DatePicker_combo_day")
	private WebElement dayInput;
	public String dayInput(){
//		System.out.println(dayInput.getAttribute("value"));
		return dayInput.getAttribute("value");
		}	
	
	@FindBy(id="DatePicker_button")
	private WebElement clickButton;
	public void clickButton(){
		clickButton.click();
		}		
	@FindBy(id="finalPage_label01")
	private WebElement testResult;
	public String testResult() {
		return testResult.getText();
	}
	


}
