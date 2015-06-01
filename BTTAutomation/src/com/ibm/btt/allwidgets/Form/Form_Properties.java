package com.ibm.btt.allwidgets.Form;

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

import com.ibm.btt.util.AllWidgetsProjectMain_Class;
import com.ibm.btt.util.PropertiesUtil;
import com.ibm.btt.util.Tools;
import com.ibm.btt.util.Event;

public class Form_Properties extends AllWidgetsProjectMain_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Form_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, Form_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Form_widget();
		drv.Form_properties();

	}
	@Test
	public void proId(){
		assertEquals("form_properties_form_id", drv.proId());
	}
	
	@Test
	public void proValidationT1() {
		assertEquals("true", drv.proValidationT1());
	}

	@Test
	public void proValidationT2() {
		assertEquals("false", drv.proValidationT2());
	}

	@Test
	public void proValidationResult() {
		assertEquals("aaa", drv.proValidationResult());
		driver.navigate().to(AllWidgetsProjectMain_Class.baseUrl);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Form_widget();
		drv.Form_properties();
	}

	@Test
	public void properties_validateOnSubmit() {
		assertEquals(null, drv.properties_validateOnSubmit());
	}

	@Test
	public void proGernerrateLayoutF() {
		assertEquals("select", drv.proGernerrateLayoutF());
	}

	@Test
	public void proGernerrateLayoutT() {
		assertEquals(1, drv.proGernerrateLayoutT());
	}

	@Test
	public void proGernerrateInlineStyleT() {
		assertEquals(1, drv.proGernerrateInlineStyleT());
	}
	
	@Test
	public void proGernerrateInlineStyleF(){
		assertEquals(0, drv.proGernerrateInlineStyleF());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,Form_Properties.class);
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
