package com.ibm.btt.util;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.interactions.Actions;

import com.ibm.btt.common.drivercontroller.FirefoxDriverController;

public class InternetBankTestWebMain_Class extends Main_Class{
	public static String InternetBankTestWeb="InternetBankTestWeb";
	public static String baseUrl="http://9.181.95.52:8080/"+InternetBankTestWeb+"/";
	
	
	public static void setUp() throws Exception {
		Main_Class.defaultSetup();	
//		profile.setPreference("dom.disable_open_during_load", true);  
//		driver = new FirefoxDriverController().getFirefoxDriver(null,"c:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriverController().getFirefoxDriver();
		
		Window window = driver.manage().window();
		window.maximize();
		deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
		event=new Actions(driver);
	}

	
}
