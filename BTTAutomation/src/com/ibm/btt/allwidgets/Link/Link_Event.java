package com.ibm.btt.allwidgets.Link;

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
import com.ibm.btt.util.Tools;

public class Link_Event extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Link_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Link_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Link_widget();
    drv.Link_event();
  }

  @Test
  public void evtOnClick(){
	  assertEquals(true, drv.evtOnClick());
  }
  
  @Test
  public void evtOnFocus(){
	  assertEquals(true, drv.evtOnFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals(true, drv.evtOnBlur());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals(true, drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeyPress(){
	  assertEquals(true, drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals(true, drv.evtOnKeyUp());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals(true, drv.evtOnMouseDown());
  }
  
  @Test
  public void evtOnMouseUp(){
	  assertEquals(true, drv.evtOnMouseUp());
  }
  
  @Test
  public void evtOnMouseEnter(){
	  assertEquals(true, drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave(){
	  assertEquals(true, drv.evtOnMouseLeave());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals(true, drv.evtOnMouseMove());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Link_Event.class);
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
