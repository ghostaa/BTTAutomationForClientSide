package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12.intabbedpane;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_TableInTabbedPane_NormalTab_ToGroup extends InternetBankTestWebMain_Class{
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
	
	InternetBankTestWebMain_Class main_class = new InternetBankTestWebMain_Class();
	String helen2AccountName = "";
	String helen2AccountBalance = "";
	String helen3AccountName = "";
	
	@Test
	public void EnterTableInTabbedPan(){
		drv.tableInTabbedPaneLink();
		drv.NonEditableTableInTabbedPane_ContentPane01();
	}
	
	@Test
	public void NormalTabSelect(){
		helen2AccountName = drv.getHelen2AccountName();
		helen2AccountBalance = drv.getHelen2AccountBalance();
		helen3AccountName = drv.getHelen3AccountName();
		drv.Helen2AccountName();
		main_class.keyDown(Keys.CONTROL);
		drv.Helen3AccountName();
		main_class.keyUp(Keys.CONTROL);
		drv.NonEditableTableInTabbedPane_button_label();
	}
	
	//TODO  34版本可以，38版本就有问题
	@Test
	public void ResultInGroupPage(){
		assertEquals(helen2AccountName,drv.Helen2AccountNameResult());
		assertEquals(helen2AccountBalance,drv.Helen2AccountBalanceResult());
		assertEquals(helen3AccountName,drv.Helen3AccountNameResult());
	}
	
	@Test
	public void ExitToMain(){
		drv.SelectionResultInGroupPage_link_copy();
	}
	
	@AfterClass
	public static void tearDown(){
		Tools.snapshot((TakesScreenshot) driver, InternetBankTestWebMain_Class.InternetBankTestWeb, IBK4_12_TableInTabbedPane_NormalTab_ToGroup.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".endsWith(verificationErrorString)){
			fail(verificationErrorString);
		}
	}

}
