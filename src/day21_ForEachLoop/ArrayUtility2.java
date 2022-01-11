package day21_ForEachLoop;

import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        String [] students= {"Elif","Sinem","Gunay","Layan","Suhaib","Daniel","Cihad","Maria" };
        String [] earlyBirds= Arrays.copyOf(students,3); // we can assign a bigger number to the length of the new array.
        // the remaining indices will be assigned null.
        // it is not recommended creating an array that is longer than we need.
        // this method copies from the beginning to the length we desire.

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,2,3,4,5,6,7};
        numbers = Arrays.copyOf(numbers,5); // re-assign to the original variable i.e. it won't exist anymore.
        System.out.println(Arrays.toString(numbers));

        System.out.println("-----------------------------------------------------------------------");
        char [] ch1 = {'A','B', 'C','D','E','F','G','H','I'};
        char [] ch2 = Arrays.copyOfRange(ch1,2,6); // here we pass the index numbers , the last index is excluded
        System.out.println(Arrays.toString(ch2));

        int[]scores = {10,20,30,40,50,60,70,80,90,100};
        // index        0, 1, 2, 3, 4, 5, 6, 7, 8, 9

        int[]result = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(result));

        int[]result2 = Arrays.copyOfRange(scores,5,scores.length); // to get the last element
        System.out.println(Arrays.toString(result2));









    }
}
