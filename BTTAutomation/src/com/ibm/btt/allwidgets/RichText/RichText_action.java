package com.ibm.btt.allwidgets.RichText;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RichText_action extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static RichText_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, RichText_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.RichText_widget();
    drv.RichText_action();
  }

  @Test
  public void RichText_100_action_actFocus(){
	  assertEquals(1, drv.actFocus());
  }
  
  @Test
  public void RichText_110_action_actHidden(){
	  assertEquals(1, drv.actHidden());
  }
  
  @Test
  public void RichText_120_action_actVisible(){
	  assertEquals(true, drv.actVisible());
  }
  
  @Test
  public void RichText_130_action_actGone(){
	  assertEquals(1, drv.actGone());
  }
 
  @Test
  public void RichText_140_action_actReadonlyT(){
	  assertEquals("false", drv.actReadonlyT());
  }
  
  @Test
  public void RichText_150_action_actReadonlyF(){
	  assertEquals("true", drv.actReadonlyF());
  }
  
  @Test
  public void RichText_160_action_actHint(){
	  assertEquals("Say hello to you ", drv.actHint());
  }
  
  @Test
  public void RichText_170_action_actStyleClass(){
	  assertEquals(1, drv.actStyleClass());
  }
  
  @Test
  public void RichText_180_action_actGroup(){
	  assertEquals(1, drv.actGroup());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,RichText_action.class);
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
