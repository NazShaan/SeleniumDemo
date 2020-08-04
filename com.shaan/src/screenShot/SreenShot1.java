package screenShot;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SreenShot1 
{

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.getProperty("webdriver.chrome.driver", "C:\\Users\\shahe\\OneDrive\\Desktop\\SeleniumNote\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for(int i = 0; i<links.size(); i++)
		{
			if (!links.get(i).getText().isEmpty())
			{
				String fileName = links.get(i).getText();
				links.get(i).click();
				System.out.println(fileName);
				File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileHandler.copy(scrFile, new File("C:\\Users\\shahe\\OneDrive\\Desktop\\Screenshots\\" +fileName +".png"));
				
				driver.navigate().back();
				links = driver.findElements(By.tagName("a"));
				Thread.sleep(4000);
			}
		}
			
				
			
			
			
	}

}
