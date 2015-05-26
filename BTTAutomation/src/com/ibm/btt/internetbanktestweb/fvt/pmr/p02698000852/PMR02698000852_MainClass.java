package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.ibm.btt.common.drivercontroller.FirefoxDriverController;
import com.ibm.btt.common.drivercontroller.InternetExplorerDriverController;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Main_Class;

public class PMR02698000852_MainClass extends InternetBankTestWebMain_Class{
	
	public static void setUp() throws Exception {
		Main_Class.defaultSetup();	
		profile.setPreference("intl.accept_languages", "vi");  
//		profile.setPreference("dom.disable_open_during_load", true);  
//		driver = new FirefoxDriver(profile);
		
		
//		driver =new InternetExplorerDriverController().getInternetExplorerDriver();
		driver = new FirefoxDriverController().getFirefoxDriver(profile);
		
		Window window = driver.manage().window();
		window.maximize();
		deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(InternetBankTestWebMain_Class.baseUrl);
		
	}
}
