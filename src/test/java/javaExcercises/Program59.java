package javaExcercises;

import java.util.Scanner;

public class Program59
{
	public static void main(String[] args)
	{
		//with loop
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		//Take a char
		System.out.println("Enter a character");
		char y=sc.nextLine().charAt(0);
		sc.close(); 
		//count of occurrences
		int count=0;
		for(int i=0;i<x.length();i++) //for 1st char to last char in given sentence
		{
			if(y==x.charAt(i))   //s==s,s==u,s==c,s==c,s==e,s==s,s==s
			{
				count++;
			}
		}
		System.out.println(y+" occured "+count+" times");
	}
}
