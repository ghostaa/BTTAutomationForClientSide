package com.ibm.btt.allwidgets.Tree;

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
import com.ibm.btt.util.Event;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
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
  public void Tree_100_conIsFocusable(){
	  assertEquals("is focus true", drv.conIsFocusable());
  }
  
  @Test
  public void Tree_110_conSelectedLable(){
	  assertEquals("Tree_condition_tree", drv.conSelectedLable());
  }
  
  @Test
  public void Tree_120_conNLS(){
	  assertEquals("NlS is true", drv.conNLS());
  }
  
  @Test
  public void Tree_130_conSelectedValue(){
	  assertEquals("selectValue is true", drv.conSelectedValue());
  }
  
  @Test
  public void Tree_140_conFocus(){
	  assertEquals("The tree isFocusable is true", drv.conFocus());
  }
  
  @Test
  public void Tree_150_conTreeId(){
	  assertEquals("ID of the tree is Tree_condition_tree", drv.conTreeId());
  }
  
  @Test
  public void Tree_160_conVisibility(){
	  assertEquals("The tree visibility is true", drv.conVisibility());
  }
  
  @Test
  public void Tree_170_conValue(){
	  assertEquals("root.level1-1.level3-1", drv.conValue());
  }
  
  @Test
  public void Tree_180_conGetID(){
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
