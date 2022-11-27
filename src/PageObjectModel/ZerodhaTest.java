package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ManageWindow;

public class ZerodhaTest 
{
	
		public void LoginWithValidCredentialsTest() 
	{
			WebDriver driver = ManageWindow.openBrowser("https://kite.zerodha.com/");
			WebElement UserID = driver.findElement(By.xpath("//input[@id='userid']"));
			UserID.sendKeys("APM125GH");
			WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
			Password.sendKeys("Ibpass22");
			WebElement Login = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
			Login.click();
			
	}
		public void LoginWithInValidCredentialsTest() 
	{
			WebDriver driver= ManageWindow.openBrowser("https://kite.zerodha.com/");
			WebElement UserID= driver.findElement(By.xpath("//input[@id='userid']"));
			UserID.sendKeys("APM125GH");
			WebElement Login = driver.findElement(By.xpath("//button[@class='button-orange wide']"));
			Login.click();
			
	}
		
		
		public static void main(String[] args) {
	
	}
}
