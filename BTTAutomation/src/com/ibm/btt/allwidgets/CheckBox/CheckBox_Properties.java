package com.ibm.btt.allwidgets.CheckBox;

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

public class CheckBox_Properties extends Main_Class {
	/*
	 * private static WebDriver driver; private static String
	 * baseUrl=PropertiesUtil.baseUrl;
	 */
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static CheckBox_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		/*
		 * driver = new FirefoxDriver();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.get(baseUrl);
		 */
		Main_Class.setUp();
		drv = PageFactory.initElements(driver, CheckBox_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.CheckBox_widget();
		drv.CheckBox_properties();

	}
	
	@Test
	public void CheckBox_TabIndex() throws InterruptedException{
		Thread.sleep(2000);
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.CheckBox_properties_tabIndex1Focus());
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.CheckBox_properties_tabIndex2Focus());
		Main_Class.widget_tabIndex();	
		assertEquals(2, drv.CheckBox_properties_tabIndex3Focus());
	}
	@Test
	public void Radio_properties_id() {
		assertEquals("CheckBox_properties_checkBox_id", drv.CheckBox_properties_id());
	}

	@Test
	public void CheckBox_properties_valueString() {
		assertEquals("CheckBox_Rec.String_Data", drv.CheckBox_properties_valueString());
	}

	@Test
	public void CheckBox_properties_valueBoolean() {
		assertEquals("CheckBox_Rec.Boolean_Data", drv.CheckBox_properties_valueBoolean());
	}

	@Test
	public void CheckBox_properties_valueInteger() {
		assertEquals("CheckBox_Rec.Integer_Data", drv.CheckBox_properties_valueInteger());
	}

	@Test
	public void CheckBox_properties_visibility() {
		assertEquals("visibility: inherit;", drv.CheckBox_properties_visibility());
	}

	@Test
	public void CheckBox_properties_hidden() {
		assertEquals("visibility: hidden;", drv.CheckBox_properties_hidden());
	}

	@Test
	public void CheckBox_properties_gone() {
		assertEquals("display: none; visibility: inherit;", drv.CheckBox_properties_gone());
	}

	@Test
	public void CheckBox_properties_disabledFalse() {
		assertEquals(true, drv.CheckBox_properties_disabledFalse());
	}

	@Test
	public void CheckBox_properties_disableTrue() {
		assertEquals("true", drv.CheckBox_properties_disableTrue());
	}
	
	@Test
	public void CheckBox_properties_checkBox_readOnlyFalse() {
		assertEquals(true, drv.CheckBox_properties_checkBox_readOnlyFalse());
	}
	
	@Test
	public void CheckBox_properties_readOnlyTrue() {
		assertEquals("true", drv.CheckBox_properties_readOnlyTrue());
	}
	
	@Test
	public void CheckBox_properties_shortcut() {
		assertEquals("true", drv.CheckBox_properties_shortcut());
	}
	
	@Test
	public void CheckBox_properties_hint() {
		assertEquals("Office Tel",drv.CheckBox_properties_hint());
	}
	
	@Test
	public void CheckBox_properties_hint1() {
		assertEquals("Test checkbox hint", drv.CheckBox_properties_hint1());
	}
	
	@Test
	public void CheckBox_properties_tabIndex1() {
		assertEquals("2",drv.CheckBox_properties_tabIndex1());	
	}
	
	@Test 
	public void CheckBox_properties_tabIndex2(){
		assertEquals("2", drv.CheckBox_properties_tabIndex2());
	}
	
	@Test 
	public void CheckBox_properties_tabIndex3(){
		assertEquals("3", drv.CheckBox_properties_tabIndex3());
	}
	
	@Test 
	public void CheckBox_properties_NLS(){
		assertEquals("MaximumAmount", drv.CheckBox_properties_NLS());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, Main_Class.allwidgets,CheckBox_Properties.class);
		driver.quit();
//		driver.navigate().refresh();
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
