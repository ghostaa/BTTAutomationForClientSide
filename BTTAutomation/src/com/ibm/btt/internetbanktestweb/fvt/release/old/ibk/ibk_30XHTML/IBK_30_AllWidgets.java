package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_30XHTML;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.allwidgets.Button.Button_PageObject;
import com.ibm.btt.allwidgets.Button.Button_appearance1;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

public class IBK_30_AllWidgets extends InternetBankTestWebMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static IBK_30XHTML_AllWidgets_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	InternetBankTestWebMain_Class.setUp();
    drv=PageFactory.initElements(driver, IBK_30XHTML_AllWidgets_PageObject.class);
//	    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.IBK_FVT_tab();
    drv.IBK30XHTML();
    drv.AllWidgets();
 
  }
//*********************************NLS*************************************
  @Test
  public void LinkChinese(){
	assertEquals("欢迎浏览BTT示范页面", drv.LinkChinese());
  }
  
  @Test
  public void LinkEnglish(){
	assertEquals("Welcome to BTT sample page", drv.LinkEnglish());
  }
  
  @Test
  public void LinkKorean(){
	assertEquals("FAS BTT 샘플 페이지에 오신 것을 환영합니다.", drv.LinkKorean());
  }
  
  @Test
  public void LinkSpanish(){
	assertEquals("Bienvenido a la página de ejemplo BTT", drv.LinkSpanish());
  }
  
  @Test
  public void ButtonChinese(){
	assertEquals("true", drv.ButtonChinese());
  }
  
  @Test
  public void ButtonEnglish(){
	assertEquals("true", drv.ButtonEnglish());
  }

  @Test
  public void ButtonKorean(){
	assertEquals("true", drv.ButtonKorean());
  }
  
  @Test
  public void ButtonSpanish(){
	assertEquals("true", drv.ButtonSpanish());
  }
  
  @Test
  public void ImageChinese(){
	assertEquals("欢迎浏览BTT示范页面", drv.ImageChinese());
  }
  
  @Test
  public void ImageChineseURL(){
	assertEquals(true, drv.ImageChineseURL());
  }
  
  @Test
  public void ImageEnglish(){
	assertEquals("Welcome to BTT sample page", drv.ImageEnglish());
  }
  
  @Test
  public void ImageEnglishURL(){
	assertEquals(true, drv.ImageEnglishURL());
  }
  
  @Test
  public void ImageKorean(){
	assertEquals("FAS BTT 샘플 페이지에 오신 것을 환영합니다.", drv.ImageKorean());
  }
  
  @Test
  public void ImageKoreanURL(){
	assertEquals(true, drv.ImageKoreanURL());
  }
  
  @Test
  public void ImageSpanish(){
	assertEquals("Bienvenido a la página de ejemplo BTT", drv.ImageSpanish());
  }
  
  @Test
  public void ImageSpanishURL(){
	assertEquals(true, drv.ImageSpanishURL());
  }
//*************************************Lable*****************************************  
  @Test
  public void visiableLable(){
	assertEquals(true, drv.visiableLable());
  }
  
  @Test
  public void hiddenLable(){
	assertEquals(1, drv.hiddenLable());
  }
  
  @Test
  public void goneLable(){
	assertEquals(1, drv.goneLable());
  }
 //***************************************Radio**************************************
  @Test
  public void maleRadio(){
	assertEquals("checked", drv.maleRadio());
  }
  
  @Test
  public void femaleRadio(){
	assertEquals("false", drv.femaleRadio());
  }
  
  @Test
  public void hiddenRadio(){
	assertEquals(1, drv.hiddenRadio());
  }
  
  @Test
  public void goneRadio(){
	assertEquals(1, drv.goneRadio());
  }
  
  @Test
  public void radioDisableT(){
	assertEquals("true", drv.radioDisableT());
  }
  
  @Test
  public void radioReadonlyT(){
	assertEquals("true", drv.radioReadonlyT());
  }
 //*********************************checkbox**********************************
  
  @Test
  public void visibleCheckbox(){
	assertEquals(true, drv.visibleCheckbox());
  }
  
  @Test
  public void checkboxChecked(){
	assertEquals("checked", drv.checkboxChecked());
  }
  
  @Test
  public void CheckboxDisableT(){
	assertEquals("true", drv.CheckboxDisableT());
  }
  
  @Test
  public void CheckboxReadonlyT(){
	assertEquals("true", drv.CheckboxReadonlyT());
  }
 //************************************Text**********************************
  
  @Test
  public void Text(){
	assertEquals("888", drv.Text());
  }
  
  @Test
  public void TextIsMandatoryT(){
	assertEquals("true", drv.TextIsMandatoryT());
  }
  
  @Test
  public void hiddenText(){
	assertEquals(1, drv.hiddenText());
  }
  
  @Test
  public void goneText(){
	assertEquals(1, drv.goneText());
  }
  
  @Test
  public void TextDisableT(){
	assertEquals("true", drv.TextDisableT());
  }
  
  @Test
  public void TextReadonlyT(){
	assertEquals("true", drv.TextReadonlyT());
  }
  
  @Test
  public void TextPasswordT(){
	assertEquals("password", drv.TextPasswordT());
  }
//*********************************Select List*******************************
  
  @Test
  public void xValidationTooltip(){
	assertEquals("The selection must be selected 'City1' ,this test case is used for xValidations of 'form' widget", drv.xValidationTooltip());
  }
  
  @Test
  public void selectListDataNameForList(){
	assertEquals("City0", drv.selectListDataNameForList());
  }
  
  @Test
  public void selectListDataNameForListName(){
	assertEquals("Select_DataName_result", drv.selectListDataNameForListName());
  }
  
  @Test
  public void selectListCity1(){
	assertEquals("City1", drv.selectListCity1());
  }
  
  @Test
  public void selectListURLForList(){
	assertEquals("BeiJing", drv.selectListURLForList());
  }
  
  @Test
  public void selectListURLForListName(){
	assertEquals("Select_UrlList_result", drv.selectListURLForListName());
  }
//***********************************ComboList******************************************
  
  public void comboDataNameForList(){
	assertEquals("Combo_DataName_result", drv.comboDataNameForList());
  }
  
  @Test
  public void comboURLForList(){
	assertEquals("Combo_UrlList_result", drv.comboURLForList());
  }

//************************************Link***********************************************
  @Test
  public void linkFinalPage(){
	driver.navigate().to(InternetBankTestWebMain_Class.baseUrl);
	drv.Establish();
	drv.IBK_FVT_tab();
	drv.IBK30XHTML();
	drv.AllWidgets();
	assertEquals("This is the final page of the sample flow", drv.linkFinalPage());
  }
  
  @Test
  public void linkLanchNewFlow(){
	driver.navigate().refresh();
	drv.IBK_FVT_tab();
	drv.IBK30XHTML();
	drv.AllWidgets();
	assertEquals("This page is result of 'Launch Flow'", drv.linkLanchNewFlow());
  }
  
  /*@Test
  public void linkLaunchOperation(){
	assertEquals("This is the final page of the sample flow", drv.linkLaunchOperation());
	driver.navigate().refresh();
	drv.IBK_FVT_tab();
	drv.IBK30XHTML();
	drv.AllWidgets();
  }
  
  @Test
  public void linkLaunchURL(){
	assertEquals("http://www.naver.com/", drv.linkLaunchURL());
  }
  */
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK_30_AllWidgets.class);
	driver.quit();
	//driver.navigate().refresh();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }

}
