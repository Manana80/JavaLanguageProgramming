package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class MergeTwoArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8};
        int[] arr3 = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

        System.out.println("----------------------------------------------------");


        double[] arr10 = {0.1, 1.2, 2.3, 3.4, 4.5, 5.6};
        double[] arr20 = {6.7, 7.8, 8.9};
        double[] arr30 = merge(arr10, arr20);
        System.out.println(Arrays.toString(arr30));

        System.out.println("----------------------------------------------------");

        char[] arr5 = {'L','A','Y'};
        char[] arr6 ={'A','N'};
        char[] mergArr3= merge(arr5,arr6);
        System.out.println(Arrays.toString(mergArr3));

        System.out.println("----------------------------------------------------");


        String[]names1 = {"Layan","Asim","loves"};
        String[]names2 = {"Aymen","Ali","very","much"};
        String[]bestCouple=merge(names1,names2);
        System.out.println(Arrays.toString(bestCouple));

        System.out.println("-----------------------------------------------------");



    }


    // merge the given two int arrays and returns the new int array
    public static int[] merge(int[] arr1, int[] arr2) {
        int[] result = {};
        for (int each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (int each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }

    // merge the given two double arrays and returns the new double array
    public static double[] merge(double[] arr1, double[] arr2) {
        double[] result = {};
        for (double each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (double each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }

    // merge the given two char arrays and returns the new char array
    public static char[] merge(char[] arr1, char[] arr2) {
        char[] result = {};
        for (char each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (char each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }

    // merge the given two String arrays and returns the new String array
    public static String[] merge(String[] arr1, String[] arr2) {
        String[] result = {};
        for (String each : arr1) {
            result = ArraysUtility.addElement(result, each);
        }
        for (String each : arr2) {
            result = ArraysUtility.addElement(result, each);

        }
        return result;
    }


}
