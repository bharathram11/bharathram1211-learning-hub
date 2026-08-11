package javaExcercises;

import java.util.Scanner;

public class Program55 
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); //optional
		//Way-2
		//count variables
		int clc=0;
		int cuc=0;
		int cd=0;
		int csc=0;
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(Character.isLowerCase(y))
			{
				clc++;
			}
			else if(Character.isUpperCase(y))
			{
				cuc++;
			}
			else if(Character.isDigit(y))
			{
				cd++;
			}
			else
			{
				csc++;
			}
		}
		System.out.println("lower case alphabet count is "+clc);
		System.out.println("upper case alphabet count is "+cuc);
		System.out.println("digits count is "+cd);
		System.out.println("Remaining chars count is "+csc);
	}
}
