package exceptn;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // 1. Creating a HashMap
        HashMap<Integer, String> map = new HashMap<>();

        // 2. Adding key-value pairs
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // 3. Accessing a value using a key
        System.out.println("Value for key 2: " + map.get(2));

        // 4. Checking if a key exists
        System.out.println("Contains key 3? " + map.containsKey(3));

        // 5. Checking if a value exists
        System.out.println("Contains value 'Grapes'? " + map.containsValue("Grapes"));

        // 6. Iterating through HashMap using keySet
        System.out.println("Iterating through keys:");
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // 7. Iterating through HashMap using entrySet
        System.out.println("Iterating through key-value pairs:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // 8. Removing a key-value pair
        map.remove(1);
        System.out.println("After removing key 1: " + map);

        // 9. Updating a value
        map.put(2, "Blueberry");
        System.out.println("After updating key 2: " + map);

        // 10. Getting the size of the HashMap
        System.out.println("Size of HashMap: " + map.size());

        // 11. Checking if HashMap is empty
        System.out.println("Is HashMap empty? " + map.isEmpty());

        // 12. Clearing the HashMap
        map.clear();
        System.out.println("After clearing: " + map);
    }
}
