package javaExcercises;

import java.util.Scanner;

public class Program8
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long n=sc.nextLong(); //original number
		sc.close();
		//Find count of digits in given number
		int count=0;
		long temp=n; //copy original value into a temporary variable
		while(temp!=0)
		{
			temp=temp/10; //cut last digit
			count++;
		} //loop will be terminated when temp equals to 0
		System.out.printf("%d has %d digits",n,count);
	}
}
