package javaExcercises;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Program51 
{
	public static void main(String[] args)
	{
		//Get a sentence from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close();
		//get count of words in given sentence
		StringTokenizer st=new StringTokenizer(x," "); 
		System.out.println("No: of words is "+st.countTokens());
		while(st.hasMoreTokens())   
	    {    
	        System.out.println(st.nextToken());    
	    }    
	}
}









