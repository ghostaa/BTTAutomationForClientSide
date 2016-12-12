package com.ibm.btt.allwidgets.VerticalSlider;

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

public class VerticalSlider_Properties extends AllWidgetsProjectMain_Class {

	private boolean acceptNextAlert = true;
	private static StringBuffer verificationErrors = new StringBuffer();
	private static VerticalSlider_PageObject drv;

	@BeforeClass
	public static void setUp() throws Exception {
		
		AllWidgetsProjectMain_Class.setUp();
		drv = PageFactory.initElements(driver, VerticalSlider_PageObject.class);
		drv.Establish();
		drv.BTT8200_tab();
		drv.VerticalSlider_widget();
		drv.VerticalSlider_properties();
	}
	
	@Test
	public void isIDRight(){
		assertEquals("VerticalSlider_properties1_VerticalSlider_my",drv.proId());
	}
	
	@Test
	public void disabledSlider(){
		assertEquals(2,drv.proDisableTrue());
	}
	
	@Test
	public void readonlySlider(){
		assertEquals(2,drv.proReadonlyTrue());
	}
	
/*	@Test
	public void nameSlider(){ //4. name - this properties is not show any feature on page,so I used the attribute to judge
		assertEquals("nameValue",drv.proName());
	}*/
	
	@Test
	public void valueSlider(){
		assertEquals("30",drv.proValue());
	}
	
	@Test
	public void clickselectSlider(){
		assertEquals("0",drv.proClickselect());
	}
	
	@Test
	public void maxiumSlider(){
		assertEquals("200",drv.proMaxium());
	}
	
	@Test
	public void miniumSlider(){
		assertEquals("10",drv.proMinium());
	}
	
	@Test
	public void showbuttonSlider(){
		assertEquals("display: none;",drv.proShowButton1());
		assertEquals("display: none;",drv.proShowButton2());
	}
	
	@Test
	public void leftLabel_count_fontSize(){
		assertEquals("font-size: 20px;",drv.proLeftLableFontSize());
		assertEquals("0%",drv.proLeftlabelCount1());
		assertEquals("25%",drv.proLeftlabelCount2());
		assertEquals("50%",drv.proLeftlabelCount3());
		assertEquals("75%",drv.proLeftlabelCount4());
		assertEquals("100%",drv.proLeftlabelCount5());
	}
/*	
	@Test
	public void leftLabel_labels_color(){
		assertEquals("0",drv.proLeftlabelsLabel1());
		assertEquals("100",drv.proLeftlabelsLabel2());
		assertEquals(true,drv.proLeftlabelsColor1().contains("color: rgb(255, 0, 0);"));
		assertEquals(true,drv.proLeftlabelsColor2().contains("color: rgb(255, 0, 0);"));
	}*/
	
/*	@Test
	public void leftRules_count_width1(){
		//assertEquals("3",drv.proLeftRulesCount1());
		assertEquals("width: 10px;",drv.proLeftRulesWidth1());
	}*/
	
	@Test
	public void leftRules_count_width2(){
		//assertEquals("3",drv.proLeftRulesCount1());
		assertEquals("width: 30px;",drv.proLeftRulesWidth2());
	}
	
	
	@AfterClass
	public static void tearDown() throws Exception {
		Tools.snapshot((TakesScreenshot) driver, AllWidgetsProjectMain_Class.allwidgets,VerticalSlider_Properties.class);
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
