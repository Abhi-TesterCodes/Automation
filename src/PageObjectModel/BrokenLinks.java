package PageObjectModel;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Automation.ManageWindow;

public class BrokenLinks 
{

	public static void main(String[] args) 
	{
		WebDriver driver = ManageWindow.openBrowser("https://www.zlti.com/");
		List<WebElement> ankor = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < ankor.size(); i++)
		{
			WebElement tag =ankor.get(i);
			String url = tag.getAttribute("href");
			
			if (url == null || url.isEmpty())
			{
				System.out.println("Url is not Completely configured");
				continue;
			}
			
			try {
				HttpURLConnection huc = (HttpURLConnection)(new URL(url).openConnection());
				huc.setRequestMethod("HEAD");
				huc.connect();
				int responsecode = huc.getResponseCode();
				System.out.println(responsecode);
				
				if(responsecode>=400) {
					System.out.println("Link is Broken:-" + url );
				}
				
				else
				{
					System.out.println("Link is valid:- "+ url);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			}
		}
}
