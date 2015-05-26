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

public class Image_Event extends AllWidgetsProjectMain_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Image_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Image_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.image_widget();
    drv.Image_event();
  }

  @Test
  public void Image_event_onclick(){
	  assertEquals("testClick", drv.Image_event_onclick());
  }
  
  @Test
  public void Image_event_onFocus(){
	  assertEquals("1234", drv.Image_event_onFocus());
  }
  
  @Test
  public void Image_event_onBlur(){
	  assertEquals("5678", drv.Image_event_onBlur());
  }
  
  @Test
  public void Image_event_onMouseDown(){
	  assertEquals("ImageOnMouseDown", drv.Image_event_onMouseDown());
  }
  
  @Test
  public void Image_event_onMouseUp(){
	  assertEquals("ImageOnMouseUp", drv.Image_event_onMouseUp());
  }
  
  @Test
  public void Image_event_onMouseEnter(){
	  assertEquals("ImageOnMouseEnter", drv.Image_event_onMouseEnter());
  }
  
  @Test
  public void Image_event_onMouseLeave(){
	  assertEquals("ImageOnMouseLeave", drv.Image_event_onMouseLeave());
  }
  
  @Test
  public void Image_event_onMouseMove(){
	  assertEquals("ImageOnMouseMove", drv.Image_event_onMouseMove());
  } 

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Image_Event.class);
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
