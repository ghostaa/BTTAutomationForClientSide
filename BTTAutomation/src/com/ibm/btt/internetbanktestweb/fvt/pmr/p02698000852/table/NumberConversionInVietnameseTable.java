package com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852.table;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.internetbanktestweb.fvt.pmr.p02698000852.PMR02698000852_MainClass;
import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

//PMR 02698.000.852
public class NumberConversionInVietnameseTable extends PMR02698000852_MainClass{
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
	    drv.VI_number_table_link();
	}
	
	
	@Test
	public void TenTypes_String(){
		drv.getTenTypes_multitable_1().click();
		AllWidgetsProjectMain_Class main_class = new AllWidgetsProjectMain_Class();
		main_class.keyDown(Keys.CONTROL);
		drv.getTenTypes_multitable_2().click();
		main_class.keyUp(Keys.CONTROL);
		drv.getTenTypes_singletable().click();
		//assertEquals("101.8",drv.submitButton().);
	}
	@Test
	public void SubmitData(){
		drv.getSubmitButton().click();
		AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "table_Result_submit_link");

	}
	/**===================assert results===================**/
	
	//String
	@Test
	public void TenTypes_result_Text_String(){
		assertEquals("1208.32",drv.getTenTypes_Table_Result_String1().getText());
		assertEquals("123456789.00",drv.getTenTypes_Table_Result_String2().getText());
		assertEquals("1234.00",drv.getTenTypes_Lable_Result_String().getText());
	}
	
	//Currency
	@Test
	public void TenTypes_result_Text_Currency(){
		assertEquals("VND1.208,32",drv.getTenTypes_Table_Result_Currency1().getText());
		//ToDos
		assertEquals("VND123.456.",drv.getTenTypes_Table_Result_Currency2().getText());//这里的值是显示值，但是不是单元格的全值，仅是显示的部分
		assertEquals("VND1.234,00",drv.getTenTypes_Lable_Result_Currency().getText());
	}
	
	//Number
	@Test
	public void TenTypes_result_Text_Number(){
		assertEquals("1.208",drv.getTenTypes_Table_Result_Number1().getText());
		assertEquals("123.456.789",drv.getTenTypes_Table_Result_Number2().getText());
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Number().getText());
	}
	
	//Short
	@Test
	public void TenTypes_result_Text_Short(){
		assertEquals("1.208",drv.getTenTypes_Table_Result_Short1().getText());
		assertEquals("-13.035",drv.getTenTypes_Table_Result_Short2().getText());
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Short().getText());
	}
	
	//Integer
	@Test
	public void TenTypes_result_Integer(){
		assertEquals("1.208",drv.getTenTypes_Table_Result_Integer1().getText());
		assertEquals("123.456.789",drv.getTenTypes_Table_Result_Integer2().getText());
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Integer().getText());
	}
	
	//Long
	@Test
	public void TenTypes_result_Long(){
		assertEquals("1.208",drv.getTenTypes_Table_Result_Long1().getText());
		assertEquals("123.456.789",drv.getTenTypes_Table_Result_Long2().getText());
		assertEquals("1.234",drv.getTenTypes_Lable_Result_Long().getText());
	}
	
	//Float
	@Test
	public void TenTypes_result_Float(){
		assertEquals("1.208,32",drv.getTenTypes_Table_Result_Float1().getText());
		assertEquals("123.456.792,00",drv.getTenTypes_Table_Result_Float2().getText());
		assertEquals("1.234,00",drv.getTenTypes_Lable_Result_Float().getText());
	}
	
	//Double
	@Test
	public void TenTypes_result_Double(){
		assertEquals("1.208,320",drv.getTenTypes_Table_Result_Double1().getText());
		//ToDos
		assertEquals("123.456.789,0",drv.getTenTypes_Table_Result_Double2().getText());//这里的值是显示值，但是不是单元格的全值，仅是显示的部分
		assertEquals("1.234,000",drv.getTenTypes_Lable_Result_Double().getText());
	}
	
	//BigInteger
	@Test
	public void TenTypes_result_BigInteger(){
		assertEquals("1.208",drv.getTenTypes_Table_Result_BigInteger1().getText());
		assertEquals("123.456.789",drv.getTenTypes_Table_Result_BigInteger2().getText());
		assertEquals("1.234",drv.getTenTypes_Lable_Result_BigInteger().getText());
	}
	
	//BigDecimal
	@Test
	public void TenTypes_result_BigDecimal(){
		assertEquals("1.208,320",drv.getTenTypes_Table_Result_BigDecimal1().getText());
		//ToDos
		assertEquals("123.456.789,0",drv.getTenTypes_Table_Result_BigDecimal2().getText()); //这里的值是显示值，但是不是单元格的全值，仅是显示的部分
		assertEquals("1.234,000",drv.getTenTypes_Lable_Result_BigDecimal().getText());
	}
	
	
	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,NumberConversionInVietnameseTable.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
