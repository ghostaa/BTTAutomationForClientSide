package com.ibm.btt.allwidgets.Link;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Link_Condition extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Link_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Link_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Link_widget();
    drv.Link_condition();
  }

  @Test
  public void conisFocusable(){
	  assertEquals(true, drv.conisFocusable());
  }
  
  @Test
  public void conDisableTrue(){
	  assertEquals("Text will be shown", drv.conDisableTrue());
  }
  
  @Test
  public void conDisableFalse(){
	  assertEquals(true, drv.conDisableFalse());
  }
  
  @Test
  public void conExpInstant(){
	  assertEquals(true, drv.conExpInstant());
  }
  
  @Test
  public void conExpisFocusable(){
	  assertEquals(true, drv.conExpisFocusable());
  }
  
  @Test
  public void conExpid(){
	  assertEquals(true, drv.conExpid());
  }
  
  @Test
  public void conExpText(){
	  assertEquals(true, drv.conExpText());
  }
  
  @Test
  public void conExpVisiblity(){
	  assertEquals(true, drv.conExpVisiblity());
  }
  
  @Test
  public void conExpDisabled(){
	  assertEquals(true, drv.conExpDisabled());
  }
  
  @Test
  public void conExpTarget() throws Exception{
	  assertEquals(true, drv.conExpLabel());
	  assertEquals("about:blank", drv.conExpTarget());
	  driver.close();
	  Link_Condition.setUp();
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Link_Condition.class);
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
