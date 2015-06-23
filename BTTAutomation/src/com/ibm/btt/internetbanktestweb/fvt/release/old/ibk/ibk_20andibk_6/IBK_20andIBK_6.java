package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_20andibk_6;

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

public class IBK_20andIBK_6 extends InternetBankTestWebMain_Class{

  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private static IBK_20andIBK_6_PageObject drv;
  

  @BeforeClass
  public static void setUp() throws Exception {
    
	InternetBankTestWebMain_Class.setUp();
    drv=PageFactory.initElements(driver, IBK_20andIBK_6_PageObject.class);
//	    driver.navigate().to(Main_Class.baseUrl);
    drv.Establish();
    drv.IBK_FVT_tab();
    drv.IBK20AndIBK6();
 
  }

  @Test
  public void IBK20_Text1(){
	String[] strings = drv.IBK20_Text1();
	 for(int i = 0; i < strings.length; i++){
			assertEquals("This is line" + (i + 1), strings[i]);
		}
  }
  
  @Test
  public void IBK20_Text2(){
	  assertEquals("This is line", drv.IBK20_Text2());
  }
  
  @Test
  public void IBK20_Text3(){
	  assertEquals("This is line1 This is line2 This is line3 This is line4 This is line5 This is line6 This is line7 This is line8", drv.IBK20_Text3());
  }
  
  @Test
  public void Combo_dataNameForList(){
	  assertEquals("selectedData", drv.Combo_dataNameForList());
  }
  
  @Test
  public void SubmitButtonF(){
	  assertEquals("true", drv.SubmitButtonF());
  }
  
  @Test
  public void Combo_isMandatory(){
	  assertEquals("This value is required.", drv.Combo_isMandatory());
  }
  
  @Test
  public void SubmitButtonT(){
	  assertEquals("false", drv.SubmitButtonT());
  }
  
  @Test
  public void Combo_urlForList(){
	  assertEquals("selectedData2", drv.Combo_urlForList());
  }
  
  @Test
  public void Combo_LableDataNameForList(){
	  assertEquals("selectedData3", drv.Combo_LableDataNameForList());
  }
  
  @Test
  public void Combo_LableurlForList(){
	  assertEquals("selectedData4", drv.Combo_LableurlForList());
  }
  
  @Test
  public void FinalPage(){
	  drv.ComboSubmit();
	  assertEquals("This is the final page of the sample flow", drv.FinalPage());
  }
  
  @AfterClass
  public static void tearDown() throws Exception {
	Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK_20andIBK_6.class);
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
