package com.ibm.btt.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.ibm.btt.common.broswercontroller.Broswer;
import com.ibm.btt.common.drivercontroller.DriverController;
import com.ibm.btt.util.*;

public class Main_Class {
	
	public static WebDriver driver;

	public static Broswer broswer;
	public static DriverController driverController;

	private static Robot eventKey;
	public static FirefoxProfile profile = new FirefoxProfile();
	static Actions event;
	
	public static void defaultSetup(){
		//if your firefox is not installed in default path,please non-annotation.
		//System.setProperty("webdriver.firefox.bin", "d:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		//System.setProperty("webdriver.firefox.bin", "d:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//		driverController = driverController.switchDriverController(Broswer.FF);
		profile.setPreference("intl.accept_languages", "en-US");  
//		profile.setPreference("dom.disable_open_during_load", true);  
	}
	/*
	 * Delete all cookies
	 * Support: vndlmmli@cn.ibm.com
	 */
	public static void deleteAllCookies(){
		driver.manage().deleteAllCookies();
	}
	

	/*
	 * Get current page url
	 */
	public static String getCurrentURL(){
		return driver.getCurrentUrl();
	}
	
	/*
	 * Get Page title
	 */
	public static String getTitle(){
		return driver.getTitle();
	}
	
	/*
	 * Click widget to start new Window, switch to new Window
	 */
	public static void switchWindow(int index){
		String[] handles = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		driver.close();
		WebDriver childWindow = driver.switchTo().window(handles[index]);
	}
	
	/*
	 * id: widget id
	 * widget_moveToElement can implement some mouse events, such as mouseOver, mouseLeave and mouseEnter
	 */
	public void widget_moveToElement(String id){
		event.moveToElement(driver.findElement(By.id(id))).perform();
	}
	
	public void widget_moveToElementByXpath(String xpath){
		event.moveToElement(driver.findElement(By.xpath(xpath))).perform();
	}
	
	/*
	 *
	 */
	public static Boolean widget_isFocus(String id){
		WebElement currentElement = driver.switchTo().activeElement();
		if(id.equals(currentElement.getAttribute("id"))){
			return true;
		}else
			return false;
	}	
	
	/*
	 * Press Tab
	 */
	public static void widget_tabIndex(){
		/*keyPress(KeyEvent.VK_TAB);
		keyRelease(KeyEvent.VK_TAB);*/
		event.sendKeys(Keys.TAB).perform();
	}
	/**
	 * Use Shift+Tab to move the focus to front of  first tabindex widget as LostFocus's useage.
	 * @param w The first focused web element
	 */
	public static void moveToFrontOfFirstFocusWidget(WebElement w){
		event.sendKeys(w, Keys.chord(Keys.SHIFT,Keys.TAB)).perform();
		event.sendKeys(Keys.NULL);
	}
	/*
	 * Double click
	 */
	public void doubleClick(String id){
		event.doubleClick(driver.findElement(By.id(id))).perform();
	}
	
	/*
	 * Double click
	 */
	public void doubleClickByXpath(String xpath){
		event.doubleClick(driver.findElement(By.xpath(xpath))).perform();
	}
	
	/*
	 * Right click
	 */
	public void rightClick(){
		event.contextClick().perform();
	}

	/*
	 * keyDown
	 */
	public void keyDown(Keys theKey){
		event.keyDown(theKey).perform();
	}
	
	/*
	 * keyUp
	 */
	public void keyUp(Keys theKey){
		event.keyUp(theKey).perform();;
	}
	//按下任意键
	public static void pressAnyKey(CharSequence key){
		event.sendKeys(key).perform();
	}
	/*
	 * keyPress
	 * keycode: KeyEvent
	 */
	public  static void keyPress(int keycode){
		
		try {
			eventKey = new Robot();
			eventKey.keyPress(keycode);
			Thread.sleep(1000);			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public  static void executeCombinationKey(CharSequence ... combinationKey){
		/*String order = "";
		for(int i=0;i<combinationKey.length;i++){
			order+=combinationKey[i];
		}*/
		event.sendKeys(Keys.chord(combinationKey)).perform();
		//event.sendKeys(order).perform();
		event.sendKeys(Keys.NULL);
//		event.sendKeys(Keys.ALT,Keys.SHIFT,"a").perform();
	}
	/*
	 * keyRelease
	 * keycode: KeyEvent
	 */
	public static void keyRelease(int keycode){
		try{
			eventKey = new Robot();
			eventKey.keyRelease(keycode);
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	/*
	 * Mouse Hold
	 */
	public static void mouseHold(WebElement onElement){
		event.clickAndHold(onElement).perform();
		
	}
	/*
	 * Mouse Hold
	 */
	public static void mouseRelease(WebElement onElement){
		event.release(onElement).perform();
		
	}
	
	public static void waitUntilLoadElement(long second,final String elementID){
		(new WebDriverWait(driver, second)).until(new ExpectedCondition<WebElement>(){

			public WebElement apply(WebDriver dr) {

				return dr.findElement(By.id(elementID));

			}

		});
	}
	
	public void switchIframe(String id){
		driver.switchTo().frame(id);
		
	}
	
	public void switchDefaultIframe(){
		driver.switchTo().defaultContent();
	}
	
	public static Boolean isWebElementExist(By by) { 

        try { 

            driver.findElement(by);
            return true; 

        } catch(NoSuchElementException e) { 

            return false; 

        } 

    } 

}
