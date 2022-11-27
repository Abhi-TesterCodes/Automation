package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class RightClickMouseAction {

	public static void main(String[] args) {
		WebDriver driver = ManageWindow.openBrowser("https://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement Rightclick= driver.findElement(By.xpath("//span [text() = 'right click me']"));
		
		Actions Action= new Actions(driver);
		
		Action.contextClick(Rightclick);
		Action.perform();
		
		//Homework on right click
		
		WebElement alert= driver.findElement(By.xpath("(//span[text()='Copy'])"));
		alert.click();
		
	}

}
