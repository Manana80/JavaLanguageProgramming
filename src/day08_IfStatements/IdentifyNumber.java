package day08_IfStatements;
/*
1. Create a class called IdentifyNumber, and write a program that can identify if the given number is positive, or negative or zero.

            Ex:
                number = 200

            output:
                200 is positive number: true
                200 is negative number: false
                200 is zero: false
 */

public class IdentifyNumber {
    public static void main(String[] args) {
        int num = 200;
        boolean isPositive = num > 0;
        boolean isNegative = num < 0;
        boolean isZero = num == 0;
        System.out.println( num + " is positive number: " + isPositive);
        System.out.println( num + " is negative number: " + isNegative);
        System.out.println( num + " is zero: " + isZero);
    }
}
