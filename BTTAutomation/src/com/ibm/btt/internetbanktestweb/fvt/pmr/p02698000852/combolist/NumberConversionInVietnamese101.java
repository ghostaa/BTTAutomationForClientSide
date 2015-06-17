package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852.combolist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852.PMR02698000852_MainClass;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

//PMR 02698.000.852
public class NumberConversionInVietnamese101 extends PMR02698000852_MainClass{
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
	    drv.VI_number_combo_link();
	}
	
	@Test
	public void TenTypes_String(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_String().sendKeys("101,8");
		assertEquals("101,8",drv.getTenTypes_Combo_String().getAttribute("value"));
	}
	@Test
	public void TenTypes_Currency(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_Currency().sendKeys("VND101,80");
		assertEquals("VND101,80",drv.getTenTypes_Combo_Currency().getAttribute("value"));
	}
	@Test
	public void TenTypes_Number(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_Number().sendKeys("102");
		assertEquals("102",drv.getTenTypes_Combo_Number().getAttribute("value"));
	}
	@Test
	public void TenTypes_Short(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_Short().sendKeys("101");
		assertEquals("101",drv.getTenTypes_Combo_Short().getAttribute("value"));
	}
	@Test
	public void TenTypes_Integer(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_Integer().sendKeys("101");
		assertEquals("101",drv.getTenTypes_Combo_Integer().getAttribute("value"));
	}
	@Test
	public void TenTypes_Long(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_Long().sendKeys("101");
		assertEquals("101",drv.getTenTypes_Combo_Long().getAttribute("value"));
	}
	@Test
	public void TenTypes_Float(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_Float().sendKeys("101,80");
		assertEquals("101,80",drv.getTenTypes_Combo_Float().getAttribute("value"));
	}
	@Test
	public void TenTypes_Double(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_Double().sendKeys("101,800");
		assertEquals("101,800",drv.getTenTypes_Combo_Double().getAttribute("value"));
	}
	@Test
	public void TenTypes_BigInteger(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_BigInteger().sendKeys("101");
		assertEquals("101",drv.getTenTypes_Combo_BigInteger().getAttribute("value"));
	}
	@Test
	public void TenTypes_BigDecimal(){
		//drv.getAutoFill_button_101().click();
		drv.getTenTypes_Combo_BigDecimal().sendKeys("101,800");
		assertEquals("101,800",drv.getTenTypes_Combo_BigDecimal().getAttribute("value"));
	}
	
	@Test
	public void SubmitData(){
		drv.getSubmitButton().click();
		AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "showcombo_submit_link");

	}
	/**===================assert results===================**/
	
	//String
	@Test
	public void TenTypes_result_Combo_String(){
		assertEquals("101,8",drv.getTenTypes_Combo_Result_String().getAttribute("value"));
		assertEquals("101,8",drv.getTenTypes_Lable_Result_String().getText());
	}

	//Currency
	@Test
	public void TenTypes_result_Combo_Currency(){
		assertEquals("VND101,80",drv.getTenTypes_Combo_Result_Currency().getAttribute("value"));
		assertEquals("VND101,80",drv.getTenTypes_Lable_Result_Currency().getText());
	}
	
	//Number
	@Test
	public void TenTypes_result_Combo_Number(){
		assertEquals("102",drv.getTenTypes_Combo_Result_Number().getAttribute("value"));
		assertEquals("102",drv.getTenTypes_Lable_Result_Number().getText());
	}
	
	//Short
	@Test
	public void TenTypes_result_Text_Short(){
		assertEquals("101",drv.getTenTypes_Combo_Result_Short().getAttribute("value"));
		assertEquals("101",drv.getTenTypes_Lable_Result_Short().getText());
	}
		
	//Integer
	@Test
	public void TenTypes_result_Integer(){
		assertEquals("101",drv.getTenTypes_Combo_Result_Integer().getAttribute("value"));
		assertEquals("101",drv.getTenTypes_Lable_Result_Integer().getText());
	}
	
	//Long
	@Test
	public void TenTypes_result_Long(){
		assertEquals("101",drv.getTenTypes_Combo_Result_Long().getAttribute("value"));
		assertEquals("101",drv.getTenTypes_Lable_Result_Long().getText());
	}

	//Float
	@Test
	public void TenTypes_result_Float(){
		assertEquals("101,80",drv.getTenTypes_Combo_Result_Float().getAttribute("value"));
		assertEquals("101,80",drv.getTenTypes_Lable_Result_Float().getText());
	}
		
	//Double
	@Test
	public void TenTypes_result_Double(){
		assertEquals("101,800",drv.getTenTypes_Combo_Result_Double().getAttribute("value"));
		assertEquals("101,800",drv.getTenTypes_Lable_Result_Double().getText());
	}

	//BigInteger
	@Test
	public void TenTypes_result_BigInteger(){
		assertEquals("101",drv.getTenTypes_Combo_Result_BigInteger().getAttribute("value"));
		assertEquals("101",drv.getTenTypes_Lable_Result_BigInteger().getText());
	}
		
	//BigDecimal
	@Test
	public void TenTypes_result_BigDecimal(){
		assertEquals("101,800",drv.getTenTypes_Combo_Result_BigDecimal().getAttribute("value"));
		assertEquals("101,800",drv.getTenTypes_Lable_Result_BigDecimal().getText());
	}
	
	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,NumberConversionInVietnamese101.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
