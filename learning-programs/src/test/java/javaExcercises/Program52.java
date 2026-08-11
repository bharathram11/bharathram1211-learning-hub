package javaExcercises;

import java.util.Scanner;

public class Program52
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
			switch(y)
			{
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
				case 'A':
				case 'E':
				case 'I':
				case 'O':
				case 'U':
					vc++;
					break;
				default:
					remaining++;
					break; //optional
			}
		}
		System.out.println("Vowels count is "+vc);
		System.out.println("Remaining chars count is "+remaining);
	}
}
/*

sentence = input("Enter a sentence: ")
vowel_count = 0
remaining_count = 0
for char in sentence:
    if char.lower() in 'aeiou':
        vowel_count += 1
    else:
        remaining_count += 1
print(f"Vowels count is {vowel_count}")
print(f"Remaining chars count is {remaining_count}")
*/