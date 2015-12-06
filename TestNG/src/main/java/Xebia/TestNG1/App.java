package Xebia.TestNG1;

import org.testng.annotations.Test;
import org.testng.annotations.Test;



public class App 
{
	
	private String name ="abc";

	@Test
	public void abcd() throws NoSuchFieldException, SecurityException
	{
		App a= new App();
		a.getClass().getDeclaredField(name);
		System.out.println("Hiii");
	}
}
