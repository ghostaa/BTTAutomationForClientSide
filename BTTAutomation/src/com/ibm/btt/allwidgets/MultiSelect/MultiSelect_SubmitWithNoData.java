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

public class MultiSelect_SubmitWithNoData extends AllWidgetsProjectMain_Class{
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
	  public void subResult_80_String(){
		  drv.withNoData_submit();
		  assertEquals("null", drv.subResultString());
	  }
	  
	  @Test
	  public void subResult_81_Date(){
		  assertEquals("null", drv.subResultDate());
	  }
	  
	  @Test
	  public void subResult_82_Currency(){
		  assertEquals("null", drv.subResultCurrency());
	  }
	  
	  @Test
	  public void subResult_83_Number(){
		  assertEquals("null", drv.subResultNumber());
	  }
	  
	  @Test
	  public void subResult_84_Boolean(){
		  assertEquals("null", drv.subResultBoolean());
	  }
	  
	  @Test
	  public void subResult_85_Duration(){
		  assertEquals("null", drv.subResultDuration());
	  }
	  
	  @Test
	  public void subResult_86_XMLGregorianCalendar(){
		  assertEquals("null", drv.subResultXMLGregorianCalendar());
	  }
	  
	  @Test
	  public void subResult_87_Short(){
		  assertEquals("null", drv.subResultShort());
	  }
	  
	  @Test
	  public void subResult_88_Integer(){
		  assertEquals("null", drv.subResultInteger());
	  }
	  
	  @Test
	  public void subResult_89_Long(){
		  assertEquals("null", drv.subResultLong());
	  }
	 
	  @Test
	  public void subResult_90_Float(){
		  assertEquals("null", drv.subResultFloat());
	  }
	  
	  @Test
	  public void subResult_91_Double(){
		  assertEquals("null", drv.subResultDouble());
	  }
	  
	  @Test
	  public void subResult_92_BigDecimal(){
		  assertEquals("null", drv.subResultBigDecimal());
	  }
	  
	  @Test
	  public void subResult_93_BigInteger(){
		  assertEquals("null", drv.subResultBigInteger());
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
