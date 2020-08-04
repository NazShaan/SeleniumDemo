package com.shaan.selenium_001;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtMgr extends BaseTest1
{
	
	public static  ExtentReports  getInstance()
	{
		
	ExtentReports ext = new ExtentReports(path + "//htmlReports//" + "or.html");
	ext.loadConfig(new File(path + "//extReport.xml"));
	ext.addSystemInfo("Selenium verisons : ", "3.4.3.2");
	ext.addSystemInfo("Author tester : ", "Shaan Naz");
	
	return ext;
	
	}

}
