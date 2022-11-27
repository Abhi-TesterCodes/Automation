package SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver","C:\\Selenium Drivers\\edgedriver_win64\\msedgedriver.exe");
		
		WebDriver driver= new EdgeDriver();
		
		driver.get("www.facebook.com");
		
		
		
		
	}
	
	
	
	

}
