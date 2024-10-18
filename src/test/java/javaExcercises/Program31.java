package javaExcercises;

import java.util.Scanner;

public class Program31
{
	public static void main(String[] args) 
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter roll number");
		int rno=Integer.parseInt(sc.nextLine());
		System.out.println("Enter student name");
		String name=sc.nextLine();
		System.out.println("Enter student Grade(A/B/C/D)");
		char grade=sc.nextLine().charAt(0);
		System.out.println("Enter \"are you married?\"");
		boolean m=sc.nextBoolean();
		sc.close(); //optional
		System.out.println("Given Roll Number is "+rno);
		System.out.println("Given Name is "+name);
		System.out.println("Given Grade is "+grade);
		System.out.println("Given \"are you married?\" is "+m);
		
	}

}
