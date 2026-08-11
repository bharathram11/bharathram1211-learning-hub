package javaExcercises;

import java.util.HashMap;
import java.util.Scanner;

public class Program56
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); 
		//May be duplicate words in different cases, so get sentence into same case
		//And remove leading and trailing spaces
		x=x.trim();
		x=x.toLowerCase();
		//split sentence into words
		String[] words=x.split(" "); //space is a separator
		System.out.println("Count of all words is "+words.length);
		//Create hash map to store "words" and "occurrences of those words" as pairs/entries
		HashMap<String, Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<words.length;i++) //0(1st word) to length-1(last word)
		{
			if(hm.containsKey(words[i])) //word already inserted into hash map
			{
				hm.put(words[i],hm.get(words[i])+1); //increase value by 1
			}
			else
			{
				hm.put(words[i], 1); //insert new word as key and 1 as value
			}
		}
		System.out.println(hm);
		System.out.println("Count of distinct words is "+hm.keySet().size());
		//Display duplicated words with count of occurrences
		int count=0;
		for(String word:hm.keySet()) //for all inserted distinct words in hash map
		{
			if(hm.get(word)>1)
			{
				System.out.println(word+" occured "+hm.get(word));
				count++;
			}
		}
		System.out.println("Count of duplicated words is "+count);

		}
	}
/*

sentence = input("Enter a sentence: ")
sentence = sentence.strip().lower()

words = sentence.split()
print(f"Count of all words is {len(words)}")
# Create a dictionary to store word counts
word_count = {}
for word in words:
    if word in word_count:
        word_count[word] += 1  
    else:
        word_count[word] = 1 
# Print the word count dictionary
print(word_count)
# Print the count of distinct words
print(f"Count of distinct words is {len(word_count)}")
# Print duplicated words with their occurrences
duplicated_count = 0
for word, count in word_count.items():
    if count > 1:
        print(f"{word} occurred {count} times")
        duplicated_count += 1
# Print the count of duplicated words
print(f"Count of duplicated words is {duplicated_count}")
*/