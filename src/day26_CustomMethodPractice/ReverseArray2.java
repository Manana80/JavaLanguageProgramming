package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 4, 5};
        int[] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));
    }























    // reverse the given int array, returns a new int array
    public static int[] reverse(int[] array) {
        int[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    // reverse the given double array, returns a new double array
    public static double[] reverse(double[] array) {
        double[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


    // reverse the given char array, returns a new char array
    public static char[] reverse(char[] array) {
        char[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }

    // reverse the given String array, returns a new String array
    public static String[] reverse(String[] array) {
        String[] result = {};
        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result, array[i]);
        }
        return result;
    }


}














