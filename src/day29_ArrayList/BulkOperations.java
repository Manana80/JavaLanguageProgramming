package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,3,5,8));
        //addAll(collection type): adds all the given collection of values to the ArrayList.
        //Arrays.asList is a special method from the Array.utility class that is capable of converting an Array of value to a collection type as list.
        System.out.println(list);
        //removeAll(CollectionType): removes all the matching values from the ArrayList. returns shorter ArrayList.
        list.removeAll(Arrays.asList(3,5,8));
        System.out.println(list);
        System.out.println("---------------------------------------------------------------");

        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,100,200,300,800,900));
        //retainAll(CollectionType): removes all the un-matching values from the ArrayList (keeps the matching values only). returns shorter ArrayList
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        System.out.println("--------------------------------------------------------------");
        ArrayList<String>jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","SDET","Developer","QA","SDET","Scrum Master", "BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","SDET"));
        System.out.println(jobTitles);

        System.out.println("-----------------------------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r1 = nums.contains(10);
        //containsAll(collectionType): checks if the ArrayList contains all the given collection of values, return type is boolean.
        boolean r2 = nums.contains(2) && nums.contains(5) && nums.contains(10);
        System.out.println(r2);
        //Or we can use:
        boolean r3 = nums.containsAll(Arrays.asList(2,5,10));
        System.out.println(r3);

        System.out.println("------------------------------------------------------------------");

        // how to convert an array to array list?
        String[] names = {"Josh", "Jack", "Daniel", "Shay", "breanna"};
/*
         ArrayList<String> namesList = new ArrayList<>();
        namesList.addAll(Arrays.asList(names));
        System.out.println(namesList);


 */
        // Another way (easier)
        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names)); // add the array in the constructor of the ArrayList
        System.out.println(namesList);

        System.out.println("-------------------------------------------------------------");
        int[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list2 = new ArrayList<>();
        // we cannot add the array with primitive elements like the previous way. (i.e. addaslist method)
        // but if we have Integer[] we can do it
        // if we have an array with primitive values then we need to do our own custome method to convert it to ArrayList

        System.out.println("---------------------------------------------------------------------------------------");
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
        ArrayList <Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println(list3);












    }
    
    public static ArrayList<Integer> convertArrayToArrayList (int[]array){
        ArrayList<Integer>list = new ArrayList<>();
        for (int each : array) {
           list.add(each);
        }
        return list;
    }
    
    
    
    
    
    
    
}
