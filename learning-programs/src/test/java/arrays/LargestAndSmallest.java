package arrays;

import java.util.Scanner;

public class LargestAndSmallest
{
	public static void main(String[] args)
	{
		int[] array= {191,44,11,55,22,44,59,25,31};
		int largest=array[0];
		int smallest=array[0];
		
		for(int i=0;i<array.length;i++)
		{
			if(largest<array[i])
			{
			   largest=array[i];	
			}
			if(smallest>array[i])
			{
				smallest=array[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);
	}
}
