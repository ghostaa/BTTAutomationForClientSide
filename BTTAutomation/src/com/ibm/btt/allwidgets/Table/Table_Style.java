package com.ibm.btt.allwidgets.Table;

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

public class Table_Style extends Main_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Table_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Table_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Table_widget();
    drv.Table_style();
    Main_Class.waitUntilLoadElement(20, "Table_Style_Table01_copy");
  }
  
  @Test
  public void table1_CCS1(){
	  assertEquals(2, drv.table1_CCS1());
  }
  
  @Test
  public void table1_CCS2_Even(){
	  assertEquals(1, drv.table1_CCS2_Even());
  }
  
  @Test
  public void table1_CCS2_Odd(){
	  assertEquals(1, drv.table1_CCS2_Odd());
  }
  
  @Test
  public void table1_CCS3(){
	  assertEquals(1, drv.table1_CCS3());
  }
  
  @Test
  public void table1_CCS4(){
	  assertEquals(1, drv.table1_CCS4());
  }
  
  @Test
  public void table1_CCS5_Header(){
	  assertEquals(1, drv.table1_CCS5_Header());
  }
  
  @Test
  public void table1_CCS5_cell(){
	  assertEquals(1, drv.table1_CCS5_cell());
  }
  
  @Test
  public void table2_Header1(){
	  assertEquals(2, drv.table2_Header1());
  }
  
  @Test
  public void table2_Header2(){
	  assertEquals(2, drv.table2_Header2());
  }
  
  @Test
  public void table2_Header3(){
	  assertEquals(2, drv.table2_Header3());
  }
  
  @Test
  public void table2_Header4(){
	  assertEquals(2, drv.table2_Header4());
  }
  
  @Test
  public void table2_Header5(){
	  assertEquals(2, drv.table2_Header5());
  }
  
  @Test
  public void table2_row01(){
	  assertEquals(3, drv.table2_row01());
  }
  
  @Test
  public void table2_row02(){
	  assertEquals(3, drv.table2_row02());
  }
  
  @Test
  public void table2_row03(){
	  assertEquals(3, drv.table2_row03());
  }
  
  @Test
  public void table2_row04(){
	  assertEquals(3, drv.table2_row04());
  }
  
  @Test
  public void table2_row05(){
	  assertEquals(3, drv.table2_row05());
  }
  
  @Test
  public void table2_row11(){
	  assertEquals(3, drv.table2_row11());
  }
  
  @Test
  public void table2_row12(){
	  assertEquals(3, drv.table2_row12());
  }
  
  @Test
  public void table2_row13(){
	  assertEquals(3, drv.table2_row13());
  }
  
  @Test
  public void table2_row14(){
	  assertEquals(3, drv.table2_row14());
  }
  
  @Test
  public void table2_row15(){
	  assertEquals(3, drv.table2_row15());
  }
  
  @Test
  public void table2_row41(){
	  assertEquals(4, drv.table2_row41());
  }
  
  @Test
  public void table2_row42(){
	  assertEquals(4, drv.table2_row42());
  }
  
  @Test
  public void table2_row43(){
	  assertEquals(4, drv.table2_row43());
  }
  
  @Test
  public void table2_row44(){
	  assertEquals(4, drv.table2_row44());
  }
  
  @Test
  public void table2_row45(){
	  assertEquals(4, drv.table2_row45());
  }
  
  @Test
  public void table2_row51(){
	  assertEquals(4, drv.table2_row51());
  }
  
  @Test
  public void table2_row52(){
	  assertEquals(4, drv.table2_row52());
  }
  
  @Test
  public void table2_row53(){
	  assertEquals(4, drv.table2_row53());
  }
  
  @Test
  public void table2_row54(){
	  assertEquals(4, drv.table2_row54());
  }
  
  @Test
  public void table2_row55(){
	  assertEquals(4, drv.table2_row55());
  }

  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Table_Style.class);
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
