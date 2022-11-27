package SeleniumPractice;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class TestAnnotations {
	@Test
	@Parameters ({"a","b"})
	
	public void test(int a, int b) {
		
		System.out.println(a-b);
		System.out.println("Test is executed");
		}

	
	@Test
	@Parameters ({"a","b"})
	public void test2(int a, int b) {
		System.out.println(a+b);
		System.out.println("Test2 executed");
		}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method is executed");
		}
}
	
