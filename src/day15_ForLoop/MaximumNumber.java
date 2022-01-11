package day15_ForLoop;

import java.util.Scanner;
/*
write a program that asks the user to enter a number for 5 times.
return the maximum number
 */
public class MaximumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = -2147483648;
        /*
        this number is the smallest minimum number possible so anything the user will enter
        ,it will definitely be greater! and everytime the user enters a number it will compare it
        to the new value
         */
        for (int i = 0; i < 5; i++) { // 5 is not included because we started from zero
            System.out.println("Enter a number:");
            int num = scan.nextInt(); // suppose 1,2,3,1,5 max should be 5
            if(num>max){ // this condition is guaranteed to be true.
                max=num;
            }
            // after the first execution max = 1, now when user enters two then max will become 2..etc.
          
        }
        System.out.println("max = " + max);
        System.out.println();


        System.out.println("--------------------------------------------");

scan.close();








    }
}
