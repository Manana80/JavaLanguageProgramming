package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str = ""; // if I put a space then it is not empty anymore ...> returns false
       boolean r = str.isEmpty();  // result true or false hence assigned to a boolean variable
        System.out.println(r);

        boolean r1 =str.isBlank(); // this will return true. here the spaces are all blanks.
        // remember space is a ccc, and it takes from the length of the string
        // blank == white spaces
        //empty ==! blank

        // i.e. blank accepts white spaces but empty won't.

        System.out.println(r1);

        String str2 = "Cydeo    "; // neither empty nor blank
        System.out.println(str2.isBlank());


        System.out.println("----------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";
        // both have the same words with different cases.

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        //Yes, YES, yES, yEs, YEs.. if the user enters an answer then we need to use equalIgnorCase
        System.out.println("-------------------------------------------------");

        String sentence = "My favorite programming language is Java";
        //verify if the sentence contains C#

        boolean hasCSharp= sentence.contains("C#");
        System.out.println(hasCSharp);
        boolean hasJava=sentence.contains("Java");
        System.out.println(hasJava);
        boolean hasJava1 = sentence.contains("java");
        System.out.println(hasJava1); // false because of case sensitivity
        boolean r3 = sentence.contains("java")|| sentence.contains("Java");
        // returns ture only if the first letters were of different cases.
        // but what if the java the user's enter is jAvA then it will not return true.

        boolean hasJava2 = sentence.toLowerCase(Locale.ROOT).contains("java");
        // this is the best way to compare the user's input to the result
        // either convert the input to lower or upper case. i.e. to unify the characters.
        //i.e taking case sensitivity out of consideration.
        System.out.println(hasJava2); //true

        System.out.println("-----------------------------------------------------------");

        String input1 = "I love jAvA";
        String input2 = "java";
        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false
        // if want to verify that one string contains the other one , we use contains methods

        System.out.println(input1.contains("Java")); // true
        System.out.println(input1.toLowerCase().contains("java")); // true
        // or
        System.out.println(input1.toUpperCase().contains("JAVA")); //ture

        System.out.println("---------------------------------------------");
        String a = "Wooden Spoon";
        boolean x = a.startsWith("Woo"); // the advantage is we can add more than one character
        System.out.println(x); // it starts from index 0
        // This method is also case-sensitive
       // hence we should call the lower case or upper case first , and then compare it to lower or upper case.
        boolean y = a.startsWith("oo");
        System.out.println(y);

        boolean z = a.endsWith("Spoon");
        System.out.println(z);

        boolean b = a.toLowerCase().endsWith("spoon");
        System.out.println(b);


        System.out.println("String methods are done!");

    }
}
