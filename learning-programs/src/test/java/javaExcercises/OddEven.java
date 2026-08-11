
package javaExcercises;

import java.util.Arrays;

public class OddEven {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 6, 7, 8, 23, 44, 11, 90};
        int[] temp = new int[arr.length];
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2!=0)
        	{
        		temp[index++]=arr[i];
        	}
        }
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2==0)
        	{
        		temp[index++]=arr[i];
        	}
        }
        	
        System.out.println(Arrays.toString(temp));
    }
}

