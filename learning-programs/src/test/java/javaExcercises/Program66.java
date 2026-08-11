package javaExcercises;

import java.util.Scanner;

public class Program66
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
		//2. reverse order of words in given sentence
		for(int i=words.length-1;i>=0;i--)
		{
			y=y+words[i]+" ";  //kola krishna hari
		}
		//Display output
		System.out.println(y.trim());
	}
}
/*
x = input("Enter a sentence: ")
words = x.split(" ")
y = ""
for i in range(len(words)-1, -1, -1):
    y += words[i] + " "
print(y.strip())
*/