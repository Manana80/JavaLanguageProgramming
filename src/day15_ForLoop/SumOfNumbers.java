package day15_ForLoop;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        double sum = 0;
        //1
        //1+2 + 3... ... +100

        // shortcut for the loop is fori
        for (int i = 1; i <101 ; i++) { // i: 1,2,3,4....100
            sum += i; // addition assignment operator


        }
        System.out.print(sum);
        System.out.println();
        System.out.println("-----------------------------------------");

        int total =0;
        Scanner scan = new Scanner(System.in);
        for ( int i = 0; i<5;i++){
            System.out.println("Enter a number");
            total += scan.nextInt();
        }



        System.out.println(total);





scan.close();

    }





}
