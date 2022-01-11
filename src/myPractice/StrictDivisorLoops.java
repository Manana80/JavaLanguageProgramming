package myPractice;

import java.util.Scanner;

/*
Write a program which displays the sum of the strict divisors of an integer given by the user.
Example:
6 --> 1+2+3 = 6
10 --> 1 + 2 + 5 = 8
Hints:
- The strict divisors of a number N are <= N/2
- if N%i = 0 then i is a divisor of N.

 */
public class StrictDivisorLoops {
    public static void main(String[] args) {
/*
steps to solve:
1. iterate over all the possible divisors.
2. if i is a divisor of n, add i to the sum.
3. display sum
 */

        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int n = scan.nextInt();
        int sum = 0;


        for (int i = 1; i <= n/2 ; i++) {
            if(n%i==0){

             //   System.out.print(i + " ");  in case we want a list of the strict divisors.
           //     System.out.println();
                sum+=i;

        }

       }
        System.out.println(sum);
        // if we want the sum of all divisors (not only strict) we only need to add n to the sum in the final statements


    }
}
