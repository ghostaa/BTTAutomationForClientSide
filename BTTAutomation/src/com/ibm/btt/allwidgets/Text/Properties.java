package com.ibm.btt.allwidgets.Text;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Properties{
  private static WebDriver driver;
  private static String baseUrl=PropertiesUtil.baseUrl;
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
    drv.Text_Properties();
    Thread.sleep(2000);
    Tools.snapshot((TakesScreenshot)driver, PropertiesUtil.allwidgets,Properties.class);
  }

  @Test
  public void Text_id(){
	  assertEquals("", drv.Text_properties_id_getText());
  }
  
  @Test
  public void Text_visibility(){
	  assertEquals(true, drv.Text_properties_visible());
  }
  
  @Test
  public void Text_hidden(){
	  assertEquals(false, drv.Text_properties_hidden());
  }
  
  @Test
  public void Text_gone(){
	  assertEquals(false, drv.Text_properties_gone());
  }
  
  @Test
  public void Text_disableTrue(){
	  assertEquals("true", drv.Text_properties_disableTrue());
  }
  
  @Test
  public void Text_disableFalse(){
	  assertEquals(true, drv.Text_properties_disableFalse());
  }
  
  @Test
  public void Text_readonlyTrue(){
	  assertEquals("true", drv.Text_properties_readonlyTrue());
  }
  
  @Test
  public void Text_readonlyFalse(){
	  assertEquals(true, drv.Text_properties_readonlyFalse());
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
