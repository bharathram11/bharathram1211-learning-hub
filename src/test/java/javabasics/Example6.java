package javabasics;

import java.util.Scanner;

public class Example6
{
	public static void main(String[] args)
	{
		//  prime number: A number, which is divided by 1 and the number itself 

		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		sc.close();
		//Check for prime or not(x is Prime number, which divided by 1 and x itself only ex: 7)
		int flag=0;
		for(int i=2;i<x;i++) //means not divided by 2 to x-1     //5 //2,3,4
		{
			if(x%i==0)
			{
				flag=1;
				System.out.printf(x+" is not a prime number");
				break; //terminate from current loop
			}
		} //loop will be terminated either "at end" or because of "break"
		if(flag==0)
		{
			System.out.printf(x+" is a prime number");
		}
	}
}







