package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageTitle {

public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver","C:\\Selenium Drivers\\chromedriver_win32\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
		
	driver.navigate().to("https://www.facebook.com/");
		
	String title = driver.getTitle(); //To get the title of webpage
		
	System.out.println(title);
		
	String url = driver.getCurrentUrl(); //to get the current url of the webpage
	System.out.println(url);
		
	//driver.manage().window().maximize();
		
	Options op = driver.manage(); //returns options interface
		
	Window w = op.window(); //window method of options interface returns Window Interface
		
	w.maximize(); //Maximize is the method of window Interface to Maximize Window
	
	Thread.sleep(5000);
	
	w.minimize(); //Minimize is the method of window Interface to Minimize Window
	
	
// <anage is method of web driver which returns Options interface, then we call the method window() 
//of options interface which returns Window interface, them we use the method maximize/ Minimize interface
	
	}
}
