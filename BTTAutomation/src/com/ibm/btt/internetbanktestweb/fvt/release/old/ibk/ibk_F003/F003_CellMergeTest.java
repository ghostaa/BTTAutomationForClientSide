package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.TableTestUtil;

public class F003_CellMergeTest extends InternetBankTestWebMain_Class {

	private static F003_Index_PageObject drv;
	private static F003_CellMerge_PageObject cell_drv;
	private static F003_Result_BodyCell_PageObject result_drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setUp() throws Exception {

		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, F003_Index_PageObject.class);
		cell_drv = PageFactory.initElements(driver,
				F003_CellMerge_PageObject.class);
		// driver.navigate().to(Main_Class.baseUrl);
		result_drv = PageFactory.initElements(driver,
				F003_Result_BodyCell_PageObject.class);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.F003();
		drv.toBodyMerge();
	}

	@Test
	public void testHeader() {
		// Grab the table's header, the header has one row, and four columns.
		WebElement table = cell_drv.getTable();
		List<WebElement> allHeaderRows = TableTestUtil.getTableHeaderRows(table);
		assertEquals(1, allHeaderRows.size());
		List<WebElement> headers_0 = TableTestUtil.getTableHeaderCellsByHRow(table, 0);
		assertEquals(4, headers_0.size());
	}
	
	@Test
	public void testBodyCellMerge(){
		WebElement table = cell_drv.getTable();
		// the cell merge is worked as display the specified cells, and hide others.
		List<WebElement> rows = TableTestUtil.getTableBodyRows(table);
		assertEquals(10, rows.size());
		List<WebElement> cells_9 = TableTestUtil.getTableBodyCellsByBRow(table, 9);
		assertEquals(4, cells_9.size());
		assertEquals("none", cells_9.get(0).getCssValue("display"));
		assertEquals("table-cell", cells_9.get(1).getCssValue("display"));
		assertEquals("2", cells_9.get(1).getAttribute("colspan"));
		assertEquals("table-cell", cells_9.get(2).getCssValue("display"));
		assertEquals("2", cells_9.get(2).getAttribute("colspan"));
		assertEquals("none", cells_9.get(3).getCssValue("display"));
		
	}
	
	@Test
	public void testEditSubmit(){
		WebElement table = cell_drv.getTable();
		WebElement row9 = TableTestUtil.getTableBodyRows(table).get(9);
		WebElement cell_9_1 = TableTestUtil.getTableBodyCellByBRowBCol(table, 9, 1);
		Actions action1 = new Actions(driver);
		Actions action2 = new Actions(driver);
//		action1.moveToElement(td_9_1).doubleClick().click().sendKeys("totalprice").build().perform();
		action1.moveToElement(cell_9_1).doubleClick().click().build().perform();
		WebElement inputCell = row9.findElement(By.id("com_ibm_btt_dijit_StringTextBox_1"));
		inputCell.clear();
		inputCell.sendKeys("Total_Price");
		WebElement F003_B_button = cell_drv.getBButton();
		action2.moveToElement(F003_B_button).click().build().perform();
		WebElement res_sel_table = result_drv.getMultiSelectTable();
		int sel_rowNum =  TableTestUtil.getTableBodyRows(res_sel_table).size() - 1;
		WebElement sel_t_cell = TableTestUtil.getTableBodyCellByBRowBCol(res_sel_table, sel_rowNum, 1);
		assertEquals("Total_Price", sel_t_cell.getText());
		WebElement res_upd_table = result_drv.getUpdatedTable();
		int upd_rowNum = TableTestUtil.getTableBodyRows(res_upd_table).size() - 1;
		WebElement upd_t_cell = TableTestUtil.getTableBodyCellByBRowBCol(res_upd_table, upd_rowNum, 5);
		assertEquals("Total_Price", upd_t_cell.getText());
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
//		Tools.snapshot((TakesScreenshot)driver, InternetBankTestWebMain_Class.InternetBankTestWeb,F003_CellMergeTest.class);
		driver.quit();
		// driver.navigate().refresh();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	}
	
}
