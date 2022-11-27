package Automation;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BrowserSize {

	public static void main(String[] args) {
		WebDriver driver = ManageWindow.openBrowser ("https://www.facebook.com/");
		
		Dimension d = new Dimension (200,400);
		driver.manage().window().setSize(d);
		

	}

}
