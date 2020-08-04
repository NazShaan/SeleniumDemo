package com.shaan.selenium_001;

import java.io.FileInputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseTest
{
	public static WebDriver driver;
	public static String filePath = System.getProperty("user.dir");
	public static Properties p;
	public static Properties parentProp;
	public static Properties childProp;
	public static FileInputStream fis;
	public static Properties or;
	public static ExtentReports report;
	public static ExtentTest test;
	public static String path;
	
	public static void init() throws Exception
	{
		
		fis = new FileInputStream(filePath+"\\data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(filePath + "\\env.properties");
		parentProp = new Properties();
		parentProp.load(fis);
		String e= parentProp.getProperty("env");
		
		 fis = new FileInputStream(filePath+"\\"+e+".properties");
		 childProp = new Properties();
		 childProp.load(fis);
		 
		 fis = new FileInputStream(filePath + "\\or.properties");
		 or = new Properties();
		 or.load(fis);
		 
		 fis = new FileInputStream(filePath + "\\log4jConfig.properites");
		PropertyConfigurator.configure(fis);
		 
		 report = ExtentManager.getInstance();
	
		
	}
	
	public static void launch(String browser)
	{
		if(p.getProperty(browser).equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", filePath+"\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("user-data-dir=C:\\Users\\shahe\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		option.addArguments("--disable-notifications");
		driver = new ChromeDriver(option);
		
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", filePath+"\\geckodriver.exe");
			
			ProfilesIni p = new ProfilesIni();
			FirefoxProfile profile = p.getProfile("selProfile");
			profile.setPreference("dom.webnotifications.enabled", false);
			FirefoxOptions option = new FirefoxOptions();
			option.setProfile(profile);
			driver = new FirefoxDriver(option);
			
			
		}
	}
	
	
	public static void navigate(String url)
	{
		driver.get(childProp.getProperty(url));
	}
	
	// Locators
	
	public static void clickElements(String locatorKey) 
	{
		getWebElement(locatorKey).click();
		//driver.findElement(By.xpath(or.getProperty(locatorKey))).click();
	}

	public static void typeText(String locatorKey, String text) 
	{
		getWebElement(locatorKey).sendKeys(or.getProperty(text));
		//driver.findElement(By.id(or.getProperty(locatorKey))).sendKeys(or.getProperty(text));
		
	}

	public static void selectOption(String locatorKey, String option) 
	{
		getWebElement(locatorKey).sendKeys(or.getProperty(option));
	//driver.findElement(By.id(or.getProperty(locatorKey))).sendKeys(or.getProperty(option));
		
	}

	public static WebElement getWebElement(String locatorKey) {
		
		WebElement element = null;
		if(locatorKey.endsWith("_id"))
		{
			element = driver.findElement(By.id(or.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_xpath")) {
			element = driver.findElement(By.xpath(or.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_name")) {
			element = driver.findElement(By.name(or.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_class")) {
			element = driver.findElement(By.className(or.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_css")) {
			element = driver.findElement(By.cssSelector(or.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_linkText")) {
			element = driver.findElement(By.linkText(or.getProperty(locatorKey)));
		}
		else if (locatorKey.endsWith("_partialLinkText")) {
			element = driver.findElement(By.partialLinkText(or.getProperty(locatorKey)));
		}
		
		
		return element;
		
		
	}
	
	static
	{
		Date dt = new Date();
	    path = dt.toString().replace(":", "_").replace(" ", "_");
		System.out.println(path);
	}
	
	
	
}
