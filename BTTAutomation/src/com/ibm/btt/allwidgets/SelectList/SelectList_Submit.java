package com.ibm.btt.allwidgets.SelectList;

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
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.DateType;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;

public class SelectList_Submit extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static SelectList_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, SelectList_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.SelectList_widget();
    drv.SelectList_submit();
  }
//form
  @Test
  public void subResultString(){
	  drv.Submit();
	  assertEquals("Account0", drv.subResultString());
  }
  
  @Test
  public void subResultDate(){
	  boolean b = DateType.Date(drv.subResultDate());
	  assertEquals(true, b);
  }
  
  @Test
  public void subResultCurrency(){
	  boolean b = DateType.Currency(drv.subResultCurrency());
	  assertEquals(true, b);
  }
  
  @Test
  public void subResultNumber(){
	  boolean b = DateType.Number(drv.subResultNumber());
	  assertEquals(true, b);
  }
  
  @Test
  public void subResultBoolean(){
	  boolean b = DateType.Boolean(drv.subResultBoolean());
	  assertEquals(true, b);
  }
  
  @Test
  public void subResultDuration(){
	  boolean b = DateType.Duration(drv.subResultDuration());
	  assertEquals(true, b);
  }
  
  @Test
  public void subResultXMLGregorianCalendar(){
	  assertEquals("2012-07-18", drv.subResultXMLGregorianCalendar());
  }
  
  @Test
  public void subResultByte(){
	  assertEquals("98", drv.subResultByte());
  }
  
  @Test
  public void subResultShort(){
	  assertEquals("-12,321", drv.subResultShort());
  }
  
  @Test
  public void subResultInteger(){
	  boolean b = DateType.Integer(drv.subResultInteger());
	  assertEquals(true, b);
  }
  
  @Test
  public void subResultLong(){
	  boolean b = DateType.Integer(drv.subResultLong());
	  assertEquals(true, b);
  }
 
  @Test
  public void subResultFloat(){
	  assertEquals("3.12", drv.subResultFloat());
  }
  
  @Test
  public void subResultDouble(){
	  assertEquals("8.220", drv.subResultDouble());
  }
  
  @Test
  public void subResultBigInteger(){
	  assertEquals("123", drv.subResultBigInteger());
  }
  
  @Test
  public void subResultBigDecimal(){
	  boolean b = DateType.BigDecimal(drv.subResultBigDecimal());
	  assertEquals(true, b);
	  drv.subResultReturn();
	  drv.SelectList_submit();
  }
  
// form01
  @Test
  public void subButtonDisableT(){
	  assertEquals("true", drv.subButtonDisableT());
  }
  
  @Test
  public void subFormVal(){
	  assertEquals("Please select Account2.", drv.subFormVal());
  }
  
  @Test
  public void subButtonDisableF(){
	  assertEquals("false", drv.subButtonDisableF());
  }
  
  @Test
  public void subForm01Submit(){
	  assertEquals("Account2", drv.subForm01Submit());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,SelectList_Submit.class);
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
