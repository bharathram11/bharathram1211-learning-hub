package javaExcercises;

import java.util.Scanner;

public class Program60
{
	public static void main(String[] args)
	{
		//Without loop
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();   //success
		//Take a char
		System.out.println("Enter a character");
		char y=sc.nextLine().charAt(0);
		sc.close(); 
		//count of occurrences
		String temp=x; //copy sentence 
		int l1=temp.length(); //get count of chars in that sentence
		System.out.println(l1);   //7
		temp=temp.replace(""+y,""); //char replace with null, means remove that character   //ucce//4
		int l2=temp.length(); //get count of chars in that sentence after replace
		System.out.println(l2);
		System.out.println(y+" occured "+(l1-l2)+" times ");
	}
}





