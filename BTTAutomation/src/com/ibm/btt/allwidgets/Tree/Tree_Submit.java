package com.ibm.btt.allwidgets.Tree;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;

public class Tree_Submit extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Tree_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Tree_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Combo_widget();
    drv.Combo_submit();
  }
  
  @Test
  public void subButtonBefore(){
	  assertEquals(false, drv.subButton());
  }
  
  @Test
  public void subString(){
	  assertEquals("Please select Country1.", drv.subString());
	  drv.subStringClick();
  }
  
  @Test
  public void subByteTooltip() throws InterruptedException{
	  Thread.sleep(1000);
	  assertEquals("Must select one.", drv.subByteTooltip());
	  drv.subByte();
  }
  
  @Test
  public void subIsMandatoryTooltip() throws InterruptedException{
	  Thread.sleep(1000);
	  assertEquals("This is required.", drv.subIsMandatoryTooltip());
	  drv.submit_isMandatory();
  }
  
  @Test
  public void subButton(){
	  assertEquals(true, drv.subButton());
	  drv.Submit();
  }
//result  
 /* @Test
  public void resString(){
	  assertEquals("Country1", drv.resString());
  }
  
  @Test
  public void resDate(){
	  assertEquals("2014-07-07", drv.resDate());
  }
  
  @Test
  public void resCurrency(){
	  assertEquals("$38,643,092.00", drv.resCurrency());
  }
  
  @Test
  public void resNumber(){
	  assertEquals("961,292,493", drv.resNumber());
  }
  
  @Test
  public void resBoolean(){
	  assertEquals("true", drv.resBoolean());
  }
  
  @Test
  public void resDuration(){
	  assertEquals("63543252022000", drv.resDuration());
  }
  
  @Test
  public void resXMLGregorianCalendar(){
	  assertEquals("2012-07-18", drv.resXMLGregorianCalendar());
  }
  
  @Test
  public void resByte(){
	  assertEquals("98", drv.resByte());
  }
  
  @Test
  public void resShort(){
	  assertEquals("-12,321", drv.resShort());
  }
  
  @Test
  public void resInteger(){
	  assertEquals("439,510,631", drv.resInteger());
  }
  
  @Test
  public void resLong(){
	  assertEquals("315,161,000,238,006", drv.resLong());
  }
  
  @Test
  public void resFloat(){
	  assertEquals("3.12", drv.resFloat());
  }
  
  @Test
  public void resDouble(){
	  assertEquals("8.220", drv.resDouble());
  }
  
  @Test
  public void resBigInteger(){
	  assertEquals("123", drv.resBigInteger());
  }
  
  @Test
  public void resBigDecimal(){
	  assertEquals("274,774,257.729", drv.resBigDecimal());
  }
  
  @Test
  public void resisMandatoryT(){
	  assertEquals("aaa", drv.resisMandatoryT());
  }
  
  @Test
  public void resisMandatoryF(){
	  assertEquals("", drv.resisMandatoryF());
  }
  
  @Test
  public void resurlForList(){
	  assertEquals("CHINA", drv.resurlForList());
  }
 */
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Tree_Submit.class);
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
