package com.ibm.btt.allwidgets.CheckedMulTiSelect;

import java.awt.Robot;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.opera.core.systems.internal.input.KeyEvent;
//import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.openqa.selenium.remote.server.handler.interactions.MouseUp;
import java.util.*;

public class Properties {
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
    driver.findElement(By.id("CheckedMultiSelect_main_link")).click();
    

    
   //String Fcss=First_css.getAttribute("class");
    
    
    //*[@id='CheckedMultiSelect_css_form']/div/div[2]/div[2]
    //*[@id='widget_CheckedMultiSelect_css_checkedMultiSelect_copy']
    
    
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
  public void id(){
	  String result=driver.findElement(By.xpath(".//*[@id='widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy08']/div[2]")).getAttribute("id");
	  assertEquals(result,"CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy08");	  
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
