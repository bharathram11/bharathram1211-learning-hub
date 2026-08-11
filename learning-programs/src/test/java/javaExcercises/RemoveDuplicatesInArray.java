package javaExcercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoveDuplicatesInArray {

    public static void main(String[] args) {
       int[] a = {11, 22, 33, 44, 55, 66, 77, 44};
        Map<Integer,Integer>mp=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++) //0(1s char) to length-1(last char)
		{
			if(mp.containsKey(a[i])) //character already inserted into hash map
			{
				mp.put(a[i],mp.get(a[i])+1); //update existing entry
			}
			else
			{
				mp.put(a[i],1);  //insert new entry
			}
		}
        System.out.println(mp);
		System.out.println("Count of distinct chars is "+mp.keySet().size());
		//Find duplicated chars in all inserted distinct chars in hash map
		int count=0;
		for(int c:mp.keySet()) 
		{
			if(mp.get(c)>1)
			{
				System.out.println(c+" occured "+mp.get(c));
				count++;
			}
		}
		System.out.println("Count of duplicated chars is "+count);
		// Create a new array for unique elements
        int[] result = new int[mp.size()];
        int index = 0;

        // Add unique elements from the map to the result array
        for (int c : mp.keySet()) {
            result[index++] = c;
        }

        // Display the array after removing duplicates
        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}
