package com.ibm.btt.allwidgets.Radio;

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
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Radio_submit extends Main_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Radio_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Radio_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Radio_widget();
    drv.Radio_Action();
  }

/*  @Test
  public void Radio_Condition_radio_isFocusable(){
	  assertEquals(false, drv.Radio_Condition_radio_isFocusable());
  }*/
  
  @Test
  public void Radio_Action_Radio_styleClass(){
	  assertEquals(1, drv.Radio_Action_Radio_styleClass());
  }
  
  @Test
  public void Radio_Action_radio_Text(){
	  assertEquals("radio_onClick", drv.Radio_Action_radio_Text());
  }
  
  @Test
  public void Radio_Action_radio_visible(){
	  assertEquals("visibility: inherit;", drv.Radio_Action_radio_visible());
  }
  
  @Test
  public void Radio_Action_radio_gone(){
	  assertEquals("visibility: inherit; display: none;", drv.Radio_Action_radio_gone());
  }
  
  @Test
  public void Radio_Action_radio_hidden(){
	  assertEquals("visibility: hidden;", drv.Radio_Action_radio_hidden_click());
  }
  
  @Test
  public void Radio_Action_radio_disabled(){
	  assertEquals(true,drv.Radio_Action_radio_disabled());
  }
  
  @Test
  public void Radio_Action_radio_dis(){
	  assertEquals("true",drv.Radio_Action_radio_dis());
  }
  
  @Test
  public void Radio_Action_radio_readOnly(){
	  assertEquals("true",drv.Radio_Action_radio_readOnly());
  }
  
  @Test
  public void Radio_Action_radio_invokeActionGroup(){
	  assertEquals(true,drv.Radio_Action_radio_invokeActionGroup());
  }
  
  @Test
  public void Radio_Action_radio_isChecked(){
	  assertEquals("true",drv.Radio_Action_radio_isChecked());
  }
  
  @Test
  public void Radio_Action_radio_unCheck(){
	  assertEquals(false,drv.Radio_Action_radio_unCheck());
  }
  
  @Test
  public void Radio_Action_radio_hint(){
	  assertEquals("13.Click  radio_onClick , radio_hint will show  hint",drv.Radio_Action_radio_hint());
  }
  
  @Test
  public void Radio_Action_radio_styleClass(){
	  assertEquals(2,drv.Radio_Action_radio_styleClass());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Radio_submit.class);
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
