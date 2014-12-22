package com.ibm.btt.allwidgets.Message;

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

public class Message_Action extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Message_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, Message_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Message_widget();
    drv.Message_action();
  }

  @Test
  public void actDisplay(){
	  assertEquals("visibility: inherit;", drv.actDisplay());
  }
  
  @Test
  public void actINFO(){
	  assertEquals(1, drv.actINFO());
  }
  
  @Test
  public void actWARN(){
	  assertEquals(1, drv.actWARN());
  }
  
  @Test
  public void actError(){
	  assertEquals(1, drv.actError());
  }
  
  @Test
  public void actERROR(){
	  assertEquals(1, drv.actERROR());
  }
  
  @Test
  public void actValue(){
	  assertEquals("GOLD", drv.actValue());
  }
  
  @Test
  public void actPopupString(){
	  assertEquals("Message Dialog", drv.actPopupString_title());
	  assertEquals("Test successfully, message.displayPopup(String), String is widgets property", drv.actPopString());
	  drv.actPopStringCancel();
  }
  
  @Test
  public void actPopLevel(){
	  assertEquals("test successfully", drv.actPopLevel());
	  drv.actPopLevelCancel();
  }
  
  @Test
  public void actPopupValue(){
	  assertEquals("GOLD", drv.actPopupValue());
	  drv.actPopupValueCancel();
  }
  
  @Test
  public void actOpenMessage(){
	  assertEquals(true, drv.actOpenMessage());
  }
  
  @Test
  public void actCloseMessage(){
	  assertEquals(false, drv.actCloseMessage());
  }
  
  @Test
  public void actGroup(){
	  assertEquals(true, drv.actGroup());
	  assertEquals(true, drv.actDialog());
	  drv.actDialogCancel();
  }
  
  @Test
  public void actDisplayStyle(){
	  assertEquals(true, drv.actDisplayStyle());
	  assertEquals(1, drv.actStyle());
  }
  
  @Test
  public void actDisplayVisible(){
	  assertEquals(true, drv.actDisplayVisible());
  }
  
  @Test
  public void actDisplayHidden(){
	  assertEquals("visibility: hidden;", drv.actDisplayHidden());
  }
  
  @Test
  public void actDisplayGone(){
	  assertEquals("visibility: inherit; display: none;", drv.actDisplayGone());
  }
  
  @Test
  public void actDisplayERROR(){
	  assertEquals(1, drv.actDisplayERROR());
  }
  
  @Test
  public void actDisplayINFO(){
	  assertEquals(1, drv.actDisplayINFO());
  }
  
  @Test
  public void actDisplayWARN(){
	  assertEquals(1, drv.actDisplayWARN());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Message_Action.class);
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
