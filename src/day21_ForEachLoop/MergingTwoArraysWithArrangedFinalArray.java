package day21_ForEachLoop;
// Merge two arrays into one array with its elements arranged in ascending order.
// This task is created by me
import java.util.Arrays;


public class MergingTwoArraysWithArrangedFinalArray {
    public static void main(String[] args) {


        int[] A = { 1, 5, 6, 7, 8, 10 };
        int[] B = { 2, 4, 9 };
        int j = A.length;

        int [] newArray =Arrays.copyOf(A, A.length+B.length);
        System.out.println(Arrays.toString(newArray));



        for (int i = 0; i < B.length; i++) {
            newArray[j]=B[i];
            j++;

        }
      Arrays.sort(newArray);
        System.out.println(Arrays.toString(newArray));


    }
}
