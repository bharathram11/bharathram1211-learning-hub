package javaExcercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program78withregexp
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence in desired pattern like 234cars 45buses");
		String x=sc.nextLine();
		sc.close(); 
		String output="";
		//Separate digits and chars/strings using RegularExpressions
	    Pattern r1=Pattern.compile("[0-9]+"); //one or more digits
	    Pattern r2=Pattern.compile("[a-zA-Z]+"); //one or more alphabet
	    Matcher m1=r1.matcher(x);
	    Matcher m2=r2.matcher(x);
	    while(m1.find() && m2.find()) 
	    {
	        output=output+m1.group();
	        output=output+m2.group().length();
	        output=output+" ";
	    }
	    System.out.println(output.trim());
	}
}
//Pattern and Matcher classes are related to "java.util.regex" in JDK




