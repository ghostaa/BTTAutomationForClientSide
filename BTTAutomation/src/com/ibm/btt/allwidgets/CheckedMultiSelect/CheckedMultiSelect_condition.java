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

public class CheckedMultiSelect_condition extends Main_Class{

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
    drv.CheckedMultiSelect_condition();
  }

  @Test
  public void conIsFocusable(){
	  assertEquals("CheckedMultiSelect isFocusable() is true", drv.conIsFocusable());
  }
  
  @Test
  public void conDisabled(){
	  assertEquals("CheckedMultiSelect disabled is true", drv.conDisabled());
  }
  
  @Test
  public void conReadonly(){
	  assertEquals("CheckedMultiSelect readOnly is true", drv.conReadonly());
  }
  
  @Test
  public void conExpisFocusable(){
	  assertEquals("CheckedMultiSelect isFocusable() is true in express", drv.conExpisFocusable());
  }
  
  @Test
  public void conExpId(){
	  assertEquals("CheckedMultiSelect_condition_checkedMultiSelect02", drv.conExpId());
  }
  
  @Test
  public void conExpValue(){
	  assertEquals("Wrong value", drv.conExpValue());
  }
  
  @Test
  public void conVisible(){
	  assertEquals("visibility is visible", drv.conVisible());
  }
  
  @Test
  public void conExpDisabled(){
	  assertEquals("disabled is FALSE", drv.conExpDisabled());
  }
  
  @Test
  public void conExpReadonly(){
	  assertEquals("readOnly is false", drv.conExpReadonly());
  }
  
/*  @Test
  public void conAsyncStatus(){
	  assertEquals("It's false : multiSelect_copy11.asyncStatus=ok", conAsyncStatus());
  }
  
  @Test
  public void conAsyncErrorMessage(){
	  assertEquals("It's false : multiSelect_copy11.asyncErrorMessage = \"error\"", conAsyncErrorMessage());
  }*/
 
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,CheckedMultiSelect_condition.class);
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
