package javaExcercises;

import java.util.Scanner;

public class Program15
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
			int r=temp%2;
			binary=r+binary; //concatenate remainder at front of existing binary code
			temp=(int)temp/2; //Quotient for next
		}
		System.out.println(n+" binary value is "+binary);	
	}
}







