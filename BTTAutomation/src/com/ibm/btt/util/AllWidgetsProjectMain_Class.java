package com.ibm.btt.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.ibm.btt.common.drivercontroller.FirefoxDriverController;
import com.ibm.btt.common.drivercontroller.InternetExplorerDriverController;

public class AllWidgetsProjectMain_Class extends Main_Class{
	public static String allwidgets="AllWidgetsProject";
//	public static String baseUrl="http://9.181.95.120:8080/"+allwidgets+"/";
	public static String baseUrl="http://9.115.33.83:8080/"+allwidgets+"/";

	public static void setUp() throws Exception {
		Main_Class.defaultSetup();	
		profile.setPreference("intl.accept_languages", "en-US");  
//		profile.setPreference("dom.disable_open_during_load", true);  
//		driver = new FirefoxDriverController().getFirefoxDriver(null,"d:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriverController().getFirefoxDriver(profile);
//		driver = new InternetExplorerDriverController().getInternetExplorerDriver();
		Window window = driver.manage().window();
		window.maximize();
		deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		event=new Actions(driver);
	}

}
