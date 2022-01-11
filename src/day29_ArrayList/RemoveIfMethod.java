package day29_ArrayList;

import utilities.StringUtility;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

/*
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)%2!=0){
              //  list.remove(i);   if we used it this way , it won't be able to remove all the odd numbers since the i keeps changing
                // remember collection has a dynamic size, so when an element is removed the index numbers of the rest will change.
                // here we use the removeIf()

 */
        System.out.println(list);

        //remove all elements that are less than 5
        /*
        removeIf(Predicate): removes all the elements from the ArrayList that are matching with the given predicate condition.
         */

        list.removeIf(p -> p<5 );     // it implicitly uses "Iterable interface"  used to remove objects from any collection type.
         // p is represented by each element in the list
        // - > means lambda expression (reserved in Java for all Lambda Expressions)
        System.out.println(list);

        System.out.println("------------------------------------------------------------------");
        ArrayList<Integer>list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        //remove all the even numbers
        list2.removeIf(p -> p%2==0);
        System.out.println(list2);

        System.out.println("--------------------------------------------------------------------");
        ArrayList<String>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Python", "JavaScript", "C#", "C++","Java","Java"));
        // remove all elements that start with J.
        list3.removeIf(p -> p.startsWith("J"));
        System.out.println(list3);

        System.out.println("--------------------------------------------------------------------");

        ArrayList<String>names= new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar", "Level", "Eye", "C++","Java","Python"));
        names.removeIf(name -> !StringUtility.isPalindrom(name)); // to keep the palindrome
        System.out.println(names);







            }
        }









