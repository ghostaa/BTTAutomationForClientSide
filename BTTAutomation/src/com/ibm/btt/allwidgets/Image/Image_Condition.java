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

public class Image_Condition extends AllWidgetsProjectMain_Class{
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
    drv.Image_condition();
  }

  @Test
  public void Image_condition_isFocusable(){
	  assertEquals("Focus is true.", drv.Image_condition_isFocusable());
  }
  
  @Test
  public void Image_condition_disabledTrue(){
	  assertEquals("disabled is true.", drv.Image_condition_disabledTrue());
  }
  
  @Test
  public void Image_condition_disabledFalse(){
	  assertEquals("label07", drv.Image_condition_disabledFalse());
  }
  
  @Test
  public void Image_condition_Constant(){
	  assertEquals("3=3", drv.Image_condition_Constant());
  }
  
  @Test
  public void Image_condition_Constant02(){
	  assertEquals("true and true", drv.Image_condition_Constant02());
  }
  
  @Test
  public void Image_Expression_isFocusable(){
	  assertEquals("true", drv.Image_Expression_isFocusable());
  }
  
  @Test
  public void Image_Expression_id(){
	  assertEquals("true",drv.Image_Expression_id());
  }
  
  @Test
  public void Image_Expression_location(){
	  assertEquals("img/Fish03.jpg",drv.Image_Expression_location());
  }
  
  @Test
  public void Image_Expression_visibility(){
	  assertEquals(false,drv.Image_Expression_visibility());
  }
  
  @Test
  public void Image_Expression_disbaleFalse(){
	  assertEquals("disabled is false.",drv.Image_Expression_disbaleFalse());
  }
  
  @Test
  public void Image_Expression_target(){
	  assertEquals("target is parent'",drv.Image_Expression_target());
  }
  
  @Test
  public void Image_Expression_tabIndex(){
	  assertEquals("TabIndex is 1",drv.Image_Expression_tabIndex());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Image_Condition.class);
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
