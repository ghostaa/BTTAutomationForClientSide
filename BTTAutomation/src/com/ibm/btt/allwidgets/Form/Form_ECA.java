package com.ibm.btt.allwidgets.Form;

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
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Form_ECA extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Form_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Form_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Form_widget();
    drv.Form_eca();
  }
  
 //form event 
  @Test
  public void evtOnLoaded(){
	  drv.eventClick();
	  assertEquals("Form onLoaded event.", drv.evtOnLoaded());
  }

  @Test
  public void evtOnClick(){
	  assertEquals(1, drv.evtOnClick());
  }
  
  @Test
  public void evtOnFocusBefore(){
	  assertEquals(AllWidgetsProjectMain_Class.baseUrl+"img/cry.jpg", drv.evtOnFocusBefore());
  }
  
  @Test
  public void evtOnFocusAfter(){
	  assertEquals(AllWidgetsProjectMain_Class.baseUrl+"img/10days.jpg", drv.evtOnFocusAfter());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals("true", drv.evtOnBlur());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals("1234", drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeyPress(){
	  assertEquals("keyPress", drv.evtOnKeyPress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals("true", drv.evtOnKeyUp());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals("false", drv.evtOnMouseDown());
  }
  
  @Test
  public void evtOnMouseUp(){
	  assertEquals(true, drv.evtOnMouseUp());
  }
  
  @Test
  public void evtOnMouseEnter(){
	  assertEquals("true", drv.evtOnMouseEnter());
  }
  
  @Test
  public void evtOnMouseLeave(){
	  assertEquals("You are successful!", drv.evtOnMouseLeave());
  }
  
  @Test
  public void evtOnMouseMove(){
	  assertEquals("Move on the form.", drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnSubmit(){
	  boolean b = DateType.Currency(drv.evtOnSubmit());
	  assertEquals(true, b);
	  driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
	  drv.Establish();
	  drv.BTT8200_tab();
	  drv.Form_widget();
	  drv.Form_eca();
	  drv.eventClick();
  }
  
  @Test
  public void evtOnReset(){
	  assertEquals("reset", drv.evtOnReset());
  }
  
  @Test
  public void evtisMandatoryT(){
	  assertEquals("true", drv.evtisMandatoryT());
  }
 
  @Test
  public void evtisMandatoryF(){
	  assertEquals("false", drv.evtisMandatoryF());
  }
//condition  
  @Test
  public void conIsValid(){
	  drv.evtBack();
	  drv.conditionClick();
	  assertEquals("form is validate", drv.conIsValid());
  }
  
  @Test
  public void conValidateOnSubmitT(){
	  assertEquals(AllWidgetsProjectMain_Class.baseUrl + "img/Fish03.jpg", drv.conValidateOnSubmitT());
  }
  
  @Test
  public void conIsValidT(){
	  assertEquals("form.isValid()==true", drv.conIsValidT());
  }
  
  @Test
  public void conExpIsValidT(){
	  assertEquals("This is form03.", drv.conExpIsValidT());
  }
  
  @Test
  public void conExpValidateOnSubmitT(){
	  assertEquals("TRUE", drv.conExpValidateOnSubmitT());
  }
 //action
  @Test
  public void actionClick(){
	  drv.conditionBack();
	  drv.actionClick();
	  Main_Class.waitUntilLoadElement(20, "form_action_text01");
  }
  
  @Test
  public void actSubmit(){
	  assertEquals("1234", drv.actSubmit());
	  driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
	  drv.Establish();
	  drv.BTT8200_tab();
	  drv.Form_widget();
	  drv.Form_eca();
	  drv.actionClick();
  }
  
  @Test
  public void actReset(){
	  assertEquals("", drv.actReset());
  }
  
  @Test
  public void actStyleClass(){
	  assertEquals(1, drv.actStyleClass());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Form_ECA.class);
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
