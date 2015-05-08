package com.ibm.btt.util;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;


import com.ibm.btt.util.*;

public class Main_Class {
	
	public static WebDriver driver;
	public static String allwidgets="allwidgets";
	public static String baseUrl="http://localhost:8080/AllWidgetsProject/";
//	public static String baseUrl="http://9.125.67.24:8080/AllWidgetsProject/";
//	public static String baseUrl="http://9.186.117.118:8080/AllWidgetsProject";
	private static Robot eventKey;
	
	Actions event = new Actions(driver);
	
	public static void setUp() throws Exception {

//		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
		FirefoxProfile profile = new FirefoxProfile();  
		profile.setPreference("intl.accept_languages", "en-US");  
		driver = new FirefoxDriver(profile);

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
	
	/*
	 * 
	 */
/*	public static String[] elementList(String id){
		List<WebElement> elements = (ArrayList<WebElement>) driver.findElements(By.id(id));
		String[] str = new String[elements.size()];
		for(WebElement element: elements){
			element.getText();	
		}
	}*/
	public static void elementList1(String xpathExpression){
		List<WebElement> elements = driver.findElements(By.id(xpathExpression));
		for(WebElement element: elements){
			System.out.println("element:"+element);
		}
	
	}
		
		public static void waitUntilLoadElement(long second,final String elementID){
			(new WebDriverWait(driver, second)).until(new ExpectedCondition<WebElement>(){

				public WebElement apply(WebDriver dr) {

					return dr.findElement(By.id(elementID));

				}

			});
		}
		
		
}
