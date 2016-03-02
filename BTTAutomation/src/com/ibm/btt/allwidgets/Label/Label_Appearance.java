package com.ibm.btt.allwidgets.Label;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.DateType;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.NLS;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
import com.ibm.btt.allwidgets.Text.Text_Condition;

public class Label_Appearance extends AllWidgetsProjectMain_Class{
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  private static Label_PageObject drv;

  @BeforeClass
  public static void setUp() throws Exception {
	AllWidgetsProjectMain_Class.setUp();
	drv=PageFactory.initElements(driver, Label_PageObject.class);
	drv.Establish();
    drv.BTT8200_tab();
    drv.Label_widget();
    drv.label_appearance();
  }

  @Test
  public void appearance1(){
	  assertEquals(true, drv.appearance1());
  }
  
  @Test
  public void appearance2(){
	  assertEquals(1, drv.appearance2());
  }
  
  @Test
  public void appearance3(){
	  assertEquals(1, drv.appearance3());
  }
  
  @Test
  public void appearance4(){
	  assertEquals(1, drv.appearance4());
  }
  
  @Test
  public void appearance5(){
	  assertEquals(1, drv.appearance5());
  }
  
  @Test
  public void appearance6(){
	  assertEquals(2, drv.appearance6());
  }
  
  @Test
  public void appearance7(){
	  assertEquals(2, drv.appearance7());
  }
  
  @Test
  public void appearance8(){
	  assertEquals(2, drv.appearance8());
  }
  
  @Test
  public void appearance9(){
	  assertEquals(1, drv.appearance9());
  }
  
  @Test
  public void appearance10(){
	  assertEquals(2, drv.appearance10());
  }
  
  @Test
  public void appearance11(){
	  assertEquals(2, drv.appearance11());
  }
  
  @Test
  public void appearance12(){
	  assertEquals(2, drv.appearance12());
  }
  
  @Test
  public void appearance13(){
	  assertEquals(1, drv.appearance13());
  }
  
  @Test
  public void appearance14(){
	  assertEquals(2, drv.appearance14());
  }
  
  @Test
  public void appearance15(){
	  assertEquals(2, drv.appearance15());
  }
  
  @Test
  public void appearance16(){
	  assertEquals(2, drv.appearance16());
  }

  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Label_Appearance.class);
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
