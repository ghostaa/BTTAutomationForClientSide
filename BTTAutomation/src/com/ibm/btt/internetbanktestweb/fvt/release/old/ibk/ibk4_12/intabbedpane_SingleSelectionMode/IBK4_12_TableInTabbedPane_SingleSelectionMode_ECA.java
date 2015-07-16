package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane_SingleSelectionMode;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_TableInTabbedPane_SingleSelectionMode_ECA extends InternetBankTestWebMain_Class{
	private static IBK4_12_TableInTabbedPane_SingleSelectionMode_PageObject drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setup() throws Exception{
		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, IBK4_12_TableInTabbedPane_SingleSelectionMode_PageObject.class);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.IBK4_12TableExtension();
	}
	
	@Test
	public void EnterTableInTabbedPane(){
		drv.tableInTabbedPaneLink();
		drv.NonEditableTableInTabbedPane_ContentPane08();
	}

	@Test
	public void LinkEca1(){
		Actions action = new Actions(driver);
		action.contextClick(drv.SingleSelectionMode_LinkECA()).perform();
		drv.dijit_MenuItem_34_text();
		assertEquals("Link0",drv.NonEditableTableInTabbedPane_label17());
	}
	
	@Test
	public void LinkEca2(){
		Actions action = new Actions(driver);
		action.contextClick(drv.SingleSelectionMode_LinkECA()).perform();
		drv.dijit_MenuItem_35_text();
		assertEquals("B-Submit0",drv.NonEditableTableInTabbedPane_label17());
	}
	
	@Test
	public void ButtonECA(){
		drv.SingleSelectionMode_ButtonECA();
		drv.dijit_MenuItem_47_text();
		//TODO
	}
	
	@Test
	public void ButtonECA2(){
		drv.SingleSelectionMode_ButtonECA();
		drv.dijit_MenuItem_48_text();
		//TODO
	}
	
	@Test
	public void ButtonECAClose(){
		drv.SingleSelectionMode_ButtonECA();
		drv.ButtonECA_Close();
	}
	
	@Test
	public void BackToMain(){
		drv.NonEditableTableInTabbedPane_link();
	}
	
	@AfterClass
	public static void tearDown(){
		Tools.snapshot((TakesScreenshot) driver, InternetBankTestWebMain_Class.InternetBankTestWeb, IBK4_12_TableInTabbedPane_SingleSelectionMode_ECA.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".endsWith(verificationErrorString)){
			fail(verificationErrorString);
		}
	}

}
