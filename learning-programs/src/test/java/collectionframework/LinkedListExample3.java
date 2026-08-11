package collectionframework;

import java.util.LinkedList;

public class LinkedListExample3 {
    public static void main(String[] args) {
        LinkedList<Integer> l = new LinkedList<>();
        
        // Adding elements to the list
        l.add(100);
        l.add(102);
        l.add(101);
        l.add(103);
        l.add(109);
        l.add(111);
        System.out.println("Initial List: " + l);
        
        // Adding elements at the beginning and end
        l.addFirst(121);
        l.addLast(1111);
        System.out.println("After addFirst(121) and addLast(1111): " + l);
        
        // Retrieving first and last elements
        System.out.println("First Element: " + l.getFirst());
        System.out.println("Last Element: " + l.getLast());
        
        // Removing first and last elements
        l.removeFirst();
        l.removeLast();
        System.out.println("After removeFirst() and removeLast(): " + l);
        
        // Using safer methods for first and last elements
        System.out.println("First Element using peekFirst(): " + l.peekFirst());
        System.out.println("Last Element using peekLast(): " + l.peekLast());
        
        // Checking if the list is empty before removing elements
        if (!l.isEmpty()) {
            System.out.println("Removing first and last elements safely:");
            System.out.println("Removed First: " + l.pollFirst());
            System.out.println("Removed Last: " + l.pollLast());
        } else {
            System.out.println("List is empty; no elements to remove.");
        }
        
        // Final list
        System.out.println("Final List: " + l);
    }
}
