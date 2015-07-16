package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane_MultipleSelectionMode;

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
public class IBK4_12_TableInTabbedPane_MultipleSelectionMode_ECA extends InternetBankTestWebMain_Class{
	private static IBK4_12_TableInTabbedPane_MultiSelectionMode_PageObject drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setup() throws Exception{
		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, IBK4_12_TableInTabbedPane_MultiSelectionMode_PageObject.class);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.IBK4_12TableExtension();
	}
	
	@Test
	public void EnterTableInTabbedPane(){
		drv.tableInTabbedPaneLink();
		drv.NonEditableTableInTabbedPane_ContentPane07();
	}

	@Test
	public void LinkEca1(){
		drv.MutipleSelectionMode_LinkECA();
		drv.dijit_MenuItem_60_text();
		assertEquals("Hi,I'm item 700",drv.NonEditableTableInTabbedPane_show1());
	}
	
	@Test
	public void LinkEca2(){
		drv.MutipleSelectionMode_LinkECA();
		drv.dijit_MenuItem_61_text();
		assertEquals("Hi,I'm item 701 ~",drv.NonEditableTableInTabbedPane_show1());
	}
	
	@Test
	public void ButtonECA(){
		Actions action = new Actions(driver);
		action.contextClick(drv.MutipleSelectionMode_ButtonECA()).perform();
		drv.dijit_MenuItem_73_text();
		assertEquals("Hi,my widgetId iscolumnId62",drv.NonEditableTableInTabbedPane_show2());
	}
	
	@Test
	public void ButtonECA2(){
		Actions action = new Actions(driver);
		action.contextClick(drv.MutipleSelectionMode_ButtonECA()).perform();
		drv.dijit_MenuItem_74_text();
		assertEquals("HI ,mywidgetId is columnId62 ,my itemId is 731",drv.NonEditableTableInTabbedPane_show2());
	}
	
	@Test
	public void BackToMain(){
		drv.NonEditableTableInTabbedPane_link();
	}
	
	@AfterClass
	public static void tearDown(){
		Tools.snapshot((TakesScreenshot) driver, InternetBankTestWebMain_Class.InternetBankTestWeb, IBK4_12_TableInTabbedPane_MultipleSelectionMode_ECA.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".endsWith(verificationErrorString)){
			fail(verificationErrorString);
		}
	}

}
