package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_31;

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

public class IBK_31 extends InternetBankTestWebMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static IBK_31_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	InternetBankTestWebMain_Class.setUp();
    drv=PageFactory.initElements(driver, IBK_31_PageObject.class);
//	    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.IBK_FVT_tab();
    drv.IBK31();
 
  }

  @Test
  public void TableStructureTr1Td1(){
	assertEquals("td", drv.TableStructureTr1Td1());
  }
  
  @Test
  public void TableStructureTr1Td2(){
	assertEquals("td", drv.TableStructureTr1Td2());
  }
  
  @Test
  public void TableStructureTr2Td1(){
	assertEquals("td", drv.TableStructureTr2Td1());
  }
  
  @Test
  public void TableStructureTr2Td2(){
	assertEquals("td", drv.TableStructureTr2Td2());
  }
  
  @Test
  public void TableStructureTr3Td(){
	assertEquals("td", drv.TableStructureTr3Td());
  }
  
  @Test
  public void TableStructureTr4Td1(){
	assertEquals("td", drv.TableStructureTr4Td1());
  }

  @Test
  public void TableStructureTr4Td2(){
	assertEquals("td", drv.TableStructureTr4Td2());
  }
  
  @Test
  public void GroupDiv11(){
	assertEquals("div", drv.GroupDiv11());
  }
  
  @Test
  public void GroupDiv12(){
	assertEquals("div", drv.GroupDiv12());
  }
  
  @Test
  public void GroupDiv21(){
	assertEquals("div", drv.GroupDiv21());
  }
  
  @Test
  public void GroupDiv22(){
	assertEquals("div", drv.GroupDiv22());
  }
  
  @Test
  public void TabbedPaneDiv11(){
	assertEquals("div", drv.TabbedPaneDiv11());
  }
  
  @Test
  public void TabbedPaneDiv22(){
	assertEquals("div", drv.TabbedPaneDiv22());
  }
  
  @Test
  public void TabbedPaneDiv33(){
	assertEquals("div", drv.TabbedPaneDiv33());
  }
  
  @Test
  public void TabbedPaneDiv44(){
	assertEquals("div", drv.TabbedPaneDiv44());
  }
  
  @Test
  public void TabbedPaneDiv53(){
	assertEquals("div", drv.TabbedPaneDiv53());
  }
  
  @Test
  public void TabbedPaneDiv62(){
	assertEquals("div", drv.TabbedPaneDiv62());
  }
  
  @Test
  public void TabbedPaneDiv71(){
	assertEquals("div", drv.TabbedPaneDiv71());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK_31.class);
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
