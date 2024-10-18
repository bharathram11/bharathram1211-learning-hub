package javabasics;

public class Example36
{
	public static void main(String[] args)
	{
		display(12, (float)10.9); //one integer, one float and no value to String argument
		String a="abdul kalam";
		display(12, (float)10.4, a); //one integer, one float and one value to "String" argument
		String b="My guru";
		display(12, (float)10.6, a, b); //one integer, one float and two values to "String" argument
		// and so on...
	}
	public static void display(int x, float y, String... s)
	{
		System.out.print(x+" "+y); //Display output in current line in console
		for(int i=0;i<s.length; i++)
		{
			System.out.printf(" %s-->",s[i]); //Display output in current line as per given format
		}
		System.out.println(); //Take next line in console for next output
	}
}




