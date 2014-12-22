package com.ibm.btt.util;

import static com.ibm.btt.util.Main_Class.baseUrl;
import static com.ibm.btt.util.Main_Class.driver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.ibm.btt.util.*;
public class Main_Class {
	
	public static WebDriver driver;
	public static String allwidgets="allwidgets";
	public static String baseUrl="http://localhost:8080/InternetBankTestWeb/";
	private static Robot eventKey;
	
	Actions event = new Actions(driver);
	
	public static void setUp() throws Exception {
		driver = new FirefoxDriver();
		Window window = driver.manage().window();
		window.maximize();
		deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
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
	 * Click widget to start new Window, switch to new Window
	 */
	public static String switchWindow(){
		String[] handles = new String[driver.getWindowHandles().size()];
		driver.getWindowHandles().toArray(handles);
		driver.close();
		WebDriver childWindow = driver.switchTo().window(handles[1]);
		return driver.getCurrentUrl(); 
	}
	
	/*
	 * id: widget id
	 * widget_moveToElement can implement some mouse events, such as mouseOver, mouseLeave and mouseEnter
	 */
	public void widget_moveToElement(String id){
		event.moveToElement(driver.findElement(By.id(id))).perform();
	}
	
	/*
	 * Verify widget isFocus by attribute
	 * attrValue can be acquired from runtime html
	 * e.g. id="Radio_properties_radio24"
	 * attrValue = "Radio_properties_radio24"
	 * attr = "id"
	 * css_select: input:focus, img:focus and so on
	 */
	public static Boolean widget_isFocus(String attrValue, String attr, String css_selector){
		String attrValue1 = driver.findElement(By.cssSelector(css_selector)).getAttribute(attr);
		if(attrValue.equals(attrValue1)){
			return true;
		}else
			return false;
	}	
	
	/*
	 * Press Tab
	 */
	public static void widget_tabIndex(){
		keyPress(KeyEvent.VK_TAB);
		keyRelease(KeyEvent.VK_TAB);
	}
	
	/*
	 * Double click
	 */
	public void doubleClick(String id){
		event.doubleClick(driver.findElement(By.id(id))).perform();
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
	
}
