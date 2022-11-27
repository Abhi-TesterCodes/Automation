package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class FacebookLoginPage 
{
	
	
	@FindBy (xpath="//input[@id='email']")private WebElement email;
	@FindBy (xpath="//input[@id='pass']")private WebElement password;
	@FindBy (xpath="//button[@name='login']")private WebElement logIn;
	@FindBy (xpath="//a[text()='Forgotten password?']")private WebElement Forgotpass;
	@FindBy (xpath="//*[@id=\"u_0_0_b6\"]")private WebElement SignUp;
	@FindBy (xpath= "//a[@data-testid='open-registration-form-button']")private WebElement CreatePage;


	

	public FacebookLoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this); 
	//We use initelements of Page factory class which used the web driver references in its argument and
	// then with the help of @findby annotation it will find all web elements declared in the class
	
	}
	
	public void enterEmailId (String mail) {
		email.sendKeys(mail);
	}
	
	public void enterPassword (String pass) {
		password.sendKeys(pass);
	}
	
	public void clicklogIn () {
		logIn.click();
	}
	
	public void clickonForgot () {
		Forgotpass.click();
	}
		
	public void clickonSignUp () {
		SignUp.click();
	}
	
	
	public void clickonCreatePages() {
		CreatePage.click();
		
	}
	
}