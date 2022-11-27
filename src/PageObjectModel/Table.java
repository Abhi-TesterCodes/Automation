package PageObjectModel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ManageWindow;

public class Table {
	
	public static void main(String[] args) {
		WebDriver driver= ManageWindow.openBrowser("https://demo.guru99.com/test/web-table-element.php");
		//WebElement FirstName= driver.findElement(By.xpath("(//table//tbody//tr//td[1])[2]"));
		//System.out.println(FirstName.getText());
		
		/*WebElement CurrentPriceFirst= driver.findElement(By.xpath("(//table//tbody//tr//td[4])[2]"));
		System.out.println(CurrentPriceFirst.getText());*/
		
		List<WebElement> headings = driver.findElements(By.xpath("//table//thead//th"));
			
		for(int i =0; i< headings.size(); i++) 
		{
			WebElement head = headings.get(i);
			System.out.println(head.getText());
			
			
		}
		
	
	}

}
