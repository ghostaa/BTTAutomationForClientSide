package com.ibm.btt.allwidgets.Text;

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
public class Text_Properties extends AllWidgetsProjectMain_Class {
	/*
	 * private static WebDriver driver; private static String
	 * baseUrl=PropertiesUtil.baseUrl;
	 */
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Text_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		/*
		 * driver = new FirefoxDriver();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.get(baseUrl);
		 */
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, Text_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Text_widget();
		drv.Text_Properties();
		AllWidgetsProjectMain_Class.waitUntilLoadElement(20, "Text_properties_text09");

	}
	
	@Test
	public void Text_tabIndex() {
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(true, AllWidgetsProjectMain_Class.widget_isFocus("Text_properties_text09"));
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(true, AllWidgetsProjectMain_Class.widget_isFocus("Text_properties_text11"));
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(true, AllWidgetsProjectMain_Class.widget_isFocus("Text_properties_text08"));
	}

	@Test
	public void Text_id() {
		assertEquals("", drv.Text_properties_id_getText());
	}

	@Test
	public void Text_visibility() {
		assertEquals(true, drv.Text_properties_visible());
	}

	@Test
	public void Text_hidden() {
		assertEquals(1, drv.Text_properties_hidden());
	}

	@Test
	public void Text_gone() {
		assertEquals(1, drv.Text_properties_gone());
	}

	@Test
	public void Text_disableTrue() {
		assertEquals("true", drv.Text_properties_disableTrue());
	}

	@Test
	public void Text_disableFalse() {
		assertEquals(true, drv.Text_properties_disableFalse());
	}

	@Test
	public void Text_readonlyTrue() {
		assertEquals("true", drv.Text_properties_readonlyTrue());
	}

	@Test
	public void Text_readonlyFalse() {
		assertEquals(true, drv.Text_properties_readonlyFalse());
	}

	@Test
	public void Text_1_shortcut() {
		assertEquals(true, drv.Text_properties_shortcut());
	}
	
	@Test
	public void Text_hint() {
		assertEquals("This is hint test", drv.Text_properties_hint());
	}
	
	@Test
	public void Text_password() {
		assertEquals("password", drv.Text_properties_password());
		drv.Text_properties_password_sendKeys();
	}
	
	@Test
	public void Text_0_getTabIndex() {
		assertEquals("2", drv.Text_properties_tabIndex_getTabIndex());
	}
	
	@Test
	public void Text_maxLength() {
		drv.Text_properties_maxLength_sendKeys();
		assertEquals("1234567890",drv.Text_properties_maxLength_getValue());
		assertEquals("10", drv.Text_properties_maxLength_getSize());
	}
	
	@Test
	public void Text_placeHolder() {
		assertEquals("input your text", drv.Text_properties_placeHolder_getText());
	}
	
	@Test
	public void Text_acceptedCharReg() {
		drv.Text_properties_acceptedCharReg_sendKeys("123321");
		assertEquals("",drv.Text_properties_acceptedCharReg_getValue());
		drv.Text_properties_acceptedCharReg_sendKeys("!@#$%%");
		assertEquals("",drv.Text_properties_acceptedCharReg_getValue());
		drv.Text_properties_acceptedCharReg_sendKeys("asdfgh");
		assertEquals("asdfgh",drv.Text_properties_acceptedCharReg_getValue());
		
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,Text_Properties.class);
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
