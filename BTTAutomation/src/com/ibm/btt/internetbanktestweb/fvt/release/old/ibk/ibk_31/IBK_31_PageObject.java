package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_31;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;
import com.ibm.btt.util.InternetBankTestWebMain_Class;

public class IBK_31_PageObject extends Index_Page {
	
//###############################IBK_31##################################
//The Form is 2*4 	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_form']/table/tbody/tr[1]/td[1]")
	private WebElement TableStructureTr1Td1;
	
	public String TableStructureTr1Td1(){
		return TableStructureTr1Td1.getTagName();
	}

	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_form']/table/tbody/tr[1]/td[2]")
	private WebElement TableStructureTr1Td2;

	public String TableStructureTr1Td2() {
		return TableStructureTr1Td2.getTagName();
	}

	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_form']/table/tbody/tr[2]/td[1]")
	private WebElement TableStructureTr2Td1;

	public String TableStructureTr2Td1() {
		return TableStructureTr2Td1.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_form']/table/tbody/tr[2]/td[2]")
	private WebElement TableStructureTr2Td2;

	public String TableStructureTr2Td2() {
		return TableStructureTr2Td2.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_form']/table/tbody/tr[3]/td")
	private WebElement TableStructureTr3Td;

	public String TableStructureTr3Td() {
		return TableStructureTr3Td.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_form']/table/tbody/tr[4]/td[1]")
	private WebElement TableStructureTr4Td1;

	public String TableStructureTr4Td1() {
		return TableStructureTr4Td1.getTagName();
	}	
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_form']/table/tbody/tr[4]/td[2]")
	private WebElement TableStructureTr4Td2;

	public String TableStructureTr4Td2() {
		return TableStructureTr4Td2.getTagName();
	}	
//Group
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_group']/div/div/div[1]/div[1]")
	private WebElement GroupDiv11;

	public String GroupDiv11() {
		return GroupDiv11.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_group']/div/div/div[1]/div[2]")
	private WebElement GroupDiv12;

	public String GroupDiv12() {
		return GroupDiv12.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_group']/div/div/div[2]/div[1]")
	private WebElement GroupDiv21;

	public String GroupDiv21() {
		return GroupDiv21.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_group']/div/div/div[2]/div[2]")
	private WebElement GroupDiv22;

	public String GroupDiv22() {
		return GroupDiv22.getTagName();
	}
//TabbedPane
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_ContentPane01']/div/div[1]/div[1]")
	private WebElement TabbedPaneDiv11;

	public String TabbedPaneDiv11() {
		return TabbedPaneDiv11.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_ContentPane01']/div/div[2]/div[2]")
	private WebElement TabbedPaneDiv22;

	public String TabbedPaneDiv22() {
		return TabbedPaneDiv22.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_ContentPane01']/div/div[3]/div[3]")
	private WebElement TabbedPaneDiv33;

	public String TabbedPaneDiv33() {
		return TabbedPaneDiv33.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_ContentPane01']/div/div[4]/div[4]")
	private WebElement TabbedPaneDiv44;

	public String TabbedPaneDiv44() {
		return TabbedPaneDiv44.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_ContentPane01']/div/div[5]/div[3]")
	private WebElement TabbedPaneDiv53;

	public String TabbedPaneDiv53() {
		return TabbedPaneDiv53.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_ContentPane01']/div/div[6]/div[2]")
	private WebElement TabbedPaneDiv62;

	public String TabbedPaneDiv62() {
		return TabbedPaneDiv62.getTagName();
	}
	
	@FindBy(xpath=".//*[@id='CopyFromTableToDIVExistCombine_ContentPane01']/div/div[7]/div[1]")
	private WebElement TabbedPaneDiv71;

	public String TabbedPaneDiv71() {
		return TabbedPaneDiv71.getTagName();
	}

}
