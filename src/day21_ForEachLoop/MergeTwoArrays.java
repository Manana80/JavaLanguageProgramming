package day21_ForEachLoop;

import java.util.Arrays;

/**
 *An Interview Task:
 *  write a program that can merge two arrays of integers
 *         Ex:
 *             arr1 = {1,2,3,4}
 *             arr2 = {5,6}
 *
 *         output
 *             arr3 = {1,2,3,4,5,6}
 */

public class MergeTwoArrays {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4};
        int[] arr2 = {5,6};
        // first we need to create a third
        int[] arr3 = new int[arr1.length+arr2.length];


        int count = 0;  //Represents the index number of the new array.
        for (int i = 0; i < arr1.length; i++) {
            arr3[i]=arr1[i];
            count++;                          // until here, count == i; then we use count as index number for the new array.
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[count++]= arr2[j];

        }

        for (int i = 0; i <arr3.length ; i++) {
            System.out.print(arr3[i]+" ");
        }



    }
}
