package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScrollButton {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =ManageWindow.openBrowser("https://demoqa.com/text-box");
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"submit\"]"));

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true), Submit"); // not running
		
		Thread.sleep(2000);
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(100,200)");

	}
}