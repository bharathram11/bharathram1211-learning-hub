package javaExcercises;

import java.util.Scanner;

public class Program64
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); 
		//1.Split given sentence into words
		String[] words=x.split(" "); //Separator is blank space
		String y=""; //empty string for output initially
		//2. reverse each word in given sentence
		for(String word:words)
		{
			String reversedword="";
			for(int i=word.length()-1; i>=0; i--) //last char to 1st char
			{
				reversedword=reversedword+word.charAt(i);
			}
			//3. add that reversed word to output
			y=y+reversedword+" ";
		}
		//Display output
		System.out.println(y.trim());
	}
}
