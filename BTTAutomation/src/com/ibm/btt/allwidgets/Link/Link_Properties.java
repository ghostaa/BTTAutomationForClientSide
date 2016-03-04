package com.ibm.btt.allwidgets.Link;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.Tools;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class Link_Properties extends AllWidgetsProjectMain_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Link_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, Link_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
		waitUntilLoadElement(20,"Link_properties_100");

	}
	@Test
	public void Link_100_tabIndex(){
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(true, drv.pro_isfocused());
	}
	
	@Test
	public void Link_110_proChange() {
		assertEquals("linkid=100", drv.proChange());
	}

	@Test
	public void Link_120_proText() {
		assertEquals("test page", drv.proText());
	}

	@Test
	public void Link_130_proVisible() {
		assertEquals(true, drv.proVisible());
	}

	@Test
	public void Link_140_proHidden() {
		assertEquals(1, drv.proHidden());
	}

	@Test
	public void Link_150_proGone() {
		assertEquals(1, drv.proGone());
	}

	@Test
	public void Link_160_proDisableTrue() {
		assertEquals(1, drv.proDisableTrue());
	}

	@Test
	public void Link_170_proDisableFalse() {
		assertEquals(1, drv.proDisableFalse());
	}
	
	@Test
	public void Link_180_proShortcut(){
		assertEquals(baseUrl + "index.jsp", drv.proShortcut());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}
	
	@Test
	public void Link_190_pro_parent() throws Exception{
		assertEquals(baseUrl + "index.jsp", drv.pro_parent());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}	
	
	@Test
	public void Link_200_pro_self() throws Exception{
		assertEquals(baseUrl + "index.jsp", drv.pro_self());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}

	@Test
	public void Link_210_pro_blank() throws Exception{
		assertEquals("about:blank", drv.pro_blank());
		driver.close();
		Link_Properties.setUp();
	}
	
	@Test
	public void Link_220_pro_top() throws Exception{
		assertEquals(baseUrl + "index.jsp", drv.pro_top());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}
	
	@Test
	public void Link_230_pro_Hint(){
		assertEquals("Successfully test", drv.pro_Hint());
	}
	
	@Test
	public void Link_240_pro_tabIndex(){
		assertEquals("3", drv.pro_tabIndex());
	}
	
	@Test
	public void Link_250_pro_extraParams() throws Exception{
		assertEquals("Test Image Css",drv.pro_extraParams());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,Link_Properties.class);
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
