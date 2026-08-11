package javaExcercises;

import java.util.Scanner;

public class Program9
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long x=sc.nextLong(); //original number
		sc.close();
		int sum=0;
		long temp=x; //copy original number into temporary variable
		//Get sum of digits in given number
		while(temp!=0)
		{
			int r=(int)(temp%10); //get last digit
			sum=sum+r; //add that digit to sum
			temp=(long)temp/10;//cut that last digit from number
		} //loop will be terminated when temp equals to 0
		System.out.printf("%d is sum of digits in %d",sum,x);
	}
}

