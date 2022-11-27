package Automation;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;

public class SetPosition {

public static void main(String[] args) {

	WebDriver driver = ManageWindow.openBrowser ("https://www.facebook.com/");
		
	Point P = new Point (300,400);
	
	driver.manage().window().setPosition(P);
		

	}

}
