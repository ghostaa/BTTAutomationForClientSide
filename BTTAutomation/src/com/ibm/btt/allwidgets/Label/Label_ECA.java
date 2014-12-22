package com.ibm.btt.allwidgets.Label;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
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

import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;



public class Label_ECA extends Main_Class{
  /*public static WebDriver driver;
  private static String baseUrl = Main_Class.baseUrl;*/
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  private static Label_PageObject drv;

  @BeforeClass
  public static void setUp() throws Exception {
	/*driver = new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseUrl);*/
	Main_Class.setUp();
	drv=PageFactory.initElements(driver, Label_PageObject.class);
//	drv.setObject(driver);
	drv.Establish();
    drv.BTT8200_tab();
    drv.Label_widget();
    drv.label_ECA(); 
  }

//###############################For Label Event######################################  
  @Test
  public void Evt_onclick(){
	  assertEquals("click ok", drv.Evt_onclick());
  }

  @Test
  public void Evt_onMouseup(){
	  assertEquals("'onMouseup ok'", drv.Evt_onMouseup());
  }

  @Test
  public void Evt_onMouseLeave(){
	  assertEquals("'onMouseLeave ok'", drv.Evt_onMouseLeave());
  }

  @Test
  public void Evt_onMouseMove(){
	  assertEquals("onMouseMove ok", drv.Evt_onMouseMove());
  }

  @Test
  public void Evt_onMouseEnter(){
	  assertEquals("onMouseEnter ok", drv.Evt_onMouseEnter());
  }

  @Test
  public void Evt_onMousedown(){
	  assertEquals("onMouseDown ok", drv.Evt_onMousedown());
  }
//###############################For Label Event######################################
//###############################For Label Condition##################################
  @Test
  public void ID_exp(){
	  drv.ID_exp();
	  assertEquals("ok", drv.ID_exp_getText());
  }

  @Test
  public void Text_exp(){
	  drv.Text_exp();
	  assertEquals("ok",drv.Text_exp_getText());
  }

  @Test
  public void ID_false(){
	  drv.ID_false();
	  assertEquals("false",drv.ID_false_getText());
  }

  @Test
  public void ID_visibility(){
	  drv.ID_visibility();
	  assertEquals("ok",drv.ID_visibility_getText());
  }
//###############################For Label Condition##################################
//###############################For Label Action#####################################
  @Test
  public void css_check(){
	  assertEquals(1,drv.Evt_stylecss());
  }
  
  @Test
  public void actHidden(){
	  assertEquals(false, drv.actHidden());
  }

  @Test
  public void actGone(){
	  assertEquals(false, drv.actGone());
  }

  @Test
  public void actShow(){
	  assertEquals(true, drv.actShow());
  }

  @Test
  public void actChange(){
	  assertEquals("text ok", drv.actChange());
  }

//###############################For Label Action#####################################
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, Main_Class.allwidgets,Label_ECA.class);
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