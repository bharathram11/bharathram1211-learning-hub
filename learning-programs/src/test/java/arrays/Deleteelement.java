package arrays;

import java.util.*;

public class Deleteelement {
    public static void main(String[] args) {
//        Integer[] arr = {1, 2, 3, 4, 5};
//        
//        // Convert array to List
//        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
//        
//        // Remove element (value 3)
//        list.remove(Integer.valueOf(3));
//        
//        System.out.println(list);  // Output: [1, 2, 4, 5]
    	
    	int a[]= {1,2,3,4};
    	Scanner sc=new Scanner(System.in);
    	System.out.println("enter the number to be deleted");
    	int num=sc.nextInt();
    	int arr[]=new int[a.length-1];//creating a new array with original array-1 size
    	for(int i=0,j=0;i<a.length;i++)  //i =index of original array j=index for the new array arr
    	{
    		if(a[i]!=num)  
    		{
    			arr[j]=a[i];//if a[i] is not equal to num, the element is copied to the new array arr[j].
    			j++;
    		}
    	}
    	System.out.println(Arrays.toString(arr));
    }
}
