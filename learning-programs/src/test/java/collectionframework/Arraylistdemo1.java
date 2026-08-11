package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistdemo1 {
    public static void main(String[] args) {
        // Define an ArrayList with a generic type
        ArrayList al = new ArrayList();

        al.add("123");
        al.add("345");
        al.add("234");
        al.add(123); // Integer
        al.add("ramu");

        System.out.println("Print all: " + al);
        System.out.println("Size: " + al.size());

        // Remove element by index
        al.remove(1);
        System.out.println("After removing by index: " + al);

        // Remove element by value
        al.remove("234");
        System.out.println("After removing by value: " + al);

        // Add an element at a specific index
        al.add(1, "1111");
        System.out.println("After adding at a specific index: " + al);

        // Retrieve specific value
        System.out.println("Retrieving specific value: " + al.get(2));

        // Replace an element
        al.set(1, "12345");
        System.out.println("After replacing value: " + al);

        // Check if a value exists
        System.out.println("Contains '12345': " + al.contains("12345"));

        // Check if the list is empty
        System.out.println("Is empty: " + al.isEmpty());

        // Iterate using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }
        System.out.println();

        // Iterate using a for-each loop
        System.out.println("Using for-each loop:");
        for (Object a : al) {
            System.out.print(a + " ");
        }
        System.out.println();

        // Iterate using an iterator
        System.out.println("Using Iterator:");
        Iterator it = al.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
