package day22_MultiDimensionalArray;

import java.util.Arrays;

/**
 * Write a program that can reverse a sentence.
 * Ex:    Sentence = "Today is a good day to learn Java";
 * output: "Java learn to day good a is Today"
 */
public class ReverseASentence {
    public static void main(String[] args) {

String  sentence = "Today is a good day to learn Java";
String[] words= sentence.split(" ");
        System.out.println(Arrays.toString(words));
String reversedSentence="";

        for (int i = words.length - 1; i >= 0; i--) { //  for reversed task, always use the backward iteration (forr).
           reversedSentence+= words[i]+" ";
        }
        System.out.println(reversedSentence);








    }
}
