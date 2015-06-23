package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F_007;

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

public class MultilanguageSwitch extends InternetBankTestWebMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static IBK_F_007_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	InternetBankTestWebMain_Class.setUp();
    drv=PageFactory.initElements(driver, IBK_F_007_PageObject.class);
//	    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.IBK_FVT_tab();
    drv.IBK_F_007();
 
  }

  @Test
  public void LinkChinese(){
	  assertEquals("欢迎浏览BTT示范页面", drv.LinkChinese());
  }
  
  @Test
  public void LinkChineseTitle(){
	  assertEquals("欢迎浏览BTT示范页面", drv.LinkChineseTitle());
  }
  
  @Test
  public void LinkEnglish(){
	  assertEquals("Welcome to BTT sample page", drv.LinkEnglish());
  }
  
  @Test
  public void LinkEnglishTitle(){
	  assertEquals("Welcome to BTT sample page", drv.LinkEnglishTitle());
  }
  
  @Test
  public void LinkKorean(){
	  assertEquals("FAS BTT 샘플 페이지에 오신 것을 환영합니다.", drv.LinkKorean());
  }
  
  @Test
  public void LinkKoreanTitle(){
	  assertEquals("FAS BTT 샘플 페이지에 오신 것을 환영합니다.", drv.LinkKoreanTitle());
  }
  
  @Test
  public void LinkSpanish(){
	  assertEquals("Bienvenido a la página de ejemplo BTT", drv.LinkSpanish());
  }
  
  @Test
  public void LinkSpanishTitle(){
	  assertEquals("Bienvenido a la página de ejemplo BTT", drv.LinkSpanishTitle());
  }
  
  @Test
  public void ButtonChinese(){
	  assertEquals("欢迎浏览BTT示范页面", drv.ButtonChinese());
  }
  
  @Test
  public void ButtonChineseTitle(){
	  assertEquals("欢迎浏览BTT示范页面", drv.ButtonChineseTitle());
  }
  
  @Test
  public void ButtonEnglish(){
	  assertEquals("Welcome to BTT sample page", drv.ButtonEnglish());
  }
  
  @Test
  public void ButtonEnglishTitle(){
	  assertEquals("Welcome to BTT sample page", drv.ButtonEnglishTitle());
  }
  
  @Test
  public void ButtonKorean(){
	  assertEquals("FAS BTT 샘플 페이지에 오신 것을 환영합니다.", drv.ButtonKorean());
  }
  
  @Test
  public void ButtonKoreanTitle(){
	  assertEquals("FAS BTT 샘플 페이지에 오신 것을 환영합니다.", drv.ButtonKoreanTitle());
  }
  
  @Test
  public void ButtonSpanish(){
	  assertEquals("Bienvenido a la página de ejemplo BTT", drv.ButtonSpanish());
  }
  
  @Test
  public void ButtonSpanishTitle(){
	  assertEquals("Bienvenido a la página de ejemplo BTT", drv.ButtonSpanishTitle());
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
  public void ImageChineseTitle(){
	  assertEquals("欢迎浏览BTT示范页面", drv.ImageChineseTitle());
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
  public void ImageEnglishTitle(){
	  assertEquals("Welcome to BTT sample page", drv.ImageEnglishTitle());
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
  public void ImageKoreanTitle(){
	  assertEquals("FAS BTT 샘플 페이지에 오신 것을 환영합니다.", drv.ImageKoreanTitle());
  }
  
  @Test
  public void ImageSpanish(){
	  assertEquals("Bienvenido a la página de ejemplo BTT", drv.ImageSpanish());
  }
  
  @Test
  public void ImageSpanishURL(){
	  assertEquals(true, drv.ImageSpanishURL());
  }
  
  @Test
  public void ImageSpanishTitle(){
	  assertEquals("Bienvenido a la página de ejemplo BTT", drv.ImageSpanishTitle());
  }
  
  @Test
  public void ButtonFinal(){
	  assertEquals("Bienvenido a la página de ejemplo BTT", drv.ButtonFinal());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,MultilanguageSwitch.class);
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
