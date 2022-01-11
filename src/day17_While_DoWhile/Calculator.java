package day17_While_DoWhile;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number:");
        int num1 = scan.nextInt();
        System.out.println("Enter your second number:");
        int num2 = scan.nextInt();

        System.out.println("Enter a math operator:"); // assume that valid operators are +,-
        char ch = scan.next().charAt(0); // this is how we get the operator.
        // if the user enters anything other than + or _ we need to repeat the statement until we get the right operator

        while (!(ch == '+') || (ch == '-')) { // if the operator is invalid
            System.out.println
                    ("Invalid Operator, Please re-enter"); // without the while loop it will only be executed for one time.
            ch = scan.next().charAt(0);
        }


        System.err.println((ch == '+') ? num1 + num2 : num1 - num2);

        scan.close();
    }
}
