package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

public class IBK4_12_TableInTabbedPane_SelectionMode_Result_PageObject  extends Index_Page{


	// Submit By ChangeFlowEvent
	
	@FindBy(id="ContextMenuResultForEvent_link")   //back link
	private WebElement ContextMenuResultForEvent_link;
	public void ContextMenuResultForEvent_link(){
		ContextMenuResultForEvent_link.click();
	}
	
	@FindBy(id="ContextMenuResultForEvent_label")   //LinkName
	private WebElement ContextMenuResultForEvent_label;
	public void ContextMenuResultForEvent_label(){
		ContextMenuResultForEvent_label.click();
	}
	
	@FindBy(id="ContextMenuResultForEvent_label09")   //Button_URLAndSubmit
	private WebElement ContextMenuResultForEvent_label09;
	public void ContextMenuResultForEvent_label09(){
		ContextMenuResultForEvent_label09.click();
	}
	
	@FindBy(id="ContextMenuResultForEvent_label14")   //text-result
	private WebElement ContextMenuResultForEvent_label14;
	public void ContextMenuResultForEvent_label14(){
		ContextMenuResultForEvent_label14.click();
	}
	
	@FindBy(id="ContextMenuResultForEvent_label16")   //Do you feel Happy?
	private WebElement ContextMenuResultForEvent_label16;
	public void ContextMenuResultForEvent_label16(){
		ContextMenuResultForEvent_label16.click();
	}
	
	@FindBy(id="ContextMenuResultForEvent_label17")   //combo
	private WebElement ContextMenuResultForEvent_label17;
	public void ContextMenuResultForEvent_label17(){
		ContextMenuResultForEvent_label17.click();
	}
	
	// Submit By Launch New Flow
	@FindBy(id="ContextMenuSubmitResult_label")   //result label
	private WebElement ContextMenuSubmitResult_label;
	public void ContextMenuSubmitResult_label(){
		ContextMenuSubmitResult_label.click();
	}
	
	@FindBy(id="ContextMenuSubmitResult_label03")   //Link_NoAction
	private WebElement ContextMenuSubmitResult_label03;
	public void ContextMenuSubmitResult_label03(){
		ContextMenuSubmitResult_label03.click();
	}
	
	@FindBy(id="ContextMenuSubmitResult_Label01")   //Button_URLAndSubmit
	private WebElement ContextMenuSubmitResult_Label01;
	public void ContextMenuSubmitResult_Label01(){
		ContextMenuSubmitResult_Label01.click();
	}
	
	@FindBy(id="ContextMenuSubmitResult_label14")   //DataOutOfTable1
	private WebElement ContextMenuSubmitResult_label14;
	public void ContextMenuSubmitResult_label14(){
		ContextMenuSubmitResult_label14.click();
	}
	
	@FindBy(id="ContextMenuSubmitResult_label16")   //Do you feel Happy?
	private WebElement ContextMenuSubmitResult_label16;
	public void ContextMenuSubmitResult_label16(){
		ContextMenuSubmitResult_label16.click();
	}
	
	@FindBy(id="ContextMenuSubmitResult_label17")   //combo
	private WebElement ContextMenuSubmitResult_label17;
	public void ContextMenuSubmitResult_label17(){
		ContextMenuSubmitResult_label17.click();
	}
}
