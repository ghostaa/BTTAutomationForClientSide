package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_30XHTML;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Main_Class;

public class IBK_30XHTML_PageObject extends Index_Page {
	
//###############################All Widgets##################################
	@FindBy(id="IBK_Test_XHTML_index_link")
	private WebElement AllWidgets;
	
	public void AllWidgets(){
		AllWidgets.click();
	}

	@FindBy(id="ShowAllWidght_label_copy")
	private WebElement NLSLable;
	
	@FindBy(id="ShowAllWidght_link13")
	private WebElement LinkChinese;
		
	public String LinkChinese(){
		LinkChinese.click();
		return NLSLable.getText();
	}

	@FindBy(id="ShowAllWidght_link14")
	private WebElement LinkEnglish;

	public String LinkEnglish() {
		LinkEnglish.click();
		return NLSLable.getText();
	}

	@FindBy(id="ShowAllWidght_link15")
	private WebElement LinkKorean;

	public String LinkKorean() {
		LinkKorean.click();
		return NLSLable.getText();
	}
	
	@FindBy(id="ShowAllWidght_link16")
	private WebElement LinkSpanish;

	public String LinkSpanish() {
		LinkSpanish.click();
		return NLSLable.getText();
	}
	
	@FindBy(id="ShowAllWidght_button02_copy")
	private WebElement ButtonChinese;
		
	public String ButtonChinese(){
		return ButtonChinese.getAttribute("aria-disabled");
	}
	
	@FindBy(id="ShowAllWidght_button03_copy")
	private WebElement ButtonEnglish;

	public String ButtonEnglish() {
		return ButtonEnglish.getAttribute("aria-disabled");
	}

	@FindBy(id="ShowAllWidght_button04_copy")
	private WebElement ButtonKorean;

	public String ButtonKorean() {
		return ButtonKorean.getAttribute("aria-disabled");
	}
	
	@FindBy(id="ShowAllWidght_button05_copy")
	private WebElement ButtonSpanish;

	public String ButtonSpanish() {
		return ButtonSpanish.getAttribute("aria-disabled");
	}
	
	@FindBy(id="ShowAllWidght_image_copy")
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

	@FindBy(id="ShowAllWidght_image01_copy")
	private WebElement ImageEnglish;

	public String ImageEnglish() {
		ImageEnglish.click();
		return NLSLable.getText();
	}
	
	public Boolean ImageEnglishURL(){
		String ch = "dse_nextEventName=en";
		return InternetBankTestWebMain_Class.getCurrentURL().indexOf(ch)> -1;
	}

	@FindBy(id="ShowAllWidght_image02_copy")
	private WebElement ImageKorean;

	public String ImageKorean() {
		ImageKorean.click();
		return NLSLable.getText();
	}
	
	public Boolean ImageKoreanURL(){
		String ch = "dse_nextEventName=ko";
		return InternetBankTestWebMain_Class.getCurrentURL().indexOf(ch)> -1;
	}
	
	@FindBy(id="ShowAllWidght_image03_copy")
	private WebElement ImageSpanish;

	public String ImageSpanish() {
		ImageSpanish.click();
		return NLSLable.getText();
	}
	
	public Boolean ImageSpanishURL(){
		String ch = "dse_nextEventName=sp";
		return InternetBankTestWebMain_Class.getCurrentURL().indexOf(ch)> -1;
	}
//Label group--Layout is div	
	@FindBy(id="ShowAllWidght_label")
	private WebElement visiableLable;
	
	public Boolean visiableLable(){
		return visiableLable.isDisplayed();
	}
	
	@FindBy(id="ShowAllWidght_label11")
	private WebElement hiddenLable;
	
	public int hiddenLable(){
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(hiddenLable.getAttribute("style"), temp);
	}
	
	@FindBy(id="ShowAllWidght_label12")
	private WebElement goneLable;
	
	public int goneLable(){
		String[] temp={"display: none"};
		return Appearance.appearance_query(goneLable.getAttribute("style"), temp);
	}
//Radio group--Layout is table
	@FindBy(id="ShowAllWidght_radio01")
	private WebElement maleRadio;
	
	public String maleRadio(){
		return maleRadio.getAttribute("aria-checked");
	}
	
	@FindBy(id="ShowAllWidght_radio")
	private WebElement femaleRadio;
	
	public String femaleRadio(){
		return femaleRadio.getAttribute("aria-checked");
	}
	
	@FindBy(xpath=".//*[@id='ShowAllWidght_group01']/div/div/div[2]/div[2]/div")
	private WebElement hiddenRadio;
	
	public int hiddenRadio(){
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(hiddenRadio.getAttribute("style"), temp);
	}
	
	@FindBy(xpath=".//*[@id='ShowAllWidght_group01']/div/div/div[3]/div[2]/div")
	private WebElement goneRadio;
	
