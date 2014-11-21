package btt.Util;

import org.openqa.selenium.interactions.Actions;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import btt.allwidgets.Label.*;

public class Event {
	/*WebDriver driver;
	public Event(){
		driver = ECA.driver;
	}*/
	
	Actions event = new Actions(ECA.driver); 
	
	public  void event_id(String id){
		event.moveToElement(ECA.driver.findElement(By.id(id))).perform();
	}

}
