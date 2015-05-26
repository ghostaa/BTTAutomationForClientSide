package com.ibm.btt.allwidgets.CheckBox;

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
import com.ibm.btt.allwidgets.Message.Message_Action;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class CheckBox_Event extends AllWidgetsProjectMain_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static CheckBox_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, CheckBox_PageObject.class);
//    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.BTT8200_tab();
    drv.CheckBox_widget();
    drv.CheckBox_Event();
  }

  @Test
  public void CheckBox_Event_CheckBox_onClick(){
	  assertEquals("checkBox_Event_onClick", drv.CheckBox_Event_CheckBox_onClick());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onKeyDown(){
	  assertEquals("checkBox_event_onKeyDown", drv.CheckBox_Event_checkBox_event_onKeyDown());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onKeyPress(){
	  assertEquals("checkBox_event_onKeyPress", drv.CheckBox_Event_checkBox_event_onKeyPress());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onKeyUp(){
	  assertEquals("checkBox_event_onMouseUp", drv.CheckBox_Event_checkBox_event_onKeyUp());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onMouseDown(){
	  assertEquals("checkBox_event_onMouseDown", drv.CheckBox_Event_checkBox_event_onMouseDown());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onMouseUp(){
	  assertEquals("checkBox_event_onMouseUp", drv.CheckBox_Event_checkBox_event_onMouseUp());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onMouseEnter(){
	  assertEquals("checkBox_event_onMouseEnter", drv.CheckBox_Event_checkBox_event_onMouseEnter());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onMouseLeave(){
	  assertEquals("checkBox_event_onMouseLeave", drv.CheckBox_Event_checkBox_event_onMouseLeave());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onMouseMove(){
	  assertEquals("checkBox_event_onMouseMove", drv.CheckBox_Event_checkBox_event_onMouseMove());
  }
  
  @Test
  public void CheckBox_Event_checkBox_event_onChange(){
	  assertEquals("checkBox_event_onChange", drv.CheckBox_Event_checkBox_event_onChange());
  }
  

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,CheckBox_Event.class);
	driver.quit();
//	driver.navigate().refresh();
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
