package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F001;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Main_Class;

public class IBK_F001_PageObject extends Index_Page{
	public String getNormalPageTitle() {
	//	System.out.println(Main_Class.getTitle());
		return Main_Class.getTitle();
	
	}
	@FindBy(id="NormalPageTitle_link")
	private WebElement clickToNext1;
	
//	public void nextPage1() {
//		clickToNext1.click();
//	}

	public String getPageTitle() {
		clickToNext1.click();
		return Main_Class.getTitle();
	}
		
	@FindBy(id="TheNLSNorNormalPage_link")
	private WebElement clickToNext2;
		
	public void nextPage2() {
		clickToNext2.click();
	}
	
	@FindBy(xpath=".//*[@id='com_ibm_btt_dijit_Dialog_0_title']")
	private WebElement popupPageTitle1;
	
	public String popupTitle1() {
		return popupPageTitle1.getText();
	}
	
	@FindBy(id="NormalPopupPageTitle_link")
	private WebElement clickToNext3;
		
	public void nextPage3() {
		clickToNext3.click();
	}
	
	@FindBy(xpath=".//*[@id='com_ibm_btt_dijit_Dialog_1_title']")
	private WebElement popupPageTitle2;
	
	public String popupTitle2() {
		return popupPageTitle2.getText();
	}
	@FindBy(id="TheNLSPopupPageTitle_link")
	private WebElement clickToNext4;
		
	public void nextPage4() {
		clickToNext4.click();
	}
	@FindBy(id="finalPage_label")
	private WebElement finalPage;
	public String finalPage() {
		return finalPage.getText();
	}
}
