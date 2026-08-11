package arrays;

import java.util.Arrays;

public class InsertElementIntoArrayPostion {
    public static void main(String[] args) {
        int a[] = {1, 3, 4, 5,99};  // Initial array
        int ele = 55;            // Element to insert
        int pos = 3;             // Position to insert the element (0-based index)
        System.out.println("Original array: " + Arrays.toString(a)); 
        // Create a new array of size one greater than the original array
        int b[] = new int[a.length + 1];
        // Copy elements before the position to array 'b'
        for (int i = 0; i < pos; i++) {
            b[i] = a[i];
        }
        // Insert the new element at the specified position
        b[pos] = ele;
        // Copy remaining elements from the original array to the new array 'b'
        for (int i = pos; i < a.length; i++) {
            b[i + 1] = a[i];
        }
        // Print the new array
        System.out.println("Array after insertion: " + Arrays.toString(b));
    }
}
