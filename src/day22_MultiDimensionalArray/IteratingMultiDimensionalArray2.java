package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = {{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};
        
        /*
        task 1
        Out put: 8 9 10 11 12 13
                 4 5 6 7
                 1 2 3
         task 2
         3 2 1
         7 6 5 4
         13 12 11 10 9 8
         */

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: index number fo 1D array starting from last index to zero
            for (int j = 0; j < arr2D[i].length; j++) { // j: index number of elements

                System.out.print(arr2D[i][j] + " ");

            }
            System.out.println();
            }
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < arr2D.length; i++) {
            for (int j = arr2D[i].length - 1; j >= 0; j--) {
                System.out.print(arr2D[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("----------------------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {

            for (int i1 = arr2D[i].length - 1; i1 >= 0; i1--) {
                System.out.print(arr2D[i][i1]+" ");

            }
            System.out.println();
        }

        System.out.println("---------------------------------------------");














        }

    }
