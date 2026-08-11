package javaExcercises;

public class Program35
{
	public static void main(String[] args)
	{
		//Only for "String" class
		String x1="abdul kalam"; //as variable
		String x2=new String("abdul kalam"); //as object
		//1. values comparison
		if(x1.equals(x2)) //here "equals()" method is belongs to "String" class
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
		//2. objects comparison(objects details comparison)
		if(x1==x2) //"==" in between objects and "equals()" in "Object" class both are same
		{
			System.out.println("same");
		}
		else
		{
			System.out.println("not same");
		}
	}
}
//The == operator checks for reference equality, meaning it compares whether s1 and s2 point to the same memory location.
//The .equals() method checks for content equality, meaning it compares the actual characters in the strings.