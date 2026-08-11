package javaExcercises;

import java.util.Scanner;

public class Program30solution2 
{
	public static void main(String[] args) 
	{
		//Get data from keyboard(Take Strings as first before taking integers)
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student name");
		String name=sc.nextLine();
		System.out.println("Enter roll number");
		int rno=sc.nextInt();
		sc.close();
		System.out.println("Given Roll Number is "+rno);
		System.out.println("Given Name is "+name);

	}

}
