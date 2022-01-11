package day09_IfStatements;
/*
 Create a class called MinNumber, Write a program that can print the minimum number between two numbers, if both are equal then print Equal

            Ex:
                n1= 100, n2 = 200;

            output:
                100 is the minimum number
 */
/*
-Single if statement , for each possible out put we need to create a single if statement.
-Hence, we need to more how many possible options.
-The most important part in if statement, we need to create the right boolean expression.
-Syntax of if statement: if (Condition) { Statement } / notice there is NO ; in if statements.
 */

 /*
        Possible outcomes:
        Possibility #1: n1 is Min
        Possibility #2: n2 is Min
        Possibility #3: n1=n2

        Therefore, we will need 3 if statements. Since we are beginners now, we need to create 3 boolean
        expressions, however in the future we can just immediately give the expression within () in if statement.
        i.e. if (n1>n2) { System.out.println ...etc}
         */



public class MinNumber {
    public static void main(String[] args) {
        int n1 = 100, n2 = 200;
        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if(n1IsMin){ //if n1 is the minimum number
            System.out.println(n1 + " is the minimum number.");} // This expression is called a block.
        if (n2IsMin) {
            System.out.println(n2 + " is the minimum number.");} // if n2 is the minimum number
        if (equal) {
            System.out.println("Equal");  } // if n1 == n2
        // compiler will check the boolean expression in each block and will choose the true one.


        // As a tester, give different values to n1, and n2 and test the code.
        //examples , n1 = 200 and n2 =200 ,









    }
}
