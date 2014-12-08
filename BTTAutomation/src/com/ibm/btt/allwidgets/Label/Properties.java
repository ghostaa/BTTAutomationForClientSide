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
import com.ibm.btt.util.NLS;
import com.ibm.btt.util.Tools;

public class Properties {
  private static WebDriver driver;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  private static Label_PageObject drv;

  @BeforeClass
  public static void setUp() throws Exception {
	driver = new FirefoxDriver();
	baseUrl = "http://localhost:8080/InternetBankTestWeb/" ;//(http://localhost:8080/InternetBankTestWeb/%27);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseUrl);
	drv=PageFactory.initElements(driver, Label_PageObject.class);
	drv.Establish();
    drv.BTT8200_tab();
    drv.Label_widget();
    drv.label_properties();
    Thread.sleep(2000);
    Tools.snapshot((TakesScreenshot)driver,"SnapShot\\Label\\Properties.jpg");
  }

  @Test
  public void label_String() throws InterruptedException{
	  assertEquals("Test data", drv.label_String_getText());
  }
 //Need to add datatype class in util 
  @Test
  public void label_Date(){
	  boolean b = DateType.Date(drv.label_Date_getText());
	  assertEquals(true, b);
  }

  @Test
  public void label_Currency(){
	  boolean b = DateType.Currency(drv.label_Currency_getText());
	  assertEquals(true, b);
  }

  @Test
  public void label_Number(){
	  boolean b = DateType.Number(drv.label_Number_getText());
	  assertEquals(true, b);
	  }

  @Test
  public void label_Duration(){
	  boolean b = DateType.Duration(drv.label_Duration_getText());
	  assertEquals(true, b);
  }

  @Test
  public void label_XMLGregorianCalendar(){
	  assertEquals("2014-07-18", drv.label_XMLGregorianCalendar_getText());
  }

  @Test
  public void label_Byte(){
	  assertEquals("98", drv.label_Byte_getText());
  }

  @Test
  public void label_Short(){
	  assertEquals("-32,223", drv.label_Short_getText());
  }

  @Test
  public void label_Integer(){
	  assertEquals("66", drv.label_Integer_getText());
  }

  @Test
  public void label_Long(){
	  assertEquals("315,161,000,238,006", drv.label_Long_getText());
  }

  @Test
  public void label_Float(){
	  assertEquals("3.12", drv.label_Float_getText());
  }

  @Test
  public void label_Double(){
	  assertEquals("8.220", drv.label_Double_getText());
  }

  @Test
  public void label_BigInteger(){
	  assertEquals("123", drv.label_BigInteger_getText());
  }

  @Test
  public void label_visible(){
	  assertEquals(true, drv.label_visible_isDisplay());
  }

  @Test
  public void label_hidden(){
	  assertEquals(false, drv.label_hidden_isDisplay());
  }

  @Test
  public void label_gone(){
	  assertEquals("display: none; visibility: inherit;", drv.label_gone_GetAttribute());
  }

  @Test
  public void label_filedReference(){
	  drv.label_filedReference_click();
	  assertEquals(true, drv.label_filedReference_radio());
  }

  @Test
  public void label_NLS(){
	  boolean b = (new NLS()).NLS_lang(drv.label_NLS());
	  assertEquals(true,b);
  }

  @AfterClass
  public static void tearDown() throws Exception {
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
