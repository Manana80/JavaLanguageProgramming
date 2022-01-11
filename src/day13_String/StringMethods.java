package day13_String;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String word  = "Cydeo"; // get the third ccc
        // index: C =   01234
        char thirdChar = word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

       // char tenthChar= word.charAt(9);
        // we will get: StringIndexOutOfBoundsException: String index out of range: 9
       // System.out.println("tenthChar = " + tenthChar);

        char fourth = word.charAt(4);
        System.out.println("fourth = " + fourth);


        System.out.println("---------------------------------------");

        String s1 = "Batch 25 is the best batch. Java Programming Language";
        int totalChars =s1.length(); // to get the total number of characters.

        System.out.println("totalChars = " + totalChars);

        char lastChar = s1.charAt(totalChars - 1);
        // or char lastChar = s1.charAt (s1.lenght()-1); // memorize it (imp) to find the last index number.
        // in order to call the method; we use "." before the method we want to call.

        System.out.println("lastChar = " + lastChar);

        System.out.println("-------------------------------------------------------");

        String str = "wooden spoon"; // this object is immutable. It cannot be modified
        str.toUpperCase(); // it will create a new string object "WOODEN SPOON"
        //now we have two objects.

        //System.out.println("str = " + str); // if we run it. It will return us the str with lower case
        // because every variable can contain only one variable.
        //hence we need to assign it back to the variable.

        // renaming the variable won't work.

        str=str.toUpperCase();
        System.out.println("str = " + str);

        String s = "JAVA";
        s.toLowerCase();
        s=s.toLowerCase();
        System.out.println("s = " + s);

        // Today is a great day to learn java programming language. (assign all upper case to this string)

        String sentence="Today is a great day to learn java programming language.";
        sentence = sentence.toUpperCase(Locale.ROOT);

        System.out.println("sentence = " + sentence);






    }
}
