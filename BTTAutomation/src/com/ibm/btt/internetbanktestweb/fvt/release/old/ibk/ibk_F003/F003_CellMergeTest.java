package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.InternetBankTestWebMain_Class;

public class F003_CellMergeTest extends InternetBankTestWebMain_Class {

	private static F003_Index_PageObject drv;
	private static F003_Cell_PageObject cell_drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setUp() throws Exception {

		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, F003_Index_PageObject.class);
		cell_drv = PageFactory.initElements(driver,
				F003_Cell_PageObject.class);
		// driver.navigate().to(Main_Class.baseUrl);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.F003();
		drv.toBodyMerge();
	}

	@Test
	public void testHeader() {
		// Grab the table's header, the header has one row, and four columns.
		WebElement tableHeader = cell_drv.getTableHeader();
		List<WebElement> allHeaderRows = tableHeader.findElements(By.tagName("tr"));
		assertEquals(1, allHeaderRows.size());
		WebElement headerRow = allHeaderRows.get(0);
		List<WebElement> headers = headerRow.findElements(By.tagName("th"));
		assertEquals(4, headers.size());
	}
	
	@Test
	public void testBodyCellMerge(){
		WebElement tableBody = cell_drv.getTableBody();
		// the cell merge is worked as display the specified cells, and hide others.
		List<WebElement> bTables = tableBody.findElements(By.tagName("table"));
		assertEquals(10, bTables.size());
		WebElement bTable9 = bTables.get(9);
		WebElement bTable9Tr = bTable9.findElement(By.tagName("tr"));
		List<WebElement> bTable9Tr_Tds = bTable9Tr.findElements(By.tagName("td"));
		assertEquals(4, bTable9Tr_Tds.size());
		assertEquals("none", bTable9Tr_Tds.get(0).getCssValue("display"));
		assertEquals("table-cell", bTable9Tr_Tds.get(1).getCssValue("display"));
		assertEquals("2", bTable9Tr_Tds.get(1).getAttribute("colspan"));
		assertEquals("table-cell", bTable9Tr_Tds.get(2).getCssValue("display"));
		assertEquals("2", bTable9Tr_Tds.get(2).getAttribute("colspan"));
		assertEquals("none", bTable9Tr_Tds.get(3).getCssValue("display"));
		
	}
	
	@Test
	public void testEditSubmit(){
		WebElement tableBody = cell_drv.getTableBody();
		List<WebElement> bTables = tableBody.findElements(By.tagName("table"));
		WebElement bTable9 = bTables.get(9);
		List<WebElement> spans = bTable9.findElements(By.tagName("span"));
		Actions action = new Actions(driver);
		WebElement span = spans.get(1);
		action.moveToElement(span).doubleClick().build().perform();
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
//		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,F003_CellMergeTest.class);
//		driver.quit();
		// driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
	
}
