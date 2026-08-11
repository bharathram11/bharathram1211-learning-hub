package collectionframework;

import java.util.LinkedList;
import java.util.Iterator;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Object> linkedList = new LinkedList<>();
        
        // Adding elements
        linkedList.add(100);
        linkedList.add("welcome");
        linkedList.add("198h");
        linkedList.add(15.5);
        linkedList.add(true);
        linkedList.add(null);
        System.out.println("Initial List: " + linkedList);
        System.out.println("Size: " + linkedList.size());
        
        // Removing elements
        linkedList.remove(null);
        System.out.println("After removing null: " + linkedList);
        linkedList.remove(2);
        System.out.println("After removing index 2: " + linkedList);
        
        // Adding at specific index
        linkedList.add(3, "ravi");
        System.out.println("After adding at index 3: " + linkedList);
        
        // Accessing and updating elements
        System.out.println("Element at index 2: " + linkedList.get(2));
        linkedList.set(3, "seven");
        System.out.println("After updating index 3: " + linkedList);
        
        // Checking properties
        System.out.println("Contains 'seven': " + linkedList.contains("seven"));
        System.out.println("Is empty: " + linkedList.isEmpty());
        
        // Iterating through the list
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.print(linkedList.get(i) + " ");
        }
        
        System.out.println("\n\nUsing enhanced for loop:");
        for (Object element : linkedList) {
            System.out.print(element + " ");
        }
        
        System.out.println("\n\nUsing Iterator:");
        Iterator<Object> it = linkedList.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
    }
}
