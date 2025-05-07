package framework;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestRunning {

	@AfterTest
	public void postRequisite() {
		System.out.println("Execute this last");
	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before Suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Execute this last Suite");
	}
	
	@Test(groups = {"Smoke"})
	public void Demo() {
		System.out.println("hello");
	}
	
	@Test
	public void Demo2() {
		System.out.println("Test Case 2");
		Assert.assertTrue(false);
	}
	
	@BeforeTest
	public void preRequisite() {
		System.out.println("Execute this first");
	}

}
