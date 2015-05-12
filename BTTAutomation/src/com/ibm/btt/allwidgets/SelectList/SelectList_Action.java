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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class SelectList_Action extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static SelectList_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, SelectList_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.SelectList_widget();
    drv.SelectList_action();
  }

  @Test
  public void actFocus(){
	  assertEquals(3, drv.actFocus());
  }
  
  @Test
  public void actShowErrorMessage(){
	  assertEquals("Welcome to BTT sample page", drv.actShowErrorMessage());
  }
  
  @Test
  public void actStyleClass(){
	  assertEquals(1, drv.actStyleClass());
  }
  
  @Test
  public void actValue(){
	  assertEquals("6", drv.actValue());
  }
  
  @Test
  public void actVisible(){
	  assertEquals(true, drv.actVisible());
  }
  
  @Test
  public void actHidden(){
	  assertEquals(1, drv.actHidden());
  }
  
  @Test
  public void actGone(){
	  assertEquals(1, drv.actGone());
  }
  
  @Test
  public void actDisableFalse(){
	  assertEquals(true, drv.actDisableFalse());
  }
  
  @Test
  public void actdisableTrue(){
	  assertEquals("true", drv.actdisableTrue());
  }
  
  @Test
  public void actreadonlyFalse(){
	  assertEquals(true, drv.actreadonlyFalse());
  }
  
  @Test
  public void actreadonlyTrue(){
	  assertEquals("true", drv.actreadonlyTrue());
  }
  
  @Test
  public void actHint(){
	  assertEquals("FVT", drv.actHint());
  }
  
  @Test
  public void actGroup(){
	  assertEquals("true", drv.actGroup());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,SelectList_Action.class);
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
