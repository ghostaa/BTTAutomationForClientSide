package com.ibm.btt.util;

import static org.junit.Assert.assertEquals;

import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InternetBankTestWebMain_Class extends Main_Class{
	public static WebDriver driver;
	public static String InternetBankTestWeb="InternetBankTestWeb";
	public static String baseUrl="http://9.181.95.52:8080/InternetBankTestWeb/";
//	public static String baseUrl="http://9.125.67.24:8080/AllWidgetsProject/";
//	public static String baseUrl="http://9.186.117.118:8080/AllWidgetsProject";
	private static Robot eventKey;
	
	Actions event = new Actions(driver);
	
	public static void setUp() throws Exception {

//		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
//		driver = new FirefoxDriver();
		FirefoxProfile profile = new FirefoxProfile();  
		profile.setPreference("intl.accept_languages", "en-US");  
//		profile.setPreference("dom.disable_open_during_load", true);  
		driver = new FirefoxDriver(profile);

		Window window = driver.manage().window();
		window.maximize();
		deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	public static void deleteAllCookies(){
		driver.manage().deleteAllCookies();
	}
	
	public static void waitUntilLoadElement(long second,final String elementID,WebDriver driver){
		(new WebDriverWait(driver, second)).until(new ExpectedCondition<WebElement>(){

			public WebElement apply(WebDriver dr) {

				return dr.findElement(By.id(elementID));

			}

		});
	}
	
}
