package practice_12_08_2021;

import java.util.Scanner;

/*
This is a very important interview question.
Create a program that will give you the Fibonacci numbers up to the x value.

     Fibonacci is a sequence of number starting from 0, 1
     where the following numbers are the sum of the previous 2 numbers

      Note: Fibonacci numbers are read as index values,
      so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13, 21

                               index     Values
                               0           0
                               1           1
                               2           1  index 0 + index1
                               3           2  index 1 + index2
                               4           3  index 2 + index3
                               5           5


 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Fibonacci numbers do you want to see?");
        int number = input.nextInt();


       int num0= 0;  // this is constant because it is constant in fibonacci sequence. (first)
       int num1=1; // this is constant because it is constant in fibonacci sequence. (second)


       int result=0; // because it is addition we use zero, if multiplication use 1.

        System.out.println(num0);
        System.out.println(num1);

        for (int i = 2; i < number; i++) { // we started from two because we already have the first and second indices (0,2)
            result= num0+num1;
            System.out.println(result);

            num0=num1; //swapping the values after each time the loop runs
            num1=result; // swapping the value with the new value that is the next number from the loop.





        }




input.close();



    }
}
