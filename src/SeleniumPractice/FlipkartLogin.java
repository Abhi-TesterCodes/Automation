package SeleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Automation.ManageWindow;

public class FlipkartLogin {
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=ManageWindow.openBrowser("https://www.flipkart.com/");

	Actions action= new Actions(driver);
	WebElement Loginpopup = driver.findElement(By.xpath("//a [text()='Login']"));
	Loginpopup.click();
	

	WebElement inputfield= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
	inputfield.sendKeys("flipkartemail");
	
	Thread.sleep(2000);
	
	action.sendKeys(Keys.TAB);
	
	WebElement password = driver.findElement(By.xpath("//input [@type='password']"));
	password.sendKeys("fkpass");
	
	action.sendKeys(Keys.TAB);
	
	WebElement submit = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
	submit.sendKeys(Keys.ENTER);
	action.build().perform();
	
		
	}
}
