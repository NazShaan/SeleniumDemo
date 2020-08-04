package com.shaan.selenium_001;

public class TC_002 extends BaseTest
{

	public static void main(String[] args) throws Exception {
		
		init();
		launch("firefoxBrowser");
		navigate("bestbuyUrl");
	}

}
