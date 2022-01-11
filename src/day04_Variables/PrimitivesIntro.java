package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
        // age: 38 years old suppose we are going to use this data for 100 times it is better to create a variable.
        byte age = 38;

       // weight: 160 pounds
       //byte weight = 160;
       // the reason why it gave us a compiler error is because 160 is out of byte' range
       //byte num = -129;
       // the reason why it gave us a compiler error is because 160 is out of byte

        short y = 160;
      // Even though correct line however, the y is not clear it refers to what!so we should make the variable name clear.
       short weight = 160; // 160 is within the short range

      // salary: 100000$
        //short salary = 100000; // 100000 is out of the short' range we should use int
        int salary = 100000;
        // int is the preferred data type for integer numbers other that any other data types (byte, short and long)
        // int salary = 100_000; underscore character is used to make the number readable. we can not use any other character

        // int asset = 3_333_333_333; If written this way compiler will take it by default as an int.
        long asset = 3-333-333-333L;// L or l is the specifier for the long data type because int is the preferred default in the compiler. so if we don't specify it might give us a compiler error. (L is to force the compiler to take it as a long primitive type by default).

        //tax: 0.26       (data for tax)
        // if we use int tax = 0.26; it will give us compiler error.
        // in case the range of the number falls within float and we want to use it without getting a compiler error we have to force the compiler so we add F or f.
        float tax = 0.26F;

        double PI = 3.14; // double is the preferred by the compiler.

        // From now on for integers we will always use int and for decimals we always use double

        // #
        char ch1 = '#'; // the symbol should be written within single quotes
        System.out.println("ch1 = " + ch1);
        // or  I can assign the number assigned to pound as in ascii table
        char ch2 = 35;
        System.out.println("ch2 = " + ch2);
        char ch3 = 45000; // I won't get a number but the character (char)
        System.out.println("ch3 = " + ch3);

        char ch4 = 50000;
        System.out.println("ch4 = " + ch4);
        char ch5 = 500;
        System.out.println("ch5 = " + ch5);

        // examples on where we might see or need a single character data.
        // for char and boolean we also use soutv to print the statement.

        char gender = 'F';
        char grade = 'F';
        char yes = 'Y';
        char no = 'N';
        char north = 'N';
        char south ='S';
        char east ='E';
        char west ='W';

        // example if we have more than one character like say a blood type we cannot use char!

        boolean isEmployeed = true;
        boolean isMarried = false;
        // boolean for statements that only accept true or false not maybe!
        boolean result = 100 > 300;
        System.out.println("result = " + result);
        System.out.println("isMarried = " + isMarried);
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("north = " + north);
        System.out.println("south = " + south);
        System.out.println("east = " + east);
        System.out.println("west = " + west);



     // All written above are explanation of primitive data types
     // for more than one character we need to use String and always use double quotes.
     // strings are non-primitive data type
     // example name

     String name = "Wooden spoon";
     String city = "McLean";
     String state = "Virginia";
     String country = "USA";

     // no limit for the characters within the string
     System.out.println("name = " + name);
     System.out.println("city = " + city);
     System.out.println("state = " + state);
     System.out.println("country = " + country);


    }


}

/* We can declare a variable without assigning the value, and assign the value later:
        Example: int myNum;
        myNum = 15; (See day07 class ShorthandOperators)
        System.out.println (myNum); result 15

        - Note that if you assign a new value to an existing variable,
        it will overwrite the previous value:
        in the previous example:
        int myNum = 15;
        myNum =20; the system will write myNum = 20 and not 15.
         */



/*
- One variable name (Java Identifier) can only be given for one variable
 i.e. must be unique only within the class.
- Some words are reserved for Java like the word private, we can not use them to name the variable.
- Variable names cannot start with a digit.
- Variable names should start with lower case. if more than one word then apply camel case.
- Only two special characters can be used: underscore and dollar sign.
- We cannot use space
- It must be readable, understandable and meaningful.
- Every single char has a number up to 65.000. Hence, we can assign a character to int however, the result will be the number that represents the char rather than the character itself!
- Therefore, if we have a char we should always assign it to char!
 */

/* The General rules for naming variables are: (From W3shcools)
The general rules for naming variables are:

Names can contain letters, digits, underscores, and dollar signs
Names must begin with a letter
Names should start with a lowercase letter, and it cannot contain whitespace
Names can also begin with $ and _ (but we will not use it in this tutorial)
Names are case sensitive ("myVar" and "myvar" are different variables)
Reserved words (like Java keywords, such as int or boolean) cannot be used as names

 */