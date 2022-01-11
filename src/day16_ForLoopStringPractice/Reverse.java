package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        String result = ""; // contain the reversed version of str
        // getting the characters out of a string:
        // index number:  0123456..
 /*      result+= str.charAt(11); //n // he did it manually , we can do the length()-1
        // by adding the += operator now we added the last letter to the result string as first letter
        result+= str.charAt(10); //0
        result+= str.charAt(9);
        result+= str.charAt(8);
        result+= str.charAt(7);
        result+= str.charAt(6);
        result+= str.charAt(5);
        result+= str.charAt(4);
        result+= str.charAt(3);
        result+= str.charAt(2);
        result+= str.charAt(1);
        result+= str.charAt(0);
/*
we repeated the same method for 11 times, and we keep concatenating it to the String ===>Loop
 */

        for (int i = str.length()-1; i >=0; i--) {
           result+= str.charAt(i); // adding each character to result

        }

        System.out.println(result);


    }
}
/*
Write a program that can reverse a String
Ex: input:
Wooden Spoon
output
noopS nedooW
 */