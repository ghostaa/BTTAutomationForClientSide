package com.ibm.btt.allwidgets.TextArea;

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

public class TextArea_condition extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static TextArea_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, TextArea_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.TextArea_widget();
    drv.TextArea_condition();
  }

  @Test
  public void conIsFocusable(){
	  assertEquals("true", drv.conIsFocusable());
  }
  
  @Test
  public void conIsMandatory(){
	  assertEquals("true", drv.conIsMandatory());
  }
  
  @Test
  public void conDisabled(){
	  assertEquals("true", drv.conDisabled());
  }
  
  @Test
  public void conReadOnly(){
	  assertEquals("true", drv.conReadOnly());
  }
  
  @Test
  public void conConstant(){
	  assertEquals("true", drv.conConstant());
  }
  
  @Test
  public void conConstantTF(){
	  assertEquals("true", drv.conConstantTF());
  }
  
  @Test
  public void conExpIsFocusable(){
	  assertEquals("true", drv.conExpIsFocusable());
  }
  
  @Test
  public void conExpId(){
	  assertEquals("true", drv.conExpId());
  }
  
  @Test
  public void conExpValue(){
	  assertEquals("true", drv.conExpValue());
  }
  
  @Test
  public void conExpIsMandatory(){
	  assertEquals("true", drv.conExpIsMandatory());
  }
  
  @Test
  public void conExpVisibility(){
	  assertEquals("true", drv.conExpVisibility());
  }
  
  @Test
  public void conExpDisabled(){
	  assertEquals("true", drv.conExpDisabled());
  }
  
  @Test
  public void conExpReadonly(){
	  assertEquals("true", drv.conExpReadonly());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,TextArea_condition.class);
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
