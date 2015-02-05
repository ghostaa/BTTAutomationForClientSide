package com.ibm.btt.allwidgets.Panel;


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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.NLS;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
import com.ibm.btt.allwidgets.Text.Text_Condition;

public class Panel_Appearance1 extends Main_Class{
  /*private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  private static Panel_PageObject drv;

  @BeforeClass
  public static void setUp() throws Exception {
	/*driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseUrl);*/
	Main_Class.setUp();
	drv=PageFactory.initElements(driver, Panel_PageObject.class);
	drv.Establish();
    drv.BTT8200_tab();
    drv.Panel_widget();
    drv.panel_appearance1();
  }

  @Test
  public void Appearance1_1(){
	  assertEquals("", drv.Appearance1_1());
  }
  
  @Test
  public void Appearance1_2(){
	  assertEquals("height: 150px;", drv.Appearance1_2());
  }
  
  @Test
  public void Appearance1_3(){
	  assertEquals("height: 50%;", drv.Appearance1_3());
  }
  
  @Test
  public void Appearance1_4(){
	  assertEquals("height: 100%;", drv.Appearance1_4());
  }
  
  @Test
  public void Appearance1_5(){
	  assertEquals("width: 150px;", drv.Appearance1_5());
  }
  
  @Test
  public void Appearance1_6(){
	  assertEquals("width: 150px; height: 150px;", drv.Appearance1_6());
  }
  
  @Test
  public void Appearance1_7(){
	  assertEquals("width: 150px; height: 50%;", drv.Appearance1_7());
  }
  
  @Test
  public void Appearance1_8(){
	  assertEquals("width: 150px; height: 100%;", drv.Appearance1_8());
  }
  
  @Test
  public void Appearance1_9(){
	  assertEquals("width: 50%;", drv.Appearance1_9());
  }
  
  @Test
  public void Appearance1_10(){
	  assertEquals("width: 50%; height: 150px;", drv.Appearance1_10());
  }
  
  @Test
  public void Appearance1_11(){
	  assertEquals("width: 50%; height: 50%;", drv.Appearance1_11());
  }
  
  @Test
  public void Appearance1_12(){
	  assertEquals("width: 50%; height: 100%;", drv.Appearance1_12());
  }
  
  @Test
  public void Appearance1_13(){
	  assertEquals("width: 100%;", drv.Appearance1_13());
  }
  
  @Test
  public void Appearance1_14(){
	  assertEquals("width: 100%; height: 150px;", drv.Appearance1_14());
  }
  
  @Test
  public void Appearance1_15(){
	  assertEquals("width: 100%; height: 50%;", drv.Appearance1_15());
  }
  
  @Test
  public void Appearance1_16(){
	  assertEquals("width: 100%; height: 100%;", drv.Appearance1_16());
  }

  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Panel_Appearance1.class);
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
