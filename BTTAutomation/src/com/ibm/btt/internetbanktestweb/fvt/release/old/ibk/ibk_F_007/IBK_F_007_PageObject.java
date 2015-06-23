package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F_007;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.InternetBankTestWebMain_Class;

public class IBK_F_007_PageObject extends Index_Page {
	
//###############################multilanguage switch##################################
	@FindBy(id="IBK_F_007_index_label")
	private WebElement NLSLable;
	
	@FindBy(id="IBK_F_007_index_link13")
	private WebElement LinkChinese;
		
	public String LinkChinese(){
		LinkChinese.click();
		return NLSLable.getText();
	}
	
	public String LinkChineseTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}

	@FindBy(id="IBK_F_007_index_link14")
	private WebElement LinkEnglish;

	public String LinkEnglish() {
		LinkEnglish.click();
		return NLSLable.getText();
	}
	
	public String LinkEnglishTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}

	@FindBy(id="IBK_F_007_index_link15")
	private WebElement LinkKorean;

	public String LinkKorean() {
		LinkKorean.click();
		return NLSLable.getText();
	}
	
	public String LinkKoreanTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}
	
	@FindBy(id="IBK_F_007_index_link16")
	private WebElement LinkSpanish;

	public String LinkSpanish() {
		LinkSpanish.click();
		return NLSLable.getText();
	}
	
	public String LinkSpanishTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}
	
	@FindBy(id="IBK_F_007_index_button02")
	private WebElement ButtonChinese;
		
	public String ButtonChinese(){
		ButtonChinese.click();
		return NLSLable.getText();
	}
	
	public String ButtonChineseTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}

	@FindBy(id="IBK_F_007_index_button03")
	private WebElement ButtonEnglish;

	public String ButtonEnglish() {
		ButtonEnglish.click();
		return NLSLable.getText();
	}
	
	public String ButtonEnglishTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}

	@FindBy(id="IBK_F_007_index_button04")
	private WebElement ButtonKorean;

	public String ButtonKorean() {
		ButtonKorean.click();
		return NLSLable.getText();
	}
	
	public String ButtonKoreanTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}
	
	@FindBy(id="IBK_F_007_index_button05")
	private WebElement ButtonSpanish;

	public String ButtonSpanish() {
		ButtonSpanish.click();
		return NLSLable.getText();
	}
	
	public String ButtonSpanishTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}
	
	@FindBy(id="IBK_F_007_index_image")
	private WebElement ImageChinese;
		
	public String ImageChinese(){
		ImageChinese.click();
		return NLSLable.getText();
	}
	
	public Boolean ImageChineseURL(){
		String ch = "dse_nextEventName=ch";
		System.out.println(InternetBankTestWebMain_Class.getCurrentURL());
		return InternetBankTestWebMain_Class.getCurrentURL().indexOf(ch)> -1;
	}
	
	public String ImageChineseTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}

	@FindBy(id="IBK_F_007_index_image01")
	private WebElement ImageEnglish;

	public String ImageEnglish() {
		ImageEnglish.click();
		return NLSLable.getText();
	}
	
	public Boolean ImageEnglishURL(){
		String ch = "dse_nextEventName=en";
		return InternetBankTestWebMain_Class.getCurrentURL().indexOf(ch)> -1;
	}
	
	public String ImageEnglishTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}

	@FindBy(id="IBK_F_007_index_image02")
	private WebElement ImageKorean;

	public String ImageKorean() {
		ImageKorean.click();
		return NLSLable.getText();
	}
	
	public Boolean ImageKoreanURL(){
		String ch = "dse_nextEventName=ko";
		return InternetBankTestWebMain_Class.getCurrentURL().indexOf(ch)> -1;
	}
	
	public String ImageKoreanTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}
	
	@FindBy(id="IBK_F_007_index_image03")
	private WebElement ImageSpanish;

	public String ImageSpanish() {
		ImageSpanish.click();
		return NLSLable.getText();
	}
	
	public Boolean ImageSpanishURL(){
		String ch = "dse_nextEventName=sp";
		return InternetBankTestWebMain_Class.getCurrentURL().indexOf(ch)> -1;
	}
	
	public String ImageSpanishTitle(){
		return InternetBankTestWebMain_Class.getTitle();
	}
	
	@FindBy(id="IBK_F_007_index_button01")
	private WebElement ButtonFinal;
	
	@FindBy(id="index_label")
	private WebElement IndexWebPage;
	
	public String ButtonFinal(){
		ButtonFinal.click();
		return IndexWebPage.getText();
	}
	
}
