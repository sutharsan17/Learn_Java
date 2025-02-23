package Hashmap_practice;

import java.util.*;

public class findkey {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ammu", 25);
        map.put("Sutharsan", 27);
        map.put("Ravi", 30);

        String keyToFind = "Sutharsan";
        if (map.containsKey(keyToFind)) {
            System.out.println(keyToFind + " found with value " + map.get(keyToFind));
        } else {
            System.out.println(keyToFind + " not found!");
        }
    }
}

