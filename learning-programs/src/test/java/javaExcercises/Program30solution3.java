package javaExcercises;

import java.util.Scanner;

public class Program30solution3 
{
	public static void main(String[] args) 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number");
		int rno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter student name");
		String name=sc.nextLine();
		sc.close();
		System.out.println("Given Roll Number is "+rno);
		System.out.println("Given Name is "+name);
	}
}
