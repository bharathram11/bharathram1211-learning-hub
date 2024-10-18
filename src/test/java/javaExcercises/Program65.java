package javaExcercises;

import java.util.Scanner;

public class Program65
{
	public static void main(String[] args)
	{
		//1. Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close();
		//2. Reverse the sentence
		String y=""; //empty string
		for(int i=x.length()-1;i>=0;i--)
		{
			char c=x.charAt(i);
			y=y+c;
		}
		//3. remove spaces in reversed sentence
		y=y.replace(" ",""); 
		//4. add spaces to reversed sentence as per spaces in original sentence
		String z="";
		int j=0;
		for(int i=0;i<x.length();i++) 
		{
			if(x.charAt(i)==' ')
			{
				z=z+' ';
			}
			else
			{
				z=z+y.charAt(j);
				j++;
			}
		}
		System.out.println(z);
	}
}
