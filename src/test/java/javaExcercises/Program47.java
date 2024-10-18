package javaExcercises;

import java.util.Scanner;

public class Program47
{
	public static void main(String[] args)
	{
		//Get two words from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st word");
		String x=sc.nextLine();
		System.out.println("Enter 2nd word");
		String y=sc.nextLine();
		sc.close();
		System.out.println("Before swap:");
		System.out.println("x is :"+x+" y is :"+y);
		//Swapping
		String temp="";
		temp=x;      //x=22 y=33   temp=22, x=33, y=22
		x=y;
		y=temp;
		System.out.println("After swap:");
		System.out.println("x is :"+x+" y is :"+y);
	}
}





