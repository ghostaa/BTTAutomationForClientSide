package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_TableInTabbedPane_dataNameButton extends InternetBankTestWebMain_Class{
	private static IBK4_12_TableInTabbedPane_PageObject drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setup() throws Exception{
		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, IBK4_12_TableInTabbedPane_PageObject.class);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.IBK4_12TableExtension();
	}
	
	
	@Test
	public void EnterTableInTabbedPan(){
		drv.tableInTabbedPaneLink();
		drv.NonEditableTableInTabbedPane_ContentPane10();
	}
	//TODO
	@Test
	public void dataNameForLink(){
		drv.dataNameforButton();
		assertEquals("百度一下",drv.baiduId());
	}
	
	@AfterClass
	public static void tearDown(){
		Tools.snapshot((TakesScreenshot) driver, InternetBankTestWebMain_Class.InternetBankTestWeb, IBK4_12_TableInTabbedPane_dataNameButton.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".endsWith(verificationErrorString)){
			fail(verificationErrorString);
		}
	}

}
