package javaExcercises;

import java.util.Scanner;

public class Program7
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int l=sc.nextInt();
		sc.close();
		//form the Fibonacci sequence(0, 1, 1, 2, 3, 5, 8, 13, 21, ....etc)
		int x=0;
		int y=1;
		System.out.printf("%d %d",x,y);
		do
		{
			int z=x+y;
			System.out.printf(" %d",z);
			x=y;
			y=z;
		}while((x+y)<=l);
	}
}

/*
 * x = int(input("Enter the number of terms: "))  # Input: how many Fibonacci numbers to generate
a, b = 0, 1  # Initialize the first two Fibonacci numbers
print(a, b, end=" ")  # Print the first two numbers

for i in range(2, x):  # Loop starts from the 3rd term
        z = a + b
        print(z, end=" ")
        a=b
        b=z

 */





