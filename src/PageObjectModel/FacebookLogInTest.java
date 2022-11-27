package PageObjectModel;

import org.openqa.selenium.WebDriver;

import Automation.ManageWindow;

public class FacebookLogInTest {


	public void LoginwithValidcredentialstest() {
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		
		facebookLoginPage.enterEmailId("abhi@gmail.com");
		facebookLoginPage.enterPassword("mypass145");
		facebookLoginPage.clicklogIn();
	}
		
	public void LoginwithInvalidcredentialstest () {
		WebDriver driver = ManageWindow.openBrowser("https://www.facebook.com/");
		
		FacebookLoginPage facebookLoginPage = new FacebookLoginPage(driver);
		facebookLoginPage.enterEmailId("abhi@gmail.com");
		facebookLoginPage.clicklogIn();
		
	}
	
	public static void main(String[] args) {
		FacebookLogInTest test = new FacebookLogInTest();
		test.LoginwithValidcredentialstest();
		test.LoginwithInvalidcredentialstest();
		
		
	}
}
