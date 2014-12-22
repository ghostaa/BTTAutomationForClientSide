package com.ibm.btt.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class Tools {

	/**
	 * @param args
	 */
	public static void snapshot(TakesScreenshot drivername, String filename)
	  {
	      // this method will take screen shot ,require two parameters ,one is driver name, another is file name
	      
	    String currentPath = System.getProperty("user.dir"); //get current work folder
	    System.out.println(currentPath);
	    File scrFile = drivername.getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        try {
	            System.out.println("save snapshot path is:"+currentPath+"/"+filename);
	            FileUtils.copyFile(scrFile, new File(currentPath+"\\"+filename));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            System.out.println("Can't save screenshot");
	            e.printStackTrace();
	        } 
	        finally
	        {
	           
	            System.out.println("screen shot finished");
	        }
	  }
	
	public static void snapshot(TakesScreenshot drivername, String path,Class c)
	  {
	      // this method will take screen shot ,require two parameters ,one is driver name, another is file name
	      
	    String currentPath = System.getProperty("user.dir"); //get current work folder
	    System.out.println(currentPath);
	    File scrFile = drivername.getScreenshotAs(OutputType.FILE);
	        // Now you can do whatever you need to do with it, for example copy somewhere
	        try {
	            FileUtils.copyFile(scrFile, new File(currentPath+"\\SnapShot\\"+path+"\\"+c.getName()+".jpg"));
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            System.out.println("Can't save screenshot");
	            e.printStackTrace();
	        } 
	        finally
	        {
	           
	            System.out.println("screen shot finished");
	        }
	  }

}
