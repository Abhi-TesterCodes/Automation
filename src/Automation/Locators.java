package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		
	WebDriver driver = ManageWindow.openBrowser (null);
	
	WebElement email= driver.findElement(By.id("email")); //Locating element by Id
	email.sendKeys("abhi");
	
	WebElement password = driver.findElement(By.name("pass")); //Locating element by name
	password.sendKeys("mypass@22");
	
	WebElement LogIn = driver.findElement(By.tagName("button")); //By tag name 
	LogIn.click();
	}
	
}
	

