package javaExcercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program86
{
	public static void main(String[] args)
	{
		//Declare dynamic array and get data from keyboard
		List<Integer> x=new ArrayList<Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=sc.nextInt();
		System.out.println("Enter "+n+" values");
		for(int i=0;i<n;i++)
		{
			x.add(sc.nextInt());
		}
		sc.close();
		//remove duplicates in array
		for(int i=0;i<n;i++)
		{
			//every value compares with next value to last value
			for(int j=i+1;j<n;j++)
			{
				int temp1=x.get(i);
				int temp2=x.get(j);
				if(temp1==temp2)
				{
					x.remove(j); //remove value and deallocate that value's memory
					n--; //decrease size
				}
			}
		}
		System.out.println(x);
	}
}
