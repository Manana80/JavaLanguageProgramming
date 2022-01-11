package day21_ForEachLoop;


import java.util.Arrays;

/**
 *  *An Interview Task:
 *  *  write a program that can merge two arrays of integers
 *  *         Ex:
 *  *             arr1 = {1,2,3,4}
 *  *             arr2 = {5,6}
 *  *
 *  *         output
 *  *             arr3 = {1,2,3,4,5,6}
 *  */

public class MergeTwoArraysMuhtar {
      public static void main(String[] args) {
       String[] group1 = {"Ali", "Layan", "Aysenur"};   // 3
       String[] group2 = {"Maria", "Aygun", "Duygu", "Suat","Valeriy"}; //5
       // first we need to create a third array that is capable enough to hold all the elements in those arrays.
       String[] students = new String[group1.length + group2.length]; //8

          int i = 0; // represents the index numbers of the new array

          // we need to create an independent loop for each array.

          for (String each : group1) {
             students[i++] = each; // post increment because we want the value zero as well

          }

          for (String each : group2) {
              students[i++] = each;

          }

          System.out.println(Arrays.toString(students));

          System.out.println("---------------------------------------------");
          char[] ch1 = {'A','B','C'};
          char[] ch2 = {'D','E','F','G','H'};

          char[] chars = new char[ch1.length + ch2.length];

          int j = 0; // to represents the index numbers of the new array

          for (char c : ch1) {
              chars[j++] = c;
              // we can also write it like chars [j] =c , next line j++,
          }
          for (char c : ch2) {
              chars[j++] = c;
          }
          System.out.println(Arrays.toString(chars));
      }
}
