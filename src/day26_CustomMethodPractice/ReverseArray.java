package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int [] reversed = reverse(arr);
        System.out.println(Arrays.toString(reversed));
    }






















    public static int[] reverse(int[]array){
        int [] result = new int[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) { // j is the index number of the new array result.
            result[j]=array[i];
        }
        return result;
    }

    public static double[] reverse(double[]array){
        double [] result = new double[array.length];
        for (int i = array.length - 1, j=0; i >= 0; i--,j++) { // j is the index number of the new array result.
            result[j]=array[i];
        }
        return result;
    }


















}
