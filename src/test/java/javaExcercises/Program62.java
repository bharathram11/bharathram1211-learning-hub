package javaExcercises;

import java.util.Scanner;

public class Program62
{
	public static void main(String[] args)
	{
		//Take a word
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		sc.close();
		//reverse() method is available in "StringBuffer" and "StringBuilder"
		StringBuffer sb=new StringBuffer(x);
		StringBuffer y=sb.reverse();
		System.out.println(y);
	}
}






