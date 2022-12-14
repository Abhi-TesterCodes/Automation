package Automation;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {

	public static void takeScreenShot(WebDriver driver, String name) throws IOException {
		String date = ScreenShot.getDate();
		
		TakesScreenshot Screen = ((TakesScreenshot)driver); //Upcast driver to Takescreenshot
		
		File source = Screen.getScreenshotAs(OutputType.FILE);
		
		File destination = new File ("C:\\Selenium Drivers\\Selenium Screenshots\\"+name+""+date+".jpg");
		
		FileHandler.copy(source, destination);
		
	}
	
public static String getDate() {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-ss"); //Format the date and time as required
		
		LocalDateTime currentTime = LocalDateTime.now(); //return current time
		
		String d = dtf.format(currentTime); //format the time given my now() method to required format and return String
		return d;

}}
