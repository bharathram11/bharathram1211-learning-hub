package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
    	int arr[]= {33,44,55,66,22,11};
    	int max=arr[0];
    	int min=arr[0];
    	for(int i=1;i<arr.length;i++)
    	{
    		if(max<arr[i])
    		{
    			max=arr[i];
    		}
    		else
    		{
    			min=arr[i];
    		}
    	}
    	System.out.println("print max "+max);
    	System.out.println("print min "+min);
    	
    }
}
