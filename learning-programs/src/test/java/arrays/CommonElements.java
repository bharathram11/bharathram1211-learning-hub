package arrays;

import java.util.*;

public class CommonElements {
    public static void main(String[] args) {
        // Sample arrays
        int[] array1 = {1, 2, 5, 7, 8};
        int[] array2 = {2, 3, 5, 6, 7};

        // Convert array1 to a set for efficient lookup
        Set<Integer> set = new HashSet<>();
        for (int num : array1) {
            set.add(num);
        }

        // List to store common elements
        List<Integer> commonElements = new ArrayList<>();

        // Iterate through array2 and find common elements
        for (int num : array2) {
            if (set.contains(num)) {
                commonElements.add(num);
            }
        }

        // Print the common elements
        System.out.println("Common elements: " + commonElements);
    }
}
