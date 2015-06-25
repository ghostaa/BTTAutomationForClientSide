package com.ibm.btt.internetbanktestweb.fvt.release.old.ibk.ibk_F018;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.ibm.btt.internetbanktestweb.fvt.release.Index_Page;

/***SUPPORTER  BY  Jing GR Shang****/
public class IBK_F018_PageObject extends Index_Page{
	
	/*-------the links in second page-----*/
	@FindBy(id="IBK_F_018_UseCases_link")
    private WebElement IBK_F_018_UC1_link; //UC1 - Table Append Data From Ajax Operation
    
    public void IBK_F_018_UC1(){
    	IBK_F_018_UC1_link.click();
    }
    
    @FindBy(id="IBK_F_018_UseCases_link01")
    private WebElement IBK_F_018_UC2_link; //UC2 - Table Append Data From User Input
    
    public void IBK_F_018_UC2(){
    	IBK_F_018_UC2_link.click();
    }
    
    @FindBy(id="IBK_F_018_UseCases_link01_copy")
    private WebElement IBK_F_018_UC3_link; //UC3 - Table Edit and row up/down
    
    public void IBK_F_018_UC3(){
    	IBK_F_018_UC3_link.click();
    }
    
    @FindBy(id="index_label")
    private WebElement index_label;
    public WebElement Index_Label(){
    	return index_label;
    }
    

	/*-----UC1 element start-----*/
	
	@FindBy(id="TableAppendFromOp_button")
	private WebElement TableAppendFromOp_button;
	
