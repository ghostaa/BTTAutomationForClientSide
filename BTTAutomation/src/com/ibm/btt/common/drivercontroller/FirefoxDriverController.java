package com.ibm.btt.common.drivercontroller;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FirefoxDriverController extends DriverController{
	
	public FirefoxProfile profile = new FirefoxProfile();
	public FirefoxDriverController(){
		profile.setPreference("intl.accept_languages", "en-US");  
	}
	public FirefoxDriverController(FirefoxProfile profile){
		this.profile=profile; 
	}
	
	public FirefoxDriver getFirefoxDriver(){
		return new FirefoxDriver(profile);
	}
	
	public FirefoxDriver getFirefoxDriver(FirefoxProfile profile){
		if(profile == null){
			profile=this.profile;
		}
		return new FirefoxDriver(profile);
	}
	
	public FirefoxDriver getFirefoxDriver(FirefoxProfile profile,String firefoxPath){
		if(profile == null){
			profile=this.profile;
		}
		System.setProperty("webdriver.firefox.bin", firefoxPath);
		return new FirefoxDriver(profile);
	}
}
