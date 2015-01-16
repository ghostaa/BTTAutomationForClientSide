package com.ibm.btt.allwidgets.CheckedMultiSelect;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class CheckedMultiSelect_event extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static CheckedMultiSelect_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, CheckedMultiSelect_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.CheckedMultiSelect_widget();
    drv.CheckedMultiSelect_event();
  }

  @Test
  public void evtOnClick(){
	  assertEquals("[object Object],[object Object]", drv.evtOnClick());
  }
  
  @Test
  public void evtOnFocus(){
	  assertEquals("[object Object]", drv.evtOnFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals("[object Object],[object Object]", drv.evtOnBlur());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals("[object Object],[object Object]", drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeyPress(){
	  assertEquals("[object Object],[object Object]", drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals("[object Object],[object Object]", drv.evtOnKeyUp());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals("[object Object]", drv.evtOnMouseDown());
  }
   
  @Test
  public void evtOnMouseUp(){
	  assertEquals("[object Object]", drv.evtOnMouseUp());
  }
  
  @Test
  public void evtOnMouseEnter(){
	  assertEquals("[object Object]", drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave(){
	  assertEquals("[object Object]", drv.evtOnMouseLeave());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals("[object Object]", drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnChange(){
	  assertEquals("[object Object],[object Object]", drv.evtOnChange());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,CheckedMultiSelect_event.class);
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
