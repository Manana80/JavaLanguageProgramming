package myPractice;

import java.util.Scanner;

/**
 * Write a program that can find the unique characters from a string without using index() and lastIndexOf() methods
 *
 *     			Ex:
 *                         str = "aabccdeef";
 *
 *                         output:
 *                                 bdf
 *
 *             Hint: if you find out how to find the frequency of one character, then you can repeat it for the remaining characters to find the frequency.
 *             		if frequency of a character == 1  =========> unique
 */
public class FindingUniqueCharactersWithNestedLoops {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string:");
        String str = scan.nextLine();

        String result ="";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;

            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if(ch==each){
                    count++;
                }
            }

            if (count==1){   // we can write another condition if (count!=1){continue};


                result +=ch;
            }


        }

        System.out.println(result);


scan.close();

    }
}
