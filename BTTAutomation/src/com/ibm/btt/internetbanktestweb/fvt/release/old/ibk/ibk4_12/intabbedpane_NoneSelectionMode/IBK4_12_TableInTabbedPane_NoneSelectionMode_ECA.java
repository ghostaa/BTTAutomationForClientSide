package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane_NoneSelectionMode;

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
public class IBK4_12_TableInTabbedPane_NoneSelectionMode_ECA extends InternetBankTestWebMain_Class{
	private static IBK4_12_TableInTabbedPane_NoneSelectionMode_PageObject drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setup() throws Exception{
		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, IBK4_12_TableInTabbedPane_NoneSelectionMode_PageObject.class);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.IBK4_12TableExtension();
	}
	
	
	@Test
	public void EnterTableInTabbedPane(){
		drv.tableInTabbedPaneLink();
		drv.NonEditableTableInTabbedPane_ContentPane06();
	}

	@Test
	public void LinkEca1(){
		drv.NoneSelectionMode_LinkECA();
		drv.dijit_MenuItem_3_text();
		assertEquals("menuitem110",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId33",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void LinkEca2(){
		drv.NoneSelectionMode_LinkECA();
		drv.dijit_MenuItem_4_text();
		assertEquals("menuitem111",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId33",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void LinkEcaEnglish(){
		drv.NoneSelectionMode_LinkECA();
		drv.dijit_MenuItem_5_text();
		assertEquals("menuitem112",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId33",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void LinkEcamenuitem113(){
		drv.NoneSelectionMode_LinkECA();
		drv.dijit_MenuItem_6_text();
		assertEquals("menuitem113",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId33",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void LinkEcamenuitem114(){
		drv.NoneSelectionMode_LinkECA();
		drv.dijit_MenuItem_7_text();
		assertEquals("menuitem114",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId33",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void LinkEcamenuitem115(){
		drv.NoneSelectionMode_LinkECA();
		drv.dijit_MenuItem_8_text();
		assertEquals("menuitem115",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId33",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void LinkEcamenuitem116(){
		drv.NoneSelectionMode_LinkECA();
		drv.dijit_MenuItem_9_text();
		assertEquals("menuitem116",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId33",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void ButtonECA(){
		Actions action = new Actions(driver);
		action.contextClick(drv.NoneSelectionMode_ButtonECA()).perform();
		drv.dijit_MenuItem_21_text();
		assertEquals("D1",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId63",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void ButtonECA2(){
		Actions action = new Actions(driver);
		action.contextClick(drv.NoneSelectionMode_ButtonECA()).perform();
		drv.dijit_MenuItem_22_text();
		assertEquals("D2",drv.NonEditableTableInTabbedPane_showMenuItemId());
		assertEquals("columnId63",drv.NonEditableTableInTabbedPane_showWidgetId());
	}
	
	@Test
	public void ButtonECAClose(){
		Actions action = new Actions(driver);
		action.contextClick(drv.NoneSelectionMode_ButtonECA()).perform();
		drv.ButtonECA_Close();
	}
	
	@Test
	public void BackToMain(){
		drv.NonEditableTableInTabbedPane_link();
	}
	
	@AfterClass
	public static void tearDown(){
		Tools.snapshot((TakesScreenshot) driver, InternetBankTestWebMain_Class.InternetBankTestWeb, IBK4_12_TableInTabbedPane_NoneSelectionMode_ECA.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".endsWith(verificationErrorString)){
			fail(verificationErrorString);
		}
	}

}
