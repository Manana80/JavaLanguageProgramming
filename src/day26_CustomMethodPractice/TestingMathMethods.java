package day26_CustomMethodPractice;

import utilities.MathUtility;

public class TestingMathMethods {
    public static void main(String[] args) {
        int num1 = 5, num2=6;
        System.out.println(MathUtility.sum(num1,num2));
        System.out.println(MathUtility.multiplication(num1,num2));
        System.out.println(MathUtility.square(num1));
        System.out.println(MathUtility.cubicSquare(num2));



        System.out.println("======================================================");

        double num3 = 4.5 , num4 = 6.5;
        System.out.println(MathUtility.sum(num3,num4));
        System.out.println(MathUtility.multiplication(num3,num4));
        System.out.println(MathUtility.division(num3,num4));
        System.out.println(MathUtility.division(num4,num3));

        System.out.println("======================================================");

        int number1 = 10, number2 = 5;
        System.out.println(MathUtility.subtract(number1,number2));
        System.out.println(MathUtility.subtract(number2,number1));
        System.out.println(MathUtility.evenNumber(number1));
        System.out.println(MathUtility.evenNumber(number2));
        System.out.println(MathUtility.oddNumber(number1));
        System.out.println(MathUtility.oddNumber(number2));


        System.out.println("======================================================");

        double number3 = 4.7, number4= 10.6;
        System.out.println(MathUtility.subtract(number3,number4));
        System.out.println(MathUtility.subtract(number4,number3));


        System.out.println("======================================================");

        int digit1 = 2, digit2 = 4;
        System.out.println(MathUtility.maximumNumber(digit1,digit2));
        System.out.println(MathUtility.minimumNumber(digit1,digit2));

        System.out.println("======================================================");

        double digit3 = 5.6, digit4 = 9.8;
        System.out.println(MathUtility.maximumNumber(digit3,digit4));
        System.out.println(MathUtility.minimumNumber(digit3,digit4));
        System.out.println(MathUtility.square(digit3));
        System.out.println(MathUtility.cubicSquare(digit4));

        System.out.println("======================================================");

        int number = 9;
        MathUtility.cubicSquare(9);
        System.out.println();













    }
}
