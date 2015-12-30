package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_11;

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

import com.ibm.btt.allwidgets.Button.Button_PageObject;
import com.ibm.btt.allwidgets.Button.Button_appearance1;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

public class LinkMultiWidgetByTooling extends InternetBankTestWebMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static IBK4_11_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	InternetBankTestWebMain_Class.setUp();
    drv=PageFactory.initElements(driver, IBK4_11_PageObject.class);
//	    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.IBK_FVT_tab();
    drv.IBK_4_11();
    drv.LinkMultiWidgetByTooling();
 
  }

  @Test
  public void tableHeaderText(){
	  String[] headerText = drv.tableHeaderText();
	  assertEquals("column0", headerText[0]);
	  assertEquals("column1", headerText[1]);
	  assertEquals("column2", headerText[2]);
	  assertEquals("link", headerText[3]);
	  assertEquals("submit", headerText[4]);
  }
  
 /* @Test
  public void LinkColumn1(){
	  assertEquals("column1", drv.LinkColumn1());
  }
  
  @Test
  public void LinkColumn2(){
	  assertEquals("column2", drv.LinkColumn2());
  }
  
  @Test
  public void LinkLink(){
	  assertEquals("link", drv.LinkLink());
  }
  
  @Test
  public void LinkSubmit(){
	  assertEquals("submit", drv.LinkSubmit());
  }
  
  @Test
  public void LinkField0(){
	  assertEquals("field0", drv.LinkField0());
  }
  
  @Test
  public void LinkAccount0(){
	  assertEquals("account0", drv.LinkAccount0());
  }
  
  @Test
  public void LinkData0(){
	  assertEquals("data0", drv.LinkData0());
  }
  
  @Test
  public void LinkECA01_Menu0Item0(){
	  assertEquals("RowIndex: 0;MenuId: menu0_item0;WidgetId: columnId3_link1", drv.LinkECA01_Menu0Item0());
  }
  
  @Test
  public void LinkECA01_Menu0Item1(){
	  assertEquals("RowIndex: 0;MenuId: menu0_item1;WidgetId: columnId3_link1", drv.LinkECA01_Menu0Item1());
  }*/
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,LinkMultiWidgetByTooling.class);
	driver.quit();
	//driver.navigate().refresh();
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
