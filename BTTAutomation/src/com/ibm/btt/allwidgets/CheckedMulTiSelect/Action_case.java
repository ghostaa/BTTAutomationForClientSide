package com.ibm.btt.allwidgets.CheckedMulTiSelect;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
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

public class Action_case {
  private static WebDriver driver;
  public static boolean visibilty=false;
  public static boolean hidden=false;
  public static boolean gone=false;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  
  @BeforeClass
  public static void setUp() throws Exception {
	driver = new FirefoxDriver();
	// System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
	// WebDriver driver = new ChromeDriver();
    baseUrl = "http://localhost:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    Actions builder = new Actions(driver);
    driver.get(baseUrl + "InternetBankTestWeb/");
    driver.findElement(By.linkText("Establish Session")).click();
    driver.findElement(By.id("index_tabbedPane_tablist_index_ContentPane05")).click();
    driver.findElement(By.id("index_link60")).click();
    driver.findElement(By.id("CheckedMultiSelect_main_link07")).click();
    driver.findElement(By.id("CheckedMultiSelect_action_label05")).click();
    driver.findElement(By.id("CheckedMultiSelect_action_label07")).click();//visibility
    if(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_33 > div.dijitInline.dojoxMultiSelectItemLabel")).isDisplayed())
    	visibilty=true;
    driver.findElement(By.id("CheckedMultiSelect_action_label10")).click();//hidden
    if (!driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_33 > div.dijitInline.dojoxMultiSelectItemLabel")).isDisplayed())
    	hidden=true;
    driver.findElement(By.id("CheckedMultiSelect_action_label08")).click();//disabled=true
    driver.findElement(By.id("CheckedMultiSelect_action_label16")).click();//readonly=true
    driver.findElement(By.id("CheckedMultiSelect_action_label18")).click();//hint
    driver.findElement(By.id("CheckedMultiSelect_action_label20")).click();//action group
    /*driver.findElement(By.id("CheckedMultiSelect_action_label10")).click();//gone
    	{
    		boolean test=driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_33 > div.dijitInline.dojoxMultiSelectItemLabel")).isDisplayed();
    		WebElement btn=driver.findElement(By.xpath("id('dojox_form__CheckedMultiSelectItem_30')"));
    	}*/
   
  /*  try {
        assertFalse(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_33 > div.dijitInline.dojoxMultiSelectItemLabel")).isDisplayed());
      } catch (Error e) {
        verificationErrors.append(e.toString());
      }*/

   // WebElement btn=driver.findElement(By.className("widget_CheckedMultiSelect_action_checkedMultiSelect01"));
    //WebElement btn1=driver.findElement(By.className("dijit dijitReset dijitInline dijitLeft setBorder dojoxCheckedMultiSelect dojoxCheckedMultiSelectFocused dijitFocused"));
   // java.util.List<WebElement> cheeses=driver.findElements(By.className("dijit dijitReset dijitInline dijitLeft setBorder dojoxCheckedMultiSelect dojoxCheckedMultiSelectFocused dijitFocused"));
    //String stylecss=btn1.getCssValue("class");
    //String stylecss1=btn1.getCssValue("lang");
    
    
    //System.out.println("styleclass:"+stylecss+stylecss1);
    /*driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_3 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//isFocusable
    Actions builder = new Actions(driver);
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_13 > div.dijitInline.dojoxMultiSelectItemLabel"))).click().perform();//disabled
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_23 > div.dijitInline.dojoxMultiSelectItemLabel"))).click().perform();//readonly=true
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_33 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//isFocusable
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_43 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//id
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_53 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//value
    builder.moveToElement(driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_63 > div.dijitInline.dojoxMultiSelectItemLabel"))).click().perform();//visibility=true
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_73 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//visibility=false
    driver.findElement(By.cssSelector("#dojox_form__CheckedMultiSelectItem_83 > div.dijitInline.dojoxMultiSelectItemLabel")).click();//readonly=false
*/    
      
  }

  @Test
  public void disabled(){
	  WebElement btn=driver.findElement(By.id(("dijit_form_CheckBox_40")));
	  assertFalse(btn.isEnabled());
  }
  @Test
  public void readonly(){
	  WebElement btn=driver.findElement(By.id(("dijit_form_CheckBox_53")));
	  assertTrue(btn.isEnabled());//For readonly
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
