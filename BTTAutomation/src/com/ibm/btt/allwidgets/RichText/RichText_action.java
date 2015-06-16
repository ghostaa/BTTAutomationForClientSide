package com.ibm.btt.allwidgets.RichText;

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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class RichText_action extends Main_Class{

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
    drv.RichText_action();
  }

  @Test
  public void actFocus(){
	  assertEquals(1, drv.actFocus());
  }
  
  @Test
  public void actHidden(){
	  assertEquals(1, drv.actHidden());
  }
  
  @Test
  public void actVisible(){
	  assertEquals(true, drv.actVisible());
  }
  
  @Test
  public void actGone(){
	  assertEquals(1, drv.actGone());
  }
 
  @Test
  public void actReadonlyT(){
	  assertEquals("false", drv.actReadonlyT());
  }
  
  @Test
  public void actReadonlyF(){
	  assertEquals("true", drv.actReadonlyF());
  }
  
  @Test
  public void actHint(){
	  assertEquals("Say hello to you ", drv.actHint());
  }
  
  @Test
  public void actStyleClass(){
	  assertEquals(1, drv.actStyleClass());
  }
  
  @Test
  public void actGroup(){
	  assertEquals(1, drv.actGroup());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,RichText_action.class);
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
