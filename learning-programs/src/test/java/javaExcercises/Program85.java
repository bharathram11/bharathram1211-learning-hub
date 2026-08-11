package javaExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program85
{
	public static void main(String[] args)
	{
		//Declare dynamic array
		List<String> x=new ArrayList<String>(); //String is default generic
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=Integer.parseInt(sc.nextLine());
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			x.add(sc.nextLine());
		}
		sc.close();
		//bubble sort
		for(int i=0;i<n;i++) //n times
		{
			for(int j=0;j<n-1;j++) //n-1 comparisons
			{
				if(x.get(j).compareTo(x.get(j+1))>0)
				{
					String temp=x.get(j);
					x.set(j,x.get(j+1));
					x.set(j+1,temp);
				}
			}
		}
		System.out.println(x); //display list
	}
}
