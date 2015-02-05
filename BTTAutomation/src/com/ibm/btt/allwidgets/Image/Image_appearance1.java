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

public class Image_appearance1 extends Main_Class{

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
    drv.Image_appearance1();
  }

  @Test
  public void Appearance1_1(){
	  assertEquals("visibility: inherit;", drv.Appearance1_1());
  }
  
  @Test
  public void Appearance1_2(){
	  assertEquals("visibility: inherit; height: 50px;", drv.Appearance1_2());
  }
  
  @Test
  public void Appearance1_3(){
	  assertEquals("visibility: inherit; height: 50%;", drv.Appearance1_3());
  }
  
  @Test
  public void Appearance1_4(){
	  assertEquals("visibility: inherit; height: 100%;", drv.Appearance1_4());
  }
  
  @Test
  public void Appearance1_5(){
	  assertEquals("visibility: inherit; width: 50px;", drv.Appearance1_5());
  }
  
  @Test
  public void Appearance1_6(){
	  assertEquals("visibility: inherit; width: 50px; height: 50px;", drv.Appearance1_6());
  }
  
  @Test
  public void Appearance1_7(){
	  assertEquals("visibility: inherit; width: 50px; height: 50%;", drv.Appearance1_7());
  }
  
  @Test
  public void Appearance1_8(){
	  assertEquals("visibility: inherit; width: 50px; height: 100%;", drv.Appearance1_8());
  }
  
  @Test
  public void Appearance1_9(){
	  assertEquals("visibility: inherit; width: 50%;", drv.Appearance1_9());
  }
  
  @Test
  public void Appearance1_10(){
	  assertEquals("visibility: inherit; width: 50%; height: 50px;", drv.Appearance1_10());
  }
  
  @Test
  public void Appearance1_11(){
	  assertEquals("visibility: inherit; width: 50%; height: 50%;", drv.Appearance1_11());
  }
  
  @Test
  public void Appearance1_12(){
	  assertEquals("visibility: inherit; width: 50%; height: 100%;", drv.Appearance1_12());
  }
  
  @Test
  public void Appearance1_13(){
	  assertEquals("visibility: inherit; width: 100%;", drv.Appearance1_13());
  }
  
  @Test
  public void Appearance1_14(){
	  assertEquals("visibility: inherit; width: 100%; height: 50px;", drv.Appearance1_14());
  }
  
  @Test
  public void Appearance1_15(){
	  assertEquals("visibility: inherit; width: 100%; height: 50%;", drv.Appearance1_15());
  }
  
  @Test
  public void Appearance1_16(){
	  assertEquals("visibility: inherit; width: 100%; height: 100%;", drv.Appearance1_16());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Image_appearance1.class);
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
