package Automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragandDropImages {


public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver= ManageWindow.openBrowser("https://www.globalsqa.com/demo-site/draganddrop/");
	
	WebElement iframe= driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
	driver.switchTo().frame(iframe);
	
	
	List<WebElement> source= driver.findElements(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));
	int s= source.size(); //to get the size of list
	System.out.println(s);
	
	WebElement Destination = driver.findElement(By.xpath("//div [@class='ui-widget-content ui-state-default ui-droppable']"));
	Actions action = new Actions(driver);
	
	for(int i=0 ; i < s;i++)
	{
		WebElement image= source.get(i);
		action.dragAndDrop(image, Destination);
		action.perform();
		Thread.sleep(2000);
	
	}

	List<WebElement> trash = driver.findElements(By.xpath("//a[@title='Recycle this image']"));
	int t =trash.size();

	for (int j=0; t>j ; j--)
	{
	WebElement recycle= driver.findElement(By.xpath("//a[@title='Recycle this image']"));
	recycle.click();
	action.perform();
	Thread.sleep(2000);
	}

	}
}

