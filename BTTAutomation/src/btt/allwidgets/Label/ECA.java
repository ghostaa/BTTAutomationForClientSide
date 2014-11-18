package btt.allwidgets.Label;

import java.awt.Robot;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import btt.allwidgets.Index_Page;
import btt.allwidgets.Main_Page;

import com.gargoylesoftware.htmlunit.javascript.host.Element;
import com.opera.core.systems.internal.input.KeyEvent;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import org.openqa.selenium.remote.server.handler.WebDriverHandler;
import org.openqa.selenium.remote.server.handler.interactions.MouseUp;
import java.util.*;

public class ECA {
  private static WebDriver driver;
  private static String baseUrl;
  private boolean acceptNextAlert = true;
  private static StringBuffer verificationErrors = new StringBuffer();
  private String result_txt="Passed";
  protected java.util.List<String> checkPoint=new ArrayList<String>();
  private static Label_PageObject drv;
  
  @BeforeClass
  public static void setUp() throws Exception {	  
	driver = new FirefoxDriver();
	String baseUrl = "http://localhost:8080/";
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get(baseUrl + "InternetBankTestWeb/");
	drv=PageFactory.initElements(driver, Label_PageObject.class);
	drv.Establish();
    drv.BTT8200_tab();
    drv.Label_widget();
    drv.label_ECA(); 
    drv.ID_exp();
    drv.Text_exp();
    drv.ID_false();
    drv.ID_visibility();
  }

  @Test
  public void ID_exp(){
	  assertEquals("ok", drv.ID_exp_getText());
  }
  

  @AfterClass
  public static void tearDown() throws Exception {
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
