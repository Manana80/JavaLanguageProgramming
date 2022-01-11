package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {
        // this is just (good to know) ===> optional (maybe an interview question)
        // in order to store all these data in one place ===> two-dimensional array is needed
        int[]arr1 = {1,2,3};
        int[]arr2 = {4,5,6};
        int[]arr3 = {7,8,9};

        int[][] arr2D={ {1,2,3},{4,5,6},{7,8,9}};

        //3 dimensional-array contains 2D arrays


        // index no.  Elements:0,1,2   0,1,2   0,1,2      0, 1, 2     0, 1, 2   0,  1 , 2
        // index no. for 1D      0       1        2           0         2          3
        int [][][] arr3D = {{ {1,2,3},{4,5,6},{7,8,9}},{ {10,20,30},{40,50,60},{70,80,90}} };
        // index numbers:             0                          1
// [index num of 2D array][index num of 1D] [index num of elements]
        System.out.println(Arrays.deepToString(arr3D));
        System.out.println(Arrays.deepToString(arr3D[1]));
        System.out.println(Arrays.toString(arr3D[1][1]));
        System.out.println(arr3D[0][2][2]);

        // to iterate such an array we will need three foreach loops

        for (int[][] each2D : arr3D) {

            for (int[] each1D : each2D) {
                for (int eachElement : each1D) {
                    System.out.print(eachElement +" ");
                }
                System.out.println();
            }

        }
        System.out.println("----------------------------------------------------");
int[][][][] arr4D = {{{ {1,2,3},{4,5,6},{7,8,9}},{ {10,20,30},{40,50,60},{70,80,90}} }};
// 3D2D1DElements                                        0
/*
From Cassandra:
 once we declare our arrays we can nest them into the higher dimensions by just calling them, right? Even though that can get confusing?
int[][][][] arr4D = {arr3D, arr3D2, arr3D3};
 */
        for (int[][][] each3D : arr4D) {
            for (int[][] each2D : each3D) {
                for (int[] each1D : each2D) {
                    for (int Elements : each1D) {
                        System.out.print(Elements +" ");
                    }
                    System.out.println();
                }

            }

        }



    }
}
