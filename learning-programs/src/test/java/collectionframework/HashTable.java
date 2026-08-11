package collectionframework;

import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public static void main(String[] args) {
        // Creating a Hashtable with Integer keys and String values
        Hashtable<Integer, String> t = new Hashtable<Integer, String>(); // Default capacity 11 and load factor 0.75
        
        // Adding elements to the Hashtable
        t.put(101, "pnr");
        t.put(102, "ece");
        t.put(103, "cse");
        t.put(104, "mech");
        
        // Attempting to add null values will throw NullPointerException
        // t.put(null, 101); // Uncommenting this will throw a NullPointerException
        // t.put(105, null); // Uncommenting this will throw a NullPointerException
        
        // Display the entire Hashtable
        System.out.println(t); // Output: {104=mech, 103=cse, 102=ece, 101=pnr}
        
        // Retrieve value for a key
        System.out.println(t.get(101)); // Output: pnr
        
        // Retrieve value for a non-existent key, returns null
        System.out.println(t.get("cse")); // Output: null
        
        // Removing an entry based on key
        t.remove(101); // Removes key 101
        System.out.println(t); // Output: {104=mech, 103=cse, 102=ece}
        
        // Check if the Hashtable contains a specific key or value
        System.out.println(t.containsKey(102)); // Output: true
        System.out.println(t.containsValue("mech")); // Output: true
        System.out.println(t.isEmpty()); // Output: false
        
        // Display the keys in the Hashtable
        System.out.println(t.keySet()); // Output: [104, 103, 102]
        
        // Display the values in the Hashtable
        System.out.println(t.values()); // Output: [mech, cse, ece]
        
        // Iterating through the keys and values using keySet()
        System.out.println("Iterating using keySet():");
        for (Object k : t.keySet()) {
            System.out.println(k + "   " + t.get(k));
        }
        /* Output:
        104   mech
        103   cse
        102   ece
        */
        
        // Iterating through the entries using entrySet()
        System.out.println("Iterating using entrySet():");
        for (Map.Entry entry : t.entrySet()) {
            System.out.println(entry.getKey() + "   " + entry.getValue());
        }
        /* Output:
        104   mech
        103   cse
        102   ece
        */
    }
}
