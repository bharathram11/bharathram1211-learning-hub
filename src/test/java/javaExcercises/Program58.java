package javaExcercises;

import java.util.HashMap;
import java.util.Scanner;

public class Program58
{
	public static void main(String[] args)
	{
		//1. Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); 
		//2. Create hash map to store "vowel chars" and "occurrences of those chars" as pairs
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		hm.put('a',0); 
		hm.put('e',0); 
		hm.put('i',0); 
		hm.put('o',0); 
		hm.put('u',0); 
		//if duplicate chars in different cases, then get that sentence into same case
		x=x.toLowerCase();
		//split sentence into chars array
		char[] chars=x.toCharArray();
		System.out.println("Count of all chars is "+chars.length);
		//3. process on each character in given string
		for(int i=0;i<chars.length;i++) //0(1s char) to length-1(last char)
		{
			if(hm.containsKey(chars[i])) //character match with vowels in hash map
			{
				hm.put(chars[i],hm.get(chars[i])+1); //update entry by increasing value by 1
			}
		}
		System.out.println(hm);
		//4. Find max occurrences
		int max=0;
		for(char c:hm.keySet()) 
		{
			if(hm.get(c)>max)
			{
				max=hm.get(c);
			}
		}
		//5. Find vowels which occurred maximum times
		for(char c:hm.keySet()) 
		{
			if(hm.get(c)==max)
			{
				System.out.printf("vowel-%c has heighest occurences like %d%n",c,max);
			}
		}
	}
}
