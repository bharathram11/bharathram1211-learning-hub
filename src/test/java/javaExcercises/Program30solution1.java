package javaExcercises;

import java.util.Scanner;

public class Program30solution1 
{
	public static void main(String[] args) 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number");
		int rno=sc.nextInt();
		sc.nextLine(); // Consume the newline character(enter key) left by nextInt()
		System.out.println("Enter student name");
		String name=sc.nextLine();
		sc.close();
		System.out.println("Given Roll Number is "+rno);
		System.out.println("Given Name is "+name);

	}

}
