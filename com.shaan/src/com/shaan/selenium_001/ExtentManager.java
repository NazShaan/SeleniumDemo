package com.shaan.selenium_001;

import java.io.File;	

import com.relevantcodes.extentreports.ExtentReports;
public class ExtentManager extends BaseTest
{
	public static ExtentReports report;
	
	public static ExtentReports getInstance()
	{
		if(report==null)
		{
	report = new ExtentReports(filePath+"//htmlReports//"+path +".html");
	report.loadConfig(new File(filePath+ "//extentReportConfig.xml"));
	report.addSystemInfo("Selenium Language bindings", "3.1.4");
	report.addSystemInfo("Author:"  , "Naz Shaan");

		}
		return report;
	}
	

}



