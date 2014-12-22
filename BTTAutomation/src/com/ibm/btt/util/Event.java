package com.ibm.btt.util;

import org.openqa.selenium.interactions.Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.ibm.btt.allwidgets.Label.*;

public class Event {
	
//	private static WebDriver driver;
	private static Robot eventKey;
	
//	public void setWebDriver(WebDriver driver){
//		this.driver = driver;
//	}
	
	Actions event = new Actions(com.ibm.btt.allwidgets.Label.Label_ECA.driver); 
	
	public  void event_id(String id){
		event.moveToElement(com.ibm.btt.allwidgets.Label.Label_ECA.driver.findElement(By.id(id))).perform();
	}
	
	public  static void keyPress(int keycode){
		
		try {
			eventKey = new Robot();
			eventKey.keyPress(keycode);
			Thread.sleep(2000);			
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void keyRelease(int keycode){
		try{
			eventKey = new Robot();
			eventKey.keyRelease(keycode);
			Thread.sleep(2000);
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
