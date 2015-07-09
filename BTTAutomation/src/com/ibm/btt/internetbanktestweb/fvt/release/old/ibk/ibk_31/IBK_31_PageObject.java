package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_31;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.InternetBankTestWebMain_Class;

public class IBK_31_PageObject extends Index_Page {
	
//###############################IBK_31_TableLayout##################################
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_form']/table/tbody/tr[1]/td[1]")
	private WebElement FormTr1Td1;
	
	public String FormTr1Td1(){
		return FormTr1Td1.getTagName();
	}

	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_form']/table/tbody/tr[1]/td[2]")
	private WebElement FormTr1Td2;

	public String FormTr1Td2() {
		return FormTr1Td2.getTagName();
	}
	
	public String FormTr1Td2RowSpan(){
		return FormTr1Td2.getAttribute("rowspan");
	}

	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_form']/table/tbody/tr[2]/td")
	private WebElement FormTr2Td;

	public String FormTr2Td() {
		return FormTr2Td.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_form']/table/tbody/tr[3]/td")
	private WebElement FormTr3Td;
	
	@FindBy(id="TableLayoutWithCombine_link")
	private WebElement skipToNonCombine;

	public String FormTr3Td() {
		return FormTr3Td.getTagName();
	}	
	
	public void skipToNonCombine(){
		skipToNonCombine.click();
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_form']/table/tbody/tr[3]/td")
	private WebElement FormTr4Td;

	public String FormTr4Td() {
		return FormTr4Td.getTagName();
	}	
//Group
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_group']/div/table/tbody/tr[1]/td[1]")
	private WebElement GroupTr1Td1;

	public String GroupTr1Td1() {
		return GroupTr1Td1.getTagName();
	}
	
	public String GroupTr1Td1RowSpan(){
		return GroupTr1Td1.getAttribute("rowspan");
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_group']/div/table/tbody/tr[1]/td[2]")
	private WebElement GroupTr1Td2;

	public String GroupTr1Td2() {
		return GroupTr1Td2.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_group']/div/table/tbody/tr[2]/td")
	private WebElement GroupTr2Td;

	public String GroupTr2Td() {
		return GroupTr2Td.getTagName();
	}
	
//TabbedPane
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_ContentPane01']/table/tbody/tr[1]/td")
	private WebElement TabbedPaneTr1Td;

	public String TabbedPaneTr1Td() {
		return TabbedPaneTr1Td.getTagName();
	}
	
	public String TabbedPaneTr1TdColSpan(){
		return TabbedPaneTr1Td.getAttribute("colspan");
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_ContentPane01']/table/tbody/tr[2]/td[2]")
	private WebElement TabbedPaneTr2Td2;

	public String TabbedPaneTr2Td2() {
		return TabbedPaneTr2Td2.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_ContentPane01']/table/tbody/tr[3]/td[3]")
	private WebElement TabbedPaneTr3Td3;

	public String TabbedPaneTr3Td3() {
		return TabbedPaneTr3Td3.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_ContentPane01']/table/tbody/tr[4]/td[4]")
	private WebElement TabbedPaneTr4Td4;

	public String TabbedPaneTr4Td4() {
		return TabbedPaneTr4Td4.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_ContentPane01']/table/tbody/tr[5]/td[3]")
	private WebElement TabbedPaneTr5Td3;

	public String TabbedPaneTr5Td3() {
		return TabbedPaneTr5Td3.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_ContentPane01']/table/tbody/tr[6]/td[2]")
	private WebElement TabbedPaneTr6Td2;

	public String TabbedPaneTr6Td2() {
		return TabbedPaneTr6Td2.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='TableLayoutWithCombine_ContentPane01']/table/tbody/tr[7]/td")
	private WebElement TabbedPaneTr7Td;

	public String TabbedPaneTr7Td() {
		return TabbedPaneTr7Td.getTagName();
	}
	
	public String TabbedPaneTr7TdColSpan(){
		return TabbedPaneTr7Td.getAttribute("colspan");
	}

//###############################IBK_31_DivLayout##################################
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[1]/div[1]")
	private WebElement FormDiv11;
	
	public String FormDiv11(){
		return FormDiv11.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[1]/div[2]")
	private WebElement FormDiv12;
	
	public String FormDiv12() {
		return FormDiv12.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[2]/div[1]")
	private WebElement FormDiv21;
	
	public String FormDiv21() {
		return FormDiv21.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[2]/div[2]")
	private WebElement FormDiv22;
	
	public String FormDiv22() {
		return FormDiv22.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[3]/div[1]")
	private WebElement FormDiv31;
	
	@FindBy(id="DivLayoutWithoutCombine_link")
	private WebElement skipToFinalPage;
	
	public String FormDiv31() {
		return FormDiv31.getTagName();
	}	
	
	public void skipToFinalPage(){
		skipToFinalPage.click();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[3]/div[2]")
	private WebElement FormDiv32;
	
	public String FormDiv32() {
		return FormDiv32.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[4]/div[1]")
	private WebElement FormDiv41;
	
	public String FormDiv41() {
		return FormDiv41.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_form']/div/div[4]/div[2]")
	private WebElement FormDiv42;
	
	public String FormDiv42() {
		return FormDiv42.getTagName();
	}	
	//Group
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_group']/div/div/div[1]/div[1]")
	private WebElement GroupDiv11;
	
	public String GroupDiv11() {
		return GroupDiv11.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_group']/div/div/div[1]/div[2]")
	private WebElement GroupDiv12;
	
	public String GroupDiv12() {
		return GroupDiv12.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_group']/div/div/div[2]/div[1]")
	private WebElement GroupDiv21;
	
	public String GroupDiv21() {
		return GroupDiv21.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_group']/div/div/div[2]/div[2]")
	private WebElement GroupDiv22;
	
	public String GroupDiv22() {
		return GroupDiv22.getTagName();
	}
	//TabbedPane
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_ContentPane01']/div/div[1]/div[1]")
	private WebElement TabbedPaneDiv11;
	
	public String TabbedPaneDiv11() {
		return TabbedPaneDiv11.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_ContentPane01']/div/div[2]/div[2]")
	private WebElement TabbedPaneDiv22;
	
	public String TabbedPaneDiv22() {
		return TabbedPaneDiv22.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_ContentPane01']/div/div[3]/div[3]")
	private WebElement TabbedPaneDiv33;
	
	public String TabbedPaneDiv33() {
		return TabbedPaneDiv33.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_ContentPane01']/div/div[4]/div[4]")
	private WebElement TabbedPaneDiv44;
	
	public String TabbedPaneDiv44() {
		return TabbedPaneDiv44.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_ContentPane01']/div/div[5]/div[3]")
	private WebElement TabbedPaneDiv53;
	
	public String TabbedPaneDiv53() {
		return TabbedPaneDiv53.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_ContentPane01']/div/div[6]/div[2]")
	private WebElement TabbedPaneDiv62;
	
	public String TabbedPaneDiv62() {
		return TabbedPaneDiv62.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='DivLayoutWithoutCombine_ContentPane01']/div/div[7]/div[1]")
	private WebElement TabbedPaneDiv71;
	
	public String TabbedPaneDiv71() {
		return TabbedPaneDiv71.getTagName();
	}
//final Page
	 @FindBy(id="finalPage_label")
	 private WebElement finalPage;
	 
	 public String finalPage(){
		 return finalPage.getText();
	 }
}