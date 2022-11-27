package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AbsoluteXpath {
public static void main(String[] args) {
	WebDriver driver = ManageWindow.openBrowser (null);
	WebElement email = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input"));
	email.sendKeys("abhi");
	 
	//WebElement SignUp = driver.findElement(By.cssSelector("a(data-testid='open-registration-form-button']"));
	//SignUp.click();
	 
	}
}
