package com.ibm.btt.allwidgets.Button;

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

public class Button_Properties extends AllWidgetsProjectMain_Class {
	/*
	 * private static WebDriver driver; private static String
	 * baseUrl=PropertiesUtil.baseUrl;
	 */
	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static Button_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		/*
		 * driver = new FirefoxDriver();
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 * driver.get(baseUrl);
		 */
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, Button_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.Button_widget();
		drv.button_properties();
		waitUntilLoadElement(20,"button_properties_Button1");

	}
	
	@Test
	public void Text_tabIndex() throws InterruptedException {
		
		AllWidgetsProjectMain_Class.widget_tabIndex();
		assertEquals(2, drv.proTabFocus());
	}
	
	@Test
	public void proId() {
		assertEquals("button_properties_Button1", drv.proId());
	}
	
	@Test
	public void proTypeSubmit() {
		assertEquals("submit", drv.proTypeSubmit());
	}
	
	@Test
	public void proTypeReset() {
		assertEquals("reset", drv.proTypeReset());
	}
	
	@Test
	public void proTypeSubmitNoData() {
		assertEquals("text", drv.proTypeSubmitNoData());
		assertEquals("submit with no data", drv.proTypeSubmitNoData_text());
	}
	
	@Test
	public void proTypeSubmitNoValidation() {
		assertEquals("text", drv.proTypeSubmitNoValidation());
		assertEquals("submit without validation", drv.proTypeSubmitNoValidation_text());
	}
	
	@Test
	public void proNLS() {
		assertEquals("Exit", drv.proNLS());
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
	public void proDisableFalse() {
		assertEquals(true, drv.proDisableFalse());
	}
	
	@Test
	public void proDisableTrue() {
		assertEquals("true", drv.proDisableTrue());
	}
	
	@Test
	public void proShortcut() {
		assertEquals(2, drv.proShortcut());
	}
	
	@Test
	public void proHint() {
		assertEquals("sale5", drv.proHint());
	}
	
	@Test
	public void proImg() {
		assertEquals(AllWidgetsProjectMain_Class.baseUrl + "img/10days.jpg", drv.proImg());
	}
	
	@Test
	public void proTabIndex() {
		assertEquals("2", drv.proTabIndex());
	}

	

	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,Button_Properties.class);
//		driver.navigate().refresh();
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
