package javaExcercises;

import java.util.Scanner;

public class Program63
{
	public static void main(String[] args) 
	{
		//Take a word
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a word");
		String x=sc.nextLine();
		sc.close(); 
		//reverse string 
		String y=""; //empty string
		for(int i=x.length()-1; i>=0; i--) //from last char to 1st char
		{
			y=y+x.charAt(i);   //y=""+i=i+h=ih
		}
		System.out.println(y);
		if(x.equals(y))
		{
			System.out.println(x+" is palindrome");
		}
		else
		{
			System.out.println(x+" is not palindrome");
		}
	}
}
/*
x = input("Enter a word: ")
y = ""
for i in range(len(x)-1, -1, -1):
    y += x[i]
print(y)
if x == y:
    print(f"{x} is palindrome")
else:
    print(f"{x} is not palindrome")
*/