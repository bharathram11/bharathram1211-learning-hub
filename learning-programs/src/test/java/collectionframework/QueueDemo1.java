package collectionframework;

import java.util.PriorityQueue;
import java.util.Iterator;

public class QueueDemo1 {
    public static void main(String[] args) {
        // Create a PriorityQueue with String type
        PriorityQueue  p = new PriorityQueue<>();

        // Add elements to the queue
        p.add("A");  // Adds "A" to the queue
        p.add("B");  // Adds "B" to the queue
        p.offer("C"); // Adds "C" to the queue
        p.offer("D"); // Adds "D" to the queue

        System.out.println("PriorityQueue: " + p); // [A, B, C, D]

        // Get the head element without removing it
        System.out.println("Head element (element()): " + p.element()); // Output: A (throws exception if empty)
        System.out.println("Head element (peek()): " + p.peek()); // Output: A (returns null if empty)

        // Retrieve and remove the head element
        System.out.println("Removed element (remove()): " + p.remove()); // Output: A
        System.out.println("PriorityQueue after remove(): " + p); // [B, D, C]

        System.out.println("Removed element (poll()): " + p.poll()); // Output: B
        System.out.println("PriorityQueue after poll(): " + p); // [C, D]

        // Check the size of the queue
        System.out.println("Queue size: " + p.size()); // Output: 2

        // Iterate using a for-each loop
        System.out.print("Elements in queue: ");
        for (Object element:p) {
            System.out.print(element + " "); // Output: C D
        }
        System.out.println();

        // Poll elements until the queue is empty
        System.out.print("Polling elements: ");
        while (!p.isEmpty()) {
            System.out.print(p.poll() + " "); // Output: C D
        }
        System.out.println();

        // Check if the queue is empty
        System.out.println("Is queue empty? " + p.isEmpty()); // Output: true
    }
}