	public void TableAppendFromOp_button(){
		TableAppendFromOp_button.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[11]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement append_00;
	
	public WebElement getTableAppend_00(){
		return append_00;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[13]/table/tbody/tr/td[2]/div/div[1]/span")
	private WebElement append_02;
	
	public void TableAppend_02(){
		append_02.click();
	}
	
	@FindBy(id="TableAppendFromOp_button01")
	private WebElement uc1_ok_button;
	
	public WebElement getUC1_OK_button(){
		return uc1_ok_button;
	}
	/*-----UC1 element end-----*/
	/*-----UC2 element start-----*/
	@FindBy(id="TableAppendFromInput_text")
	private WebElement TableAppendFromInput_text;
	
	public WebElement getTableAppendFromInput_text(){
		return TableAppendFromInput_text;
	}
	
	@FindBy(id="TableAppendFromInput_text01")
	private WebElement TableAppendFromInput_text01;
	
	public WebElement getTableAppendFromInput_text01(){
		return TableAppendFromInput_text01;
	}
	
	@FindBy(id="TableAppendFromInput_text02")
	private WebElement TableAppendFromInput_text02;
	
	public WebElement getTableAppendFromInput_text02(){
		return TableAppendFromInput_text02;
	}
	//append button
	@FindBy(id="TableAppendFromInput_button_label")
	private WebElement TableAppendFromInput_button;
	
	public void TableAppendFromInput_button(){
		TableAppendFromInput_button.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement table_name_view1;
	
	public WebElement getTable_name_view1(){
		return table_name_view1;
	}
	
	public void table_name_view(){
		table_name_view1.click();
	}
	
	//TODO
/*	@FindBy(id="com_ibm_btt_dijit_StringTextBox_2")
	private WebElement table_name1;
	
	public String getEditable_name(){
		(new Main_Class()).doubleClickByXpath(".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[1]");
		return table_name1.getAttribute("value");
	}
	*/
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[2]/div/div[1]/span")
	private WebElement table_age_view1;
	
	public WebElement getTable_age_view1(){
		return table_age_view1;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[3]/div/div[1]/span")
	private WebElement table_account_view1;
	
	public WebElement getTable_account_view1(){
		return table_account_view1;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement table_name_view2;
	
	public WebElement getTable_name_view2(){
		return table_name_view2;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[2]/div/div[1]/span")
	private WebElement table_age_view2;
	
	public WebElement getTable_age_view2(){
		return table_age_view2;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[3]/div/div[1]/span")
	private WebElement table_account_view2;
	
	public WebElement getTable_account_view2(){
		return table_account_view2;
	}
	//select button
	@FindBy(id="TableAppendFromInput_button01")
	private WebElement TableAppendFromInput_button01;
	
	public void TableAppendFromInput_button01(){
		TableAppendFromInput_button01.click();
	}
	//complete button
	@FindBy(id="TableAppendFromInput_button02")
	private WebElement TableAppendFromInput_button02;
	
	public void TableAppendFromInput_button02(){
		TableAppendFromInput_button02.click();
	}
	
	/*-----UC2 element end-----*/
	/*-----UC3 element start-----*/
	@FindBy(id="TableEdit_text")
	private WebElement TableEdit_text;
	
	public WebElement getTableEdit_text(){
		return TableEdit_text;
	}
	
	@FindBy(id="TableEdit_text01")
	private WebElement TableEdit_text01;
	
	public WebElement getTableEdit_text01(){
		return TableEdit_text01;
	}
	
	@FindBy(id="TableEdit_text02")
	private WebElement TableEdit_text02;
	
	public WebElement getTableEdit_text02(){
		return TableEdit_text02;
	}
	//append button
	@FindBy(id="TableEdit_AppendButton_label")
	private WebElement TableEdit_AppendButton;
	
	public void TableEdit_AppendButton(){
		TableEdit_AppendButton.click();
	}
	//new button
	@FindBy(id="TableEdit_NewButton")
	private WebElement TableEdit_NewButton;
	
	public void TableEdit_NewButton(){
		TableEdit_NewButton.click();
	}
	//delete button
	@FindBy(id="TableEdit_DeleteButton")
	private WebElement TableEdit_DeleteButton;
	
	public void TableEdit_DeleteButton(){
		TableEdit_DeleteButton.click();
	}
	//up button
	@FindBy(id="TableEdit_UpButton")
	private WebElement TableEdit_UpButton;
	
	public void TableEdit_UpButton(){
		TableEdit_UpButton.click();
	}
	//down button
	@FindBy(id="TableEdit_DownButton")
	private WebElement TableEdit_DownButton;
	
	public void TableEdit_DownButton(){
		TableEdit_DownButton.click();
	}
	
	//select button
	@FindBy(id="TableEdit_button01")
	private WebElement TableEdit_button01;
	
	public void TableEdit_button01(){
		TableEdit_button01.click();
	}
	//complete button
	@FindBy(id="TableEdit_button02")
	private WebElement TableEdit_button02;
	
	public void TableEdit_button02(){
		TableEdit_button02.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement customer_name_view1;
	
	public WebElement getCustomer_name_view1(){
		return customer_name_view1;
	}
	
	public void table_name_edit(){
		customer_name_view1.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[2]/div/div[1]/span")
	private WebElement customer_age_view1;
	
	public WebElement getCustomer_age_view1(){
		return customer_age_view1;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[2]/table/tbody/tr/td[3]/div/div[1]/span")
	private WebElement customer_account_view1;
	
	public WebElement getCustomer_account_view1(){
		return customer_account_view1;
	}
	//the third record
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement customer_name_view2;
	
	public WebElement getCustomer_name_view2(){
		return customer_name_view2;
	}
	
	public void table_name_edit2(){
		customer_name_view2.click();
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[2]/div/div[1]/span")
	private WebElement customer_age_view2;
	
	public WebElement getCustomer_age_view2(){
		return customer_age_view2;
	}
	
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[3]/table/tbody/tr/td[3]/div/div[1]/span")
	private WebElement customer_account_view2;
	
	public WebElement getCustomer_account_view2(){
		return customer_account_view2;
	}
	//the first record
	@FindBy(xpath=".//*[@id='dojox_grid__View_1']/div/div/div/div[1]/table/tbody/tr/td[1]/div/div[1]/span")
	private WebElement customer_name_view0;
	
	public WebElement getCustomer_name_view0(){
		return customer_name_view0;
	}
	
	public void table_name_edit0(){
		customer_name_view0.click();
	}
	
	/*-----UC3 element end-----*/
}
