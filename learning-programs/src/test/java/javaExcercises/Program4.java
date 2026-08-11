package javaExcercises;

import java.util.Scanner;

public class Program4
{
	public static void main(String[] args)
	{
		//Take limits from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit");   
		long llimit=sc.nextLong();
		System.out.println("Enter upper limit");   
		long ulimit=sc.nextLong();
		sc.close();
		//Print multiplication tables under given limit
		for(long x=llimit;x<=ulimit;x++)
		{
			//Take each "x" to create multiplication table
			System.out.println("Table for "+x);
			System.out.println("-------------");
			for(int i=1;i<=10;i++) 
			{
				System.out.printf("%d X %d=%d%n",x,i,x*i);
				//System.out.println(x+"  X  "+i+"  =  "+(x*i));
			}
			System.out.println("-------------");
		}
	}
}

/*
 * #import math
llimt=int(input("enter the number1:"))
ulimt=int(input("enter the number2:"))
for a in range(llimt,ulimt+1):
    flag=0
    print(f"mul for {a}")
    for i in range(1,11):
        print(f"{a} X {i} = {a*i}")
 */


