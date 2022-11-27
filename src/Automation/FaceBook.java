package Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FaceBook {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
	

	
	String emailid= ExcelDataFetch.getData("Sheet2", 2, 1);
	
	String pass= ExcelDataFetch.getData ("Sheet2", 3, 1);
	
		WebElement email= driver.findElement(By.xpath("//input[@name='email']"));
				email.sendKeys(emailid);
				

	 WebElement password= driver.findElement(By.xpath("//input[@name='pass']"));
	 			password.sendKeys(pass);

}


}