	public int goneRadio(){
		String[] temp={"display: none"};
		return Appearance.appearance_query(goneRadio.getAttribute("style"), temp);
	}
	
	@FindBy(id="ShowAllWidght_radio04")
	private WebElement radioDisableT;
	
	public String radioDisableT(){
		return radioDisableT.getAttribute("aria-disabled");
	}
	
	@FindBy(id="ShowAllWidght_radio05")
	private WebElement radioReadonlyT;
	
	public String radioReadonlyT(){
		return radioReadonlyT.getAttribute("readonly");
	}
//checkbox
	@FindBy(id="ShowAllWidght_checkBox")
	private WebElement visibleCheckbox;
	
	public Boolean visibleCheckbox(){
		return visibleCheckbox.isDisplayed();
	}
	
	public String checkboxChecked(){
		return visibleCheckbox.getAttribute("aria-checked");
	}
	
	@FindBy(id="ShowAllWidght_checkBox03")
	private WebElement CheckboxDisableT;
	
	public String CheckboxDisableT(){
		return CheckboxDisableT.getAttribute("aria-disabled");
	}
	
	@FindBy(id="ShowAllWidght_checkBox05")
	private WebElement CheckboxReadonlyT;
	
	public String CheckboxReadonlyT(){
		return CheckboxReadonlyT.getAttribute("readonly");
	}
//Text
	@FindBy(id="ShowAllWidght_text")
	private WebElement Text;
	
	public String Text(){
		return Text.getAttribute("value");
	}
	
	@FindBy(id="ShowAllWidght_text01")
	private WebElement TextIsMandatoryT;
	
	public String TextIsMandatoryT(){
		return TextIsMandatoryT.getAttribute("aria-required");
	}
	
	@FindBy(id="widget_ShowAllWidght_text03")
	private WebElement hiddenText;
	
	public int hiddenText(){
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(hiddenText.getAttribute("style"), temp);
	}
	
	@FindBy(id="widget_ShowAllWidght_text02")
	private WebElement goneText;
	
	public int goneText(){
		String[] temp={"display: none"};
		return Appearance.appearance_query(goneText.getAttribute("style"), temp);
	}
	
	@FindBy(id="ShowAllWidght_text04")
	private WebElement TextDisableT;
	
	public String TextDisableT(){
		return TextDisableT.getAttribute("aria-disabled");
	}
	
	@FindBy(id="ShowAllWidght_text05")
	private WebElement TextReadonlyT;
	
	public String TextReadonlyT(){
		return TextReadonlyT.getAttribute("readonly");
	}
	
	@FindBy(id="ShowAllWidght_text06")
	private WebElement TextPasswordT;
	
	public String TextPasswordT(){
		return TextPasswordT.getAttribute("type");
	}
//Select List
	@FindBy(xpath=".//*[@id='dijit__MasterTooltip_0']/div[2]")
	private WebElement xValidationTooltip;
	
	@FindBy(xpath=".//*[@id='widget_ShowAllWidght_selectList']/div[1]/input")
	private WebElement selectListClick;
	
	@FindBy(xpath=".//*[@id='ShowAllWidght_selectList_popup1']")
	private WebElement selectListCity1;
	
	public String xValidationTooltip(){//The selection must be selected 'City1' ,this test case is used for xValidations of 'form' widget
		return xValidationTooltip.getText();
	}
	
	@FindBy(id="ShowAllWidght_selectList")
	private WebElement selectListDataNameForList;
	
	public String selectListDataNameForList(){
		return selectListDataNameForList.getAttribute("value");
	}
	
	public String selectListDataNameForListName(){
		return selectListDataNameForList.getAttribute("name");
	}
	
	public String selectListCity1(){
		selectListClick.click();
		selectListCity1.click();
		return selectListDataNameForList.getAttribute("value");
	}
	
	@FindBy(id="ShowAllWidght_selectList")
	private WebElement selectListURLForList;
	
	public String selectListURLForList(){
		return selectListURLForList.getAttribute("value");
	}
	
	public String selectListURLForListName(){
		return selectListURLForList.getAttribute("name");
	}
//ComboList
	@FindBy(id="ShowAllWidght_combo")
	private WebElement comboDataNameForList;
	
	public String comboDataNameForList(){
		return comboDataNameForList.getAttribute("name");
	}
	
	@FindBy(id="ShowAllWidght_combo01")
	private WebElement comboURLForList;
	
	public String comboURLForList(){
		return comboURLForList.getAttribute("name");
	}
//Link
	@FindBy(id="ShowAllWidght_link")
	private WebElement linkFinalPage;
	
	@FindBy(id="finalPage_label")
	private WebElement finalPage;
	
	public String linkFinalPage(){//Change flow event to final page
		linkFinalPage.click();
		return finalPage.getText();
	}
	
	@FindBy(id="ShowAllWidght_link")
	private WebElement linkLanchNewFlow;
	
