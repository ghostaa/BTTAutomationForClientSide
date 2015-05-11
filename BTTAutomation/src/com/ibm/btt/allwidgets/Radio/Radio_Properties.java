package com.ibm.btt.allwidgets.Radio;

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

public class Radio_Properties extends Main_Class {
	/*
	 * private static WebDriver driver; private static String
	 * baseUrl=PropertiesUtil.baseUrl;
	 */
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Radio_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		/*
		 * driver = new FirefoxDriver();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.get(baseUrl);
		 */
		Main_Class.setUp();
		drv = PageFactory.initElements(driver, Radio_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Radio_widget();
		drv.Radio_properties();

	}
	
	@Test
	public void Radio_TabIndex() throws InterruptedException{
		Thread.sleep(2000);
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.Radio_properties_tabIndex1Focus());
		Main_Class.widget_tabIndex();
		assertEquals(2, drv.Radio_properties_tabIndex2Focus());
		Main_Class.widget_tabIndex();	
		assertEquals(2, drv.Radio_properties_tabIndex3Focus());
	}
	@Test
	public void Radio_properties_id() {
		assertEquals("Radio_properties_radio_Id_copy", drv.Radio_properties_id());
	}

	@Test
	public void Radio_properties_value() {
		assertEquals("Radio_value", drv.Radio_properties_value());
	}

	@Test
	public void Radio_properties_Rate() {
		assertEquals("Rate", drv.Radio_properties_Rate());
	}

	@Test
	public void Radio_properties_visible() {
		assertEquals(true, drv.Radio_properties_visible());
	}

	@Test
	public void Radio_properties_hidden() {
		assertEquals(1, drv.Radio_properties_hidden());
	}

	@Test
	public void Radio_properties_gone() {
		assertEquals(1, drv.Radio_properties_gone());
	}

	@Test
	public void Radio_properties_disableTrue() {
		assertEquals("true", drv.Radio_properties_disableTrue());
	}

	@Test
	public void Radio_properties_shortcut() {
		assertEquals("true", drv.Radio_properties_shortcut());
	}

	@Test
	public void Radio_properties_readonlyTrue() {
		assertEquals("true", drv.Radio_properties_readonlyTrue());
	}
	
	@Test
	public void Radio_properties_readonlyFalse() {
		assertEquals(true, drv.Radio_properties_readonlyFalse());
	}
	
	@Test
	public void Radio_properties_hint() {
		assertEquals("Test radio hint", drv.Radio_properties_hint());
	}
	
	@Test
	public void Radio_properties_NLShint() {
		assertEquals("Usable", drv.Radio_properties_NLShint());
	}
	
	@Test
	public void Radio_properties_tabIndex1() {
		assertEquals("1",drv.Radio_properties_tabIndex1());
	}
	
	@Test
	public void Radio_properties_tabIndex2() {
		assertEquals("2", drv.Radio_properties_tabIndex2());
	}
	
	@Test
	public void Radio_properties_tabIndex3() {
		assertEquals("3",drv.Radio_properties_tabIndex3());	
	}
	
	@Test 
	public void Radio_properties_NLS(){
		assertEquals("ÖÐÎÄ", drv.Radio_properties_NLS());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, Main_Class.allwidgets,Radio_Properties.class);
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
