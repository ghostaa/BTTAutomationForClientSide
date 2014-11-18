package btt.allwidgets;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

public class Main_Page extends Index_Page{ 
	
//###############################For Label Main##################################	
	@FindBy(id="label_main_link")
	private WebElement Label_properties;
	
	@FindBy(id="label_main_link01")
	private WebElement Label_ECA;
	
	@FindBy(id="label_main_link02")
	private WebElement Label_CSS;
	
	@FindBy(id="label_main_link03")
	private WebElement Label_appearance;
	
	@FindBy(id="label_main_link03_copy")
	private WebElement Label_appearance1;

	
	public void label_properties(){
		Label_properties.click();
	}
	
	public void label_ECA(){
		Label_ECA.click();
	}
	
	public void label_CSS(){
		Label_CSS.click();
	}
	
	public void label_appearance(){
		Label_appearance.click();
	}
	
	public void label_appearance1(){
		Label_appearance1.click();
	}
//###############################For Label Main##################################

} 

