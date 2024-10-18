package javabasics;

import java.util.Scanner;

public class Example13
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long x=sc.nextLong(); //original number
		sc.close();
		int sum=0;   				//1234 =10
		long temp=x; 				//copy original number into temporary variable
		
		//Get sum of digits in given number
		while(temp!=0)
		{    
			int r=(int)(temp%10); //get last digit              //1234 %10= 4    123%10=3    12%10=2     1%10 =1
			sum=sum+r;//add that digit to sum                   //0+4;            4+3           7+2        9+1
			temp=(long)temp/10;//cut that last digit from number //1234/10=123    123/10=12     12/10=1    1/10=0
		} //loop will be terminated when temp equals to 0
		//System.out.printf("%d is sum of digits in %d",sum,x);
		System.out.println(sum);
	}
}

