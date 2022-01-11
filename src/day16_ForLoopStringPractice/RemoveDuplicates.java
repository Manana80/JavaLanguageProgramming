package day16_ForLoopStringPractice;
/*
 Write a program that can remove the duplicated characters from a String
            Ex:
                input:
                    AABBCCBC

                Output:
                    ABC

            Hint: You can add each character of the string into another String
                  Condition: the character is not contained in the other String before you are adding
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbaacc";
        String result ="";
        //abc this is the expected result.
         // i<=7 ===> i<8 hence we cans use str.length() instead of length()-1.
        // i represent all the index numbers of st (starting from zero)

        for(int i =0 ; i <str.length();i++ ){
            String  ch = ""+ str.charAt(i); // represents each Character of str.
            if (!result.contains(ch)){// the result does not contain certain character
                // the character will be added to the result.if they weren't contained there already!
                result += ch;
                // must be executed only when the character is not already contained in the result.

            }

        }
        System.out.println(result);














    }
}
