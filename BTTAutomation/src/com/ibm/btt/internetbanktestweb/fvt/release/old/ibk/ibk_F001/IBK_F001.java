package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F001;
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

import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

public class IBK_F001 extends InternetBankTestWebMain_Class{
	 private boolean acceptNextAlert = true;
	 private static StringBuffer verificationErrors = new StringBuffer();
	 private static IBK_F001_PageObject drv;
	  

	 @BeforeClass
	 public static void setUp() throws Exception {
	    
	InternetBankTestWebMain_Class.setUp();
	drv=PageFactory.initElements(driver, IBK_F001_PageObject.class);
//	driver.navigate().to(Main_Class.baseUrl);
	drv.Establish();
	drv.IBK_FVT_tab();
	drv.IBK_F001();
	 
	}

  @Test
  public void getNormalPageTitle(){
	assertEquals("The first page", drv.getNormalPageTitle());
  }
  @Test
  public void getPageTitle(){
//	drv.nextPage1();
	assertEquals("Welcome to BTT sample page", drv.getPageTitle());
  }
  @Test
  public void popupPageTitle1(){
	drv.nextPage2();
	assertEquals("The PopupPage Title", drv.popupTitle1());
  }
 
  @Test
  public void popupPageTitle2(){
	drv.nextPage3();
	assertEquals("Welcome to BTT sample page", drv.popupTitle2());
	drv.nextPage4();
	assertEquals("This is the final page of the sample flow", drv.finalPage());
  }

  
@AfterClass
public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK_F001.class);
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
