package com.ibm.btt.allwidgets.SelectList;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ibm.btt.allwidgets.Label.Label_PageObject;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class SelectList_Condition extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static SelectList_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, SelectList_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.SelectList_widget();
    drv.SelectList_condition();
  }

  @Test
  public void conisFocusable(){
	  assertEquals("3", drv.conisFocusable());
  }
  
  @Test
  public void conDisable(){
	  assertEquals(true, drv.conDisable());
  }
  
  @Test
  public void conReadonly(){
	  assertEquals(false, drv.conReadonly());
  }
  
  @Test
  public void conExpisFocusable(){
	  assertEquals(1, drv.conExpisFocusable());
  }
  
  @Test
  public void conExpid(){
	  assertEquals("3", drv.conExpid());
  }
  
  @Test
  public void conExpValue(){
	  assertEquals(true, drv.conExpValue());
  }
  
  @Test
  public void conExpVisibility(){
	  assertEquals(true, drv.conExpVisibility());
  }
  
  @Test
  public void conExpDisable(){
	  assertEquals(true, drv.conExpDisable());
  }
  
  @Test
  public void conExpReadonly(){
	  assertEquals("true", drv.conExpReadonly());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,SelectList_Condition.class);
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
