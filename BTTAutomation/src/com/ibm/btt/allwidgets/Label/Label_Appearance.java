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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.NLS;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
import com.ibm.btt.allwidgets.Text.Text_Condition;

public class Label_Appearance extends Main_Class{
  /*private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
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
    drv.label_appearance();
  }

  @Test
  public void proString(){
	  assertEquals("Test data", drv.proString());
  }

  @Test
  public void proDate(){
	  boolean b = DateType.Date(drv.proDate());
	  assertEquals(true, b);
  }

  @Test
  public void proCurrency(){
	  boolean b = DateType.Currency(drv.proCurrency());
	  assertEquals(true, b);
  }

  @Test
  public void proNumber(){
	  boolean b = DateType.Number(drv.proNumber());
	  assertEquals(true, b);
	  }

  @Test
  public void proDuration(){
	  boolean b = DateType.Duration(drv.proDuration());
	  assertEquals(true, b);
  }
  
  @Test
  public void proBoolean(){
	  assertEquals(true, drv.proBoolean());
  }

  @Test
  public void proXMLGregorianCalendar(){
	  assertEquals("2014-07-18", drv.proXMLGregorianCalendar());
  }

  @Test
  public void proByte(){
	  assertEquals("98", drv.proByte());
  }

  @Test
  public void proShort(){
	  assertEquals("-32,223", drv.proShort());
  }

  @Test
  public void proInteger(){
	  assertEquals("66", drv.proInteger());
  }

  @Test
  public void proLong(){
	  assertEquals("315,161,000,238,006", drv.proLong());
  }

  @Test
  public void proFloat(){
	  assertEquals("3.12", drv.proFloat());
  }

  @Test
  public void proDouble(){
	  assertEquals("8.220", drv.proDouble());
  }

  @Test
  public void proBigInteger(){
	  assertEquals("123", drv.proBigInteger());
  }

  @Test
  public void proVisible(){
	  assertEquals(true, drv.proVisible());
  }

  @Test
  public void proHidden(){
	  assertEquals(false, drv.proHidden());
  }

  @Test
  public void proGone(){
	  assertEquals("display: none; visibility: inherit;", drv.proGone());
  }

  @Test
  public void proFiledReference(){
	  drv.proFiledReference();
	  assertEquals(true, drv.proFiledReferenceRadio());
  }

  @Test
  public void proNLS(){
	  boolean b = (new NLS()).NLS_lang(drv.proNLS());
	  assertEquals(true,b);
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Label_Appearance.class);
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
