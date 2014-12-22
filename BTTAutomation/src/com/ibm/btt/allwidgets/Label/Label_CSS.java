package com.ibm.btt.allwidgets.Label;

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
import com.ibm.btt.allwidgets.Text.Text_Properties;
import com.ibm.btt.util.*;

public class Label_CSS extends Main_Class{
  /*private static WebDriver driver;
  private static String baseUrl = Main_Class.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Label_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Label_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Label_widget();
    drv.label_CSS();
  }
  
  @Test
  public void cssStyle1(){
	  assertEquals(1,drv.cssStyle1());
  }
  
  @Test
  public void cssStyle2(){
	  assertEquals(2,drv.cssStyle2());
  }
  
  @Test
  public void cssStyle3(){
	  assertEquals(3,drv.cssStyle3());
  }
  
  @Test
  public void cssStyle4(){
	  assertEquals(1,drv.cssStyle4());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Label_CSS.class);
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