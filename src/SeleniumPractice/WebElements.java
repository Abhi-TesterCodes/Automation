package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.Browser;

public class WebElements {
	
	public static void main(String[] args) {

	WebDriver driver = Browser.openBrowser();
	
	WebElement email = driver.findElement(By.id("email")); //Locating element by id
	email.sendKeys("Abhi");
	

	
}
}
