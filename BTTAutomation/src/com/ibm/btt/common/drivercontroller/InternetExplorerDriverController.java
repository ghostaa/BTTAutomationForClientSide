package com.ibm.btt.common.drivercontroller;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class InternetExplorerDriverController extends DriverController {
	
	
	public InternetExplorerDriverController(){
		
		
	}
	public InternetExplorerDriver getInternetExplorerDriver(){
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\IEDriverServer.exe"); 
		DesiredCapabilities ieCapabilities = DesiredCapabilities.internetExplorer();   
		ieCapabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);  
		ieCapabilities.setCapability("ignoreProtectedModeSettings", true);
		return new InternetExplorerDriver(ieCapabilities); 
	}
	
	
}
