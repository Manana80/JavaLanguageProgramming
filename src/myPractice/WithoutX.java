package myPractice;

import java.util.Scanner;
/*
Given a string word, if the first or last chars are 'x' or 'X', print the string without those 'x' or 'X' chars,
otherwise print the string unchanged.
 */
public class WithoutX {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODES
        char first = word.charAt(0);
        char last = word.charAt(word.length()-1);
        String minus = word.substring(1, word.length()-1);
        if(first=='x'&& last =='X'|| last =='x'&&first=='X'){
            System.out.println(minus);

        }else{
            System.out.println(word);
        }



    }

}
