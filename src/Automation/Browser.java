package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Browser {

public static void main (String [] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver(); //Up casting of Chrome driver to web driver
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	
	
		
	}

public static WebDriver openBrowser() {
	// TODO Auto-generated method stub
	return null;
}


}


