package collectionframework;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {
        // Create a HashSet to store elements
        HashSet hashSet = new HashSet<Object>();
        
        // Add elements to the HashSet
        hashSet.add(100); // Integer element
        hashSet.add("welcome"); // String element
        hashSet.add("ram");
        hashSet.add("thankyou");
        hashSet.add("for");
        hashSet.add("coming");
        
        // Print the HashSet (order is not maintained)
        System.out.println("HashSet Elements: " + hashSet);

        // Remove an element
        hashSet.remove("for");
        System.out.println("After Removing 'for': " + hashSet);

        // Check if specific elements exist in the HashSet
        System.out.println("Contains 'welcome': " + hashSet.contains("welcome")); // true
        System.out.println("Contains 'xys': " + hashSet.contains("xys")); // false

        // Check if the HashSet is empty
        System.out.println("Is HashSet Empty?: " + hashSet.isEmpty()); // false

        // Read data using a for-each loop
        System.out.print("Elements using for-each loop: ");
        for (Object element : hashSet) {
            System.out.print(element + ", ");
        }
        System.out.println();

        // Read data using an Iterator
        System.out.print("Elements using Iterator: ");
        Iterator<Object> iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();
    }
}
