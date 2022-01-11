package day15_ForLoop;
 /*
        A~Z     we will use char
        a~z
        Z~A
        z~a
         */

public class Alphabets {
    public static void main(String[] args) { // i: 65 - 90
        // A~Z either solve it by using int (using ascii table) or using char variable
        //65-90 from ascii table
        for (int i = 65; i<=90; i++){ // we have to cast it to char in order to get char result
            System.out.print((char) i + " ");
        }

        System.out.println();

        System.out.println("----------------------------------------------------");
        //Another solution

        for (char i ='A'; i<='Z'; i++){ //i: A, B, C,D... Z
            System.out.print( i + " ");
        }
        System.out.println(); // always append new line

        System.out.println("---------------------------------------------");

        // a - z
        for (char i = 'a'; i<='z'; i++){
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------------");

        // Z - A

        for (char i ='Z'; i>='A'; i--){ //i: Z, Y, X...A
            System.out.print( i + " ");
        }
        System.out.println(); // always append new line

        System.out.println("----------------------------------------------");


        for (char i ='z'; i>='a'; i--){ //i: Z, Y, X...A
            System.out.print( i + " ");
        }
        System.out.println(); // always append new line

        System.out.println("----------------------------------------------");

        for (char i = 1; i <=40000; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("------------------------------------------------");




    }
}
