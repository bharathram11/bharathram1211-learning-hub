package javaExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program84
{
	public static void main(String[] args)
	{
		//Declare dynamic array(no limit on size)
		List<Integer> x=new ArrayList<Integer>();
		//Get data from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			x.add(sc.nextInt()); //add new value
		}
		sc.close();
		//bubble sort for ascending order
		for(int i=0;i<n;i++) //n times
		{
			for(int j=0;j<n-1;j++) //n-1 comparisons
			{
				if(x.get(j)>x.get(j+1))
				{
					//swap numbers
					int temp=x.get(j); //get existing value
					x.set(j,x.get(j+1)); //replace existing value with new value
					x.set(j+1,temp);
				}
			}
		}
		System.out.println(x); //display list
		System.out.println("smallest is "+x.get(0));
		System.out.println("largest is "+x.get(n-1));
		for(int i=0;i<n;i++) //0 to n-1
		{
			int temp1=x.get(i);
			int temp2=x.get(i+1);
			if(temp1==temp2)
			{
				continue;
			}
			else
			{
				System.out.println("second smallest is "+x.get(i+1));
				break;
			}
		} 
		for(int i=n-1;i>=0;i--) //n-1 to 1
		{
			int temp1=x.get(i);
			int temp2=x.get(i-1);
			if(temp1==temp2) //comparison of values in variables
			{
				continue;
			}
			else
			{
				System.out.println("second largest is "+x.get(i-1));
				break;
			}
		} 
	}
}
