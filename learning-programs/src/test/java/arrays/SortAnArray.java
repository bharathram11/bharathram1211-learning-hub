/*package arrays;

import java.util.Arrays;  // Import Arrays class for sorting

public class SortAnArray {

    public static void main(String[] args) {
        
        int[] array = {11, 44, 11, 55, 22, 44, 59, 25, 31};
        
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Print the sorted array
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}*/
/*package arrays;

import java.util.Arrays;  // Import Arrays class for sorting

public class SortAnArray {

    public static void main(String[] args) {
        
        int[] array = {11, 44, 11, 55, 22, 44, 59, 25, 31};
        
        // Sort the array in ascending order
        Arrays.sort(array);
        
        // Print the sorted array in descending order
        for(int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}*///without using inbuilt methods
package arrays;

import java.util.Arrays;
import java.util.Collections;

public class SortAnArray {

    public static void main(String[] args) {
        
        int[] array = {11, 44, 11, 55, 22, 44, 59, 25, 31};
        for(int i=0;i<array.length-1;i++)
        {
        	for(int j=0;j<array.length-1;j++)
        	{
        		if(array[j]>array[j+1])
        		{
        			int temp=array[j];
        			array[j]=array[j+1];
        			array[j+1]=temp;
        		}
        	}
        }
        //print the array after sorting
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
        
        //approach 2 built in methods
        /*Arrays.parallelSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
        /*Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }*/
        /*Integer array1[]= {11, 44, 11, 55, 22, 44, 59, 25, 31};
        Arrays.sort(array1,Collections.reverseOrder());
        System.out.println("array elements after sorting:"+Arrays.toString(array1));*/
    }
}
