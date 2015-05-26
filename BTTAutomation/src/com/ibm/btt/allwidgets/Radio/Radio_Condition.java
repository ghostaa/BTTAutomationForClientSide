package com.ibm.btt.allwidgets.Radio;

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

public class Radio_Condition extends AllWidgetsProjectMain_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Radio_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Radio_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Radio_widget();
    drv.Radio_Condition();
  }

  @Test
  public void Radio_Condition_radio_isFocusable(){
	  assertEquals(2, drv.Radio_Condition_radio_isFocusable());
  }
  
  @Test
  public void Radio_Condition_radio_isChecked(){
	  assertEquals("isChecked", drv.Radio_Condition_radio_isChecked());
  }
  
  @Test
  public void Radio_Condition_radio_readOnly(){
	  assertEquals(false, drv.Radio_Condition_radio_readOnly());
  }
  
  @Test
  public void Radio_Condition_radio_disabled(){
	  assertEquals(true, drv.Radio_Condition_radio_disabled());
  }
  
  @Test
  public void Radio_Condition_Expression_id(){
	  assertEquals("true", drv.Radio_Condition_Expression_id());
  }
  
  @Test
  public void Radio_Condition_Expression_text(){
	  assertEquals(1, drv.Radio_Condition_Expression_text());
  }
  
  @Test
  public void Radio_Condition_Expression_visibility(){
	  assertEquals(true,drv.Radio_Condition_Expression_visibility());
  }
  
  @Test
  public void Radio_Condition_Expression_disabled(){
	  assertEquals("8.Check radio_onClick , radio_hint will show hint",drv.Radio_Condition_Expression_disabled());
  }
  
  @Test
  public void Radio_Condition_Expression_readOnly(){
	  assertEquals(1,drv.Radio_Condition_Expression_readOnly());
  }
  
  @Test
  public void Radio_Expression_isChecked(){
	  assertEquals(2,drv.Radio_Expression_isChecked());
  }
  
  @Test
  public void Radio_Condition_Expression_isFocusable(){
	  assertEquals(true,drv.Radio_Condition_Expression_isFocusable());
	  assertEquals(2,drv.Radio_Condition_Expression_focus());
  } 

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Radio_Condition.class);
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
