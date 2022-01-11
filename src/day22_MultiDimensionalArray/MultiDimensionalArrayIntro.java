package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {

        /*
        String[] group1 ={"jhon","James","Joe"}
        String[] group2 ={"jhon","James","Joe"}
        String[] group3 ={"jhon","James","Joe"}
         */
        // since we have 3 single dimensional array , then we need (3-1) a multidimensional array.
        String[] group1 ={"jhon","James","Joe"};
        String[] group2 ={"Aaron","Shay","Brennan"};
        String[] group3 ={"Cassandra","Tahir","Aygun"};
        String[][] groups = new String [3][];  // index: 0,1,2
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;



       // System.out.println(Arrays.toString(groups)); if printed out it will give hashcode because toString() is only for single dimensional array

        System.out.println(Arrays.deepToString(groups)); // deepToString() is used to print out multidimensional array
        System.out.println("---------------------------------------------------------");



        //indices         0,1,2   0,1,2,3   0,1,2 ,3 ,4
        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        //index no:        0        1          2
// and that's why we have two bracket that represents two different types of index numbers

        System.out.println(Arrays.deepToString(arr2D));

// when we have two-dimensional array we will need two loops to retrieve all elements.
        System.out.println(Arrays.toString(arr2D[1]));
        System.out.println(arr2D[2][3]);



    }
}
