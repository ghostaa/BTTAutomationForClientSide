package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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

public class F003_BothMergeTest extends InternetBankTestWebMain_Class {

	private static F003_Index_PageObject drv;
	private static F003_BothMerge_PageObject b_drv;
	private static F003_Result_BothMerge_PageObject result_drv;
	private static StringBuffer verificationErrors = new StringBuffer();
	
	@BeforeClass
	public static void setUp() throws Exception {

		InternetBankTestWebMain_Class.setUp();
		drv = PageFactory.initElements(driver, F003_Index_PageObject.class);
		b_drv = PageFactory.initElements(driver,
				F003_BothMerge_PageObject.class);
		// driver.navigate().to(Main_Class.baseUrl);
		result_drv = PageFactory.initElements(driver,
				F003_Result_BothMerge_PageObject.class);
		drv.Establish();
		drv.IBK_FVT_tab();
		drv.F003();
		drv.toHeaderBodyMerge();
	}

	@Test
	public void testHeaderMerge() {
		// Grab the table's header, the header has one row, and four columns.
		WebElement table = b_drv.getTable();
		List<WebElement> allHeaderRows = TableTestUtil.getTableHeaderRows(table);
		assertEquals(4, allHeaderRows.size());
		WebElement th_0 =  allHeaderRows.get(0);
		assertEquals("dojoxGridInvisible", th_0.getAttribute("class"));
		List<WebElement> headerCells_0 = TableTestUtil.getTableHeaderCellsByHRow(table, 0);
		assertEquals(4, headerCells_0.size());
		WebElement th_1_0 = TableTestUtil.getTableHeaderCellByHRowHCol(table, 1, 0);
		assertEquals("1", th_1_0.getAttribute("colspan"));
		assertEquals("3", th_1_0.getAttribute("rowspan"));
		WebElement th_1_1 = TableTestUtil.getTableHeaderCellByHRowHCol(table, 1, 1);
		assertEquals("1", th_1_1.getAttribute("colspan"));
		assertEquals("2", th_1_1.getAttribute("rowspan"));
		WebElement th_1_2 = TableTestUtil.getTableHeaderCellByHRowHCol(table, 1, 2);
		assertEquals("2", th_1_2.getAttribute("colspan"));
		assertEquals("1", th_1_2.getAttribute("rowspan"));
		WebElement th_2_0 = TableTestUtil.getTableHeaderCellByHRowHCol(table, 2, 0);
		assertEquals("1", th_2_0.getAttribute("colspan"));
		assertEquals("1", th_2_0.getAttribute("rowspan"));
		WebElement th_2_1 = TableTestUtil.getTableHeaderCellByHRowHCol(table, 2, 1);
		assertEquals("1", th_2_1.getAttribute("colspan"));
		assertEquals("1", th_2_1.getAttribute("rowspan"));
		WebElement th_3_0 = TableTestUtil.getTableHeaderCellByHRowHCol(table, 3, 0);
		assertEquals("3", th_3_0.getAttribute("colspan"));
		assertEquals("1", th_3_0.getAttribute("rowspan"));
	}
	
	@Test
	public void testBodyCellMerge(){
		WebElement table = b_drv.getTable();
		List<WebElement> cells_9 = TableTestUtil.getTableBodyCellsByBRow(table, 9);
		WebElement cell_9_4 = cells_9.get(4);
		assertEquals("1", cell_9_4.getAttribute("colspan"));
		assertEquals("3", cell_9_4.getAttribute("rowspan"));
	}
	@Test
	public void testHideShowECA() throws InterruptedException{
		WebElement hideBtn01 = b_drv.getHideButton01();
		WebElement table = b_drv.getTable();
		hideBtn01.click();
		WebElement th_1_0 = TableTestUtil.getTableHeaderCellByHRowHCol(table, 1, 0);
		WebElement td_0_4 = TableTestUtil.getTableBodyCellByBRowBCol(table, 1, 4);
		assertEquals("none", th_1_0.getCssValue("display"));
		assertEquals("none", td_0_4.getCssValue("display"));
		WebElement showBtn01 = b_drv.getShowButton01();
		showBtn01.click();
		WebElement th_1_0_t = TableTestUtil.getTableHeaderCellByHRowHCol(table, 1, 0);
		WebElement td_0_4_t = TableTestUtil.getTableBodyCellByBRowBCol(table, 1, 4);
		assertEquals("table-cell", th_1_0_t.getCssValue("display"));
		assertEquals("table-cell", td_0_4_t.getCssValue("display"));
	}
	
	
	@Test
	public void testEditSubmit(){
		WebElement table = b_drv.getTable();
		WebElement row9 = TableTestUtil.getTableBodyRows(table).get(9);
		WebElement cell_9_1 = TableTestUtil.getTableBodyCellByBRowBCol(table, 9, 1);
		Actions action1 = new Actions(driver);
		Actions action2 = new Actions(driver);
//		action1.moveToElement(td_9_1).doubleClick().click().sendKeys("totalprice").build().perform();
		action1.moveToElement(cell_9_1).doubleClick().click().build().perform();
		WebElement inputCell = row9.findElement(By.id(TableTestUtil.tableEditCombobox));
		inputCell.clear();
		inputCell.sendKeys("Total_Price");
		WebElement F003_B_button = b_drv.getSubmitButton();
		action2.moveToElement(F003_B_button).click().build().perform();
		WebElement res_upd_table = result_drv.getUpdatedTable();
		int upd_rowNum = TableTestUtil.getTableBodyRows(res_upd_table).size() - 1;
		WebElement upd_t_cell = TableTestUtil.getTableBodyCellByBRowBCol(res_upd_table, upd_rowNum, 5);
		assertEquals("Total_Price", upd_t_cell.getText());
		WebElement res_labelT = result_drv.getSingleResult_labelT();
		assertEquals("Total_Price", res_labelT.getText());
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
