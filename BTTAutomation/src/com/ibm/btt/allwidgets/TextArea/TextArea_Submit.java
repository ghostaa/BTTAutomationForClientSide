package com.ibm.btt.allwidgets.TextArea;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextArea_Submit extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static TextArea_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, TextArea_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.TextArea_widget();
    drv.TextArea_submit();
  }

  @Test
  public void button_100_Status(){
	  assertEquals("true",drv.ButtonStatus());
  }
  
  @Test
  public void submit_101_All(){
	  drv.clearInitialValue();
	  drv.setNumericValue();
	  drv.setMandatory();
	  assertEquals("false",drv.ButtonStatus());
	  drv.SubmitButtonClick();
  }
  
  @Test
  public void string_102_Result(){
	  assertEquals("Test data",drv.textArea_StringResult());
  }
  
  @Test
  public void currency_103_Result(){
	  assertEquals("$9,355,070.01",drv.textArea_CurrencyResult());
  }
  
  @Test
  public void number_104_Result(){
	  assertEquals("183,062,862",drv.textArea_NumberResult());
  }
  
  @Test
  public void long_105_Result(){
	  assertEquals("315,161,000,238,006",drv.textArea_LongResult());
  }
  
  @Test
  public void byte_106_Result(){
	  assertEquals("98",drv.textArea_ByteResult());
  }
  
  @Test
  public void short_107_Result(){
	  assertEquals("-32,223",drv.textArea_ShortResult());
  }
  
  @Test
  public void integer_108_Result(){
	  assertEquals("66",drv.textArea_IntegerResult());
  }
  
  @Test
  public void bigDecimal_109_Result(){
	  assertEquals("862,085,646.964",drv.textArea_BigDecimalResult());
  }
  
  @Test
  public void float_110_Result(){
	  assertEquals("3.12",drv.textArea_FloatResult());
  }
  
  @Test
  public void double_111_Result(){
	  assertEquals("8.220",drv.textArea_DoubleResult());
  }
  
  @Test
  public void bigInteger_112_Result(){
	  assertEquals("123",drv.textArea_BigIntegerResult());
  }
  
  @Test
  public void mandatory_113_Result(){
	  assertEquals("hello",drv.textArea_MandatoryResult());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,TextArea_Submit.class);
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
