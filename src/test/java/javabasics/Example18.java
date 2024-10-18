package javabasics;

import java.util.Scanner;

public class Example18
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();
		sc.close();
		//binary to decimal
		//way-1     /1101    3210
		String s=n+""; //give binary number as String as per syntax         16 8 4 2 1
		int d=Integer.parseInt(s,2);                                     //  0 1 1 0 1
		System.out.println(n+" decial value is "+d);                     //    3 2 1 0
		//Way-2
		int decvalue=0; 
	    int placevalue=0; 
	    int temp=n; // 1101 
	    while(temp!=0) 
	    { 
	        int lastbit=temp%10; //get last digit              1      0          1    1
	        temp=temp/10; //cut that digit from binary number  110     11        1    0
	        decvalue=(int) (decvalue+lastbit*Math.pow(2,placevalue)); //(0+1*(2,0)=1    (1+0*(2,1))=1     1+1*(2,2)= 5   (5+1*(2,3)=13
	        //decvalue=(int) (decvalue+lastbit*power(2,placevalue)); 
	        placevalue++;
	    } 
	    System.out.println(n+" decial value is "+decvalue);
	}
	
//	public static long power(int base, int exp)
//	{
//		long output=1;
//		for(int i=1;i<=exp;i++)
//		{
//			output=output*base;
//		}
//		return(output);
//	}
}



