package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ManageWindow;

public class AutomationTest {
public void LoginwithValidcredentialstest() {
		
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys ("abhi@gmail.com");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("mypass145");
		
		WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
        logIn.click(); 
	}
	
	public void LoginwithInvalidcredentialstest () {
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys ("abhi@gmail.com");
	
		WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
        logIn.click();
	}
	public static void main(String[] args) {
		
	}

}
	

