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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.DateType;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class MultiSelect_Submit extends AllWidgetsProjectMain_Class{

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
    drv.MultiSelect_submit();
  }

  @Test
  public void subResultString(){
	  drv.subGeneralSubmit();
	  assertEquals("sample-1", drv.subResultString());
  }
  
  @Test
  public void subResultDate(){
	  assertEquals("sample-Mon Feb 24 00:00:00 CST 2014", drv.subResultDate());
  }
  
  @Test
  public void subResultCurrency(){
	  assertEquals("USD:32870375 - 3", drv.subResultCurrency());
  }
  
  @Test
  public void subResultNumber(){
	  assertEquals("677009676.7499120235443115234375 selected", drv.subResultNumber());
  }
  
  @Test
  public void subResultBoolean(){
	  assertEquals("sample-false", drv.subResultBoolean());
  }
  
  @Test
  public void subResultDuration(){
	  assertEquals("P2015Y8M8DT8H20M22S - 0", drv.subResultDuration());
  }
  
  @Test
  public void subResultXMLGregorianCalendar(){
	  assertEquals("2014-07-18T13:20:20.020+00:08 - 1", drv.subResultXMLGregorianCalendar());
  }
   
  @Test
  public void subResultByte(){
	  assertEquals("null", drv.subResultByte());
  }
  
  @Test
  public void subResultShort(){
	  assertEquals("sample-11231", drv.subResultShort());
  }
  
  @Test
  public void subResultInteger(){
	  assertEquals("sample-23", drv.subResultInteger());
  }
  
  @Test
  public void subResultLong(){
	  assertEquals("sample-84322238006", drv.subResultLong());
  }
 
  @Test
  public void subResultFloat(){
	  assertEquals("Selected is true", drv.subResultFloat());
  }
  
  @Test
  public void subResultDouble(){
	  assertEquals("sample-6.66", drv.subResultDouble());
  }
  
  @Test
  public void subResultBigDecimal(){
	  assertEquals("sample-751384515.6830341815948486328125", drv.subResultBigDecimal());
  }
  
  @Test
  public void subResultBigInteger(){
	  assertEquals("sample-153", drv.subResultBigInteger());
  }
  
  /*@Test
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
 */
 
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,MultiSelect_Submit.class);
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
