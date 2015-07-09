package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Tools;

public class F003_HeaderMergeTest extends InternetBankTestWebMain_Class {

	private static F003_Index_PageObject drv;
	private static F003_Header_PageObject header_drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setUp() throws Exception {

		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, F003_Index_PageObject.class);
		header_drv = PageFactory.initElements(driver,
				F003_Header_PageObject.class);
		// driver.navigate().to(Main_Class.baseUrl);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.F003();
		drv.toHeaderMerge();
	}

	@Test
	public void testHeaderMerge() {
		// Grab the table's header
		WebElement tableHeader = header_drv.getTableHeader();
		List<WebElement> allHeaderRows = tableHeader.findElements(By.tagName("tr"));
		assertEquals(3, allHeaderRows.size());
		// row0: this row is an empty row, to adapt to the multiHeader.
		WebElement headerRow0 = allHeaderRows.get(0);
		List<WebElement> headers0 = headerRow0.findElements(By.tagName("th"));
		assertEquals(5, headers0.size());
		// row1: this row has 2 columns, first col colspan = 2, second col colspan=3 
		WebElement headerRow1 = allHeaderRows.get(1);
		List<WebElement> headers1 = headerRow1.findElements(By.tagName("th"));
		assertEquals(2, headers1.size());
		WebElement headerCell0 = headers1.get(0);
		String colspan0 = headerCell0.getAttribute("colspan");
		assertEquals("2", colspan0);
		WebElement headerCell1 = headers1.get(1);
		String colspan1 = headerCell1.getAttribute("colspan");
		assertEquals("3", colspan1);
		// row2: this row has 5 columns, no column has colspan.
		WebElement headerRow2 = allHeaderRows.get(2);
		// List<WebElement> headers2 = headerRow2.findElements(By.xpath(".//*[local-name(.)='th']"));
		List<WebElement> headers2 = headerRow2.findElements(By.tagName("th"));
		assertEquals(5, headers2.size());
	}
	
	@Test
	public void testBodyCellMerge(){
		WebElement tableBody = header_drv.getTableBody();
		// multiHeader table's body is a table, it's every row is a div, under every div is a table.
		// in this case, we focus on the last row. it's a div contains a table, the table has two rows invisible, the last row visible.
		// the last row has 5 columns, two columns are visible. first colspan = 2, second colspan = 3.
		List<WebElement> bTables = tableBody.findElements(By.tagName("table"));
		assertEquals(10, bTables.size());
		WebElement bTable9 = bTables.get(9);
		List<WebElement> bTable9Trs = bTable9.findElements(By.tagName("tr"));
		assertEquals(3, bTable9Trs.size());
		WebElement bTable9Tr0 = bTable9Trs.get(0);
		assertEquals("dojoxGridInvisible", bTable9Tr0.getAttribute("class"));
		WebElement bTable9Tr1 = bTable9Trs.get(1);
		assertEquals("dojoxGridInvisible", bTable9Tr1.getAttribute("class"));
		WebElement bTable9Tr2 = bTable9Trs.get(2);
		List<WebElement> bTable9Tr2_Tds = bTable9Tr2.findElements(By.tagName("td"));
		assertEquals(5, bTable9Tr2_Tds.size());
		assertEquals("none", bTable9Tr2_Tds.get(0).getCssValue("display"));
		assertEquals("table-cell", bTable9Tr2_Tds.get(1).getCssValue("display"));
		assertEquals("2", bTable9Tr2_Tds.get(1).getAttribute("colspan"));
		assertEquals("table-cell", bTable9Tr2_Tds.get(2).getCssValue("display"));
		assertEquals("3", bTable9Tr2_Tds.get(2).getAttribute("colspan"));
		assertEquals("none", bTable9Tr2_Tds.get(3).getCssValue("display"));
		assertEquals("none", bTable9Tr2_Tds.get(4).getCssValue("display"));
	}
	
	 @AfterClass
	  public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,F003_HeaderMergeTest.class);
		driver.quit();
//		driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
	
}
