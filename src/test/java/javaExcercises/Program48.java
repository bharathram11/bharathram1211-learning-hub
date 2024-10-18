package javaExcercises;

import java.util.Scanner;

public class Program48
{
	public static void main(String[] args)
	{
		//Get a sentence from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close();
		System.out.println(x.length());
		//define count variables
		int nos=0; //spaces
		int noc=0; //non-spaces
		int now; //words
		if(x.charAt(0)==' ')
		{
			now=0;
		}
		else
		{
			now=1;
		}
		//Looping for count of spaces ad non-spaces and words
		for(int i=0;i<x.length();i++) //0(1st char) to length-1(last char)
		{
			char y=x.charAt(i);
			//for blank space and character
			if(y==' ')
			{
				nos++;   //1+
			}
			else
			{
				noc++;    //1+1+
			}
			//for word
			try
			{
				if(y==' ' && x.charAt(i+1)!=' ')
				{
					now++;  //1+
				}
			}
			catch(Exception ex) //to catch "StringOutOfBoundsException"
			{
				System.out.println("Search completed");
			}
		}
		System.out.println("No: of spaces is "+nos);
		System.out.println("No: of non space characters is "+noc);
		System.out.println("No: of words is "+now);
	}
}









