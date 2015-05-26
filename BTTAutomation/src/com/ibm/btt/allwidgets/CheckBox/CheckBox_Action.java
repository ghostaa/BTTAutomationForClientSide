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
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class CheckBox_Action extends AllWidgetsProjectMain_Class{
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
    drv.CheckBox_Action();
  }

  @Test
  public void CheckBox_Action_checkBox_focus(){
	  assertEquals(2, drv.CheckBox_Action_checkBox_focus());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_styleClass(){
	  assertEquals(1, drv.CheckBox_Action_CheckBox_styleClass());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_Text(){
	  assertEquals("I changed", drv.CheckBox_Action_CheckBox_Text());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_visible(){
	  assertEquals("visibility: hidden;", drv.CheckBox_Action_CheckBox_visible());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_gone(){
	  assertEquals("visibility: inherit; display: none;", drv.CheckBox_Action_CheckBox_gone());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_visibility(){
	  assertEquals("visibility: inherit;", drv.CheckBox_Action_CheckBox_visibility());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_disabled(){
	  assertEquals(true,drv.CheckBox_Action_CheckBox_disabled());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_disableTrue(){
	  assertEquals("true",drv.CheckBox_Action_CheckBox_disableTrue());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_readOnly(){
	  assertEquals("true",drv.CheckBox_Action_CheckBox_readOnly());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_radonlyFalse(){
	  assertEquals(true,drv.CheckBox_Action_CheckBox_radonlyFalse());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_isChecked(){
	  assertEquals("true",drv.CheckBox_Action_CheckBox_isChecked());
  }
  
  @Test
  public void CheckBox_Action_CheckBox_hint(){
	  assertEquals("Hi,I'm hint",drv.CheckBox_Action_CheckBox_hint());
  }
  
  @Test
  public void CheckBox_Action_checkBox01(){
	  assertEquals("visibility: inherit; display: none;",drv.CheckBox_Action_checkBox01());
  }
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,CheckBox_Action.class);
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
