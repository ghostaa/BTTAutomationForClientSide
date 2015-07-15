package com.ibm.btt.util;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableTestUtil {
	
	/**
	 * 
	 * @param table
	 * @return header div
	 */
	public static WebElement getTableHeader(WebElement table){
		return 	table.findElement(By.className("dojoxGridMasterHeader"));
	}
	
	/**
	 * @param table
	 * @return List headerRows
	 */
	public static List<WebElement> getTableHeaderRows(WebElement table){
		return  getTableHeader(table).findElements(By.tagName("tr"));
	}
	
	/**
	 * 
	 * @param table
	 * @param rowNum
	 * @return List, headerCells of rowNum
	 */
	public static List<WebElement> getTableHeaderCellsByHRow(WebElement table, Integer rowNum){
		List<WebElement> rows = getTableHeaderRows(table);
		WebElement headerRow = rows.get(rowNum);
		List<WebElement> cells = headerRow.findElements(By.className("dojoxGridCell"));
		return cells;
	}
	/**
	 * 
	 * @param table
	 * @param rowNum
	 * @param colNum
	 * @return WebElement HeaderCell
	 */
	public static WebElement getTableHeaderCellByHRowHCol(WebElement table, Integer rowNum, Integer colNum){
		List<WebElement> cells = getTableHeaderCellsByHRow(table, rowNum);
		return cells.get(colNum);
	}
	/**
	 * 
	 * @param table
	 * @return WebElement tableBody
	 */
	public static WebElement getTableBody(WebElement table){
		return 	table.findElement(By.className("dojoxGridMasterView"));
	}
	
	/**
	 * 
	 * @param table
	 * @return List<WebElement> bodyRows
	 */
	public static List<WebElement> getTableBodyRows(WebElement table){
		return  getTableBody(table).findElements(By.className("dojoxGridRow"));
	}
	
	/**
	 * 
	 * @param table
	 * @param rowNum
	 * @return List<WebElement> cells
	 */
	public static List<WebElement> getTableBodyCellsByBRow(WebElement table, Integer rowNum){
		List<WebElement> rows = getTableBodyRows(table);
		WebElement bodyRow = rows.get(rowNum);
		List<WebElement> cells = bodyRow.findElements(By.className("dojoxGridCell"));
		return cells;
	}

	/**
	 * @param table
	 * @param rowNum
	 * @param colNum
	 * @return WebElement cell
	 */
	public static WebElement getTableBodyCellByBRowBCol(WebElement table, Integer rowNum, Integer colNum){
		List<WebElement> cells = getTableBodyCellsByBRow(table, rowNum);
		return cells.get(colNum);
	}
	

}
