package javaExcercises;

import java.util.Scanner;

public class Program11
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt(); //original number
		sc.close();
		//Reverse given number 
		int y=0; //initially reverse number is 0
		int temp=x; //copy original value into temporary variable
		while(temp!=0)
		{
			int r=temp%10; //get last digit
			y=y*10+r; //add that last digit to "reverse" value at end
			temp=temp/10; //cut last digit
		}
		System.out.println(y);
		//compare reverse number with original number to confirm as palindrome
		if(x==y)
		{
			System.out.println(x+" is palindrome");
		}
		else
		{
			System.out.println(x+" is not palindrome");
		}
	}
}
