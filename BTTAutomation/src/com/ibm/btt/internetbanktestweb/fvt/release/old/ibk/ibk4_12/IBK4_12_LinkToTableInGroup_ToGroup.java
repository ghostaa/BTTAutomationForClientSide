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
public class IBK4_12_LinkToTableInGroup_ToGroup extends InternetBankTestWebMain_Class{
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
	public void LinkToTableInGroup(){   //Link to 'table in group' page
		drv.tableInGroupLink(); 
	}
	
	@Test
	public void LinkToTableInGroup_ToGroupPage(){  //button - to group popup page
		drv.TableInGroupAccountName();
		drv.NonEditableTableInGroup_button();
		assertEquals(drv.getTableInGroupAccountName(),drv.SelectionResultInGroupPage_label01());
		assertEquals(drv.getTableInGroupAccountBalance(),drv.SelectionResultInGroupPage_label05());
		drv.SelectionResultInGroupPage_link_copy();
	}

	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK4_12_LinkToTableInGroup_ToGroup.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
