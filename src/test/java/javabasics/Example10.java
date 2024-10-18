package javabasics;
import java.util.Scanner;
public class Example10
{
	public static void main(String[] args) 
	{
		//Take a number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		//Calculate Factorial(4! is 4*3*2*1)    54321
		int f=1; //initial output is 0 for sum/additions and 1 for multiplications
		for(int i=n;i>=1;i--) // n to 1    5     //5*4*3*2*1=120
		{
			f=f*i;    //1*5  5*4 //20*3 60*2 120*1 120
		}
		System.out.println(f);
		int x=1;
		for(int i=1;i<=7;i++)
		{
			x=x*i;
		}
		System.out.println(x);
	}
}




