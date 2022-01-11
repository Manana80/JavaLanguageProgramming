package day22_MultiDimensionalArray;

import java.util.Arrays;

/**
 * This is an interview question
 * Write a program that can reverse the second word of the sentence.
 * Ex: Sentence = "I love Java";
 * Output: I evoL Java
 */
public class ReverseTheSecondWordOfTheSentence {
    public static void main(String[] args) {

       String  sentence = "I love Java";
       String[] words = sentence.split(" "); // [I, Love,Java] we can use the loop and get the words one by one and then reverse the second word.

       String reverse = " ";
        for(int i =words[1].length()-1;i>=0;i--){ //i represents the index numbers of the second word
           reverse+= words[1].charAt(i);
        }

        // one solution: sentence = sentence.replaceFirst(words[1],reverse);

        words[1]=reverse;

        System.out.println(Arrays.toString(words));

        for (String word : words) {
            System.out.print (word + " ");

        }



// task count how many palindromes are there in the string.









    }
}
