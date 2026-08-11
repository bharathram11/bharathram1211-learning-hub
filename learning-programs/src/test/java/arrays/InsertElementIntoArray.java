package arrays;

import java.util.Scanner;

public class InsertElementIntoArray {

    public static void main(String[] args) {
        // Initial array
        int[] a = {10, 12, 323, 444, 555, 666};

        // Display the initial array
        System.out.println("Original Array:");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Input element to insert
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the element to insert: ");
        int element = scanner.nextInt();

        // Create a new array with additional space
        int[] newArray = new int[a.length + 1];

        // Copy elements from the original array to the new array
        for (int i = 0; i < a.length; i++) {
            newArray[i] = a[i];
        }

        // Insert the new element at the last position (end of the array)
        newArray[a.length] = element;

        // Display the new array
        System.out.println("Array after insertion:");
        for (int i : newArray) {
            System.out.print(i + " ");
        }
    }
}
