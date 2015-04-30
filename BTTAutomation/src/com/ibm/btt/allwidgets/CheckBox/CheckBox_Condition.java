package com.ibm.btt.allwidgets.CheckBox;

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
import com.ibm.btt.allwidgets.Message.Message_Action;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class CheckBox_Condition extends Main_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static CheckBox_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	Main_Class.setUp();
    drv=PageFactory.initElements(driver, CheckBox_PageObject.class);
//    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.BTT8200_tab();
    drv.CheckBox_widget();
    drv.CheckBox_Condition();
  }
  
  @Test
  public void CheckBox_Condition_Expression_isChecked(){
	  assertEquals(true,drv.CheckBox_Condition_Expression_isChecked());
  }

  @Test
  public void CheckBox_Condtion_checkBox_isFocusable  (){
	  assertEquals(2, drv.CheckBox_Condtion_checkBox_isFocusable());
  }
  
  @Test
  public void CheckBox_Condtion_CheckBox_isChecked(){
	  assertEquals("I changed.", drv.CheckBox_Condtion_CheckBox_isChecked());
  }
  
  @Test
  public void CheckBox_Condition_CheckBox_readOnly(){
	  assertEquals("true", drv.CheckBox_Condition_CheckBox_readOnly());
	  assertEquals("visibility: hidden;", drv.CheckBox_Condition_CheckBox_visibility());
  }
  
  @Test
  public void CheckBox_Condtion_CheckBox_disable(){
	  assertEquals("true", drv.CheckBox_Condtion_CheckBox_disabled());
	  assertEquals("visibility: hidden;", drv.CheckBox_Condtion_CheckBox_disable());
  }
  
  @Test
  public void CheckBox_Expression_isFocusable(){
	  assertEquals("true", drv.CheckBox_Expression_isFocusable());
  }
  
  @Test
  public void CheckBox_Condtion_Expression_id(){
	  assertEquals(true, drv.CheckBox_Condtion_Expression_id());
  }
  
  @Test
  public void CheckBox_Condtion_Expression_Text(){
	  assertEquals("Hi,I'm hint",drv.CheckBox_Condtion_Expression_Text());
  }
  
  @Test
  public void CheckBox_Condition_Expression_visibility(){
	  assertEquals("Hello",drv.CheckBox_Condition_Expression_visibility());
  }
  
  @Test
  public void CheckBox_Condition_Expression_disabled(){
	  assertEquals("visibility: inherit; display: none;",drv.CheckBox_Condition_Expression_disabled());
  }
  
  @Test
  public void CheckBox_Expression_readOnly(){
	  assertEquals(true,drv.CheckBox_Expression_readOnly());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,CheckBox_Condition.class);
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
