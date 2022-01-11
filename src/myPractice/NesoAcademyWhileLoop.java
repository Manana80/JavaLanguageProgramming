package myPractice;

import java.util.Scanner;

public class NesoAcademyWhileLoop {
    public static void main(String[] args) {
      /*
      Write  a program which reads a sequence of integers from the user and stops by displaying "Done"
      when the sum of these values exceeds 100
       */

        Scanner scan = new Scanner(System.in);
        int sum = 0;

       do {
           System.out.println("Please enter a number:");
           int number = scan.nextInt();
           sum+=number;
       }
        while(sum<=100);


        System.out.println("Done: " + sum);





scan.close();


    }}

