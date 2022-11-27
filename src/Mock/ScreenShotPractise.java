package Mock;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShotPractise 
{
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver = Open.Browser();
		
		
		File Source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination = new File ("C:\\Selenium Drivers\\Selenium Screenshots\\+name.png");
		
		FileHandler.copy(Source, Destination);
		
	
	}
}
