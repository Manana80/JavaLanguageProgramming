package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

/*
1. Create an Array of strin called countries
2. Write a program that can remove all the country names that have lenght of 10 or greater
 */
public class ArrayListPractice {
    public static void main(String[] args) {
        String [] countries = {"Japan", "korea", "united States", "Turkey", "United Kingdom", "Canada"};
        // converting an Array to ArrayList
        ArrayList<String>list = new ArrayList<>(Arrays.asList(countries));
        list.removeIf(p -> p.length()>=10);
        // converting ArrayList back to Array
       countries= list.toArray(new String[0]);
        System.out.println(Arrays.toString(countries));
    }
}
