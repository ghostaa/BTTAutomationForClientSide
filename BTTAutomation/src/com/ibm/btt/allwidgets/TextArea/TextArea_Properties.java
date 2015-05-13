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
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

import com.ibm.btt.util.Main_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
import com.ibm.btt.util.Event;

public class TextArea_Properties extends Main_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static TextArea_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		Main_Class.setUp();
		drv = PageFactory.initElements(driver, TextArea_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.TextArea_widget();
		drv.TextArea_properties();

	}
	
	@Test
	public void proId(){
		assertEquals("textArea_properties_mytextArea", drv.proId());
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
	public void proGone() {
		assertEquals(1, drv.proGone());
	}
	
	@Test
	public void proDisableTrue() {
		assertEquals("true", drv.proDisableTrue());
	}
	
	@Test
	public void proDisableFalse(){
		assertEquals(true, drv.proDisableFalse());
	}

	@Test
	public void proReadonlyTrue() {
		assertEquals("true", drv.proReadonlyTrue());
	}
	
	@Test
	public void proReadonlyFlase(){
		assertEquals(true, drv.proReadonlyFlase());
	}
	
	@Test
	public void proShortcut(){
		assertEquals(2, drv.proShortcut());
	}

	@Test
	public void proHint(){
		assertEquals("stock name", drv.proHint());
	}
	
	@Test
	public void proTabIndex(){
		assertEquals("0", drv.proTabIndex());
	}
	
	@Test
	public void proCols(){
		assertEquals("10", drv.proCols());
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, Main_Class.allwidgets,TextArea_Properties.class);
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
