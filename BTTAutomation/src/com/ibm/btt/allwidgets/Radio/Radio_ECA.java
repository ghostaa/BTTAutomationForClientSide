package com.ibm.btt.allwidgets.Radio;

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

public class Radio_ECA extends AllWidgetsProjectMain_Class{

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
	    drv.Radio_ECA();
	  }

	  @Test
	  public void Radio_ECA_radio_onClick(){
		  assertEquals(2, drv.Radio_ECA_radio_onClick());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_Expression(){
		  assertEquals(1,drv.Radio_ECA_radio_Expression());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onKeyDown(){
		  assertEquals("radio_onClick", drv.Radio_ECA_radio_onKeyDown());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onKeypress(){
		  assertEquals(false, drv.Radio_ECA_radio_onKeypress());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onKeyUp(){
		  assertEquals(true, drv.Radio_ECA_radio_onKeyUp());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onMouseDown(){
		  assertEquals("true", drv.Radio_ECA_radio_onMouseDown());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onMouseUp(){
		  assertEquals("true", drv.Radio_ECA_radio_onMouseUp());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onMouseEnter(){
		  assertEquals("hi,radio", drv.Radio_ECA_radio_onMouseEnter());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onMouseLeave(){
		  assertEquals(1, drv.Radio_ECA_radio_onMouseLeave());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onMouseMove(){
		  assertEquals("TextChangeed", drv.Radio_ECA_radio_onMouseMove());
	  }
	  
	  @Test
	  public void Radio_ECA_radio_onChange(){
		  assertEquals("true", drv.Radio_ECA_radio_onChange());
	  }

	  @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Radio_Event.class);
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
