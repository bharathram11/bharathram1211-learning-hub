package javaExcercises;

import java.util.Scanner;

public class Program10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long x=sc.nextLong(); //original number
		sc.close();
		long temp=x;//copy original number into temporary variable
		while(temp>9)
		{
			//Calculate sum of digits in given number
			int sum=0;
			while(temp!=0)
			{
				int r=(int) (temp%10); //get last digit
				sum=sum+r; //add that last digit to sum
				temp=(long)temp/10;//cut that last digit from number
			}
			temp=sum;
		}
		System.out.println(temp);
	}
}
