package javaExcercises;

import java.util.Scanner;

public class Program53
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close();
		//count vowels
		int vc=0;
		int remaining=0;
		for(int i=0;i<x.length();i++) //0(1st char) to length-1(last char)
		{
			char y=x.charAt(i);
			if(y=='a' || y=='e' || y=='i' || y=='o' || y=='u' || 
			   y=='A' || y=='E' || y=='I' || y=='O' || y=='U')
			{
				vc++;
			}
			else
			{
				remaining++;
			}
		}
		System.out.println("Vowels count is "+vc);
		System.out.println("Remaining chars count is "+remaining);
	}
}
