package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
	WebDriver driver =	ManageWindow.openBrowser("https://demoqa.com/text-box");
	WebElement FullName =driver.findElement(By.xpath("//input[@id='userName']"));
	FullName.sendKeys("Abhi121");
		
	Actions action = new Actions (driver);
	action.sendKeys(Keys.TAB);
	
	action.sendKeys("abhi@yahoo.com");
	
	action.sendKeys(Keys.TAB);
	
	action.sendKeys("myaddress");
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("a");
	action.sendKeys(Keys.CONTROL);
	
	action.keyDown(Keys.CONTROL);
	action.sendKeys("c");
	action.keyUp(Keys.CONTROL);
	
	action.sendKeys(Keys.TAB);
	action.keyDown(Keys.CONTROL);
	action.sendKeys("v");
	action.sendKeys(Keys.CONTROL);
	action.build().perform();
	
	WebElement Submit = driver.findElement(By.xpath("//button[@id='submit']"));
	Submit.sendKeys(Keys.ENTER);
	action.build().perform();
		
		
	}
}
