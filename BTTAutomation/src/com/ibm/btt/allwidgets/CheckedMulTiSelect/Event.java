package com.ibm.btt.allwidgets.CheckedMulTiSelect;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Event {
  private static WebDriver driver;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  
  @BeforeClass
  public static void setUp() throws Exception {
	driver = new FirefoxDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get(baseUrl + "InternetBankTestWeb/");
    driver.findElement(By.linkText("Establish Session")).click();
    driver.findElement(By.id("index_tabbedPane_tablist_index_ContentPane05")).click();
    driver.findElement(By.id("index_link60")).click();
    driver.findElement(By.id("CheckedMultiSelect_main_link04")).click();
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_23 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onBlur
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_3 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onClick
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_13 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onFocus
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_113 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onChange
    Actions builder = new Actions(driver); 
   // Robot robot = new Robot(); 
    WebElement e2=driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_83 > div.dijitInline.dojoxMultiSelectItemLabel"));
   // e2.click()
   // robot.keyPress(java.awt.event.KeyEvent.VK_M);
   // builder.click(e2).sendKeys("M");
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_63 > div.dijitInline.dojoxMultiSelectItemLabel"))).click().perform();//MouseUp
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_73 > div.dijitInline.dojoxMultiSelectItemLabel"))).click().perform();//MouseDown
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_83 > div.dijitInline.dojoxMultiSelectItemLabel"))).perform();//MouseEnter
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_93 > div.dijitInline.dojoxMultiSelectItemLabel"))).perform();//MouseLeave
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_103 > div.dijitInline.dojoxMultiSelectItemLabel"))).perform();//MouseMouse
  }

  @Test
  public void testonClick(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label02")).getText());
  }
  
  @Test
  public void onChange(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label21")).getText());
  }
  
  @Test
  public void onBlur(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label11")).getText());
  }
  
  @Test
  public void onFocus(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label04")).getText());  
  }
  
  @Test
  public void onMouseDown(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label15")).getText());
  }
  @Test
  public void onMouseUp(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label16")).getText());
  }
  @Test
  public void onMouseEnter(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label17")).getText());
  }
  @Test
  public void onMouseLeave(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label18")).getText());
  }
  @Test
  public void onMouseMove(){
	  assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label20")).getText());
  }
 
  /*@Test
  public void testUntitled() throws Exception {
   
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*link=Establish Session[\\s\\S]*$"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_23 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onBlur
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_3 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onClick
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_13 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onFocus
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_113 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//onChange
    Actions builder = new Actions(driver); 
   // Robot robot = new Robot(); 
    WebElement e2=driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_83 > div.dijitInline.dojoxMultiSelectItemLabel"));
   // e2.click()
   // robot.keyPress(java.awt.event.KeyEvent.VK_M);
   // builder.click(e2).sendKeys("M");
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_63 > div.dijitInline.dojoxMultiSelectItemLabel"))).click().perform();//MouseUp
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_73 > div.dijitInline.dojoxMultiSelectItemLabel"))).click().perform();//MouseDown
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_83 > div.dijitInline.dojoxMultiSelectItemLabel"))).perform();//MouseEnter
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_93 > div.dijitInline.dojoxMultiSelectItemLabel"))).perform();//MouseLeave
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_103 > div.dijitInline.dojoxMultiSelectItemLabel"))).perform();//MouseMouse
    //builder.moveByOffset(100, 100);
    verify();
 //   Robot robot = new Robot(); 
 
    
  //  Actions builder = new Actions(driver); 

  //find the begin webelement and click 

//  WebElement e1 = driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_30 > div.dijitInline.dojoxMultiSelectItemLabel")); 

 // e1.click();  
 // builder.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform(); 

  
    
    //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*=CheckedMultiSelect event[\\s\\S]*$"));
  }*/
  
 private void verify(){
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label02")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label04")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label11")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label12")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label13")).getText()); 
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label14")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label15")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label16")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label17")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label18")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label20")).getText());
	 assertEquals(result_txt, driver.findElement(By.id("CheckedMultiSelect_event_label21")).getText());
  }
 public void showCheckPoint(){
		//test result summary
		//start, define in Difrective.class
		showTestCheckPointStart(checkPoint);
		for (int i=0;i<checkPoint.size();i++) {
			int num=i+1;
			System.out.println("point "+num+" is:");
			System.out.println(checkPoint.get(i));
		}
		//start, define in Difrective.class
		showTestCheckPointEnd();
		
	}
	
	public void showTestCheckPointStart(java.util.List<String> checkPoint){
		System.out.println("\n\n============================================");
		System.out.println("Test Result Summary:      ");
		System.out.println("============================================");
		System.out.println("Total check points: " + checkPoint.size());
	}
	public void showTestCheckPointEnd(){
		//System.out.println("====================end=====================");
	}
	 
 
 
    

  @AfterClass
  public static void tearDown() throws Exception {
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
