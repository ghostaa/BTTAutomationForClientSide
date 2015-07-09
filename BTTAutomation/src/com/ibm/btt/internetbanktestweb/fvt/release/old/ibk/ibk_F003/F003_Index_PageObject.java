package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F003;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

public class F003_Index_PageObject extends Index_Page {
	
//###############################F003 Index Page##################################
	@FindBy(id="F003_Index_link03")
	private WebElement linkHeader;
	
	@FindBy(id="F003_Index_link04")
	private WebElement linkBody;
	
	@FindBy(id="F003_Index_link05")
	private WebElement linkBoth;
	
	@FindBy(id="F003_Index_link01")
	private WebElement linkCellPadding;
	
	@FindBy(id="F003_Index_link02")
	private WebElement linkAlignmentAndCellStyle;
	
	@FindBy(id="F003_Index_link")
	private WebElement linkMHeaderCellAlign;
	
	public void toHeaderMerge(){
		linkHeader.click();
	}
	
	public void toBodyMerge(){
		linkBody.click();
	}
	
	public void toHeaderBodyMerge(){
		linkBoth.click();
	}
	
	public void toCellPadding(){
		linkCellPadding.click();
	}
	
	public void toAlignmentAndCellStyle(){
		linkAlignmentAndCellStyle.click();
	}
	
	public void toMHeaderCellAlignment(){
		linkMHeaderCellAlign.click();
	}
}
