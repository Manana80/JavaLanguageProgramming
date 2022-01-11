package myPractice;
import java.util.Scanner;

/*
Write a program which reads a sequence of positive integers. The program stops when the user fills
a negative value and shows the maximum and the minimum of these numbers.
Example:
6 0 5 7 -1 ---> max = 7 , min = 0
3 9 6 2 1 -2 ----> max = 9, min = 1
 */
public class MaxMinNeg {
    public static void main(String[] args) {

         /*
     Steps:
     1. Read the first value from the user and suppose it is the maximum and minimum (max and min)
     2. Keep updating max and min as long as the user is giving positive values.
     3. Display the results when the user enters a negative value.


      */

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number:");
        int number = scan.nextInt();
        int max = number;
        int min = number;

       if (number>=0){ // to prevent the program from executing if the user's first entry was a negative number.
           while(number>=0) {
               System.out.println("Please enter a number:");
               number = scan.nextInt();
               if (number < 0) {     // this statement should be placed here, otherwise the negative number will be assigned to min.
                   break;
               }
                                                   // can be written as ternary
               if (number > max) {                 // max= n>max? n: max;
                   max = number;
               }
               if (number < min && number>=0) {      // min = n<min: min;
                   min = number;
               }



           }
           System.out.println("maximum number = " + max);
           System.out.println("minimum number = " + min);
       }
       else{
           System.out.println(number + " is invalid");
       }











        scan.close();


















    }
}
