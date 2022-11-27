package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsWElement {

public static void main(String[] args) {
	WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		
	//WebElement email= driver.findElement(By.id("email")); //Locating element by id
	//email.sendKeys("Abhi");
	
//	WebElement password= driver.findElement(By.id("password")); //Locating element by id
//	password.sendKeys("Mypass123");
//	
//	WebElement LogIn= driver.findElement(By.tagName("button")); //Locating element by id
//	LogIn.click();
//	
//	WebElement SignUp= driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")); //Locating element by id
//	SignUp.click();
//	
WebElement CreatePage = driver.findElement(By.partialLinkText("Create a"));
CreatePage.click();
//		
	}
}
