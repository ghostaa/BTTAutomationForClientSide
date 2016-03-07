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

public class MultiSelect_Validation extends AllWidgetsProjectMain_Class{
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
	  public void Number1_60_Enabled(){
		  drv.Click_ValidationTab();
		  assertEquals("true", drv.button_status());
	  }
	  
	  @Test
	  public void Number1_61_Disabled() throws Exception{ 
		  drv.Click_EnableButton();
		  drv.Click_DisableButton();
		  assertEquals("multiSelect_copy12_copy.disabled != \"true\"", drv.alter_tip());
		  assertEquals("true", drv.number1_status());
		  assertEquals("true", drv.button_status());
	  }
	  
	  @Test
	  public void Number1_62_enabled(){
		  drv.Click_EnableButton();
		  assertEquals("false", drv.number1_status());
		  assertEquals("false", drv.button_status());
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
