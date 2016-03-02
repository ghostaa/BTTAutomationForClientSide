package com.ibm.btt.allwidgets.Radio;
import org.junit.runner.RunWith;  
import org.junit.runners.Suite;   
  
@RunWith(Suite.class)  
@Suite.SuiteClasses({    
	Radio_Properties.class,    
	Radio_Event.class,
	Radio_Condition.class,
	Radio_Action.class,
	Radio_CSS.class,
	Radio_submit.class,
	Radio_appearance1.class,
	Radio_appearance2.class,
	Radio_submitWithNoData.class,
	Radio_submitWithoutValidation.class,
	Radio_ECA.class,
}) 
public class RadioSuite {

}
