package javaExcercises;

public class Program16
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) //rows
		{
			for(int j=1;j<=i;j++) //columns         //j=1,;1,2;1,2,3;1,2,3,4;1,2,3,4,5 
			{
				System.out.print("*");               //*  ,**,***,****,*****
			}
			System.out.println();
		}
	}
}
