package day09_IfStatements;
/*
To show multibranch if statements
 */
public class PosNegZero {
    public static void main(String[] args) {
        int n = 90;
        boolean negative = n<0;
        boolean positive = n>0;
        // we can directly state the condition n<0 and others within the braces in the if condition.
        // However, creating a boolean makes it more structured.

        if (positive){ System.out.println("Positive");}

        if (negative) {System.out.println("Negative");}

        if (n==0) {System.out.println("Zero");}

        System.out.println("----------------------------------------------");
        // The practical and most efficient way to solve it is as fallows:
        //Multibranch if statement.

        if (positive) { System.out.println("Positive");} else if (negative) {System.out.println("Negative");}
        else {System.out.println("Zero");} // all this is considered as a single statement.
        // Note: else has no condition, because it is the only possibility left. (default)


        System.out.println("------------------------------------------------------");


        // can we do it this way (when we have 3 or more conditions)?

        if (positive)  { System.out.println("Positive");} if (negative) {System.out.println("Negative");} else{System.out.println("Zero");}

        // Answer: is no because the first one will be true, then the second independent if statement will
        // be checked out and the first block will be false then the next block will be executed automatically.
        // It will give us two possible answers which is definitely wrong!!



    }
}

/*
This is not an efficient way of creating a code. Because compiler will check them all.
Even when the first one is true. ( which is not necessary). Compiler will go through them one by one!
Hence, when we have more than 2 conditions we should use multibranch if statements.
 */

