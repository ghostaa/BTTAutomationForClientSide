package com.ibm.btt.allwidgets.Tree;

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

public class Tree_Action extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Tree_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Tree_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Tree_widget();
    drv.Tree_action();
  }

  @Test
  public void actGetSelectLabel(){
	  assertEquals("level1-1", drv.actGetSelectLabel());
  }
  
  @Test
  public void actGetLabelNLS(){
	  assertEquals("level1-2", drv.actGetLabelNLS());
  }
  
  @Test
  public void actGetSelectedVal(){
	  assertEquals("002", drv.actGetSelectedVal());
  }
  
  @Test
  public void actStyleClass(){
	  assertEquals(1, drv.actStyleClass());
  }
  
  @Test
  public void actValue(){
	  assertEquals("testTree", drv.actValue());
  }
  
  @Test
  public void actHint(){
	  assertEquals("I am tree hint", drv.actHint());
  }
  
  @Test
  public void actHidden(){
	  assertEquals(1, drv.actHidden());
  }
 
  @Test
  public void actGone(){
	  assertEquals(1, drv.actGone());
  }

  @Test
  public void actVisible(){
	  assertEquals(true, drv.actVisible());
  }
  
  @Test
  public void actGroup(){
	  assertEquals(1, drv.actGroup());
  }
 
  public void actGroupMessage(){
	  assertEquals("level1-1", drv.actGroupMessage());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Tree_Action.class);
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
