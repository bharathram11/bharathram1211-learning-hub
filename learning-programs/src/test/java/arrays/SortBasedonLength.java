package arrays;

import java.util.Arrays;

public class SortBasedonLength {
    public static void main(String[] args) {
        String arr[] = {"Jithin", "Arunima", "Akhil", "Matthew", "Benjamin"};
        // Bubble Sort based on string length
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j].length() > arr[j + 1].length()) {
                    // Swap the elements
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // Printing the sorted array
        System.out.println(Arrays.toString(arr));
    }
}
