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
public class Combo_Condition extends AllWidgetsProjectMain_Class{

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
    drv.Combo_condition();
  }

  @Test
  public void con_01_IsFocusable(){
	  assertEquals("true", drv.conIsFocusable());
  }
  
  @Test
  public void con_02_IsMandatoryTrue(){
	  assertEquals("true", drv.conIsMandatoryTrue());
  }
  
  @Test
  public void con_03_IsMandatoryFalse(){
	  assertEquals("false", drv.conIsMandatoryFalse());
  }
  
  @Test
  public void con_05_Disable(){
	  assertEquals("This is nls test", drv.conDisable());
  }
  
  @Test
  public void con_06_Readonly(){
	  assertEquals("true", drv.conReadonly());
  }
  
  @Test
  public void con_07_GetTooltip(){
	  assertEquals("readOnly", drv.conGetTooltip());
  }
  
  @Test
  public void con_08_ExpisFocusable(){
	  assertEquals("The combo value is required.", drv.conExpisFocusable());
  }
  
  @Test
  public void con_09_ExpId(){
	  assertEquals("this is combo05.", drv.conExpId());
  }
  
  @Test
  public void con_10_ExpisMandatory(){
	  assertEquals("This value is required.", drv.conExpisMandatory());
  }
  
  @Test
  public void con_11_ExpVisible(){
	  assertEquals(false, drv.conExpVisible());
  }
  
  @Test
  public void con_12_Explabel01(){
	  assertEquals("The combe is hidden.", drv.conExplabel01());
  }
  
  @Test
  public void con_13_ExpDisabled(){
	  assertEquals("true", drv.conExpDisabled());
  }
  
  @Test
  public void con_14_ExpReadonly(){
	  assertEquals("true", drv.conExpReadonly());
  }
  
  @Test
  public void con_15_ExpCheckBox(){
	  assertEquals(true, drv.conExpCheckBox());
  }
  
  @Test
  public void con_16_ExpValue(){
	  assertEquals("Please select CHINA.", drv.conExpValue());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Combo_Condition.class);
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
