package javaExcercises;

import java.util.Scanner;

public class Program38
{
	public static void main(String[] args)
	{
		//Get a string from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String word=sc.nextLine();
		sc.close();
		//Reverse the given word
		String reverse=""; //empty string
		//int l=word.length();
		//System.out.println(l);//java 
		for(int i=word.length()-1;i>=0;i--) //last index to first index   3,2,1,0
		{
			char c=word.charAt(i);  //a,v,a,j  
			reverse=reverse+c; //concatenation   ""+a   a+v=av  av+a avaj
		}
		System.out.printf("%s is reversed word of %s%n",reverse,word);
		//Check for Palindrome
		if(word.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
	}
}



/*
s1=input("enter the word")
reversed_string = s1[::-1]
print(reversed_string)  # Output: 'olleh'

string = "hello"
reversed_string = ""
for char in string:
    reversed_string = char + reversed_string  # Prepend each character
print(reversed_string)  # Output: 'olleh'

 */


