package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorsXpath {
public static void main(String[] args) {
		
	WebDriver driver = ManageWindow.openBrowser("\"https://vctcpune.com/\"");
		
//	WebElement email= driver.findElement(By.xpath("//input(@id='email']")); //By attribute
//	email.sendKeys ("Abhi");
//	
	WebElement forgot= driver.findElement(By.xpath("//a[text()='Forgotten password? ']")); //By Text
	forgot.click();
	
	//WebElement SignUp= driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")); //By contains
	//SignUp.click();
	
	}
}
