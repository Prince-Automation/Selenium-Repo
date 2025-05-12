package framework;

import org.testng.annotations.Test;

public class NewTestCase extends Prereq {

	@Test
	public void TestRun() {
		
		PS2 ps2 = new PS2(3); //Parameterized constructor created and value passed to the class directly
		int a = 3;
		doThis();
		System.out.println(ps2.increment());
		System.out.println(ps2.decrement());
		System.out.println(ps2.multiply());
		System.out.println(ps2.divide());
	}

}
