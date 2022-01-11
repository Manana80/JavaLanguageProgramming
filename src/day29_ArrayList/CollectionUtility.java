package day29_ArrayList;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionUtility {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));
        Collections.sort(list);// sorts the list in an ascending order
        System.out.println(list);

        System.out.println("------------------------------------------");

        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A','B','C','D','E'));
        System.out.println(list2);
        Collections.reverse(list2); // reverse(list): reverse the list
        System.out.println(list2);

        System.out.println("--------------------------------------------");
        ArrayList<Integer>list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3, 2,5);
        System.out.println(list3);
        int max = Collections.max(list3);  //max(list): returns the maximum number
        System.out.println("max = " + max);
        int min = Collections.min(list3); //min(list): returns the minimum number
        System.out.println("min = " + min);

        System.out.println("----------------------------------------------");

        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list4,10,1000);
        System.out.println(list4);
        boolean b8 = Collections.replaceAll(list4,1000,100);
        System.out.println(b8);


        //swap(list, index1, index2): swaps the elements at the given indices.
        Collections.swap(list4,0,4);
        System.out.println(list4);


        System.out.println("---------------------------------------------");

       int frequency= Collections.frequency(list4,1000);
       //frequency(list,element): returns the frequency of the element from the list.
        System.out.println("frequency = " + frequency);

        ArrayList<String>words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","Python","Python","C#","Ruby"));
        int countJava = Collections.frequency(words,"Java");
        int countPython = Collections.frequency(words,"Python");
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);







    }
}
