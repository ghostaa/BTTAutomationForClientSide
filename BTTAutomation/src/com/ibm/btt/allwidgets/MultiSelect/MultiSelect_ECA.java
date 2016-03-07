package com.ibm.btt.allwidgets.MultiSelect;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.runners.MethodSorters;

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
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MultiSelect_ECA extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static MultiSelect_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, MultiSelect_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.MultiSelect_widget();
    drv.MultiSelect_ECA();
  }

 //Event
  @Test
  public void MultiSelect_100_evtOnClick(){
	  assertEquals("onClick is triggered!", drv.evtOnClick());
  }
  
  @Test
  public void MultiSelect_110_evtOnFocus(){
	  assertEquals("onFocus is triggered!", drv.evtOnFocus());
  }
  
  @Test
  public void MultiSelect_120_evtOnBlur(){
	  assertEquals("onBlur is triggered!", drv.evtOnBlur());
  }
  
  @Test
  public void MultiSelect_130_evtOnKeyDown(){
	  assertEquals("onKeyDown is triggered!", drv.evtOnKeyDown());
  }
  
  @Test
  public void MultiSelect_140_evtOnKeyPress(){
	  assertEquals("onKeyPress is triggered!", drv.evtOnKeyPress());
  }
  
  @Test
  public void MultiSelect_150_evtOnKeyUp(){
	  assertEquals("onKeyUp is triggered!", drv.evtOnKeyUp());
  }
  
  @Test
  public void MultiSelect_160_evtOnMouseDown(){
	  assertEquals("onMouseDown is triggered!", drv.evtOnMouseDown());
  }
   
  @Test
  public void MultiSelect_170_evtOnMouseUp(){
	  assertEquals("onMouseUp is triggered!", drv.evtOnMouseUp());
  }
  
  @Test
  public void MultiSelect_180_evtOnMouseEnter(){
	  assertEquals("onMouseEnter is Triggered", drv.evtOnMouseEnter());
  }
  
  @Test
  public void MultiSelect_190_evtOnMouseLeave(){
	  assertEquals("onMouseLeave is triggered!", drv.evtOnMouseLeave());
  }
  
  @Test
  public void MultiSelect_200_evtOnMouseMove(){
	  assertEquals("onMouseMove is triggered!", drv.evtOnMouseMove());
  }
  
//Action
  @Test
  public void MultiSelect_220_actFocus(){
	  drv.actconTabbedPane();
	  assertEquals(2, drv.actFocus());
  }
  
  @Test
  public void MultiSelect_230_actStyleClassBlue(){
	  assertEquals(1, drv.actStyleClassBlue());
  }
  
  @Test
  public void MultiSelect_240_actStyleClassRed(){
	  assertEquals(1, drv.actStyleClassRed());
  }
  
  @Test
  public void MultiSelect_250_actmultiSelectValue1(){
	  assertEquals("2", drv.actmultiSelectValue1());
  }
  
  @Test
  public void MultiSelect_260_actmultiSelectValue5(){
	  assertEquals("5", drv.actmultiSelectValue5());
  }
  
  @Test
  public void MultiSelect_270_actVisible(){
	  assertEquals(true, drv.actVisible());
  }
  
  @Test
  public void MultiSelect_280_actHidden(){
	  assertEquals(1, drv.actHidden());
  }
  
  @Test
  public void MultiSelect_290_actGone(){
	  assertEquals(1, drv.actGone());
  }
  
  @Test
  public void MultiSelect_300_actDisableTrue(){
	  assertEquals("true", drv.actDisableTrue());
  }
  
  @Test
  public void MultiSelect_310_actDisableFalse(){
	  assertEquals(true, drv.actDisableFalse());
  }
  
  @Test
  public void MultiSelect_320_actReadonlyTrue(){
	  assertEquals("true", drv.actReadonlyTrue());
  }
  
  @Test
  public void MultiSelect_330_actReadonlyFalse(){
	  assertEquals(true, drv.actReadonlyFalse());
  }
 
  @Test
  public void MultiSelect_340_actHint(){
	  assertEquals("This is hint~", drv.actHint());
  }
  
  @Test
  public void MultiSelect_350_actHint1(){
	  assertEquals("Credit Cards", drv.actHint1());
  }
  
  @Test
  public void MultiSelect_360_actGroupGone(){
	  assertEquals(1, drv.actGroupGone());
  }
  
//Condition
  @Test
  public void conFocus(){
	  assertEquals("Yes, MultiSelect is focusable!", drv.conFocus());
  }
  
  @Test
  public void conDisabled(){
	  assertEquals(true, drv.conDisabled());
	  assertEquals("MultiSelect- disabled- false", drv.conLabelText2());
  }
  
  @Test
  public void conReadonly(){
	  assertEquals(true, drv.conReadonly());
	  assertEquals("MultiSelect- readOnly - false", drv.conLabelText3());
  }
  
  @Test
  public void conisFocusable(){
	  assertEquals("it 's true : multiSelect_copy11.isFocusable() == true", drv.conisFocusable());
  }
  
  @Test
  public void conId(){
	  assertEquals("MultiSelect_eca_multiSelect_copy11", drv.conId());
	  assertEquals("It's true: multiSelect_copy11.id == \"multiSelect_copy11\"", drv.conLabelText5());
  }
  
  @Test
  public void conValue(){
	  assertEquals("It is false: multiSelect_copy11.value == 1", drv.conValue());
  }
  
  @Test
  public void conVisible(){
	  assertEquals(true, drv.conVisible());
	  assertEquals("it's true: multiSelect_copy11.visibility=visible", drv.conLabelText7());
  }
  
  @Test
  public void conDisable(){
	  assertEquals(true, drv.conDisable());
	  assertEquals("It's false: multiSelect_copy11.disabled==true", drv.conLabelText8());
  }
  
  @Test
  public void conditionReadonly(){
	  assertEquals(true, drv.conditionReadonly());
	  assertEquals("it's false : multiSelect_copy11.readOnly == true", drv.conLabelText9());
  }
  
  @Test
  public void conAsync(){
	  assertEquals("It's false : multiSelect_copy11.asyncStatus=ok", drv.conAsync());
  }
  
  @Test
  public void conasyncErrorMessage(){
	  assertEquals("It's false : multiSelect_copy11.asyncErrorMessage = \"error\"", drv.conasyncErrorMessage());
  }
 
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,MultiSelect_ECA.class);
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
