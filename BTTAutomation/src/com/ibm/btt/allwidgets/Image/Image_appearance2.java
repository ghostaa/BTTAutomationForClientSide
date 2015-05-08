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

import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;

public class Image_appearance2 extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Image_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Image_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.image_widget();
    drv.Image_appearance2();
  }

  @Test
  public void Appearance2_1(){
	  assertEquals("left&top", drv.Appearance2_1());
  }
  
  @Test
  public void Appearance2_2(){
	  assertEquals("left&middle", drv.Appearance2_2());
  }
  
  @Test
  public void Appearance2_3(){
	  assertEquals("left&bottom", drv.Appearance2_3());
  }
  
  @Test
  public void Appearance2_4(){
	  assertEquals("center&top", drv.Appearance2_4());
  }
  
  @Test
  public void Appearance2_5(){
	  assertEquals("center&middle", drv.Appearance2_5());
  }
  
  @Test
  public void Appearance2_6(){
	  assertEquals("center&bottom", drv.Appearance2_6());
  }
  
  @Test
  public void Appearance2_7(){
	  assertEquals("right&top", drv.Appearance2_7());
  }
  
  @Test
  public void Appearance2_8(){
	  assertEquals("right&middle", drv.Appearance2_8());
  }
  
  @Test
  public void Appearance2_9(){
	  assertEquals("right&bottom", drv.Appearance2_9());
  }
  
  @Test
  public void Appearance2_10(){
	  assertEquals(1, drv.Appearance2_10());
  }
  
  @Test
  public void Appearance2_11(){
	  assertEquals(1, drv.Appearance2_11());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Image_appearance2.class);
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
