package com.ibm.btt.allwidgets.Text;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ibm.btt.allwidgets.Label.Label_PageObject;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Text_submit extends Main_Class{
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
    drv.Text_submit();
  }

  @Test
  public void Text_100_subButton(){
	  assertEquals("true", drv.subButton());
  }
  
  @Test
  public void Text_110_subData(){
	  assertEquals("false", drv.subData());
	  drv.ButtonClick();
  }
  
  @Test
  public void Text_200_subResultString(){
	  AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "Text_submit_Result_text16");
	  assertEquals("aaa", drv.subResultString());
  }
  
  @Test
  public void Text_200_subResultDate(){
	  assertEquals("2015-05-21", drv.subResultDate());
  }
  
  @Test
  public void Text_200_subResultCurrency(){
	  assertEquals("$213.05", drv.subResultCurrency());
  }
  
  @Test
  public void Text_200_subResultNumber(){
	  assertEquals("123", drv.subResultNumber());
  }
  
  @Test
  public void Text_200_subResultXMLGregorianCalendar(){
	  assertEquals("2015-05-26", drv.subResultXMLGregorianCalendar());
  }
  
  @Test
  public void Text_200_subResultByte(){
	  assertEquals("12", drv.subResultByte());
  }
  
  @Test
  public void Text_200_subResultShort(){
	  assertEquals("23", drv.subResultShort());
  }
  
  @Test
  public void Text_200_subResultInteger(){
	  assertEquals("123", drv.subResultInteger());
  }
  
  @Test
  public void Text_200_subResultLong(){
	  assertEquals("123", drv.subResultLong());
  }
  
  @Test
  public void Text_200_subResultFloat(){
	  assertEquals("21.45", drv.subResultFloat());
  }
  
  @Test
  public void Text_200_subResultDouble(){
	  assertEquals("23.456", drv.subResultDouble());
  }
  
  @Test
  public void Text_200_subResultBigInteger(){
	  assertEquals("234", drv.subResultBigInteger());
  }
  
  @Test
  public void Text_200_subResultBigDecimal(){
	  assertEquals("334.563", drv.subResultBigDecimal());
  }
  
  @Test
  public void Text_200_subResultIsMandatoryT(){
	  assertEquals("123", drv.subResultIsMandatoryT());
  }
  
  @Test
  public void Text_200_subResultIsMandatoryF(){
	  assertEquals("", drv.subResultIsMandatoryF());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Text_submit.class);
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
