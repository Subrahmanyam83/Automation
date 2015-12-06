package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;

public class Utilities {
	
	public void GetInputFromUser()
	{
		
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter your name");
			String name = null;
			try {
				name = br.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Your Name is " + name );
			
	}
	
		
	public String randomString() {

		  String u = RandomStringUtils.randomAlphanumeric(10);
		  String v = "Auto-Food "+u;
	      return v;
		}
	
	
	public String randomNumber()
	{
		   Random randomGenerator = new Random();
		   int randomInt = randomGenerator.nextInt(100);
		   String aString = Integer.toString(randomInt);
		   return aString;
		   
	}
	
	
	
	
	public String randomLongStrings()
	{
		StringBuilder builder = new StringBuilder();
	
		for (int i=0; i<=299; i++)
		{
			int rnd = (int) (Math.random() * 52); // or use Random or whatever
			char base = (rnd < 26) ? 'A' : 'a';
			char x= (char) (base + rnd % 26);
			builder.append(x);
		}
		return(builder.toString());

	}
	
	
	
	
	public void generate10Digit()
	{
		
		int maxdigits = 9; // Change to needed # of digits
		StringBuilder result = new StringBuilder();
		Random r = new Random(); // Seed with what you feel is appropriate
		for (int i = 0; i<maxdigits; i++)
		{
		   result.append(r.nextInt(10)); // Append a number from 0 to 9
		}

		String key = result.toString();
		System.out.println(key);
		
		
	}

	
	

		public void attach() {
		   try {

		      String[] commands = new String[]{};
		      commands = new String[]{"c:\\test\\attachFile.exe"}; 
		      Runtime.getRuntime().exec(commands);
		      } catch (IOException e) {}
		   /*   selenium.click("name=browseButton");*/
		 

		   }

		//******************** Convert String to Float *********************
		
		public float toFloat(String s)
		{
			float s1= Float.parseFloat(s);
			return s1; 
		}
	

}
