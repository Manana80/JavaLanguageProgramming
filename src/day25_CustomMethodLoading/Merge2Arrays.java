package day25_CustomMethodLoading;

import java.util.Arrays;

/*
 1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

    2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)

    3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)

    4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)

 */
public class Merge2Arrays {
    public static void main(String[] args) {
        int[] arr1 = {5, 6, 1};
        int[] arr2 = {9, 8, 0};
        int[] mergedArr1 = merge(arr1,arr2);
        System.out.println(Arrays.toString(mergedArr1));
        System.out.println("--------------------------------------------------");
        double[] arr3 = {3.4,5.6,1.2,9.0};
        double[] arr4= {7.5,4.9,2.5,0.1};
        double[]mergArr2 = merge(arr3,arr4);
        System.out.println(Arrays.toString(mergArr2));
        System.out.println("---------------------------------------------------");
        char[] arr5 = {'L','A','Y'};
        char[] arr6 ={'A','N'};
        char[] mergArr3= merge(arr5,arr6);
        System.out.println(Arrays.toString(mergArr3));
        System.out.println("----------------------------------------------------");
        String[]names1 = {"Layan","Asim","loves"};
        String[]names2 = {"Aymen","Ali","very","much"};
        String[]bestCouple=merge(names1,names2);
        System.out.println("Arrays.toString(bestCouple) = " + Arrays.toString(bestCouple));
        System.out.println("-----------------------------------------------------");



    }

// 1. create a method that can merge two integer arrays.          merger(int[] arr1, int[] arr2)

    public static int[] merge(int[] arr1, int[] arr2) {

        int[] newArray = new int[arr1.length + arr2.length];

        int i = 0;

        for (int each1 : arr1) {
            newArray[i++] = each1;
        }
        for (int each2 : arr2) {
            newArray[i++] = each2;
        }

        return newArray;
    }

    //2. create a method that can merge two double arrays.          merge(double[] arr1, double[] arr2)
    public static double[] merge(double[] arr1, double[] arr2) {

        double[] newArray = new double[arr1.length + arr2.length];

        int i = 0;

        for (double each1 : arr1) {
            newArray[i++] = each1;
        }
        for (double each2 : arr2) {
            newArray[i++] = each2;
        }

        return newArray;
    }


    // 3. create a method that can merge two char arrays.           merge(char[] arr1, char[] arr2)
    public static char[] merge(char[] arr1, char[] arr2) {

        char[] newArray = new char[arr1.length + arr2.length];

        int i = 0;

        for (char each1 : arr1) {
            newArray[i++] = each1;
        }
        for (char each2 : arr2) {
            newArray[i++] = each2;
        }

        return newArray;
    }


    // 4. create a method that can merge two String arrays.          merge(String[] arr1, String[] arr2)
    public static String[] merge(String[] arr1, String[] arr2) {

        String[] newArray = new String[arr1.length + arr2.length];

        int i = 0;

        for (String each1 : arr1) {
            newArray[i++] = each1;
        }
        for (String each2 : arr2) {
            newArray[i++] = each2;
        }

        return newArray;
    }


}
