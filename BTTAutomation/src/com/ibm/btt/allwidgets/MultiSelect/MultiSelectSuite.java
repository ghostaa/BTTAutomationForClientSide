package com.ibm.btt.allwidgets.MultiSelect;
import org.junit.runner.RunWith;  
import org.junit.runners.Suite;   
  
@RunWith(Suite.class)  
@Suite.SuiteClasses({    
	MultiSelect_Properties.class,    
	MultiSelect_ECA.class,
	MultiSelect_CSS.class,
    MultiSelect_Submit.class,
    MultiSelect_SubmitWithNoData.class,
    MultiSelect_SubmitWithoutValidation.class,
	MultiSelect_appearance1.class,
	MultiSelect_appearance2.class,
	MultiSelect_Validation.class,
}) 
public class MultiSelectSuite {

}
