package Automation;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ChildBrowser {

	public static void main(String[] args) {
		
	WebDriver driver = ManageWindow.openBrowser("https://vctcpune.com/");
		
		//String handle = driver.getWindowHandle(); //Main page address
		//System.out.println(handle);
		
	WebElement practise = driver.findElement(By.xpath("//*[@id=\"top-menu\"]/li[4]/a[2]"));
	practise.click();
	
	//practise.click();
	//practise.click();
	
	Set<String> handles = driver.getWindowHandles(); //address of child browser //getWindowHandles will return Set of String,then we use iterator method of set while will return iterator
	Iterator<String> i = handles.iterator();//4 times //interface,then with the help of methods of Iterator Interface we can get the value
	//System.out.println(i.next());
	//System.out.println(i.next());
	
	while (i.hasNext())//True
	{
		String handle = i.next();
		driver.switchTo().window(handle); //Switching focus of Selenium to required handle
		String currentTitle = driver.getTitle();
		
		if (currentTitle.equals("Practice Page"))
		{
			WebElement radio = driver.findElement(By.xpath("//input [@value='Radio2']"));
			radio.click();
		}
		
	}
	}
}
  