	@FindBy(id="ShowLaunchFlow_label")
	private WebElement launchFlowLable;
	
	public String linkLanchNewFlow(){//launch new flow --IBK_30_Test_XHTML_Other_Flow
		linkLanchNewFlow.click();
		return launchFlowLable.getText();
	} 
	
	@FindBy(id="ShowAllWidght_link02")
	private WebElement linkLaunchOperation;
	
	public String linkLaunchOperation(){//Launch Hello World Operation
		linkLaunchOperation.click();
		return finalPage.getText();
	} 
	
	@FindBy(id="ShowAllWidght_link03")
	private WebElement linkLaunchURL;
	
	public String linkLaunchURL(){//Launch Hello World Operation
		linkLaunchURL.click();
		return Main_Class.switchWindow();
	} 
//Image
	@FindBy(id="ShowAllWidght_image")
	private WebElement ImageLocation;
	
	public String ImageLocation(){//ImageLocation
		return ImageLocation.getAttribute("src");
	} 
	
	@FindBy(id="ShowAllWidght_image01")
	private WebElement ImageDataName;
	
	public String ImageDataName(){//Image dataname
		return ImageDataName.getAttribute("name");
	} 
	
	@FindBy(id="ShowAllWidght_image04")
	private WebElement ImageLaunchOP;
	
	public Boolean ImageLaunchOP(){//Image launchOP
		ImageLaunchOP.click();
		return Main_Class.getCurrentURL().indexOf("dse_operationName=LaunchOp") > -1;
	} 
	
	@FindBy(id="ShowAllWidght_image03")
	private WebElement ImageLaunchNewFlow;
	
	public String ImageLaunchNewFlow(){//launch new flow --IBK_30_Test_XHTML_Other_Flow
		ImageLaunchNewFlow.click();
		return launchFlowLable.getText();
	}
	
	@FindBy(id="ShowAllWidght_image02")
	private WebElement ImageChangeFlowEvent;
	
	public String ImageChangeFlowEvent(){//Change flow event to final page
		ImageChangeFlowEvent.click();
		Main_Class.switchWindow();
		return finalPage.getText();
	}
//RichText
	@FindBy(id="dijitEditorBody")
	private WebElement RichTextEditor;
	
	public String RichTextEditor(){
		(new Main_Class()).switchIframe("ShowAllWidght_richText_iframe");
		RichTextEditor.sendKeys("abc");
		return RichTextEditor.getText();
	}
	
	public void switchIframeToDefault(){
		(new Main_Class()).switchDefaultIframe();
	}
	
//Text Area
	@FindBy(id="ShowAllWidght_textArea")
	private WebElement TextArea;
	
	public String TextArea(){
		switchIframeToDefault();
		TextArea.sendKeys("Test");
		return TextArea.getTagName();
	}
	
//Message
	@FindBy(id="ShowAllWidght_button02")
	private WebElement showMessageButton;
	
	@FindBy(id="ShowAllWidght_message")
	private WebElement showMessage;
	
	public Boolean showMessage(){
		showMessageButton.click();
		return showMessageButton.isDisplayed();
	}
	
//Button
	@FindBy(id="ShowAllWidght_button")
	private WebElement ButtonSubmit;
	
	public String ButtonSubmit(){
		return ButtonSubmit.getAttribute("aria-disabled");
	}
	
	public String ButtonSubmitHighLight(){
		TextIsMandatoryT.sendKeys("asd");
		selectListClick.click();
		selectListCity1.click();
		return ButtonSubmit.getAttribute("aria-disabled");
	}
	
	@FindBy(id="ShowAllWidght_button01")
	private WebElement ButtonReset;
	
	public String ButtonReset(){
		ButtonReset.click();
		return TextIsMandatoryT.getText();
	}
	
	@FindBy(id="ShowAllWidght_button03")
	private WebElement ButtonSubmitWithNoData;
	
	public String ButtonSubmitWithNoData(){
		TextArea.sendKeys("Test");
		ButtonSubmitWithNoData.click();
		return TextAreaResult.getAttribute("value");
	}
	
/*	@FindBy(id="ShowAllWidght_button04")
	private WebElement ButtonSubmitWithoutValidation;
	
	public String ButtonSubmitWithoutValidation(){
		ButtonSubmitWithoutValidation.click();
	}*/
//resultPage
//lable result
	@FindBy(id="ShowSubmitResult_label")
	private WebElement lableResult;

//Radio Result
	@FindBy(id="ShowSubmitResult_radio01")
	private WebElement radioMale;
	
	@FindBy(id="ShowSubmitResult_radio")
	private WebElement radioFemale;
	
//TestArea Result	
	@FindBy(id="ShowSubmitResult_textArea")
	private WebElement TextAreaResult;
	
	@FindBy(id="ShowSubmitResult_link")
	private WebElement back;
	
	public void back(){
		back.click();
	}
//###############################All Widgets##################################
	
}
