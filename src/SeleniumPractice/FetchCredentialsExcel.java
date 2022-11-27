package SeleniumPractice;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ManageWindow;
import Automation.ExcelDataFetch;

public class FetchCredentialsExcel {
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		String emailid= ExcelDataFetch.getData("Sheet1", 0, 3);
		
		String pass= ExcelDataFetch.getData ("Sheet1", 2, 3);
		
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(emailid);
					

		 WebElement password= driver.findElement(By.xpath("//input[@name='pass']"));
		 password.sendKeys(pass);

	}
}