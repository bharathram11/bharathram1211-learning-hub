package collectionframework;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
public class HashMapdemo1 {
    public static void main(String[] args) {
        // Creating a HashMap with Integer keys and String values
    	 Hashtable<Integer, String> hm = new Hashtable<>();

         // Adding elements to the Hashtable
         hm.put(101, "David");
         hm.put(102, "Ramu");
         hm.put(103, "Ravi");
         hm.put(104, "Abdul");
        
        // Adding a null key and a null value
        //hm.put(null, "Unknown");
        hm.put(105, "hhh");
        
        // Displaying the HashMap
        System.out.println("HashMap: " + hm); // {101=David, 102=Ramu, 103=Ravi, 104=Abdul, null=Unknown, 105=null}
        
        // Retrieving value for a key
        System.out.println("Value for key 102: " + hm.get(102)); // Ramu
        
        // Checking if the map contains a key or value
        System.out.println("Contains key 101: " + hm.containsKey(101)); // true
        System.out.println("Contains value 'Unknown': " + hm.containsValue("Unknown")); // true
        
        // Removing a key-value pair
        hm.remove(104); // Removes key 104
        System.out.println("HashMap after removal: " + hm); // {101=David, 102=Ramu, 103=Ravi, null=Unknown, 105=null}
        
        // Iterating through the map using keySet() and get()
        System.out.println("Iterating through keySet():");
        for (Object key : hm.keySet()) {
            System.out.println(key + " => " + hm.get(key));
        }
        
        // Iterating through entries using entrySet()
        System.out.println("Iterating through entrySet():");
        for (Map.Entry entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
        
        // Using Iterator to iterate through entries
        System.out.println("Iterating using Iterator:");
        Set<Map.Entry<Integer, String>> entrySet = hm.entrySet();
        Iterator<Map.Entry<Integer, String>> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry<Integer, String> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
