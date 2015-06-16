package com.ibm.btt.allwidgets.Table;

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

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;

public class Table_colStandard extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Table_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Table_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Table_widget();
    drv.Table_colStandard();
    Main_Class.waitUntilLoadElement(20, "Table_Column_table01");
  }
  
  @Test
  public void colFixed(){
	  assertEquals(1, drv.colFixed());
  }
  
  @Test
  public void colOpeningDate(){
	  assertEquals(1, drv.colOpeningDate());
  }
  
  @Test
  public void colBalance(){
	  assertEquals(1, drv.colBalance());
  }
  
  @Test
  public void colRate(){
	  assertEquals(1, drv.colRate());
  }
  
  @Test
  public void colAllignmentL1(){
	  assertEquals(1, drv.colAllignmentL1());
  }
  
  @Test
  public void colAllignmentL2(){
	  assertEquals(1, drv.colAllignmentL2());
  }
  
  @Test
  public void colAllignmentC1(){
	  assertEquals(1, drv.colAllignmentC1());
  }
  
  @Test
  public void colAllignmentC2(){
	  assertEquals(1, drv.colAllignmentC2());
  }
  
  @Test
  public void colAllignmentR1(){
	  assertEquals(1, drv.colAllignmentR1());
  }
  
  @Test
  public void colAllignmentR2(){
	  assertEquals(1, drv.colAllignmentR2());
  }

  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Table_colStandard.class);
	driver.quit();
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
