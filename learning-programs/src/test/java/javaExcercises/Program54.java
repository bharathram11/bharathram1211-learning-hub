package javaExcercises;

import java.util.Scanner;

public class Program54 
{
	public static void main(String[] args)
	{
		//Take a sentence
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String x=sc.nextLine();
		sc.close(); 
		//define count variables
		int clc=0;       //lower,upper,digit
		int cuc=0;
		int cd=0;
		int csc=0;     //special charecter
		for(int i=0;i<x.length();i++)
		{
			char y=x.charAt(i);
			if(y>='a' && y<='z')   //if(y>=97 && y<=122)
			{
				clc++;
			}
			else if(y>='A' && y<='Z')  //else if(y>=65 && y<=90)
			{
				cuc++;
			}
			else if(y>='0' && y<='9') //else if(y>=48 && y<=57)
			{
				cd++;
			}
			else
			{
				csc++;
			}
		}
		System.out.println("lower case alphabet count is "+clc);
		System.out.println("upper case alphabet count is "+cuc);
		System.out.println("digits count is "+cd);
		System.out.println("Remaining chars count is "+csc);
	}
}
/*

x = input("Enter a sentence: ")
clc = 0  
cuc = 0  
cd = 0   
csc = 0  
for y in x:
    if y.islower(): 
        clc += 1
    elif y.isupper():  
        cuc += 1
    elif y.isdigit():  
        cd += 1
    else: 
        csc += 1
print(f"Lower case alphabet count is {clc}")
print(f"Upper case alphabet count is {cuc}")
print(f"Digits count is {cd}")
print(f"Remaining chars count is {csc}")
*/