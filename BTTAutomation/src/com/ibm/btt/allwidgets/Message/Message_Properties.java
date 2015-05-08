package com.ibm.btt.allwidgets.Message;

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

public class Message_Properties extends Main_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Message_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		Main_Class.setUp();
		drv = PageFactory.initElements(driver, Message_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Message_widget();
		drv.Message_properties();

	}
	
	@Test
	public void proString() {
		assertEquals("Test data", drv.proString());
	}

	@Test
	public void proDisplay() {
		assertEquals(1, drv.proDisplay());
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
	public void proErrorLevel() {
		assertEquals("ERROR level", drv.proErrorLevel());
	}

	@Test
	public void proInfoLevel() {
		assertEquals("INFO level'", drv.proInfoLevel());
	}

	@Test
	public void proWarnLevel() {
		assertEquals("WARN level", drv.proWarnLevel());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, Main_Class.allwidgets,Message_Properties.class);
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
