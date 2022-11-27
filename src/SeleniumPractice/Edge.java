package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
	public static WebDriver Edgebrowser(String url) {
		System.setProperty("webdriver.edge.driver","C:\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("www.instagram.com");
		return driver;
		
	}

}
