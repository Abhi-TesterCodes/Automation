package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonStatus {

public static void main(String[] args) {
	WebDriver driver = ManageWindow.openBrowser ("https://demo.guru99.com/test/radio.html");
	
	WebElement radio = driver.findElement(By.xpath (" //*[@id='vfb-7-2']"));
	
	boolean status = radio.isSelected();
	System.out.println(status);
	
	radio.click();
	boolean newstatus = radio.isSelected();
	System.out.println(newstatus);
	}

}
