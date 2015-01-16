package com.ibm.btt.allwidgets.SelectList;

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
import com.ibm.btt.util.*;

public class SelectList_CSS extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static SelectList_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {

	Main_Class.setUp();
    drv=PageFactory.initElements(driver, SelectList_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.SelectList_widget();
    drv.SelectList_css();

  }
  
  @Test
  public void css_check1(){
	  assertEquals(1,drv.css_style1());
  }
  
  @Test
  public void css_check2(){
	  assertEquals(2,drv.css_style2());
  }
  
  @Test
  public void css_check3(){
	  assertEquals(3,drv.css_style3());
  }
  
  @Test
  public void css_check4(){
	  assertEquals(1,drv.css_style4());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,SelectList_CSS.class);
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