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
		/*A temporary variable temp is used to store the value of s1.
		The value of s2 is assigned to s1.
		Finally, the value stored in temp (original s1) is assigned to s2.*/
		
		System.out.println("After swap:");
		System.out.println("x is :"+x+" y is :"+y);
	}
}
/* s1,s2=s2,s1
 num1 = int(input("Enter the first number: "))
num2 = int(input("Enter the second number: "))
print(f"Before swap: {num1} and {num2}")
# Swap logic
num1 = num1 + num2
num2 = num1 - num2
num1 = num1 - num2
print(f"After swapping: {num1} and {num2}")


s1 = input("Enter the first number: ")
s2 = input("Enter the second number: ")
print(f"Before swap: {s1} and {s2}")
# Swap logic
temp=s1
s1=s2
s2=temp
print(f"After swapping: {s1} and {s2}")


s1 = input("Enter the first number: ")
s2 = input("Enter the second number: ")
print(f"Before swap: {s1} and {s2}")
# Swap logic
s1,s2=s2,s1
print(f"After swapping: {s1} and {s2}")
 */




