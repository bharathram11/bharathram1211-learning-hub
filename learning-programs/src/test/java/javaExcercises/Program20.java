package javaExcercises;

import java.util.Scanner;

public class Program20
{
	public static void main(String[] args)
	{
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rows count");   //n=5
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter symbol");
		char c=sc.nextLine().charAt(0); //Take a character from keyboard   //*
		sc.close();
		//Right Aligned Triangle
		for(int i=1;i<=n;i++) //rows           //1
		{
			for(int j=n-1;j>=i;j--) //spaces     //4,3,2,   
			{ 
				System.out.print(" ");            //0000*   000** 00***  0****  *****        
			}
			for(int k=1;k<=i;k++) //symbols
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}
}
/*
symbol=input("enter the symbol")
rows=int(input('enter the no of rows'))
for i in range(1,rows):
    for j in range(rows,i,-1):
        print(" ",end="")
    for k in range(1,i+1):
        print(f"{symbol}",end="")
    print()*/