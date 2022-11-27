package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Automation.ManageWindow;

public class IBLogin {
	
		@Test
		public void LoginwithValidcredentialstest() throws InterruptedException 
		{
			WebDriver driver = ManageWindow.openBrowser("https://kite.zerodha.com/");
			
			ZerodhaLoginPageRepositary zerodha = new ZerodhaLoginPageRepositary(driver);
			
			zerodha.enteruserid("APM125GH");
			zerodha.enterPassword("Ibpass22");
			zerodha.clickonsubmit();
			Thread.sleep(2000);
		}
		
		@Test
		public void LoginwithInvalidcredentialstest () throws InterruptedException 
		{
			WebDriver driver = ManageWindow.openBrowser("https://kite.zerodha.com/");
			ZerodhaLoginPageRepositary zerodha = new ZerodhaLoginPageRepositary(driver);
			
		    zerodha.enteruserid("APM125GH");
		    zerodha.clickonsubmit();
		    Thread.sleep(2000);
		}
		
		
		public static void main(String[] args) throws InterruptedException 
		{
			ZerodhaLoginTest test = new ZerodhaLoginTest();
			test.LoginwithValidcredentialstest();
			test.LoginwithInvalidcredentialstest();
			
			
		}
	}



