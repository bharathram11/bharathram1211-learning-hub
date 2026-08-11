package javaExcercises;

public class Program89
{
	public static void main(String[] args)
	{
		//Java implementation of recursive Binary Search
		//Array values should be in sorted order
		int a[]={20, 30, 40, 60, 78, 90, 112, 225, 345, 440, 522, 678, 765, 800, 889,999}; 
		int n=a.length;
		int x=522; //value to be searched
		int res=binarySearch(a,0,n-1,x);
		if(res==-1)
		{
			System.out.println("Element not present");
		}
		else
		{
			System.out.println("Element found at index "+res);
		}
	}
	
	public static int binarySearch(int a[], int l, int h, int x)
	{
		if(h>=l) 
		{
			int mid=(l+h)/2;
			// If the element is present at the middle itself
			if(a[mid]==x)
			{
				return(mid);
			}
			//If element is smaller than mid, then it can only be present in left sub-array
			if(x<a[mid])
			{
				return(binarySearch(a,l,mid-1,x)); //calling itself
			}
			//Else the element can only be present in right sub-array
			else
			{
				return(binarySearch(a,mid+1,h,x)); //calling itself
			}
		}
		else
		{
			return(-1); //element not found(-1 is a general indicator)
		}
	}
}