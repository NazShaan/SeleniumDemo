package com.shaan.selenium_001;

import org.apache.log4j.Logger;

public class TC_003  extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_003.class);
	
	public static void main(String[] args) throws Exception {
		
		init();
		log.info("Initializing the init method form BaseClass");
		
		launch("chromeBrowser");
		log.info("launch the by calling "+p.getProperty("chromeBrowser"));
		
		navigate("amazonUrl");
		log.info("Navigate to url.. " + childProp.getProperty("amazonUrl"));
		
		selectOption("amazonDropDown_id", "amazonSelectOption");
		log.info("Select the Dropdown using locator : " + or.getProperty("amazonDropDown_id")+ " and selected "+or.getProperty( "amazonSelectOption"));
		
		typeText("amazonSerchText_name","amazonEnterText");
		log.info("entered text using locator : " + or.getProperty("amazonSerchText_name") +" and call the parameter :"+or.getProperty("amazonEnterText"));
		
		clickElements("amazonSerchButton_xpath");
		log.info("Click on the Search Button using locator : " + or.getProperty("amazonSerchButton_xpath"));
		
		
		//driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Porter");
		//driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")).click();
		
		
		
		

	}

	

}
