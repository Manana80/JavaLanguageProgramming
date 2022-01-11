package day16_ForLoopStringPractice;
/*
Write a program that can return the unique characters from a String

            Ex:
                input:
                    AABCCD

                output:
                    BD

            Hint: You will need indexOf() and lastIndexOf()
                  if the first and last index numbers of the character are same, then it's unique
 */
public class UniqueCharacters {
    public static void main(String[] args) {
String str = "aabacccd";
        String result ="";  // to store the final result


        for (int i = 0; i < str.length(); i++) {// i: index numbers of str starting from 0.
            char ch = str.charAt(i); // represents each character of the string str.

            if (str.indexOf(ch)==str.lastIndexOf(ch)){ // to verify if that character is unique.

// if the first and last index numbers of the character are the same, then the character is unique.
                result +=ch;
            }

        }

        System.out.println(result);




    }
}
