package javaExcercises;

public class Program21
{
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++) //rows
		{
			for(int k=4;k>=i;k--) //for spaces       
			{
				System.out.print("0");        //0000   000   00      0
			}
			for(int j=1;j<(2*i);j++) //columns     
			{
				System.out.print("*");      //*       ***    *****  *******
			}
			System.out.println();
		}
	}
}
