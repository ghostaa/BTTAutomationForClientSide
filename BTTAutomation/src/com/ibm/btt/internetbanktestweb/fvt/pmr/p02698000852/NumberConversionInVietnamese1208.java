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
public class NumberConversionInVietnamese1208 extends PMR02698000852_MainClass{
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
		drv.getAutoFill_button_1234().click();
		assertEquals("1234.00",drv.getTenTypes_Text_String().getAttribute("value"));
	}
	@Test
	public void TenTypes_Currency(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234 VND",drv.getTenTypes_Text_Currency().getAttribute("value"));
	}
	@Test
	public void TenTypes_Number(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234",drv.getTenTypes_Text_Number().getAttribute("value"));
	}
	@Test
	public void TenTypes_Short(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234",drv.getTenTypes_Text_Short().getAttribute("value"));
	}
	@Test
	public void TenTypes_Integer(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234",drv.getTenTypes_Text_Integer().getAttribute("value"));
	}
	@Test
	public void TenTypes_Long(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234",drv.getTenTypes_Text_Long().getAttribute("value"));
	}
	@Test
	public void TenTypes_Float(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234,00",drv.getTenTypes_Text_Float().getAttribute("value"));
	}
	@Test
	public void TenTypes_Double(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234,000",drv.getTenTypes_Text_Double().getAttribute("value"));
	}
	@Test
	public void TenTypes_BigInteger(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234",drv.getTenTypes_Text_BigInteger().getAttribute("value"));
	}
	@Test
	public void TenTypes_BigDecimal(){
		drv.getAutoFill_button_1234().click();
		assertEquals("1.234,000",drv.getTenTypes_Text_BigDecimal().getAttribute("value"));
	}
	
	@Test
	public void SubmitData(){
		drv.getSubmitButton().click();
		AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "Text_submit_Result_link");

	}
	/**===================assert results===================**/
	
	//String
	@Test
	public void TenTypes_result_Text_String(){
		assertEquals("1234.00",drv.getTenTypes_Text_Result_String().getAttribute("value"));
		assertEquals("1234.00",drv.getTenTypes_Lable_Result_String().getText());
	}
	
	//Currency
	@Test
	public void TenTypes_result_Text_Currency(){
		assertEquals("1.234 VND",drv.getTenTypes_Text_Result_Currency().getAttribute("value"));
		assertEquals("VND1.234,00",drv.getTenTypes_Lable_Result_Currency().getText());
	}
	
	//Number
	@Test
	public void TenTypes_result_Text_Number(){
		assertEquals("1.234",drv.getTenTypes_Text_Result_Number().getAttribute("value"));
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Number().getText());
	}
	
	//Short
	@Test
	public void TenTypes_result_Text_Short(){
		assertEquals("1.234",drv.getTenTypes_Text_Result_Short().getAttribute("value"));
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Short().getText());
	}
	
	//Integer
	@Test
	public void TenTypes_result_Integer(){
		assertEquals("1.234",drv.getTenTypes_Text_Result_Integer().getAttribute("value"));
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Integer().getText());
	}
	
	//Long
	@Test
	public void TenTypes_result_Long(){
		assertEquals("1.234",drv.getTenTypes_Text_Result_Long().getAttribute("value"));
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Long().getText());
	}
	
	//Float
	@Test
	public void TenTypes_result_Float(){
		assertEquals("1.234,00",drv.getTenTypes_Text_Result_Float().getAttribute("value"));
		assertEquals("1.234,00",drv.getTenTypes_Lable_Result_Float().getText());
	}
	
	//Double
	@Test
	public void TenTypes_result_Double(){
		assertEquals("1.234,000",drv.getTenTypes_Text_Result_Double().getAttribute("value"));
		assertEquals("1.234,000",drv.getTenTypes_Lable_Result_Double().getText());
	}
	
	//BigInteger
	@Test
	public void TenTypes_result_BigInteger(){
		assertEquals("1.234",drv.getTenTypes_Text_Result_BigInteger().getAttribute("value"));
		assertEquals("1.234",drv.getTenTypes_Lable_Result_BigInteger().getText());
	}
	
	//BigDecimal
	@Test
	public void TenTypes_result_BigDecimal(){
		assertEquals("1.234,000",drv.getTenTypes_Text_Result_BigDecimal().getAttribute("value"));
		assertEquals("1.234,000",drv.getTenTypes_Lable_Result_BigDecimal().getText());
	}
	
	
	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,NumberConversionInVietnamese1208.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
