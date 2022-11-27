package Automation;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMouseAction {

public static void main(String[] args) {
	
	WebDriver driver= ManageWindow.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
	
	WebElement dclick = driver.findElement(By.xpath("(//button[text()='Double-Click Me To See Alert'])"));
	
	Actions Actiondclick= new Actions(driver);
	
	Actiondclick.doubleClick(dclick);
	Actiondclick.perform();
	
	
	}

}
