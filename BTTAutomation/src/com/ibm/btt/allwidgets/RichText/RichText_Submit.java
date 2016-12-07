package com.ibm.btt.allwidgets.RichText;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;

public class RichText_Submit extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static RichText_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, RichText_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.RichText_widget();
	drv.RichText_submit();
	drv.submit_data(driver);
	drv.submitButtonClick();
  }

 /* @Test
  public void aaaaaaa(){
	  driver.switchTo().frame(drv.getRichTextIdFrame());
	  String reString=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(drv.getStringFrame());
	  String string = drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  
	  driver.switchTo().frame(drv.getDateFrame());
	  String date = drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  
	  assertEquals("aaa", reString);
	  assertEquals("aaa", string);
	  assertEquals("2016-12-06", date);
  }*/
  @Test
  public void richtext_result_richtext_id_Submit(){
	  driver.switchTo().frame(drv.getRichTextIdFrame());
	  String resultRichId=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("aaa", resultRichId);
  }
  @Test
  public void richtext_result_string_Submit(){
	  driver.switchTo().frame(drv.getStringFrame());
	  String resultString=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("aaa", resultString);
  }
  @Test
  public void richtext_result_date_Submit(){
	  driver.switchTo().frame(drv.getDateFrame());
	  String resultDate=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("2016-12-06", resultDate);
  }
  @Test
  public void richtext_result_currency_Submit(){
	  driver.switchTo().frame(drv.getCurrencyFrame());
	  String resultCurrency=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("$987,123,654.11", resultCurrency);
  }
  @Test
  public void richtext_result_number_Submit(){
	  driver.switchTo().frame(drv.getNumberFrame());
	  String resultNumber=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("123,456",resultNumber);
  }
  @Test
  public void richtext_result_boolean_Submit(){
	  driver.switchTo().frame(drv.getBooleanFrame());
	  String resultBoolean=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("true", resultBoolean);
  }
  @Test
  public void richtext_result_duration_Submit(){
	  driver.switchTo().frame(drv.getDurationFrame());
	  String resultDuration=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("2345678", resultDuration);
  }
  @Test
  public void richtext_result_XMLGregorianCalendar_Submit(){
	  driver.switchTo().frame(drv.getXMLGregorianCalendarFrame());
	  String resultXMLGregorianCalendar=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("2016-12-11", resultXMLGregorianCalendar);
  }
  @Test
  public void richtext_result_byte_Submit(){
	  driver.switchTo().frame(drv.getByteFrame());
	  String resultByte=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("125", resultByte);
  }
  @Test
  public void richtext_result_short_Submit(){
	  driver.switchTo().frame(drv.getShortFrame());
	  String resultShort=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("1,234", resultShort);
  }
  @Test
  public void richtext_result_integer_Submit(){
	  driver.switchTo().frame(drv.getIntegerFrame());
	  String resultInteger=drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("324", resultInteger);
  }
  @Test
  public void richtext_result_long_Submit(){
	  driver.switchTo().frame(drv.getLongFrame());
	  String resultLong = drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("123,456,789", resultLong);
  }
  @Test
  public void richtext_result_float_Submit(){
	  driver.switchTo().frame(drv.getFloatFrame());
	  String resultFloat = drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("123,456.78", resultFloat);
  }
  @Test
  public void richtext_result_double_Submit(){
	  driver.switchTo().frame(drv.getDoubleFrame());
	  String resultDouble = drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("123,456,789.012", resultDouble);
  }
 
  @Test
  public void richtext_result_bigInteger_Submit(){
	  driver.switchTo().frame(drv.getBigIntegerFrame());
	  String resultBigInteger= drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("987,654,321", resultBigInteger);
  }
  @Test
  public void richtext_result_bigDecimalFrame_Submit(){
	  driver.switchTo().frame(drv.getBigDecimalFrame());
	  String resultBigDecimal= drv.get_result_in_iframe();
	  driver.switchTo().defaultContent();
	  assertEquals("5,555.667", resultBigDecimal);
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,RichText_Submit.class);
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
