package com.ibm.btt.allwidgets.CheckBox;

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

public class CheckBox_ECA extends AllWidgetsProjectMain_Class{
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
	    drv.CheckBox_ECA();
	  }
	  
	  @Test
	  public void CheckBox_ECA_checkBox_focus(){
		  assertEquals(2, drv.CheckBox_ECA_checkBox_focus());
	  }
	  
	  @Test
	  public void CheckBox_ECA_CheckBox_styleClass(){
		  assertEquals(1, drv.CheckBox_ECA_CheckBox_styleClass());
	  }
	  
	  @Test
	  public void CheckBox_ECA_CheckBox_Text(){
		  assertEquals("I Chenged", drv.CheckBox_ECA_CheckBox_Text());
	  }
	  
	  @Test
	  public void CheckBox_ECA_CheckBox_visible(){
		  assertEquals("visibility: hidden;", drv.CheckBox_ECA_CheckBox_visible());
	  }
	  
	  @Test
	  public void CheckBox_ECA_CheckBox_enabled(){
		  assertEquals(true,drv.CheckBox_ECA_CheckBox_enabled());
	  }
	  
	  @Test
	  public void CheckBox_ECA_CheckBox_readOnly(){
		  assertEquals("true",drv.CheckBox_ECA_CheckBox_readOnly());
	  }
  	  
	  @Test
	  public void CheckBox_ECA_CheckBox_isChecked(){
		  assertEquals("true",drv.CheckBox_ECA_CheckBox_isChecked());
	  }
	  
	   @Test
	  public void CheckBox_ECA_CheckBox_hint(){
		  assertEquals("Hi,I'm hint",drv.CheckBox_ECA_CheckBox_hint());
	  }
	  
	  
	  @Test
	  public void CheckBox_ECA_CheckBox_gone(){
		  assertEquals("visibility: inherit; display: none;", drv.CheckBox_ECA_CheckBox_gone());
	  }
	  
	  @Test
	  public void CheckBox_ECA_CheckBox_Checked(){
		  assertEquals("true", drv.CheckBox_ECA_CheckBox_Checked());
	  }
	  
	 /* @Test
	  public void CheckBox_ECA_checkBox_LaunchNew() throws Exception{
		  drv.CheckBox_ECA_checkBox_LaunchNew();
		  Thread.sleep(2000);
		  assertEquals("CheckBox_ECA",drv.CheckBox_ECA_mainLink());
	  }*/
	  
	  @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,CheckBox_Action.class);
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
