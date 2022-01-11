package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";
        //write a program that can check if str1 and str2 are build out same characters

        char []ch1 = str1.toCharArray();
        char []ch2 = str2.toCharArray();
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));


        Arrays.sort(ch1);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));


        boolean anagram = Arrays.equals(ch1,ch2);
        System.out.println(anagram);

        System.out.println("-------------------------------------");
        String sentence = "Wooden Spoon";
        String [] words =sentence.split(" "); // it will return us string array

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------------------");
        String email = "WoodenSpoon@cydeo.com";
        String[]emailAddress = email.split("@"); // the character we choose to split at won't be included in the resulted elements.
        System.out.println(Arrays.toString(emailAddress));
        System.out.println("User name is: "+ emailAddress[0]+ " and domain is: "+ emailAddress[1]);

        System.out.println("-----------------------------------------------");
        String s = "Today is a nice day. Today is Monday. Today we learn Java.";
        String [] sentences =s.split("\\."); // for dots, we need to add \\ before it.
        System.out.println(Arrays.toString(sentences));










    }
}
