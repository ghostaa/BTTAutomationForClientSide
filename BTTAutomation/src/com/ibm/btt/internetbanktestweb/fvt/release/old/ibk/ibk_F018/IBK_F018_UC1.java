package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F018;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

/***SUPPORT  BY  Jing GR Shang****/
public class IBK_F018_UC1 extends InternetBankTestWebMain_Class{
	private static IBK_F018_PageObject drv;
	private static StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUp() throws Exception {

		InternetBankTestWebMain_Class.setUp();
		drv=PageFactory.initElements(driver, IBK_F018_PageObject.class);
//	    driver.navigate().to(InternetBankTestWebMain_Class.baseUrl);
	    drv.Establish();
	    drv.IBK_FVT_tab();
	    drv.IBK_F_018TableDataAppend();
	    drv.IBK_F_018_UC1();
	}

	@Test
	public void tableAppendAjaxOperation(){
		drv.TableAppendFromOp_button();
		assertEquals("A_Append_",drv.getTableAppend_00().getText().toString().substring(0,9));
		drv.TableAppend_02();
		assertEquals("false",drv.getUC1_OK_button().getAttribute("aria-disabled"));
	}
	
	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK_F018_UC1.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
