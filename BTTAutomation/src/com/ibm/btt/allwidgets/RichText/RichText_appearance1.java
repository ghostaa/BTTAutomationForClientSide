package com.ibm.btt.allwidgets.RichText;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class RichText_appearance1 extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static RichText_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, RichText_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.RichText_widget();
    drv.RichText_appearance1();
  }

  @Test
  public void Appearance1_1(){
	  assertEquals("null & null", drv.Appearance1_1());
  }
  
  @Test
  public void Appearance1_2(){
	  assertEquals("null & 200px", drv.Appearance1_2());
  }
  
  @Test
  public void Appearance1_3(){
	  assertEquals("200px & null", drv.Appearance1_3());
  }
  
  @Test
  public void Appearance1_4(){
	  assertEquals("200px & 200px", drv.Appearance1_4());
  }
  
  @Test
  public void Appearance1_5(){
	  assertEquals("50% & null", drv.Appearance1_5());
  }
  
  @Test
  public void Appearance1_6(){
	  assertEquals("50% & 200px", drv.Appearance1_6());
  }
  
  @Test
  public void Appearance1_7(){
	  assertEquals("100% & null", drv.Appearance1_7());
  }
  
  @Test
  public void Appearance1_8(){
	  assertEquals("100% & 200px", drv.Appearance1_8());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,RichText_appearance1.class);
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
