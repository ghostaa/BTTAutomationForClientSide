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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Radio_Event extends AllWidgetsProjectMain_Class{
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
    drv.Radio_Event();
  }

  @Test
  public void Radio_Event_radio_onClick(){
	  assertEquals(2, drv.Radio_Event_radio_onClick());
  }
  
  @Test
  public void Radio_Event_radio_onKeyDown(){
	  assertEquals("radio_onClick", drv.Radio_Event_radio_onKeyDown());
  }
  
  @Test
  public void Radio_Event_radio_onKeypress(){
	  assertEquals(false, drv.Radio_Event_radio_onKeypress());
  }
  
  @Test
  public void Radio_Event_radio_onKeyUp(){
	  assertEquals(true, drv.Radio_Event_radio_onKeyUp());
  }
  
  @Test
  public void Radio_Event_radio_onMouseDown(){
	  assertEquals("true", drv.Radio_Event_radio_onMouseDown());
  }
  
  @Test
  public void Radio_Event_radio_onMouseUp(){
	  assertEquals("true", drv.Radio_Event_radio_onMouseUp());
  }
  
  @Test
  public void Radio_Event_radio_onMouseEnter(){
	  assertEquals("hi,radio", drv.Radio_Event_radio_onMouseEnter());
  }
  
  @Test
  public void Radio_Event_radio_onMouseLeave(){
	  assertEquals(1, drv.Radio_Event_radio_onMouseLeave());
  }
  
  @Test
  public void Radio_Event_radio_onMouseMove(){
	  assertEquals("TextChangeed", drv.Radio_Event_radio_onMouseMove());
  }
  
  @Test
  public void Radio_Event_radio_onChange(){
	  assertEquals("true", drv.Radio_Event_radio_onChange());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Radio_Event.class);
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
