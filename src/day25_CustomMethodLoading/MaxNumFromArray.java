package day25_CustomMethodLoading;

import java.util.Arrays;

/*
1. create a method that can return the max number from an integer array

    2. create a method that can return the max number from double array

    3. create a method that can return the max number from long array

    4. create a method that can return the max number from short array

    5. create a method that can return the max number from float array

    6. create a method that can return the max number from byte array

 */
public class MaxNumFromArray {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1};
        int max = maxNumber(arr1);
        System.out.println("max = " + max);
    }
    
    
    
    
    
    
    
    
    
    
   // 1. create a method that can return the max number from an integer array
   public static int maxNumber (int[]arr){
       int max = arr[0];
       for (int number : arr) {
           if (number>max)
               max=number;
             
       }
       return max;
   }

   // 2. create a method that can return the max number from double array
    public static double maxNumber (double[]arr){
        double max = arr[0];
        for (double number : arr) {
            if (number>max)
                max=number;

        }
        return max;
    }

    //3. create a method that can return the max number from long array
    public static Long maxNumber (Long[]arr){
        Long max = arr[0];
        for (Long number : arr) {
            if (number>max)
                max=number;

        }
        return max;
    }

    // 4. create a method that can return the max number from short array
    public static short maxNumber (short[]arr){
        short max = arr[0];
        for (short number : arr) {
            if (number>max)
                max=number;

        }
        return max;
    }

    // 5. create a method that can return the max number from float array
    public static float maxNumber (float[]arr){
        float max = arr[0];
        for (float number : arr) {
            if (number>max)
                max=number;

        }
        return max;
    }

    //6.create a method that can return the max number from byte array
    public static byte maxNumber (byte[]arr){
        byte max = arr[0];
        for (byte number : arr) {
            if (number>max)
                max=number;

        }
        return max;
    }


}
