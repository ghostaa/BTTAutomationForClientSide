package com.ibm.btt.allwidgets.TextArea;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;

public class TextArea_SubmitWithNoData extends Main_Class{
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
	  public void NoData_50_Button() throws Exception{
		  drv.setMandatoryFalse();
		  drv.SubmitWithNoDataButtonClick();
	  }
	  
	  @Test
	  public void NoData_51_Result(){
		  assertEquals("",drv.textArea_NonMandatoryResult());
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
