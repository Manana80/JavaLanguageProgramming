package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char [] letters = new char[26];
        /*
        letters [0] = 'A';
        letters [1] = 'B';
        letters [2] = 'C'; each time of repeating two things are changing simultaneously:
        the index number and the elements.
         */


       // we need to variables; one for the char and for the index numbers of the array
        // we need a loop to assign  the letters to the array rather than typing them one by one!
/*
        solution 1:
        for (char i = 'A', j=0; i <='Z'&& j<letters.length ; i++,j++) { // i:index number 0~ last index
            letters[j]=i;
            // in this case since each char has a number, we can put an int and char variables back to back in the same loop

            // j represents the index number of

        }
        System.out.println(Arrays.toString(letters)); //[A~Z]*/

char ch = 'A';
        for (int i = 0; i < letters.length; i++,ch++) {
            //letters[i]=ch++; // post increment won't increase the char immediately so when i=0 char will be 'A' i.e. won't change immediately.
            letters[i]=ch;
        }
        System.out.println(Arrays.toString(letters));

        System.out.println("-----------------------------------------------------");

        char[]letters2 = new char[26];  // [z~A]

        char chr ='Z';
        for (int i = 0 ; i < letters2.length ; i++) {
            letters2[i]=chr--;

        }

        System.out.println(Arrays.toString(letters2));

    }
}
