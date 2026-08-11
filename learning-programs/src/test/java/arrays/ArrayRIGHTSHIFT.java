package arrays;
import java.util.Arrays;

public class ArrayRIGHTSHIFT {

	    public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 6, 7}; 
	        int n = 3; // Number of positions to rotate

	        // Handle cases where n is greater than the array length
	        n = n % arr.length;          //n=3

	        // Rotate the array in-place by shifting elements
	        for (int i = 0; i < n; i++)  //i=0,i=1,i = 2  ,here n will run only 3 times 
	        {
	            // Store the last element of the array
	            int last = arr[arr.length - 1];   //last=7,last=6,last=5

	            // Shift all the elements to the right by one position
	            for (int j = arr.length - 1; j > 0; j--)
	            {
	                arr[j] = arr[j - 1];    //Array after the shift: [1, 1, 2, 3, 4, 5, 6], [7, 7, 1, 2, 3, 4, 5],[6, 6, 7, 1, 2, 3, 4]
	            }

	            // Place the last element in the first position
	            arr[0] = last;//Array after the first rotation: [7, 1, 2, 3, 4, 5, 6],[6, 7, 1, 2, 3, 4, 5],[5, 6, 7, 1, 2, 3, 4]
	        }

	        // Print the rotated array
	        System.out.println("Rotated Array: " + Arrays.toString(arr));
	    }
	}
