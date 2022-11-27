package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {

	@Test
	public void vctc() 
	{
		WebDriver driver = ManageWindow.openBrowser("https://vctcpune.com/selenium/practice.html#serviceid");
		WebElement hide = driver.findElement(By.xpath("//input[@name='show-hide']"));
		hide.click();
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result= textBox.isDisplayed();
		
		SoftAssert softAssert = new SoftAssert();
		
		softAssert.assertTrue(result); //Soft assert
		
				
		String title = driver.getTitle();
		
		softAssert.assertEquals(title,"Practise Page"); //Soft assert
		
		System.out.println("Thank You");
		
		softAssert.assertAll(); //It prints the asssertion result at the end
		
	}
		
}

