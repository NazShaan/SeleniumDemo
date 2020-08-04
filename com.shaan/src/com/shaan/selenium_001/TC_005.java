package com.shaan.selenium_001;

import com.relevantcodes.extentreports.LogStatus;

public class TC_005  extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception {
		
		init();
		test = report.startTest("TC_005");
		test.log(LogStatus.INFO,  "Initializing the init method form BaseClass");
		
		
		
		launch("chromeBrowser");
		test.log(LogStatus.PASS, "launching the broser using the locator "+p.getProperty("chromeBrowser"));
		
		navigate("amazonUrl");
		test.log(LogStatus.PASS, "Navigate to url.. " + childProp.getProperty("amazonUrl"));
		
		
		
		selectOption("amazonDropDown_id", "amazonSelectOption");
		test.log(LogStatus.PASS, "Select the Dropdown using locator : " + or.getProperty("amazonDropDown_id")+ " and selected "+or.getProperty( "amazonSelectOption"));
	
		
		typeText("amazonSerchText_name","amazonEnterText");
		test.log(LogStatus.PASS, "entered text using locator : " + or.getProperty("amazonSerchText_name") +" and call the parameter :"+or.getProperty("amazonEnterText"));
		
		
		clickElements("amazonSerchButton_xpath");
		test.log(LogStatus.FAIL, "Click on the Search Button using locator : " + or.getProperty("amazonSerchButton_xpath"));
		
		
		
		report.endTest(test);
		report.flush();
		
		
		
		

	}

	

}
