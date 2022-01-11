package day17_While_DoWhile;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {

        for (char i = 'A'; i <='Z' ; i++) { // ABCDEF



            System.out.println(i+"");
            if(i == 'F'){ // if printed after the statement , F will be included , if before F won't be included
                break; // Exits the loop
            }
        }

        System.out.println();
        System.out.println("--------------------------------------------");

        Scanner scan = new Scanner(System.in); // do not place it inside the loop!
        while(true){ // it will be repeated infinite times.
         System.out.println("Enter a number");
         int num = scan.nextInt();

         if(num <0){
             break;
         }

}











    }

















}
