package Mock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launchchrome {
	public static void main(String[] args) {
	
		WebDriverManager.chromdriver().setup();
			
		WebDriver driver=new ChromeDriver(); 
		
	}

}
