package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TitlePage {

public static void main(String[] args) {
		
	WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		
	WebElement heading = driver.findElement (By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/h2"));
	
	String Text = heading.getText();
	System.out.println(Text);
	}
}
