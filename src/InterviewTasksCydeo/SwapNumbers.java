package InterviewTasksCydeo;

import java.util.Arrays;

/*
Swap two variable values without using a third variable
 */

public class SwapNumbers {
    public static void main(String[] args) {
        // Swiping by division and multiplication
        int a = 5;
        int b = 2;
        // Code to swap 'x' and 'y'
        if(a == 0 || b==0){
            throw new RuntimeException("Invalid number");
        }
        a= a*b ; // a = 10
        b= a/b ; // b = 5
        a = a/b ; // a = 2
        System.out.println( a + " " + b);


        // Swiping using addition and abstraction
        // This method is even better it works with all numbers (positive, negative and zero)
        int x = 8;
        int y = 7;

        x = x+y;  // x = 15
        y = x-y;  // y = 8
        x = x-y;  // x = 7


        }


    }


