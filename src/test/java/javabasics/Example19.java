package javabasics;

import java.util.Scanner;

public class Example19
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		//Convert decimal to binary
		int temp=n;
		String binary=""; //empty string
		while(temp!=0)
		{
			int r=temp%2;   //  45                                                 //            22   11   5  2   1
			binary=r+binary; //concatenate remainder at front of existing binary code   101101+""   0     1   1   0  1
			temp=(int)temp/2; //Quotient for next               22                             11    5   2    1
		}
		System.out.println(n+" binary value is "+binary);	
	}
}


