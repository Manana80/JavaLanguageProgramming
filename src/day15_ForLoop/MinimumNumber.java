package day15_ForLoop;

import java.util.Scanner;
/*
Write a program that asks the user to enter a number for 5 times. return the minimum number
 */
public class MinimumNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = 2147483647; // the maximum integer we can assign. So for sure, any number that the user enters will be less than this.

        for (int i = 10; i < 15; i++) {
            System.out.println("Enter a number:"); // if it is not to be repeated place it outside the loop
            int num = scan.nextInt();

            if (num < min) { // this condition is guaranteed to be true.
                min = num;


            }

        }
        System.out.println("min = " + min);
    }}
