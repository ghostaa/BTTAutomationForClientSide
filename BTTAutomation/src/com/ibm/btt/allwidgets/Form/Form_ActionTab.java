package com.ibm.btt.allwidgets.Form;

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

public class Form_ActionTab extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Form_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Form_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Form_widget();
    drv.Form_actionTab();
  }

  @Test
  public void changeFlowEvent(){
	  assertEquals("Form_properties", drv.changeFlowEvent());
	  driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
	  drv.Establish();
	  drv.BTT8200_tab();
	  drv.Form_widget();
	  drv.Form_actionTab();
  }
  
  @Test
  public void lauchNewFlow(){
	  assertEquals("Form-event", drv.lauchNewFlow());
	  driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
	  drv.Establish();
	  drv.BTT8200_tab();
	  drv.Form_widget();
	  drv.Form_actionTab();
  }
  
  @Test
  public void launchOperation(){
	  assertEquals("This is the final page of the sample flow", drv.launchOperation());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Form_ActionTab.class);
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
