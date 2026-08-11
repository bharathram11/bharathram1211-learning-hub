package collectionframework;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistdemo2 {
    public static void main(String[] args) {
        // Define an ArrayList with generics for type safety
        ArrayList<String> al = new ArrayList<>();
        al.add("x");
        al.add("a");
        al.add("n");
        al.add("s");

        // Duplicate the list
        ArrayList<String> dup = new ArrayList<>();
        dup.addAll(al);

        System.out.println("Original list: " + dup); // [x, a, n, s]

        // Remove all elements in 'al' from 'dup'
        dup.removeAll(al);
        System.out.println("After removeAll: " + dup); // []

        // Sort in ascending order
        Collections.sort(al);
        System.out.println("Sorted in ascending order: " + al); // [a, n, s, x]

        // Sort in descending order
        Collections.sort(al, Collections.reverseOrder());
        System.out.println("Sorted in descending order: " + al); // [x, s, n, a]

        // Shuffle the list randomly
        Collections.shuffle(al);
        System.out.println("After shuffling: " + al); // Randomized order
    }
}
