package screenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base 
{
	public static WebDriver driver;
		public static void launch()
		{
			System.getProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\OneDrive\\Desktop\\SeleniumNote\\chromedriver.exe");
			  driver = new ChromeDriver();
			
		}
}
