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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class VerticalSlider_event extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static VerticalSlider_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, VerticalSlider_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.VerticalSlider_widget();
    drv.VerticalSlider_event();
  }
  
  @Test
  public void evt_200_OnKeyPress(){
	  assertEquals("onKeyPress works.", drv.evtOnKeyPress());
  }

  @Test
  public void evt_201_OnClick(){
	  assertEquals("onClick works", drv.evtOnClick());
  }
  
  @Test
  public void evt_202_OnDbClick(){
	  assertEquals("onDbClick works", drv.evtOnDbClick());
  }
  
  @Test
  public void evt_203_OnKeyDown(){
	  assertEquals("onKeyDown", drv.evtOnKeyDown());
  }
  
  @Test
  public void evt_204_OnKeyUP(){
	  assertEquals("onKeyUp works", drv.evtOnKeyUP());
  }
  
/*  @Test
  public void evt_205_OnMouseDown(){
	  assertEquals("onKeyDown works", drv.evtOnMouseDown());
  }*/
   
  @Test
  public void evt_206_OnMouseEnter(){
	  assertEquals("onKeyEnter works", drv.evtOnMouseEnter());
  }
  
  @Test
  public void evt_207_OnMouseLeave(){
	  assertEquals("onMouseLeave works", drv.evtOnMouseLeave());
  }
  
  @Test
  public void evt_208_OnMouseMove(){
	  assertEquals("onMouseMove works", drv.evtOnMouseMove());
  }
  
  @Test
  public void evt_209_OnMouseOut(){
	  assertEquals("onMouseOut works", drv.evtOnMouseOut());
  }
  
  @Test
  public void evt_210_OnMouseOver(){
	  assertEquals("onMouseOver works", drv.evtOnMouseOver());
  }
  
  @Test
  public void evt_211_OnMouseUp(){
	  assertEquals("onMouseUp", drv.evtOnMouseUp());
  }
  
  @Test
  public void evt_212_OnFocus(){
	  assertEquals("onFocus works", drv.evtOnFocus());
  }
  
  @Test
  public void evt_213_OnBlur(){
	  assertEquals("onBlur works", drv.evtOnBlur());
  }
  
  @Test
  public void evt_214_OnChange(){
	  assertEquals("onChange works", drv.evtOnChange());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,VerticalSlider_event.class);
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
