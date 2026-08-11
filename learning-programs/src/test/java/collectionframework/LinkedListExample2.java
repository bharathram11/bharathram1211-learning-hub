package collectionframework;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample2 {
    public static void main(String[] args) {
        // Create and initialize LinkedList
        LinkedList<Integer> l = new LinkedList<>();
        l.add(100);
        l.add(102);
        l.add(101);
        l.add(103);
        l.add(109);
        l.add(111);
        
        System.out.println("Original List: " + l);
        
        // Copying elements to another list
        LinkedList<Integer> m = new LinkedList<>();
        m.addAll(l);
        System.out.println("Copied List: " + m);
        
        // Removing all elements from the copied list
        m.removeAll(l);
        System.out.println("Copied List after removeAll: " + m);
        
        // Sorting in ascending order
        Collections.sort(l);
        System.out.println("Sorted List (Ascending): " + l);
        
        // Sorting in descending order
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("Sorted List (Descending): " + l);
        
        // Shuffling the list
        Collections.shuffle(l);
        System.out.println("List after Shuffling: " + l);
        
        // LinkedList-specific operations
        l.addFirst(50);
        l.addLast(200);
        System.out.println("After addFirst(50) and addLast(200): " + l);
        
        l.removeFirst();
        l.removeLast();
        System.out.println("After removeFirst() and removeLast(): " + l);
    }
}
