package com.ibm.btt.allwidgets.CheckBox;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Tools;

public class CheckBox_submitWithNoData extends AllWidgetsProjectMain_Class{
	  private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  private static CheckBox_PageObject drv;
	  

	  @BeforeClass
	  public static void setUp() throws Exception {
		AllWidgetsProjectMain_Class.setUp();
	    drv=PageFactory.initElements(driver, CheckBox_PageObject.class);
	    drv.Establish();
	    drv.BTT8200_tab();
	    drv.CheckBox_widget();
	    drv.CheckBox_submmit();
	  }

	  @Test
	  public void CheckBox_130_submit_getTooltip() throws InterruptedException{
		  assertEquals("Please check the String checkBox", drv.CheckBox_submit_getTooltip());
	  }

	  @Test
	  public void CheckBox_140_submit_clickButton() throws InterruptedException{
		  drv.CheckBox_submit_data();
		  drv.CheckBox_submit_nodata_click();
		  this.waitUntilLoadElement(10, "CheckBox_Result_link");
	  }
 
	  @Test
	  public void CheckBox_Result_Date(){
		  assertEquals("false", drv.CheckBox_Result_Data_Uncheck());
		//  assertEquals("2014-09-23", drv.CheckBox_Result_Date_label());// date is random, this code is not necessary
	  }
	  
	  @Test
	  public void CheckBox_Result_Currency(){
		  assertEquals("false",drv.CheckBox_Result_Currency_Uncheck());
		//  assertEquals("$31,099,770.00",drv.CheckBox_Result_Currency_label());// currency is random, this code is not necessary
	  }
	  
	  @Test
	  public void CheckBox_Result_Long(){
		  assertEquals("false",drv.CheckBox_Result_Long_Uncheck());
		  assertEquals("315,161,000,238,006",drv.CheckBox_Result_Long_label());
	  }
	  
	  @Test
	  public void CheckBox_Result_Float(){
		  assertEquals("false",drv.CheckBox_Result_Float_Uncheck());
		  assertEquals("3.12",drv.CheckBox_Result_Float_label());
	  }
	  
	  @Test
	  public void CheckBox_Result_BigDecimal(){
		  assertEquals("false",drv.CheckBox_Result_BigDecimal_Uncheck());
		//  assertEquals("499,173,389.432",drv.CheckBox_Result_BigDecimal_label());// bigDecimal is random, this code is not necessary
	  }

	  @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,CheckBox_submit.class);
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
