package com.ibm.btt.allwidgets.Radio;

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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Radio_submit extends AllWidgetsProjectMain_Class{
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Radio_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {

	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Radio_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Radio_widget();
    drv.Radio_submmit();
    AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "Radio_submit_radio13_copy");
  }

  @Test
  public void subTooltipVerify(){
	  assertEquals("Please check the Radio_String radio.", drv.subTooltipVerify());
  }
  
  @Test
  public void subTooltipDisappear() throws InterruptedException{
	  assertEquals(false, drv.subTooltipDisappear());
  }
  
  @Test
  public void subButton(){
	  assertEquals(true, drv.subButton());
  }
  
  @Test
  public void subResultString(){
	  drv.submit();
	  AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "ShowRadio_result_radio13_copy");
	  assertEquals(true, drv.subResultString());
	  assertEquals("String_Data2", drv.subResultText1());
  }
  
  @Test
  public void subResultDate(){
	  assertEquals(true, drv.subResultDate());
	  assertEquals("2014-10-08", drv.subResultText2());
  }
  
  @Test
  public void subResultCurrency(){
	  assertEquals(true, drv.subResultCurrency());
	  assertEquals("$12.00", drv.subResultText3());
  }
  
  @Test
  public void subResultNumber(){
	  assertEquals(true, drv.subResultNumber());
	  assertEquals("1", drv.subResultText4());
  }
  
  @Test
  public void subResultBoolean(){
	  assertEquals(true, drv.subResultBoolean());
	  assertEquals("true", drv.subResultText5());
  }
  
  @Test
  public void subResultByte(){
	  assertEquals(true, drv.subResultByte());
	  assertEquals("3", drv.subResultText6());
  }
  
  @Test
  public void subResultShort(){
	  assertEquals(true, drv.subResultShort());
	  assertEquals("5", drv.subResultText7());
  }
  
  @Test
  public void subResultInteger(){
	  assertEquals(true, drv.subResultInteger());
	  assertEquals("7", drv.subResultText8());
  }
  
  @Test
  public void subResultLong(){
	  assertEquals(true, drv.subResultLong());
	  assertEquals("12", drv.subResultText9());
  }
  
  @Test
  public void subResultFloat(){
	  assertEquals(true, drv.subResultFloat());
	  assertEquals("1.20", drv.subResultText10());
  }
  
  @Test
  public void subResultDouble(){
	  assertEquals(true, drv.subResultDouble());
	  assertEquals("14.000", drv.subResultText11());
  }
  
  @Test
  public void subResultBigInteger(){
	  assertEquals(true, drv.subResultBigInteger());
	  assertEquals("1,000", drv.subResultText12());
  }
  
  @Test
  public void subResultBigDecimal(){
	  assertEquals(true, drv.subResultBigDecimal());
	  assertEquals("1.200", drv.subResultText13());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Radio_submit.class);
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
