package btt.allwidgets.Label;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import btt.allwidgets.Index_Page;
import btt.allwidgets.Main_Page;

public class Label_PageObject extends Main_Page{ 
	
	@FindBy(id="label_ECA_label04")
	private WebElement ID_exp_result;
	
	public String ID_exp_getText(){
		return ID_exp_result.getText();
	}
	
	@FindBy(id="label_ECA_label03")
	private WebElement ID_exp;
	
	@FindBy(id="label_ECA_label01")
	private WebElement Text_exp;
	
	@FindBy(id="label_ECA_label07")
	private WebElement ID_false;
	
	@FindBy(id="label_ECA_label05")
	private WebElement ID_visibility;
	
	public void ID_exp(){
		ID_exp.click();
	}
	
	public void Text_exp(){
		Text_exp.click();
	}
	
	public void ID_false(){
		ID_false.click();
	}
	
	public void ID_visibility(){
		ID_visibility.click();
	}

	

} 

