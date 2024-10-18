package javabasics;

import java.util.Scanner;

public class Example16 
{
	public static void main(String[] args)
	{
		
		/*Armstrong number:An Armstrong number is a number that is equal to the sum of its
		  own digits,each raised to the power of the number of digits*/
		
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		long x=sc.nextInt(); //original number
		sc.close();
		
		//Step-1: Calculate count of digits in given number
		long temp1=x; //take original number
		int count=0;
		while(temp1!=0)
		{
			temp1=temp1/10; //cut digit                      //24=  2^2+4^2   =4+16=20
			count++;                                         //153=  1^3+5^3+3^3   =1+125+27=153
		}
		//System.out.printf("No: of digits in %d is %d%n",x,count);
		System.out.println(count);
		
		//Step-2: Calculate sum of Armstrong equation
		long temp2=x; //take original number
		long value=0;
		while(temp2!=0)
		{
			int d=(int) (temp2%10); //get last digit    3        5         1  
			value=(long) (value+Math.pow(d,count));     //0+(3^3)  27+5^3   152   1^3  153
			temp2=(long)temp2/10; //cut last digit
		}
		
		//compare output value with original number for for Armstrong
		if(value==x)
		{
			System.out.printf("%d is Armstrong number",x);
		}
		else
		{
			System.out.printf("%d is not Armstrong number",x);
		}
	}
}
