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

public class Table_Condition extends Main_Class{

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
    drv.Table_condition();
    Main_Class.waitUntilLoadElement(20, "Table_ECA_Condition_table01_copy02");
  }
//This table's eca condition - widget function	  
  @Test
  public void conFocus(){
	  assertEquals(1,drv.conFocus());
  }
  
  @Test
  public void conFocusable(){
	  assertEquals("focusable",drv.conFocusable());
  }
  
  @Test
  public void conVisibleT(){
	  assertEquals("true",drv.conVisibleT());
  }
  
  @Test
  public void conVisibleF(){
	  assertEquals("false",drv.conVisibleF());
  }
//This table's eca condition - widget property
  @Test
  public void conDisable(){
	  assertEquals("disabled",drv.conDisable());
  }
  
  @Test
  public void conReadonly(){
	  assertEquals("readonly",drv.conReadonly());
  }
//This table's eca condition - expression - widget property  
  @Test
  public void conId(){
	  assertEquals("correct",drv.conId());
  }
  
  @Test
  public void conDisableF(){
	  assertEquals("wrong",drv.conDisableF());
  }
  
  @Test
  public void conReadonlyT(){
	  assertEquals("the second table is readonly",drv.conReadonlyT());
  }
  
  @Test
  public void conColIndex(){
	  assertEquals("correct",drv.conColIndex());
  }
  
  @Test
  public void conRowIndex(){
	  assertEquals("correct",drv.conRowIndex());
  }
//This table's eca condition - widget function  
  @Test
  public void conIsFocusable(){
	  assertEquals("correct",drv.conIsFocusable());
  }
  
  @Test
  public void conGetValueInFirstSelectedItem(){
	  assertEquals("correct",drv.conGetValueInFirstSelectedItem());
  }
  
  @Test
  public void conGetValueInSelectedItem(){
	  assertEquals("correct",drv.conGetValueInSelectedItem());
  }
  
  @Test
  public void conVisableF(){
	  assertEquals("false",drv.conVisableF());
  }
  
  @Test
  public void conGetLengthOfSelectedRows(){
	  assertEquals("3 rows are selected",drv.conGetLengthOfSelectedRows());
  }
  
  @Test
  public void conIsColumnVisible(){
	  assertEquals("correct",drv.conIsColumnVisible());
  }
  
  @Test
  public void conGetCellValueByIndex(){
	  assertEquals("correct",drv.conGetCellValueByIndex());
  }
  
  @Test
  public void conGetCellValuetByName(){
	  assertEquals("correct",drv.conGetCellValuetByName());
  }
  
  @Test
  public void conGetCellObjectByName(){
	  assertEquals("correct",drv.conGetCellObjectByName());
  }
  
  @Test
  public void conObjectInFirstSelectedItem(){
	  assertEquals("correct",drv.conObjectInFirstSelectedItem());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Table_Condition.class);
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
