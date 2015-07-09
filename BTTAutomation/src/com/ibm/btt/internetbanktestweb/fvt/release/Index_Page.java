package com.ibm.btt.internetbanktestweb.fvt.release;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Index_Page {
	
	@FindBy(linkText="Establish Session")
	private WebElement Establish;
	
	public void Establish(){
		Establish.click();
	}
//IBK-FVT Tab	
	@FindBy(id="index_tabbedPane_tablist_index_ContentPane01")
	private WebElement IBK_FVT;
	
	public void IBK_FVT_tab(){
		IBK_FVT.click();
	}

	
	@FindBy(id="index_link01")
	private WebElement IBK_4_11;//Click link to launch test case for IBK4-11( muti-Widget )
		
	public void IBK_4_11(){
		IBK_4_11.click();
	}
	@FindBy(id="index_link01_copy01")
	private WebElement IBK_F001;
	
	public void IBK_F001(){
		IBK_F001.click();
	}
	@FindBy(id="index_link12")
	private WebElement IBK_F006;
	
	public void IBK_F006(){
		IBK_F006.click();
	}
	@FindBy(id="index_link16")
	private WebElement IBK_F_007;//Click link to launch test case for IBK_F_007:multilanguage switch
		
	public void IBK_F_007(){
		IBK_F_007.click();
	}
	@FindBy(id="index_link07_copy01")
	private WebElement IBK_19_21_sub;
		
	public void IBK_19_21_sub(){
		IBK_19_21_sub.click();
	}
	@FindBy(id="index_IBK25")
	private WebElement IBK_25_ButtonVerticalAlign;
		
	public void IBK_25_ButtonVerticalAlign(){
		IBK_25_ButtonVerticalAlign.click();
	}
	
	@FindBy(id="index_link17")
	private WebElement F003;//Click link to launch test case for F003:header merge and body cell merge
		
	public void F003(){
		F003.click();
	}
	
	@FindBy(id="index_link07_copy01_copy")
	private WebElement IBK_19and21forInnerSubFolder;//Click link to launch test case for IBK19 and 21 for inner sub folder
		
	public void IBK_19and21forInnerSubFolder(){
		IBK_19and21forInnerSubFolder.click();
	}
	
	@FindBy(id="index_IBK20And6")
	private WebElement IBK20AndIBK6;//Click link to launch test case for IBK20 (new line character in table) and IBK6 (Combox supports disabling edit)
		
	public void IBK20AndIBK6(){
		IBK20AndIBK6.click();
	}
	
	@FindBy(id="index_link11_copy")
	private WebElement IBK31;//Click link to launch test case for IBK 31 (Changing Table/Grid Structure with DIV layout)
		
	public void IBK31(){
		IBK31.click();
	}
	
	@FindBy(id="index_IBK30")
	private WebElement IBK30XHTML;//Click link to launch test case for IBK 30 XHTML support
		
	public void IBK30XHTML(){
		IBK30XHTML.click();
	}

    @FindBy(id="index_link18_copy")
    private WebElement IBK_F_018TableDataAppend; //Click link to launch test case for IBK_F_018: Table data append
    
    public void IBK_F_018TableDataAppend(){
    	IBK_F_018TableDataAppend.click();
    }

    @FindBy(id="index_link01_copy")
    private WebElement IBK4_12TableExtension; //Click link to launch test case for IBK4-12( Table Widget Extension : Context menu support )
    
    public void IBK4_12TableExtension(){
    	IBK4_12TableExtension.click();
    }
} 

