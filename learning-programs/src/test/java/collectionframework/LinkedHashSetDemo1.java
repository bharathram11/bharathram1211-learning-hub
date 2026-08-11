package collectionframework;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {
        // Create a LinkedHashSet with Integer type
        LinkedHashSet l = new LinkedHashSet<>();
        
        // Add elements to the LinkedHashSet
        l.add(100); // Insertion order is preserved
        l.add(102);
        l.add(101);
        l.add(103);
        l.add(109);
        l.add(100); // Duplicate entry, will be ignored

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + l); // Output: [100, 102, 101, 103, 109]
        
        // Check if a specific element exists
        System.out.println("Contains 102: " + l.contains(102)); // Output: true

        // Print the size of the LinkedHashSet
        System.out.println("Size: " + l.size()); // Output: 5

        // Iterate over the elements using a for-each loop
        System.out.print("Elements: ");
        for (Object num : l) {
            System.out.print(num + " ");
        }
        System.out.println(); // Output: 100 102 101 103 109

        // Clear the LinkedHashSet and check if it is empty
        l.clear();
        System.out.println("Is Empty: " + l.isEmpty()); // Output: true
    }
}
