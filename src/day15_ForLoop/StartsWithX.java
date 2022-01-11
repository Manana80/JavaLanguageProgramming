package day15_ForLoop;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
 Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
public class StartsWithX {
    public static void main(String[] args) {
        System.out.println("Enter a word:"); // xcodex
        String word = new Scanner(System.in).next();
        // we can use the scanner this way if we are asking the user for one input.
        // no need to terminate the scanner this way.

        if(word.charAt(0)=='x'){
           word= word.replaceFirst("x","a"); // creates a new string object acodex.
        }
        System.out.println(word);











    }
}
