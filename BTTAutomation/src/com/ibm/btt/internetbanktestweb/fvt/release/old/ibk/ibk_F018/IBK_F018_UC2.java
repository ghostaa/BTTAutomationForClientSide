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
public class IBK_F018_UC2 extends InternetBankTestWebMain_Class{
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
	    drv.IBK_F_018_UC2();
	}

	@Test
	public void UserInputAppend(){ //click append button to add default value into table
		drv.TableAppendFromInput_button();
		assertEquals("Henry",drv.getTable_name_view1().getText());
		assertEquals("35",drv.getTable_age_view1().getText());
		assertEquals("1234567890",drv.getTable_account_view1().getText());
	}
	
	@Test
	public void UserInputFill(){    //fill and new a record by self
		drv.getTableAppendFromInput_text().clear();
		drv.getTableAppendFromInput_text01().clear();
		drv.getTableAppendFromInput_text02().clear();
		drv.getTableAppendFromInput_text().sendKeys("Carol");
		drv.getTableAppendFromInput_text01().sendKeys("13");
		drv.getTableAppendFromInput_text02().sendKeys("100290390029");
		drv.TableAppendFromInput_button();
		assertEquals("Carol",drv.getTable_name_view2().getText());
		assertEquals("13",drv.getTable_age_view2().getText());
		assertEquals("100290390029",drv.getTable_account_view2().getText());
	}
	
	@Test
	public void UserInputSelect(){  //select one record and click select button, verify the text values equal to the selected record or not
		drv.table_name_view();
		drv.TableAppendFromInput_button01();
		assertEquals("Henry",drv.getTableAppendFromInput_text().getAttribute("value"));
		assertEquals("35",drv.getTableAppendFromInput_text01().getAttribute("value"));
		assertEquals("1234567890",drv.getTableAppendFromInput_text02().getAttribute("value"));
	}
	
	//TODO
/*	@Test
	public void UserInputEdit(){   //table is editable
		assertEquals("Henry",drv.getEditable_name());
	}
	*/
	@Test
	public void UserInputComplete() throws InterruptedException{    //click complete button, forward to index page
		drv.TableAppendFromInput_button02();
		assertEquals("Welcome to BTT sample page",drv.Index_Label().getText());
	}

	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,IBK_F018_UC2.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
