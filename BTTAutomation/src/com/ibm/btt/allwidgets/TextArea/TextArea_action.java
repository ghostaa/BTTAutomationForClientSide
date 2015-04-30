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

public class TextArea_action extends Main_Class{

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
    drv.TextArea_action();
  }

  @Test
  public void actFocus(){
	  assertEquals("Focused", drv.actFocus());
  }
  
  @Test
  public void actErrorMessage(){
	  assertEquals("This is nls test", drv.actErrorMessage());
  }
  
  @Test
  public void actStyleClass(){
	  assertEquals(1, drv.actStyleClass());
  }
  
  @Test
  public void actValue(){
	  assertEquals("Test TextArea", drv.actValue());
  }
  
  @Test
  public void actIsMandatory(){
	  assertEquals(1, drv.actIsMandatory());
  }
  
  @Test
  public void actVisibility(){
	  assertEquals(1, drv.actVisibility());
  }
  
  @Test
  public void actDisable(){
	  assertEquals("true", drv.actDisable());
  }
  
  @Test
  public void actReadonly(){
	  assertEquals("true", drv.actReadonly());
  }
  
  @Test
  public void actHint(){
	  assertEquals("Test hint", drv.actHint());
  }
  
  @Test
  public void actActionGroup(){
	  assertEquals("true", drv.actActionGroup());
  }
  
  @Test
  public void actKeyDown(){
	  assertEquals("actiongroup success", drv.actKeyDown());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,TextArea_action.class);
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
