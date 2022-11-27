package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Assertion {

	
	@Test
	public void vctc() 
	{
		WebDriver driver = ManageWindow.openBrowser("https://vctcpune.com/selenium/practice.html#serviceid");
		WebElement hide = driver.findElement(By.xpath("//input[@name='show-hide']"));
		hide.click();
		
		WebElement textBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		boolean result= textBox.isDisplayed();
		
		Assert.assertFalse(result);
		
		String title = driver.getTitle();
		
		Assert.assertEquals(title, "Practise Page"); //Hard assertion
		
		System.out.println("Thank You");
		
	}
		
}
