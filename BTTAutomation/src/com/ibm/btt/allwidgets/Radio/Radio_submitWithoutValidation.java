package com.ibm.btt.allwidgets.Radio;

import static org.junit.Assert.assertEquals;
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
import com.ibm.btt.util.Tools;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Radio_submitWithoutValidation extends AllWidgetsProjectMain_Class{
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
	  public void submit_90_Status(){
		  assertEquals(true, drv.subButton());
	  }
	  
	  @Test
	  public void without_91_Validation(){
		  drv.submit();
		  drv.selectString_Data();
	  }
	  
	  @Test
	  public void stringData() throws Exception{
		  assertEquals(true, drv.subResultString1());
		  assertEquals("String_Data_value", drv.subResultText1());
		  Thread.sleep(3000);
	  }
	  
	  @Test
	  public void subResultDate(){
		  assertEquals(true, drv.subResultDate1());
		  assertEquals("2014-10-08", drv.subResultText2());
	  }
	  
	  @Test
	  public void subResultCurrency(){
		  assertEquals(true, drv.subResultCurrency1());
		  assertEquals("$12.00", drv.subResultText3());
	  }
	  
	  @Test
	  public void subResultNumber(){
		  assertEquals(true, drv.subResultNumber1());
		  assertEquals("1", drv.subResultText4());
	  }
	  
	  @Test
	  public void subResultBoolean(){
		  assertEquals(true, drv.subResultBoolean1());
		  assertEquals("true", drv.subResultText5());
	  }
	  
	  @Test
	  public void subResultByte(){
		  assertEquals(true, drv.subResultByte1());
		  assertEquals("3", drv.subResultText6());
	  }
	  
	  @Test
	  public void subResultShort(){
		  assertEquals(true, drv.subResultShort1());
		  assertEquals("5", drv.subResultText7());
	  }
	  
	  @Test
	  public void subResultInteger(){
		  assertEquals(true, drv.subResultInteger1());
		  assertEquals("7", drv.subResultText8());
	  }
	  
	  @Test
	  public void subResultLong(){
		  assertEquals(true, drv.subResultLong1());
		  assertEquals("12", drv.subResultText9());
	  }
	  
	  @Test
	  public void subResultFloat(){
		  assertEquals(true, drv.subResultFloat1());
		  assertEquals("1.20", drv.subResultText10());
	  }
	  
	  @Test
	  public void subResultDouble(){
		  assertEquals(true, drv.subResultDouble1());
		  assertEquals("14.000", drv.subResultText11());
	  }
	  
	  @Test
	  public void subResultBigInteger(){
		  assertEquals(true, drv.subResultBigInteger1());
		  assertEquals("1,000", drv.subResultText12());
	  }
	  
	  @Test
	  public void subResultBigDecimal(){
		  assertEquals(true, drv.subResultBigDecimal1());
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
