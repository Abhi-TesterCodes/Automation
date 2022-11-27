package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Fbvalidinvalidcred {

	
	public void loginwithvalidcredentials() {
		
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		WebElement email= driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys ("velocity");
		
		WebElement pass = driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("mypass145");
		
		WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
        logIn.click();
	}
	
	public void loginwithinvalidcredentials () {
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys ("abhijee@gmail.com");
	
		WebElement logIn = driver.findElement(By.xpath("//button[@name='login']"));
        logIn.click();
	}
	public static void main(String[] args) {
		
	}

}
	

	

