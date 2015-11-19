package com.ibm.btt.allwidgets.Combo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.runners.MethodSorters;

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
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Combo_Action extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Combo_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Combo_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Combo_widget();
    drv.Combo_action();
  }

  @Test
  public void actFocus(){
	  assertEquals(2, drv.actFocus());
  }
  
  @Test
  public void actClickBefor(){
	  assertEquals("BeiJing", drv.actClickBefor());
  }
  
  @Test
  public void actLoadStoreFromURL() throws InterruptedException{
	  assertEquals("CHINA", drv.actLoadStoreFromURL());
  }
  
  @Test
  public void act_1_ShowErrorMessage(){
	  assertEquals("This is hint test", drv.actShowErrorMessage());
  }
  
  @Test
  public void actStyleClass(){
	  assertEquals(1, drv.actStyleClass());
  }
  
  @Test
  public void act_2_IsMandatory(){
	  assertEquals("This value is required.", drv.actIsMandatory());
  }
  
  @Test
  public void actHidden(){
	  assertEquals(false, drv.actHidden());
  }
 
  @Test
  public void actdisableTrue(){
	  assertEquals("true", drv.actdisableTrue());
  }

  @Test
  public void actreadonlyTrue(){
	  assertEquals("true", drv.actreadonlyTrue());
  }
  
  @Test
  public void actHint(){
	  assertEquals("This is a hint.", drv.actHint());
  }
  
  @Test
  public void actGroup(){
	  assertEquals("action group", drv.actGroup());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Combo_Action.class);
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
