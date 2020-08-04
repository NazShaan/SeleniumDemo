package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScrShot  //extends Base

{
		
			public static void getScrnCapture(WebDriver wbdriver,String fileName) throws IOException
			{
				//String fileName;
				//System.getProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\OneDrive\\Desktop\\SeleniumNote\\chromedriver.exe");
				//WebDriver driver = new ChromeDriver();
				
				File scrFile = ((TakesScreenshot)wbdriver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile, new File("C:\\Users\\shahe\\OneDrive\\Desktop\\ScreenShots\\" + fileName +".png"));
			}
}
