package com.ibm.btt.allwidgets.Link;

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

public class Link_Properties extends Main_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Link_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		Main_Class.setUp();
		drv = PageFactory.initElements(driver, Link_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
		waitUntilLoadElement(20,"Link_properties_100");

	}
	@Test
	public void tabIndex(){
		Main_Class.widget_tabIndex();
		assertEquals(true, drv.pro_isfocused());
	}
	
	@Test
	public void proChange() {
		assertEquals("linkid=100", drv.proChange());
	}

	@Test
	public void proText() {
		assertEquals("test page", drv.proText());
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
		assertEquals(1, drv.proDisableTrue());
	}

	@Test
	public void proDisableFalse() {
		assertEquals(1, drv.proDisableFalse());
	}
	
	@Test
	public void proShortcut(){
		assertEquals(baseUrl + "index.jsp", drv.proShortcut());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}
	
	@Test
	public void pro_parent() throws Exception{
		assertEquals(baseUrl + "index.jsp", drv.pro_parent());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}	
	
	@Test
	public void pro_self() throws Exception{
		assertEquals(baseUrl + "index.jsp", drv.pro_self());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}

	@Test
	public void pro_blank() throws Exception{
		assertEquals("about:blank", drv.pro_blank());
		driver.close();
		Link_Properties.setUp();
	}
	
	@Test
	public void pro_top() throws Exception{
		assertEquals(baseUrl + "index.jsp", drv.pro_top());
		drv.Establish();
		drv.BTT8200_tab();
		drv.Link_widget();
		drv.Link_properties();
	}
	
	@Test
	public void pro_Hint(){
		assertEquals("Successfully test", drv.pro_Hint());
	}
	
	@Test
	public void pro_tabIndex(){
		assertEquals("3", drv.pro_tabIndex());
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, Main_Class.allwidgets,Link_Properties.class);
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
