package Day51_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        // student name and score of the student

        Map<String, Integer> students = new LinkedHashMap<>();
        // it is better to use the String username as the key since it has a lower chance of being duplicated

        students.put("Aygun",85);
        students.put("Maria",86);
        students.put("Layan",100);
        students.put("Serkan",97);
        students.put("Ali",95);
        students.put("Kristina",95);
        students.put("Ali",75);
        students.put("Ali",90); // duplicated keys won't be accepted , so whatever added last it will replace the previous one
        students.put("Zainab",100);

        System.out.println(students);
        System.out.println(students.size()); // it will get us the total number of pairs in the map

        // display the score of Alex:
        System.out.println(students.get(95)); // it will return null, because we have to provide the key not the value
        System.out.println(students.get("Layan")); // this method retruns the value of the given key

        // replace Zainab' score to 99
        // replaces the value of the given key with the new given value
        students.replace("Zainab",99);
        System.out.println(students);

        students.remove("Serkan"); // both keys and values will be removed simultaneously
        System.out.println(students.size());
        students.remove("Ali");
        System.out.println(students.size());
        System.out.println(students);
        // remove method , will remove the pair (key and value) by providing either the key or both of them. it will result in a shorter map

        boolean r1 = students.containsKey("Muhtar");
        boolean r2 = students.containsKey("Layan");
        System.out.println(r2);
        System.out.println(r1);
        // containsKey() is to verify the presence of the given key in the map

        // containsValue() is to verify the presence of the given value in the map
        boolean r3 = students.containsValue(100);
        boolean r4 = students.containsValue(50);
        System.out.println(r3);
        System.out.println(r4);

        System.out.println(students.isEmpty());
        // it will only return true when the map has no pairs at all

        System.out.println("-----------------------------------------------------------");
        Map<String,Integer> map1 = new HashMap<>();
        map1.putAll(students);
        Map<String,Integer> map2 = new HashMap<>();
        map2.putAll(students);

        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);
        System.out.println(map1.equals(map2)); // we cannot use == to compare since those two maps are two different objects


        map1.clear();
        map2.clear();
        System.out.println(map1);
        System.out.println(map2);
        System.out.println(map1.isEmpty());

        // create a map that contains group ID and names group members
        Map<Integer, List<String>> map = new HashMap<>(); // it is allowed to put the value as a data structure



    }
}
