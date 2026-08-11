package javaExcercises;

public class Program97_6
{
	public static void main(String[] args)
	{
		int x=10;
		int y=5;
		try
		{
			int z=x/y;
			System.out.println(z);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		finally //Executes code regardless of exception occurrence
		{
			System.out.println("Done");
		}
	}
}
