package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
	
    public static void main(String[] args) {
    	//boolean flag=false;
    	String arr[]= {"java","c#","python","java","c++","c#"};
    	HashSet<String> duplicates = new HashSet<>();
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i].equals(arr[j]))
    			{
    				duplicates.add(arr[i]);
    			}
    		}
    	}
    	for(String arr1:duplicates)
    	{
    		System.out.println(arr1);
    	}

    	/*String arr[]= {"java","c#","python","java","c++","c#"};
    	List<String>li=Arrays.asList(arr);
    	Set<String>set=new HashSet<String>(li);
    	System.out.println(set);*/
    	
    	/*String arr[] = {"java", "c#", "python", "java", "c++", "c#"};
    	Set<String> set = new HashSet<>(Arrays.asList(arr));
    	System.out.println(set);*/
    	
//    	int arr1[]= {1,3,4,3,5,3,6,5,67};
//    	//int flag1=0;
//    	HashSet<Integer> duplicates = new HashSet<>();
//    	for(int i=0;i<arr1.length;i++)
//    	{
//    		for(int j=i+1;j<arr1.length;j++)
//    		{
//    			if(arr1[i]==arr1[j])
//    			{
//    				duplicates.add(arr1[i]);
//    			}
//    		}
//
//    	}
//    	for(Integer arr:duplicates)
//    	{
//    		System.out.println(arr);
//    	}
    }
}