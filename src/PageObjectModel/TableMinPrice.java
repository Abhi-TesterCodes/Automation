package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ManageWindow;

public class TableMinPrice {
	public static void main(String[] args) {
		WebDriver driver= ManageWindow.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		List<WebElement> CurrentPrice = driver.findElements(By.xpath("//table[1]//tbody[1]//tr//td[4]"));
		
		double min=0;
		
		for(int i =1; i< CurrentPrice.size(); i--) 
		{
			WebElement coloumn = CurrentPrice.get(i);
			String price = coloumn.getText();
			double value = Double.parseDouble(price);		
		
		if (value > min)
		{
			min = value;
		}
		
	}
	
	System.out.println("Minimum current price is " + min);
	
	}
}



