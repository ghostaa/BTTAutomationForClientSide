package com.ibm.btt.allwidgets.TextArea;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
import com.ibm.btt.util.Event;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TextArea_Properties extends AllWidgetsProjectMain_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static TextArea_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, TextArea_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.TextArea_widget();
		drv.TextArea_properties();

	}
	
	@Test
	public void TextArea_200_proId(){
		assertEquals("textArea_properties_mytextArea", drv.proId());
	}
	
	@Test
	public void TextArea_200_proVisible() {
		assertEquals(true, drv.proVisible());
	}

	@Test
	public void TextArea_200_proHidden() {
		assertEquals(1, drv.proHidden());
	}

	@Test
	public void TextArea_200_proGone() {
		assertEquals(1, drv.proGone());
	}
	
	@Test
	public void TextArea_200_proDisableTrue() {
		assertEquals("true", drv.proDisableTrue());
	}
	
	@Test
	public void TextArea_200_proDisableFalse(){
		assertEquals(true, drv.proDisableFalse());
	}

	@Test
	public void TextArea_200_proReadonlyTrue() {
		assertEquals("true", drv.proReadonlyTrue());
	}
	
	@Test
	public void TextArea_200_proReadonlyFlase(){
		assertEquals(true, drv.proReadonlyFlase());
	}
	
	@Test
	public void TextArea_120_proShortcut(){
		assertEquals(2, drv.proShortcut());
	}

	@Test
	public void TextArea_200_proHint(){
		assertEquals("stock name", drv.proHint());
	}
	
	@Test
	public void TextArea_110_proTabIndex(){
		assertEquals("0", drv.proTabIndex());
	}
	
	@Test
	public void TextArea_200_proCols(){
		assertEquals("10", drv.proCols());
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,TextArea_Properties.class);
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
