package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Frame {

	public static void main(String[] args) {
	

	WebDriver driver = ManageWindow.openBrowser("https://vctcpune.com/selenium/practice.html");
		
		
	driver.switchTo().frame(0);	//Switch to frame by Index
	
	//driver.switchTo().frame("iframe-name"); //Switch to frame by ID or name by attribute value
	
	//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@name='iframe-name']"))); //Switch to frame by WebElement
	

	
	WebElement Course=driver.findElement(By.xpath("(//a[text()='Courses'])[1]"));
	
	Course.click();
	
	
	//driver.switchTo().defaultContent();
	
	driver.switchTo().parentFrame();
	
	WebElement alert = driver.findElement(By.xpath("//input[@id='alertbtn']"));
	alert.click();
		
	}
}