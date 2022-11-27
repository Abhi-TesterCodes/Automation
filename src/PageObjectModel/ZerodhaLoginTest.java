package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Automation.ManageWindow;

public class ZerodhaLoginTest 
{
	@Test
	public void LoginwithValidcredentialstest() throws InterruptedException 
	{
		WebDriver driver = ManageWindow.openBrowser("https://kite.zerodha.com/");
		
		ZerodhaLoginPageRepositary zerodha = new ZerodhaLoginPageRepositary(driver);
		
		zerodha.enteruserid("APM125GH");
		zerodha.enterPassword("Ibpass22");
		//zerodha.clickonsubmit();
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
	
	
	public void Clickonforgot () throws InterruptedException 
	{
		WebDriver driver = ManageWindow.openBrowser("https://kite.zerodha.com/");
		Thread.sleep(2000);
		ZerodhaLoginPageRepositary zerodha = new ZerodhaLoginPageRepositary(driver);
		
		zerodha.enteruserid("OKP335");
		zerodha.enterPassword("ZAQ1234567");
		zerodha.clickonsubmit();
		zerodha.enterPin("234567");
		zerodha.clickOnContinue();
		
		
		//zerodha.clickonSignUp();
		//zerodha.enterMobileNumber();
		
		//zerodha.clickonforgotbutton();
		//zerodha.clickonradioforgotid();
		
		
		
	}
	
	
	
	
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		ZerodhaLoginTest test = new ZerodhaLoginTest();
		//test.LoginwithValidcredentialstest();
		//test.LoginwithInvalidcredentialstest();
		test.Clickonforgot();
		
		
		
		
		
	}
}


