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

public class Table_Event extends Main_Class{

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
    drv.Table_event();
    Main_Class.waitUntilLoadElement(20, "Table_ECA_Event_table");
  }

  @Test
  public void evtOnClick(){
	  assertEquals("click table", drv.evtOnClick());
  }
  
  @Test
  public void evtOnKeyDown(){
	  assertEquals("key down", drv.evtOnKeyDown());
  }
  
  @Test
  public void evtOnKeypress(){
	  assertEquals("key press", drv.evtOnKeypress());
  }
  
  @Test
  public void evtOnKeyUp(){
	  assertEquals("key up", drv.evtOnKeyUp());
  }
  
  @Test
  public void evtonFocus(){
	  assertEquals("table focus", drv.evtonFocus());
  }
  
  @Test
  public void evtOnBlur(){
	  assertEquals("table blur", drv.evtOnBlur());
  }
  
  @Test
  public void evtOnMouseDown(){
	  assertEquals("mouse down", drv.evtOnMouseDown());
  }
  
  @Test
  public void evtOnMouseUp(){
	  assertEquals("mouse up", drv.evtOnMouseUp());
  }
  
  @Test
  public void event_onMouseEnter(){
	  assertEquals("mouse enter", drv.evtOnMouseEnter());
  }
  
  @Test
  public void event_onMouseLeave(){
	  assertEquals("mouse leave", drv.evtOnMouseLeave());
  }
   
  @Test
  public void event_onMouseMove(){
	  assertEquals("mouse move", drv.evtOnMouseMove());
  }
  
  @Test
  public void evtOnSelected(){
	  assertEquals("onSelected, this label will be changed to 'table's selected'", drv.evtOnSelected());
  }
  
  @Test
  public void evtOnRowClick(){
	  assertEquals("click row", drv.evtOnRowClick());
  }
  
  @Test
  public void evtOnRowDbClick(){
	  assertEquals("double click row", drv.evtOnRowDbClick());
  }
  
  @Test
  public void evtOnSelected2(){
	  assertEquals("table's selected", drv.evtOnSelected2());
  }
  
  @Test
  public void evtOnRowClick2(){
	  assertEquals("click row", drv.evtOnRowClick2());
  }
  
  @Test
  public void evtOnRowDbClick2(){
	  assertEquals("double click row", drv.evtOnRowDbClick2());
  }
   
  @Test
  public void evtOnCellEdit(){
	  assertEquals("cell edit", drv.evtOnCellEdit());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Table_Event.class);
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
