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

public class VerticalSlider_condition extends AllWidgetsProjectMain_Class{

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
    drv.VerticalSlider_condition();
  }


  @Test
  public void conDbClick(){
	  assertEquals("Focus is true. Test OK", drv.conDbClick());
  }
  
  @Test
  public void conDisabled(){
	  assertEquals("Disabled is false. Test OK", drv.conDisabled());
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
  
  @Test
  public void conExpId(){
	  assertEquals("test OK. get(id)=verticalSlider01", drv.conExpId());
  }
  
/*  @Test
  public void conExpSet(){
	  assertEquals("set(name,value) works", drv.conExpSet());
  }*/
  
  @Test
  public void conExpCompare(){
	  assertEquals("Test OK. Compared works", drv.conExpCompare());
  }
  
 
  
  @Test
  public void conProId(){
	  assertEquals("test OK. id=verticalSlider02", drv.conProId());
  }
  
/*  @Test
  public void conProFocus(){
	  assertEquals("", drv.conProFocus());
  }*/
  
  @Test
  public void conProDisabled(){
	  assertEquals("Disabled is false", drv.conProDisabled());
  }
  
  @Test
  public void conProValue(){
	  assertEquals("value is 20", drv.conProValue());
  }
  
  @Test
  public void conProWidgetName(){
	  assertEquals("'widget name is termLength", drv.conProWidgetName());
  }
  
  @Test
  public void conProReadonly(){
	  assertEquals("Readonly is true", drv.conProReadonly());
  }
  
  @Test
  public void conProClickSelect(){
	  assertEquals("clickSelect is true", drv.conProClickSelect());
  }
  
  @Test
  public void conProDiscreateValues(){
	  assertEquals("discreateValues 50", drv.conProDiscreateValues());
  }
  
  @Test
  public void conProHovering1(){
	  assertEquals("Hovering is true", drv.conProHovering1());
  }
  
  @Test
  public void conProHovering2(){
	  assertEquals("Hovering is false", drv.conProHovering2());
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
	  assertEquals("'slideDuration works", drv.conProslideDuration());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,VerticalSlider_condition.class);
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
