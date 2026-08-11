package javaExcercises;

import java.util.Scanner;

public class Program29
{
	public static void main(String[] args) 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number");
		int rno=sc.nextInt();
		System.out.println("Enter student name");
		String name=sc.nextLine();
		sc.close(); //optional
		System.out.println("Given Roll Number is "+rno);
		System.out.println("Given Name is "+name);
		/*
		The issue arises because nextInt() does not consume the newline character left in the input
		buffer when the integer is read. This causes nextLine() to read the newline character as 
		an empty string.
		*/
	}

}
