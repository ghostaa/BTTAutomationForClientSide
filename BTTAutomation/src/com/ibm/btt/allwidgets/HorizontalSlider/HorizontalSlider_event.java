package com.ibm.btt.allwidgets.HorizontalSlider;

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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class HorizontalSlider_event extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static HorizontalSlider_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, HorizontalSlider_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.HorizontalSlider_widget();
    drv.HorizontalSlider_event();
  }

  @Test
  public void evtOnClick(){
	  assertEquals("HorizontalSlider clicked", drv.evtOnClick());
  }
  
  @Test
  public void evtOnDbClick(){
	  assertEquals("onDbClick works", drv.evtOnDbClick());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals("KeyDown works", drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeyPress(){
	  assertEquals("KeyPress", drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUP(){
	  assertEquals("KeyUp works", drv.evtOnKeyUP());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals("onMouseDown works", drv.evtOnMouseDown());
  }
   
  @Test
  public void evtOnMouseEnter(){
	  assertEquals("Mousepress works", drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave1(){
	  assertEquals("MouseEnter works", drv.evtOnMouseLeave1());
  }
  
  @Test
  public void evtOnMouseLeave2(){
	  assertEquals("MouseLeave works", drv.evtOnMouseLeave2());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals("MouseMove works", drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnMouseOut(){
	  assertEquals("onMouseOut", drv.evtOnMouseOut());
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
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,HorizontalSlider_event.class);
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
