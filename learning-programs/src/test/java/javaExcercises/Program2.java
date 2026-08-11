package javaExcercises;

import java.util.Scanner;

public class Program2
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		sc.close();
		//Check for prime or not(x is Prime number, which divided by 1 and itself only)
		int flag=0;
		for(int i=2;i<x;i++) //means not divided by 2 to x-1
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
/*
 * #import math
a=int(input("enter the number1:"))
flag=0
for i in range(2,a):
    if a%i==0:
        flag=1
        print(f"{a} is not an prime number")
        break
    if flag==0:
        print(f"{a} is a prime number")*/






