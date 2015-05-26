package com.ibm.btt.common.drivercontroller;

import com.ibm.btt.common.broswercontroller.Broswer;

public class DriverController {
	public DriverController switchDriverController(Broswer broswer){
		switch(broswer){
		case IE:
			System.out.println("IE");
			return new InternetExplorerDriverController();
		case Firefox:
			System.out.println("Firefox");
			return new FirefoxDriverController();
		default:
			break;
		
		}
		return null;
	}
}
