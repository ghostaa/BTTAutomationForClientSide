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
public class Radio_submitWithNoData extends AllWidgetsProjectMain_Class{
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
	  public void submit_92_Status(){
		  assertEquals(true, drv.subButton());
	  }
	  
	  @Test
	  public void withNo_93_Data(){
		  drv.submit();
		  drv.NodataClick();
	  }
	  
	  @Test
	  public void stringData(){
		  assertEquals(false, drv.subResultString1());
		  assertEquals(false, drv.subResultString2());
		  assertEquals("Test data", drv.subResultText1());
	  }
	  @Test
	  public void subResultDate(){
		  assertEquals(false, drv.subResultDate1());
		  assertEquals(false, drv.subResultDate2());
		  //assertEquals("2014-02-17", drv.subResultText2()); - data is random
	  }
	  
	  @Test
	  public void subResultCurrency(){
		  assertEquals(false, drv.subResultCurrency1());
		  assertEquals(false, drv.subResultCurrency2());
		  //assertEquals("$10,594,279.00", drv.subResultText3()); - currency is random
	  }
	  
	  @Test
	  public void subResultNumber(){
		  assertEquals(false, drv.subResultNumber1());
		  assertEquals(false, drv.subResultNumber2());
		 // assertEquals("793,452,098", drv.subResultText4()); - number is random
	  }
	  
	 /* @Test
	  public void subResultBoolean(){  //boolean is random
		  assertEquals(false, drv.subResultBoolean1());
		  assertEquals(true, drv.subResultBoolean2());
		  assertEquals("true", drv.subResultText5());
	  }*/
	  
	  @Test
	  public void subResultByte(){
		  assertEquals(false, drv.subResultByte1());
		  assertEquals(false, drv.subResultByte2());
		  assertEquals("98", drv.subResultText6());
	  }
	  
	  @Test
	  public void subResultShort(){
		  assertEquals(false, drv.subResultShort1());
		  assertEquals(false, drv.subResultShort2());
		  assertEquals("-32,223", drv.subResultText7());
	  }
	  
	  @Test
	  public void subResultInteger(){
		  assertEquals(false, drv.subResultInteger1());
		  assertEquals(false, drv.subResultInteger2());
		  assertEquals("66", drv.subResultText8());
	  }
	  
	  @Test
	  public void subResultLong(){
		  assertEquals(false, drv.subResultLong1());
		  assertEquals(false, drv.subResultLong2());
		  assertEquals("315,161,000,238,006", drv.subResultText9());
	  }
	  
	  @Test
	  public void subResultFloat(){
		  assertEquals(false, drv.subResultFloat1());
		  assertEquals(false, drv.subResultFloat2());
		  assertEquals("3.12", drv.subResultText10());
	  }
	  
	  @Test
	  public void subResultDouble(){
		  assertEquals(false, drv.subResultDouble1());
		  assertEquals(false, drv.subResultDouble2());
		  assertEquals("8.220", drv.subResultText11());
	  }
	  
	  @Test
	  public void subResultBigInteger(){
		  assertEquals(false, drv.subResultBigInteger1());
		  assertEquals(false, drv.subResultBigInteger2());
		  assertEquals("123", drv.subResultText12());
	  }
	  
	  @Test
	  public void subResultBigDecimal(){
		  assertEquals(false, drv.subResultBigDecimal1());
		  assertEquals(false, drv.subResultBigDecimal2());
		 // assertEquals("868,672,013.059", drv.subResultText13()); - bigDecimal is random
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
