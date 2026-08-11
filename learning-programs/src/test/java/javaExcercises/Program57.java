package javaExcercises;

import java.util.HashMap;
import java.util.Scanner;

public class Program57
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); //Optional
		//if duplicate chars in different cases, get sentence into same case
		x=x.toLowerCase();
		//split sentence into chars array
		char[] chars=x.toCharArray();
		System.out.println("Count of all chars is "+chars.length);
		//Create hash map to store chars and occurrences of those chars as pairs
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for(int i=0;i<chars.length;i++) //0(1s char) to length-1(last char)
		{
			if(hm.containsKey(chars[i])) //character already inserted into hash map
			{
				hm.put(chars[i],hm.get(chars[i])+1); //update existing entry
			}
			else
			{
				hm.put(chars[i],1);  //insert new entry
			}
		}
		System.out.println(hm);
		System.out.println("Count of distinct chars is "+hm.keySet().size());
//		for(char c:hm.keySet())
//		{
//			System.out.print(c+" ");
//		}
//		System.out.println();
		//Find duplicated chars in all inserted distinct chars in hash map
		int count=0;
		for(char c:hm.keySet()) 
		{
			if(hm.get(c)>1)
			{
				System.out.println(c+" occured "+hm.get(c));
				count++;
			}
		}
		System.out.println("Count of duplicated chars is "+count);
	}
}
/*
 *sentence = input("Enter a sentence: ")
sentence = sentence.lower()
chars = list(sentence)
print(f"Count of all chars is {len(chars)}")
char_count = {}
for char in chars:
    if char in char_count:
        char_count[char] += 1
    else:
        char_count[char] = 1
print(char_count)
print(f"Count of distinct chars is {len(char_count)}")
duplicated_count = 0
for char, count in char_count.items():
    if count > 1:
        print(f"'{char}' occurred {count} times")
        duplicated_count += 1
print(f"Count of duplicated chars is {duplicated_count}")
*/

