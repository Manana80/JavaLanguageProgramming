package InterviewTasksCydeo;

import java.util.Scanner;

/*
Write a program for Fibonacci series
Ex: 0,1,1,2,3,5,8,13,21...
 */

public class Fibonacci {
    public static void main(String[] args) {
        int num, a = 0, b=0 ,c=1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of times:");
        num = scan.nextInt();
        System.out.println("Fibonacci Series of hte number is: ");
        for (int i = 0; i <num; i++) {
            a=b;
            b=c;
            c=a+b;
            System.out.print(a + " ");
        }
    }
}
