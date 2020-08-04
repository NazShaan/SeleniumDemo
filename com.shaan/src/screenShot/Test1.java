package screenShot;

import java.io.IOException;

public class Test1 extends Base
{
	//public static WebDriver driver;
	
	
	 public static void main(String[] args) throws IOException
	 {
		launch();
		
		// System.getProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\OneDrive\\Desktop\\SeleniumNote\\chromedriver.exe");
		// driver = new ChromeDriver();
	//	System.getProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\OneDrive\\Desktop\\SeleniumNote\\chromedriver.exe");
	//	 driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		driver.get("https://google.com");
		ScrShot.getScrnCapture(driver,"shaan");

	}

}
