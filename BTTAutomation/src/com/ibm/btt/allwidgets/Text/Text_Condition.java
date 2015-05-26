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
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Text_Condition extends AllWidgetsProjectMain_Class{
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
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Text_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Text_widget();
    drv.Text_condition();
  }

  @Test
  public void Text_condition_isFocusable(){
	  drv.Text_condition_isFocusable_click();
	  assertEquals(false, drv.Text_condition_isFocusable());
  }
  
  @Test
  public void Text_condition_isMadatory(){
	  drv.Text_condition_isMandatory_click();
	  assertEquals("true", drv.Text_condition_isMandatory_getValue());
	  drv.Text_condition_changeMandatory();
	  drv.Text_condition_isMandatory_click();
	  assertEquals("false", drv.Text_condition_isMandatory_getValue());
  }
  
  @Test
  public void Text_condition_disableFalse(){
	  assertEquals(true, drv.Text_condition_isEnabled());
	  drv.Text_condition_disableFalse_click();
	  assertEquals(false, drv.Text_condition_disable_buttonisDisplayed());
  }
  
  @Test
  public void Text_condition_readOnly(){
	  assertEquals("true", drv.Text_condition_readonlyTrue());
	  assertEquals("Exit", drv.Text_condition_getTooltip());
  }
  
  @Test
  public void Text_Expression_isFocusable(){
	  drv.Text_condition_Focusable_click();
	  assertEquals(false, drv.Text_Expression_isFocusable_button());
  }
  
  @Test
  public void Text_Expression_id(){
	  drv.Text_Expression_id();
	  assertEquals(false, drv.Text_Expression_id_button());
  }
  
  @Test
  public void Text_Expression_isMandatory(){
	  assertEquals("This value is required.",drv.Text_Expression_isMandatory_tooltip());
	  assertEquals(false,drv.Text_Expression_isMandatory_button());
  }
  
  @Test
  public void Text_Expression_visible(){
	  assertEquals(true,drv.Text_Expression_visible());
	  assertEquals(false,drv.Text_Expression_visible_button());
  }
  
  @Test
  public void Text_Expression_disabledFalse(){
	  assertEquals(true,drv.Text_Expression_disabledFalse());
	  assertEquals(false,drv.Text_Expression_disabledFalse_button());
  }
  
  @Test
  public void Text_Expression_readonlyTrue(){
	  assertEquals(true,drv.Text_Expression_readonlyFalse());
	  assertEquals(false,drv.Text_Expression_readonlyFalse_button());
  }
  
  @Test
  public void Text_Expression_valueabc(){
	  drv.Text_Expression_valueabc("wed");
	  assertEquals(true,drv.Text_Expression_valueabc_button());
	  drv.Text_Expression_valueabc_clear();
	  drv.Text_Expression_valueabc("abc");
	  assertEquals(false,drv.Text_Expression_valueabc_button());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Text_Condition.class);
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
