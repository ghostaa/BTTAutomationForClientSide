package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk19and21forInnerSubFolder;

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

public class IBK19and21forInnerSubFolder extends InternetBankTestWebMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static IBK19and21forInnerSubFolder_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	InternetBankTestWebMain_Class.setUp();
    drv=PageFactory.initElements(driver, IBK19and21forInnerSubFolder_PageObject.class);
//	    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.IBK_FVT_tab();
    drv.IBK_19and21forInnerSubFolder();
  }
//###############################width and height##################################
  @Test
  public void WidthandHeight(){
	  assertEquals(true, drv.WidthandHeight());
  }
  
  @Test
  public void WidthandHeightButton1(){
	  assertEquals(2, drv.WidthandHeightButton1());
  }
  
  @Test
  public void WidthandHeightButton2(){
	  assertEquals(2, drv.WidthandHeightButton2());
  }
  
  @Test
  public void WidthandHeightButton3(){
	  assertEquals(2, drv.WidthandHeightButton3());
	  drv.WidthandHeightReturn();
  }
//###############################left and top##################################
  @Test
  public void LeftandTop(){
	  assertEquals(true, drv.LeftandTop());
  }
  
  @Test
  public void LeftandTopButton1(){
	  assertEquals(2, drv.LeftandTopButton1());
  }
  
  @Test
  public void LeftandTopButton2(){
	  assertEquals(2, drv.LeftandTopButton2());
  }
  
  @Test
  public void LeftandTopButton3(){
	  assertEquals(2, drv.LeftandTopButton3());
	  drv.LeftandTopReturn();
  }
//###############################close box##################################
  @Test
  public void CloseBox(){
	  assertEquals(true, drv.CloseBox());
  }
  
  @Test
  public void CloseBoxButton1(){
	  assertEquals(true, drv.CloseBoxButton1());
  }
  
  @Test
  public void CloseBoxButton2(){
	  assertEquals(false, drv.CloseBoxButton2());
	  drv.CloseBoxReturn();
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK19and21forInnerSubFolder.class);
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
