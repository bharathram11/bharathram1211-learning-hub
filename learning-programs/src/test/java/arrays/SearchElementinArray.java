package arrays;

import java.util.Arrays;

public class SearchElementinArray {

	public static void main(String[] args) {
		//linear search elements no need to be in sorted order
		/*int arr[]= {12,34,56,78,44,33};
		int search_ele=34;
		int flag=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==search_ele)
			{
				System.out.println("element found at:"+i);
				flag=1;
				break;
			}
		}
		if(flag==0)
		System.out.println("element not found");*/
   
		//binary search elements need to be in sorted order
		//no need to compare each value compare with mid value and eliminate remaining
		int arr[]= {12,34,56,78,44,33};
		Arrays.sort(arr);
		int key=56;
		int l=0;
		int h=arr.length-1;
		int flag=0;
		while(l<=h)     
		{
			int m=(l+h)/2;  
			if(arr[m]==key)   
			{
				System.out.println("element found..");
				flag=1;
				break;
			}
			if(arr[m]<key)
			{
				l=m+1;      
			}
			if(arr[m]>key)
			{
				h=m-1;
			}
		}
		if(flag==0)
		System.out.println("element not found..");
		//arrays.binarySearch()
		//System.out.println(Arrays.binarySearch(arr, 56));
	}

}
