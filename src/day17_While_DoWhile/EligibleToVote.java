package day17_While_DoWhile;

import java.util.Scanner;

public class EligibleToVote {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = scan.nextInt(); // the user might enter the wrong age
        // precondition for valid age is 1~120.
        // if user enter something invalid like -20 we should keep asking the user to reenter the age until the user enters a valid number for the age
        // we don't know how many numbers we are going to repeat this statement hence we should use the while loop
        //i.e. while loop is used for repeating when we don't have the number of repetitions.

        while( !(age>=1 && age<=120) ){
            System.err.println("Invalid entry please re-enter");
            System.err.println("Enter your age:");;
        age= scan.nextInt();}

        System.out.println("Are you a US citizen? yes / no");
        // what if the user entered maybe, or I don't know, hence, we need to ask the user to re-enter his/her answer
        String answer = scan.next();

        while(!(answer.equals("yes")||answer.equals("no"))){
            System.err.println("Invalid entry please re-enter");
            System.err.println("Are you a US citizen? yes/no");
            answer= scan.next();
        }
        if ( age >= 18 && answer.equals("yes")  ){
            System.out.println("Eligible to vote!");
        }else {
            System.out.println("Not eligible to vote!");
        }



scan.close();





    }
}
