package Day51_Map;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        //    Key     Value
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(10, "Arthur");
        hashMap.put(20, "George");
        hashMap.put(3, "Jack");
        hashMap.put(40, "Emma");
        hashMap.put(5, "Ahmet");
        hashMap.put(5, "Isabella"); // only this one will be kept , since hashmap doens't accept duplicated key , so only the
        // last one added will be kept
        hashMap.put(6, "Ahmet");
        hashMap.put(null, "cihad");
        hashMap.put(null, "Hulya");
        hashMap.put(null, "Layan");
        hashMap.put(12, null); // we can have multiple null values in the map but only one null key in the map
        hashMap.put(55, null);
        hashMap.put(90, null);


        System.out.println("hashMap = " + hashMap);

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(10, "Arthur");
        linkedHashMap.put(20, "George");
        linkedHashMap.put(3, "Jack");
        linkedHashMap.put(40, "Emma");
        linkedHashMap.put(5, "Ahmet");
        linkedHashMap.put(5, "Isabella");
        linkedHashMap.put(null, "Layan");
        linkedHashMap.put(90, null);

        System.out.println("linkedHashMap = " + linkedHashMap);


        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(10, "Arthur");
        treeMap.put(20, "George");
        treeMap.put(3, "Jack");
        treeMap.put(40, "Emma");
        treeMap.put(5, "Ahmet");
        treeMap.put(5,"Isabella");
       // treeMap.put(null, "Hulya"); //it will give us nullPointerException
        // treeMap accepts null value but not null value


        System.out.println("treeMap = " + treeMap);


        Map<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "Arthur");
        hashtable.put(20, "George");
        hashtable.put(3, "Jack");
        hashtable.put(40, "Emma");
        hashtable.put(5, "Ahmet");
        hashtable.put(5,"Isabella");
        //  hashtable.put(null, "Hulya");

        System.out.println("hashtable = " + hashtable);

        String str = null;
        // if we want to access any method or value of the object we will get null pointer Exception

    }
}
/*
HashMap and LinkedHashMap they only stores the elements you gave, they do not touch the fields or methods of the
elements you are storing, but TreeMap and Hashtable they do access the fields and methods of the object you are storing,
therefore if the object you are adding into TreeMap or Hashtable is null, then when TreeMap/Hashtable trying to
access the fields/methods of those elements then it gets null pointer exception
 */