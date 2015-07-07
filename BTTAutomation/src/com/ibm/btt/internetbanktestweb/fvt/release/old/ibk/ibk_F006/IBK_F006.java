package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F006;

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

import com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F001.IBK_F001;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.GetCurrentDate;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;
import com.ibm.btt.util.GetCurrentDate;

public class IBK_F006 extends InternetBankTestWebMain_Class {
	 private boolean acceptNextAlert = true;
	 private static StringBuffer verificationErrors = new StringBuffer();
	 private static IBK_F006_PageObject drv;
	  

	 @BeforeClass
	 public static void setUp() throws Exception {
	    
	InternetBankTestWebMain_Class.setUp();
	drv=PageFactory.initElements(driver, IBK_F006_PageObject.class);
//	driver.navigate().to(Main_Class.baseUrl);
	drv.Establish();
	drv.IBK_FVT_tab();
	drv.IBK_F006();
	 
	}

  @Test
 public void selectDay(){

	 drv.selectDate();
	 drv.clickForm();	
	 /*try {
		 Thread.sleep(3000);
		 } catch (InterruptedException e) {
		 // TODO Auto-generated catch block
		 e.printStackTrace();
		 }
	 System.out.println(GetCurrentDate.currentDate());
	 System.out.println(GetCurrentDate.currentYear());
	 System.out.println(GetCurrentDate.currentMonth());
	 System.out.println(GetCurrentDate.currentDay());*/
	 drv.yearInput();
	 drv.monthInput();
	 drv.dayInput();
	
	 assertEquals(GetCurrentDate.currentYear(), drv.yearInput());
	 assertEquals(GetCurrentDate.currentMonth(), drv.monthInput());
	 assertEquals(GetCurrentDate.currentDay(), drv.dayInput());
	 
	 drv.clickButton();
	 assertEquals(GetCurrentDate.currentDate(), drv.testResult());
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