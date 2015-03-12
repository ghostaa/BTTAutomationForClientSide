package com.ibm.btt.allwidgets.HorizontalSlider;

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

public class HorizontalSlider_InlineStyle extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static HorizontalSlider_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, HorizontalSlider_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.HorizontalSlider_widget();
    drv.HorizontalSlider_action();
  }

  @Test
  public void actGetName(){
	  assertEquals("HorizontalSlider_action_horizontalSlider", drv.actGetName());
  }
  
  @Test
  public void actSetName(){
	  assertEquals("test", drv.actSetName());
  }
  
  @Test
  public void actCompare(){
	  assertEquals("0", drv.actCompare());
  }
  
  @Test
  public void actFocus(){
	  assertEquals(2, drv.actFocus());
  }
  
  @Test
  public void actReset(){
	  assertEquals("0", drv.actReset());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,HorizontalSlider_InlineStyle.class);
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
