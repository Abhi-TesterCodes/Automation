package Automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAnnotationOrder {
	@Test
	public void test1() {
	 System.out.println("Test 1 executed");
	}
	@Test
	public void test2() {
		System.out.println("Test 1 executed");
	}
//	@Test
//	public void test() {
//		System.out.println("\"Test executed\""); // Works alphabetically
		
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class executed");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("After class executed");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before method executed");
	}
	@AfterMethod
	public void aftermethod() {
		System.out.println("After method is executed");
	}
	@BeforeTest
	public void beforetest() {
		System.out.println("Before test is executed");
	}
	@AfterTest
	public void aftertest() {
		System.out.println("After test is executed");
	}
}