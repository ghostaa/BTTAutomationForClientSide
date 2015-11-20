package com.ibm.btt.allwidgets.Image;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Tools;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Image_ActionTab extends AllWidgetsProjectMain_Class{
 /* private static WebDriver driver;
  private static String baseUrl = PropertiesUtil.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Image_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    /*driver = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl);*/
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Image_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.image_widget();
    drv.Image_actionTab();
  }
  
  @Test
  public void Image_ActionTab_100_actTabNewFlow(){
	  assertEquals("Image_actionTab", drv.actTabNewFlow());
  }
  
  @Test
  public void Image_ActionTab_110_actTabChangeFlow(){
	  drv.Image_actionTab();
	  assertEquals("BTT8200 FVT", drv.actTabChangeFlow());
  }
  
  @Test
  public void Image_ActionTab_120_actTabOperation() throws Exception{
	  drv.BTT8200_tab();
	  drv.image_widget();
	  drv.Image_actionTab();
	  assertEquals("BTT8200 FVT", drv.actTabOperation());
  }

  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Image_ActionTab.class);
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
