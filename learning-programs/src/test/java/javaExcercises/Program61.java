	package javaExcercises;

import java.util.Scanner;

public class Program61
{
	public static void main(String[] args)
	{
		//Take data from Keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String ms=sc.nextLine();
		ms=ms.toLowerCase();
		System.out.println("Enter a substring");
		String ss=sc.nextLine();
		ss=ss.toLowerCase();
		sc.close();
		//get index of all occurrences of sub-string in main-string including count of occurrences
		int count=0;
		System.out.print("Positions are ");
		for(int i=0; i<ms.length(); i++)
		{
			//char matching
			if(ms.charAt(i)==ss.charAt(0))    //india==india
			{
				int flag=0;
				//word matching
				for(int j=1,k=i+1; j<ss.length(); j++,k++)
				{	
					if(ms.charAt(k)!=ss.charAt(j))
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
					System.out.print(i+" "); 
					count++;
				}
			}
		}	
		System.out.println();
		System.out.println("Count of occurrences is "+count);
	}
}
