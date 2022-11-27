package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ManageWindow;

public class Guru99 {
	public static void main(String[] args) {
		
	WebDriver driver= ManageWindow.openBrowser("http://www.demo.guru99.com/V4/");
	
	WebElement username= driver.findElement(By.xpath("//input[@type='text']"));
	username.sendKeys("UserId");
	
	WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
	Password.sendKeys("Password");
	
	
	}
	
	
}
