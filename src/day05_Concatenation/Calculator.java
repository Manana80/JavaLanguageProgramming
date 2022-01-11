package day05_Concatenation;

public class Calculator {
    public static void main(String[] args) {
        int firstNumber = 100;
        int secondNumber = 50;
        int addition = firstNumber + secondNumber;
        int subtraction = firstNumber - secondNumber;
        int multiplication = firstNumber * secondNumber;

        // 100 + 50 =150 answer:  System.out.println( firstNumber + "+" + secondNumber + " = " + (firstNumber + secondNumber));
        // (firstNumber + secondNumber) this is called grouping another solution we can create a variable called addition
        // 100 - 50 = 50
        // 100 * 50 = 5000
        System.out.println( firstNumber + " + " + secondNumber + " = " + addition);
        System.out.println( firstNumber + " + " + secondNumber + " = " + subtraction);
        System.out.println(firstNumber + " + " + secondNumber + " = " + multiplication);

        /*
        When there is a string on the right of the + sign the following numbers will be concatenated
        e.g. System.out.println ( "Statement" + 100 + 100) the result will be:
        Statement 100100
        However, if the numbers were on the right of the statement they will be added first:
         e.g. System.out.println (100 + 100 + " Statement" ) the result will be:
         200 Statement
         Unless otherwise; the numbers are withing braces then the arithmetic operation will be done first
         e.g. System.out.println ( "Statement" + (100 + 100)) the result will be:
         Statement + 200
         */

        System.out.println("Layan Assim " + 41 + 80);
        System.out.println(41 + 80 + " Layan Assim");
        System.out.println("Layan Assim " + (41+80));


    }
}
