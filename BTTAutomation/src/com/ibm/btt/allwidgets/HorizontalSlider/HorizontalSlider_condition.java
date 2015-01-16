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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class HorizontalSlider_condition extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static HorizontalSlider_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, HorizontalSlider_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.HorizontalSlider_widget();
    drv.HorizontalSlider_condition();
  }

  @Test
  public void conIsFocusable(){
	  assertEquals("isFocusable is true. Test OK", drv.conIsFocusable());
  }
  
  @Test
  public void conFocused(){
	  assertEquals("Focus is true. Test OK", drv.conFocused());
  }
  
  @Test
  public void conDisabled(){
	  assertEquals("Disabled is true. Test OK", drv.conDisabled());
  }
  
  @Test
  public void conReadonly(){
	  assertEquals("Readonly is true. Test OK", drv.conReadonly());
  }
  
  @Test
  public void conClickSelect(){
	  assertEquals("Clickselect is true. Test OK", drv.conClickSelect());
  }
  
  @Test
  public void conHover(){
	  assertEquals("Hovering is true. Test OK", drv.conHover());
  }
  
  @Test
  public void conHntermediatechanges(){
	  assertEquals("intermediatechange", drv.conHntermediatechanges());
  }
   
  @Test
  public void conShowButtons(){
	  assertEquals("showButton is true. Test OK", drv.conShowButtons());
  }
  
 /* @Test
  public void conExpId(){
	  assertEquals("test OK. get(id)=verticalSlider01", drv.conExpId());
  }
  */
  /*@Test
  public void conExpSet(){
	  assertEquals("onMouseLeave is triggered!", drv.conExpSet());
  }*/
  
  @Test
  public void conExpCompare(){
	  assertEquals("compare works. Test OK", drv.conExpCompare());
  }
  
/*  @Test
  public void conExpFocus(){
	  assertEquals("Test OK. isFocusable is true", drv.conExpFocus());
  }*/
  
  @Test
  public void conExpisFocusable(){
	  assertEquals("HorizontalSlider isFocusable is true", drv.conExpisFocusable());
  }
  
  @Test
  public void conProId(){
	  assertEquals("id ok", drv.conProId());
  }
  
  @Test
  public void conProFocus(){
	  assertEquals("Focus is true", drv.conProFocus());
  }
  
/*  @Test
  public void conProDisabled(){
	  assertEquals("Disabled is false", drv.conProDisabled());
  }*/
  
  @Test
  public void conProValue(){
	  assertEquals("value is 20", drv.conProValue());
  }
  
  @Test
  public void conProWidgetName(){
	  assertEquals("widget name is termLength", drv.conProWidgetName());
  }
  
  @Test
  public void conProReadonly(){
	  assertEquals("Readonly is true", drv.conProReadonly());
  }
  
  @Test
  public void conProClickSelect(){
	  assertEquals("ClickSelect is true", drv.conProClickSelect());
  }
  
  @Test
  public void conProDiscreateValues(){
	  assertEquals("discreateValues 50", drv.conProDiscreateValues());
  }
  
  @Test
  public void conProHovering(){
	  assertEquals("Hovering is true", drv.conProHovering());
  }
  
  @Test
  public void conProintermediaChanges(){
	  assertEquals("intermediaChanges is true", drv.conProintermediaChanges());
  }
  
  @Test
  public void conProMaximum(){
	  assertEquals("Max is 1000", drv.conProMaximum());
  }
 
  @Test
  public void conProMinimum(){
	  assertEquals("Minimum is 10", drv.conProMinimum());
  }
  
  @Test
  public void conPropageIncrement(){
	  assertEquals("20", drv.conPropageIncrement());
  }
  
  @Test
  public void conProshowButtons(){
	  assertEquals("showButtons is true", drv.conProshowButtons());
  }
  
  @Test
  public void conProslideDuration(){
	  assertEquals("slideDuration works", drv.conProslideDuration());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,HorizontalSlider_condition.class);
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
