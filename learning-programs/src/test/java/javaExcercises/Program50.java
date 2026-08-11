package javaExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program50 
{
	public static void main(String[] args)
	{
		//1. Take a sentence from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence=sc.nextLine();
		sc.close();
		//2. Get number of words
		sentence=sentence.trim(); //Remove leading and trailing spaces if exist
		String words[]=sentence.split(" "); //space is separator
		System.out.println("No: of words is "+words.length);
		//3. Find palindrome words in that sentence
		List<String> palindromes=new ArrayList<String>();
		for(String word:words)
		{
			//3.1. find reverse of the word
			String reverse="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverse=reverse+word.charAt(i);   
			}
			//3.2. compare reversed word with original word
			if(word.equalsIgnoreCase(reverse))
			{
				palindromes.add(word);
			}
		}
		//4. Display palindrome words
		System.out.println("Palindrome words count is "+palindromes.size()+" and they are:");
		for(String word:palindromes)
		{
			System.out.println(word+" ");
		}
	}
}
/*
sentence = input("Enter a sentence: ")
sentence = sentence.strip()  # Remove leading and trailing spaces
words = sentence.split()  # Split by spaces
print(f"No: of words is {len(words)}")
palindromes = []
for word in words:
    reverse = word[::-1] 
    if word.lower() == reverse.lower():
        palindromes.append(word)
print(f"Palindrome words count is {len(palindromes)} and they are:")
for word in palindromes:
    print(word)
*/