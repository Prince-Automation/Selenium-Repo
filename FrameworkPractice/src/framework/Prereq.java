package framework;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Prereq {

	@BeforeTest
	public void preRequisite() {
		System.out.println("Execute this first");
	}
	
	@AfterTest
	public void postRequisite() {
		System.out.println("Execute this Last");
	}
	
	public void doThis() {
		System.out.println("This is the one");
	}

}
