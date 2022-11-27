package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class ZerodhaLoginPageRepositary {
	
	@FindBy (xpath="//input[@id='userid']")private WebElement UserID;
	@FindBy (xpath="//input[@id='password']") private WebElement Password;
	@FindBy (xpath="//button[@class='button-orange wide']") private WebElement LogIn;
	@FindBy (xpath="//input[@id='pin']") private WebElement pin;
	@FindBy (xpath="//button[@type='submit']") private WebElement submitPin;
	
	@FindBy (xpath="//a[text()= 'Forgot user ID or password?']")private WebElement Forgotidpass;
	@FindBy (xpath="//label[text()='I forgot my user ID']")private WebElement Radioforgotid;
	@FindBy (xpath="//a [text()=\"Don't have an account? Signup now!\"]") private WebElement SignUp;
	@FindBy (xpath="//input[@id='user_mobile']") private WebElement Entermobileno;
	
	public ZerodhaLoginPageRepositary(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	
	@Test 
	public void enteruserid(String userid) throws InterruptedException {
		UserID.sendKeys("OKP335");
		Thread.sleep(2000);
	}
	
	@Test 
	public void enterPassword (String password) throws InterruptedException {
		Password.sendKeys("ZAQ1234567");
		Thread.sleep(2000);
	}
	
	@Test 
	public void clickonsubmit () throws InterruptedException {
		LogIn.click();
		Thread.sleep(2000);
	}
	
	@Test
	public void enterPin (String pinNumber) {
				
		pin.sendKeys("234567");
	}
	@Test
	public void clickOnContinue () 
	{
		submitPin.click();
	}
	
	
	
	
	
	
		
	@Test	
	public void clickonforgotbutton () 
	{
		Forgotidpass.click();
	}
	
	public void clickonradioforgotid ()
	{
		Radioforgotid.click();
	}
	
	public void clickonSignUp()
	{
		SignUp.click();
	}

	public void enterMobileNumber()
	{
	Entermobileno.sendKeys();
	
		
	}

	
		
	}
	

	
