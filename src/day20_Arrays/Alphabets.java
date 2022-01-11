package day20_Arrays;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {
        // create a variable that can contain 26 characters

        char [] alphabets = new char[26]; // store from Z to A

       /* alphabets[0]='Z'; // from Ascii table Z = 90
        alphabets[1]='Y'; // 89
        alphabets[2]='X'; // 88
        in order to do automatically and not manually use a for loop

        System.out.println(alphabets[0]); // printing an element in the array
         */


        // Arrays Utility: Utility class of hte array, provides the methods that can be used for hte arrays
        //Class name: Arrays
        //Package : java.util
        // toString(array): converts arrays into string. So , it can be printed on the console.

        System.out.println(Arrays.toString(alphabets)); // printing the whole array
       /*
        This is one way:
        char ch = 'Z';
        for (int i = 0; i < alphabets.length; i++,ch--) { // i is for index number and ch is for the characters
            alphabets[i]=ch;

        }*/


        // Another way:
        for (char i = 0, j='Z'; i <alphabets.length&& j>='A' ; i++,j--) {
            alphabets[i]=j;
        }

        System.out.println(Arrays.toString(alphabets));


    }
}
