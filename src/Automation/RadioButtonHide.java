package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonHide {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = ManageWindow.openBrowser ("https://vctcpune.com/selenium/practice.html");
		
		WebElement text = driver.findElement(By.xpath ("//input[@name='show-hide']"));
		
		text.sendKeys("Velocity");
		boolean Status = text.isDisplayed();
		System.out.println(Status);
		
		Thread.sleep(2000);
		
		WebElement Hide = driver.findElement(By.xpath("//*[@id='hide-textbox']"));
		Hide.click();
		
		boolean newstatus = text.isDisplayed();
		System.out.println(newstatus);
	}
}
