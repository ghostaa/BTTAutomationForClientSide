package com.ibm.btt.allwidgets.Image;

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

public class Image_appearance1 extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Image_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Image_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.image_widget();
    drv.Image_appearance1();
  }

  @Test
  public void Appearance1_1(){
	  assertEquals(1, drv.Appearance1_1());
  }
  
  @Test
  public void Appearance1_2(){
	  assertEquals(1, drv.Appearance1_2());
  }
  
  @Test
  public void Appearance1_3(){
	  assertEquals(1, drv.Appearance1_3());
  }
  
  @Test
  public void Appearance1_4(){
	  assertEquals(1, drv.Appearance1_4());
  }
  
  @Test
  public void Appearance1_5(){
	  assertEquals(1, drv.Appearance1_5());
  }
  
  @Test
  public void Appearance1_6(){
	  assertEquals(2, drv.Appearance1_6());
  }
  
  @Test
  public void Appearance1_7(){
	  assertEquals(2, drv.Appearance1_7());
  }
  
  @Test
  public void Appearance1_8(){
	  assertEquals(2, drv.Appearance1_8());
  }
  
  @Test
  public void Appearance1_9(){
	  assertEquals(1, drv.Appearance1_9());
  }
  
  @Test
  public void Appearance1_10(){
	  assertEquals(2, drv.Appearance1_10());
  }
  
  @Test
  public void Appearance1_11(){
	  assertEquals(2, drv.Appearance1_11());
  }
  
  @Test
  public void Appearance1_12(){
	  assertEquals(2, drv.Appearance1_12());
  }
  
  @Test
  public void Appearance1_13(){
	  assertEquals(1, drv.Appearance1_13());
  }
  
  @Test
  public void Appearance1_14(){
	  assertEquals(2, drv.Appearance1_14());
  }
  
  @Test
  public void Appearance1_15(){
	  assertEquals(2, drv.Appearance1_15());
  }
  
  @Test
  public void Appearance1_16(){
	  assertEquals(2, drv.Appearance1_16());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Image_appearance1.class);
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
