package javabasics;

import java.util.Scanner;

public class Example8
{
	public static void main(String[] args)
	{
		//Take limits from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit");
		int llimit=sc.nextInt();
		System.out.println("Enter upper limit");
		int ulimit=sc.nextInt();
		sc.close();
		//Print multiplication tables under given limit
		for(long x=llimit;x<=ulimit;x++)   //1 
		{
			//Take each "x" to create multiplication table
			System.out.println("Table for "+x);
			System.out.println("-------------");
			for(int i=1;i<=10;i++) 
			{
				//System.out.printf("%d X %d=%d%n",x,i,x*i);
				System.out.println(x+"  X  "+i+"  =  "+(x*i));   //1 X 1 =1 //1 X 2= 2
			}
			System.out.println("-------------");
		}
	}
}




