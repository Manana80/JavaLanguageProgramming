package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
Interview Question
Write a program that can return the nth largest number from an arraylist
arraylist = {1,2,3,4,5,6,7,8,8};
n = 3;
output = 6;
Note: you are not allowed to use the sort method.
 */
public class ReturnTheNthLargerstNumber {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8,8));
        int n = 3;
        for (int i = 1; i < n; i++) {
            list.removeIf(p -> Collections.max(list)==p);
        }
        int max = Collections.max(list);
        System.out.println(max);

    }
}
