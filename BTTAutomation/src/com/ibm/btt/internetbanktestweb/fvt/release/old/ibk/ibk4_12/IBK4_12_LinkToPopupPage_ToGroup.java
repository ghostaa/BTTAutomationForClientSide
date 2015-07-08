package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12;

import static org.junit.Assert.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK4_12_LinkToPopupPage_ToGroup extends InternetBankTestWebMain_Class{
	private static IBK4_12_PageObject drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setup() throws Exception{
		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, IBK4_12_PageObject.class);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.IBK4_12TableExtension();
	}
	
	@Test
	public void LinkToTableInPopup(){  //Link to 'table in group' page
		drv.tableInGroupPopupLink();
	}
	
	@Test
	public void LinkToPopupPage_ToGroup(){
		drv.PopupPage1AccountName();
		String accountName = drv.getPopupPage1AccountName(); //because of pane page is a new page, so save value into parameter
		String accountBalance = drv.getPopupPage1AccountBalance();
		drv.NonEditableTableInGroup_button_label();
		assertEquals(accountName,drv.SelectionResultInGroupPage_label01());
		assertEquals(accountBalance,drv.SelectionResultInGroupPage_label05());
		drv.SelectionResultInGroupPage_link_copy();
	}
	
	@AfterClass
	public static void tearDown(){
		Tools.snapshot((TakesScreenshot) driver, InternetBankTestWebMain_Class.InternetBankTestWeb, IBK4_12_LinkToPopupPage_ToGroup.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".equals(verificationErrorString)){
			fail(verificationErrorString);
		}
	}

}
