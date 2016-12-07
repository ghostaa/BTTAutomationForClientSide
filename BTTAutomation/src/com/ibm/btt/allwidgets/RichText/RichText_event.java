package com.ibm.btt.allwidgets.RichText;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
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

public class RichText_event extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static RichText_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, RichText_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.RichText_widget();
    drv.RichText_event();
  }

  @Test
  public void evtOnClick(){
	  assertEquals(1, drv.evtOnClick());
  }
 
  @Test
  public void evtOnFocus(){
	  assertEquals(1, drv.evtOnFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals(1, drv.evtOnBlur());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals(1, drv.evtOnKeyDown());
  }
  
  @Test
  @Ignore
  public void evtOnKeyPress(){
	  assertEquals(1, drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals(1, drv.evtOnKeyUp());
  }
  
  @Test
  public void evtOnMouseEnter(){
	  assertEquals(1, drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave(){
	  assertEquals(1, drv.evtOnMouseLeave());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals(1, drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnChange(){
	  assertEquals(1, drv.evtOnChange());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,RichText_event.class);
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
