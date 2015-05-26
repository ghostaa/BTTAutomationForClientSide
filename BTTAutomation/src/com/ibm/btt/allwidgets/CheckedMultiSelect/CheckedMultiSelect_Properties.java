package com.ibm.btt.allwidgets.CheckedMultiSelect;

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

public class CheckedMultiSelect_Properties extends AllWidgetsProjectMain_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static CheckedMultiSelect_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, CheckedMultiSelect_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.CheckedMultiSelect_widget();
		drv.CheckedMultiSelect_properties();
		waitUntilLoadElement(20,"widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy08");

	}
	
	@Test
	public void proTab() throws InterruptedException{
		
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(2, drv.proTabIndex1());
		for(int i=0; i<8; i++){
			AllWidgetsProjectMain_Class.widget_tabIndex();
		}
		assertEquals(2, drv.proTabIndex2());
		for(int i=0; i<8; i++){
			AllWidgetsProjectMain_Class.widget_tabIndex();
		}
		assertEquals(2, drv.proTabIndex3());
		for(int i=0; i<8; i++){
			AllWidgetsProjectMain_Class.widget_tabIndex();
		}
		assertEquals(2, drv.proTabIndex4Focus());
	}
	
	@Test
	public void proId(){
		assertEquals("widget_CheckedMultiSelect_properties_checkedMultiSelect_copy_copy_copy08", drv.proId());
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
	public void proDisableFlase() {
		assertEquals(true, drv.proDisableFlase());
	}

	@Test
	public void proReadonlyTrue() {
		assertEquals(2, drv.proReadonlyTrue());
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
	public void proHintNLS(){
		assertEquals("This is hint test", drv.proHintNLS());
	}

	@Test
	public void proHint(){
		assertEquals("checkedmultiselectlist hint", drv.proHint());
	}
	
	@Test
	public void proTabIndex4(){
		assertEquals("4", drv.proTabIndex4());
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,CheckedMultiSelect_Properties.class);
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
