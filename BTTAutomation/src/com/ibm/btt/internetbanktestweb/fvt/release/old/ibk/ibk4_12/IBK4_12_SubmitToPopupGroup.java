package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk4_12;

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
public class IBK4_12_SubmitToPopupGroup extends InternetBankTestWebMain_Class{
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
	
	InternetBankTestWebMain_Class main_class = new InternetBankTestWebMain_Class();
	String record5Name = "";
	String record6Name = "";
	String record5Balance = "";
	
	@Test
	public void SubmitToGroupPage(){
		record5Name = drv.record5Name();
		record5Balance = drv.record5Balance();
		record6Name = drv.record6Name();
		drv.selectFive();
		main_class.keyDown(Keys.CONTROL);
		drv.selectSix();
		main_class.keyUp(Keys.CONTROL);
		drv.tableInGroupPopupButton();	
	}
	//TODO
	@Test
	public void IsValueCorrect(){
		assertEquals(record5Name,drv.record1AccountName());
		assertEquals(record5Balance,drv.record1AccountBalance());
		assertEquals(record6Name,drv.record2AccountName());
	}
	
	@Test
	public void ExitToMain(){
		drv.SubmitResultInGroupPage_link();
	}
	
	@AfterClass
	public static void tearDown(){
		Tools.snapshot((TakesScreenshot) driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK4_12_SubmitToPopupGroup.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if(!"".endsWith(verificationErrorString)){
			fail(verificationErrorString);
		}
	}
}
