package Automation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class mock {

	
	public static void main(String[] args) throws IOException {
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		//ScreenShot.takeScreenShot(driver, "sample");
		
		WebElement Create12 = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		Create12.click();
		
	}
}
