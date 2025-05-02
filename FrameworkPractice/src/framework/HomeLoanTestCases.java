package framework;

import org.testng.annotations.Test;

public class HomeLoanTestCases {
	
	@Test
	public void homeLoan() {
		System.out.println("This is Home Loan");
	}
	
	@Test(enabled = false)
	public void apiHomeLoan() {
		System.out.println("API Home Loan");
	}
	
	@Test(dependsOnMethods = {"homeLoan"})
	public void appiumHomeLoan() {
		System.out.println("Appium Home Loan");
	}
	
	@Test
	public void apiLoan() {
		System.out.println("API Loan");
	}

}
