package com.shaan.selenium_001;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtManager extends BaseTest2
{
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{

	if (report == null) 
	{
		report = new ExtentReports(path + "//htmlReports" + "x.html");
		report.loadConfig(new File(path + "//extentReportConfig.xml"));
		report.addSystemInfo("name : ", "Shaan");
	}
	return report;
	
	}
}
