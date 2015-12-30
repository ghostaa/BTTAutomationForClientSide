package com.ibm.btt.allwidgets.Table;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.Tools;

public class Table_Properties extends Main_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Table_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, Table_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Tree_widget();
		drv.Tree_properties();

	}
	
	@Test
	public void proId(){
		assertEquals("tree_properties_mytree", drv.proId());
	}

	@Test
	public void proVisible() {
		assertEquals(true, drv.proVisible());
	}

	@Test
	public void proHidden() {
		assertEquals(1, drv.proHidden());
	}
	
	@Test
	public void proGone(){
		assertEquals(1, drv.proGone());
	}
	
	@Test
	public void proHint(){
		assertEquals("This is tree hint", drv.proHint());
	}
	
	@Test
	public void proNLSHint(){
		assertEquals("Exit", drv.proNLSHint());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,Table_Properties.class);
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
