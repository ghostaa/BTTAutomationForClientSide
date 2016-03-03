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

public class CheckBox_submitWithoutValidation extends AllWidgetsProjectMain_Class{
	 private boolean acceptNextAlert = true;
	  private static StringBuffer verificationErrors = new StringBuffer();
	  private static CheckBox_PageObject drv;
	  

	  @BeforeClass
	  public static void setUp() throws Exception {
	    /*driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(baseUrl);*/
		AllWidgetsProjectMain_Class.setUp();
	    drv=PageFactory.initElements(driver, CheckBox_PageObject.class);
	//  driver.navigate().to(Main_Class.baseUrl);
	    drv.Establish();
	    drv.BTT8200_tab();
	    drv.CheckBox_widget();
	    drv.CheckBox_submmit();
	  }

	  @Test
	  public void CheckBox_150_submit_getTooltip() throws InterruptedException{
		  assertEquals("Please check the String checkBox", drv.CheckBox_submit_getTooltip());
	  }
	  
	  @Test
	  public void CheckBox_160_submit_clickButton() throws InterruptedException{
		  drv.CheckBox_submit_data();
		  drv.CheckBox_submit_without_validation_click();
		  this.waitUntilLoadElement(10, "CheckBox_Result_link");
	  }
	  
	  @Test
	  public void CheckBox_Result_Boolean(){
		  assertEquals(false,drv.CheckBox_Result_Boolean());
		  assertEquals("false",drv.CheckBox_Result_Boolean_label());
	  }
	  

	  @Test
	  public void CheckBox_Result_Date(){
		  assertEquals("true", drv.CheckBox_Result_Date());
		  assertEquals("2014-08-10", drv.CheckBox_Result_Date_label());
	  }
	  
	  @Test
	  public void CheckBox_Result_Currency(){
		  assertEquals("true",drv.CheckBox_Result_Currency());
		  assertEquals("$12.00",drv.CheckBox_Result_Currency_label());
	  }
	  
	  @Test
	  public void CheckBox_Result_Long(){
		  assertEquals("true",drv.CheckBox_Result_Long());
		  assertEquals("18",drv.CheckBox_Result_Long_label());
	  }
	  
	  @Test
	  public void CheckBox_Result_Float(){
		  assertEquals("true",drv.CheckBox_Result_Float());
		  assertEquals("1.20",drv.CheckBox_Result_Float_label());
	  }
	  
	  @Test
	  public void CheckBox_Result_BigDecimal(){
		  assertEquals("true",drv.CheckBox_Result_BigDecimal());
		  assertEquals("1.200",drv.CheckBox_Result_BigDecimal_label());
	  }

	  @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,CheckBox_submit.class);
		driver.quit();
//		driver.navigate().refresh();
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
