package arrays;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfAnInteger {
    public static void main(String[] args) {
        int[] array = {11, 44, 11, 55, 22, 44, 59, 25, 31};

        // Create a HashMap to store the frequency of each integer
        Map<Integer, Integer> mp = new HashMap<>();

        // Iterate through the array to count occurrences
        for (int num : array) {
            // If the number is already in the map, increment its value
            if (mp.containsKey(num)) {
                mp.put(num, mp.get(num) + 1);
            } else {
                // If the number is not in the map, add it with a count of 1
                mp.put(num, 1);
            }
        }
        System.out.println(mp);
        System.out.println(mp.keySet());
        // Print the occurrences of each number
//        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//            System.out.println("Number " + entry.getKey() + " occurs " + entry.getValue() + " time(s).");
//        }
    }
}
