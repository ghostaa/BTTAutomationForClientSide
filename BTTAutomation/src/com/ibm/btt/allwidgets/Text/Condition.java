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
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Condition{
  private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Text_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);
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
	  assertEquals(false, drv.Text_condition_disable_button());
  }
  
  @Test
  public void TakeSnapshot(){
	  try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 Tools.snapshot((TakesScreenshot)driver, PropertiesUtil.allwidgets,Condition.class);
  }
  

  @AfterClass
  public static void tearDown() throws Exception {
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
