package com.ibm.btt.allwidgets.MultiSelect;

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
import com.ibm.btt.util.Tools;

public class MultiSelect_SubmitWithoutValidation extends AllWidgetsProjectMain_Class{
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
	  public void subResult_120_String(){
		  drv.multi_submit();
		  assertEquals("sample-1", drv.ResultString1());
		  assertEquals("Selected is true", drv.ResultString2());
	  }
	  
	  @Test
	  public void subResult_121_Date(){
		  assertEquals("Selected is true", drv.ResultDate1());
		  assertEquals(true, drv.ResultDate2().contains("CST 2014"));
	  }
	  
	  @Test
	  public void subResult_122_Currency(){
		  assertEquals(true, drv.ResultCurrency1().contains("USD:"));
		  assertEquals(true, drv.ResultCurrency1().contains("selected"));
		  assertEquals(true, drv.ResultCurrency2().contains("USD:"));
	  }
	  
	  @Test
	  public void subResult_123_Number(){
		  assertEquals(true, drv.ResultNumber1().contains("selected"));
		  assertEquals(true, drv.ResultNumber2().contains("- 3"));
	  }
	  
	  @Test
	  public void subResult_124_Boolean(){
		  assertEquals("Selected is true", drv.ResultBoolean1());
		  assertEquals("sample-false", drv.ResultBoolean2());
	  }
	  
	  @Test
	  public void subResult_125_Duration(){
		  assertEquals("P2015Y8M8DT8H20M22S - 0", drv.ResultDuration1());
		  assertEquals("P2015Y6M6DT6H20M22S selected", drv.ResultDuration2());
	  }
	  
	  @Test
	  public void subResult_126_XMLGregorianCalendar(){
		  assertEquals("2014-07-18T13:20:20.020+00:08 - 1", drv.ResultXMLGregorianCalendar1());
		  assertEquals("2014-07-18T13:20:20.020+00:08 selected", drv.ResultXMLGregorianCalendar2());
	  }
	  
	  @Test
	  public void subResult_127_Short(){
		  assertEquals("Selected is true", drv.ResultShort1());
		  assertEquals("sample-11231", drv.ResultShort2());
	  }
	  
	  @Test
	  public void subResult_128_Integer(){
		  assertEquals("Selected is true", drv.ResultInteger1());
		  assertEquals("sample-23", drv.ResultInteger2());
	  }
	  
	  @Test
	  public void subResult_129_Long(){
		  assertEquals("Selected is true", drv.ResultLong1());
		  assertEquals("sample-84322238006", drv.ResultLong2());
	  }
	 
	  @Test
	  public void subResult_130_Float(){
		  assertEquals("Selected is true", drv.ResultFloat1());
		  assertEquals("sample-5.12", drv.ResultFloat2());
	  }
	  
	  @Test
	  public void subResult_131_Double(){
		  assertEquals("Selected is true", drv.ResultDouble1());
		  assertEquals("sample-6.66", drv.ResultDouble2());
	  }
	  
	  @Test
	  public void subResult_132_BigDecimal(){
		  assertEquals("Selected is true", drv.ResultBigDecimal1());
		  assertEquals(true, drv.ResultBigDecimal2().contains("sample-"));
	  }
	  
	  @Test
	  public void subResult_133_BigInteger(){
		  assertEquals("Selected is true", drv.ResultBigInteger1());
		  assertEquals("sample-153", drv.ResultBigInteger2());
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
