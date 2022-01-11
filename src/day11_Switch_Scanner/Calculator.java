package day11_Switch_Scanner;
/*
Given two double variables n1, n2 and a char variable named operator.
Use switch statement to calculate the result of n1 & n2 based on the given operator.
Valid operators are: - , + , * , /.
 */
public class Calculator {
    public static void main(String[] args) {
        double n1 = 200.5, n2= 10.5;
        char operator = '+';
        // we have a pre-condition here since the operator must be valid.
        boolean valid = operator== '+'|| operator == '-' || operator == '*' ||operator == '/';

        if(valid){ // since the comparison here is of the == type, we can use switch statement.
            switch (operator){
                case'+':
                    System.out.println(n1 + n2);
                    break;
                case '-':
                    System.out.println(n1 - n2);
                    break;
                case'*':
                    System.out.println(n1 * n2);
                    break;
                default:
                    System.out.println(n1/n2);


            }

        }
        else {
            System.err.println("Invalid Operator" + operator); // we used serr rather than sout to print in red.
        }



    }
}
