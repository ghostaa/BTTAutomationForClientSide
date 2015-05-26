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
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class CheckBox_submit extends AllWidgetsProjectMain_Class{
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
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, CheckBox_PageObject.class);
//  driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.BTT8200_tab();
    drv.CheckBox_widget();
    drv.CheckBox_submmit();
  }

  @Test
  public void CheckBox_submit_getTooltip() throws InterruptedException{
	  assertEquals("Please check the String checkBox", drv.CheckBox_submit_getTooltip());
  }
  
  @Test
  public void CheckBox_submit_TooltipVerify(){
	  assertEquals(false, drv.CheckBox_submit_TooltipVerify());
  }
  
  @Test
  public void CheckBox_submit_clickButton() throws InterruptedException{
	  drv.CheckBox_submit_clickButton();
	  Thread.sleep(3000);
  }
  
  @Test
  public void CheckBox_Result_String(){
	  assertEquals("true", drv.CheckBox_Result_String());
	  assertEquals("String",drv.CheckBox_Result_String_label());
  }
  
  @Test
  public void CheckBox_Result_Date(){
	  assertEquals("true", drv.CheckBox_Result_Date());
	  assertEquals("2014-08-10", drv.CheckBox_Result_Date_label());
  }
  
  @Ignore
  public void CheckBox_Result_Duration(){
	  assertEquals("true", drv.CheckBox_Result_Duration());
	  assertEquals("63609099622001", drv.CheckBox_Result_Duration_label());
  }
  
  @Test
  public void CheckBox_Result_Short(){
	  assertEquals("true",drv.CheckBox_Result_Short());
	  assertEquals("5",drv.CheckBox_Result_Short_label());
  }
  
  @Test
  public void CheckBox_Result_Double(){
	  assertEquals("true",drv.CheckBox_Result_Double());
	  assertEquals("25.000",drv.CheckBox_Result_Double_label());
  }
  
  @Test
  public void CheckBox_Result_Boolean(){
	  assertEquals(true,drv.CheckBox_Result_Boolean());
	  assertEquals("true",drv.CheckBox_Result_Boolean_label());
  }
  
  @Test
  public void CheckBox_Result_Currency(){
	  assertEquals("true",drv.CheckBox_Result_Currency());
	  assertEquals("$12.00",drv.CheckBox_Result_Currency_label());
  }
  
  @Test
  public void CheckBox_Result_XMLGregorianCalendar(){
	  assertEquals("true",drv.CheckBox_Result_XMLGregorianCalendar());
	  assertEquals("2014-07-19",drv.CheckBox_Result_XMLGregorianCalendar_label());
  }
  
  @Test
  public void CheckBox_Result_Long(){
	  assertEquals("true",drv.CheckBox_Result_Long());
	  assertEquals("18",drv.CheckBox_Result_Long_label());
  }
  
  @Test
  public void CheckBox_Result_BigInteger(){
	  assertEquals("true",drv.CheckBox_Result_BigInteger());
	  assertEquals("1,000",drv.CheckBox_Result_BigInteger_label());
  }
  
  @Test
  public void CheckBox_Result_Integer(){
	  assertEquals("true",drv.CheckBox_Result_Integer());
	  assertEquals("1",drv.CheckBox_Result_Integer_label());
  }
  
  @Test
  public void CheckBox_Result_Number(){
	  assertEquals("true",drv.CheckBox_Result_Number());
	  assertEquals("7",drv.CheckBox_Result_Number_label());
  }
  
  @Test
  public void CheckBox_Result_Byte(){
	  assertEquals("true",drv.CheckBox_Result_Byte());
	  assertEquals("3",drv.CheckBox_Result_Byte_label());
  }
  
  @Test
  public void CheckBox_Result_Float(){
	  assertEquals("true",drv.CheckBox_Result_Float());
	  assertEquals("1.20",drv.CheckBox_Result_Float_label());
  }
  
  @Test
  public void CheckBox_Result_BigDecimal(){
	  assertEquals("true",drv.CheckBox_Result_BigDecimal());
	  assertEquals("1.200",drv.CheckBox_Result_BigDecimal_label());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,CheckBox_submit.class);
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
