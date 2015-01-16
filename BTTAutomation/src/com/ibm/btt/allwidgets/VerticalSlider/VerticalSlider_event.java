package com.ibm.btt.allwidgets.VerticalSlider;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ibm.btt.allwidgets.Label.Label_PageObject;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class VerticalSlider_event extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static VerticalSlider_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, VerticalSlider_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.VerticalSlider_widget();
    drv.VerticalSlider_event();
  }

  @Test
  public void evtOnClick(){
	  assertEquals("onClick works", drv.evtOnClick());
  }
  
  @Test
  public void evtOnDbClick(){
	  assertEquals("onDbClick works", drv.evtOnDbClick());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals("onKeyDown", drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeyPress(){
	  assertEquals("onKeyPress works.", drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUP(){
	  assertEquals("onKeyUp works", drv.evtOnKeyUP());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals("onKeyDown works", drv.evtOnMouseDown());
  }
   
  @Test
  public void evtOnMouseEnter(){
	  assertEquals("onKeyEnter works", drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave(){
	  assertEquals("onMouseLeave works", drv.evtOnMouseLeave());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals("onMouseMove works", drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnMouseOut(){
	  assertEquals("onMouseOut works", drv.evtOnMouseOut());
  }
  
  @Test
  public void evtOnMouseOver(){
	  assertEquals("onMouseOver works", drv.evtOnMouseOver());
  }
  
  @Test
  public void evtOnMouseUp(){
	  assertEquals("onMouseUp", drv.evtOnMouseUp());
  }
  
  @Test
  public void evtOnFocus(){
	  assertEquals("onFocus works", drv.evtOnFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals("onBlur works", drv.evtOnBlur());
  }
  
  @Test
  public void evtOnChange(){
	  assertEquals("onChange works", drv.evtOnChange());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,VerticalSlider_event.class);
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
