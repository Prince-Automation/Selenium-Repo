package framework;

public class PS3 {
	
	int a; /*class variable */

	public PS3(int a) //instance variable
	{
		this.a = a;
	}
	
	public int multiply()
	{
		a = a*2;
		return a;
	}
	
	public int divide()
	{
		a = a/2;
		return a;
	}
}
