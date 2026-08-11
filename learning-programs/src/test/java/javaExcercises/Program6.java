package javaExcercises;

import java.util.Scanner;

public class Program6
{
	public static void main(String[] args) 
	{
		//Take a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		//Calculate Factorial(4! is 4*3*2*1)
		int f=1; 
		for(int i=n;i>=1;i--) // n to 1
		{
			f=f*i;
		}
		System.out.println(" factorial value is "+f);
	}
}




