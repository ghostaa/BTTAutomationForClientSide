package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_31;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
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

public class IBK_31_TableAndDivLayout extends InternetBankTestWebMain_Class{

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
  public void FormTr1Td1(){
	assertEquals("td", drv.FormTr1Td1());
  }
  
  @Test
  public void FormTr1Td2(){
	assertEquals("td", drv.FormTr1Td2());
  }
  
  @Test
  public void FormTr1Td2RowSpan(){
	assertEquals("4", drv.FormTr1Td2RowSpan());
  }
  
  @Test
  public void FormTr2Td(){
	assertEquals("td", drv.FormTr2Td());
  }
  
  @Test
  public void FormTr3Td(){
	assertEquals("td", drv.FormTr3Td());
  }
  
  @Test
  public void FormTr4Td(){
	assertEquals("td", drv.FormTr4Td());
  }
  
  @Test
  public void GroupTr1Td1(){
	assertEquals("td", drv.GroupTr1Td1());
  }
  
  @Test
  public void GroupTr1Td1RowSpan(){
	assertEquals("2", drv.GroupTr1Td1RowSpan());
  }
  
  @Test
  public void GroupTr1Td2(){
	assertEquals("td", drv.GroupTr1Td2());
  }
  
  @Test
  public void GroupTr2Td(){
	assertEquals("td", drv.GroupTr2Td());
  }
  
  @Test
  public void TabbedPaneTr1Td(){
	assertEquals("td", drv.TabbedPaneTr1Td());
  }
  
  @Test
  public void TabbedPaneTr1TdColSpan(){
	assertEquals("4", drv.TabbedPaneTr1TdColSpan());
  }
  
  @Test
  public void TabbedPaneTr2Td2(){
	assertEquals("td", drv.TabbedPaneTr2Td2());
  }
  
  @Test
  public void TabbedPaneTr3Td3(){
	assertEquals("td", drv.TabbedPaneTr3Td3());
  }
  
  @Test
  public void TabbedPaneTr4Td4(){
	assertEquals("td", drv.TabbedPaneTr4Td4());
  }
  
  @Test
  public void TabbedPaneTr5Td3(){
	assertEquals("td", drv.TabbedPaneTr5Td3());
  }
  
  @Test
  public void TabbedPaneTr6Td2(){
	assertEquals("td", drv.TabbedPaneTr6Td2());
  }
  
  @Test
  public void TabbedPaneTr7Td(){
	assertEquals("td", drv.TabbedPaneTr7Td());
  }
  
  @Test
  public void TabbedPaneTr7TdColSpan(){
	assertEquals("4", drv.TabbedPaneTr7TdColSpan());
  }
  
 //non combine div layout

  @Test
  public void FormDiv11(){
	drv.skipToNonCombine();
	assertEquals("div", drv.FormDiv11());
  }
  
  @Test
  public void FormDiv12(){
	assertEquals("div", drv.FormDiv12());
  }
  
  @Test
  public void FormDiv21(){
	assertEquals("div", drv.FormDiv21());
  }
  
  @Test
  public void FormDiv22(){
	assertEquals("div", drv.FormDiv22());
  }
  
  @Test
  public void FormDiv31(){
	assertEquals("div", drv.FormDiv31());
  }
  
  @Test
  public void FormDiv32(){
	assertEquals("div", drv.FormDiv32());
  }
  
  @Test
  public void FormDiv41(){
	assertEquals("div", drv.FormDiv41());
  }
  
  @Test
  public void FormDiv42(){
	assertEquals("div", drv.FormDiv42());
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
  
  @Test
  public void finalPage(){
	  drv.skipToFinalPage();
	assertEquals("This is the final page of the sample flow", drv.finalPage());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK_31_TableAndDivLayout.class);
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

