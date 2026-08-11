package collectionframework;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {
        // Create the first HashSet (set1)
        HashSet<Integer> set1 = new HashSet<Integer>();
        set1.add(1);
        set1.add(3);
        set1.add(6);
        set1.add(4);
        set1.add(12);
        System.out.println("Set1: " + set1); // [1, 3, 4, 6, 12]

        // Create the second HashSet (set2)
        HashSet<Integer> set2 = new HashSet<Integer>();
        set2.add(4);
        set2.add(3);
        set2.add(5);
        set2.add(7);
        set2.add(15);
        System.out.println("Set2: " + set2); // [3, 4, 5, 7, 15]

        // Union: Add all elements from set2 to set1 (only distinct elements are added)
        set1.addAll(set2);
        System.out.println("Union of Set1 and Set2: " + set1); // [1, 3, 4, 5, 6, 7, 12, 15]

        // Intersection: Retain only common elements between set1 and set2
        set2.retainAll(set1);
        System.out.println("Intersection of Set1 and Set2: " + set2); // [3, 4, 5, 7, 15]

        // Difference: Remove all elements of set2 from set1
        set1.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + set1); // [1, 6, 12]

        // Check if set2 is a subset of set1
        System.out.println("Is Set2 a subset of Set1? " + set1.containsAll(set2)); // false
    }
}
