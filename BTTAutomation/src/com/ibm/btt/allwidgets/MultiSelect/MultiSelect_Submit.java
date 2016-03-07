package com.ibm.btt.allwidgets.MultiSelect;

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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.DateType;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class MultiSelect_Submit extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static MultiSelect_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, MultiSelect_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.MultiSelect_widget();
    drv.MultiSelect_submit();
  }

  @Test
  public void subResult_30_String(){
	  drv.subGeneralSubmit();
	  assertEquals("sample-1", drv.subResultString());
  }
  
  @Test
  public void subResult_31_Date(){
	  assertEquals(true, drv.subResultDate().contains("CST 2014"));
  }
  
  @Test
  public void subResult_32_Currency(){
	  assertEquals(true, drv.subResultCurrency().contains("USD:"));
  }
  
  @Test
  public void subResult_33_Number(){
	  assertEquals(true, drv.subResultNumber().contains("- 3"));
  }
  
  @Test
  public void subResult_34_Boolean(){
	  assertEquals("sample-false", drv.subResultBoolean());
  }
  
  @Test
  public void subResult_35_Duration(){
	  assertEquals("P2015Y8M8DT8H20M22S - 0", drv.subResultDuration());
  }
  
  @Test
  public void subResult_36_XMLGregorianCalendar(){
	  assertEquals("2014-07-18T13:20:20.020+00:08 - 1", drv.subResultXMLGregorianCalendar());
  }
  
  @Test
  public void subResult_37_Short(){
	  assertEquals("sample-11231", drv.subResultShort());
  }
  
  @Test
  public void subResult_38_Integer(){
	  assertEquals("sample-23", drv.subResultInteger());
  }
  
  @Test
  public void subResult_39_Long(){
	  assertEquals("sample-84322238006", drv.subResultLong());
  }
 
  @Test
  public void subResult_40_Float(){
	  assertEquals("sample-5.12", drv.subResultFloat());
  }
  
  @Test
  public void subResult_41_Double(){
	  assertEquals("sample-6.66", drv.subResultDouble());
  }
  
  @Test
  public void subResult_42_BigDecimal(){
	  assertEquals(true, drv.subResultBigDecimal().contains("sample-"));
  }
  
  @Test
  public void subResult_43_BigInteger(){
	  assertEquals("sample-153", drv.subResultBigInteger());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,MultiSelect_Submit.class);
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
