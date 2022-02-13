package InterviewTasksCydeo;

import java.util.Arrays;

/*
Write a method to combine 2 arrays;
Ex: arr1 = {1,2,3} and arr2={4,5,6}
output = {1,2,3,4,5,6}
 */
public class CombineTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5, 6, 7, 1000};
        int[] arr2 = {8, 4, 10, 22, 1, 9, 298};
        int[] arr3 = combineTwoArrays(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }


    public static int[] combineTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3 = new int[arr1.length + arr2.length];
        int index = 0;

        for (int i : arr1) {
            arr3[index++] = i;
        }
        for (int i : arr2) {
            arr3[index++] = i;
        }
        return arr3;


    }
}