package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk19and21;

import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.InternetBankTestWebMain_Class;
import com.ibm.btt.util.Main_Class;

public class IBK19and21_PageObject extends Index_Page {
	
//###############################width and height##################################
	@FindBy(id="req19_page_link")
	private WebElement WidthandHeight;
	
	@FindBy(xpath=".//*[contains(@id,'com_ibm_btt_dijit_Dialog') and contains(@role,'dialog')]")
	private WebElement PopUpPageDialog;
		
	public Boolean WidthandHeight(){
		WidthandHeight.click();
		return PopUpPageDialog.isDisplayed();
	}

	@FindBy(id="req19_21Size_button1")
	private WebElement WidthandHeightButton1;
	
	@FindBy(id="req19_21Size1_Button01")
	private WebElement WidthandHeightButton1Back;

	public int WidthandHeightButton1() {//create a popup page with width=0 and height=100 Please click Button1
		WidthandHeightButton1.click();
		String[] temp={"height: 100px", "width: auto"};
		return Appearance.appearance_query(PopUpPageDialog.findElement(By.className("dijitDialogPaneContent")).getAttribute("style"), temp);
	}

	@FindBy(id="req19_21Size_button2")
	private WebElement WidthandHeightButton2;
	
	@FindBy(id="req19_21Size1_label")
	private WebElement WidthandHeightLable;
	
	@FindBy(id="req19_21Size2_Button01")
	private WebElement WidthandHeightButton2Back;

	public int WidthandHeightButton2() {//width=500 and height=500
		WidthandHeightLable.click();
		Main_Class.keyPress(KeyEvent.VK_PAGE_DOWN);
		Main_Class.keyRelease(KeyEvent.VK_PAGE_DOWN);
		WidthandHeightButton1Back.click();
		WidthandHeightButton2.click();
		String[] temp={"height: 500px", "width: 500px"};
		return Appearance.appearance_query(PopUpPageDialog.findElement(By.className("dijitDialogPaneContent")).getAttribute("style"), temp);
	}
	
	@FindBy(id="req19_21Size_button3")
	private WebElement WidthandHeightButton3;
	
	@FindBy(id="req19_21Size3_Button01")
	private WebElement WidthandHeightButton3Back;
	
	@FindBy(id="req19_21Size_button")
	private WebElement WidthandHeightButtonBack;

	public int WidthandHeightButton3() {//create a popup page with width=500 and height=800 Please click Button3
		WidthandHeightButton2Back.click();
		WidthandHeightButton3.click();
		String[] temp={"width: 800px", "height: 500px"};
		return Appearance.appearance_query(PopUpPageDialog.findElement(By.className("dijitDialogPaneContent")).getAttribute("style"), temp);
	}
	
	public void WidthandHeightReturn(){
		WidthandHeightButton3Back.click();
		WidthandHeightButtonBack.click();
	}

//###############################left and top##################################
	@FindBy(id="req19_page_link_copy")
	private WebElement LeftandTop;
		
	public Boolean LeftandTop(){
		LeftandTop.click();
		return PopUpPageDialog.isDisplayed();
	}

	@FindBy(id="req19_21Position_button")
	private WebElement LeftandTopButton1;
	
	@FindBy(id="req19_21Position1_Button01")
	private WebElement LeftandTopButton1Back;

	public int LeftandTopButton1() {//create a popup page with left=0 and top=0 Please click Button1
		LeftandTopButton1.click();
		String[] temp={"left: 0px", "top: 0px"};
		return Appearance.appearance_query(PopUpPageDialog.getAttribute("style"), temp);
	}

	@FindBy(id="req19_21Position_button2")
	private WebElement LeftandTopButton2;
	
	@FindBy(id="req19_21Position2_Button01")
	private WebElement LeftandTopButton2Back;

	public int LeftandTopButton2() {//create a popup page with left=50 and top=50 Please click Button2
		LeftandTopButton1Back.click();
		LeftandTopButton2.click();
		String[] temp={"left: 50px", "top: 50px"};
		return Appearance.appearance_query(PopUpPageDialog.getAttribute("style"), temp);
	}
	
	@FindBy(id="req19_21Position_button3")
	private WebElement LeftandTopButton3;
	
	@FindBy(id="req19_21Position3_Button01")
	private WebElement LeftandTopButton3Back;
	
	@FindBy(id="req19_21Position_button4")
	private WebElement LeftandTopButtonBack;

	public int LeftandTopButton3() {//create a popup page with width=500 and height=800 Please click Button3
		LeftandTopButton2Back.click();
		LeftandTopButton3.click();
		String[] temp={"left: 50px", "top: 500px"};
		return Appearance.appearance_query(PopUpPageDialog.getAttribute("style"), temp);
	}
	
	public void LeftandTopReturn(){
		LeftandTopButton3Back.click();
		LeftandTopButtonBack.click();
	}
//###############################close box##################################	
	@FindBy(id="req19_page_link_copy01")
	private WebElement CloseBox;
		
	public Boolean CloseBox(){
		CloseBox.click();
		return PopUpPageDialog.isDisplayed();
	}

	@FindBy(id="req19_21CloseBox_button")
	private WebElement CloseBoxButton1;
	
	@FindBy(id="req19_21CloseBox1_Button01")
	private WebElement CloseBoxButton1Back;

	public Boolean CloseBoxButton1() {//create a popup page that its close box is true. please click Button1
		CloseBoxButton1.click();
		WebElement CloseBoxCloseT = PopUpPageDialog.findElement(By.className("dijitDialogCloseIcon"));
		return CloseBoxCloseT.isDisplayed();
	}

	@FindBy(id="req19_21CloseBox_button2")
	private WebElement CloseBoxButton2;
	
	@FindBy(xpath=".//*[@id='com_ibm_btt_dijit_Dialog_42']/div[1]/span[2]")
	private WebElement CloseBoxCloseF;
	
	@FindBy(id="req19_21CloseBox2_Button01")
	private WebElement CloseBoxButton2Back;

	public Boolean CloseBoxButton2() {//create a popup page that its close box is false. please click Button2
		WebElement CloseBoxCloseT = PopUpPageDialog.findElement(By.className("dijitDialogCloseIcon"));
		CloseBoxCloseT.click();
		CloseBoxButton2.click();
		WebElement CloseBoxCloseF = PopUpPageDialog.findElement(By.className("dijitDialogCloseIcon"));
		return CloseBoxCloseF.isDisplayed();
	}
	
	public void CloseBoxReturn(){
		CloseBoxButton2Back.click();
	}
}
