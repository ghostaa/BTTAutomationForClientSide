package com.ibm.btt.allwidgets.Button;

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

public class Button_ECA extends AllWidgetsProjectMain_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Button_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Button_PageObject.class);
//    driver.navigate().to(Main_Class.baseUrl);
    
    drv.Establish();
    drv.BTT8200_tab();
    drv.Button_widget();
    drv.button_ECA();
  }

  @Test
  public void ecaOnclick(){
	  assertEquals("click ok", drv.ecaOnclick());
  }
  
  @Test
  public void ecaOnFocus(){
	  assertEquals("onfocus ok", drv.ecaOnFocus());
  }
  
  @Test
  public void ecaOnBlur(){
	  assertEquals("on blur is ok", drv.ecaOnBlur());
  }
  
  @Test
  public void ecaKeyDown(){
	  assertEquals("onkeydown ok", drv.ecaKeyDown());
  }
  
  @Test
  public void ecaOnKeyPress(){
	  assertEquals("on keypress ok", drv.ecaOnKeyPress());
  }
  
  @Test
  public void ecaOnKeyUp(){
	  assertEquals("onkeyup ok", drv.ecaOnKeyUp());
  }
  
  @Test
  public void ecaOnMouseUp(){
	  assertEquals("onMouseUp ok", drv.ecaOnMouseUp());
  }
  
  @Test
  public void ecaOnMouseDown(){
	  assertEquals("onMouseDown ok", drv.ecaOnMouseDown());
  }
  
  @Test
  public void ecaOnMouseEnter(){
	  assertEquals("onMouseEnter ok", drv.ecaOnMouseEnter());
  }
  
  @Test
  public void ecaOnMouseLeave(){
	  assertEquals("onMouseLeave ok", drv.ecaOnMouseLeave());
  }
  
  @Test
  public void ecaonMouseMove(){
	  assertEquals("onMouseMove ok", drv.ecaonMouseMove());
  }
  
  @Test
  public void ecaFocus(){
	  assertEquals(2, drv.ecaFocus());
  }
  
  @Test
  public void ecaStyleClass(){
	  assertEquals(1, drv.ecaStyleClass());
  }
  
  @Test
  public void ecaText(){
	  assertEquals("1234", drv.ecaText());
  }
  
  @Test
  public void ecaVisible(){
	  assertEquals(true, drv.ecaVisible());
  }
  
  @Test
  public void ecaHidden(){
	  assertEquals(1, drv.ecaHidden());
  }
  
  @Test
  public void ecaGone(){
	  assertEquals(1, drv.ecaGone());
  }
  
  @Test
  public void ecaDisableTrue(){
	  assertEquals("true", drv.ecaDisableTrue());
  }
  
  @Test
  public void ecaDisableFalse(){
	  assertEquals(true, drv.ecaDisableFalse());
  }
  
  @Test
  public void ecaHint(){
	  assertEquals("YesterdayClosed", drv.ecaHint());
  }
  
  @Test
  public void ecaIcon(){
	  assertEquals(AllWidgetsProjectMain_Class.baseUrl + "img/7days.jpg", drv.ecaIcon());
  }
  
  @Test
  public void ecaOnfocus(){
	  assertEquals(2, drv.ecaOnfocus());
  }
  
  @Test
  public void eca_OnBlur(){
	  assertEquals("onblur button1 then button2 change", drv.eca_OnBlur());
  }
  
  @Test
  public void eca_disable(){
	  assertEquals(false, drv.eca_disable());
  }
  
  @Test
  public void ecaExpHint(){
	  assertEquals("Image", drv.ecaExpHint());
  }

  @Test
  public void ecaExponKeyup(){
	  assertEquals("true", drv.ecaExponKeyup());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Button_ECA.class);
	driver.quit();
//	driver.navigate().refresh();
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
