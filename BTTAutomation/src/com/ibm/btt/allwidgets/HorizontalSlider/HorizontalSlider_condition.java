package com.ibm.btt.allwidgets.HorizontalSlider;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Tools;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HorizontalSlider_condition extends AllWidgetsProjectMain_Class{

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
    drv.HorizontalSlider_condition();
  }

  @Test
  public void con_01_Focused(){
	  assertEquals("Focus is true. Test OK", drv.conFocused());
  }
  
  @Test
  public void con_02_Disabled(){
	  assertEquals("Disabled is true. Test OK", drv.conDisabled());
  }
  
  @Test
  public void con_03_Readonly(){
	  assertEquals("Readonly is true. Test OK", drv.conReadonly());
  }
  
  @Test
  public void con_05_ClickSelect(){
	  assertEquals("Clickselect is true. Test OK", drv.conClickSelect());
  }
  
  @Test
  public void con_06_Hover(){
	  assertEquals("Hovering is true. Test OK", drv.conHover());
  }
  
  @Test
  public void con_08_Hntermediatechanges(){
	  assertEquals("intermediatechange", drv.conHntermediatechanges());
  }
   
  @Test
  public void con_09_ShowButtons(){
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
  public void con_15_ExpCompare(){
	  assertEquals("compare works. Test OK", drv.conExpCompare());
  }
  
/*  @Test
  public void conExpFocus(){
	  assertEquals("Test OK. isFocusable is true", drv.conExpFocus());
  }*/
  
  @Test
  public void con_18_ProId(){
	  assertEquals("id ok", drv.conProId());
  }
  
  @Test
  public void con_19_ProFocus(){
	  assertEquals("Focus is true", drv.conProFocus());
  }
  
  @Test
  public void con_21_ProDisabled(){
	  assertEquals("disabled is ok", drv.conProDisabled());
  }
  
  @Test
  public void con_22_ProValue(){
	  assertEquals("value is 20", drv.conProValue());
  }
  
  @Test
  public void con_23_ProWidgetName(){
	  assertEquals("widget name is termLength", drv.conProWidgetName());
  }
  
  @Test
  public void con_25_ProReadonly(){
	  assertEquals("Readonly is true", drv.conProReadonly());
  }
  
  @Test
  public void con_26_ProClickSelect(){
	  assertEquals("ClickSelect is true", drv.conProClickSelect());
  }
  
  @Test
  public void con_27_ProDiscreateValues(){
	  assertEquals("discreateValues 50", drv.conProDiscreateValues());
  }
  
  @Test
  public void con_29_ProHovering(){
	  assertEquals("Hovering is true", drv.conProHovering());
  }
  
  @Test
  public void con_31_ProintermediaChanges(){
	  assertEquals("intermediaChanges is true", drv.conProintermediaChanges());
  }
  
  @Test
  public void con_32_ProMaximum(){
	  assertEquals("Max is 1000", drv.conProMaximum());
  }
 
  @Test
  public void con_33_ProMinimum(){
	  assertEquals("Minimum is 10", drv.conProMinimum());
  }
  
  @Test
  public void con_34_PropageIncrement(){
	  assertEquals("20", drv.conPropageIncrement());
  }
  
  @Test
  public void con_35_ProshowButtons(){
	  assertEquals("showButtons is true", drv.conProshowButtons());
  }
  
  @Test
  public void con_36_ProslideDuration(){
	  assertEquals("slideDuration works", drv.conProslideDuration());
  }
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,HorizontalSlider_condition.class);
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
