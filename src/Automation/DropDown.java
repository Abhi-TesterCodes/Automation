package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	
		WebDriver driver = ManageWindow.openBrowser("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
		
		WebElement Products= driver.findElement(By.xpath("//select[@id='first']"));
		Select select = new Select (Products);
		
		//select.selectByIndex(2);
		//select.selectByIndex(0);
		//select.selectByVisibleText("Yahoo");
		select.selectByValue("Google");
	}

}
