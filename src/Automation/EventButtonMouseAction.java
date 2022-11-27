package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class EventButtonMouseAction {

	public static void main(String[] args) {
		WebDriver driver = ManageWindow.openBrowser("https://www.amazon.in/");
		
		WebElement SignIn= driver.findElement(By.xpath("//a [@id='nav-link-accountList']"));
		
		Actions action= new Actions(driver);
		action.moveToElement(SignIn);
		action.perform();
		
		WebElement orders= driver.findElement(By.xpath("//span[text()='Your Orders']"));
		orders.click();
		
	}

}
