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
		int f=1; //initial output is 0 for sum/additions and 1 for multiplications
		for(int i=n;i>=1;i--) // n to 1
		{
			f=f*i;
		}
		System.out.printf("%d factorial value is %d",n,f);
	}
}




