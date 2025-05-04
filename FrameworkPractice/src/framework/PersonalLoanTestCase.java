package framework;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PersonalLoanTestCase {
//	@Parameters({"URL"})
	@Test(dataProvider = "getData")
	public void personalLoan(/*String url,*/ String Username, String Password) {
		System.out.println("hello");
//		System.out.println(url);
		System.out.println(Username);
		System.out.println(Password);
	}
	
	@DataProvider
	public Object[][] getData() {
		// combinations of data
		// 1st valid Username and password
		// 2nd invalid username and password 
		// 3rd No username and password	
		
		Object[][] data = new Object[3][2]; // 3 Scenarios with 2 values each i.e username and password
		data[0][0] = "firstname";
		data[0][1] = "password";
		
		data[1][0] = "invaliddata";
		data[1][1] = "invaliddatapassword";
		
		data[2][0] = " ";
		data[2][1] = " ";
		
		return data;
	}
}
