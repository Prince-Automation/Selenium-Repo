package framework;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CarLoanTestCases {
	
	@Parameters({"URL","Key"})
	@Test
	public void carLoan(String url, String Key) {
		System.out.println("This is CarLoan");
		System.out.println(url);
		System.out.println(Key);
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("This is Before Class method");
	}
	
	
	@AfterClass
	public void afterClassCarLoan() {
		System.out.println("This is after Class method");
	}
	
	@Test(groups = {"Smoke"}) 
	public void apiCarLoan() {
		System.out.println("API Car Loan");
	}
	
	@Test
	public void appiumCarLoan() {
		System.out.println("Appium Car Loan");
	}
	
	@Test
	public void appiumCarLoanLogin() {
		System.out.println("Appium Car Loan Login");
	}
	
	@Test
	public void appiumCarLoanSignup() {
		System.out.println("Appium Car Loan Signup");
	}
	
	@Test
	public void appiumCarLoanNavigate() {
		System.out.println("Appium Car Loan Navigate");
	}
	
	@Test
	public void appiumCarLoanSignout() {
		System.out.println("Appium Car Loan Signout");
	}
	
	@Test
	public void appiumCarLoanPurchase() {
		System.out.println("Appium Car Loan Purchase");
	}
	
	@Test
	public void appiumCarLoanCheckout() {
		System.out.println("Appium Car Loan Checkout");
	}
	
	@Test
	public void appiumCarLoanCheckin() {
		System.out.println("Appium Car Loan Checkin");
	}

}
