package com.shaan.selenium_001;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_007 extends BaseTest2

{

	public static void main(String[] args) {
		m1();
		ExtentTest test = report.startTest("TC_007");
		test.log(LogStatus.INFO, "Initialized the m1 method");
		
		System.getProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://target.com");
		driver.manage().window().maximize();
		test.log(LogStatus.PASS, "launched the Browser and navigate to url");
		
		driver.findElementById("search").sendKeys("Books");
		test.log(LogStatus.PASS, "Entered search element");
		
		driver.findElementByClassName("searchInputForm").click();
		//driver.findElementByClassName("SearchInputButton-sc-1opoijs-0 gpTjzt").click();
		test.log(LogStatus.PASS, "click on Button");

		
		report.endTest(test);
		report.flush();
	}

}
