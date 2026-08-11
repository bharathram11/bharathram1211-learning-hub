package javaExcercises;

import java.util.Scanner;

public class Program77withoutregexp
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence in desired pattern like 234cars 45buses");
		String x=sc.nextLine();
		sc.close();
		//Split into pieces
		String words[]=x.split(" ");//Separator is space
		String output="";
		//Visit each word
		for(String word:words)
		{
			int count=0;
			//check each character
			for(int i=0;i<word.length();i++) 
			{
				if(Character.isDigit(word.charAt(i))) 
				{
					output=output+word.charAt(i);
				}
				else //if alphabet
				{
					count++;
				}
			}
			output=output+count+" ";
		}
		System.out.println(output.trim());
	}
}
