package collectionframework;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        // Create a HashSet of even numbers
        HashSet<Integer> evenNumbers = new HashSet<Integer>();
        evenNumbers.add(1);
        evenNumbers.add(3);
        evenNumbers.add(6);
        evenNumbers.add(4);
        System.out.println(evenNumbers); // Print evenNumbers set

        // Create another HashSet and add all elements from evenNumbers
        HashSet<Integer> allNumbers = new HashSet<Integer>();
        allNumbers.addAll(evenNumbers);
        allNumbers.add(10); // Add additional elements
        allNumbers.add(12);
        System.out.println(allNumbers); // Print allNumbers set

        // Remove all elements of evenNumbers from allNumbers
        allNumbers.removeAll(evenNumbers);
        System.out.println(allNumbers); // Print remaining elements in allNumbers

        // Remove a specific element
        allNumbers.remove(12);
        System.out.println(allNumbers); // Print final set
    }
}
