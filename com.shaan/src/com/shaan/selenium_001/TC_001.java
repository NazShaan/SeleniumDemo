package com.shaan.selenium_001;

public class TC_001  extends BaseTest
{

	public static void main(String[] args) throws Exception {
		
		init();
		launch("chromeBrowser");
		navigate("amazonUrl");
		

	}

}
