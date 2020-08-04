package com.shaan.selenium_001;

import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest1
{

	public static void main(String[] args) 
	{
		m1();
		
		 ExtentTest test6 = report.startTest("TC_006");
		test6.getStartedTime();
		test6.log(LogStatus.INFO, "called the m1 method");
		System.getProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://bestbuy.com");
		test6.log(LogStatus.PASS, "navigated to bestbuy prod urls");
		test6.getStartedTime();
		report.endTest(test6);
		report.flush();
	}

}
