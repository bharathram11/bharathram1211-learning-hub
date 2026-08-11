package arrays;
import java.util.*;
import java.util.stream.Collectors;

public class MapSortByValue {
    public static void main(String[] args) {
        // Sample map
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 1);
        map.put("Cherry", 2);

        // Convert map to list of entries
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        // Sort the list by value
        entryList.sort(Map.Entry.comparingByValue());

        // Rebuild the map from the sorted list (optional)
        Map<String, Integer> sortedMap = entryList.stream()
            .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        // Print the sorted map
        System.out.println(sortedMap);
    }
}
