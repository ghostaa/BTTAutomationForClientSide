package com.ibm.btt.allwidgets.Tree;

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
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;

public class Tree_Condition extends AllWidgetsProjectMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static Tree_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	AllWidgetsProjectMain_Class.setUp();
    drv=PageFactory.initElements(driver, Tree_PageObject.class);
    drv.Establish();
    drv.BTT8200_tab();
    drv.Tree_widget();
    drv.Tree_condition();
  }

  @Test
  public void conIsFocusable(){
	  assertEquals("is focus true", drv.conIsFocusable());
  }
  
  @Test
  public void conSelectedLable(){
	  assertEquals("Tree_condition_tree", drv.conSelectedLable());
  }
  
  @Test
  public void conNLS(){
	  assertEquals("NlS is true", drv.conNLS());
  }
  
  @Test
  public void conSelectedValue(){
	  assertEquals("selectValue is true", drv.conSelectedValue());
  }
  
  @Test
  public void conFocus(){
	  assertEquals("The tree isFocusable is true", drv.conFocus());
  }
  
  @Test
  public void conTreeId(){
	  assertEquals("ID of the tree is Tree_condition_tree", drv.conTreeId());
  }
  
  @Test
  public void conVisibility(){
	  assertEquals("The tree visibility is true", drv.conVisibility());
  }
  
  @Test
  public void conValue(){
	  assertEquals("root.level1-1.level3-1", drv.conValue());
  }
  
  @Test
  public void conGetID(){
	  assertEquals("Tree_condition_tree", drv.conGetID());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, AllWidgetsProjectMain_Class.allwidgets,Tree_Condition.class);
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
