package day18_NestedLoop;

import java.util.Arrays;

/*
Print the following shape using nested loop
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
         * * * * * * * * *
 */
public class NestedLoopPractice2 {
    public static void main(String[] args) {
        for (int j = 0; j <8 ; j++) {


            for (int i = 0; i < 9; i++) {
                System.out.print("* ");
            }

            System.out.println();
        }






    }

}
