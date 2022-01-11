package practice_12_08_2021;

import java.util.Scanner;

// Very common interview question
/*
  Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level

                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true
 */
public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = input.nextLine();

        String result="";
        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }

        if (word.equalsIgnoreCase(result)){
            System.out.println(word+ " is palindrome");
        }else{
            System.out.println(word+ " is NOT palindrome");
        }




input.close();

    }
}
