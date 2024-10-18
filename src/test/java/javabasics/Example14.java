package javabasics;

import java.util.Scanner;

public class Example14
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long x=sc.nextLong(); //original number
		sc.close();
		long temp=x;//copy original number into temporary variable
		while(temp>9)  //10
		{
			//Calculate sum of digits in given number
			int sum=0;
			while(temp!=0)   //10
			{
				int r=(int) (temp%10); //get last digit  1  //0
				sum=sum+r; //add that last digit to sum  0   //0+0     0+1=1
				temp=(long)temp/10;//cut that last digit from number  1
			}
			temp=sum;
		}
		System.out.println(temp);
	}
}
