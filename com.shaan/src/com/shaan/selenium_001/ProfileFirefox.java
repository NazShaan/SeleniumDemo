package com.shaan.selenium_001;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ProfileFirefox {

	public static void main(String[] args) {
		
		String fPath   = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", fPath+"//geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://amazon.com");
		System.out.println(fPath);

	}

}
