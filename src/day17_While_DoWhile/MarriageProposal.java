package day17_While_DoWhile;

import java.util.Locale;
import java.util.Scanner;
/*
Write a program for the marriage proposal asking hte user, "Will you marry me?"
if the answer is yes, print "Congrats".
if the answer is no, print "goodbye"
if the answer is neither yes nor no, print "Invalid answer, please re-enter:" and repeat it until the
user enters yes or no.
 */
public class MarriageProposal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me");
        String answer = scan.next().toLowerCase();
        while (!(answer.equals("yes")|| (answer.equals("no")))){
            System.err.println("Invalid answer, please re-enter:");
            answer= scan.next().toLowerCase();
        }
        if(answer.equals("yes")){
            System.out.println("Congrats!");
        }else{
            System.out.println("Good bye!");
        }

scan.close();


    }
}
