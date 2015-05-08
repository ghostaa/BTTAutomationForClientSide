package com.ibm.btt.allwidgets.Combo;

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

public class Combo_Properties extends Main_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Combo_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		Main_Class.setUp();
		drv = PageFactory.initElements(driver, Combo_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Combo_widget();
		drv.Combo_properties();
		Main_Class.waitUntilLoadElement(20, "widget_combo_properties_combo01");

	}
	
	@Test
	public void proTab() throws InterruptedException{
		
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.properties_tabIndex1());
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.properties_tabIndex4());
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.properties_tabIndex5());
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.properties_tabIndex6());
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.properties_tabIndex7());
	}
	
	@Test
	public void proId(){
		assertEquals("widget_combo_properties_combo01", drv.proId());
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
	public void proDisableFalse(){
		assertEquals(true, drv.proDisableFalse());
	}	
	
	@Test
	public void proDisableTrue(){
		assertEquals("true", drv.proDisableTrue());
	}

	@Test
	public void proReadonlyFalse(){
		assertEquals(true, drv.proReadonlyFalse());
	}
	
	@Test
	public void proReadonlyTrue(){
		assertEquals("true", drv.proReadonlyTrue());
	}
	
	@Test
	public void proShortcut(){
		assertEquals(2, drv.proShortcut());
	}
	
	@Test
	public void proHint(){
		assertEquals("This is no data.", drv.proHint());
	}
	
	@Test
	public void proTypeAHeadFalse(){
		assertEquals("", drv.proTypeAHeadFalse());
	}
	
	@Test
	public void proTypeAHeadTrue(){
		assertEquals(true, drv.proTypeAHeadTrue());
	}
	
	@Test
	public void proPlaceHolder(){
		assertEquals("Please input something.", drv.proPlaceHolder());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, Main_Class.allwidgets,Combo_Properties.class);
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
