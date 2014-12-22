package com.ibm.btt.allwidgets.Text;

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

public class Text_Event extends Main_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Text_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Text_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Text_widget();
    drv.Text_event();
  }

  @Test
  public void Text_event_onclick(){
	  assertEquals(false, drv.Text_event_onclick());
  }
  
  @Test
  public void Text_event_onFocus(){
	  assertEquals(false, drv.Text_event_onFocus());
  }
  
  @Test
  public void Text_event_onBlur(){
	  assertEquals(false, drv.Text_event_onBlur());
  }
  
  @Test
  public void Text_event_keyDown(){
	  assertEquals(false, drv.Text_event_keyDown());
  }
  
  @Test
  public void Text_event_onKeyPress(){
	  assertEquals(false, drv.Text_event_onKeyPress());
  }
  
  @Test
  public void Text_event_onKeyUp(){
	  assertEquals(false, drv.Text_event_onKeyUp());
  }
  
  @Test
  public void Text_event_onMouseDown(){
	  assertEquals(false, drv.Text_event_onMouseDown());
  }
  
  @Test
  public void Text_event_onMouseUp(){
	  assertEquals(false, drv.Text_event_onMouseUp());
  }
  
  @Test
  public void Text_event_onMouseEnter(){
	  assertEquals(false, drv.Text_event_onMouseEnter());
  }
  
  @Test
  public void Text_event_onMouseLeave(){
	  assertEquals(false, drv.Text_event_onMouseLeave());
  }
  
  @Test
  public void Text_event_onMouseMove(){
	  assertEquals(false, drv.Text_event_onMouseMove());
  }
  
  @Test
  public void Text_event_onChange(){
	  assertEquals(false, drv.Text_event_onChange());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Text_Event.class);
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
