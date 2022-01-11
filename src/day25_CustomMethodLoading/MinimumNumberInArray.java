package day25_CustomMethodLoading;
/*
 1. create a method that can return the min number from an integer array

    2. create a method that can return the min number from double array

    3. create a method that can return the min number from long array

    4. create a method that can return the min number from short array

    5. create a method that can return the min number from float array

    6. create a method that can return the min number from byte array

 */
public class MinimumNumberInArray {

    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1};
        int min = minNumber(arr1);
        System.out.println("min = " + min);
    }










    // 1. create a method that can return the max number from an integer array
    public static int minNumber (int[]arr){
        int min = arr[0];
        for (int number : arr) {
            if (number<min)
                min=number;

        }
        return min;
    }

    // 2. create a method that can return the max number from double array
    public static double minNumber (double[]arr){
        double min = arr[0];
        for (double number : arr) {
            if (number<min)
                min=number;

        }
        return min;
    }

    //3. create a method that can return the max number from long array
    public static Long minNumber (Long[]arr){
        Long min = arr[0];
        for (Long number : arr) {
            if (number<min)
                min=number;

        }
        return min;
    }

    // 4. create a method that can return the max number from short array
    public static short minNumber (short[]arr){
        short min = arr[0];
        for (short number : arr) {
            if (number<min)
                min=number;

        }
        return min;
    }

    // 5. create a method that can return the max number from float array
    public static float minNumber (float[]arr){
        float min = arr[0];
        for (float number : arr) {
            if (number<min)
                min=number;

        }
        return min;
    }

    //6.create a method that can return the max number from byte array
    public static byte minNumber (byte[]arr){
        byte min = arr[0];
        for (byte number : arr) {
            if (number<min)
                min=number;

        }
        return min;
    }




}
