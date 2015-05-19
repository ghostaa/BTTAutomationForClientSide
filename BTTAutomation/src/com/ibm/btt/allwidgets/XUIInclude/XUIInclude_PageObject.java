package com.ibm.btt.allwidgets.XUIInclude;

import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.ibm.btt.util.Appearance;
import com.ibm.btt.util.CSS;
import com.ibm.btt.util.Event;
import com.ibm.btt.util.Main_Class;
import com.ibm.btt.allwidgets.*;

public class XUIInclude_PageObject extends Main_Page{
	
//###############################xuiInclude Properties##################################
	@FindBy(xpath=".//*[@id='xuiInclude_form']")
	private WebElement proId;
	
	public String proId(){//Id is xuiInclude
		return proId.getAttribute("id");
	}
	
	@FindBy(id="com_ibm_btt_event_ECALoader_1")
	private WebElement proLocation;
	
	public String proLocation(){//location is xui/snippet/com/ibm/btt/q002/testECA.xui
		return proLocation.getAttribute("url");
	}
	
	@FindBy(id="xuiInclude02_form")
	private WebElement proInherit;
	
	public int proInherit(){
		String[] temp={"visibility: inherit"};
		return Appearance.appearance_query(proInherit.getAttribute("style"), temp);
	}
	
	@FindBy(id="xuiInclude03_panel")
	private WebElement proVisible;
	
	public int proVisible(){
		String[] temp={"visibility: visible"};
		return Appearance.appearance_query(proVisible.getAttribute("style"), temp);
	}
	
	@FindBy(id="xuiInclude04_panel")
	private WebElement proHidden;
	
	public int proHidden(){
		String[] temp={"visibility: hidden"};
		return Appearance.appearance_query(proHidden.getAttribute("style"), temp);
	}
	
//###############################xuiInclude Properties##################################
//###############################xuiInclude Appearance#################################
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[1]/div[3]")
	private WebElement Appearance_1;
	
	public String Appearance_1(){//1.horizontal is left,vertical is top
		String v = Appearance.appearance_place(Appearance_1.getAttribute("style"), "top");
		String h = Appearance_1.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[3]/div[3]")
	private WebElement Appearance_2;
	
	public String Appearance_2(){//2.horizontal is left,vertical is center
		String v = Appearance.appearance_place(Appearance_2.getAttribute("style"), "middle");
		String h = Appearance_2.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[5]/div[3]")
	private WebElement Appearance_3;
	
	public String Appearance_3(){//3.horizontal is left,vertical is bottom
		String v = Appearance.appearance_place(Appearance_3.getAttribute("style"), "bottom");
		String h = Appearance_3.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[7]/div[3]")
	private WebElement Appearance_4;
	
	public String Appearance_4(){//4.horizontal is center,vertical is top
		String v = Appearance.appearance_place(Appearance_4.getAttribute("style"), "top");
		String h = Appearance_4.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[8]/div[3]")
	private WebElement Appearance_5;
	
	public String Appearance_5(){//5.horizontal is center,vertical is center
		String v = Appearance.appearance_place(Appearance_5.getAttribute("style"), "middle");
		String h = Appearance_5.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[10]/div[3]")
	private WebElement Appearance_6;
	
	public String Appearance_6(){//6.horizontal is center,vertical is bottom
		String v =Appearance.appearance_place(Appearance_6.getAttribute("style"), "bottom");
		String h = Appearance_6.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[12]/div[3]")
	private WebElement Appearance_7;
	
	public String Appearance_7(){//7.horizontal is right,vertical is top
		String v = Appearance.appearance_place(Appearance_7.getAttribute("style"), "top");
		String h = Appearance_7.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[14]/div[3]")
	private WebElement Appearance_8;
	
	public String Appearance_8(){//8.horizontal is right,vertical is center
		String v = Appearance.appearance_place(Appearance_8.getAttribute("style"), "middle");
		String h = Appearance_8.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[16]/div[3]")
	private WebElement Appearance_9;
	
	public String Appearance_9(){//9.horizontal is right,vertical is bottom
		String v = Appearance.appearance_place(Appearance_9.getAttribute("style"), "bottom");
		String h = Appearance_9.getAttribute("align");
		return h+"&"+v;
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[18]/div[3]")
	private WebElement Appearance_10;
	
	public int Appearance_10(){//10.horizontal indent is 50px
		String[] temp = {"padding-left: 50px"};
		return Appearance.appearance_query(Appearance_10.getAttribute("style"), temp);
		
	}
	
	@FindBy(xpath=".//*[@id='xuiInclude_appearance_panel']/div[20]/div[3]")
	private WebElement Appearance_11;
	
	public int Appearance_11(){//11.horizontal indent is 5percent
		String[] temp = {"padding-left: 5%"};
		return Appearance.appearance_query(Appearance_11.getAttribute("style"), temp);
	}
//###############################xuiInclude Appearance###############################

}
