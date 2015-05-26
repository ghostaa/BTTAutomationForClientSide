package com.ibm.btt.allwidgets.Combo;

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

public class Combo_Condition extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Combo_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Combo_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Combo_widget();
    drv.Combo_condition();
  }

  @Test
  public void conIsFocusable(){
	  assertEquals("true", drv.conIsFocusable());
  }
  
  @Test
  public void conIsMandatoryTrue(){
	  assertEquals("true", drv.conIsMandatoryTrue());
  }
  
  @Test
  public void conIsMandatoryFalse(){
	  assertEquals("false", drv.conIsMandatoryFalse());
  }
  
  @Test
  public void conDisable(){
	  assertEquals("This is nls test", drv.conDisable());
  }
  
  @Test
  public void conReadonly(){
	  assertEquals("true", drv.conReadonly());
  }
  
  @Test
  public void conGetTooltip(){
	  assertEquals("readOnly", drv.conGetTooltip());
  }
  
  @Test
  public void conExpisFocusable(){
	  assertEquals("The combo value is required.", drv.conExpisFocusable());
  }
  
  @Test
  public void conExpId(){
	  assertEquals("this is combo05.", drv.conExpId());
  }
  
  @Test
  public void conExpisMandatory(){
	  assertEquals("This value is required.", drv.conExpisMandatory());
  }
  
  @Test
  public void conExpVisible(){
	  assertEquals(false, drv.conExpVisible());
  }
  
  @Test
  public void conExplabel01(){
	  assertEquals("The combe is hidden.", drv.conExplabel01());
  }
  
  @Test
  public void conExpDisabled(){
	  assertEquals("true", drv.conExpDisabled());
  }
  
  @Test
  public void conExpReadonly(){
	  assertEquals("true", drv.conExpReadonly());
  }
  
  @Test
  public void conExpCheckBox(){
	  assertEquals(true, drv.conExpCheckBox());
  }
  
  @Test
  public void conExpValue(){
	  assertEquals("Please select CHINA.", drv.conExpValue());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Combo_Condition.class);
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
