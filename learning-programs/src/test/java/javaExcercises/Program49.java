package javaExcercises;

import java.util.Scanner;

public class Program49
{
	public static void main(String[] args)
	{
		//Get a sentence from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close();
		//get count of words in given sentence
		x=x.trim(); //Remove leading and trailing spaces if exist
		String y[]=x.split(" "); //space is separator
		System.out.println("No: of words is "+y.length);
		for(String z:y)
		{
			System.out.println(z);
		}
	}
}
/*
s1 = input("Enter a sentence: ")
word = len(s1.split())
print(f"Words: {word}")


 */





