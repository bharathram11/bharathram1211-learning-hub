package javabasics;

import java.util.Scanner;

public class Example15
{
	public static void main(String[] args)
	{
		//Palindrome number:if you reverse the digits of the number, it remains the same.
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt(); //original number
		sc.close();
		//Reverse given number and check for palindrome
		int rev=0; 
		int temp=x;//copy original value into temporary variable     357    35    3
		while(temp!=0)
		{
			int r=temp%10; //get last digit                         7        5           3
			rev=rev*10+r; //add that last digit to "reverse" value at end   =0*10+7    7*10+5   75*10+3   =750+3 753
			temp=temp/10; //cut last digit                                  357/10=35     3      0
		}
		System.out.println(rev);
		//compare reverse number with original number
		if(x==rev)
		{
			System.out.println(x+" is palindrome");     //121   121
		}
		else
		{
			System.out.println(x+" is not palindrome");
		}
	}
}
