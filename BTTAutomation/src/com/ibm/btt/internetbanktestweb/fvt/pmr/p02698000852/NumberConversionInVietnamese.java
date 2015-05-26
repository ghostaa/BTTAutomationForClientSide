package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

//PMR 02698.000.852
public class NumberConversionInVietnamese extends PMR02698000852_MainClass{
	private static PMR02698000852_PageObject drv;
	private static StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass
	public static void setUp() throws Exception {

		PMR02698000852_MainClass.setUp();
		drv=PageFactory.initElements(driver, PMR02698000852_PageObject.class);
//	    driver.navigate().to(Main_Class.baseUrl);
	    drv.Establish();
	    drv.PMR_tab();
	    drv.PMR_link();
	    drv.VI_number_test_link();
	}
	
	
	@Test
	public void TenTypes_String(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.8",drv.getTenTypes_Text_String().getAttribute("value"));
	}
	@Test
	public void TenTypes_Currency(){
		drv.getAutoFill_button_101().click();
		assertEquals("US$ 101.80",drv.getTenTypes_Text_Currency().getAttribute("value"));
	}
	@Test
	public void TenTypes_Number(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.8",drv.getTenTypes_Text_Number().getAttribute("value"));
	}
	@Test
	public void TenTypes_Short(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_Short().getAttribute("value"));
	}
	@Test
	public void TenTypes_Integer(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_Integer().getAttribute("value"));
	}
	@Test
	public void TenTypes_Long(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_Long().getAttribute("value"));
	}
	@Test
	public void TenTypes_Float(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.80",drv.getTenTypes_Text_Float().getAttribute("value"));
	}
	@Test
	public void TenTypes_Double(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.800",drv.getTenTypes_Text_Double().getAttribute("value"));
	}
	@Test
	public void TenTypes_BigInteger(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_BigInteger().getAttribute("value"));
	}
	@Test
	public void TenTypes_BigDecimal(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.800",drv.getTenTypes_Text_BigDecimal().getAttribute("value"));
	}
	
	@Test
	public void SubmitData(){
		drv.getSubmitButton().click();
		AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "Text_submit_Result_link");

	}
	/*
	@Test
	public void TenTypes_result_String(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.8",drv.getTenTypes_Text_String().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_Currency(){
		drv.getAutoFill_button_101().click();
		assertEquals("US$ 101.80",drv.getTenTypes_Text_Currency().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_Number(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.8",drv.getTenTypes_Text_Number().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_Short(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_Short().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_Integer(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_Integer().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_Long(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_Long().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_Float(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.80",drv.getTenTypes_Text_Float().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_Double(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.800",drv.getTenTypes_Text_Double().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_BigInteger(){
		drv.getAutoFill_button_101().click();
		assertEquals("102",drv.getTenTypes_Text_BigInteger().getAttribute("value"));
	}
	@Test
	public void TenTypes_result_BigDecimal(){
		drv.getAutoFill_button_101().click();
		assertEquals("101.800",drv.getTenTypes_Text_BigDecimal().getAttribute("value"));
	}
	
	*/
	
	
	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,NumberConversionInVietnamese.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
