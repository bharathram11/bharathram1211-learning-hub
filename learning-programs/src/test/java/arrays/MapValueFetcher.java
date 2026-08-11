package arrays;

import java.util.HashMap;
import java.util.Map;

public class MapValueFetcher {
    public static void main(String[] args) {
        // Create a Map and add some key-value pairs
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        // Define the key you want to fetch the value for
        String key = "Banana";

        // Fetch the value using the get() method
        Integer value = map.get(key);

        // Check if the key exists in the map
        if (value != null) {
            System.out.println("The value for key '" + key + "' is: " + value);
        } else {
            System.out.println("Key '" + key + "' not found in the map.");
        }
    }
}

