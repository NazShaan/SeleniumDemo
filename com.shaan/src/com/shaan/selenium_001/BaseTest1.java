package com.shaan.selenium_001;

import com.relevantcodes.extentreports.ExtentReports;


public class BaseTest1 {
	
	public static String path;
	public static ExtentReports report;

	
	public static void m1()
	{
		path = System.getProperty("user.dir");
		
		report = ExtMgr.getInstance();
		
	}

}
