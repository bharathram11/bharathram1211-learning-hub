package javaExcercises;

public class Program87
{
	public static void main(String[] args)
	{
		//Java implementation of recursive Binary Search
		//Array values should be in sorted order
		int a[]={20, 30, 40, 60, 78, 90, 112, 225, 345, 440, 522, 678, 765, 800, 889,999}; 
		int x=30; //value to be searched
		int l=0;
		int h=a.length-1;
		int res=-1;
		while(h>=l) //loop
		{
			int mid=(l+h)/2;
			// If the element is present at the middle itself
			if(a[mid]==x)
			{
				res=mid;
				break; //stop loop
			}
			// If element is smaller than mid, then it can only be present in left sub array
			if(x<a[mid])
			{
				h=mid-1;
			}
			// Else the element can only be present in right sub array
			else
			{
				l=mid+1;
			}
		}
		if(res==-1)
		{
			System.out.println("Element not present");
		}
		else
		{
			System.out.println("Element found at index "+res);
		}
	}
}
