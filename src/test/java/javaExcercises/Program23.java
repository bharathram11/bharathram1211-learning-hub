package javaExcercises;

public class Program23
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) //rows
		{
			//for spaces
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");         //0000    000   00  0
			}
			for(int j=1;j<(2*i);j++) //columns                 
			{
				System.out.print("*");         //  *   ***   *****   *******    *********
			}
			System.out.println();
		}
		for(int i=4;i>=1;i--) //rows    
		{
			//for spaces
			for(int k=4;k>=i;k--)            //0   00  000   0000
			{
				System.out.print(" ");
			}
			for(int j=1;j<(2*i);j++) //columns   /   *******  *****  ***   *
				{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
