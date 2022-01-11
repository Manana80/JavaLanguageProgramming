package practice_12_08_2021;

import java.util.Scanner;

/*
Write a program that can return the factorial number of any given number

                              Ex:
                                  input: 5
                                  output: 120  ( because: 5! = 5 * 4 * 3 * 2* 1 = 120 )
 */
public class FactorialNumber {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number:");
        double number = input.nextDouble();
        double result = 1; // the reason why we used double, because when we entered number 100 the result is much bigger than int range hence we used double.


    //    if(number>2) { // because the factorial of  1, and 2 returns the same result. 2*1=2, 1*1=1

            for (double i = number; i >=1; i--) {
                result *= i;  // result = result*i
            }

        System.out.println("Factorial of number is: "+ result);

        input.close();

      //  }else{
      //      result=number;
        }


    }

