package com.ibm.btt.allwidgets.MultiSelect;

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

public class MultiSelect_Submit extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static MultiSelect_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, MultiSelect_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.MultiSelect_widget();
    drv.MultiSelect_submit();
  }

  @Test
  public void evtOnClick(){
	  assertEquals("onClick is triggered!", drv.evtOnClick());
  }
  
  @Test
  public void evtOnFocus(){
	  assertEquals("onFocus is triggered!", drv.evtOnFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals("onBlur is triggered!", drv.evtOnBlur());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals("onKeyDown is triggered!", drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeyPress(){
	  assertEquals("onKeyPress is triggered!", drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals("onKeyUp is triggered!", drv.evtOnKeyUp());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals("onMouseDown is triggered!", drv.evtOnMouseDown());
  }
   
  @Test
  public void evtOnMouseUp(){
	  assertEquals("onMouseUp is triggered!", drv.evtOnMouseUp());
  }
  
  @Test
  public void evtOnMouseEnter(){
	  assertEquals("onMouseEnter is Triggered", drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave(){
	  assertEquals("onMouseLeave is triggered!", drv.evtOnMouseLeave());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals("onMouseMove is triggered!", drv.evtOnMouseMove());
  }
  
//Action
  @Test
  public void actFocus(){
	  drv.actconTabbedPane();
	  assertEquals(2, drv.actFocus());
  }
  
  @Test
  public void actStyleClassBlue(){
	  assertEquals(1, drv.actStyleClassBlue());
  }
  
  @Test
  public void actStyleClassRed(){
	  assertEquals(1, drv.actStyleClassRed());
  }
  
  @Test
  public void actmultiSelectValue1(){
	  assertEquals("2", drv.actmultiSelectValue1());
  }
  
  @Test
  public void actmultiSelectValue5(){
	  assertEquals("5", drv.actmultiSelectValue5());
  }
  
  @Test
  public void actVisible(){
	  assertEquals(true, drv.actVisible());
  }
  
  @Test
  public void actHidden(){
	  assertEquals("visibility: hidden; width: 153px;", drv.actHidden());
  }
  
  @Test
  public void actGone(){
	  assertEquals("visibility: inherit; width: 153px; display: none;", drv.actGone());
  }
  
  @Test
  public void actDisableTrue(){
	  assertEquals("true", drv.actDisableTrue());
  }
  
  @Test
  public void actDisableFalse(){
	  assertEquals(true, drv.actDisableFalse());
  }
  
  @Test
  public void actReadonlyTrue(){
	  assertEquals("true", drv.actReadonlyTrue());
  }
  
  @Test
  public void actReadonlyFalse(){
	  assertEquals(true, drv.actReadonlyFalse());
  }
 
  @Test
  public void actHint(){
	  assertEquals("This is hint~", drv.actHint());
  }
  
  @Test
  public void actHint1(){
	  assertEquals("Credit Cards", drv.actHint1());
  }
  
  @Test
  public void actGroupGone(){
	  assertEquals("visibility: inherit; width: 153px; display: none;", drv.actGroupGone());
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
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,MultiSelect_Submit.class);
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
