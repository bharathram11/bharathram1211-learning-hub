package javaExcercises;

import java.util.Scanner;

public class Program98_1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		sc.close();
		if(age<18) 
		{  
	        //throw Arithmetic exception if not eligible to vote and stops execution
			ArithmeticException e=new ArithmeticException("Person is not eligible to vote");
	        throw e;     
	    }  
	    else 
	    {  
	        System.out.println("Person is eligible to vote!!");  
	    }
		//further code
		System.out.println("Testing is done");  
	}
}
