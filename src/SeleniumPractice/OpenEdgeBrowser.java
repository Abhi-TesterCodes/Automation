package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser 
{
	public static void main(String[] args) 
	{
		
	System.setProperty("webdriver.edge.driver","C:\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");
		  
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();

	driver.navigate().to("https:fb.com/");
	driver.manage().window().minimize();

	/*System.setProperty("webdriver.edge.driver","C:\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");//Setting system properties of EdgeDriver

	WebDriver driver = new EdgeDriver(); //Creating an object of EdgeDriver
	driver.manage().window().maximize();*/
	
	
	}
}


/*driver.manage().deleteAllCookies(); //Deleting all the cookies


//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS); //Specifying pageLoadTimeout and Implicit wait
//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
driver.get("https://www.google.com/"); //launching the specified URL

//driver.findElement(By.name("q")).sendKeys("BrowserStack Guide");//Locating the elements using name locator for the text box

WebElement searchIcon = driver.findElement(By.name("btnK")); 	// locator for Google search button
searchIcon.click();*/