package javaExcercises;

public class Program97_5
{
	public static void main(String[] args)
	{
		//Unchecked exception
		int x=10;
		int y=0;
		try
		{
			int z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
